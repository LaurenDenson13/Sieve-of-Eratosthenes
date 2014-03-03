/*
 * The objective is to implement the ancient algorithm to calculate Prime Numbers
 * with a given 'n'
 * 
 * source: http://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
 */
//package sieveoferatosthenes;
import java.util.*;

/*
 * @author Lauren Denson 
 */
public class SieveOfEratosthenes {

    /**
     * This is the main class
     */
    public static void main(String[] args) {
        
        //read in the input from the user
        Scanner sieve_input = new Scanner(System.in);
        
        //value to continue input
        boolean next_input = true;
  
        //we start this do while loop to continue user input until we get what we want
        do{
            try{
               System.out.printf("Please enter the Sieve 'n': ");
               int n_input = sieve_input.nextInt();
               if (n_input < 2){
                   throw new IllegalArgumentException("Value must not be less than 2");
               }
               //we can continue to the algorithm
               next_input = false;
                             
               //here is our array of prime values we care to keep!
               boolean [] my_primes = new boolean[n_input + 1];
               
               //we initialize the values to true
               for(int i = 0; i < my_primes.length; i++){
                   my_primes[i] = true;
               }
               /*
                * For the next part of the Algorithm:
                * Loop from 2 on, and discard primes 2i, 3i, 5i (multiples of i)...
                  for i = 2, 3, 4, ..., not exceeding √n:
                    if A[i] is true:
                      for j = i2, i2+i, i2+2i, ..., not exceeding n :
                          A[j*i] := false i.e. not prime
                */ 
               
               for(int a = 2; a <= n_input/a; a++){
                   if(my_primes[a]){
                       /*we care about values that are not mulitples where
                       * prime <= a <= N/prime
                       */
                       for(int b = a; b <= n_input/a; b++){
                           //We found this number is not a prime by definition
                           my_primes[b*a] = false;
                       }
                   }
               }
               System.out.print("The primes found using Sieve of Eratosthenes:\n");
               //Now we output our primes
               for(int p = 2; p < my_primes.length; p++){
                   if(my_primes[p]){
                        System.out.print(p + "\n");
                   }
               }
               
                   
            }
            //catch a non integer value 
            catch(InputMismatchException ex){
                System.out.println("Try again, that was not an integer value");
                sieve_input.nextLine();
            }
            //catch an invalid Argument, i.e. negative number
            catch(IllegalArgumentException ex2){
                System.out.println("Try again, that number was less than 2");
                sieve_input.nextLine();
            }
        }
        //while loop to go until we receive a valid input
        while(next_input);
    }
}
