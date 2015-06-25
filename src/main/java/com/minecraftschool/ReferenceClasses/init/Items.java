package com.minecraftschool.ReferenceClasses.init;

import com.minecraftschool.ReferenceClasses.GlobalConstants;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by R.Steven on 6/18/2015.
 */
public class Items {
    public static Item base_item;
    public static Item arif_first_item;

    public static void init() {
        base_item = new Item().setUnlocalizedName("base_item");
        arif_first_item = new Item().setUnlocalizedName("arif_first_item");
    }

    public static void register() {
        GameRegistry.registerItem(base_item, base_item.getUnlocalizedName().substring(5));  //"tile:base_item"
        GameRegistry.registerItem(arif_first_item, arif_first_item.getUnlocalizedName().substring(5));  //"tile:arif_first_item"
    }

    public static void registerRenders() {
        registerRender(base_item);
        registerRender(arif_first_item);
    }

    public static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(
                GlobalConstants.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

}
