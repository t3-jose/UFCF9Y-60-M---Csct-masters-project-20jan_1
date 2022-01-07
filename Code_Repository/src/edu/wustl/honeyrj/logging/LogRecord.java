package edu.wustl.honeyrj.logging;

import java.net.InetAddress;
import java.util.Date;

public class LogRecord {
	private Date Timestamp;
	private InetAddress srcIP;
	private InetAddress dstIP;
	private int srcPort;
	private int dstPort;
	private String Packet;
	
	
	public String toString() {
		return Timestamp + "," + srcIP.getHostAddress() + ":" + srcPort + "," + dstIP.getHostAddress() + ":" + dstPort + "," + Packet; 
	}

	public void setTimestamp(Date timestamp) {
		this.Timestamp = timestamp;
	}

	public void setSrcIP(InetAddress srcIP) {
		this.srcIP = srcIP;
	}

	public void setDstIP(InetAddress dstIP) {
		this.dstIP = dstIP;
	}

	public void setSrcPort(int srcPort) {
		this.srcPort = srcPort;
	}

	public void setDstPort(int dstPort) {
		this.dstPort = dstPort;
	}

	public void setPacket(String packet) {
		this.Packet = packet;
	}
	
	
	
	
}
