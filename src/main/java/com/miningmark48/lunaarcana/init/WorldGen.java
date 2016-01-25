package com.miningmark48.lunaarcana.init;

import java.util.Random;

import com.miningmark48.lunaarcana.utility.LogHelper;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGen implements IWorldGenerator{

    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch(world.provider.dimensionId){
            case -1: //Nether
                generateNether(world, random, chunkX, chunkZ);
                break;
            case 0: //Overworld
                generateSurface(world, random, chunkX, chunkZ);
                break;
            case 1: //End
                generateEnd(world, random, chunkX, chunkZ);
                break;
        }

    }

    //Block, World, Random, chunkX, chunkZ, minVeinSize, maxVeinSize, chance, minY, maxY, Block generateIn
    private void generateNether(World world, Random rand, int x, int z)
    {

    }

    private void generateSurface(World world, Random rand, int x, int z)
    {
        generateOre(ModBlocks.elixirOre, world, rand, x, z, 4, 6, 35, 10, 40, Blocks.stone);
        generateOre(ModBlocks.darkElixirOre, world, rand, x, z, 2, 4, 20, 5, 15, Blocks.stone);
        generateOre(ModBlocks.bronzeOre, world, rand, x, z, 4, 10, 40, 20, 50, Blocks.stone);
    }


    private void generateEnd(World world, Random rand, int x, int z)
    {

    }

    /*
     * Adds an Ore Spawn to Minecraft. Simply register all Ores to spawn with this method in your Generation method in your IWorldGeneration extending Class
     *
     * @param The Block to spawn
     * @param The World to spawn in
     * @param A Random object for retrieving random positions within the world to spawn the Block
     * @param An int for passing the X-Coordinate for the Generation method
     * @param An int for passing the Z-Coordinate for the Generation method
     * @param An int for setting the maximum X-Coordinate values for spawning on the X-Axis on a Per-Chunk basis
     * @param An int for setting the maximum Z-Coordinate values for spawning on the Z-Axis on a Per-Chunk basis
     * @param An int for setting the maximum size of a vein
     * @param An int for the Number of chances available for the Block to spawn per-chunk
     * @param An int for the minimum Y-Coordinate height at which this block may spawn
     * @param An int for the maximum Y-Coordinate height at which this block may spawn
     **/
    public void generateOre(Block block, World world, Random random, int chunkX, int chunkZ, int minVeinSize, int maxVeinSize, int chance, int minY, int maxY, Block generateIn)
    {
        int veinSize = minVeinSize + random.nextInt(maxVeinSize - minVeinSize);
        int heightRange = maxY - minY;
        WorldGenMinable gen = new WorldGenMinable(block, veinSize, generateIn);
        for (int i = 0; i < chance; i++){
            int xRand = chunkX * 16 + random.nextInt(16);
            int yRand = random.nextInt(heightRange) + minY;
            int zRand = chunkZ * 16 + random.nextInt(16);
            gen.generate(world, random, xRand, yRand, zRand);
            //LogHelper.info("Ore at " + xRand + " " + yRand + " " + zRand);
        }
    }


}
