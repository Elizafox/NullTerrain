package uk.me.elizabethmyers.nullterrain;

import java.util.List;
import java.util.logging.Logger;
import java.util.Collections;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.Server;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.util.config.Configuration;

public class NullTerrain extends JavaPlugin
{
	private static Logger log = Logger.getLogger("Minecraft");

	public void onDisable()
	{
	}

	public void onEnable()
	{
		PluginDescriptionFile desc = this.getDescription();
		Configuration config = getConfiguration();
		Server serv = Bukkit.getServer();
		
		config.load();
		List<String> worldconfig = config.getStringList("worlds", null);
		if(worldconfig == null)
		{
			log.info(desc.getName() + " is not enabled for any worlds due to lack of config.");
			return;
		}

		log.info("Loading worlds for " + desc.getName());
		for(String worldname : worldconfig)
		{
			log.info("Loading world " + worldname);
			// TODO - configurable environment types
			serv.createWorld(worldname, World.Environment.NORMAL, new NullChunkGenerator());
		}
		log.info("Worlds loaded!");

		log.info(desc.getName() + " version " + desc.getVersion() + " is enabled!");
	}

	@Override
	public ChunkGenerator getDefaultWorldGenerator(String worldName, String id)
	{
		return new NullChunkGenerator();
	}
}

