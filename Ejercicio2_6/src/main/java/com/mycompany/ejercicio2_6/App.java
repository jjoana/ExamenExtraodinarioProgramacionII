package com.mycompany.ejercicio2_6;

import java.util.ArrayList;

public class App {


    //Creacion del main
    public static void main(String[] args) {
        
        //Creacion del ArrayList
        ArrayList<Double> lista = new ArrayList<Double>();
        int tamano;
        //Creacion de la lista
        lista.add(1.0);
        lista.add(2.0);
        lista.add(3.0);
        lista.add(4.0);
        lista.add(5.0);
        lista.add(6.0);

        
        tamano = lista.size();
        DesviacionTipica calculo = new DesviacionTipica(lista);
        double mediaAritmetica = calculo.calculoMediaAritmeticaR(tamano);
        System.out.println(mediaAritmetica);
        double desviacionTipica = calculo.calcularDesviacionTipicaR(tamano, mediaAritmetica);
        System.out.println(desviacionTipica);
    }
}
