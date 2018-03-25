Software Construction 2017–2018
===============================

This page covers all relevant information concerning the course
**Software Construction 2017-2018** in the Master Software
Engineering, University of Amsterdam.

Primary contact for this course is
[Vadim Zaytsev](mailto:vadim@grammarware.net).

### Schedule

Lectures and workshops were from 9:00-11:00 on Wednesdays. Lectures were given by Vadim Zaytsev. The lab sessions were on Wednesdays from 11:00 to 17:00 and Thursdays from 9:00 to 17:00.

For details about rooms, see [datanose.nl](https://datanose.nl/#course[61106]).

 - Week 06: [Introduction](slides1.pdf), 7 Feb, 9:00–11:00, D1.111
 - Week 07: [Grammars and Parsing](slides2.pdf), 14 Feb, 9:00–11:00, D1.111
 - Week 08: [Language Engineering](slides3.pdf), 21 Feb, 9:00–11:00, D1.111
 - Week 09: [Coding Styles and Conventions](slides4.pdf), 28 Feb, 9:00–11:00, D1.111
 - Week 10: [Debugging and Testing](slides5.pdf), 7 Mar, 9:00–11:00, D1.111
 - Week 11: [Code Quality](slides6.pdf), 14 Mar, 9:00–11:00, D1.111
 - Week 12: [Software Design](slides7.pdf), 21 Mar, 9:00–10:30, D1.111
 - Week 13: Exam: 28 March, 9:00–12:00, OMHP
 - Week 14: Reexamination: 16 May, 9:00-12:00, D1.113
 
Starting in Week 7 we will feature an interactive "hour of code" each
Wednesday at 13:00 where you will present your code an explain
your design decisions.
These sessions are meant to help each other and provide constructive feedback.
It is important to be present at these sessions!

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
- Do not let the dev grade sink below 5.5
- Get a ship grade for your code > 5.5
- Get a doc grade at the exam > 5.5.

FinalGrade = round((DevGrade + ShipGrade + DocGrade)/3.0)
Intermediate grades should be > 5.5.

DevGrade
--------

Will be given on last Tuesdays' results. Can lower the grade by 0.2 for crimes against each of the following:

- the usage of git
- not answering any questions at the start of the lecture
- layout, naming, comments, ...
- executability, compilability, buildability, ...
- testability, test discipline, test frameworks, ...
- encapsulation, abstraction, OO, ...
- DRY, YAGNI, reuse, ...
- QLS interactions with QL, modularity

Some items do not apply until a certain week (see introductory slides).

Required reading
----------------

The literature for this course consists of:

- "Code Complete" by Steve McConnell
- "[Exercises in Programming Style](https://github.com/crista/exercises-in-programming-style)" by Crista Lopes 
- Papers in the [Syllabus](https://github.com/software-engineering-amsterdam/software-construction/blob/master/2017-2018/Syllabus.md)

The papers will help you improve your programming practice and make up
most of the material for the final exam. You are expected to be
familiar with their content and apply the techniques where
meaningful. If you do not understand the papers, we will not be able to
communicate effectively.


Final Exam
-------------------

The exam will consist of questions covering:

- The syllabus
- The lectures
- The books

*NB* This will be an open-book, no-internet exam. 

Lab assignment: QL & QLS: two DSLs for Questionnaires
--------------------------------------------------

The lab assignment is based on the Language Workbench Challenge 2013.
The goal of this assignment is to build a DSL for questionnaires, called QL.
QL allows you to define simple forms with conditions and computed values.
See [this document](QL.pdf) for more information (in case of conflicts, this page takes precedence).
Additionally, you will implement a second DSL, called QLS: a styling language, which can be used to rearrange questions, paginate them, introduce sectioning, font styles and widget types. 

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

- The language supports booleans, integers and string values (possibly also dates and decimals).

- Different data types in QL map to different (default) GUI widgets.   

Requirements on the implementation:

- The parser of the DSL is implemented using a grammar-based parser
  generator. 

- The internal structure of a DSL program is represented using
  abstract syntax trees.

- QL programs are executed as GUI programs, not command-line
  dialogues. 

- QL programs are executed by interpretation, not code generation.


Here is a simple questionnaire in QL from the domain of tax filing:

```
form taxOfficeExample
{ 
  "Did you sell a house in 2010?"
    hasSoldHouse: boolean
  "Did you buy a house in 2010?"
    hasBoughtHouse: boolean
  "Did you enter a loan?"
    hasMaintLoan: boolean
    
  if (hasSoldHouse)
  {
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
  (page/section), what font-styles etc. are used, and what widget types
  are used.
  
- As widget types you are supposed to support at least: slider, spinbox (for numbers), text (for numbers and strings), yesno-radios, checkbox, yesno-dropdown (for booleans).
  
Requirements on the implementation:

- You could say QLS defines an "aspect" of questionnaires, i.e. its appearance. The challenge is to implement QLS without (invasively) changing the code pertaining to QL, and without duplicating or reimplementing the QL code. (Copying and/or duplicating is not allowed, but some changes might be needed at certain join points...). 

- The QL code, and especially, the QL ASTs should be oblivious to the QLS code. Think about how you can achieve that. 

  
Here is an example QLS description for the simple Tax Form:

```
stylesheet taxOfficeExample
{
  page Housing
  {
    section "Buying"
    {
      question hasBoughtHouse  
        widget checkbox 
    }
    section "Loaning"  
      question hasMaintLoan
  }

  page Selling
  { 
    section "Selling"
    {
      question hasSoldHouse
        widget radio("Yes", "No") 
      section "You sold a house"
      {
        question sellingPrice
          widget spinbox
        question privateDebt
          widget spinbox 
        question valueResidue
        default money
        {
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
}

```

## Realising the assignment

You are encouraged to be creative in terms of libraries or frameworks
that you use, but be aware of impending bloat and or a huge number of
dependencies (all in good measure). 

As to programming language, you may choose any of the following languages:
Java, C#, JavaScript, Haskell, Scala, Clojure, Erlang, Smalltalk, Ruby,
Python, Go, Dart, Swift, Objective-C, F#, or propose your own. Feel free to
take the opportunity to learn a new language, but be aware that your code will
be graded as if you are proficient in it and be aware of idiomatic coding
styles. For Java we provide grammar skeleton code for the parser generators
ANTLR, Jacc and Rats! in the `prototypes` directory of `endless-ql`. These
grammars are *incomplete*. You may copy one of the skeleton projects and
complete it by adding the following features:

- Syntax for booleans, string literals. Do not forget to take care of
  keyword reservation: true and false should be parsed as boolean
  literals, not as identifiers. 

- Add single-line comments (a la Java: //).

- Add syntax productions for forms, questions, computed questions,
  types (int, bool, and string) and **if-then** and **if-then-else**
  statements. Use string literals for question labels. See the LWC'13
  link above for an example questionnaire. 

- Add tests to check your syntax extensions.

- Add AST classes for the provided expression categories, and for you
  syntactic extensions. Make sure the parser creates objects of the
  appropriate type. 
  
- Change the start symbol of the parser to parse forms, instead of
  Expressions.

Note: do not be seduced by the provided example code and start
copy-pasting grammar rules around. It is important to have a basic
understanding of the parser technology involved. ANTLR, Rats! and Jacc
are well-documented on the web. Please use this information to fulfill
the above requirements.

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
   because: it is irrelevant, and, you are probably wrong. Make the
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
   correctly, provide build-scripts if necessary. If you do not use an
   IDE, you will use command line build tools or scripts to not repeat
   yourself. 

Please take this advice to heart. It will influence your grade.
 
### Administrativia

Each participant will have to use Github; please make an account if you
have not already. Then send [me](mailto:vadim@grammarware.net) a note with your
Github user name and team-name so that I can add you as a team member. After
you have commit access, you can clone the following repository and start
coding **in your own, private** subdirectory.

> [https://github.com/software-engineering-amsterdam/endless-ql](https://github.com/software-engineering-amsterdam/endless-ql).
    
To start with one of the skeleton projects copy the contents of one of
the prototype projects into your private directory.
     
**IMPORTANT:** You are **required** to use Github. You should also commit
**regularly**: NO huge final commit before the deadline. Set `autocrlf` to
`true` first thing when you are setting it all up. Do not **ever** force push.

**IMPORTANT:** You are required to complete the lab assignment with your group
alone. You are more than welcome to discuss and review with others, but you are
not allowed to copy code. We will use clone detection tools to detect
plagiarism.

**IMPORTANT:** The skeleton projects are setup to be used with Eclipse. 

**IMPORTANT:** Remember this is a single, shared Github repository, I
  expect everyone to act responsibly and try not to break the
  repository for everyone else, nor mess with anyone else's files. 
