package eratait;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		
		Robot r1 = new Robot("PowerRangersRed", 130, 1200, 30, 1.5);
		Robot r2 = new Robot("PowerRangersBlue", 115, 1300, 40, 1.4);
		
		ArrayList<Robot> robots = new ArrayList<Robot>();
		robots.add(r1);
		robots.add(r2);
		
		Boss b1 = new Boss("BOSS", 350, 4000, 10, 1 , 15);
		b1.targets = robots;
		r1.enemy = b1;
		r2.enemy = b1;
		
		
		r1.start();
		r2.start();
		b1.start();
	}

}

