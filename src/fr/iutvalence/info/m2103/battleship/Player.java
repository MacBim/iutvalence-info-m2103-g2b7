package fr.iutvalence.info.m2103.battleship;
/**
 * The player class  
 * @author Medy and Jean-Baptiste
 *
 */
public class Player
{
	private static final int NB_DEFAULT_SHIP = 5;
	private final BattleShipBoard playerBoard;
	private final BattleShipBoard ennemyBoard;
	private final int nbShip;
	
	
	/**
	 * Constructeur de Joueur
	 */
	public Player()
	{
		this.playerBoard = new BattleShipBoard();
		this.ennemyBoard = new BattleShipBoard();
		this.nbShip = NB_DEFAULT_SHIP;
	}
	
}
