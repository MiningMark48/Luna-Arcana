package com.miningmark48.lunaarcana.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockLunaArcana extends Block {

    public BlockLunaArcana(Material material){
        super(material);
    }

    public BlockLunaArcana(){
        super(Material.rock);
        this.setHardness(2.0F);
        this.setResistance(1.0F);
    }

    public boolean isOpaque() {
        return false;
    }

}
