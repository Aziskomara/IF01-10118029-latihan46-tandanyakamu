/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118029.latihan46.tandanyakamu;

/**
 *
 * @author acer
 * Nama  : Azis komara
 * Nim   : 10118029
 * Kelas : IF-1 
 * Deskripsi program : Program ini menampilkan Tandanya kamu
 */
public class age {
    private int yearbirth;
    private int yearnow;
    private String red;

    public age(int yearnow) {
        this.yearnow = yearnow;
    }

    public int getYearbirth() {
        return yearbirth;
    }

    public void setYearbirth(int yearbirth) {
        this.yearbirth = yearbirth;
    }

    public int getYearnow() {
        return yearnow;
    }
    
    public int hitungUmur(){
        return yearnow - yearbirth;
    }
    
    public String tandanyaKamu(int umur){
        if((umur > 0 ) && (umur <= 5)){
            return "LAGI LUCU-LUCU NYA";
        }
        else if ((umur > 5) && (umur <= 10)){
             return "MASIH ANAK-ANAK"  ;     
        }
        else if ((umur > 10) && (umur <= 13)){
             return "MASIH REMADJA"  ;     
        }
        else if ((umur > 13) && (umur <= 19)){
             return "ALAY"  ;     
        }
        else if ((umur > 19) && (umur <= 29)){
             return "LAGI GALAW NYARI JODOH"  ;     
        }
        else if ((umur > 29) && (umur <= 35)){
             return "LAGI SIBUK NYARI UANG"  ;     
        }
        else if ((umur > 35) && (umur <= 150)){
             return "SUDAH TUA"  ;     
        }
        else if ((umur > 0) && (umur > 150)){
             return "TIDAK TERDEFINISI DI KEHIDUPAN"  ;     
        }
        return null;
    }
}
