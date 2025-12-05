/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ukl6.java;
import java.util.Scanner;
/**
 *
 * @author LOQ
 */
public class UKL6Java {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama pelanggan: ");
        String nama = input.nextLine();
        System.out.print("Masukkan golongan listrik (A/B/C): ");
        char golongan = input.next().toUpperCase().charAt(0);
        System.out.print("Masukkan pemakaian listrik (kWh): ");
        int pemakaian = input.nextInt();
        int tarif = 0;
        if (golongan == 'A') {
            tarif = 1200;
        } else if (golongan == 'B') {
            tarif = 1500;
        } else if (golongan == 'C') {
            tarif = 1800;
        } else {
            System.out.println("Golongan tidak valid!");
            return;
        }
        double totalSebelum = pemakaian * tarif;
        double totalAkhir = totalSebelum;
        if (pemakaian > 500) {
            double tambahan = totalSebelum * 0.10;
            totalAkhir += tambahan;
        }
        System.out.println("\n===== RINCIAN TAGIHAN =====");
        System.out.println("Nama pelanggan       : " + nama);
        System.out.println("Golongan listrik     : " + golongan);
        System.out.println("Pemakaian listrik    : " + pemakaian + " kWh");
        System.out.println("Tagihan sebelum tambahan : Rp " + (int)totalSebelum);
        System.out.println("Total tagihan akhir      : Rp " + (int)totalAkhir);
    }
}
