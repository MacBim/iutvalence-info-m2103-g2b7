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
	/**
	 * The player 1
	 */
	private Player player1;
	/**
	 * The player 2
	 */
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
	/**
	 * method which allows to "play" the game
	 */
	public void play()
	{
		System.out.println(this.player1.playerBoard.toString());
	}
}
