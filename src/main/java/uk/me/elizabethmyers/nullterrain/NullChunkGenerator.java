package uk.me.elizabethmyers.nullterrain;

import java.util.Random;
import org.bukkit.Location;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.World;

public class NullChunkGenerator extends ChunkGenerator
{
	@Override
	public ChunkData generateChunkData(World world, Random random, int cx, int cz, ChunkGenerator.BiomeGrid biome)
	{
		return createChunkData(world);
	}

	@Override
	public Location getFixedSpawnLocation(World world, Random random)
	{
		// Sane default --Elizabeth
		return new Location(world, 0, 64, 0);
	}
}
