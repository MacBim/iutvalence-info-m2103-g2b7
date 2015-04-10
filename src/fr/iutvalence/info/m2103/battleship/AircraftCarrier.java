package fr.iutvalence.info.m2103.battleship;

/**
 * @author khebibem
 * Aircraft Carrier Class
 */
public class AircraftCarrier extends Ship
{
	/**
	 * default number of occuped square by the aircraft carrier
	 */
	public final static int NB_AIRCRAFT_CARRIER_SQUARE_OCCUPED=5;
	
	/**
	 * AircraftCarrier Builder without parameters
	 */
	public AircraftCarrier()
	{
		this.nbOccupedSquare = NB_AIRCRAFT_CARRIER_SQUARE_OCCUPED;
		this.name="Aircraft Carrier";
	}

}
