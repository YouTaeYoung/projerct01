package project01;

import project01.ver03.Phoneinfo;

public class PhoneBookVer03
{
	public static void main(String[] args)
	{
		Phoneinfo pi1 = new Phoneinfo("유비", "010-1111-1111", "1980-10-10");
		pi1.showPhoneInfo();
		
		Phoneinfo pi2 = new Phoneinfo("손오공", "010-2222-2222");
		pi2.showPhoneInfo();
		Phoneinfo pi3 = new Phoneinfo();
		pi3.addFriend(0);
	}
}
