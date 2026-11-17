/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ai_assistant_centeno_prob4;

/**
 *
 * @author LENOVO LOQ
 */

//1. Hand-trace factorial(4) with the AI's code. What does it return, and why?
//The answer becomes 0 because the method returns zero when it reaches the base case, making the whole multiplication equal to zero.

//2. Which single line is wrong, and what should it return instead?
//The mistake is return 0; in the base case. It should be return 1; because the factorial of zero is one.


public class AI_ASSISTANT_CENTENO_PROB3 {

  


    public static int factorial(int n) {

        // Base case
        if (n == 0) {
            return 1;
        }

        // Recursive case
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        System.out.println("factorial(0): " + factorial(0));
        System.out.println("factorial(1): " + factorial(1));
        System.out.println("factorial(4): " + factorial(4));
        System.out.println("factorial(5): " + factorial(5));
    }
}



//Test	       Expected	Your result	Pass?
//factorial(0)	1	   1	        Yes
//factorial(1)	1	   1	        Yes
//factorial(4)	24	   24	        Yes
//factorial(5)	120	   120	        Yes





//1. Why did one wrong return make every result wrong?
//Since the base case gives zero, every multiplication that depends on it also becomes zero, making the factorial answers incorrect.

//2. Stretch: What happens for factorial(-2) with your corrected code, and why?
//The method will continue calling itself with smaller negative numbers because it never reaches zero. This eventually causes a StackOverflowError.
