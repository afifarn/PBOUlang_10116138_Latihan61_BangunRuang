/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116138_latihan61_bangunruang;

/**
 *
 * @author Aradnu
 */
public class PBOUlang_10116138_Latihan61_BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bola bola = new Bola();
        bola.setR(7);
        System.out.println("Volume Bola");
        System.out.println("Jari-Jari Bola = 7");
        System.out.println("Rumus : (4 * 3.14 * r * r * r) / 3");
        System.out.printf("Hasil =%,8.1f%n", (double) bola.hitungVolume());
        System.out.println("");

        Tabung tabung = new Tabung() {
        };
        tabung.setH(21);
        tabung.setR(10);
        System.out.println("Volume Tabung");
        System.out.println("Tinggi Tabung = 21");
        System.out.println("Jari-Jari Tabung = 10");
        System.out.println("Hasil = " + (int) tabung.hitungVolume());
        System.out.println("");

        Kerucut kerucut = new Kerucut();
        kerucut.setH(9);
        kerucut.setR(14);
        System.out.println("Volume Kerucut");
        System.out.println("Tinggi Kerucut = 9");
        System.out.println("Jari-Jari Kerucut = 14");
        System.out.println("Hasil = " + (int) kerucut.hitungVolume());

    }

}
