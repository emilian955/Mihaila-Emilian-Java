package com.emi;

import java.util.Vector;
public class Player implements Runnable {
    public String nume;
    Vector v = new Vector();
    public int length;

    public void setLength(int k) {
        this.length = k;
    }

    public Player(String Nume_, int length_) {
        this.nume = Nume_;
        this.length = length_;
    }

    public void setVal(String nume_) {
        this.nume = nume_;
    }

    public String getnume() {
        return this.nume;
    }

    public void add(int val) {
        v.add(val);
    }

    public void print_vector() {
        for (Object o : v) {
            System.out.print(o + " ");
        }
    }

    public boolean testare() {
        int ratie = (int) v.get(1) - (int) v.get(0);
        for (int index = 0; index < v.size(); index++) {
            if ((int) v.get(1) - (int) v.get(0) != ratie)
                return false;
        }
        return true;
    }

    @Override
    public void run() {
        if (v.size() == this.length) {
            if(testare())
            {
                System.out.println("Playerul cu numele"+this.nume+" are progresie aritmetica");
            }
        }
        else
            System.out.println("Playerul cu numele"+this.nume+" nu are progresie aritmetica");
    }
}