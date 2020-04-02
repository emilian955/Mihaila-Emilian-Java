package com.emi;

public class Token {
    private int val;
    public void setVal(int val){
        this.val=val;
    }
    public int getVal()
    {
        return this.val;
    }
    public Token(int val)
    {
        if(val<0)
            this.val=-1;
        else
            this.val=val;
    }
    @Override
    public String toString() {
        return "Token{" +
                "val=" + val +
                '}';
    }
}
