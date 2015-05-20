package fr.iutvalence.info.m2103.battleship;

/**The shypType class
 * @author khebibem
 *
 */
public enum ShipType
{
	
	/**
	 * the aircraft carrier
	 */
	aircraft_carrier(5),
	/**
	 * the patrol boat
	 */
	patrolBoat(4),
	/**
	 * the submarine
	 */
	submarine(3),
	/**
	 * the cruiser
	 */
	cruiser(3),
	/**
	 * the destroyer
	 */
	destroyer(2);


	
	/**
	 * the size of the ship
	 */
	private final int size;
	
	/**
	 * The constructor of shiptype
	 * @param size
	 */
	private ShipType(int size)
	{
		this.size = size;
	}
	
	/**
	 * The getter of the size of the ship
	 * @return size
	 */
	public int getSize()
	{
		return this.size;
	}
	
}
