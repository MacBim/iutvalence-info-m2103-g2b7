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
	
	public BoardSquare(int line, int column)
	{
		this.linePosition = line;
		this.columnPosition = column;
	}
	
	public boolean isOccuped()
	{
		if(isOccuped)
			return true;
		else
			return false;
	}
	public void setOccuped()
	{
		this.isOccuped=true;
	}
	public void setFree()
	{
		this.isOccuped=false;
	}
}
