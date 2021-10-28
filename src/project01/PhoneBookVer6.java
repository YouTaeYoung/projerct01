package project01;

import java.util.InputMismatchException;
import java.util.Scanner;

import project01.ver06.MenuSelectException;
import project01.ver06.Menuitem;
import project01.ver06.PhoneBookManager;
import project01.ver06.Phoneinfo;
import project01.ver06.SubMenuitem;

public class PhoneBookVer6 implements Menuitem
{
	
	public static void main(String[] args) throws MenuSelectException
	{
		Scanner scan  = new Scanner(System.in);
		PhoneBookManager pho1 = new PhoneBookManager(100);
				while(true)
				{
					pho1.menuShow();
					try
					{
						int choice = scan.nextInt();
						if(choice >= 1 && choice <= 5)
						{
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
						else
						{
							MenuSelectException mse = new MenuSelectException();
							throw mse;
						}
						return;
					}
					catch (InputMismatchException e) 
					{
						System.out.println("입력이 잘못됨");
						e.printStackTrace();
						System.exit(0);
					}
					catch (NullPointerException e) 
					{
						System.out.println("입력된것이 없음");
						e.printStackTrace();
					}
				}
	}
}

