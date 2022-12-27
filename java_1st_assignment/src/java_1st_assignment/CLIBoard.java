package java_1st_assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CLIBoard {

	static ArrayList<Post> articles = new ArrayList<>();

	static Scanner sc = new Scanner(System.in);

	static boolean board_onoff = true;

	public static void main(String[] args) {

		mainShow();
		listShow();
		while (board_onoff) {
			int selected_number = sc.nextInt();
			switch (selected_number) {

			case 1: // 글 목룍 보여주기
				readPostShow();
				listShow();
				break;
			case 2: // 글 등록하기
				doPost();
				mainShow();
				listShow();
				break;
			case 3: // 글 내용 확인하기
				readPost();
				listShow();
				break;
			case 4: // 글 삭제하기
				doPostRemove();
				break;
			case 0:
				System.out.println("게시판을 종료합니다.");
				board_onoff = false;
				break;
			}
		}

	}

	public static void mainShow() { // 최상단 목록
		System.out.println("==================");
		System.out.println("번호   제목   작성자   작성일");
		System.out.println("----------------------");
	}

	public static void listShow() { // 0~4 리스트 보여주기
		System.out.println("1. 목록 2. 등록 3. 내용 4. 삭제 0. 종료 >>");
	}

	public static void doPost() { // 글 등록
		System.out.println("제목, 내용, 작성자를 입력해주세요.");
		articles.add(new Post());
	}

	public static void doPostRemove() {

		System.out.println("삭제할 글 번호를 입력해주세요.");
		int remove_number = sc.nextInt();
		articles.remove(remove_number-1);
		System.out.println("글이 삭제되었습니다.");
	}

	public static void readPostShow() { // 글 목록을 불러옴+

		System.out.println("글번호 제목 내용 작성일시");
		int post_count = 1;
		
		if(articles == null) {
			System.out.println("글 내역이 없습니다.");
		}
		
		for (Iterator<Post> itr = articles.iterator(); itr.hasNext();) {

			System.out.print(post_count++ + " ");
			itr.next().postInformation();
		}

		System.out.println("글 목록을 읽어왔습니다.");
	}
	
	public static void readPost() {
		System.out.println("읽어올 글 번호를 입력해주세요");
		int read_post_number = sc.nextInt();
		articles.get(read_post_number-1).postContent();
	}
 
}