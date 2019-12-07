# GraalVM-Performance
GraalVM is great for improving performance in Java. For example, when the countAllVowels.java program above is run, GraalVM takes much less time to complete 10 000 000 iterations than the JVM!


To test this performance improvement, follow the steps below:

Download 'countAllVowels.java'.

Rename the file to 'countAllVowels.java'.

Navigate to the directory in which you downloaded the file to through Terminal.

Enter the following command: 'javac countAllVowels.java'.

Then, enter: 'java countAllVowels There are 11 vowels in this sentence.'.

*Assuming you have GraalVM installed, the iteration time splits should decrease relative to each other.

Next, enter 'java -XX:-UseJVMCICompiler countAllVowels There are 11 vowels in this sentence.'.

*This command will run the same program with the same parameters, only it uses the JVM compiler.

*As you can see from the results, not only is the initial iteration time split larger than with GraalVM, the time splits do not decrease as drastically relative to each other.
