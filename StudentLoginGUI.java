package com.mycompany.StudentLoginSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentLoginGUI {
    private JFrame frame;
    private JTextField idField;
    private JPasswordField passField;
    private JButton loginButton;
    private LoginSystem loginSystem;

    public StudentLoginGUI() {
        loginSystem = new LoginSystem();

        frame = new JFrame("Student Login System");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3, 2, 10, 10));

        JLabel idLabel = new JLabel("Enter Student ID:");
        idLabel.setFont(new Font("Arial", Font.BOLD, 22));
        idLabel.setForeground(Color.BLACK);
        JLabel passLabel = new JLabel("Enter Password:");
        passLabel.setFont(new Font("Arial", Font.BOLD, 22));
        passLabel.setForeground(Color.BLACK);

        idField = new JTextField();
        idField.setFont(new Font("Arial", Font.PLAIN, 22));
        passField = new JPasswordField();
        passField.setFont(new Font("Arial", Font.PLAIN, 22));

        loginButton = new JButton("Login");
        loginButton.setFont(new Font("Arial", Font.PLAIN, 16));

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                performLogin();
            }
        });

        //Background wali image
        ImageIcon originalIcon = new ImageIcon("C:\\Users\\LAPTOP CLINIC\\Downloads\\HITEC_University_Logo.png");
        Image scaledImage = originalIcon.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        ImageIcon backgroundImage = new ImageIcon(scaledImage);


        JLabel background = new JLabel(backgroundImage);
        background.setLayout(new GridLayout(3, 2, 10, 20));
        frame.setContentPane(background);


        frame.add(idLabel);
        frame.add(idField);
        frame.add(passLabel);
        frame.add(passField);
        frame.add(new JLabel()); // empty cell
        frame.add(loginButton);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void performLogin() {
        try {
            int id = Integer.parseInt(idField.getText());
            int password = Integer.parseInt(new String(passField.getPassword()));

            Student s = loginSystem.verifyLogin(id, password);
            if (s != null) {
                JOptionPane.showMessageDialog(frame, "Welcome, " + s.getName() );
            } else {
                JOptionPane.showMessageDialog(frame, "Incorrect Id PAssword");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Please enter numbers only.");
        }
    }

    public static void main(String[] args) {
        new StudentLoginGUI();
    }
}
