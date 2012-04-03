package uk.me.elizabethmyers.nullterrain;

import java.util.logging.Logger;

import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class NullTerrain extends JavaPlugin
{
	private static Logger log = Logger.getLogger("Minecraft");

	public void onDisable()
	{
	}

	public void onEnable()
	{
		PluginDescriptionFile desc = this.getDescription();

		log.info(desc.getName() + " version " + desc.getVersion() + " is enabled!");
	}

	@Override
	public ChunkGenerator getDefaultWorldGenerator(String worldName, String id)
	{
		return new NullChunkGenerator();
	}
}

