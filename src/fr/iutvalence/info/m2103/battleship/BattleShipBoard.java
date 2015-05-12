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
	
	/**
	 * The game board is defined as a two dimensions array
	 */
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
				this.bottomPlayerBoard[line][column] = new BoardSquare(line, column);
			}
		}
		for(int line=0; line<NB_LINE_DEFAULT;line++)
		{
			for(int column=0; column<NB_COLUMN_DEFAULT; column++)
			{
				this.topPlayerBoard[line][column] = new BoardSquare(line, column);
			}
		}
		
	}
	/**
	 * Method who displays the board
	 */
	public void displayBoard()
	{
		String bottomBoard="------------------------------------------------------- \n";
		String topBoard="------------------------------------------------------- \n";
		
		for(int line = 0; line < NB_LINE_DEFAULT; line++)
		{
			for(int column = 0; column < NB_COLUMN_DEFAULT; column++)
			{
				if(this.topPlayerBoard[line][column].isTouched())
				{
					topBoard+="   X |";
				}
				else if(this.topPlayerBoard[line][column].isMissed())
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
				if(this.bottomPlayerBoard[line][column].isOccuped())
				{
					if(this.bottomPlayerBoard[line][column].getShipType()==ShipType.submarine)
					{
						bottomBoard+=" SUB|";
					}
					else if(this.bottomPlayerBoard[line][column].getShipType()==ShipType.AIRCRAFT_CARRIER)
					{
						bottomBoard+=" A C|";
					}
					else if(this.bottomPlayerBoard[line][column].getShipType()==ShipType.destroyer)
					{
						bottomBoard+=" DES|";
					}
					else if(this.bottomPlayerBoard[line][column].getShipType()==ShipType.cruiser)
					{
						bottomBoard+=" CRU|";
					}
					else if(this.bottomPlayerBoard[line][column].getShipType()==ShipType.patrolBoat)
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
				this.bottomPlayerBoard[abscissa-1][ordinate-1+line].setOccuped();
				this.bottomPlayerBoard[abscissa-1][ordinate-1+line].setShipType(shipType);
			}
		} 
		else
		{
			for(int column=0; column< shipType.getSize(); column++)
			{
				this.bottomPlayerBoard[abscissa-1+column][ordinate-1].setOccuped();
				this.bottomPlayerBoard[abscissa-1+column][ordinate-1].setShipType(shipType);
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
				this.bottomPlayerBoard[line][column].setFree();
				this.topPlayerBoard[line][column].setFree();
			}
		}
	}
	
	/**
	 * shoot on the boat of the ennemy if there is one.
	 * @param abscissa
	 * @param ordinate
	 */
	public void shoot(int abscissa, int ordinate)
	{
		if(this.topPlayerBoard[abscissa][ordinate].isOccuped())
		{
			this.topPlayerBoard[abscissa][ordinate].setTouched();
		} else
		{
			this.topPlayerBoard[abscissa][ordinate].setMissed();
		}
	}
	
}
