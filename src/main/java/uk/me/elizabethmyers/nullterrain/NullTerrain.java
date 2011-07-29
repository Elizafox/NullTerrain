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

		log.info(desc.getName() + " version " + desc.getVersion() + " is enabled!");
	}

	@Override
	public ChunkGenerator getDefaultWorldGenerator(String worldName, String id)
	{
		return new NullChunkGenerator();
	}
}

