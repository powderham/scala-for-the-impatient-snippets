vals are constants whilst vars are mutable

scala> val test = "test string"
test: String = test string

scala> test = "new test string"
<console>:12: error: reassignment to val
       test = "new test string"
            ^

scala> var test1 = "test string"
test1: String = test string

scala> var test1 = "new test string"
test1: String = new test string



"Scala has the same while and do loops as Java and C++. For example,
while"
 (n > 0) {

 r = r * n
 n -= 1
}
Scala has no direct analog of the for (initialize; test; update) loop. If you need
such a loop, you have two choices. You can use a while loop. Or, you can use a
for statement like this:
for (i <- 1 to n)
 r = r * i
You saw the to method of the RichInt class in Chapter 1. The call 1 to n returns a
Range of the numbers from 1 to n (inclusive).
The construct
for (i <- expr)
makes the variable i traverse all values of the expression to the right of the <-.
Exactly how that traversal works depends on the type of the expression. For a
Scala collection, such as a Range, the loop makes i assume each value in turn
