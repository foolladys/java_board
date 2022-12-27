package java_1st_assignment;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class untitledTest {

	public static void main(String[] args) {

		LocalDateTime date = LocalDateTime.now();

		System.out.println(date);
		
		String formatedNow = date.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 hh시 mm분 ss초"));
		
		System.out.println(formatedNow); 
	}
}
