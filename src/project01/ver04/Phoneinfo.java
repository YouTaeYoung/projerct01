package project01.ver04;

import java.util.Scanner;


public class Phoneinfo 
{
	String name; //이름
	String phoneNumber; //전화번호
	
	
	public Phoneinfo()
	{
		super();
	}
	
	public Phoneinfo(String name, String phoneNumber,String major,int haknumber)
	{
		this.name = name;
		this.phoneNumber = phoneNumber;
		
		
	}
	
	public Phoneinfo(String name, String phoneNumber)
	{
		this.name = name;
		this.phoneNumber = phoneNumber;
		
	}
	public void  showPhoneInfo()
	{
		System.out.println("이름 : " +name);
		System.out.println("전화번호 : " +phoneNumber);
		
	}
	public void menuShow2(Scanner scanner)
	{
		String iname,iphoneNumber,ibirthday;
		System.out.print("이름 : "); 
		iname = scanner.nextLine();
		iname = scanner.nextLine();
		System.out.print("전화번호 : "); 
		iphoneNumber = scanner.nextLine();
		
	}
	public void menuShow()
	{
		System.out.println("선택하시오.");
		System.out.println("1. 데이터 입력" );
		System.out.println("2. 데이터 검색");
		System.out.println("3. 데이터 삭제" );
		System.out.println("4. 주소록 출력" );
		System.out.println("5. 프로그램종료");
		System.out.println("선택 : ");
	}
	public void menus()
	{
		System.out.println("1.일반");
		System.out.println("2.동창");
		System.out.println("3.회사");
	}
	public void addFriend(int choice)
	{
		Scanner scanner = new Scanner(System.in);
		PhoneBookInfoHandler handler = new PhoneBookInfoHandler(100);

		while(true) {
			menuShow();
			choice = scanner.nextInt();
			switch(choice)
			{
			case 1:
				handler.dataInput(choice);
				break;
			case 2:
				handler.dataSearch();
				break;
			case 3:
				handler.dataDelete();
				break;
			case 4:
				handler.dataAllShow();
				break;
			case 5:
				System.out.println("프로그램종료");
				return; 
			}
		}
	}
	
}
