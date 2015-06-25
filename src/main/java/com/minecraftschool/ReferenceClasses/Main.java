package com.minecraftschool.ReferenceClasses;

import com.minecraftschool.ReferenceClasses.init.Items;
import com.minecraftschool.ReferenceClasses.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by R.Steven on 6/18/2015.
 */
@Mod(modid = GlobalConstants.MOD_ID, name = GlobalConstants.MOD_NAME, version = GlobalConstants.VERSION)
public class Main {

    @SidedProxy(clientSide = GlobalConstants.CLIENT_PROXY_CLASS, serverSide = GlobalConstants.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        Items.init();
        Items.register();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.registerRenders();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
