package fr.iutvalence.info.m2103.battleship;


/**
 * The ships of the game
 * @author Medy and Jean-Baptiste
 *
 */
public class Ship
{
	/**
	 * Constant of the horizontal orientation of the boat
	 */
	protected final static boolean HORIZONTAL_ORIENTATION=false;
	
	/**
	 * Constant of the vertical orientation of the boat
	 */
	protected final static boolean VERTICAL_ORIENTATION=true;
	/**
	 * Position of the ship
	 */
	private Position frontShipPosition;
	
	private boolean orientation;
	
	private ShipType shipType;
	
	
	/**
	 * The ship constructor
	 */


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
