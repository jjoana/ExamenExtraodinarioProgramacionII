/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.extraordinaria2_2;

/**
 *
 * @author jesus
 */
public class Factorial {

    public int factorialRecursivo(int n) {
        if (n > 1) {
            n *= factorialRecursivo(n - 1);
        }

        return n;
    }

    public int factorialIterativo(int n) {
        int valor = 1;
        for (int i = n; i > 1; i--) {
            valor *= i;
        }
        return valor;
    }
}
