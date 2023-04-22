package com.energy.smartcity.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import io.grpc.*;
import com.energy.smartcity.seafront.*;
import com.energy.smartcity.seafront.SeafrontLightsGrpc.SeafrontLightsBlockingStub;

//Class name SeafrontGUI should follow camelCase convention and
//start with uppercase letter
public class seafrontGUI implements ActionListener {
    private JTextField reply1;
    private JTextField reply2;
    private JTextField reply3;

    private JPanel getSeaLightsJPanel() {
        JPanel panel = new JPanel();

        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

        JLabel label = new JLabel("Seafront Lights");
        panel.add(label);

        JButton lightButton = new JButton("Turn on");
        lightButton.addActionListener(this);
        panel.add(lightButton);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));

        reply1 = new JTextField("", 50);
        reply1.setEditable(false);
        panel.add(reply1);

        return panel;
    }

    private JPanel getLifeGJPanel() {

        JPanel panel = new JPanel();

        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

        JLabel label = new JLabel("Lifeguard stations");
        panel.add(label);

        JButton lifeButton = new JButton("Start lifeguard systems");
        lifeButton.addActionListener(this);
        panel.add(lifeButton);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));

        reply2 = new JTextField("", 50);
        reply2.setEditable(false);
        panel.add(reply2);

        return panel;
    }

    private JPanel getMedJPanel() {

        JPanel panel = new JPanel();

        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

        JLabel label = new JLabel("Medical rescuers stations");
        panel.add(label);

        JButton resButton = new JButton("Start medical systems");
        resButton.addActionListener(this);
        panel.add(resButton);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));

        reply3 = new JTextField("", 50);
        reply3.setEditable(false);
        panel.add(reply3);

        return panel;
    }

    //Class name SeafrontGUI should follow camelCase convention and
    //start with uppercase letter
    public static void main(String[] args) {
        seafrontGUI gui = new seafrontGUI();
        gui.build();
    }

    private void build() {
        JFrame frame = new JFrame("Seafront Services"); //missing space before (
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //set the panel buttons
        JPanel panel = new JPanel();

        //set the BoxLayout to be X_Axis: from left to right
        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);

        //set border for the panel
        panel.setBorder(new EmptyBorder(new Insets(50, 100, 50, 100)));

        panel.add(getSeaLightsJPanel());
        panel.add(getLifeGJPanel());
        panel.add(getMedJPanel());

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

        if(label.equals("Turn on")) {
            System.out.println("The seafront lights are on.");

            ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
            SeafrontLightsBlockingStub blockingstub = SeafrontLightsGrpc.newBlockingStub(channel);
            frontRequest request = frontRequest.newBuilder().setSeafront("Turn the seafront lights on!").build(); // fix request; class name should start with uppercase letter
            frontOnReply response = blockingstub.seaLights(request);

            reply1.setText(String.valueOf(response.getSeafrontReply()));
            
        } else if (label.equals("Start lifeguard systems")) {
            System.out.println("The lifeguard stations systems are connected.");

            ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
            SeafrontLightsBlockingStub blockingstub = SeafrontLightsGrpc.newBlockingStub(channel);
            stationsRequest request = stationsRequest.newBuilder().setLifeguards("Start lifeguard systems!").build();
            stationsReply response = blockingstub.lifeguardStations(request);

            reply2.setText(String.valueOf(response.getLifeguardsReply()));
            
        } else if (label.equals("Start medical systems")) {
        	System.out.println("The medical rescuers stations systems are connected.");

        	ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
        	SeafrontLightsBlockingStub blockingstub = SeafrontLightsGrpc.newBlockingStub(channel);
        	rescuersRequest request = rescuersRequest.newBuilder().setMedicalRescuers("Start medical systems!").build();
        	rescuersReply response = blockingstub.medical(request);

        	reply3.setText(String.valueOf(response.getMedicalRescuersReply()));
        }
    }
}