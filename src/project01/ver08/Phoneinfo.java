package project01.ver08;


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
	
	public Phoneinfo(String name, String phoneNumber, String major , String haknumber)
	{
		super();
	}
	public Phoneinfo(String name, String phoneNumber, String company)
	{
		super();
		
	}
	
	
	public void  showPhoneInfo()
	{
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNumber);
		
	}
	@Override
	public boolean equals(Object obj)
	{
		Phoneinfo pio = (Phoneinfo)obj;
		if(pio.name.equals(this.name))
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
	}
	@Override
	public int hashCode()
	{
		
		return name.hashCode();
	}
}
