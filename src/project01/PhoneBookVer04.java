package project01;

import project01.ver04.Phoneinfo;

public class PhoneBookVer04
{
	public static void main(String[] args)
	{
		Phoneinfo pi1 = new Phoneinfo("유비", "010-1111-1111");
		pi1.showPhoneInfo();
		Phoneinfo pi2 = new Phoneinfo("손오공", "010-2222-2222");
		pi2.showPhoneInfo();
		Phoneinfo pi3 = new Phoneinfo();
		pi3.addFriend(0);
		
		
		
	}
}
