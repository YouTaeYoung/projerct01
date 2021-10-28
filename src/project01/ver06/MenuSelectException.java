package project01.ver06;

public class MenuSelectException extends Exception
{
	public MenuSelectException()
	{
		super("숫자는 1~5까지만 입력하세요");
	}
}
