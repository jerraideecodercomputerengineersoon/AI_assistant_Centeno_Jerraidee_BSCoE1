/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ai_assistant_centeno_prob2;

/**
 *
 * @author LENOVO LOQ
 */

//1. Base case (when does the recursion stop?):
//The recursion ends once the index reaches the length of the array because there are no more grades left to check.

//2. Recursive case (smaller problem each call):
//The method checks one grade at a time and moves to the next grade by increasing the index by one.

//3. Result for an empty array {}, and why:
//The answer is 0 because the array has no grades to count.


public class AI_ASSISTANT_CENTENO_PROB2 {

    
public class Main {

    // PART A: Using a loop
    public static int countPassing(int[] grades, int passingMark) {
        int count = 0;

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= passingMark) {
                count++;
            }
        }

        return count;
    }

    // PART B: Using recursion
    public static int countPassingRecursive(int[] grades, int passingMark, int index) {

        // Base case
        if (index >= grades.length) {
            return 0;
        }

        // Recursive case
        if (grades[index] >= passingMark) {
            return 1 + countPassingRecursive(grades, passingMark, index + 1);
        } else {
            return countPassingRecursive(grades, passingMark, index + 1);
        }
    }

    public static void main(String[] args) {

        int[] grades1 = {60, 75, 88, 74, 91};
        int[] grades2 = {};
        int[] grades3 = {70, 69, 80};
        int[] grades4 = {90, 55, 75, 100};

        System.out.println("Test 1:");
        System.out.println("Loop: " + countPassing(grades1, 75));
        System.out.println("Recursive: " + countPassingRecursive(grades1, 75, 0));

        System.out.println("Test 2:");
        System.out.println("Loop: " + countPassing(grades2, 75));
        System.out.println("Recursive: " + countPassingRecursive(grades2, 75, 0));

        System.out.println("Test 3:");
        System.out.println("Loop: " + countPassing(grades3, 70));
        System.out.println("Recursive: " + countPassingRecursive(grades3, 70, 0));

        System.out.println("Test 4:");
        System.out.println("Loop: " + countPassing(grades4, 75));
        System.out.println("Recursive: " + countPassingRecursive(grades4, 75, 0));
    }
}
}



//Test inpuT                     Loop	Recursive	Match?
//{60,75,88,74,91}, mark 75	3	  3	        Yes
//{}, mark 75	                0	  0	        Yes
//{70,69,80}, mark 70	        2	  2	        Yes
//{90,55,75,100}, mark 75	        3	  3	         Yes



//1. What does each recursive call do to index, and why must it change?
//Every recursive call adds one to the index so the method can check the next grade until all grades are counted.

//2. What happens if you delete the base case entirely?
//The method will keep calling itself without stopping, which can eventually cause a StackOverflowError.