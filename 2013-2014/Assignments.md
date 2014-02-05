
# Reading assignments Software Construction 2013-2014

(Please send a PDF for each part at each deadline to [Tijs van der
Storm](mailto:storm@cwi.nl), preferably prepared using LaTeX. Include
the code where needed.)

# Part 1

### 1. Term frequency problem

Write the term frequency problem in a programming language other than
Python, without looking at the book. After you're done, check if your
style corresponds to any of the styles in the book. If so discuss why.
If not, discuss why it is different or which styles it combines. Would
you have programmed it differently now that you know about different
styles? If so, why? Include the source code in your report.

### 2. Code smells and refactoring

Select 5 code smells, and look for them in the book. For each of them
argue why they are "bad", and when/why they would be permissible
nonetheless. How would you eliminate them by refactoring?


### 3. Design patterns.

The distinction between design patterns and language features is
subtle. Find 3 styles which you would consider to be based on a design
pattern and 3 which leverage what you would consider language
features. Motivate each choice. Finally, identify a style that mimicks
a language features as a design pattern. Explain which language
feature is at play, of which style. 

### 4. Values and trade-offs

Beck discusses a number of values in programming. Discuss two other
values and explain how they may conflict with the values of Beck.
Explain circumstances which would motivate choosing one option over
the other (i.e. explain the trade-off). 

### 5. Implementation decisions

Identify three implementation decisions in the examples of the book.
Discuss what would happen if they had to be changed. How would you
make the code immune to such changes?

### 6. Developer testing

Write tests which check that:
- Stop-words are not counted in the distribution
- The program only prints out the top N words
- Multiple occurrences of same word in different capitalizations are
  counted individually.
- The words are printed by decreasing order

Pick a style that's easy to test and argue *why* this is the case.
Note: you may change the example code or your own code to make it easy
to test, but still provide argumentation.

### 7. Object Calisthenics

Write a version of the term frequency program following the rules of
Object Calisthenics.


### 8. Ifless

Write the term frequency program without using if-statements,
if-expressions, loops or assignments.

# Part 2

### 9. Open or closed

Consider styles 5 (candy factory) and 10 (things). Let's assume the
program has to be changed so that only frequencies of words occurring
an even number of times should be printed. Describe how you would
modify each program to accommodate this change in requirements. Are
the modules (functions resp. classes) closed for modification? Why or
why not?

### 10. Extensibility and frameworks

Consider the (slightly contrived) task of turning the term frequency
program into a framework to be released for reuse. Come up with 3
meaningful extension points. Argue which of the styles is best suited
to expose the extension points. 

### 11. Functional programming

John Hughes recommends functional programming for two main reasons.
Briefly explain each of these reasons in your own words. Elaborate
upon the benefits projected by John using one or more styles in the
book.

### 12. Design by contract

Write down post-conditions for the procedures in style 22. Same
question, but now for the methods in style 13 but include
preconditions. And again for style 10 (pre and post) but also write a
class invariant for `WordFrequencyManager`. Finally, assume
you add a subclass of `StopwordManager` to style 10 in which
`is_stop_word` always returns true. Does this break the super class
contract?

### 13. Domain-specific languages

Sketch the design of a DSL for the term frequence program. Provide a
sketch of a grammar, and discuss how DSL programs are executed using
interpretation. Which of the styles in the book could be reused in the
implementation of the DSL, how?

### 14. Changes

Pick two styles from the book and discuss for each of the following
changes how the code is affected.

- what is N
- sorting order
- stop_word file name (e.g. i18n)
- normalize for capitalization or not
- ordering of equally frequent words

Can you characterize/summarize the differences in impact in terms of the two
styles?

### Bonus: another style

Find another style of programming that's not in the book. Write the
term frequency program in that style.









