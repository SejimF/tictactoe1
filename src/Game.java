import java.util.*;

public class Game
{
	private int count = 0;
	Player p1 = new Player('X');
	Player p2 = new Player('O');
	
	Scanner input = new Scanner(System.in);
	
	Messages ms = new Messages();
	Board boar = new Board();
	
	
	
	public void rungame()
	{
		
		boolean chek = false;
		System.out.println(ms.getWELCOM());

		System.out.print("Enter the name of 1st player: "); p1.setPlayerName(input.next());
		System.out.println();
		System.out.print("Enter the name of 2nd player: "); p2.setPlayerName(input.next());

		
		while(true)
		{
			boar.print();
			while(!chek){
			System.out.println(p1.getPlayerName() + " Enter the row and the col"); chek = boar.setRowCol(p1.setRow(), p1.setCol(), p1.getChar());
			}chek = false;
			boar.checWin(p1);
			if(count == 9){System.out.println("Dice");}
			boar.print();
			while(!chek){
			System.out.println(p2.getPlayerName() + " Enter the row and the col"); chek = boar.setRowCol(p2.setRow(), p2.setCol(), p2.getChar());
			}chek = false;
			boar.checWin(p2);
			if(count == 9){System.out.println("Dice");}
		}
		
	}
	
	
	
	
}
