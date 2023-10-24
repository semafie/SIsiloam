/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasswordApp {
    private static JPasswordField passwordField;
    private static JButton toggleButton;
    private static boolean isHidden = true;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hide/Show Password");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);

        passwordField = new JPasswordField(20);

        toggleButton = new JButton("Show Password");
        toggleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                togglePasswordVisibility();
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(passwordField, BorderLayout.CENTER);
        panel.add(toggleButton, BorderLayout.EAST);

        frame.add(panel);

        frame.setVisible(true);
    }

    private static void togglePasswordVisibility() {
        if (isHidden) {
            passwordField.setEchoChar((char) 0);
            toggleButton.setText("Hide Password");
            isHidden = false;
        } else {
            passwordField.setEchoChar('*');
            toggleButton.setText("Show Password");
            isHidden = true;
        }
    }
}