package com.pb.kozachenko.hw15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client  extends JFrame {


    public static void main(String[] args) throws Exception {
        JFrame myWindow = new JFrame("JFrame");
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setSize(400, 300);
        myWindow.setVisible(true);

        JTextField smallField = new JTextField(15);
        smallField.setToolTipText("Короткое поле");
        // Слушатель окончания ввода
      smallField.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
                // Отображение введенного текста
            String textFieldValue =smallField.getText();
           }
      });



        myWindow.setLayout(new FlowLayout());

        JButton jButtonSend = new JButton("Отправить на сервер");

        jButtonSend.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null,"Привет","Нажато",
                        JOptionPane.WARNING_MESSAGE);
            }
        });
        myWindow.add(smallField);
        myWindow.add(jButtonSend);

        System.out.println("Клиент стартовал");
        String serverIp = "127.0.0.1";
        int port = 1234;
        System.out.println("Соединяемся с сервером " + serverIp + ":" + port);

        Socket socket = new Socket(serverIp, port);
        BufferedReader inServer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter outServer = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader inConsole = new BufferedReader(new InputStreamReader(System.in));

        String dataFromUser, dataFromServer;


        while ((dataFromUser = inConsole.readLine()) != null) {
            outServer.println(dataFromUser);
            dataFromServer = inServer.readLine();
            System.out.println(dataFromServer);
            if ("exit".equalsIgnoreCase(dataFromUser)) {
                break;
            }
        }
        outServer.close();
        inServer.close();
        outServer.close();
        socket.close();
    }
}
