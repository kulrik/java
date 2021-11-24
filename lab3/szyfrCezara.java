/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab3;
import java.util.Scanner;
/**
 *
 * @author vonor
 */
public class szyfrCezara {
       static String wczytajTekst(){
           String tekst;
           System.out.println("Wprowadz tekst: ");
           Scanner skaner = new Scanner(System.in);
           tekst = skaner.nextLine();
           return tekst;
       }
       static String zaszyfruj(String tekst){
           String zaszyfrowane = "";
           int klucz;
           System.out.println("Podaj klucz: ");
           Scanner skaner = new Scanner(System.in);
           klucz = skaner.nextInt();
           char alfabet;
           for(int i = 0; i < tekst.length();i++){
               alfabet = tekst.charAt(i);
               if(alfabet >= 'a' && alfabet <='z'){
                   alfabet = (char)(alfabet+klucz);
                   if(alfabet > 'z'){
                       alfabet = (char)(alfabet+'a'-'z'-1);
                   }
                   zaszyfrowane = zaszyfrowane + alfabet;
               }
               else if(alfabet >= 'A' && alfabet <= 'Z'){
                   alfabet = (char)(alfabet + klucz);
                   if(alfabet > 'Z'){
                       alfabet = (char)(alfabet+'A'-'Z'-1);
                   }
                   zaszyfrowane = zaszyfrowane+alfabet;
               }
               else{
                   zaszyfrowane = zaszyfrowane + alfabet;
               }
           }
           return zaszyfrowane;
       }
       static String odszyfruj(String tekst){
           String odszyfrowane = "";
           int klucz;
           System.out.println("Podaj klucz: ");
           Scanner skaner = new Scanner(System.in);
           klucz = skaner.nextInt();
           for(int i = 0; i < tekst.length();i++){
               char alfabet = tekst.charAt(i);
               if(alfabet >= 'a' && alfabet <= 'z'){
                   alfabet = (char)(alfabet-klucz);
                   if(alfabet<'a'){
                       alfabet = (char)(alfabet-'a'+'z'+1);
                   }
                   odszyfrowane = odszyfrowane+alfabet;
               }
               else if(alfabet >= 'A' && alfabet <= 'Z'){
                   alfabet = (char)(alfabet-klucz);
                   if(alfabet < 'A'){
                       alfabet = (char)(alfabet-'A'+'Z'+1);
                   }
                   odszyfrowane = odszyfrowane + alfabet;
               }
               else{
                   odszyfrowane = odszyfrowane + alfabet;
               }
           }
           return odszyfrowane;
       }
       
       
       
       
       static boolean palindrom(String tekst){
            String czystyTekst = tekst.replaceAll("\\s+", "").toLowerCase();
            int dlugoscTekstu = czystyTekst.length();
            int pierwszy = 0;
            int ostatni = tekst.length() - 1;
            while (pierwszy > ostatni) {
            char doPrzodu = czystyTekst.charAt(pierwszy++);
            char doTylu = czystyTekst.charAt(ostatni--);
            if (doPrzodu != doTylu)
                return false;
            }
            return true;
       }
}

    
