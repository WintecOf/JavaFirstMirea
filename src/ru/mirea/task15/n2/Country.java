package ru.mirea.task15.n2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Country extends JFrame {
    Country() {
        super("Countries");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        Font font = new Font("Verdana", Font.PLAIN, 18);
        String[] items = {
                "Finland",
                "Canada",
                "Japan"
        };
        JComboBox comboBox = new JComboBox(items);

        final JLabel label = new JLabel(" ");
        label.setAlignmentX(LEFT_ALIGNMENT);
        label.setAlignmentY(TOP_ALIGNMENT);
        label.setFont(font);
        label.setBounds(0,100,500,200);
        add(label);

        ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JComboBox box = (JComboBox)e.getSource();
                String item = (String)box.getSelectedItem();
                if (Objects.equals(item, "Finland")) {
                    label.setText("<html>" + "Финляндия - это северное европейское государство с прекрасной природой, тысячами озер, густыми лесами и современными городами, известное своей высокой жизненной плотностью, культурным многообразием и сильной социальной защитой." + "<html>");
                }
                else if (Objects.equals(item, "Canada")) {
                    label.setText("<html>" + "Канада - это огромная североамериканская страна, известная своими великолепными природными пейзажами, включая горы, озера и леса, а также мультикультурным обществом и высоким уровнем жизни." + "<html>");
                }
                else {
                    label.setText("<html>" + "Япония - это островная нация в Восточной Азии, сочетающая в себе современные технологии и древние традиции, известная своим уникальным искусством, культурой и кухней." + "<html>");
                }
            }
        };
        comboBox.addActionListener(actionListener);
        comboBox.setBounds(0, 0, 500, 100);
        comboBox.setFont(font);
        setSize(520, 300);
        add(comboBox);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Country();
    }
}
