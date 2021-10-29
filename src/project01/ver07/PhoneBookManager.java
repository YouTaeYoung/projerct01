package project01.ver07;

import java.awt.Image;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import project01.ver07.Phoneinfo;

public class PhoneBookManager implements SubMenuitem
{
	HashSet<Phoneinfo> phonBook = new HashSet<Phoneinfo>();
	private  int numOfFriends;
	
	public static void menuShow()
	{
		System.out.println("선택하시오.");
		System.out.println("1. 데이터 입력" );
		System.out.println("2. 데이터 검색");
		System.out.println("3. 데이터 삭제" );
		System.out.println("4. 주소록 출력" );
		System.out.println("5. 프로그램종료");
		System.out.println("선택 : ");
	}
	
	public PhoneBookManager(int num)
	{
		phonBook = new HashSet<Phoneinfo>();
		numOfFriends =0;
	}
	
	//새로운 친구 연락처 추가 
	public void dataInput(int choice)
	{
		System.out.println("데이터 입력을 시작합니다.");
		Scanner scan = new Scanner(System.in);
		
		String iName,iPhone, imajor, ihaknumber,icompany;
			
		System.out.println("분류를 선택하세요 .");
			System.out.println("1. 친구 , 2.동창 , 3.회사 ");
			System.out.print("선택:");
			choice = scan.nextInt();
			
			System.out.print("이름 : ");
			iName = scan.next();
			System.out.print("전화번호 : ");
			iPhone = scan.next();
			
			Phoneinfo pinfo = null;
			
			switch(choice)
			{
			case FRIEND:
				Phoneinfo friend= new Phoneinfo(iName, iPhone);
				pinfo = friend;
				break;
			case SCHOOL:
				System.out.print("전공 : ");
				imajor = scan.next();
				System.out.print("학년 : ");
				ihaknumber = scan.next();
				PhoneSchoolInfo school = new PhoneSchoolInfo(iName, iPhone, imajor, ihaknumber);
				pinfo = school;
				break;
			case COMPANY:
				System.out.println("회사이름 : ");
				icompany = scan.next();
				PhoneCompanyInfo company = new PhoneCompanyInfo(iName, iPhone, icompany);
				pinfo = company;
				break;
			}
			if(phonBook.add(pinfo)==false)
			{
				System.out.println("저장이 이미 되어있는 이름입니다.");
				System.out.println("덮어쓰시겠습니까? Y(y)/N(n)");
				
				scan.nextLine();
				String ename = scan.nextLine();
				
				if(ename.equals("Y")  || ename.equals("y"))
				{
					phonBook.remove(pinfo);
					phonBook.add(pinfo);
					System.out.println("덮어쓰기완료");
				}
				else if(ename.equals("N") || ename.equals("n"))
				{
					System.out.println("중복 저장 하지않습니다.");
				}
			}
	}			
			
			
	

	//주소록 검색
	public void dataSearch()
	{
		boolean isFind = false;
		Scanner scan = new Scanner(System.in);
		System.out.print("검색할 이름을 입력하세요 : ");
		String searchDate = scan.nextLine();
		Iterator<Phoneinfo> ite = phonBook.iterator();
		while(ite.hasNext())
		{
			Phoneinfo phonei = ite.next();
			if(searchDate.compareTo(phonei.name)==0)
			{
				System.out.println("검색중입니다.");
				phonei.showPhoneInfo();
				
				isFind = true;
			}
		}
		if(isFind==false)
			System.out.println(" ### ### ### 찾는 정보가 없습니다. ### ### ###");
	}
	//주소록 삭제
	public void dataDelete()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("삭제할 이름을 입력해주세요 : ");
		String delDate = scan.nextLine();
		int delDateIndex = -1;
		for(Phoneinfo id : phonBook)
		{
			if(delDate.compareTo(id.name)==0)
			{
				phonBook.remove(id);
				delDateIndex = 1;
				System.out.println(" ## ## ## 데이터가 삭제 완료되었습니다. ## ## ##");
				break;
			}
		}
		if(delDateIndex== -1)
		{
			System.out.println(" ## ## ## 삭제된 데이터가 없습니다. ## ## ##");
		}
		
	}
	//전체정보
	public void dataAllShow()
	{
		Iterator<Phoneinfo> ite = phonBook.iterator();
		while(ite.hasNext())
		{
			Phoneinfo p = ite.next();
			p.showPhoneInfo();
		}
		System.out.println("전체출력완료");
	}
}


 