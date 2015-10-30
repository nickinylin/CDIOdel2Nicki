package spil;

import java.awt.List;
import java.util.Scanner;


public class Game {
	private Scanner scan = new Scanner(System.in);
	private Player p1,p2;
	//	private Dice dice = new Dice();
	private Dice[] dice = {new Dice(),new Dice()};
	//	private int dice1 = dice.roll();
	//	private int dice2 = dice.roll();
	private Bank bank = new Bank();
	private int turn = 0;
	Field[] list = new Field[13];


	public static void main(String[] args) {
		new Game();
	}
	public Game(){

list[2] = new Field("Tower",250);



		//		Setup of players
		System.out.println("Player 1, write your name");
		p1 = new Player(scan.nextLine());
		System.out.println("Player 2, write your name");
		p2 = new Player(scan.nextLine());



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
	private boolean tur(Player p) {
		
		int sum = dice[0].roll() + dice[1].roll();
		p.setPoints(list[sum].getValue()+p.getPoints());
		if ()
		System.out.println(p.getName()+" You've landed on a "+list[sum].getName()+" and are rewarded "+list[sum].getValue()+" points.  You got; "+ p.getPoints());
		return sum == 10;
		/*
		if (dice[0].roll() + dice[1].roll() == 2){
			p.setPoints(+p.getPoints());
			System.out.println(p.getName()+" You've landed on a "+list[sum].getName()+" and are rewarded "+list[sum].getValue()+" points.  You got; "+ p.getPoints());

		}else if (dice[0].roll() + dice[1].roll() == 3){
			p.setPoints(-100+p.getPoints());
			System.out.println(p.getName()+" You've landed on a Crater and loses 100 points.  You got; "+ p.getPoints());

		}else if (dice[0].roll() + dice[1].roll() == 4){
			p.setPoints(100+p.getPoints());
			System.out.println(p.getName()+" You've landed on the palace Gates and are rewarded 100 points.  You got; "+ p.getPoints());

		}else if (dice[0].roll() + dice[1].roll() == 5){
			p.setPoints(-20+p.getPoints());
			System.out.println(p.getName()+" You've landed in the cold desert and loses 20 points.  You got; "+ p.getPoints());

		}else if (dice[0].roll() + dice[1].roll() == 6){
			p.setPoints(180+p.getPoints());
			System.out.println(p.getName()+" You've landed inside the walled city and are rewarded 180 points.  You got; "+ p.getPoints());

		}else if (dice[0].roll() + dice[1].roll() == 7){
			p.setPoints(p.getPoints());
			System.out.println(p.getName()+" You've landed in the monastary and are neither losing nor rewarded any points. you are at peace.  You got; "+ p.getPoints());

		}else if (dice[0].roll() + dice[1].roll() == 8){
			p.setPoints(-70+p.getPoints());
			System.out.println(p.getName()+" You've landed in the black cave and loses 70 points.  You got; "+ p.getPoints());

		}else if (dice[0].roll() + dice[1].roll() == 9){
			p.setPoints(60+p.getPoints());
			System.out.println(p.getName()+" You've landed in the huts in the mountain and are rewarded 60 points.  You got; "+ p.getPoints());

		}else if (dice[0].roll() + dice[1].roll() == 10){
			p.setPoints(-80+p.getPoints());
			System.out.println(p.getName()+" You've landed on the werewolf-wall and the wolfs take 80 of your points, however you are rewarded and extra turn!  You got; "+ p.getPoints());
			return true;
		}else if (dice[0].roll() + dice[1].roll() == 11){
			p.setPoints(-50+p.getPoints());
			System.out.println(p.getName()+" You've landed in the pit and loses 50 points  You got; "+ p.getPoints());


		}else if (dice[0].roll() + dice[1].roll() == 12){
			p.setPoints(650+p.getPoints());
			System.out.println(p.getName()+" You've landed in the dwarfs Goldmine and are rewarded 650 points! You got; "+ p.getPoints());
		}
		*/
	}

}


