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



class Error1 extends JFrame implements ActionListener{
    JLabel err = new JLabel("");
    
    public Error1(String errsmg){
        setTitle("Error");
        setDefaultCloseOperation(3);
        setSize(300, 150);
        setLayout(null);
        
        add(err);
        setVisible(true);
        err.setBounds(70, 40, 220, 20);
        err.setText(errsmg);
        
        
        
        
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
    }
    
    public void actionPerformed(ActionEvent e){
        
    }
    
}
