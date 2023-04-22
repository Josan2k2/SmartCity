package com.energy.smartcity.park;

import com.energy.smartcity.park.ParkLightsGrpc.ParkLightsBlockingStub;

import com.energy.smartcity.*;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class ParkClient {
	public static void main(String[] args) {
		String host = "localhost";
		int port = 50051;
		
		ManagedChannel parkchannel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
		
		ParkLightsBlockingStub blockingstub = ParkLightsGrpc.newBlockingStub(parkchannel);
		
		emergencyOnRequest emergrequest = emergencyOnRequest.newBuilder().setEmergency("Turn the emergency lights on").build();
		polesOnRequest polerequest = polesOnRequest.newBuilder().setPoles("Turn the poles lights on").build();
		polesOffRequest poleoffrequest = polesOffRequest.newBuilder().setPoles("Turn the poles lights off").build();
		
		emergencyOnReply emergreply = blockingstub.emergency(emergrequest);
		polesOnReply polereply = blockingstub.polesOn(polerequest);
		polesOffReply poleoffreply = blockingstub.polesOff(poleoffrequest);
		
		System.out.println("We have an emergency on the park. " + emergreply.getEmergencyOn());
		System.out.println("It's getting to dark on the park. " + polereply.getPolesOn());
		System.out.println("We are close to the sunrise. " + poleoffreply.getPolesOff());
	}

}
