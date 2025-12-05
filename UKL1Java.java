/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ukl1.java;
import java.util.Scanner;
/**
 *
 * @author LOQ
 */
public class UKL1Java {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen Fibonacci: ");
        int n = input.nextInt();
        if (n > 100) {
           System.out.print("Jumlah elemen terlalu banyak");
           return; 
        }
        if (n < 10) {
            System.out.print("Terlalu Sedikit");
            return;
        }
        int a = 1, b = 1;
        int ganjil = 0;
        int genap = 0;
        System.out.print("Deret Fibonacci: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            if (a % 2 == 0) {
                genap++;
            } else {
                ganjil++;
            }
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println("\nJumlah bilangan genap: " + genap);
        System.out.println("Jumlah bilangan ganjil: " + ganjil);
        
    }
}
