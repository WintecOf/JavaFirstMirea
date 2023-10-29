package ru.mirea.task12;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Anime extends JFrame {
    JLabel picLabel;
    int i;

    ImageIcon[] animation = new ImageIcon[40];

    public void load_animation() throws IOException {
        for (int i = 0; i < 40; i++) {
            animation[i] = new ImageIcon(ImageIO.read(new File("src/ru/mirea/task12/animation/E6lEt6I-" + i + ".jpg")));
        }
    }

    public void start_animation() throws InterruptedException {
        i = 1;
        while (true) {
            Thread.sleep(50);
            picLabel.setIcon(animation[i]);
            i++;
            if (i==40) {
                i = 0;
            }
        }
    }
    Anime() throws IOException, InterruptedException {
        super("Example");
        load_animation();
        setLayout(new FlowLayout());
        setSize(260,300);
        picLabel = new JLabel(animation[0]);
        add(picLabel);
        setVisible(true);
        start_animation();
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        new Anime();
    }
}
