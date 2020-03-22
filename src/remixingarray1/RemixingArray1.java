/*
 * Emma Elliott
March 22, 2020
Array Remix 1
 */
package remixingarray1;

import java.util.Scanner;
/**
 *
 * @author gregelliott
 */
public class RemixingArray1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyedInput=new Scanner(System.in);
        
        //Let the array hold 20 values instead of 10
        int[]numbers= new int[20];
        int total=0;
        
        //Change the upper bound to be one less than 20
        System.out.println("Enter 20 integers and they will be added together:");
        for (int i=0; i<=19; i=i+1)
        {
            numbers[i]=keyedInput.nextInt();
        }
        //Change the upper bound to be one less than 20
        for (int i=0;i<=19;i=i+1)
        {
            total=total+numbers[i];
        }
        System.out.println("The sum of those numbers is:");
        System.out.println(total);
    }
    
}
