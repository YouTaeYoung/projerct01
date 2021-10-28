package project01;

import java.util.Scanner;

import project01.ver05.Menuitem;
import project01.ver05.PhoneBookManager;
import project01.ver05.Phoneinfo;
import project01.ver05.SubMenuitem;

public class PhoneBookVer5 implements Menuitem
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
			case ADD:
				pho1.dataInput();
				break;
			case SER:
				pho1.dataSearch();
				break;
			case DEL:
				pho1.dataDelete();
				break;
			case ALL:
				pho1.dataAllShow();
				break;
			case EXI:
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}
	}
}
