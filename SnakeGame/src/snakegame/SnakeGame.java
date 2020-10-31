/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame;

import javax.swing.JFrame;

/**
 *
 * @author Admin
 */
public class SnakeGame {

    /**
     * @param args the command line arguments
     */
    
    public SnakeGame(){
        JFrame frame  = new JFrame();
        
        GamePanel gamepanel = new GamePanel();
        
        frame.add(gamepanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("SNAKECODING");
        
        
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        new SnakeGame();
    }
    
}
