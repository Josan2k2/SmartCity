package com.energy.smartcity.jmdns;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;

public class seafrontDiscovery {
	private static class seafrontListener implements ServiceListener{
		
		@Override
		public void serviceAdded(ServiceEvent event) {
			System.out.println("Service added: " + event.getInfo());
		}
		@Override
		public void serviceRemoved(ServiceEvent event) {
			System.out.println("Service removed: " + event.getInfo());
		}
		@Override
		public void serviceResolved(ServiceEvent event) {
			ServiceInfo info = event.getInfo();
			int port = info.getPort();
			String path = info.getNiceTextString().split("=")[1];
			GetRequest.request("http://localhost:"+port+"/"+path);
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		try {
			JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
			jmdns.addServiceListener("_http._tcp.local.", new seafrontListener());
		} catch (UnknownHostException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
