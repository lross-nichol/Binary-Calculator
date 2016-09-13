/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarycalc;
import java.util.Scanner;
/**
 *
 * @author lross-nichol
 */
public class BinaryCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    Scanner input = new Scanner(System.in);
    
    
    //this block creates the column constants
    final int column1 = 128;
    final int column2 = 64;
    final int column3 = 32;
    final int column4 = 16;
    final int column5 = 8;
    final int column6 = 4;
    final int column7 = 2;
    final int column8 = 1;
    
    //this block creates the bit variables
    int bit1;
    int bit2;
    int bit3;
    int bit4;
    int bit5;
    int bit6;
    int bit7;
    int bit8;
    
    String tryAgain = "y";
    do
    {
        System.out.print("Type 1 to convert Decimal to binary, or type 2 to convert binary to decimal: ");
        int convtype = input.nextInt();
        input.nextLine();
        System.out.println("");
        

        if (convtype == 1)
        {
            System.out.print("Please input your number: ");
            int num1 = input.nextInt();
            input.nextLine();
            //This series of if statements determine each bit either being 0 or 1
            if (num1 >= 128)
            {
                bit1 = 1;
                num1 = (num1 - column1);
            }
            else
            {
                bit1 = 0;
            }

            if (num1 >= 64)
            {
                bit2 = 1;
                num1 = (num1 - column2);
            }
            else
            {
                bit2 = 0;
            }

            if (num1 >= 32)
            {
                bit3 = 1;
                num1 = (num1 - column3);
            }
            else
            {
                bit3 = 0;
            }

            if (num1 >= 16)
            {
                bit4 = 1;
                num1 = (num1 - column4);
            }
            else
            {
                bit4 = 0;
            }

            if (num1 >= 8)
            {
                bit5 = 1;
                num1 = (num1 - column5);
            }
            else
            {
                bit5 = 0;
            }

            if (num1 >= 4)
            {
                bit6 = 1;
                num1 = (num1 - column6);
            }
            else
            {
                bit6 = 0;
            }

            if (num1 >= 2)
            {
                bit7 = 1;
                num1 = (num1 - column7);
            }
            else
            {
                bit7 = 0;
            }

            if (num1 >= 1)
            {
                bit8 = 1;
                num1 = (num1 - column8);
            }
            else
            {
                bit8 = 0;
            }

            //This prints out the binary number
            System.out.println("Your number in binary is: ") ;
            System.out.print(bit1);
            System.out.print(bit2);
            System.out.print(bit3);
            System.out.print(bit4);
            System.out.print(bit5);
            System.out.print(bit6);
            System.out.print(bit7);
            System.out.print(bit8);
            System.out.println("");
        }
        else if (convtype == 2)
        {
            //This converts binary to decimal
            System.out.print("Please enter an 8 bit binary number: ");
            String binarynum = input.nextLine();
            System.out.println("");
            System.out.println("");

            int decimalValue = Integer.parseInt(binarynum, 2);
            System.out.println("Your number in decimal is: " + decimalValue);
        }
        else
        {
            System.out.println("Invalid Input.");
        }
        
        //this is the input for the loop
        System.out.println("");
        System.out.println("Try again? Enter \"y/n\".");
        tryAgain = input.nextLine();
    
    }
    //this do while loop allows the user to either use the program again or terminate it
    while(!tryAgain.equals("n"));
    }
    
}
