package fr.iutvalence.info.m2103.battleship;
import java.util.Scanner;
/**
 * The Battleship game
 * @author Medy and Jean-Baptiste
 *
 */
public class BattleShipGame
{
	/**
	 * the turns of the game
	 */
	private int turn;
	
	private Player player1;
	
	private Player player2;
	/**
	 * Method who start a game
	 */
	public BattleShipGame()
	{
		this.turn=0;
		this.player1= new Player("Max");
		this.player2= new Player("Ennemy");
	}
	
	public void play()
	{	
		player1.playerBoard.setAShip(ShipType.AIRCRAFT_CARRIER, 4, 4, true);
		player1.playerBoard.setAShip(ShipType.submarine, 1, 1, true);
		player1.playerBoard.setAShip(ShipType.destroyer, 5, 5, true);
		player1.playerBoard.setAShip(ShipType.cruiser, 2, 2, false);
		player1.playerBoard.setAShip(ShipType.patrolBoat, 5, 10, false);
		player1.playerBoard.shoot(1, 1);
		player1.playerBoard.displayBoard();
		
	}
}
