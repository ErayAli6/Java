package eratait;

import java.util.Random;

public class Robot extends Thread{

	String name;
	int strength;
	int hp;
	int evadeChance;
	double attackSpeed;
	
	Robot enemy;
	Random random = new Random();
	
	
	public Robot(String name, int strength, int hp, int evadeChance, double attackSpeed) {
		super();
		this.name = name;
		this.strength = strength;
		this.hp = hp;
		this.evadeChance = evadeChance;
		this.attackSpeed = attackSpeed;
	}
	
	@Override
	public void run() {
		
		while(hp > 0 && enemy.hp > 0) {
			
			if(random.nextInt(101) > enemy.evadeChance) {
				enemy.hp -= strength;
				
				System.out.println(name + " hit " + enemy.name + " for " + strength +
						" points of damage and left him with " + enemy.hp + " hp.");
			}else {
				System.out.println(name + " tried to hit " + enemy.name + " but he ducked!");
			}
			
			try {								
				sleep((long) (1000 / attackSpeed));			
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}	
		}
		
		if( hp > 0) {
			System.out.println(name + ": HAHAHAHA LOOOOOOOOSEEEEEEEER!!!");
		}else {
			System.out.println(name + ": CHEATEEEEEEEEEEEEEEEER!!!!!!");
		}
	}
	
	
	
	
	
}
