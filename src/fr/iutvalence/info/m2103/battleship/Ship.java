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
	public final static boolean HORIZONTAL_ORIENTATION = false;
	
	/**
	 * Constant of the vertical orientation of the boat
	 */
	public final static boolean VERTICAL_ORIENTATION = true;
	/**
	 * Position of the ship
	 */
	private Position frontShipPosition;
	
	/**
	 * the orientation of the ship
	 */
	private boolean orientation;
	
	/**
	 * The ship type
	 */
	private ShipType shipType;
	
	/**
	 * the state of the ship
	 */
	private StateOfTheShip stateOfTheShip;
	
	/**
	 * The constructor of the ship
	 * @param frontShipPosition The position of the front of the ship
	 * @param shipType The type of the ship
	 * @param orientation The orientation (horizontal/vertical) of the ship
	 * @param stateOfTheShip The state of the ship
	 */
	public Ship(Position frontShipPosition, ShipType shipType, boolean orientation)
	{
		this.shipType=shipType;
		this.orientation= orientation;
		this.stateOfTheShip=StateOfTheShip.isNotTouched;
		this.frontShipPosition=frontShipPosition;
	}
	/**
	 * allows to get the position of the ship
	 * @return position
	 */
	public Position getPosition()
	{
		return this.frontShipPosition;
	}
	
	public void setTouched()
	{
		this.stateOfTheShip= StateOfTheShip.isTouched;
	}
	public boolean isSinked()
	{
		if(this.orientation)
		{
			for(int abscissaIndex=0; abscissaIndex < this.shipType.getSize(); abscissaIndex++)
			{
				
			}
		}
	}

}
