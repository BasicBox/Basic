package BasicMinez.Actors;

import org.bukkit.entity.Player;

import BasicMinez.Actors.Interfaces.Damageable;
import BasicMinez.Actors.Models.StatsModel;

public class Survivor implements Damageable {
	
	// Variable to store the bukkit Player object that we are linking to a Survivor
	private Player player;	
	public StatsModel stats;
	
	// Constructor
	public Survivor(Player player, StatsModel stats)
	{
		// When you have name conflicts, 'this' refers to the one that belongs to this class.
		this.player = player;
		this.stats = stats;
	}
	
	// Gets the player's health
	public double getHealth()
	{
		return player.getHealth();
	}
	
	// Just a general method that can only be used in this class for setting the health to a different value.
	private void setHealth(double health)
	{
		player.setHealth(health);
	}
	
	// Method available to other classes for giving health to a survivor.
	public void giveHealth(double amountOfHealth)
	{
		setHealth(getHealth() + amountOfHealth);
	}
	
	// Gets the survivor's hunger level
	public int getHunger()
	{
		return player.getFoodLevel();
	}
	
	// Set the survivors hunger level
	private void setHunger(int hungerLevel)
	{
		player.setFoodLevel(hungerLevel);
	}
	
	// Make the survivor more hungry by specified increment
	public void starve(int increment)
	{
		setHunger(getHunger() - increment);
	}

	// Make the survivor less hungry by specified increment
	public void feed(int increment)
	{
		setHunger(getHunger() + increment);
	}
	
	// Will need to test this. Idk what the range is
	public float getThirst()
	{
		return player.getExp();
	}
	
	// Just going to leave the thirsts like that for now until we figure out a way of keeping track between levels
	private void setThirst(float thirst)
	{
		player.setExp(thirst);
	}
	
	public void thirst(float increment)
	{
		
	}
	
	public void quench(float increment)
	{
		
	}

	@Override
	public void takeDamage(double amount) {
		setHealth(getHealth() - amount);
	}
	
}



