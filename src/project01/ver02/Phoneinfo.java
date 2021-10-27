package project01.ver02;

import java.util.Scanner;


public class Phoneinfo 
{
	String name; //이름
	String phoneNumber; //전화번호
	String birthday; // 생년월일

	public Phoneinfo()
	{
		super();
	}
	
	public Phoneinfo(String name, String phoneNumber,String birthday)
	{
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
	}
	
	public Phoneinfo(String name, String phoneNumber)
	{
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
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
		System.out.println("생년월일 : ");
		ibirthday = scanner.nextLine();
		
	}
	public void menuShow()
	{
		System.out.println("선택하시오.");
		System.out.println("1. 데이터 입력" );
		System.out.println("2. 프로그램종료");
		System.out.println("선택 : ");
	}
	public void addFriend(int choice)
	{
		Scanner scanner = new Scanner(System.in);
		

		while(true) {
			menuShow();
			choice = scanner.nextInt();
			switch(choice)
			{
			case 1:
				
				break;
			case 2:
				System.out.println("프로그램종료");
				return; 
			}
		}
	}

}
