package project01.ver04;

public class PhoneSchoolInfo extends Phoneinfo
{
	String major;
	int haknumber;
	public PhoneSchoolInfo(String name , String phoneNumber ,String major, int haknumber)
	{
		super(name , phoneNumber);
		this.major = major;
		this.haknumber = haknumber;
	}
	@Override
	public void showPhoneInfo()
	{
		super.showPhoneInfo();
		System.out.println("전공 : " + major);
		System.out.println("학년 : " + haknumber);
	}
	

}
