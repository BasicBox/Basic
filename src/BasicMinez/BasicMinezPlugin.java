package BasicMinez;

import java.util.List;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;

import BasicMinez.Actors.Survivor;
import BasicMinez.Tasks.ThirstAndHungerTask;
import BasicMinez.Utilities.BasicMinezUtilities;

public final class BasicMinezPlugin extends JavaPlugin {
	
	private List<Survivor> survivors;
	
	@Override
	public void onEnable()
	{
		getLogger().info("BasicMinez initialized..."); // Write to console that plugin has been initialized
	}
	
	@Override
	public void onDisable()
	{
		getLogger().info("BasicMinez saving state and shutting down..."); // Write to console that plugin is shutting down
	}
	
	private void initializeTasks()
	{
		BukkitTask task = new ThirstAndHungerTask(this, survivors).runTaskTimer(this, 0, BasicMinezUtilities.toTicks(60));
	}
}
