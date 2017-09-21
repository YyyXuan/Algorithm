package com.JframeDemo;
import javax.swing.*;
import javax.swing.event.EventListenerList;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class AlgoFrame extends JFrame{
    private int canvaswidth;
    private int canvasheight;
    AlgoFrame(String title, int width, int height){
        super(title);
        this.canvasheight=height;
        this.canvaswidth=width;
        AlgoCanvas algoCanvas =new AlgoCanvas();
//        algoCanvas.setPreferredSize(new Dimension(canvaswidth,canvasheight));
        this.setContentPane(algoCanvas);
        pack();//根据加载进窗体的内容进行布局的整理，自动调整AlgoFrame窗体的大小
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }
    public AlgoFrame(String title){
        this(title,1024,768);
    }
    public void setCanvaswidth(int canvaswidth) {
        this.canvaswidth = canvaswidth;
    }
    public int getCanvasheight() {
        return canvasheight;
    }
    private class AlgoCanvas extends JPanel{
        @Override
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D)g;
            int strokewidth =10;
            (g2d).setStroke(new BasicStroke(strokewidth));
            g2d.setColor(Color.red);
            Ellipse2D circle = new Ellipse2D.Double(50,50,300,300);
            g2d.draw(circle);
            Ellipse2D circle2 = new Ellipse2D.Double(60,60,280,280);
            g2d.setColor(Color.CYAN);
            g2d.fill(circle2);


        }
        @Override
        public Dimension getPreferredSize(){
            return new Dimension(canvaswidth,canvasheight);
        }
    }
}
