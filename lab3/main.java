
package com.mycompany.lab3;

import java.util.Scanner;
/**
 *
 * @author vonor
 */
public class main {
    
    public static void main(String[] args) {
        String tekst;
        tekst = szyfrCezara.wczytajTekst();
        System.out.println("Zaszyfrowany tekst: "+szyfrCezara.zaszyfruj(tekst));
        System.out.println("Podaj zaszyfrowany tekst: ");
        
        tekst = szyfrCezara.wczytajTekst();
        System.out.println("Odszyfrowany teskt: "+szyfrCezara.odszyfruj(tekst));
        System.out.println("Podaj tekst: ");
        
        tekst = szyfrCezara.wczytajTekst();
        boolean palindrom = szyfrCezara.palindrom(tekst);
        if(palindrom==true)System.out.println("Podany tekst to palidnrom.");
        else System.out.println("Podany tekst nie jest palindromem.");
    }
    
}
