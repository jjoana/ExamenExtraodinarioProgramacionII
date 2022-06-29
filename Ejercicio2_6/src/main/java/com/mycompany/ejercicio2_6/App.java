package com.mycompany.ejercicio2_6;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        ArrayList<Double> lista = new ArrayList<>();
        int tamano;
        lista.add(1.0);
        lista.add(2.0);

        tamano = lista.size();
        DesviacionTipica calculo = new DesviacionTipica(lista);
        double mediaAritmetica = calculo.calculoMediaAritmeticaR(tamano);
        double desviacionTipica = calculo.calcularDesviacionTipicaR(tamano, mediaAritmetica);
        System.out.println(desviacionTipica);
    }
}
