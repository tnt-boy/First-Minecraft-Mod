package com.minecraftschool.ReferenceClasses.proxy;

import com.minecraftschool.ReferenceClasses.init.Items;

/**
 * Created by R.Steven on 6/18/2015.
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void registerRenders() {
        Items.registerRenders();
    }
}
