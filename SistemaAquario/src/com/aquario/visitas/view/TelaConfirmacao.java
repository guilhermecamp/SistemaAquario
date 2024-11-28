package com.aquario.visitas.view;

import javax.swing.*;
import java.awt.*;

public class TelaConfirmacao {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Confirmação de Pedido de Agendamento");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.getContentPane().setBackground(new Color(250, 243, 224));

        JLabel titulo = new JLabel(
                "<html><center><h2>Pedido de Agendamento Concluído!</h2></center></html>", 
                SwingConstants.CENTER
        );
        titulo.setPreferredSize(new Dimension(500, 60));

        JLabel mensagem = new JLabel(
                "<html><center><p>Você receberá a confirmação do agendamento no seu email cadastrado dentro de algumas horas.</p></center></html>", 
                SwingConstants.CENTER);
        mensagem.setPreferredSize(new Dimension(500, 60));

        JLabel eventosTitulo = new JLabel(
                "<html><center><h3>Futuros Eventos do Aquário:</h3></center></html>", 
                SwingConstants.CENTER);
        eventosTitulo.setPreferredSize(new Dimension(500, 30));
        
        JLabel eventos = new JLabel(
                "<html><center><p>• Chegada de Peixes Exóticos - 05/12/2024</p>"
              + "<p>• Apresentações de Alimentação dos Peixes - 10/12/2024</p>"
              + "<p>• Tour Noturno - 15/12/2024</p></center></html>", 
                SwingConstants.CENTER
        );
        mensagem.setPreferredSize(new Dimension(500, 60));

        JLabel feedbackMensagem = new JLabel(
                "<html><center>"
                + "<p>No caso de quaisquer dúvidas, entre em contato conosco pelos meios abaixo:</p>"
                + "<p><br></p>"
                + "<p>Telefone: (70) 7070-7070</p>"
                + "<p>Email: adminaquario@gmail.com</p></center></html>", 
                SwingConstants.CENTER
        );
        feedbackMensagem.setPreferredSize(new Dimension(500, 60));
        
        JButton saidaButton = new JButton("Sair");
        saidaButton.setPreferredSize(new Dimension(150, 40));
        saidaButton.addActionListener(e -> {
            frame.dispose();
        });

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(new Color(250, 243, 224));

        panel.add(Box.createVerticalStrut(15));
        panel.add(titulo);
        panel.add(mensagem);
        panel.add(Box.createVerticalStrut(40));
        panel.add(eventosTitulo);
        panel.add(Box.createVerticalStrut(20));
        panel.add(eventos);
        panel.add(Box.createVerticalStrut(90));
        panel.add(feedbackMensagem);
        panel.add(Box.createVerticalStrut(20));
        
        titulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        mensagem.setAlignmentX(Component.CENTER_ALIGNMENT);
        eventosTitulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        eventos.setAlignmentX(Component.CENTER_ALIGNMENT);
        feedbackMensagem.setAlignmentX(Component.CENTER_ALIGNMENT);
        saidaButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.setAlignmentX(Component.CENTER_ALIGNMENT);

        frame.add(panel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(new Color(250, 243, 224));
        buttonPanel.add(saidaButton);
        frame.add(buttonPanel, BorderLayout.SOUTH);
        
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}