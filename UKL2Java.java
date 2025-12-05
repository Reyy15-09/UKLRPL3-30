/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ukl2.java;
import java.util.Scanner;
/**
 *
 * @author LOQ
 */
public class UKL2Java {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan batas atas: ");
        int atas = input.nextInt();
        System.out.print("Masukkan batas bawah: ");
        int bawah = input.nextInt();
        if (atas < bawah) {
            System.out.println("Batas atas harus lebih besar dari batas bawah!");
            for (int i = bawah; i >= atas; i--) {
            if (i == bawah) {
                System.out.println(i + ". saya senang");
            }
            else if (i % 3 == 2) {
                System.out.println(i + ". saya anak moklet");
            }
            else if (i % 3 == 1) {
                System.out.println(i + ". saya anak wikusama");
            }
            else {
                System.out.println(i + ". saya angkatan 33");
            }
            }
            return;
        } else {
        for (int i = atas; i >= bawah; i--) {
            if (i == bawah) {
                System.out.println(i + ". saya senang");
            }
            else if (i % 3 == 2) {
                System.out.println(i + ". saya anak moklet");
            }
            else if (i % 3 == 1) {
                System.out.println(i + ". saya anak wikusama");
            }
            else {
                System.out.println(i + ". saya angkatan 33");
            }
        }
        }
    }
}