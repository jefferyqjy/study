package java8.time;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class TimeTest {
	public static void main(String[] args) {
		LocalDateTime currentTime = LocalDateTime.now();
		System.out.println(currentTime);
		
		LocalTime date = LocalTime.parse("12:22:23");
		System.out.println(date);
		
		ZoneId currentZone = ZoneId.systemDefault();
		System.out.println("当期时区: " + currentZone);
	}
}
