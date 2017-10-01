package com.JframeDemo;

import com.JframeDemo.AlgoDrawHelper;
import com.JframeDemo.AlgoFrame;
import com.JframeDemo.Circle;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by gxh on 2017/9/30.
 */
public class FrameController {
    private Circle[] circles;
    private AlgoFrame algoframe;
    private boolean isRun = true;

    public FrameController(int ScreenWidth, int ScreenHeight, int N) {
        ;
        int r = 50;
        circles = new Circle[N];
        for (int i = 0; i < N; i++) {
            int x = (int) (Math.random() * (ScreenWidth - 2 * r) + r);
            int y = (int) (Math.random() * (ScreenHeight - 2 * r) + r);
            int vx = (int) Math.random() * 11 + 5;
            int vy = (int) Math.random() * 11 + 5;
            circles[i] = new Circle(x, y, r, vx, vy);
        }
        EventQueue.invokeLater(() -> {
            algoframe = new AlgoFrame("myframe", ScreenWidth, ScreenHeight);
            algoframe.addKeyListener(new AlgoKeyListener());
            new Thread(() -> {
                run();
            }).start();
        });
    }

    //动画逻辑
    private void run() {
        while (true) {
            algoframe.render(circles);
            AlgoDrawHelper.Pause(20);
            if (isRun) {
                for (Circle circle : circles)
                    circle.move(0, 0, algoframe.getCanvaswidth(), algoframe.getCanvasheight());
            }
        }
    }

    private class AlgoKeyListener extends KeyAdapter {  //KeyAdapter实现了KeyListener接口
        @Override
        public void keyReleased(KeyEvent e) {
            if (e.getKeyChar() == ' ') {
                isRun = !isRun;
            }
        }
    }
}
