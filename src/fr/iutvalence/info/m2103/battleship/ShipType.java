package fr.iutvalence.info.m2103.battleship;

public enum ShipType
{
	
	/**
	 * the aircraft carrier
	 */
	AIRCRAFT_CARRIER(5),
	/**
	 * the submarine
	 */
	submarine(3),
	/**
	 * the destroyer
	 */
	destroyer(2),
	/**
	 * the patrol boat
	 */
	patrolBoat(4),
	/**
	 * the cruiser
	 */
	cruiser(3);
	
	
	private final int size;
	
	private ShipType(int size)
	{
		this.size = size;
	}
	
	public int getSize()
	{
		return this.size;
	}
	
}
