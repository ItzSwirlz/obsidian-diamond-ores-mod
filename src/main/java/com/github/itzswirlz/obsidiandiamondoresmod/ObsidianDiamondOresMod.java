package com.github.itzswirlz.obsidiandiamondoresmod;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(ObsidianDiamondOresMod.MOD_ID)
public class ObsidianDiamondOresMod
{
	public static final String MOD_ID = "obsidiandiamondoresmod";
	
    public ObsidianDiamondOresMod() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
