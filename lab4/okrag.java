/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.kolo;

import java.util.Random;

/**
 *
 * @author vonor
 */
public class okrag {
    public int x, y, r;
    
    Random rnd = new Random();
    public okrag() {
        this.x = rnd.nextInt(91)+5;
        this.y = rnd.nextInt(91)+5;
        this.r = rnd.nextInt(5)+1;
    }

    @Override
    public String toString() {
        return "okrag{" + "x=" + x + ", y=" + y + ", r=" + r + '}';
    }
    
}

