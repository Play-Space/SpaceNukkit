package cn.nukkit.level.generator.populator.impl;

import cn.nukkit.level.ChunkManager;
import cn.nukkit.level.chunk.IChunk;
import cn.nukkit.level.generator.populator.type.Populator;
import cn.nukkit.math.NukkitRandom;

import static cn.nukkit.block.BlockIds.BEDROCK;

/**
 * @author DaPorkchop_
 * <p>
 * Places bedrock on the bottom of the world
 */
public class PopulatorBedrock extends Populator {
    @Override
    public void populate(ChunkManager level, int chunkX, int chunkZ, NukkitRandom random, IChunk chunk) {
        for (int x = 0; x < 16; x++) {
            for (int z = 0; z < 16; z++) {
                chunk.setBlockId(x, 0, z, BEDROCK);
                for (int i = 1; i < 5; i++) {
                    if (random.nextBoundedInt(i) == 0) { //decreasing amount
                        chunk.setBlockId(x, i, z, BEDROCK);
                    }
                }
            }
        }
    }
}
