package fr.iutvalence.info.m2103.battleship;

import java.security.cert.CertPathValidatorException.Reason;


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
	private final Position frontShipPosition;
	
	/**
	 * the orientation of the ship
	 */
	private boolean orientation;
	
	/**
	 * The ship type
	 */
	private final ShipType shipType;
	
	/**
	 * the state of the ship
	 */
	private StateOfTheShip stateOfTheShip;
	
	protected boolean[] isThereABoatHere;
	 
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
		this.frontShipPosition=frontShipPosition;
		
		//this.stateOfTheShip=StateOfTheShip.isNotTouched;
		
		for(int squareIndex=0; squareIndex<this.shipType.getSize(); squareIndex++)
		{
			this.isThereABoatHere[squareIndex]=true;
		}
	}
	
	/**
	 * allows to get the position of the ship
	 * @return position
	 */
	public Position getFrontPosition()
	{
		return this.frontShipPosition;
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean isSinked()
	{
		if(this.orientation)
		{
			for(int abscissaIndex=0; abscissaIndex < this.shipType.getSize(); abscissaIndex++)
			{
			//TODO	
			}
		}
		return false;
	}
	/**
	 * method which change the state of the ship to "Touched"
	 * @param square
	 */
	public void setTouched(int square)
	{
		this.isThereABoatHere[square] = false;
	}
	
	/**
	 * method which returns the orientation of the ship
	 * @return boolean
	 */
	public boolean getOrientation()
	{
		return this.orientation;
	}
	
	/**
	 * methods who tells if there's a ship in these coordinate
	 * @param abscissa
	 * @param ordinate
	 * @return
	 */
	public boolean isThereAShipHere(int abscissa, int ordinate)
	{
		Position shootPosition = new Position(abscissa,ordinate);
		
		if(shootPosition == this.frontShipPosition)
			return true;
		
		if(this.orientation)
		{
			Position rearShipPosition = new Position(abscissa,ordinate+this.shipType.getSize()-1);
			if(ordinate >= this.frontShipPosition.ordinate && ordinate <=rearShipPosition.ordinate)
			{
				return true;
			}
		}else
		{
			Position rearShipPosition = new Position(abscissa+this.shipType.getSize()-1,ordinate);
			if(abscissa >= this.frontShipPosition.abscissa && abscissa <=rearShipPosition.abscissa)
			{
				return true;
			}
			
		}
		return false;
	}
	/**
	 * Methods who return the type of the boat
	 * @return this.shipType
	 */
	 public ShipType getShipType()
	 {
		 return this.getShipType();
	 }


}
