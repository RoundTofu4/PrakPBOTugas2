/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;


import Ruang.Balok;
import java.awt.event.*;
import java.util.InputMismatchException;
import javax.swing.*;
/**
 *
 * @author isatr
 */



class tampilan extends JFrame implements ActionListener{
    JButton btncount = new JButton("Count");
    JButton btnreset = new JButton("Reset");
    JLabel llength = new JLabel("Length : "); 
    JTextField flength = new JTextField(5);
    JLabel lwidth = new JLabel("Width : ");
    JTextField fwidth = new JTextField(5);
    JLabel lheight = new JLabel("Height : ");
    JTextField fheight = new JTextField(5);
    JLabel lresult = new JLabel("Result : ");
    JLabel lresluaspp = new JLabel();
    JLabel lreskeliling = new JLabel();
    JLabel lresvolume = new JLabel();
    JLabel lresluas = new JLabel();
    JLabel ttle = new JLabel("Kalkulator Balok");
    
    public tampilan(){
        setTitle("Cuboid Calculator");
        setDefaultCloseOperation(3);
        setSize(500, 550);
        setLayout(null);
        
        add(btncount);
        add(btnreset);
        add(llength);
        add(flength);
        add(lwidth);
        add(fwidth);
        add(lheight);
        add(fheight);
        add(lresult);
        add(lreskeliling);
        add(lresluas);
        add(lresluaspp);
        add(lresvolume);
        add(ttle);
        
        setVisible(true);
        ttle.setBounds(190, 35, 120, 20);
        llength.setBounds(25, 75, 120, 20);
        flength.setBounds(155, 75, 220, 20);
        lwidth.setBounds(25, 105, 120, 20);
        fwidth.setBounds(155, 105, 220, 20);
        lheight.setBounds(25, 135, 120, 20);
        fheight.setBounds(155, 135, 220, 20);
        lresult.setBounds(220, 180, 220, 20);
        
        btncount.setBounds(100, 400, 120, 20);
        btnreset.setBounds(250, 400, 120, 20);
        
        btncount.addActionListener(this);
        btnreset.addActionListener(this);
        flength.addActionListener(this);
        fwidth.addActionListener(this);
        fheight.addActionListener(this);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
    }
    
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == btncount) {
            String inputlength = flength.getText();
            String inputwidth = fwidth.getText();
            String inputheight = fheight.getText();
            int lengthvalue = 0, widthvalue = 0, heightvalue = 0;
            try {
                lengthvalue = Integer.parseInt(inputlength);
                widthvalue = Integer.parseInt(inputwidth);
                heightvalue = Integer.parseInt(inputheight);
            } catch (NumberFormatException error) {
                Error1 z = new Error1(error.getMessage());
                System.out.println(error.getMessage());
            }
            
            
            Balok balok = new Balok(lengthvalue, widthvalue, heightvalue);
            lresluaspp.setBounds(95, 225, 220, 20);
            lresluaspp.setText("Luas Persegi Panjang : "+balok.hitungluas());
            lreskeliling.setBounds(95, 255, 220, 20);
            lreskeliling.setText("Keliling Persegi Panjang : "+balok.hitungkeliling());
            lresvolume.setBounds(95, 285, 220, 20);
            lresvolume.setText("Volume Balok : "+ balok.hitungvolume());
            lresluas.setBounds(95, 315, 220, 20);
            lresluas.setText("Luas Permukaan Balok : "+balok.hitungpermukaan());
            System.out.println(balok.hitungpermukaan());
            
        }
    
        if(e.getSource() == btnreset){
           fheight.setText("");
           fwidth.setText("");
           flength.setText("");
           lresluaspp.setText("");
           lreskeliling.setText("");
           lresvolume.setText("");
           lresluas.setText("");
       }
    }
    
}

/*public class View {
    public static void main(String[] args) {
        tampilan t = new tampilan();
    }
    
}*/


