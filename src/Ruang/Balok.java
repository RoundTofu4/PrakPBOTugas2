/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ruang;

import Bidang.PersegiPanjang;
import Ruang.MenghitungRuang;

/**
 *
 * @author isatr
 */
public class Balok extends PersegiPanjang implements MenghitungRuang {
    double panjang, lebar; double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    @Override
    public double hitungvolume(){
        return hitungluas()*tinggi;
    }
    
    @Override
    public double hitungpermukaan(){
        return 2*(panjang*lebar+panjang*tinggi+lebar*tinggi);
    }
}
