package com.JframeDemo;

import com.sun.org.apache.xml.internal.security.algorithms.JCEMapper;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(()-> {
            AlgoFrame algoFrame= new AlgoFrame("myframe",400,400);
        });
      }
}
