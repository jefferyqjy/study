package java8.time;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class TimeTest {
	public static void main(String[] args) {
		LocalDateTime currentTime = LocalDateTime.now();
		System.out.println(currentTime);
		
		LocalDateTime date = LocalDateTime.parse(currentTime.toString());
		System.out.println(date);
		
		ZoneId currentZone = ZoneId.systemDefault();
		System.out.println("当期时区: " + currentZone);
	}
}
