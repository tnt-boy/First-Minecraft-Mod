package com.minecraftschool.ReferenceClasses.init;

import com.minecraftschool.ReferenceClasses.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by R.Steven on 6/18/2015.
 */
public class BaseItem {
    public static Item base_block;

    public static void init() {
        base_block = new Item().setUnlocalizedName("base_block");
    }

    public static void register() {
        GameRegistry.registerItem(base_block, base_block.getUnlocalizedName().substring(5));  //"tile:base_block"
    }

    public static void registerRenders() {
        if (base_block == null) init();

        registerRender(base_block);
    }

    public static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(
                Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

}
