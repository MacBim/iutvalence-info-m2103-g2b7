package fr.iutvalence.info.m2103.battleship;

/**
 * The ships of the game
 * @author Medy and Jean-Baptiste
 *
 */
public abstract class Ship
{
	private static Position position;
	
	/**
	 * The length of the ship
	 */
	protected int length;
	
	/**
	 * the name of the ship
	 */
	protected String name;
		
	/**
	 * The ship constructor
	 */
	public Ship(Position pos, int length, String name)
	{
		this.setPosition(pos);
		this.length = length;
		this.name = name;
	}

	/**
	 * allows to get the position of the ship
	 * @return position
	 */
	public static Position getPosition()
	{
		return position;
	}

	/**
	 * allows to set a new position to the ship
	 * @param pos
	 */
	public void setPosition(Position pos)
	{
		this.position = pos;
	}
}
