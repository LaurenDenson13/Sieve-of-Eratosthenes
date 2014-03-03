Lauren Denson
The Sieve of Eratosthenes Implementation


This is a java implementation of the ancient algorithm to find prime numbers,the Sieve of Eratosthenes.

A basic description of the Algorithm from, http://en.wikipedia.org/wiki/Sieve_of_Eratosthenes. 

A prime number is a natural number which has exactly two distinct natural number 
divisors: 1 and itself.

To find all the prime numbers less than or equal to a given integer n 
by Eratosthenes' method:

Create a list of consecutive integers from 2 through n: (2, 3, 4, ..., n).

Initially, let p equal 2, the first prime number.

Starting from p, enumerate its multiples by counting to n in increments of p, 
and mark them in the list (these will be 2p, 3p, 4p, etc.;the p itself should not be marked).

Find the first number greater than p in the list that is not marked. If there was no such number, stop. 

Otherwise, let p now equal this new number (which is the next prime), and repeat from step 3.



This is a basic program, that uses exception handling to first detect any invalid submissions of the "sieve."

Then, once a valid sieve is received, we create a boolean array of the size of the sieve. Then we run through and 

set the values of numbers to true (they are prime). Then we run the algorithm, check if this number is a multiple, if so; then

set to false.

In the end I return and print the found prime values!





To Run:

In an IDE environment, simply build and run!

In a terminal, Unix environment, first compile:

javac SieveOfEratosthenes.java

Then run:

java SieveOfEratosthenes