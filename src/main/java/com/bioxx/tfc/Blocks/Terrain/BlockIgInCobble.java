package com.bioxx.tfc.Blocks.Terrain;

import net.minecraft.block.material.Material;
import net.minecraft.util.IIcon;

import com.bioxx.tfc.api.Constant.Global;

public class BlockIgInCobble extends BlockCobble {

    public BlockIgInCobble(Material material) {
        super(material);
        names = Global.STONE_IGNEOUS_INTRUSIVE;
        icons = new IIcon[names.length];
        looseStart = Global.STONE_IGNEOUS_INTRUSIVE_START;
    }
}
