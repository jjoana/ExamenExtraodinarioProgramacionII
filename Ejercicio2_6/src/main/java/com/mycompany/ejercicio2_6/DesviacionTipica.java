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

    int tamanoLista = 0;
    private ArrayList<Double> listado;
    private ArrayList<Double> copiaListaCalculomedia;
    private ArrayList<Double> copiaListaDesviacionTipica;

    public DesviacionTipica(ArrayList<Double> listado) {
        copiaListaCalculomedia = (ArrayList<Double>) listado.clone();
        copiaListaDesviacionTipica = (ArrayList<Double>) listado.clone();
        this.listado = listado;
        tamanoLista = listado.size();
    }

    public double calculoMediaAritmeticaR(int tamano) {
        double valor = (double) copiaListaCalculomedia.get(0) / tamanoLista;
        copiaListaCalculomedia.remove(0);
        if (tamano > 1) {
            valor += calculoMediaAritmeticaR(tamano - 1);
        }
        return valor;
    }

    public double calcularDesviacionTipicaR(int tamano, double mediaAritmetica) {
        double base = (double) (copiaListaDesviacionTipica.get(0) - mediaAritmetica);
        double valor = (double)(Math.pow(base,2)/(tamanoLista - 1));
        copiaListaDesviacionTipica.remove(0);
        if (tamano > 1) {
            valor += calcularDesviacionTipicaR(tamano - 1 , mediaAritmetica);
        }
        return valor;
    }
}
