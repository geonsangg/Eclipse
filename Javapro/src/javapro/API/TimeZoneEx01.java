package javapro.API;

import java.util.TimeZone;

public class TimeZoneEx01 {

	public static void main(String[] args) {
		String[] tZone = TimeZone.getAvailableIDs();
		for(int i=0; i<tZone.length; i++) {
			System.out.println(tZone[i]);
		}

	}

}
