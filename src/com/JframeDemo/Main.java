package com.JframeDemo;

import com.sun.org.apache.xml.internal.security.algorithms.JCEMapper;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        int ScreenWidth = 800;
        int ScreenHeight = 800;
        int r= 50;
        int N=10;
        Circle circles[] = new Circle[N];
        for(int i=0;i<N;i++){
            int x =(int)(Math.random()*(ScreenWidth-2*r)+r);
            int y =(int)(Math.random()*(ScreenHeight-2*r)+r);
            int vx=(int)Math.random()*11+5;
            int vy=(int)Math.random()*11+5;
            circles[i] = new Circle(x,y,r,vx,vy);
        }
        EventQueue.invokeLater(()-> {
            AlgoFrame algoFrame= new AlgoFrame("myframe",ScreenWidth,ScreenHeight);
            new Thread(()->{
                while(true){
                    algoFrame.render(circles);
                    AlgoDrawHelper.Pause(20);
                    for(Circle circle:circles){
                        circle.move(0,0,ScreenWidth,ScreenHeight);
                    }

                }
            }).start();



        });
      }
}
