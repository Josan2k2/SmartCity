package com.energy.smartcity.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.border.EmptyBorder;
import javax.swing.*;

import io.grpc.*;

import com.energy.smartcity.park.*;

public class parkGUI implements ActionListener {
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
    private JPanel getPolesOnJPanel() {

        JPanel panel = new JPanel();

        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

        JLabel label = new JLabel("Poles services");
        panel.add(label);


        JButton polesOnButton = new JButton("ON");
        polesOnButton.addActionListener(this);
        panel.add(polesOnButton);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));

        reply2 = new JTextField("", 30);
        reply2.setEditable(false);
        panel.add(reply2);

        return panel;

    }
    private JPanel getPolesOffJPanel() {

        JPanel panel = new JPanel();

        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

        JLabel label = new JLabel("Poles lights");
        panel.add(label);

        JButton polesOffButton = new JButton("OFF");
        polesOffButton.addActionListener(this);
        panel.add(polesOffButton);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));

        reply3 = new JTextField("", 30);
        reply3.setEditable(false);
        panel.add(reply3);

        return panel;
    }

    public static void main(String[] args) {
        parkGUI gui = new parkGUI();
        gui.build();
    }

    private void build() {
        JFrame frame = new JFrame("Park Services");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //set the panel buttons
        JPanel panel = new JPanel();

        //set the BoxLayout to be X_Axis: from left to right
        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);

        panel.setLayout(boxlayout);

        //set border for the panel
        panel.setBorder(new EmptyBorder(new Insets(50, 100, 50, 100)));

        panel.add(getEmergencyJPanel());
        panel.add(getPolesOnJPanel());
        panel.add(getPolesOffJPanel());

        //set size for the frame
        frame.setSize(300, 300);

        //set the window to be visible as the default to be false
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
            ParkLightsGrpc.ParkLightsBlockingStub blockingstub = ParkLightsGrpc.newBlockingStub(channel);
            emergencyOnRequest request = emergencyOnRequest.newBuilder().setEmergency("Turn the emergency lights on").build(); // Fix request
            emergencyOnReply response = blockingstub.emergency(request);

            reply1.setText(String.valueOf(response.getEmergencyOn()));

        } else if (label.equals("ON")) {
            System.out.println("Poles lights are on. ");

            ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
            ParkLightsGrpc.ParkLightsBlockingStub blockingstub = ParkLightsGrpc.newBlockingStub(channel);
            polesOnRequest request = polesOnRequest.newBuilder().setPoles("Turn the poles lights on").build(); // Fix request
            polesOnReply response = blockingstub.polesOn(request);

            reply2.setText(String.valueOf(response.getPolesOn()));

        } else if (label.equals("OFF")) {
            System.out.println("Poles lights are off.");

            ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
            ParkLightsGrpc.ParkLightsBlockingStub blockingstub = ParkLightsGrpc.newBlockingStub(channel);
            polesOffRequest request = polesOffRequest.newBuilder().setPoles("Turn the poles lights off").build(); // Fix request
            polesOffReply response = blockingstub.polesOff(request);

            reply3.setText(String.valueOf(response.getPolesOff()));

        }
    }
}