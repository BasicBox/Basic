package BasicMinez.Actors;

import org.bukkit.entity.Player;

public class Survivor  {
	
	// Variable to store the bukkit Player object that we are linking to a Survivor
	private Player player;	
	
	// Constructor
	public Survivor(Player player)
	{
		// When you have name conflicts, 'this' refers to the one that belongs to this class.
		this.player = player;
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
	
	// Method available to other classes for giving damage to a survivor.
	public void giveDamage(double amountOfDamage)
	{
		setHealth(getHealth() - amountOfDamage);
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
	
}



