/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ukl7.java;
import java.util.Scanner;
/**
 *
 * @author LOQ
 */
public class UKL7Java {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah paket photobooth: ");
        int jumlahPaket = input.nextInt();
        input.nextLine(); // konsumsi newline
        String[] namaPaket = new String[jumlahPaket];
        long[] totalBiaya = new long[jumlahPaket];
        long[] totalPendapatan = new long[jumlahPaket];
        long[] labaRugi = new long[jumlahPaket];
        String[] status = new String[jumlahPaket];
        long totalLabaRugiKeseluruhan = 0;
        long labaTertinggi = Long.MIN_VALUE;
        String paketLabaTertinggi = "";
        for (int i = 0; i < jumlahPaket; i++) {
            System.out.println("\n=== Input Paket ke-" + (i + 1) + " ===");
            System.out.print("Nama paket: ");
            namaPaket[i] = input.nextLine();
            System.out.print("Biaya produksi per event: ");
            long biayaProduksi = input.nextLong();
            System.out.print("Harga jual per event: ");
            long hargaJual = input.nextLong();
            System.out.print("Jumlah event terjual: ");
            int jumlahEvent = input.nextInt();
            input.nextLine(); // konsumsi newline
            totalBiaya[i] = biayaProduksi * jumlahEvent;
            totalPendapatan[i] = hargaJual * jumlahEvent;
            labaRugi[i] = totalPendapatan[i] - totalBiaya[i];
            if (labaRugi[i] > 0) {
                status[i] = "Laba";
            } else if (labaRugi[i] < 0) {
                status[i] = "Rugi";
            } else {
                status[i] = "Impas";
            }
            totalLabaRugiKeseluruhan += labaRugi[i];
            if (labaRugi[i] > labaTertinggi) {
                labaTertinggi = labaRugi[i];
                paketLabaTertinggi = namaPaket[i];
            }
        }
        System.out.println("\n--------------------------------------------------------------");
        System.out.println("Nama Paket | Total Biaya | Total Pendapatan | Laba/Rugi | Status");
        System.out.println("--------------------------------------------------------------");
        for (int i = 0; i < jumlahPaket; i++) {
            System.out.printf("%-12s | Rp%-12d | Rp%-15d | Rp%-10d | %s\n",
                    namaPaket[i], totalBiaya[i], totalPendapatan[i], labaRugi[i], status[i]);
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println("Total Laba/Rugi Keseluruhan: Rp" + totalLabaRugiKeseluruhan);
        System.out.println("Paket dengan Laba Tertinggi: " + paketLabaTertinggi + " (Rp" + labaTertinggi + ")");
    }
}
