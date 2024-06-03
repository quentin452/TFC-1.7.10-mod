package com.bioxx.tfc.Items.ItemBlocks;

import net.minecraft.block.Block;

import com.bioxx.tfc.api.Constant.Global;

public class ItemFence2 extends ItemFence {

    public ItemFence2(Block b) {
        super(b);
        metaNames = new String[Global.WOOD_NAMES.length - 16];
        System.arraycopy(Global.WOOD_NAMES, 16, metaNames, 0, Global.WOOD_NAMES.length - 16);
    }
}
