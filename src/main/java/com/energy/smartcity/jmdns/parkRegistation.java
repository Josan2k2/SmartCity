package com.energy.smartcity.jmdns;

import java.io.IOException;
import java.net.InetAddress;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import javax.swing.*;

public class parkRegistation {

	public static void main(String[] args) throws InterruptedException {
		try {
			//Create DNS instance
			JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
			
			//Register service
			ServiceInfo serviceinfo = ServiceInfo.create("_http._tcp.local.", "park", 8000, "path=index.html");
			jmdns.registerService(serviceinfo);
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
