package uk.me.elizabethmyers.nullterrain;

import java.util.Random;
import org.bukkit.Location;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.World;

public class NullChunkGenerator extends ChunkGenerator
{
	public byte[] generate(World world, Random random, int cx, int cz)
	{
		return new byte[32768];
	}

	@Override
	public Location getFixedSpawnLocation(World world, Random random)
	{
		// Sane default --Elizabeth
		return new Location(world, 0, 64, 0);
	}
}
