package com.miningmark48.lunaarcana;

import com.miningmark48.lunaarcana.handler.ConfigurationHandler;
import com.miningmark48.lunaarcana.init.*;
import com.miningmark48.lunaarcana.proxy.ClientProxy;
import com.miningmark48.lunaarcana.proxy.IProxy;
import com.miningmark48.lunaarcana.reference.Reference;
import com.miningmark48.lunaarcana.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.util.StatCollector;

@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class LunaArcana {

    @Mod.Instance(Reference.MOD_ID)
    public static LunaArcana instance;

    @SidedProxy(clientSide=Reference.CLIENT_PROXY_CLASS, serverSide=Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;
    public static ClientProxy cProxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        ModBlocks.init();
        ModItems.init();

        proxy.registerRenderThings();

        GameRegistry.registerWorldGenerator(new WorldGen(), 0);

        //NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());

        LogHelper.info(StatCollector.translateToLocal("log.info.preinit"));
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){

        Recipes.init();
        //Achievements.init();
        LogHelper.info(StatCollector.translateToLocal("log.info.init"));
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

        LogHelper.info(StatCollector.translateToLocal("log.info.postinit"));
    }

    @Mod.EventHandler
    public void serverLoad(FMLServerStartingEvent event){
        //Commands.init(event);
    }

}
