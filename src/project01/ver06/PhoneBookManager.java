package project01.ver06;

import java.util.Scanner;

import project01.ver06.PhoneCompanyInfo;
import project01.ver06.PhoneSchoolInfo;
import project01.ver06.Phoneinfo;

public class PhoneBookManager implements SubMenuitem
{
	//멤버변수 
	
	private Phoneinfo[] phonBook;

	private  int numOfFriends;
	
	
	//생성자
	public PhoneBookManager(int num)
	{
		
		phonBook = new Phoneinfo[num];
		numOfFriends = 0;
	}
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
		switch(choice)
		{
		case FRIEND:
			
			phonBook[numOfFriends++] = new Phoneinfo(iName, iPhone);
			break;
		case SCHOOL:
			System.out.print("전공 : ");
			imajor = scan.next();
			System.out.print("학년 : ");
			ihaknumber = scan.next();
			 phonBook[numOfFriends++] = new PhoneSchoolInfo(iName, iPhone, imajor,ihaknumber);
			break;
		case COMPANY:
			System.out.println("회사이름 : ");
			icompany = scan.next();
			phonBook[numOfFriends++] = new PhoneCompanyInfo(iName, iPhone, icompany);
			break;
		}
			System.out.println("데이터입력이 완료되었습니다.");
	}
	//전체정보
	public void dataAllShow()
	{
		
		for(int i=0 ; i<numOfFriends; i++)
		{
			phonBook[i].showPhoneInfo();
		}
		System.out.println("==전체정보가 출력되었습니다.==");
	}
	//주소록 검색
	public void dataSearch()
	{
		boolean isFind = false; 
		Scanner scanner = new Scanner(System.in);
		System.out.print("데이터 검색을 시작합니다\n ");
		System.out.println("이름 : ");   
		String searchName = scanner.nextLine();
		
		
		for(int i = 0 ; i<numOfFriends; i++)
		{
			
			if(searchName.compareTo(phonBook[i].name)==0)
			{
				phonBook[i].showPhoneInfo();
				System.out.println("검색이 완료 되었습니다.");
				isFind = true;
			}
		}
		if(isFind==false)
			System.out.println("****찾는 정보가 없습니다.****");
	}
	//주소록 삭제
	public void dataDelete()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("데이터  삭제를 시작합니다\n");
		System.out.println("이름 : ");
		String deleteName = scan.nextLine();
		
		int deleteIndex= -1;
		
		for(int i=0 ; i<numOfFriends; i++)
		{ 
			if(deleteName.compareTo(phonBook[i].name)==0)
			{
				phonBook[i] = null;
				deleteIndex = i ;
				numOfFriends--;
				break;
			}
		}
		if(deleteIndex ==-1) 
		{
			System.out.println("==삭제된 데이터가 없습니다==");
		}
		else
		{
			for(int i = deleteIndex ; i < numOfFriends; i++)
			{
				phonBook[i] = phonBook[i+1];
			}
			System.out.println("데이터가 삭제 되었습니다.");
		}
	}
}


 