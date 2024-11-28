package com.aquario.visitas.view;

import javax.swing.*;
import java.awt.*;
import java.util.regex.*;

public class TelaCadastro {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Login");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.getContentPane().setBackground(new Color(250, 243, 224));

        JLabel titulo = new JLabel(
            "<html><center><h2>Preencha os campos abaixo para se cadastrar:</h2></center></html>",
            SwingConstants.CENTER
        );
        titulo.setPreferredSize(new Dimension(500, 170));

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new BoxLayout(formPanel, BoxLayout.Y_AXIS));
        formPanel.setBackground(new Color(250, 243, 224));

        JLabel usuarioLabel = new JLabel("Usuário:");
        JTextField usuarioField = new JTextField();
        usuarioField.setHorizontalAlignment(SwingConstants.CENTER);
        usuarioField.setMaximumSize(new Dimension(200, 30));
        
        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField();
        emailField.setHorizontalAlignment(SwingConstants.CENTER);
        emailField.setMaximumSize(new Dimension(230, 30));

        JLabel senhaLabel = new JLabel("Senha:");
        JPasswordField senhaField = new JPasswordField();
        senhaField.setHorizontalAlignment(SwingConstants.CENTER);
        senhaField.setMaximumSize(new Dimension(200, 30));

        formPanel.add(usuarioLabel);
        formPanel.add(usuarioField);
        formPanel.add(Box.createVerticalStrut(15));
        formPanel.add(emailLabel);
        formPanel.add(emailField);
        formPanel.add(Box.createVerticalStrut(15));
        formPanel.add(senhaLabel);
        formPanel.add(senhaField);

        usuarioLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        usuarioField.setAlignmentX(Component.CENTER_ALIGNMENT);
        emailLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        emailField.setAlignmentX(Component.CENTER_ALIGNMENT);
        senhaLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        senhaField.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton loginButton = new JButton("Ir para Login");
        loginButton.setPreferredSize(new Dimension(150, 40));
        loginButton.addActionListener(e -> {
                frame.dispose();
                TelaLogin.main(null);
        });
        
        JButton cadastroButton = new JButton("Criar cadastro");
        cadastroButton.setPreferredSize(new Dimension(150, 40));
        cadastroButton.addActionListener(e -> {
           
            String usuario = usuarioField.getText();
            String email = emailField.getText();
            String senha = new String(senhaField.getPassword());

            String emailRegex = "^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
            Pattern emailPattern = Pattern.compile(emailRegex);

            String senhaRegex = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$";
            Pattern senhaPattern = Pattern.compile(senhaRegex);

            if (usuario.isEmpty() || email.isEmpty() || senha.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Por favor, preencha todos os campos.", null, JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            if (usuario.length() < 10) {
                JOptionPane.showMessageDialog(frame, 
                    "O nome de usuário deve ter pelo menos 10 caracteres.", 
                    null, 
                    JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            if (!emailPattern.matcher(email).matches()) {
                JOptionPane.showMessageDialog(frame, "E-mail inválido! Use um formato adequado.", null, JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (!senhaPattern.matcher(senha).matches()) {
                JOptionPane.showMessageDialog(frame, 
                    "Senha inválida! A senha deve ter pelo menos 8 caracteres, incluindo letras, números e caracteres especiais.", 
                    null, 
                    JOptionPane.ERROR_MESSAGE
                );
                return;
            }
            
            JOptionPane.showMessageDialog(frame, "Cadastro realizado com sucesso!", null, JOptionPane.INFORMATION_MESSAGE);
            frame.dispose();
            TelaLogin.main(null);

        });
        
        frame.add(titulo, BorderLayout.NORTH);
        frame.add(formPanel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(new Color(250, 243, 224));
        buttonPanel.add(loginButton);
        buttonPanel.add(cadastroButton);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}