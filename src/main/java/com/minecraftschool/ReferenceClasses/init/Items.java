package com.minecraftschool.ReferenceClasses.init;

import com.minecraftschool.ReferenceClasses.GlobalConstants;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by R.Steven on 6/18/2015.
 */
public class Items {

    private static List<Item> itemList = new ArrayList<Item>();

    private static Item registerItem(String unlocalizedName) {
        return new Item().setUnlocalizedName(unlocalizedName);
    }

    public static void init() {
        itemList.add(registerItem("base_item"));
        itemList.add(registerItem("arif_first_item"));
    }

    public static void register() {
        for (Item item : itemList) {
            GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
        }
    }

    public static void registerRenders() {
        for (Item item : itemList) {
            registerRender(item);
        }
    }

    public static void registerRender(Item item) {
        Minecraft.getMinecraft()
                .getRenderItem()
                .getItemModelMesher()
                .register(item, 0, new ModelResourceLocation(
                GlobalConstants.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
