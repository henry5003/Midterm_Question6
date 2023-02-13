/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Scanner;

/** This class takes String input plus,minus,divide and times
 * from user and execute the arithmetic operation
 * change the code to use enum instead String and mention the advantage of enum.
 * @author sivagamasrinivasan
 * 
 */
public class ArithmeticBase 
{
    public enum Operation {PLUS,MINUS,TIMES,DIVIDE};
    public double x,y;
    public double calculate(double x, double y) 
        {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter arithmetic operation to Perform: ");
        enum Operation s = sc.NextString;
        switch (s.toUpperCase()) 
        {
            case Operation[0]:
                return x + y;
            case Operation[1]:
                return x - y;
            case Operation[2]:
                return x * y;
            case Operation[3]:
                return x / y;
            default:
                throw new AssertionError("Unknown operations " + this);
        }
    }
   
};
