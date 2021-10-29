package project01.ver07;

public class PhoneCompanyInfo extends Phoneinfo
{
	String company;

	public PhoneCompanyInfo(String name , String phoneNumber , String company)
	{
		super(name , phoneNumber);
		this.company = company;
	}
	@Override
	public void showPhoneInfo()
	{
		super.showPhoneInfo();
		System.out.println("회사 : " + company);
	}
	
}

