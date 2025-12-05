/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ukl3.java;
import java.util.Scanner;
/**
 *
 * @author LOQ
 */
public class UKL3Java {

   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat: ");
        int n = input.nextInt();
        long hasil = 1;
        System.out.print("proses: ");
        for (int i = n; i >= 1; i--) {
            hasil *= i;
            if (i > 1) {
                System.out.print(i + " x ");
            } else {
                System.out.print(1);  
            }
        }
        System.out.println("\nFaktorial dari " + n + " adalah: " + hasil);
    }
}