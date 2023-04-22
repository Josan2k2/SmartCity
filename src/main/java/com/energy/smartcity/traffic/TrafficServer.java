package com.energy.smartcity.traffic;

import java.io.IOException;

import com.energy.smartcity.traffic.TrafficLightsGrpc.TrafficLightsImplBase;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class TrafficServer extends TrafficLightsImplBase {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrafficServer trafficserver = new TrafficServer();
		int port = 50051;
		
		Server server;
		try {
			server = ServerBuilder.forPort(port).addService(trafficserver).build().start();
			System.out.println("Traffic server started...");
			server.awaitTermination();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void autoTrafficL(autoOnRequest request, StreamObserver<autoOnReply> responseObserver) {
		// TODO Auto-generated method stub
		System.out.println("--- Receiving automated traffic lights turned on as requested by Client ---");

        //Logic code
        String myAutoT = request.getAutoTraffic();

        //Logic
        autoOnReply autoReply = autoOnReply.newBuilder().setAutoTraffic(myAutoT).build();
        
        responseObserver.onNext(autoReply);
        responseObserver.onCompleted();
	}

	@Override
	public void emergencyTraffic(emerTrafficOnRequest request, StreamObserver<emerTrafficOnReply> responseObserver) {
		// TODO Auto-generated method stub
		System.out.println("--- Receiving emergency traffic lights turned on as requested by Client ---");

        //Logic code
        String myEmerT = request.getEmergencyTraffic();

        //Logic
        emerTrafficOnReply emerReply = emerTrafficOnReply.newBuilder().setEmergencyTraffic(myEmerT).build();
        
        responseObserver.onNext(emerReply);
        responseObserver.onCompleted();
	}

	@Override
	public void autoSignals(signalsRequest request, StreamObserver<signalsReply> responseObserver) {
		// TODO Auto-generated method stub
		System.out.println("--- Receiving traffic signals lights turned on as requested by Client ---");

        //Logic code
		String mySignal = request.getAutoSignals();
		
		//Logic
		signalsReply signalReply = signalsReply.newBuilder().setAutoSignals(mySignal).build();
		
		responseObserver.onNext(signalReply);
		responseObserver.onCompleted();
	}
}
