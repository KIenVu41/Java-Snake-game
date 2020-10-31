/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Admin
 */
public class Apple {
    
   private int xCoor, yCoor, width, height;
    
    public Apple(int xCoor, int yCoor, int tileSize){
        this.xCoor = xCoor;
        this.yCoor = yCoor;
        width = tileSize;
        height = tileSize;
    }
    
    public void tick(){
        
    }
    
    public void draw(Graphics g){
        g.setColor(Color.RED);
        g.fillRect(xCoor * width, yCoor * height, width, height);
    }

    public void setxCoor(int xCoor) {
        this.xCoor = xCoor;
    }

    public void setyCoor(int yCoor) {
        this.yCoor = yCoor;
    }

    public int getxCoor() {
        return xCoor;
    }

    public int getyCoor() {
        return yCoor;
    }
    
}
