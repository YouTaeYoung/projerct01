package project01.ver05;

public class Phoneinfo 
{
	String name; //이름
	String phoneNumber; //전화번호
	
	//2개의 매개변수를 가진 생성자
	public Phoneinfo(String name, String phoneNumber)
	{
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	public Phoneinfo(String name, String phoneNumber,String major, String haknumber, String company)
	{
		super();
		
	}
	
	public void  showPhoneInfo()
	{
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNumber);
		
	}
}
