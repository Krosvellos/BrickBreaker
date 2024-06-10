package brickBreaker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game extends JPanel implements ActionListener, KeyListener  {


    private boolean running = false;
    private int score = 0;

    private int totalBrickAmount = 20;

    private Timer timer;
    private int delay = 4;

    private int playerXStart = 310;
    private int ballXStart = 120;
    private int ballYStart = 350;

    private int ballXDirection = -1;
    private int ballYDirection = -2;

    public Game(){
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        timer = new Timer(delay,this);
        timer.start();
    }

    public void graphics(Graphics g){
        g.setColor(Color.darkGray);
        g.fillRect(1,1,692,592);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
