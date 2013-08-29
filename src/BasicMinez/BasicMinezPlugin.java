package BasicMinez;

import org.bukkit.plugin.java.JavaPlugin;

public final class BasicMinezPlugin extends JavaPlugin {
	
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
	
}
