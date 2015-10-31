package spil;

import java.util.Scanner;


public class Game {
	private Scanner scan = new Scanner(System.in);
	private Player p1,p2;
	//	private Dice dice = new Dice();
	private Dice[] dice = {new Dice(),new Dice()};
	Field[] list = new Field[13];


	public static void main(String[] args) {
		new Game();
	}
	public Game(){

		//		Opretter alle felterne for spillet:
		list[2] = new Field("Tower",250);
		list[3] = new Field("Crater",-100);
		list[4] = new Field("Palace gates",100);
		list[5] = new Field("Cold desert",-20);
		list[6] = new Field("Walled city",180);
		list[7] = new Field("Monestary",0);
		list[8] = new Field("Black cave",-70);
		list[9] = new Field("Huts in the mountain",60);
		list[10] = new Field("The werewolf-wall",-80);
		list[11] = new Field("The pit",-50);
		list[12] = new Field("Goldmine",650);



		//		Setup of players
		System.out.println("Player 1, write your name");
		p1 = new Player(scan.nextLine());
		System.out.println("Player 2, write your name");
		p2 = new Player(scan.nextLine());


		// Player 1 starter altid, og herefter vælges turen afhængig af hvad man slår.

		Player current = p1;
		while (p1.getPoints() < 3000 && p2.getPoints() < 3000){

			boolean extra = tur(current);
			while (extra){
				extra = tur(current);
			}
			if(current == p1){
				current  = p2;
			} else{
				current = p1;
			}

		}







	}
	//Selve spillet
	private boolean tur(Player p) {
//definerer summen af de to terninger
		scan.nextLine();
		int sum = dice[0].roll() + dice[1].roll();

		// Opdaterer den aktuelle spiller med de point som feltet giver
		p.setPoints(list[sum].getValue()+p.getPoints());

		
		if (list[sum].getValue()>0) {
			System.out.println(p.getName()+" You've rolled: "+ sum +" You've landed on a "+list[sum].getName()+" and are rewarded "+list[sum].getValue()+" points.  You got; "+ p.getPoints());
			
		}else if (list[sum].getValue() == 0) {
			System.out.println(p.getName()+" You've rolled: "+ sum +" You've landed on a "+list[sum].getName()+" and are neither losing nor rewarded any points "+list[sum].getValue()+" points.  You got; "+ p.getPoints());
		
		}else { 
			System.out.println(p.getName()+" You've rolled: "+ sum +" You've landed on a "+list[sum].getName()+" and loses "+list[sum].getValue()+" points.  You got; "+ p.getPoints());
		}
		return sum == 10;
		
	}

}


