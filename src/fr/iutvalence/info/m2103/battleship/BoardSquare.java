package fr.iutvalence.info.m2103.battleship;
/**
 * the BoardSquare class
 * @author Medy and Jean-Baptiste
 */
public class BoardSquare
{
	/**
	 * line position attribute
	 */
	private int linePosition;
	
	/**
	 * column position attribute
	 */
	private int columnPosition;
	
	/**
	 * boolean which tells if there's a ship on the square
	 */
	private boolean isOccuped;
	/**
	 * boolean which tells if the shot didn't hit a ship
	 */
	private boolean isMissed;
	/**
	 * boolean which tells if the shoot touched a boat on the enemy board
	 */
	private boolean isTouched;
	
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
	 * The sqaure is now occuped by a ship
	 */
	public void setOccuped()
	{
		this.isOccuped=true;
	}
	/**
	 * The square is now free, there's no ship on it
	 */
	public void setFree()
	{
		this.isOccuped=false;
	}
	/**
	 * the square has been touched by a shot but there wasn't ships on it
	 */
	public void setTouched()
	{
		this.isTouched=true;
		this.isMissed=false;
	}
	/**
	 * There was a shot on this square but no ship on it
	 */
	public void setMissed()
	{
		this.isMissed=true;
		this.isTouched=false;
	}
	
	/**
	 * Return the shiptype who is on this square 
	 * @return this.shipType
	 */
	public ShipType getShipType()
	{
		return this.shipType;
	}
	/**
	 * define a shiptype to a square
	 * @param shipType
	 */
	public void setShipType(ShipType shipType)
	{
		this.shipType=shipType;
	}
	/**
	 * 
	 * @return this.isTouched
	 */
	public boolean isTouched()
	{
		return this.isTouched;
	}
	/**
	 * 
	 * @return this.isMissed
	 */
	public boolean isMissed()
	{
		return this.isMissed;
	}
}
