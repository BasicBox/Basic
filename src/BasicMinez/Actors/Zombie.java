package BasicMinez.Actors;

import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;

import BasicMinez.Actors.Interfaces.Damageable;

public class Zombie implements Damageable{
	
	private LivingEntity zombie;
	
	public Zombie(LivingEntity zombie)
	{
		this.zombie = zombie;
	}
	
	// Reflection to change the speed property on the entity
	private void initializeNewStats()
	{
		zombie.setHealth(30);
	}
	
	public double getHealth()
	{
		return zombie.getHealth();
	}
	
	private void setHealth(double health)
	{
		zombie.setHealth(health);
	}

	@Override
	public void takeDamage(double amount) {
		setHealth(getHealth() - amount);
	}
	
}
