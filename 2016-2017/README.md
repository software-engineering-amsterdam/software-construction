Software Construction 2016-2017
===============================

Introduction
------------

Link to this page on [Github](https://github.com/software-engineering-amsterdam/software-construction/tree/master/2016-2017).

This page covers all relevant information concerning the course
**Software Construction 2016-2017** in the Master Software
Engineering, University of Amsterdam.


Primary contact for this course is
[Tijs van der Storm](mailto:storm@cwi.nl).


*NB* We will use Twitter during this course, both for Q&A,
 announcements and during workshops. Please make an account if you
 haven't already, and start following
 [@SoftwCons](https://twitter.com/SoftwCons)!


### Schedule

Lectures and workshops will be from 9:15-11:00 (NB: 9:15!!!) on
Mondays. Lectures will primarily be given by Tijs van der Storm. The
lab sessions are on Monday from 11:00 to 17:00 and Tuesday the whole
day. 

For details about rooms, see <datanose.nl>.

 - Week 06: Introduction 
 - Week 07: Domain-specific Languages
 - Week 08: Programming styles
 - Week 09: Code Quality
 - Week 10: Capita 
 - Week 11: Design principles 
 - Week 12: Instead of a conclusion
 - Week 13: Exam: March, 27, 13:00-16:00, C0.02
 - Week 14: Resit: May, 15, 13:00-16:00, A1.14
 
Starting in Week 7 we'll feature an interactive "hour of code" each
Monday and Tuesday where you will present your code an explain
your design decisions

- Monday: 14:00-15:00
- Tuesday: 9:15-10:15

These sessions are meant to help each other and provide constructive feedback.
It's important to be present at these sessions!


##### Deadlines

See the lab assignment section below.
				   
### How to pass this course

Required skills:

 - Create good low level designs
 - Produce clean, readable code
 - Reflect upon and argue for/against software construction
   techniques, patterns, guidelines etc.
 - Assess the quality of code.
 - Select and apply state of the art software construction tools and frameworks.

Required knowledge:

 - Understand basic principles of language implementation (parsing,
   AST, evaluation, generation)
 - Understand basic aspects of code quality (readability,
   changeability, extensibility, etc.)
 - Understand encapsulation and modular design


How to pass this course:

- Be present at all lectures.
- Be present during the lab sessions
- Get a grade for your code > 5.5
- Pass the exam > 5.5.

Final grade = round((Code + Exam)/2.0)
Both Code and Exam should have grade > 5.5.

Required reading
----------------

The literature for this course consists of:

- "Exercises in Programming Style" (EiPS) (Parts I-IV, VI) by Crista Lopes 
- Papers in the [Syllabus](https://github.com/software-engineering-amsterdam/software-construction/blob/master/2016-2017/Syllabus.md)

The papers will help you improve your programming practice and make up
most of the material for the final exam. You are expected to be
familiar with their content and apply the techniques where
meaningful. If you don't understand the papers, we will not be able to
communicate effectively.
 


Final Exam
-------------------

The exam will consist of questions covering:

- The syllabus
- The lectures
- EiPS.

*NB* This will be an open book exam. 

Lab assignment: QL & QLS: two DSLs for Questionnaires
--------------------------------------------------

The lab assignment is based on the Language Workbench Challenge 2013
([LWC'13](http://www.languageworkbenches.net/past-editions/)).
The goal of this assignment is to build a DSL for questionnaires, called QL.
QL allows you to define simple forms with conditions and computed values. See
[this document](http://www.languageworkbenches.net/wp-content/uploads/2013/11/Ql.pdf)
for more information.
Additionally, you will implement a second DSL, called QLS:  a styling language, which can be used to rearrange questions, paginate them, introduce sectioning, font styles and widget types. 

*NB*: you will work in teams of 2. Think about how you can effectively collaborate on the assignment. Design is important to work together!

##### QL Requirements

- Questions are enabled and disabled when different values are
  entered.
  
- The type checker detects:
   * reference to undefined questions
   * duplicate question declarations with different types
   * conditions that are not of the type boolean
   * operands of invalid type to operators
   * cyclic dependencies between questions
   * duplicate labels (warning)

- The language supports booleans, integers and string values.

- Different data types in QL map to different (default) GUI widgets.   

Requirements on the implementation:

- The parser of the DSL is implemented using a grammar-based parser
  generator. 

- The internal structure of a DSL program is represented using
  abstract syntax trees.

- QL programs are executed as GUI programs, not command-line
  dialogues. 

- QL programs are executed by interpretation, not code generation.


Here's a simple questionnaire in QL from the domain of tax filing:

```
form taxOfficeExample { 
  "Did you sell a house in 2010?"
    hasSoldHouse: boolean
  "Did you buy a house in 2010?"
    hasBoughtHouse: boolean
  "Did you enter a loan?"
    hasMaintLoan: boolean
    
  if (hasSoldHouse) {
    "What was the selling price?"
      sellingPrice: money
    "Private debts for the sold house:"
      privateDebt: money
    "Value residue:"
      valueResidue: money = 
        (sellingPrice - privateDebt)
  }
  
}
```

#### QLS Requirements

- QLS allows you to place questions of a base QL program in pages and
  sections.  Furthermore, you can define default widget types and
  styles for questions of a particular type (e.g. boolean
  questions). Such default styles can be overridden on a per widget
  basis.

- The type checker detects:

   * no references to questions that are not in the QL program

   * all questions of the QL program are placed by the QLS program.

   * (default) widget assignments are compatible with question types
     (e.g. no radio button for integer widgets).

   * you cannot place a single question multiple times.

- The execution of a QL + QLS program should be the same as executing
  the QL program individually, _except_ for where questions appear
  (page/secion), what font-styles etc. are used, and what widget types
  are used.
  
- As widget types you're supposed to support at least: slider, spinbox (for numbers), text (for numbers and strings), yesno-radios, checkbox, yesno-dropdown (for booleans).
  
Requirements on the implementation:

- You could say QLS defines an "aspect" of questionnaires, i.e. its appearance. The challenge is to implement QLS without (invasively) changing the code pertaining to QL, and without duplicating or reimplementing the QL code. (Copying and/or duplicating is not allowed, but some changes might be needed at certain join points...). 

- The QL code, and especially, the QL ASTs should be oblivious to the QLS code. Think about how you can achieve that. 

  
Here's an example QLS description for the simple Tax Form:

```
stylesheet taxOfficeExample 
  page Housing {
    section "Buying"
      question hasBoughtHouse  
        widget checkbox 
    section "Loaning"  
      question hasMaintLoan
  }

  page Selling { 
    section "Selling" {
      question hasSoldHouse
        widget radio("Yes", "No") 
      section "You sold a house" {
        question sellingPrice
          widget spinbox
        question privateDebt
          widget spinbox 
        question valueResidue
        default money {
          width: 400
          font: "Arial" 
          fontsize: 14
          color: #999999
          widget spinbox
        }        
      }
    }
    default boolean widget radio("Yes", "No")
  }  

```


## Realizing the assignment.

You are encouraged to be creative in terms of libraries or frameworks
that you use, but be aware of impending bloat and or a huge number of
dependencies (all in good measure). 

As to programming language, you may choose any of the following
languages: Java, C#, Javascript, Haskell, Scala, Clojure, Erlang,
Smalltalk, Ruby, Python, Go, Dart, Swift, Objective-C, F#. Feel free to take
the opportunity to learn a new language, but be aware that your code
will be graded as if you're proficient in it and be aware of idiomatic
coding styles. For Java we provide grammar skeleton code for the
parser generators ANTLR, Jacc and Rats! These grammars are
*incomplete*. You may copy one of the skeleton projects and complete
it by adding the following features:

- Syntax for booleans, string literals. Don't forget to take care of
  keyword reservation: true and false should be parsed as boolean
  literals, not as identifiers. 

- Add single-line comments (a la Java: //).

- Add syntax productions for forms, questions, computed quetsions,
  types (int, bool, and string) and if-then and if-then-else
  statements. Use string literals for question labels. See the LWC'13
  link above for an example questionnaire. 

- Add tests to check your syntax extensions.

- Add AST classes for the provided expression categories, and for you
  syntactic extensions. Make sure the parser creates objects of the
  appropriate type. 
  
- Change the start symbol of the parser to parse forms, instead of
  Expressions.

Note: don't be seduced by the provided example code and start
copy-pasting grammar rules around. It is important to have a basic
understanding of the parser technology involved. ANTLR, Rats! and Jacc
are well-documented on the web. Please use this information to fulfill
the above requirements.


### Grading

There are two grading moments of the lab assignment (see above) which
correspond to parts of the assignment:

- Part 1 QL (Week 9): indicative grading as incentive for improvement.
  
- Part 2 QL + QLS (Week 12): we will review all the code and give a final grade.

Before we can review your code, you have to have filled out the pre-assessment form. Links to the forms will be posted in due course.



### What we look for when grading your code

The following aspects of quality code will be our focus when grading
your code:

- Functionality (e.g., are the requirements implemented)
- Tests (e.g., presence of meaningful unit tests)
- Simplicity (absence of code bloat and complexity; YAGNI)
- Modularity (e.g., encapsulation, class dependencies, package structure)
- Layout and style (indentation, comments, naming of variables etc.)
- Sensible (non-)use of design patterns (e.g., Visitor)

More concretely, we ask you to take the following list of advice into
consideration. 
 
 - Code quality is of the utmost importance in this course. You will
   write clean, consistently formatted, concise code. Your naming and
   indentation convention will be consistent.
   
 - You show that you master the concepts of encapsulation, modularity
   and separation of concerns. This should be visible from the
   code. The structure of the code should show the design.
   
 - Method and functions should realize a single piece of
   functionality. You adhere to the Don't Repeat Yourself (DRY)
   principle.
   
 - You will select tools and libraries wisely. You can argue why you
   chose to use a particular artifact.
      
 - You know your (standard) libraries and APIs. Do not reimplement
   (simple) functions that can be expected to be in a (standard)
   library. Especially, do not claim that your version is faster,
   because: it is irrelevant, and, you're probably wrong. Make the
   trade-off for reusing a library: do you really need a heavy
   dependency, for some simple functionality?

 - Test your code using unit tests if this is meaningful. Do not write
   tests, because your are somehow supposed to. Do not write your own
   testing framework; use appropriate libraries and/or language
   features of the platform (e.g., JUnit on Java). Separate test code
   from main code.
   
 - Use asserts in the correct way. Asserts are used to document and
   check assumptions. They are _not_ used for input validation or
   error handling.
   
 - Use exception handling wisely. Do not implement your Exception
   class in a situation where a standard library exception makes perfect
   sense. Handle exceptions sanely, if possible. Empty
   catch-blocks are unacceptable 99.9% of the time.

 - Non-constant static variables should be avoided at all cost.
 
 - If you are forced to need instanceof a lot, you probably have a
   flaw in your design.

 - You are expected not to indulge in elaborate gold plating. For
   instance, fancy graphics/user interfaces are not important. YAGNI:
   You Ain't Gonna Need It. Focus on the simplest thing that could
   possibly work, first.
   
 - Do not optimize your code unless you can argue there is a real
   problem (proven by profiling). Simplicity of the code has priority.
   
>  _We should forget about small efficiencies, say about 97% of the
>  time: premature optimization is the root of all
>  evil._ --Donald Knuth
   
 - You are not supposed to show off how smart you are. 
 
>  _Debugging is twice as hard as writing the code in the first
>  place. Therefore, if you write the code as cleverly as possible,
>  you are, by definition, not smart enough to debug it._ --Brian
>  Kernighan
 
 - You are expected to write comments, only if you need to explain a
   complicated algorithm or motivate a particular piece of code. Do
   not engage in obligatory comments. Javadoc (or similar) is ok, but
   think about the purpose of Javadoc first.
   
 - It is unacceptable that there are remnants of dead code, commented
   out sections, or debugging print statements etc. in the code that
   you will present for grading.

 - You will only present *working code* for grading. Note: working
   code implies your project compiles without errors. Additionally,
   you should use the IDE in the correct way, setup dependencies
   correctly, provide build-scripts if necessary. If you don't use an
   IDE, you will use command line build tools or scripts to not repeat
   yourself. 

Please take this advice to heart. It will influence your grade.
 
### Administrativia

Each participant will have to use Github; please make an account if
you haven't already. Then send [me](mailto:storm@cwi.nl) a note with
your Github user name and team-name so that I can add you as a team member. After
you have commit access, you can clone the following repository and
start coding **in your own, private** subdirectory.

> [https://github.com/software-engineering-amsterdam/myriad-ql](https://github.com/software-engineering-amsterdam/multi-ql).
    
To start with one of the skeleton projects copy the contents of one of
the prototype projects into your private directory. E.g., on Unix-like
machines:

> cd my-user-dir <br>
> cp -r ../prototypes/QLJava/* .
     
**IMPORTANT:** You are **required** to use Github. You should also
commit **regularly**: NO huge final commit before the deadline.

**IMPORTANT:** You are required to complete the lab assignment individually. You're more than welcome to discuss and review with
others, but you are not allowed to copy code. We will use clone
detection tools to detect plagiarism.

**IMPORTANT:** The skeleton projects are setup to be used with Eclipse. 

**IMPORTANT:** Remember this is a single, shared Github repository, I
  expect everyone to act responsibly and try not to break the
  repository for everyone else, nor mess with anyone else's files. 

