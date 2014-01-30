Software Construction 2013-2014
===============================

Introduction
------------

Link to this page on [Github](https://github.com/software-engineering-amsterdam/software-construction/tree/master/2013-2014).

This page covers all relevant information concerning the course
**Software Construction 2013-2014** in the Master Software
Engineering, University of Amsterdam.


Primary contact for this course is
[Tijs van der Storm](mailto:storm@cwi.nl).


*NB* We will actively use Twitter during this course, both for Q&A,
 announcements and during workshops. Please make an account if you
 haven't already, and start following
 [@SoftwCons](https://twitter.com/SoftwCons)!


### Schedule

Lectures and workshops will be from 9:00-11:00 on Wednesday. Lectures
will be given by Tijs van der Storm and. Practical course will be on
Wednesday from 11:00 to 17:00 and Thursdays the whole day. For details
about rooms see [datanose.nl](https://datanose.nl/#course[15520]). An
iCal ICS link can be found here:
[https://datanose.nl/course_15520.ics](https://datanose.nl/course_15520.ics).


### Schedule
 
 - Week 06: Introduction
 - Week 07: Grammars and Parsing
 - Week 08: Domain-Specific Languages
 - Week 09: Language Engineering
 - Week 10: Lecture Interpreters
 - Week 11: Code Quality
 - Week 12: Code Smells 

				   
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
- Get a grade for your code > 5.5
- Complete the reading assignments (pass/fail)
   

Required reading
----------------

The literature for this course consists of:

- "Exercises in Programming Style" (Parts I-IV, VI) by Crista Lopes 
- Papers in the [Syllabus](https://github.com/software-engineering-amsterdam/software-construction/blob/master/2013-2014/Syllabus.md)

The papers will help you improve your programming practice. You are
expected to be familiar with their content and apply the techniques
where meaningful. If you don't understand the papers, we will not be
able to communicate effectively.
 


Reading assignments
-------------------

The [ReadingAssignments](https://github.com/software-engineering-amsterdam/software-construction/blob/master/2013-2014/Assignments.md) use the examples in the Styles book to test
your understanding of the papers in the [Syllabus](https://github.com/software-engineering-amsterdam/software-construction/blob/master/2013-2014/Syllabus.md).

The book on programming style is accompanied by a source code
repository on Github. If you have coded the example program in a
different language than Python in a particular style, you are invited
to add the code to our fork of this repository:

-
  [https://github.com/software-engineering-amsterdam/exercises-in-programming-style](https://github.com/software-engineering-amsterdam/exercises-in-programming-style)
 

*NB*: the lectures are part of the material for the assignments.

Lab assignment: QL, a DSL for Questionnaires
--------------------------------------------

The lab assignment is based on the Language Workbench Challenge 2013
([LWC'13](http://www.languageworkbenches.net/past-editions/)).
The goal of that assignment is to build a DSL for questionnaires
(called QL): simple forms with conditions and computed values. See
[this document](http://www.languageworkbenches.net/wp-content/uploads/2013/11/Ql.pdf)
for more information.

Check list of required features that *you* will show that work
during grading:

- Questions are enabled and disabled when different values are
  entered.
  
- The type checker detects:
   * reference to undefined questions
   * duplicate question declarations with different types
   * conditions that are not of the type boolean
   * operands of invalid type to operators
   * references to questions with an undefined value
   * cyclic dependencies between questions
   * duplicate labels (warning)

- The language supports booleans, integers and string values.

- Different data types in QL map to different GUI widgets.   

Requirements on the implementation:

- The parser of the DSL is implemented using a grammar-based parser
  generator. 

- The internal structure of a DSL program is represented using
  abstract syntax trees.

- QL programs are executed as GUI programs, not command-line
  dialogues. 

- QL programs are executed by interpretation, not code generation.

You are encouraged to be creative in terms of libraries or frameworks
that you use, but be aware of impending bloat and or a huge number of
dependency (all in good measure). 

As to programming language, you may choose any of the following
languages: Java, C#, Javascript, Haskell, Scala, Clojure, Erlang,
Smalltalk, Ruby, Python, Go, Dart. Feel free to take the opportunity
to learn a new language, but be aware that your code will be graded as
if you're proficient in it and aware of idiomatic coding styles. For
Java we provide grammar skeleton code for the parser generators ANTLR,
Jacc and Rats! These grammars are *incomplete*. You may copy one of
the skeleton projects and complete it by adding the following
features:

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


### Honor's track

#### Object Algebras


Use object algebras to make an extensible implementation. Show that it
works by developing a number of language extensions (e.g., unless,
repeat, date time values etc.), and operations: pretty print, compile,
visualize. This assignment can be done individually or in pairs. 

- [Bruno C.d.S. Oliveira and William R. Cook. _Extensibility for the Masses: Practical Extensibility with Object Algebras_](http://www.cs.utexas.edu/~wcook/Drafts/2012/ecoop2012.pdf)
  
- [Bruno C.d.S. Oliveira, Tijs van der Storm,  Alex Loh and William R. Cook. 
  _Feature-Oriented Programming with Object Algebras_](http://www.cwi.nl/~storm/publications/FOPOA.pdf)



#### Graphical DSL framework on top of Rascal

The syntax of a DSL does not have to be textual. Sometimes a DSL is
better represented with a graphical notation (e.g., state machines,
network topologies, class diagrams, Petri nets etc.). The QL language
could also be represented graphically. For instance, conditions and
questions can be represented as nodes, with the edges between the
nodes representing control flow. 

In the honor's track you will (as a group) work on providing a
graphical layer on top of Rascal using the Eclipse
[Graphical Editing Framework](http://www.eclipse.org/gef/). The QL
language will serve as an example to test the framework. This entails
that the backend (code generation, type checking etc.) will be
implemented in Rascal. The end goal is to support graphical editors,
just like the Rascal IDE currently supports textual editors for DSLs.
If the result of this project is of high enough quality we will
integrate the code into the main line of the Rascal IDE. 

A particular challenge here is how to interface GEF with Rascal. The
suggested way to do this is to design a data type that represents
graphical models to be displayed and edited using GEF. When the this
model changes a value of this data type is handed back to Rascal where
domain-specific analyses (type checking etc.) and transformations
(e.g. code generation) can be performed. In some cases, notably
analyses, some results need to be communicated back to the editor to
support services like error marking or refactorings. 

Another challenge is how to separate presentation aspects (e.g. box
shapes, fonts, line styles etc.) from the semantic and structural
aspect of a DSL. 


### Time table for the the lab assignment

There are two grading moments of the lab assignment (see above) which
correspond to parts of the assignment:

- Part 1 (Front end): the frontend covers all aspects visible to the
  users of the DSL: parsing, checking, and in case of the Rascal
  variants, IDE support.
  
- Part 2 (Back end): the back end includes are aspects related to
  running QL programs. In the Java variant this is the interpreter, in
  the Rascal variants this is the compiler/codegenerator. 


### What we look for when grading your code

The following aspects of quality code will be our focus when grading
your code:

- Functionality (e.g., are the requirements implemented)
- Tests (e.g., presence of meaningful unit tests)
- Simplicity (absence of code bloat and complexity; YAGNI)
- Modularity (e.g., encapsulation, class dependencies, package structure)
- Layout and style (indentation, comments, naming of variables etc.)
- SOLID principles
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
your Github user name so that I can add you as a team member. After
you have commit access, you can clone the following repository and
start coding **in your own** subdirectory.

> [https://github.com/software-engineering-amsterdam/poly-ql](https://github.com/software-engineering-amsterdam/poly-ql).
    
To start with one of the skeleton projects copy the contents of one of
the prototype projects into your private directory. E.g., on Unix-like
machines:

> cd my-user-dir
> cp -r prototypes/QLJava/* .
     
**IMPORTANT:** You are **required** to use Github. You should also
commit **regularly**: NO huge final commit before the deadline.

**IMPORTANT:** You are required to complete the lab assignment
_individually_. We will use clone detection tools to detect
plagiarism.

**IMPORTANT:** You are required to use Eclipse for the skeleton
projects.

**IMPORTANT:** Remember this is a single, shared Github repository, I
  expect everyone to act responsibly and try not to break the
  repository for everyone else, nor mess with anyone else's files. 

### Deadlines

- Part 1 (front-end)
- Part 2 (back-end)
- Part 2 1-day part-time students: 4th of March, 2013
- Part 2 "herkansing" (max grade = 8): 4th of March, 2013


   
[RittelWebber84]: http://www.uctc.net/mwebber/Rittel+Webber+Dilemmas+General_Theory_of_Planning.pdf
[BaldwinClark06]: http://homepages.cwi.nl/~storm/teaching/reader/BaldwinClark06.pdf
[Simon62]: http://ecoplexity.org/files/uploads/Simon.pdf
[Spolsky02]: http://www.joelonsoftware.com/articles/LeakyAbstractions.html
[Martin96]: http://jonah.cs.elon.edu/sduvall2/courses/csc420/2012fall/readings/OpenClosed.pdf

[Ungar91]: http://cs.au.dk/~hosc/local/LaSC-4-3-pp223-242.pdf
[Gabriel08]: http://www.dreamsongs.com/Files/DesignedAsDesigner.pdf
[Noble97]: http://www.laputan.org/pub/patterns/noble/noble.pdf
[Parnas72]: http://dx.doi.org/10.1145/361598.361623
[Hughes89]: http://www.cse.chalmers.se/~rjmh/Papers/whyfp.pdf
[Dijkstra65]: http://dx.doi.org/10.1145%2F363095.363143
[Dijkstra65ewd]: http://www.cs.utexas.edu/users/EWD/ewd01xx/EWD196.PDF
[JohnsonFoote88]: http://www.laputan.org/drc.html
[WirfsBrock]: http://www.wirfs-brock.com/PDFs/How%20Designs%20Differ.pdf
[FooteYoder99]: http://www.laputan.org/pub/foote/mud.pdf
[Steimann06]: http://doi.acm.org/10.1145/1167473.1167514
[NobleBiddle02]: http://www.mcs.vuw.ac.nz/comp/Publications/archive/CS-TR-02/CS-TR-02-9.pdf
[Cook09]:    http://homepages.cwi.nl/~storm/teaching/reader/Cook09.pdf
[Norvig96]:  http://norvig.com/design-patterns/
[Biggerstaff94]: http://homepages.cwi.nl/~storm/teaching/reader/Biggerstaff94.pdf
[PeytonJones07]: http://homepages.cwi.nl/~storm/teaching/reader/PeytonJones07.pdf
[CantrillBonwick08]: http://homepages.cwi.nl/~storm/teaching/reader/CantrillBonwick08.pdf
[Fowler05]: http://homepages.cwi.nl/~storm/teaching/reader/Fowler05.pdf
[HannemannKiczales02]: http://homepages.cwi.nl/~storm/teaching/reader/HannemannKiczales02.pdf
[MernikEtAl05]: http://homepages.cwi.nl/~storm/teaching/reader/MernikEtAl05.pdf
[BentleyEtAl86]: http://homepages.cwi.nl/~storm/teaching/reader/BentleyEtAl86.pdf
[Fowler07]: http://homepages.cwi.nl/~storm/teaching/reader/Fowler07.pdf
[Knuth84]: http://homepages.cwi.nl/~storm/teaching/reader/Knuth84.pdf
[LieberherrHolland89]: http://homepages.cwi.nl/~storm/teaching/reader/LieberherrHolland89.pdf
[Dijkstra68]: http://homepages.cwi.nl/~storm/teaching/reader/Dijkstra68.pdf
[Lieberman86]: http://homepages.cwi.nl/~storm/teaching/reader/Lieberman86.pdf
[Knuth74]: http://homepages.cwi.nl/~storm/teaching/reader/Knuth74.pdf
[KiczalesEtAl97]: http://homepages.cwi.nl/~storm/teaching/reader/KiczalesEtAl97.pdf
[Meyer92]: http://homepages.cwi.nl/~storm/teaching/reader/Meyer92.pdf
[NobleFoote02]: http://homepages.cwi.nl/~storm/teaching/reader/NobleFoote02.pdf
[JezequelMeyer97]: http://homepages.cwi.nl/~storm/teaching/reader/JezequelMeyer97.pdf
[FilmanFriedman00]: http://homepages.cwi.nl/~storm/teaching/reader/FilmanFriedman00.pdf
[CascavalEtAl08]: http://homepages.cwi.nl/~storm/teaching/reader/CascavalEtAl08.pdf
[Neighbors89]: http://homepages.cwi.nl/~storm/teaching/reader/Neighbors89.pdf
[Liskov87]: http://dx.doi.org/10.1145/62139.62141


