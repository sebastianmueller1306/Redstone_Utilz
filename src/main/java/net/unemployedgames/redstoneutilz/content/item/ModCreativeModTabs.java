package net.unemployedgames.redstoneutilz.content.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.unemployedgames.redstoneutilz.RedstoneMod;
import net.unemployedgames.redstoneutilz.content.block.ModBlocks;

public class ModCreativeModTabs {

    public static Boolean TABSORTED = false;

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RedstoneMod.Mod_ID);


    public static final RegistryObject<CreativeModeTab> MAIN_TAB = CREATIVE_MODE_TABS.register("main_mod_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(Items.REDSTONE))
                    .title(Component.translatable("creativetab.redstone_utilz.main"))
                    .displayItems((pParameters, pOutput) -> {

                    pOutput.accept(ModBlocks.ZINK_ORE.get());
                    pOutput.accept(ModBlocks.DEEPSLATE_ZINK_ORE.get());
                    pOutput.accept(ModBlocks.ZINC_BLOCK.get());
                    pOutput.accept(ModBlocks.COPYCAT_BLOCK.get());
                    pOutput.accept(ModBlocks.COPYCAT_BUTTON.get());
                    pOutput.accept(ModBlocks.PLACER_BLOCK.get());
                    pOutput.accept(ModBlocks.DESTROYER_BLOCK.get());
                    pOutput.accept(ModBlocks.DISPLAY_BLOCK.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
