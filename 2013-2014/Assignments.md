
# Reading assignments Software Construction 2013-2014

### 0: Term frequency problem

Write the term frequency problem in a programming language other than
Python, without looking at the book. After you're done, check if your
style corresponds to any of the styles in the book. If so discuss why.
If not, discuss why it is different. Include the source code in your
report.

### Code smells

Select 5 code smells, and look for them in the book. For each of them
argue why they are "bad", and when/why they would be permissible
nonetheless.


### Design patterns.

Identify at least 5 design patterns in the code examples of the book.
Briefly explain their goal


### Refactoring

Pick a program in one of the styles and apply at least three
refactorings. Use google for refactoring inspiration.


### Contracts

Write preconditions and postconditions for example "...".


Beck discusses a number of values in programming. Discuss two other
values and explain how they may conflict with the values of Beck. Need
for trade-offs.


### Global variables

Refactor Cookbook to not use global variables. Use Python or your own
language. 


Changes
- what is N
- sorting order
- stop_word file name (e.g. i18n)
- normalize for capitalization or not
- ordering of equally frequent words


Chapter 5: candy factory
Chapter 10: things
- change to: words occurring an even number of times.
Are the modules (functions resp. classes) closed for modification? Why
or why not?



Identify three implementation decisions in the examples of the book.
Discuss what would happen if they had to be changed. How would you
make the code immune to such changes?

### Ifless

Write the term frequency program without using
if-statement/-expressions or loops.

### Bonus: another style

Find another style of programming that's not in the book. Write the
term frequency program in that style.





Identify two Ex A and B where B can be the refactored version of A.


Explain the problem of global variables using Ex X as example.


Implement the following problem in styles X and Y. Which
implementation do you like best, why?

Discuss the ramifications of change Y in Ex A and B. What do you
observe? Which one is easier to maintain?


Which styles would not have worked so well, had the author chosen
Haskell instead of Python? Which would have worked better?

Which example illustrates information hiding in the best way? Why?

Style A is not open for extension when adding a new X. Which other exercise can be extended in such a way?

Which style [of A, B, C...] is most reusable? Argue why and when it is important. 

Which styles are focused on [maintainability/readability/understandability] of code, and not, e.g., performance, concurrency, reuse,...

Do assignment x.y.

Find style examples in the book illustrating each of the 5 SOLID principles.

Some styles are more functional programming oriented than others; find the 5 most "functional" ones, and for each why. 

The example programming language is Python, which is dynamically typed. Find n styles that would benefit from static typing (as in Java, Scala, or Haskell), and m styles which would suffer.

In your own code, from the current assignment, or another project, and
discuss how and why you would classify it as which style. It's ok if
multiple styles apply, but do show code examples to illustrate.

Find a reference in the book that is *relevant for this course*. Argue
why and summarize the paper in half a page.

Sketch the design of a DSL for the term frequence program. Provide a
sketch of a grammar, and discuss how DSL programs are executed.

Lopes stays clear of making judgments, because such judgments heavily depend on context factors. Judge 5 styles negatively (along any dimension), but find at least 2 context factors that would make the style permissible. 

All software engineering is about trade-offs between maintainability,
readability, performance, reusability, extensibility etc. Pick n
styles, and briefly motivate which trade-offs along which dimension
are made.



