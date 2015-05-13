package fr.iutvalence.info.m2103.battleship;

/**
 * the class Position
 * @author mercieje
 */
public class Position
{
	/**
	 * the abscissa of the ship
	 */
	public int abscissa;
	/**
	 * the ordinate of the ship
	 */
	public int ordinate;

	/**
	 * the default constructor of a position
	 */
	public Position() 
	{
		this.abscissa = 0;
		this.ordinate = 0;
	}
	
	/**
	 * the constructor of a position with two parameters
	 * @param x
	 * @param y
	 */
	public Position(int x, int y) 
	{
		this.abscissa = x;
		this.ordinate = y;
	}

	/**
	 * allows to get the abscissa of the ship
	 * @return abscissa
	 */
	public int getAbscissa() 
	{
		return abscissa;
	}


	/**
	 * allows to get the ordinate of the ship
	 * @return ordinate
	 */
	public int getOrdinate() 
	{
		return ordinate;
	}
	

}