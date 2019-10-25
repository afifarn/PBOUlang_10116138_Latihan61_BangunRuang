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
public class Kerucut extends BangunRuang {

    private double h;
    private double r;

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double hitungVolume() {
        return (1 * 3.14 * r * r * h) / 3 ;
    }

}
