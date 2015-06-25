package com.minecraftschool.ReferenceClasses.init;

import com.minecraftschool.ReferenceClasses.GlobalConstants;
import com.minecraftschool.ReferenceClasses.overrides.BlockShim;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by R.Steven on 6/24/2015.
 */
public class Blocks {

    private static List<Block> blockList = new ArrayList<Block>();

    private static Block registerItem(String unlocalizedName) {
        return new BlockShim(Material.glass).setUnlocalizedName(unlocalizedName);
    }

    public static void init() {
        blockList.add(registerItem("base_block"));
        blockList.add(registerItem("arif_first_block"));
    }

    public static void register() {
        for (Block block : blockList) {
            GameRegistry.registerBlock(block, block.getUnlocalizedName().substring(5));
        }
    }

    public static void registerRenders() {
        for (Block block : blockList) {
            registerRender(block);
        }
    }

    public static void registerRender(Block block) {

        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft()
                .getRenderItem()
                .getItemModelMesher()
                .register(item, 0, new ModelResourceLocation(
                        GlobalConstants.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
