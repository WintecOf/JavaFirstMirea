package ru.mirea.task5.z1;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class GUI {

    static final Random random = new Random();
    public static JFrame frame = new JFrame("My First GUI");
    public static int milan_score = 0;
    public static int madrid_score = 0;
    public static String winner = "N/A";
    static int time = 10;

    static void randomize() {
        int sum = milan_score + madrid_score;
        madrid_score = random.nextInt(sum);
        milan_score = sum - madrid_score;
    }

    static TimerTask timerTask = new TimerTask() {
        public void run() {
            time--;
            System.out.println(time);
            if (time == 0) {
                timerTask.cancel();
                close();
            }
        }
    };

    public static void close() {
        JOptionPane.showMessageDialog(frame, "Winner is: " + winner);
    }

    public static void main(String[] args) {

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,200);

        JPanel button_panel = new JPanel();

        button_panel.setBackground(Color.GRAY);
        button_panel.setPreferredSize(new Dimension(200,100));
        button_panel.setLayout(new BoxLayout(button_panel, BoxLayout.Y_AXIS));

        JButton button_milan = new JButton("AC Milan");
        JButton button_madrid = new JButton("Real Madrid");
        JButton button_randomize = new JButton("Randomize Score");
        button_panel.add(button_milan);
        button_panel.add(button_madrid);
        button_panel.add(button_randomize);


        JPanel text_panel = new JPanel();
        JLabel result = new JLabel("Result:" + milan_score + " x " + madrid_score, SwingConstants.CENTER);
        JLabel last_scorer = new JLabel("Last Scorer: N/A", SwingConstants.CENTER);
        JLabel winner_label = new JLabel("Winner: DRAW", SwingConstants.CENTER);

        text_panel.setPreferredSize(new Dimension(300,100));

        text_panel.setLayout(new BoxLayout(text_panel, BoxLayout.Y_AXIS));
        text_panel.add(result);
        text_panel.add(last_scorer);
        text_panel.add(winner_label);

        button_randomize.addActionListener(e -> {
            randomize();
            update(result, winner_label);
        });

        button_milan.addActionListener(e -> {
            milan_score++;
            last_scorer.setText("AC Milan");
            update(result, winner_label);
        });

        button_madrid.addActionListener(e -> {
            madrid_score++;
            last_scorer.setText("Real Madrid");
            update(result, winner_label);
        });


        frame.setLayout(new BorderLayout());
        frame.getContentPane().add(button_panel, BorderLayout.NORTH);
        frame.getContentPane().add(text_panel, BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);

        Timer timer =  new Timer("Timer");
        timer.scheduleAtFixedRate(timerTask, 1000, 1000);
    }

    private static void update(JLabel result, JLabel winner_label) {
        result.setText("Result:" + milan_score + " x " + madrid_score);
        if (milan_score > madrid_score) {
            winner_label.setText("AC Milan");
            winner = "AC Milan";
        }
        else if (madrid_score > milan_score) {
            winner_label.setText("Real Madrid");
            winner = "Real Madrid";
        }
        else {
            winner_label.setText("DRAW");
            winner = "Draw";
        }
    }

}
