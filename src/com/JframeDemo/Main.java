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
        for(int i=0;i<N;i++){
            int x =(int)(Math.random()*(ScreenWidth-2*r)-r);
            int y =(int)(Math.random()*(ScreenHeight-2*r)-r);
        }
        EventQueue.invokeLater(()-> {
            AlgoFrame algoFrame= new AlgoFrame("myframe",ScreenWidth,ScreenHeight);
        });
      }
}
