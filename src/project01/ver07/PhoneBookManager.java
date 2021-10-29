package project01.ver07;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


public class PhoneBookManager
{
	//멤버변수 
	
	 HashSet<Phoneinfo>phon = new HashSet<Phoneinfo>();

	private  int numOfFriends;
	
	
	//생성자
	public PhoneBookManager(int num)
	{
		
		phon = new HashSet<Phoneinfo>();
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
		Phoneinfo pif =null;
		
			if(choice == 1)
			{
				System.out.println("이름 : ");
				iName = scan.nextLine();
				System.out.println("전화번호 : ");
				iPhone = scan.nextLine();
				Phoneinfo fpif = new Phoneinfo(iName, iPhone);
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
				Phoneinfo spif = new PhoneSchoolInfo(iName, iPhone, imajor, ihaknumber);
			}
			else if(choice == 3)
			{
				System.out.println("이름 : ");
				iName = scan.nextLine();
				System.out.println("전화번호 : ");
				iPhone = scan.nextLine();
				System.out.println("회사 : ");
				icompany = scan.nextLine();
				Phoneinfo cpif = new PhoneCompanyInfo(iName, iPhone, icompany);
			}
			System.out.println("데이터입력이 완료되었습니다.");
	}
	//전체정보
	public void dataAllShow()
	{
		for(Phoneinfo phonei : phon)
		{
			System.out.println(phonei.toString());
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
		Iterator<Phoneinfo> itr = phon.iterator();
			while(itr.hasNext())
			{
				Phoneinfo pifo = itr.next();
			if(searchName.equals(pifo.name))
			{
				System.out.println(pifo);
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
		
		for(Phoneinfo phonei : phon)
		{
			
			System.out.println(phon.remove(deleteName));
		}
	}
}


 