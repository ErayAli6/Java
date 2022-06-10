package eratait;

import java.util.ArrayList;
import java.util.Random;

public class Boss extends Robot {

	int massDamageChance;
	int enemyRobot;

	ArrayList<Robot> targets = new ArrayList<Robot>();

	public Boss(String name, int strength, int hp, int evadeChance, double attackSpeed, int massDamageChance) {
		super(name, strength, hp, evadeChance, attackSpeed);
		this.massDamageChance = massDamageChance;
	}

	Random random = new Random();

	Robot enemy;

	@Override
	public void run() {
		enemyRobot = random.nextInt(targets.size());
		enemy = targets.get(enemyRobot);

		while (targets.size() > 0 && hp > 0) {
			if (random.nextInt(101) <= massDamageChance) {
				System.out.println(name + " hit everyone around him for " + strength
						+ " points of damage and left him with " + enemy.hp + " hp.");

				for (int i = 0; i < targets.size(); i++) {
					targets.get(i).hp -= strength;
					if (targets.get(i).hp <= 0) {
						System.out.println(targets.get(i).name + " is dead :X");
						targets.remove(i);
						if (enemyRobot == i && targets.size() > 1) {
							enemyRobot = random.nextInt(targets.size());
							enemy = targets.get(enemyRobot);
						} else if (enemyRobot == i && targets.size() == 1) {
							enemy = targets.get(0);
						}
					}
				}
			} else {
				if (random.nextInt(101) > enemy.evadeChance) {
					enemy.hp -= strength;
					System.out.println(name + " hit " + enemy.name + " for " + strength + " points of damage and left "
							+ " him with " + enemy.hp + " hp.");
					if (enemy.hp <= 0) {
						System.out.println(enemy.name + " is dead :X");
						targets.remove(enemyRobot);
						if (targets.size() == 0) {
							break;
						}
						if (targets.size() > 0) {
							enemyRobot = random.nextInt(targets.size());
							enemy = targets.get(enemyRobot);
						} else {
							enemy = targets.get(0);
						}
					}
				} else {
					System.out.println(name + " tried to hit " + enemy.name + " but he ducked.");
				}
			}

			try {
				sleep((long) (1000 / attackSpeed));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		if (hp > 0) {
			System.out.println(name + ": You still have to eat a lot of bread to beat me! Hohohoho EZ!");
		} else {
			System.out.println(name + ": You CHEATED! It is impossible!!!");
		}
	}

}
