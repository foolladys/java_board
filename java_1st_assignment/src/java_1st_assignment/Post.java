package java_1st_assignment;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Post {
	String title;
	String content;
	String postWriter;
	String date;

	Scanner sc = new Scanner(System.in);

	public Post() { // 생성자

		System.out.print("제목 >");
		this.title = sc.nextLine();
		System.out.print("내용 >");
		this.content = sc.nextLine();
		System.out.print("작성자 >");
		this.postWriter = sc.nextLine();
		System.out.println("글이 등록되었습니다.");
		System.out.println("메인화면으로 돌아갑니다.");
		LocalDateTime time = LocalDateTime.now();
		date = time.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 hh시 mm분 ss초"));
	}

	public void postInformation() {
		System.out.println(title + " " + postWriter + " " + date);
	}

	public void postContent() {
		System.out.println("제목 : " + title);
		System.out.println("내용 : " + content);
		System.out.println("글쓴이 : " + postWriter);
		System.out.println("작성 시간 : " + date);
		System.out.println("글을 읽어왔습니다.");
	}

}
