package fr.iutvalence.info.m2103.battleship;

public class AircraftCarrier extends Ship
{
	public final static int NB_AIRCRAFT_CARRIER_SQUARE_OCCUPED=5;
	
	public AircraftCarrier()
	{
		this.nbOccupedSquare = NB_AIRCRAFT_CARRIER_SQUARE_OCCUPED;
		this.name="Aircraft Carrier";
	}

}
