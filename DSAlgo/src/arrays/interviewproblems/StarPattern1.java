package arrays.interviewproblems;

import java.util.Scanner;

/**
 * Write a program to input an integer N from user and print hollow diamond star pattern series of N lines.
 * See example for clarifications over the pattern.
 *
 * N = 4
 * ********
 * ***  ***
 * **    **
 * *      *
 * *      *
 * **    **
 * ***  ***
 * ********
 */
public class StarPattern1 {

    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=N;i>0;i--){
            int j = 0;

            while(j<i){
                System.out.print("*");
                j++;
            }
            while(j<N){
                System.out.print(" ");
                System.out.print(" ");
                j++;
            }
            j=0;
            while(j<i){
                System.out.print("*");
                j++;
            }
            System.out.println();
        }

        for(int i=1;i<=N;i++){
            int j = 0;

            while(j<i){
                System.out.print("*");
                j++;
            }
            while(j<N){
                System.out.print(" ");
                System.out.print(" ");
                j++;
            }
            j=0;
            while(j<i){
                System.out.print("*");
                j++;
            }
            System.out.println();
        }
    }

}
