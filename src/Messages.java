public class Messages
{
	private static String WELCOM = "_-_-_-Welcom to the game TicTakToe-_-_-_ \n you need to enter row and column from 0 to 2";
	private static String  ROWCOL = "Enter R/C for row & colums" ;
	private static String ROW = "Enter the row from 0 to 2: ";
	private static String COL = "Enter the col from 0 to 2: ";
	private static String WIN = "We have a win from: ";
	private static String Dice = "We have a dice: ";


	

	public static String getWELCOM()
	{
		return WELCOM;
	}

	public static String getROWCOL()
	{
		return ROWCOL;
	}

	public static String getROW()
	{
		return ROW;
	}

	public static String getCOL()
	{
		return COL;
	}

	public static String getWIN(Player player)
	{
		return WIN + player.getPlayerName();
	}

	public static String getDice()
	{
		return Dice;
	}}
