import java.util.*;

public class Board
{

	char [][] board = new char[5][5];
	private int count = 1;

	Board(){
	
		
		for(int i = 0; i < board.length; i++)
		{
			for(int b = 0; b < board.length; b++){
				
				board[i][b] = '-';
				
			}
		}
	}


	public void print()
	{

		for(int i = 0; i < board.length; i++)
		{
			for(int b = 0; b < board.length; b++)
			{
				if((i%2) == 1)
				{
					board[i][b] = '#';
					System.out.print(board[i][b]);
				}else if((b%2) == 1)
				{
					board[i][b] = '#';
					System.out.print(board[i][b]);
				}else
				
				System.out.print(board[i][b]);

			}System.out.println();

		}
	}

	public boolean chekWinRow(Player player)
	{
		for(int r = 0; r < board.length - 2; r=+2)
		{
			if(board[r][0] == 'X' && board[r][2] == 'X' && board[r][4] == 'X' ||
				board[r][0] == 'O' && board[r][2] == 'O' && board[r][4] == 'O')
				{
					System.out.println("We have a winer! \n "+ player.getPlayerName() + " is the Winer!"); return true;
				} return false;
		}
		return false;
	}
	
	public boolean chekWinCol(Player player)
	{
		for(int c = 0; c < board.length - 2; c=+2)
		{
			if(board[0][c] == 'X' && board[2][c] == 'X' && board[4][c] == 'X' ||
			   board[0][c] == 'O' && board[2][c] == 'O' && board[4][c] == 'O')
			{
				System.out.println("We have a winer! \n " + player.getPlayerName() + " is the winner"); return true;
			} else return false;
		}
		return false;
	}
	
	public boolean checDiagonalsR(Player player)
	{
		
		if(board[0][0] == 'X' && board[2][2] == 'X' && board[4][4] == 'X' ||
		board[0][0] == 'O' && board[2][2] == 'O' && board[4][4] == 'O'){
			System.out.println("We have winner! \n" + player.getPlayerName() + " is the winner");
			return true;
		}else return false;
	}
	
	public boolean checDiagonalL(Player player){
		
		if(board[4][0] == 'X' && board[3][2] == 'X' && board[1][4] == 'X' ||
		   board[4][0] == 'O' && board[3][2] == 'O' && board[1][4] == 'O'){
			System.out.println("We have winner! \n" + player.getPlayerName() + " is the winner");
			return true;
		}else return false;
	}
	
	public boolean checWin(Player player)
	{
		
		if(chekWinRow(player))return true;
		if(chekWinCol(player)) return true;
		if(checDiagonalsR(player))return true;
		if(checDiagonalL(player))return true;
		
		return false;
	}
	
	
	
	/* Recursin for rows, cols and diagonals; to chek winning condition
	*  
	*		rows 0, 2, 4, 6, 8, 10 and so on...   r*2
	*		cols 0, 2, 4, 6, 8, 10 and so on...   c*2
	*		diagonal, 0,0 = 2,2 = 4,4 = 6,6 = 8,8 = 10,10 and so on... [r*2][c*2]
	*/


	public boolean setRowCol(int row, int col, char character){
		if(row >= 0 && row <= board.length / 2 && col >= 0 && col <= board.length / 2)
		{
			if( board[row*2][col*2] == '-' )
			{
			board[row*2][col*2] = character;
				return true;
			}else System.out.println("Row and col is ocupied.");
				return false;
		} else System.out.println("Enter corect value of row and col.");
			return false;
	}





}



/*   		X   |  X  | X  |
			00 01 02 03 04 05 X
*			10 11 12 13 14 15 ____
			20 21 22 23 24 25 X
			30 31 32 33 34 35 ____
			40 41 42 43 44 45 X
			50 51 52 53 54 55 ____
*
*
*/
