package fr.iutvalence.info.m2103.battleship;
/**
 * The BattleShipBoard class
 * @author Medy and Jean-Baptiste
 *
 */
public class BattleShipBoard
{
	public final static int NB_LINE_DEFAULT=11;
	public final static int NB_COLUMN_DEFAULT=11;
	
	private BoardSquare[][] playerBoard;
	
	
	/**
	 * Board constructor with 11 lines/columns
	 */
	public BattleShipBoard()
	{
		this.playerBoard= new BoardSquare[NB_LINE_DEFAULT][NB_COLUMN_DEFAULT];
	}
	
	public String toString()
	{
		String line;
		
		for(int nbLine=0;nbLine<=NB_LINE_DEFAULT;nbLine++)
		{
			
		}
		return null;
		
	}
}
