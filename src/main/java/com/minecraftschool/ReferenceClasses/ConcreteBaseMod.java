package com.minecraftschool.ReferenceClasses;

import com.minecraftschool.ReferenceClasses.init.BaseItem;
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
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class ConcreteBaseMod {

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        BaseItem.init();
        BaseItem.register();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.registerRenders();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
