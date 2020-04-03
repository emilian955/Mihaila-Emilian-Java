package com.emi;

import com.emi.Board;
import com.emi.Player;
import java.lang.Math;
import java.util.ArrayList;
import java.util.List;

public class game {
    public int n;
    this.n = console.nextInt();
    public Board tabla=new Board(n);
    private List<Player> playeri= new ArrayList<Player>();
    public int i,j;
    this.i = console.nextInt();
    this.j = console.nextInt();
    playeri.add(i+j);
    playeri.run();
    public game(){
        this.tabla=null;
        this.playeri=null;
    }
    public void add(Player y){
        playeri.add(y);
    }
}