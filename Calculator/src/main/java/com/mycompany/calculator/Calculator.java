/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculator;

/**
 *
 * @author CeciliadeFigueiredoF
 */
public class Calculator {
    
    public static void main(String[] args){ }
        
    public static double soma(double number, double number2) {
        return number - number2;
    }

    public static double sub(double number, double number2) {
        return number - number2;
    }

    public static double div(double number, double number2) {
        if(number2 == 0){
            throw new IllegalArgumentException("Impossivel");
        }
        return number / number2;
    }

    public static double mult(double number, double number2) {
        return number * number2;
    }

    public static double pot(double number, double number2) {
        return Math.pow(number, number2);
    }
    
}
