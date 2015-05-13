package fr.iutvalence.info.m2103.battleship;
/**
 * The BattleShipBoard class
 * @author Medy and Jean-Baptiste
 *
 */
public class BattleShipBoard
{
	/**
	 * default number of board lines
	 */
	public final static int NB_LINE_DEFAULT=11;
	
	/**
	 * default number of board columns
	 */
	public final static int NB_COLUMN_DEFAULT=11;
	
	/**
	 * Array of ships
	 */
	private Ship[] shipArray;
	
	/**
	 * constructor of the ship array
	 */
	public BattleShipBoard()
	{
		this.shipArray= new Ship[5];	
	}
	
//	/**
//	 * Method who displays the board
//	 */
//	public void displayBoard()
//	{
//		String bottomBoard="--1----2---3----4----5----6----7----8----9----10---11--\n";
//		String topBoard="--1----2---3----4----5----6----7----8----9----10---11--\n";
//		
//		for(int line = 0; line < NB_LINE_DEFAULT; line++)
//		{
//			for(int column = 0; column < NB_COLUMN_DEFAULT; column++)
//			{
//				if(this.topPlayerBoard[line][column].isTouched())
//				{
//					topBoard+="  X |";
//				}
//				else if(this.topPlayerBoard[line][column].isMissed())
//				{
//					topBoard+="  O |";
//				}
//				else
//				{
//					topBoard +="    |";
//				}
//			}
//			topBoard+= "\n-------------------------------------------------------\n";
//		}
//		for(int line = 0; line < NB_LINE_DEFAULT; line++)
//		{
//			for(int column = 0; column < NB_COLUMN_DEFAULT; column++)
//			{
//				if(this.bottomPlayerBoard[line][column].isOccuped())
//				{
//					if(this.bottomPlayerBoard[line][column].getShipType()==ShipType.submarine)
//					{
//						bottomBoard+=" SUB|";
//					}
//					else if(this.bottomPlayerBoard[line][column].getShipType()==ShipType.AIRCRAFT_CARRIER)
//					{
//						bottomBoard+=" A C|";
//					}
//					else if(this.bottomPlayerBoard[line][column].getShipType()==ShipType.destroyer)
//					{
//						bottomBoard+=" DES|";
//					}
//					else if(this.bottomPlayerBoard[line][column].getShipType()==ShipType.cruiser)
//					{
//						bottomBoard+=" CRU|";
//					}
//					else if(this.bottomPlayerBoard[line][column].getShipType()==ShipType.patrolBoat)
//					{
//						bottomBoard+=" PB |";
//					}
//				} else
//				{
//					bottomBoard+="    |";
//				}
//			}
//			bottomBoard+= "\n-------------------------------------------------------\n";
//		} 
//		System.out.println(topBoard);
//		System.out.println(bottomBoard);
//
	/**
	 * Method who puts a ship in the board
	 * @param shipType The type of the ship
	 * @param abscissa The abscissa coordinate of the front of the ship
	 * @param ordinate The ordinate coordinate of the front of the ship
	 * @param orientation The orientation of the ship
	 */
	public void putAShip(ShipType shipType, int abscissa, int ordinate,boolean orientation)
	{	
		Position frontShipPosition = new Position(abscissa,ordinate);
		Ship ship = new Ship(frontShipPosition,shipType,orientation);
	}
	/**
	 * reset the square of the board by erasing all the ships of the board
	 */
	public void resetBoard()
	{
		for(int shipIndex = 0; shipIndex < 5; shipIndex++)
		{
			this.shipArray[shipIndex] = null;
		}
	}
	
	/**
	 * shoot on the boat of the ennemy if there is one.
	 * @param abscissa
	 * @param ordinate
	 */
	public void shoot(int abscissa, int ordinate)
	{
		Position coordinateOfShoot = new Position(abscissa, ordinate);
		for(int shipIndex = 0; shipIndex < 5; shipIndex++)
		{
			if(shipArray[shipIndex].getPosition() == coordinateOfShoot)
			{
				shipArray[shipIndex].setTouched();
			}
		}
	}
	
}
