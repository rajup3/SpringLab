package com.rp3.util;

public class Util {
	
	private String getSessionID(String userID) {
		String time;
		String randomNo;
		String seqNo;
		
		time = "time";
		
		randomNo = String.valueOf((int) (Math.random() * 10000));
		seqNo = String.valueOf("serial_num");
		
		String sessionID = time + userID + randomNo + seqNo;
		
		return sessionID;
	}

}
