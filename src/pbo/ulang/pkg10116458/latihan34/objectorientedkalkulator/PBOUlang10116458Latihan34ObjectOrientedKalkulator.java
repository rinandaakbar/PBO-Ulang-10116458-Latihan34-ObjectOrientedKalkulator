/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10116458.latihan34.objectorientedkalkulator;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Rinanda Al Qorrie Akbar
 * NIM      : 10116458
 */
public class PBOUlang10116458Latihan34ObjectOrientedKalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kalkulator k = new Kalkulator();
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("====Aplikasi Kalkulator Bilangan====");
        System.out.print("Masukkan angka ke-1 : ");
        Double value1 = scnr.nextDouble();
        System.out.print("Masukkan angka ke-2 : ");
        Double value2 = scnr.nextDouble();
        System.out.println();
        System.out.println("Hasil Pertambahan : " + k.tambahBilangan(value1,value2));
        System.out.println("Hasil Pengurangan : " + k.kurangBilangan(value1,value2));
        System.out.println("Hasil Perkalian : " + k.kaliBilangan(value1,value2));
        System.out.println("Hasil Pembagian : " + k.bagiBilangan(value1,value2));
        System.out.println("Hasil Sisa : " + k.sisaBilangan(value1,value2));
    }
    
}
