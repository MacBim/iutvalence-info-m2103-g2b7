package fr.iutvalence.info.m2103.battleship;

import org.omg.PortableInterceptor.INACTIVE;

/**
 * The ships of the game
 * @author Medy and Jean-Baptiste
 *
 */
public class Ship
{
	
	/**
	 * Position of the ship
	 */
	
	private Position frontShipPosition;
	
	private int orientation;
	
	private ShipType shipType;
	
	
	/**
	 * The ship constructor
	 */
	public Ship(ShipType shipType, Position f)
	{

	}

	/**
	 * allows to get the position of the ship
	 * @return position
	 */
	public Position getPosition()
	{
		return this.frontShipPosition;
	}

	/**
	 * allows to set a new position to the ship
	 * @param pos
	 */
	public void setPosition(int posX, int posY)
	{
		this.frontShipPosition.abscissa = posX;
		this.frontShipPosition.ordinate = posY;
	}
}
