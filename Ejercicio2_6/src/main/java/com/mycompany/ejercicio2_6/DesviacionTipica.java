/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2_6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jesus
 */
public class DesviacionTipica {


    //Poner un ArrayList en private sirve para que solo los métodos de la clase puedan acceder y modificar el ArrayList.
    int tamanoLista = 0;
    private ArrayList<Double> listado;
    private ArrayList<Double> copiaListaCalculomedia;
    private ArrayList<Double> copiaListaDesviacionTipica;

    public DesviacionTipica(ArrayList<Double> listado) {

        //Copia de la lista para no modificar el listado.
        copiaListaCalculomedia = (ArrayList<Double>) listado.clone();

        //Copia del listado para no modificar el listado
        copiaListaDesviacionTipica = (ArrayList<Double>) listado.clone();

        //Guardo el tamaño del listado
        this.listado = listado;
        tamanoLista = listado.size();
    }

    public double calculoMediaAritmeticaR(int tamano) {

        //Se selecciona el primer elemeto de CopiaListaCalculoMedia y se divide entre su tamaño
        double valor = (double) copiaListaCalculomedia.get(0) / tamanoLista;

        //Prueba para ver que se están eliminando los elementos
        copiaListaCalculomedia.remove(0);

        //Prueba que hago para ver si eleminan todos los elementos de la lista recursivamente
        System.out.println("Eliminacion");

        //si el tamaño es mayor que 1, se llama recursivamente a la función con el tamaño disminuido en 1, y al resultado se le suma el valor actual.
        if (tamano > 1) {
            valor += calculoMediaAritmeticaR(tamano - 1);
        }
        return valor;
    }

    public double calcularDesviacionTipicaR(int tamano, double mediaAritmetica) {

        //calcula la diferencia que hay entre el primer elemento de copiaListaDesviacionTipica y la media aritmética de los numeros
        double base = (double) (copiaListaDesviacionTipica.get(0) - mediaAritmetica);

        //utiliza la fórmula de la varianza para calcular el conjunto de números
        double valor = (double)(Math.pow(base,2)/(tamanoLista - 1));

        //elimina el primer elemento de la lista copiaListaDesviacionTipica
        copiaListaDesviacionTipica.remove(0);

        //si el tamaño es mayor que 1, se llama recursivamente a la función con el tamaño disminuido en 1, y al resultado se le suma el valor actual.
        if (tamano > 1) {
            valor += calcularDesviacionTipicaR(tamano - 1 , mediaAritmetica);
        }
        return valor;
    }
}
