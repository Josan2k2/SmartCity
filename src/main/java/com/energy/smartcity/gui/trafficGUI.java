package com.energy.smartcity.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.border.EmptyBorder;
import javax.swing.*;

import io.grpc.*;

import com.energy.smartcity.traffic.*;

public class trafficGUI implements ActionListener {
    private JTextField reply1;
    private JTextField reply2;
    private JTextField reply3;

    private JPanel getEmergencyJPanel() {

        JPanel panel = new JPanel();

        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

        JLabel label = new JLabel("Emergency services");
        panel.add(label);

        JButton emerButton = new JButton("Emergency Lights");
        emerButton.addActionListener(this);
        panel.add(emerButton);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));

        reply1 = new JTextField("", 30);
        reply1.setEditable(false);
        panel.add(reply1);

        return panel;
    }

    private JPanel getAutoLightsJPanel() {

        JPanel panel = new JPanel();

        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

        JLabel label = new JLabel("Auto street lights");
        panel.add(label);

        JButton autoLightsButton = new JButton("Street Lights");
        autoLightsButton.addActionListener(this);
        panel.add(autoLightsButton);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));

        reply2 = new JTextField("", 30);
        reply2.setEditable(false);
        panel.add(reply2);

        return panel;
    }

    private JPanel getAutoSignalJPanel() {

        JPanel panel = new JPanel();

        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

        JLabel label = new JLabel("Auto signal lights");
        panel.add(label);

        JButton autoSignalButton = new JButton("Signal Lights");
        autoSignalButton.addActionListener(this);
        panel.add(autoSignalButton);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));

        reply3 = new JTextField("", 30);
        reply3.setEditable(false);
        panel.add(reply3);

        return panel;
    }

    public static void main(String[] args) {
        trafficGUI gui = new trafficGUI();
        gui.build();
    }

    private void build() {
        JFrame frame = new JFrame("Traffic Services");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);

        panel.setLayout(boxlayout);
        panel.setBorder(new EmptyBorder(new Insets(50, 100, 50, 100)));

        panel.add(getEmergencyJPanel());
        panel.add(getAutoLightsJPanel());
        panel.add(getAutoSignalJPanel());

        frame.setSize(300, 300);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton)e.getSource();
        String label = button.getActionCommand();

        if(label.equals("Emergency Lights")) {
            System.out.println("Emergency lights are on.");

            ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
            TrafficLightsGrpc.TrafficLightsBlockingStub blockingStub = TrafficLightsGrpc.newBlockingStub(channel);
            emerTrafficOnRequest request = emerTrafficOnRequest.newBuilder().setEmergencyTraffic("The emergency lights on").build(); // Correct request
            emerTrafficOnReply response = blockingStub.emergencyTraffic(request);

            reply1.setText(String.valueOf(response.getEmergencyTraffic()));

        } else if (label.equals("Street Lights")) {
            System.out.println("Traffic streets lights are on.");

            ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
            TrafficLightsGrpc.TrafficLightsBlockingStub blockingStub = TrafficLightsGrpc.newBlockingStub(channel);
            autoOnRequest request = autoOnRequest.newBuilder().setAutoTraffic("Street lights turned on").build();
            autoOnReply response = blockingStub.autoTrafficL(request);

            reply2.setText(String.valueOf(response.getAutoTraffic()));

        } else if (label.equals("Signal Lights")) {
            System.out.println("Traffic signal lights are on.");

            ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
            TrafficLightsGrpc.TrafficLightsBlockingStub blockingStub = TrafficLightsGrpc.newBlockingStub(channel);
            signalsRequest request = signalsRequest.newBuilder().setAutoSignals("Signal lights turned on").build();
            signalsReply response = blockingStub.autoSignals(request);

            reply3.setText(String.valueOf(response.getAutoSignals()));

        }
    }
}