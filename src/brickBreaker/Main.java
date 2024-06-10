package brickBreaker;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame object = new JFrame();
        Game game = new Game();

        // Attributy pro JFrame
        object.setBounds(10,10,700,600);
        // Název
        object.setTitle("Brick Breaker v Javě");
        object.setResizable(false);
        object.setVisible(true);

        object.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        object.add(game);
    }
}