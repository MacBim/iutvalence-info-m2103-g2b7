package fr.iutvalence.info.m2103.battleship;
/**
 * The BattleShipBoard class
 * @author Medy and Jean-Baptiste
 *
 */
public class BattleShipBoard
{
	/**
	 * default number of board lines
	 */
	public final static int NB_LINE_DEFAULT=11;
	
	/**
	 * default number of board columns
	 */
	public final static int NB_COLUMN_DEFAULT=11;
	
	/**
	 * The game board is defined as a two dimensions array
	 */
	private BoardSquare[][] playerBoard;
	
	
	/**
	 * Board constructor with 11 lines/columns
	 */
	public BattleShipBoard()
	{
		this.playerBoard= new BoardSquare[NB_LINE_DEFAULT][NB_COLUMN_DEFAULT];
		for(int line=0; line<NB_LINE_DEFAULT;line++)
		{
			for(int column=0; column<NB_COLUMN_DEFAULT; column++)
			{
				playerBoard[line][column] = new BoardSquare(line, column);
			}
		}
		
	}
	
	public String displayBoard()
	{
		String board="------------------------------------------------------- \n";
		for(int line = 0; line < NB_LINE_DEFAULT; line++)
		{
			for(int column = 0; column < NB_COLUMN_DEFAULT; column++)
			{
				if(playerBoard[line][column].isOccuped())
					board += "  x |";
				else
					board += "  o |";
			}
			board+= "\n-------------------------------------------------------\n";
		} 
		return board;
	}
	
	public void setAShip(ShipType shipType,int abscissa, int ordinate, boolean boatOrientation)
	{
		if(boatOrientation==Ship.VERTICAL_ORIENTATION)
		{
			for(int line=0; line< shipType.getSize(); line++)
			{
				playerBoard[abscissa-1][ordinate-1+line].setOccuped();
			}
		} 
		else
		{
			for(int column=0; column< shipType.getSize(); column++)
			{
				playerBoard[abscissa-1+column][ordinate-1].setOccuped();
			}
		}
	}
	public void test()
	{
		playerBoard[4][4].setOccuped();
	}
	
}
