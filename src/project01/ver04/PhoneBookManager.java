package project01.ver04;

import java.util.Scanner;

public class PhoneBookManager
{
	//멤버변수
	String name;
	String phone;
	
	
	//생성자
	public PhoneBookManager()
	{
		super();
	}
	public PhoneBookManager(String name, String phone)
	{
		this.name = name;// 이름
		this.phone = phone; // 전화번호 
		
	}
	public void dataAllShow()
	{
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phone);
	}
	
	public void showBasicInfo() {}
}


class PhoneBookInfoHandler
{
	//멤버변수 
	
	private PhoneBookManager[] myFriends;

	private  int numOfFriends;
	
	//생성자
	public PhoneBookInfoHandler(int num)
	{
		
		myFriends = new PhoneBookManager[num];
		
		numOfFriends = 0;
	}
	//새로운 친구 연락처 추가 
	public void dataInput(int choice)
	{
		
		Scanner scan = new Scanner(System.in);
		String iName,iPhone, imajor,ihaknumber;
		
		System.out.print("이름 :");
		iName = scan.nextLine();
		System.out.print("전화번호 : "); 
		iPhone = scan.nextLine();
		
		
		myFriends[numOfFriends++] = new PhoneBookManager(iName, iPhone);
		System.out.println("입력이 완료되었습니다.");
		
		if(choice == 2)
			System.out.println("전공 : ");
			imajor = scan.nextLine();
			System.out.println("학년 : ");
			ihaknumber = scan.nextLine();
		
		
	}
	
	public void dataAllShow()
	{
		for(int i=0 ; i<numOfFriends; i++)
		{
			myFriends[i].dataAllShow();
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
			
			if(searchName.compareTo(myFriends[i].name)==0)
			{
				myFriends[i].dataAllShow();
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
			if(deleteName.compareTo(myFriends[i].name)==0)
			{
				myFriends[i] = null;
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
				myFriends[i] = myFriends[i+1];
			}
			System.out.println("데이터가 삭제 되었습니다.");
		}
	}
}
