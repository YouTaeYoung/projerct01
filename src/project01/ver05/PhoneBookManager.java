package project01.ver05;

import java.util.Scanner;

public class PhoneBookManager
{
	//멤버변수 
	
	private Phoneinfo[] phon;

	private  int numOfFriends;
	
	
	//생성자
	public PhoneBookManager(int num)
	{
		
		phon = new Phoneinfo[num];
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
	public void dataInput()
	{
		int choice;
		System.out.println("데이터 입력을 시작합니다.");
		Scanner scan = new Scanner(System.in);
		String iName, iPhone , imajor, ihaknumber,icompany;
		System.out.println("1.일반 : 2.동창 : 3.회사 :");
		System.out.println("선택>>>");
		choice = scan.nextInt();
		scan.nextLine();
		
		
		
		if(choice == 1)
		{
			System.out.println("이름 : ");
			iName = scan.nextLine();
			System.out.println("전화번호 : ");
			iPhone = scan.nextLine();
			phon[numOfFriends++] = new Phoneinfo(iName,iPhone);
		}
		else if(choice == 2)
		{
			System.out.println("이름 : ");
			iName = scan.nextLine();
			System.out.println("전화번호 : ");
			iPhone = scan.nextLine();
			System.out.println("전공 : ");
			imajor = scan.nextLine();
			System.out.println("학년 : ");
			ihaknumber = scan.nextLine();
			phon[numOfFriends++] = new PhoneSchoolInfo(iName, iPhone, imajor, ihaknumber);
			
		}
		else if(choice == 3)
		{
			System.out.println("이름 : ");
			iName = scan.nextLine();
			System.out.println("전화번호 : ");
			iPhone = scan.nextLine();
			System.out.println("회사 : ");
			icompany = scan.nextLine();
			phon[numOfFriends++] = new PhoneCompanyInfo(iName, iPhone, icompany);
		}
		System.out.println("데이터입력이 완료되었습니다.");
	}
	//전체정보
	public void dataAllShow()
	{
		
		for(int i=0 ; i<numOfFriends; i++)
		{
			phon[i].showPhoneInfo();
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
			
			if(searchName.compareTo(phon[i].name)==0)
			{
				phon[i].showPhoneInfo();
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
			if(deleteName.compareTo(phon[i].name)==0)
			{
				phon[i] = null;
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
				phon[i] = phon[i+1];
			}
			System.out.println("데이터가 삭제 되었습니다.");
		}
	}
}


 