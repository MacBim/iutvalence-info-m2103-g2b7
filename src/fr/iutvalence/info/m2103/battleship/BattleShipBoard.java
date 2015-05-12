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
	 * The game board is defined as a two dimensions array
	 */
	private BoardSquare[][] bottomPlayerBoard;
	
	private BoardSquare[][] topPlayerBoard;
	
	/**
	 * two boards constructor with 11 lines/columns
	 * the bottom and the top board of the player 
	 */
	public BattleShipBoard()
	{
		this.bottomPlayerBoard= new BoardSquare[NB_LINE_DEFAULT][NB_COLUMN_DEFAULT];
		this.topPlayerBoard= new BoardSquare[NB_LINE_DEFAULT][NB_COLUMN_DEFAULT];
		for(int line=0; line<NB_LINE_DEFAULT;line++)
		{
			for(int column=0; column<NB_COLUMN_DEFAULT; column++)
			{
				bottomPlayerBoard[line][column] = new BoardSquare(line, column);
			}
		}
		for(int line=0; line<NB_LINE_DEFAULT;line++)
		{
			for(int column=0; column<NB_COLUMN_DEFAULT; column++)
			{
				topPlayerBoard[line][column] = new BoardSquare(line, column);
			}
		}
		
	}
	/**
	 * Method who displays the board
	 * @return board
	 */
	public void displayBoard()
	{
		String bottomBoard="------------------------------------------------------- \n";
		String topBoard="------------------------------------------------------- \n";
		
		for(int line = 0; line < NB_LINE_DEFAULT; line++)
		{
			for(int column = 0; column < NB_COLUMN_DEFAULT; column++)
			{
				if(topPlayerBoard[line][column].isTouched())
				{
					topBoard+="   X |";
				}
				else if(topPlayerBoard[line][column].isMissed())
				{
					topBoard+="  O |";
				}
				else
				{
					topBoard +="    |";
				}
			}
			topBoard+= "\n-------------------------------------------------------\n";
		}
		for(int line = 0; line < NB_LINE_DEFAULT; line++)
		{
			for(int column = 0; column < NB_COLUMN_DEFAULT; column++)
			{
				if(bottomPlayerBoard[line][column].isOccuped())
				{
					if(bottomPlayerBoard[line][column].getShipType()==ShipType.submarine)
					{
						bottomBoard+=" SUB|";
					}
					if(bottomPlayerBoard[line][column].getShipType()==ShipType.AIRCRAFT_CARRIER)
					{
						bottomBoard+=" A C|";
					}
					if(bottomPlayerBoard[line][column].getShipType()==ShipType.destroyer)
					{
						bottomBoard+=" DES|";
					}
					if(bottomPlayerBoard[line][column].getShipType()==ShipType.cruiser)
					{
						bottomBoard+=" CRU|";
					}
					if(bottomPlayerBoard[line][column].getShipType()==ShipType.patrolBoat)
					{
						bottomBoard+=" PB |";
					}
				} else
				{
					bottomBoard+="    |";
				}
			}
			bottomBoard+= "\n-------------------------------------------------------\n";
		} 
		System.out.println(topBoard);
		System.out.println(bottomBoard);
	}
	/**
	 * Method who put a ship in the board to some specific coordinate
	 * @param shipType
	 * @param abscissa
	 * @param ordinate
	 * @param boatOrientation
	 */
	public void setAShip(ShipType shipType,int abscissa, int ordinate, boolean boatOrientation)
	{
		if(boatOrientation==Ship.VERTICAL_ORIENTATION)
		{
			for(int line=0; line< shipType.getSize(); line++)
			{
				bottomPlayerBoard[abscissa-1][ordinate-1+line].setOccuped();
				bottomPlayerBoard[abscissa-1][ordinate-1+line].setShipType(shipType);
			}
		} 
		else
		{
			for(int column=0; column< shipType.getSize(); column++)
			{
				bottomPlayerBoard[abscissa-1+column][ordinate-1].setOccuped();
			}
		}
	}
	/**
	 * reset the square of the board by erasing all the ships of the board
	 */
	public void reset()
	{
		for(int line=0; line<NB_LINE_DEFAULT;line++)
		{
			for(int column=0; column<NB_COLUMN_DEFAULT; column++)
			{
				bottomPlayerBoard[line][column].setFree();
				topPlayerBoard[line][column].setFree();
			}
		}
	}
	
	public void shoot(int abscissa, int ordinate)
	{
		
	}
	
}
