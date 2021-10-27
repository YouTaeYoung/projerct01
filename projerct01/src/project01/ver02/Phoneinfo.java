package project01.ver02;

import java.util.Scanner;


public class Phoneinfo 
{
	String name; //이름
	String phoneNumber; //전화번호
	String birthday; // 생년월일
	//3개의 매개변수를 가진 생성자 
	public Phoneinfo(String name, String phoneNumber, String birthday)
	{
		
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
	}
	//2개의 매개변수를 가진 생성자 오버로딩 
	public Phoneinfo(String name, String phoneNumber)
	{
		
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = "입력되지않음";
	}
	
	public void  showPhoneInfo()
	{
		System.out.println("이름 : " +name);
		System.out.println("전화번호 : " +phoneNumber);
		System.out.println("생년월일 : " +birthday);
	}

	public void menuShow()
	
	{
		System.out.println("선택하시오.");
		System.out.println("1.입력" );
		System.out.println("2.프로그램종료");
	}
	public void addFriend(int choice)
	{
		Scanner  scanner = new Scanner(System.in);
		String iname,iphoneNumber,ibirthday;
		
		System.out.print("이름 : ");iname = scanner.nextLine();
		System.out.print("전화번호 : ");iphoneNumber = scanner.nextLine();
		System.out.print("생년월일 : ");ibirthday = scanner.nextLine();
		
		
	}
	
}
