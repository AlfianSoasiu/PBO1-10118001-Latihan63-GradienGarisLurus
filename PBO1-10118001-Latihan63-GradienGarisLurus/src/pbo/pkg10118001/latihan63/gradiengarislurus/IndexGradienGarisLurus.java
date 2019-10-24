/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.pkg10118001.latihan63.gradiengarislurus;

/**
 *
 * @author
 * Nama      : Alfian Soasiu
 * Kelas     : PBO1
 * NIM       : 10118001
 * Deskripsi :
 */
public class IndexGradienGarisLurus {
    public static void main(String[] args) {
        
        Koordinat koordinat1 = new Koordinat(2, 10, 5, 7);
        System.out.println("Garis yang melalui titik ("+koordinat1.getX1()+","
                +koordinat1.getY1()+") dan ("+koordinat1.getX2()+","
                +koordinat1.getY2()+")");
        System.out.println("memiliki gradien sebesar "
                +koordinat1.hitungGradien());
        
        Koordinat koordinat2 = new Koordinat(5, 1, 3, 12);
        System.out.println("Garis yang melalui titik ("+koordinat2.getX1()+","
                +koordinat2.getY1()+") dan ("+koordinat2.getX2()+","
                +koordinat2.getY2()+")");
        System.out.println("memiliki gradien sebesar "
                +koordinat2.hitungGradien());
    }
    
}
