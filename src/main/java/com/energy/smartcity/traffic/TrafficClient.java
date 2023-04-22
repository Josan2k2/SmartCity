package com.energy.smartcity.traffic;

import com.energy.smartcity.traffic.TrafficLightsGrpc.TrafficLightsBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class TrafficClient {
	public static void main(String[] args) {
		String host = "localhost";
		int port = 50051;
		
		ManagedChannel traffichannel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
		
		TrafficLightsBlockingStub trafficblockingstub = TrafficLightsGrpc.newBlockingStub(traffichannel);
		
		autoOnRequest autorequest = autoOnRequest.newBuilder().setAutoTraffic("Automated lights on").build();
		emerTrafficOnRequest emergrequest = emerTrafficOnRequest.newBuilder().setEmergencyTraffic("Emergency lights on").build();
		signalsRequest signrequest = signalsRequest.newBuilder().setAutoSignals("").build();
		
		autoOnReply autoreply = trafficblockingstub.autoTrafficL(autorequest);
		emerTrafficOnReply emertraff = trafficblockingstub.emergencyTraffic(emergrequest);
		signalsReply signreply = trafficblockingstub.autoSignals(signrequest);
		
		System.out.println("Automating the traffic ligths, " + autoreply.getAutoTraffic());
		System.out.println("The emergency traffic lights need to be on, " + emertraff.getEmergencyTraffic());
		System.out.println("Automating the street and traffic signals on, " + signreply.getAutoSignals());
	}
}