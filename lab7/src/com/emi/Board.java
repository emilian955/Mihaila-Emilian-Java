package com.emi;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Vector;

public class Board {
    private int n;
    private List<Token> tokeni= new ArrayList<Token>();
    public static double getRandomNumber(){
        double x = Math.random();
        return x;
    }

    @Override
    public String toString() {
        return "Board{" +
                "n=" + n +
                ", tokeni=" + tokeni +
                '}';
    }

    public Board(int n_){
        this.n=n_;
        Random r=new Random();
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int i = 1; i<this.n; i++) {
                list.add(r.nextInt(90) + 10);
            }
    }
}
