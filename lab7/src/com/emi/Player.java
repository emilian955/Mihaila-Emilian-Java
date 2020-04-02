package com.emi;

import java.util.Vector;

public class Player {
    public String nume;
    Vector v = new Vector();
    public Player(String Nume_){
        this.nume=Nume_;
    }
    public void setVal(String nume_){
        this.nume=nume_;
    }
    public String getnume()
    {
        return this.nume;
    }
    public void add(int val){
        v.add(val);
    }
    public void print_vector(){
        for (Object o : v) {
            System.out.print(o + " ");
        }
    }
    public boolean testare(){
        int ratie= (int)v.get(1) - (int)v.get(0);
        for(int index = 0; index < v.size(); index++) {
            if((int)v.get(1) - (int)v.get(0)!=ratie)
                return false;
        }
        return true;
    }
}
