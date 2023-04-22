package com.energy.smartcity.park;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.energy.smartcity.park.ParkLightsGrpc.ParkLightsImplBase;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class ParkServer extends ParkLightsImplBase {
	
	public static void main(String[] args) {
        ParkServer parkServer = new ParkServer();
        int port = 50051;

        Server server;
        try {
            server = ServerBuilder.forPort(port).addService(parkServer).build().start();
            System.out.println("Park server started...");
            server.awaitTermination();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void emergency(emergencyOnRequest request, StreamObserver<emergencyOnReply> responseObserver) {
        System.out.println("--- Receiving emergency lights turned on as requested by Client ---");

        //Logic of code
        String myEmergency = "Emergency lights on " + request.getEmergency();

        //Logic
        emergencyOnReply emerReply = emergencyOnReply.newBuilder().setEmergencyOn(myEmergency).build();

        responseObserver.onNext(emerReply);
        responseObserver.onCompleted();
    }

    @Override
    public void polesOn(polesOnRequest request, StreamObserver<polesOnReply> responseObserver) {
        System.out.println("--- Receiving park poles lights turned on as requested by Client ---");

        //Logic code
        String myPoles = "Park light poles on " + request.getPoles();

        //Logic
        polesOnReply polesReply = polesOnReply.newBuilder().setPolesOn(myPoles).build();

        responseObserver.onNext(polesReply);
        responseObserver.onCompleted();
    }

    @Override
    public void polesOff(polesOffRequest request, StreamObserver<polesOffReply> responseObserver) {
        System.out.println("--- Receiving park poles lights turned off as requested by Client ---");

        //Logic code
        String myPolesOff = "Park light poles off " + request.getPoles();

        //Logic
        polesOffReply polOffReply = polesOffReply.newBuilder().setPolesOff(myPolesOff).build();

        responseObserver.onNext(polOffReply);
        responseObserver.onCompleted();
    }
}
