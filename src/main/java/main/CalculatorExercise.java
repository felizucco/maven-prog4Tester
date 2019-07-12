/** By Felipe P.
 *  Date: 2019-7-04
 *
 ·    Hacer una calculadora que reciba los valores por consola e imprima el resultado en consola.
 ·    Convertir la calculadora a proyecto maven y subirlo a bit bucket.
 */
package main;

import classes.Calculator;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class CalculatorExercise {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Hello, insert your name please: ");
        String name = reader.readLine();

        System.out.println("Nice to meet you, "+ name + " ,now insert a number please: ");
        int number1 = Integer.parseInt(reader.readLine());

        System.out.println("Insert a second number please: ");
        int number2 = Integer.parseInt(reader.readLine());

        System.out.println("So far you have insert following numbers: " + number1 +" and " + number2);

        Calculator myCal = new Calculator(number1,number2);

        System.out.println("What do you want to do with those numbers you entered? Select an option please: ");
        System.out.println("1 - Addition ; 2 - Subtraction ; 3 - Multiplication ; 4 - Division ");
        int expression = Integer.parseInt(reader.readLine());

        System.out.println("Outcome of your operation selected is: ");
        switch(expression) {
            case 1:
                System.out.println("(we are about to Add)  ");
                System.out.println (myCal.Add());
                break;
            case 2:
                System.out.println("(we are about to Subtract) ");
                System.out.println(myCal.Subtract());
                break;
            case 3:
                System.out.println("(we are about to multiply) ");
                System.out.println(myCal.Multiply());
                break;
            case 4:
                System.out.println("(we are about to divide) ");
                System.out.println(myCal.Divide(number1,number2));
                break;
            default:
                System.out.println("Incorrect selected operation");
        }




    }
}
