import java.util.*;

public class Player
{
	
	String playerName;
	
	Messages ms = new Messages();
	
	Scanner input = new Scanner(System.in);
	char character;

	Player(char character){
		this.character = character;
	}

	public void setPlayerName(String playerName)
	{
		this.playerName = playerName;
	}

	public String getPlayerName()
	{
		return playerName;
	}
	
	public char getChar()
	{
		return character;
	}
	
	public int setRow(){
		System.out.println(ms.getROW());
		return input.nextInt();
	}
	
	public int setCol(){
		
		System.out.println(ms.getCOL());
		return input.nextInt();
	}



}
