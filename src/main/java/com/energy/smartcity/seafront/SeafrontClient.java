package com.energy.smartcity.seafront;

import com.energy.smartcity.seafront.SeafrontLightsGrpc.SeafrontLightsBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class SeafrontClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String host = "localhost";
		int port = 50051;
		
		ManagedChannel seachannel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
		
		SeafrontLightsBlockingStub seablockingstub = SeafrontLightsGrpc.newBlockingStub(seachannel);
		
		frontRequest frequest = frontRequest.newBuilder().setSeafront("").build();
		stationsRequest srequest = stationsRequest.newBuilder().setLifeguards("").build();
		rescuersRequest resrequest = rescuersRequest.newBuilder().setMedicalRescuers("").build();
		
		frontOnReply freply = seablockingstub.seaLights(frequest);
		stationsReply sreply = seablockingstub.lifeguardStations(srequest);
		rescuersReply resreply = seablockingstub.medical(resrequest);
		
		System.out.println("The seafront lights are schedule for 6:30pm. " + freply.getSeafrontReply());
		System.out.println("Turning the lifeguard stations systems on. " + sreply.getLifeguardsReply());
		System.out.println("Medical and rescuers systems must be on. " + resreply.getMedicalRescuersReply());
	}

}