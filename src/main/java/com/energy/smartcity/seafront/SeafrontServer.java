package com.energy.smartcity.seafront;

import java.io.IOException;

import com.energy.smartcity.seafront.SeafrontLightsGrpc.SeafrontLightsImplBase;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class SeafrontServer extends SeafrontLightsImplBase {
    public static void main(String[] args) {
        SeafrontServer seaserver = new SeafrontServer();
        int port = 50051;

        Server server;
        try {
            server = ServerBuilder.forPort(port).addService(seaserver).build().start();
            System.out.println("Seafront server started...");
            server.awaitTermination();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
			e.printStackTrace();
		}
    }

    @Override
    public void seaLights(frontRequest req, StreamObserver<frontOnReply> responseObserver) {
        // TODO Auto-generated method stub
        System.out.println("--- Receiving Seafront lights turned on as requested by Client ---");

        // Logic code
        String mySeaF = "Preparing to turn the lights on, as schedule." + req.getSeafront();

        // Logic
        frontOnReply fReply = frontOnReply.newBuilder().setSeafrontReply(mySeaF).build();

        responseObserver.onNext(fReply);
        responseObserver.onCompleted();
    }

    @Override
    public void lifeguardStations(stationsRequest req, StreamObserver<stationsReply> responseObserver) {
        // TODO Auto-generated method stub
        System.out.println("--- Receiving Lifeguard stations turned on as requested by Client ---");

        // Logic code
        String myLifeS = "Lifeguard stations systems on. " + req.getLifeguards();

        // Logic
        stationsReply sReply = stationsReply.newBuilder().setLifeguardsReply(myLifeS).build();

        responseObserver.onNext(sReply);
        responseObserver.onCompleted();
    }

    @Override
    public void medical(rescuersRequest req, StreamObserver<rescuersReply> responseObserver) {
        // TODO Auto-generated method stub
        System.out.println("--- Receiving Medical rescuers turned on as requested by Client ---");

        // Logic code
        String myResc = "Systems turned on." + req.getMedicalRescuers(); // fix #3

        // Logic
        rescuersReply resReply = rescuersReply.newBuilder().setMedicalRescuersReply(myResc).build();

        responseObserver.onNext(resReply);
        responseObserver.onCompleted();
    }
}