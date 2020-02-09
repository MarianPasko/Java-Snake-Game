package com.zetcode;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class Had extends JFrame {

    public Had() {
        
        initUI();
    }
    
    private void initUI() {
        
        add(new Doska());
               
        setResizable(false);
        pack();
        
        setTitle("Had");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    

    public static void main(String[] args) {
        
        EventQueue.invokeLater(() -> {
            JFrame ex = new Had();
            ex.setVisible(true);
        });
    }
}
