/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ukl4.java;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author LOQ
 */
public class UKL4Java {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int target = rand.nextInt(100) + 1; // random 1–100
        ArrayList<Integer> history = new ArrayList<>();
        int tebakan = 0;
        System.out.println("=== Permainan Tebak Angka ===");
        System.out.println("Saya sudah memilih angka antara 1 sampai 100.");
        while (tebakan != target) {
            System.out.print("Masukkan tebakan Anda: ");
            tebakan = input.nextInt();
            history.add(tebakan);
            if (tebakan > target) {
                System.out.println("Tebakan terlalu tinggi!");
            } 
            else if (tebakan < target) {
                System.out.println("Tebakan terlalu rendah!");
            } 
            else {
                System.out.println("Anda menebak dengan benar!");
            }
        }
        System.out.println("\nRiwayat tebakan Anda:");
        for (int t : history) {
            System.out.print(t + " ");
        }
    }
}
