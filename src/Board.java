import java.util.*;

public class Board
{

	char [][] board = new char[5][5];
	private int row =0;
	private int col= 0;

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
				if(i == 1 || i == 3)
				{
					board[i][b] = '#';
					System.out.print(board[i][b]);
				}else if(b == 1 || b == 3)
				{
					board[i][b] = '#';
					System.out.print(board[i][b]);
				}else System.out.print(board[i][b]);

			}System.out.println();

		}
	}

	public void chekWin()
	{

	}


	public void setRowCol(int row, int col){



	}





}



/*   		X   |  X  | X  |
			00 01 02 03 04 05 X
*			10 11+12 13+14 15 ____
			20 21 22 23 24 25 X
			30 31+32 33+34 35 ____
			40 41 42 43 44 45 X
			50 51 52 53 54 55 ____
*
*
*/
