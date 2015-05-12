package fr.iutvalence.info.m2103.battleship;
/**
 * The player class  
 * @author Medy and Jean-Baptiste
 *
 */
public class Player
{
	/**
	 * The default number of ship
	 */
	private static final int NB_DEFAULT_SHIP = 5;
	
	/**
	 * The board of the player
	 */
	public final BattleShipBoard playerBoard;	
	/**
	 * The number of ship
	 */
	private final int nbShip;

	/**
	 * The name of the player
	 */
	private String name;
	
	
	/**
	 * the player constructor with parameters
	 * @param name 
	 */
	public Player(String name)
	{
		this.playerBoard = new BattleShipBoard();
		this.nbShip = NB_DEFAULT_SHIP;
		this.name = name;
	}
	
	/**
	 * This method allows to get the name of the player 
	 * @return name
	 */
	public String getName()
	{
		return this.name;
	}
	
	
}
