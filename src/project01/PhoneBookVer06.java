package project01;

import java.util.InputMismatchException;
import java.util.Scanner;

import project01.ver06.Menuitem;
import project01.ver06.MenuSelectException;
import project01.ver06.PhoneBookManager;

public class PhoneBookVer06 implements Menuitem{
	
	public static void main(String[] args) throws MenuSelectException {
		//String name, String phoneNumber, String birthday
		PhoneBookManager pho1 = new PhoneBookManager(100);
		
		int choice = 0;
		
		while(true) {
			pho1.menuShow();
			try {
				
				Scanner scan = new Scanner(System.in);
				choice = scan.nextInt();
				
				if(choice >= 1 && choice <= 5) {
					
					switch (choice) {
					case ADD:
						pho1.dataInput(choice);
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
				}else {
					MenuSelectException menuSelectErr = new MenuSelectException("숫자1~5만 입력하세요");
					continue;
				} 
			}catch (InputMismatchException e) {				
				System.out.println("숫자를 입력하세요 ");
			}catch(NullPointerException e) {
				System.out.println("입력된값이 없습니다.");
			}
		}
	}
}
