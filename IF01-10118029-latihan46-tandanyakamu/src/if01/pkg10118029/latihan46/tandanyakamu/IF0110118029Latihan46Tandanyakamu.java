/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118029.latihan46.tandanyakamu;

import java.util.Scanner;

/**
 *
 * @author acer
 * Nama  : Azis komara
 * Nim   : 10118029
 * Kelas : IF-1 
 * Deskripsi program : Program ini menampilkan Tandanya kamu
 */
public class IF0110118029Latihan46Tandanyakamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        age age = new age(2019);
        
        //
        System.out.println("Masukan Tahun Lahir Anda : " );
        age.setYearbirth(scanner.nextInt());
        
        //
        System.out.println("======Hasil Perhitugungan Umur======");
        System.out.println("Tahun Lahir anda : " + age.getYearbirth());
        System.out.println("Hari ini Tahun : 2019 ");
        System.out.println("Umur kamu sampai hari ini adalah " + age.hitungUmur() + "tahun");
        System.out.println("Tandanya kamu "+ age.tandanyaKamu(age.hitungUmur()));
        
    }
    
}
