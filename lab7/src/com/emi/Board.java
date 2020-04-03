package com.emi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
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
                list.add(r.nextInt(20) + 10);
            }
        for (int i = 1; i<Math.sqrt(n); i++) {
            for (int j = 1; j<Math.sqrt(n); j++)
                System.out.print(tokeni.get(i+j)+" ");
        }
        System.out.println();
    }
}
