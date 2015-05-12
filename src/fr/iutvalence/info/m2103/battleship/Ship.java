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
	
	/**
	 * the orientation of the ship
	 */
	private boolean orientation;
	
	/**
	 * The shiptype
	 */
	private ShipType shipType;
	
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
	 * @param posX
	 * @param posY
	 */
	public void setPosition(int posX, int posY)
	{
		this.frontShipPosition.abscissa = posX;
		this.frontShipPosition.ordinate = posY;
	}
}
