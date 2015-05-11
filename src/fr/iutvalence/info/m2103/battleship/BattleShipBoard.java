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
		
	}
	
	public String displayBoard()
	{
		String board="------------------------------------------------------- \n";
		for(int line = 0; line < NB_LINE_DEFAULT; line++)
		{
			for(int column = 0; column < NB_COLUMN_DEFAULT; column++)
			{
				if(new BoardSquare(line,column).isOccuped())
					board += "  x |";
				else
					board += "  o |";
			}
			board+= "\n-------------------------------------------------------\n";
		} 
		return board;
	}
	
}
