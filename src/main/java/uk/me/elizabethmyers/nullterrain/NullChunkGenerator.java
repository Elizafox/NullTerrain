package uk.me.elizabethmyers.nullterrain;

import java.util.Random;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.generator.ChunkGenerator;

public class NullChunkGenerator extends ChunkGenerator
{
	@Override
    public byte[] generate(World world, Random random, int cx, int cz)
	{
		return new byte[16*16*256];
	}

	@Override
	public Location getFixedSpawnLocation(World world, Random random)
	{
		// Sane default --Elizabeth
		return new Location(world, 0, 64, 0);
	}
}
