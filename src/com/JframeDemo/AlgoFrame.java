package com.JframeDemo;
import javax.swing.*;
import java.awt.*;

public class AlgoFrame extends JFrame{
    private int canvaswidth;
    private int canvasheight;
    public AlgoFrame(String title,int width,int height){
        super(title);
        this.canvasheight=height;
        this.canvaswidth=width;
        AlgoCanvas algoCanvas =new AlgoCanvas();
        algoCanvas.setPreferredSize(new Dimension(canvaswidth,canvasheight));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }
    public void setCanvaswidth(int canvaswidth) {
        this.canvaswidth = canvaswidth;
    }
    public int getCanvasheight() {
        return canvasheight;
    }
    private class AlgoCanvas extends JPanel{


    }
}
