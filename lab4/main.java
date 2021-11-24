/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.kolo;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

/**
 *
 * @author vonor
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        okrag[] tablica = new okrag [3];
        tablica[0] = new okrag();
        tablica[1] = new okrag();
        tablica[2] = new okrag();
        System.out.println(tablica[0]);
        System.out.println(tablica[1]);
        System.out.println(tablica[2]);
        metoda(tablica[0],tablica[1]);
}
    public static void metoda(okrag okrag1, okrag okrag2){
        double d = abs(sqrt((okrag1.x-okrag2.x)*(okrag1.x-okrag2.x)+(okrag1.y-okrag2.y)*(okrag1.y-okrag2.y)));
        int suma = okrag1.r + okrag2.r;
        int roznica = abs(okrag1.r-okrag2.r);
        if(d==roznica || d ==suma)System.out.println("Okręgi są styczne");
        else if(d < roznica || d > suma)System.out.println("Okręgi sa rozlaczne");
        else if(roznica < d && d < suma)System.out.println("Okregi przecinaja sie w dwoch punktach");
        if(okrag1 == okrag2)System.out.println("Okręgi pokrywają się");
    }
}