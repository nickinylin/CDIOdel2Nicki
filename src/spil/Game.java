package spil;

import java.util.Scanner;


public class Game {
	private Scanner scan = new Scanner(System.in);
	private Player p1,p2;
	private Dice dice = new Dice();
	

	public static void main(String[] args) {
		new Game();
	}
	public Game(){
	
		//Setup of players
		System.out.println("Player 1, write your name");
		p1 = new Player(scan.nextLine());
		System.out.println("Player 2, write your name");
		p2 = new Player(scan.nextLine());
	
		

	}

}
