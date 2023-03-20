/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bidang;

import Bidang.MenghitungBidang;

/**
 *
 * @author isatr
 */
public class PersegiPanjang implements MenghitungBidang{

    
    double panjang, lebar;
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    @Override
    public double hitungluas(){
        return panjang*lebar;
    }
    
    @Override
    public double hitungkeliling(){
        return 2*(panjang+lebar);
    }
}
