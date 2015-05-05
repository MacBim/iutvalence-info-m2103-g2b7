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
	private Position position;
	
	private Position frontShipPosition;
	
	private Position rearShipPosition;
	
	private ShipType shipType;
	
	
	/**
	 * The ship constructor
	 */
	public Ship(ShipType shipType, Position frontShipPosition, Position rearShipPosition)
	{
		if(rearShipPosition.abscissa == frontShipPosition.abscissa)
		{
			if(rearShipPosition.abscissa - frontShipPosition.abscissa != shipType.getSize())
				System.out.println("Invalid Ship size");
				
		} else if(rearShipPosition.ordinate == frontShipPosition.ordinate)
		{
			if(rearShipPosition.ordinate - frontShipPosition.ordinate != shipType.getSize())
				System.out.println("Invalid Ship size");
		} else if(rearShipPosition != frontShipPosition)
		{
			System.out.println("Invalid Ship Size");
		} else
		{
			this.shipType = shipType;
			this.frontShipPosition = frontShipPosition;
			this.rearShipPosition = rearShipPosition;
		}
	}

	/**
	 * allows to get the position of the ship
	 * @return position
	 */
	public Position getPosition()
	{
		return this.position;
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
