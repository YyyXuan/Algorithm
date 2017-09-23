package com.JframeDemo;

public class Circle {
    public int x,y;
    private int r;
    public int vx,vy;
    public Circle(int x,int y,int r,int vx,int vy){
        this.x=x;
        this.y=y;
        this.r=r;
        this.vx=vx;
        this.vy=vy;
    }
    public int getR(){
        return r;
    }
    public void move(){
        x=x+vx;
        y=y+vy;
    }
}
