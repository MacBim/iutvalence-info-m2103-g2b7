package fr.iutvalence.info.m2103.battleship;
/**
 * the BoardSquare class
 * @author Medy and Jean-Baptiste
 */
public class BoardSquare
{
	
	/**
	 * The shiptype
	 */
	private ShipType shipType;
	
	/**
	 * The boardsquare
	 * @param line
	 * @param column
	 */
	public BoardSquare(int line, int column)
	{
		this.linePosition = line;
		this.columnPosition = column;
	}
	
	/**
	 * Method who return true when there's a ship in this square
	 * @return boolean
	 */
	public boolean isOccuped()
	{
		if(isOccuped)
			return true;
		else
			return false;
	}
	
	/**
	 * Return the shiptype who is on this square 
	 * @return this.shipType
	 */
	public ShipType getShipType()
	{
		return this.shipType;
	}

}
