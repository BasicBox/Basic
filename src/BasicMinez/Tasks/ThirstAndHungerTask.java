package BasicMinez.Tasks;

import java.util.List;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

import BasicMinez.Actors.Survivor;

// This doesn't apply damage if they are too hungry or too thirsty.
// It only changes the hunger and thirst
public class ThirstAndHungerTask extends BukkitRunnable {

	private final JavaPlugin plugin;
	private List<Survivor> survivors;
	
	public ThirstAndHungerTask(JavaPlugin plugin, List<Survivor> survivors)
	{
		this.plugin = plugin;
		this.survivors = survivors;
	}
	
	@Override
	public void run() {
		for(Survivor survivor : survivors)
		{
			survivor.starve(survivor.stats.hungerDecayRate);
			survivor.thirst(survivor.stats.thirstDecayRate);
		}		
	}
	
}
