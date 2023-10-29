package ru.mirea.task16.z2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextEditor {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TextEditor::createAndShowGUI);
    }

    private static void createAndShowGUI() {
        // Создаем главное окно
        JFrame frame = new JFrame("Text Editor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        // Создаем панель с меню
        JPanel menuPanel = new JPanel();
        menuPanel.setLayout(new GridLayout(3, 2)); // Установим 3 строки и 2 столбца

        // Создаем выпадающее меню для выбора цвета текста
        String[] colors = {"Синий", "Красный", "Черный"};
        JComboBox<String> colorComboBox = new JComboBox<>(colors);
        colorComboBox.setPreferredSize(new Dimension(200, 40));

        // Создаем выпадающее меню для выбора шрифта
        String[] fonts = {"Times New Roman", "MS Sans Serif", "Courier New"};
        JComboBox<String> fontComboBox = new JComboBox<>(fonts);
        fontComboBox.setPreferredSize(new Dimension(200, 40));

        // Создаем текстовое поле
        JTextField textField = new JTextField();
        textField.setText("Это пример текста.");
        textField.setFont(new Font("Times New Roman", Font.PLAIN, 24));

        // Создаем кнопку для обновления текста
        JButton updateButton = new JButton("Обновить");
        updateButton.setPreferredSize(new Dimension(600, 40));

        // Добавляем слушатель события на кнопку
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Получаем выбранный цвет и шрифт
                String selectedColor = (String) colorComboBox.getSelectedItem();
                String selectedFont = (String) fontComboBox.getSelectedItem();

                // Устанавливаем цвет текста
                if (selectedColor.equals("Синий")) {
                    textField.setForeground(Color.BLUE);
                } else if (selectedColor.equals("Красный")) {
                    textField.setForeground(Color.RED);
                } else {
                    textField.setForeground(Color.BLACK);
                }

                // Устанавливаем шрифт
                Font font = new Font(selectedFont, Font.PLAIN, 24);
                textField.setFont(font);

                // Обновляем текст
                textField.setText(textField.getText());
            }
        });

        // Добавляем элементы в панель с меню
        menuPanel.add(new JLabel("Выберите цвет текста:"));
        menuPanel.add(colorComboBox);
        menuPanel.add(new JLabel("Выберите шрифт:"));
        menuPanel.add(fontComboBox);

        menuPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

        // Добавляем панель с меню и текстовое поле в главное окно
        frame.setLayout(new BorderLayout());
        frame.add(menuPanel, BorderLayout.NORTH);
        frame.add(textField, BorderLayout.CENTER);
        frame.add(updateButton, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}