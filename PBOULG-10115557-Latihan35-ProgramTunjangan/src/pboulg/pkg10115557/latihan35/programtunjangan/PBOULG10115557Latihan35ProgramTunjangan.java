/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pboulg.pkg10115557.latihan35.programtunjangan;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Rayan
 * KELAS    : PBO-Ulg
 * NIM      : 10115557
 * Deskripsi Program : Membuat program Tunjangan berbasis object
 */
public class PBOULG10115557Latihan35ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scn = new Scanner(System.in);
        Tunjangan t = new Tunjangan();

        System.out.println("===========Program Tunjangan===========");
        System.out.print("Berapa Gaji Pokok Anda Perbulan ? : Rp. ");
        t.gajiPokok = scn.nextDouble();
        System.out.print("Status Anda? (Menikah/Belum) : ");
        t.status = scn.next();

        t.HasilHitung(t.status,t.gajiPokok);

    }
}
