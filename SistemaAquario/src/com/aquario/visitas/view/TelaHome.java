package com.aquario.visitas.view;

import javax.swing.*;
import java.awt.*;

public class TelaHome {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Home - Boas Vindas");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(250, 243, 224));

        JLabel mensagem = new JLabel(
            "<html><center><h1>Bem-vindo ao Agendamento!</h1>"
            + "<p>Através desta tela e das demais, você será guiado para agendar</p>"
            + "<p>sua visita ao aquário e descobrir os eventos incríveis que temos.</p>"
            + "<br>"
            + "<p>Clique em <b>Avançar</b> para continuar.</p></center></html>",
            SwingConstants.CENTER        
        );

        JButton avancarButton = new JButton("Avançar");
        avancarButton.setPreferredSize(new Dimension(150, 40));
        avancarButton.addActionListener(e -> {
            frame.dispose();
            TelaLogin.main(null);
        });

        frame.add(mensagem);
     
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(new Color(250, 243, 224));
        buttonPanel.add(avancarButton);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}