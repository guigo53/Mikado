/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.awt.Color;

/**
 *
 * @author Rodrigo
 */
public class Stick {
    private Color color;
    private int width = 380;
    private int height = 30;

    public Stick(Color color) {
        int max = 255;
        int min = 0;
        int rand = (int) Math.random() * (max-min+1)+min;
        this.color = new Color(rand,rand,rand);
    }
    
    
}
