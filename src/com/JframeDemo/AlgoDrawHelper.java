package com.JframeDemo;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class AlgoDrawHelper {
    private AlgoDrawHelper(){};
    public static void setStrokeWidth(Graphics2D g2d,int w){
        int strokewidth = w;
        g2d.setStroke(new BasicStroke(strokewidth,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND));
    }
    public static void setColor(Graphics2D g2d,Color color){
        g2d.setColor(color);
    }
    public static void drawCircle(Graphics2D g2d,int x,int y,int r){
        Ellipse2D  circle = new Ellipse2D.Double(x-r,y-r,2*r,2*r);
        g2d.draw(circle);
    }
    public static void fillCircle(Graphics2D g2d,int x,int y,int r){
        Ellipse2D  circle = new Ellipse2D.Double(x-r,y-r,2*r,2*r);
        g2d.fill(circle);
    }
}
