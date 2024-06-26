package com.bioxx.tfc.Blocks.Flora;

import net.minecraft.util.IIcon;

import com.bioxx.tfc.api.Constant.Global;
import com.bioxx.tfc.api.TFCBlocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockLogVert2 extends BlockLogVert {

    public BlockLogVert2() {
        super();
        this.woodNames = new String[Global.WOOD_NAMES.length - 16];
        System.arraycopy(Global.WOOD_NAMES, 16, woodNames, 0, Global.WOOD_NAMES.length - 16);
    }

    @Override
    public int damageDropped(int dmg) {
        return dmg += 16;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        if (meta > 15) meta -= 16;
        return TFCBlocks.logNatural2.getIcon(side, meta);
    }
}
