package project01;

import java.util.Scanner;

import project01.ver04.PhoneBookManager;
import project01.ver04.Phoneinfo;

public class PhoneBookVer04
{
	
	public static void main(String[] args)
	{
		Scanner scan  = new Scanner(System.in);
		PhoneBookManager pho1 = new PhoneBookManager(100);
		while(true)
		{
			pho1.menuShow();
			int choice = scan.nextInt();
			scan.nextLine();
			switch(choice)
			{
			case 1:
				pho1.dataInput();
				break;
			case 2:
				pho1.dataSearch();
				break;
			case 3:
				pho1.dataDelete();
				break;
			case 4:
				pho1.dataAllShow();
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}
	}
}
