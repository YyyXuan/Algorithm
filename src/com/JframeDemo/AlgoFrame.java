package com.JframeDemo;

import javax.swing.*;
import javax.swing.event.EventListenerList;
import java.awt.*;
import java.awt.geom.Ellipse2D;

import static java.awt.Color.red;

public class AlgoFrame extends JFrame {
    private int canvaswidth;
    private int canvasheight;

    public AlgoFrame(String title, int width, int height) {
        super(title);
        this.canvasheight = height;
        this.canvaswidth = width;
        AlgoCanvas algoCanvas = new AlgoCanvas();
//        algoCanvas.setPreferredSize(new Dimension(canvaswidth,canvasheight));
        this.setContentPane(algoCanvas);
        pack();//根据加载进窗体的内容进行布局的整理，自动调整AlgoFrame窗体的大小
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }

    public AlgoFrame(String title) {
        this(title, 1024, 768);
    }

    public int getCanvaswidth() {
        return canvaswidth;
    }

    public int getCanvasheight() {
        return canvasheight;
    }

    private Circle[] circles;

    public void render(Circle[] circles) {
        this.circles = circles;
        this.repaint();

    }

    private class AlgoCanvas extends JPanel {
        public AlgoCanvas() {
            super(true);
        }           //双缓存

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            RenderingHints hints = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.addRenderingHints(hints);
            for (Circle circle : circles) {
                AlgoDrawHelper.setStrokeWidth(g2d, 1);
                AlgoDrawHelper.setColor(g2d, red);
                AlgoDrawHelper.drawCircle(g2d, circle.x, circle.y, circle.getR());
            }//抗锯齿

        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(canvaswidth, canvasheight);
        }
    }
}
