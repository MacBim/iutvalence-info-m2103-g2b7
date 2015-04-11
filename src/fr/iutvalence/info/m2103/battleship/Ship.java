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
	public Ship(Position pos, int l, String n)
	{
		this.setPosition(pos);
		this.length = l;
		this.name = n;
	}

	public static Position getPosition()
	{
		return position;
	}

	public void setPosition(Position pos)
	{
		this.position = pos;
	}
}
