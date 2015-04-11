package fr.iutvalence.info.m2103.battleship;

/**
 * @author khebibem
 * Class AircraftCarrier extending ship
 */
public class AircraftCarrier extends Ship
{
	/**
	 * The length of the aircraft carrier
	 */
	public final static int AIRCRAFT_CARRIER_LENGTH=5;
	
	/**
	 * AircraftCarrier Builder without parameters
	 */
	public AircraftCarrier()
	{
		super(getPosition(),AIRCRAFT_CARRIER_LENGTH,"Aircraft Carrier");
	}

}
