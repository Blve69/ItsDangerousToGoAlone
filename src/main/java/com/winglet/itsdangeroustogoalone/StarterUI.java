package com.winglet.itsdangeroustogoalone;

import ca.landonjw.gooeylibs.inventory.api.Button;
import ca.landonjw.gooeylibs.inventory.api.InventoryAPI;
import ca.landonjw.gooeylibs.inventory.api.Page;
import ca.landonjw.gooeylibs.inventory.api.Template;
import com.pixelmonmod.pixelmon.config.PixelmonItemsHeld;
import com.pixelmonmod.pixelmon.config.PixelmonItemsPokeballs;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.fml.common.FMLCommonHandler;

import java.util.Arrays;

public class StarterUI {
    MinecraftServer server = FMLCommonHandler.instance().getMinecraftServerInstance();

    public static Page StarterSelect(EntityPlayerMP player) {
        Button panes = Button.builder()
                .item(new ItemStack(Blocks.STAINED_GLASS_PANE, 1, EnumDyeColor.SILVER.getMetadata()))
                .displayName("")
                .build();

        Button shiny = Button.builder()
                .item(new ItemStack(Items.NETHER_STAR))
                .displayName("§6Shiny §4Starter Pokemon")
                .onClick(buttonAction -> {StarterUI.ShinyStartersMenu(player).forceOpenPage(player);})
                .build();

        Button normal = Button.builder()
                .item(new ItemStack(PixelmonItemsPokeballs.ultraBall))
                .displayName("§4Starter Pokemon")
                .onClick(buttonAction -> {StarterUI.StartersMenu(player).forceOpenPage(player);})
                .build();

        Template template = Template.builder(5)
                .fill(panes)
                .set(2, 3, normal)
                .set(2, 5, shiny)
                .build();

        return Page.builder()
                .template(template)
                .title("§9Starter Selection")
                .build();
    }
    public static Page StartersMenu(EntityPlayerMP player) {
        Button panes = Button.builder()
                .item(new ItemStack(Blocks.STAINED_GLASS_PANE, 1, EnumDyeColor.SILVER.getMetadata()))
                .displayName("")
                .build();

        Button gen1 = Button.builder()
                .item(new ItemStack(PixelmonItemsPokeballs.pokeBall))
                .displayName("§9Generation 1 Starter Pokemon")
                .onClick(buttonAction -> {StarterUI.Gen1(player).forceOpenPage(player);})
                .build();

        Button gen2 = Button.builder()
                .item(new ItemStack(PixelmonItemsPokeballs.greatBall))
                .displayName("§9Generation 2 Starter Pokemon")
                .onClick(buttonAction -> {StarterUI.Gen2(player).forceOpenPage(player);})
                .build();

        Button gen3 = Button.builder()
                .item(new ItemStack(PixelmonItemsPokeballs.ultraBall))
                .displayName("§9Generation 3 Starter Pokemon")
                .onClick(buttonAction -> {StarterUI.Gen3(player).forceOpenPage(player);})
                .build();

        Button gen4 = Button.builder()
                .item(new ItemStack(PixelmonItemsPokeballs.duskBall))
                .displayName("§9Generation 4 Starter Pokemon")
                .onClick(buttonAction -> {StarterUI.Gen4(player).forceOpenPage(player);})
                .build();

        Button gen5 = Button.builder()
                .item(new ItemStack(PixelmonItemsPokeballs.heavyBall))
                .displayName("§9Generation 5 Starter Pokemon")
                .onClick(buttonAction -> {StarterUI.Gen5(player).forceOpenPage(player);})
                .build();

        Button gen6 = Button.builder()
                .item(new ItemStack(PixelmonItemsPokeballs.luxuryBall))
                .displayName("§9Generation 6 Starter Pokemon")
                .onClick(buttonAction -> {StarterUI.Gen6(player).forceOpenPage(player);})
                .build();

        Button gen7 = Button.builder()
                .item(new ItemStack(PixelmonItemsPokeballs.beastBall))
                .displayName("§9Generation 7 Starter Pokemon")
                .onClick(buttonAction -> {StarterUI.Gen7(player).forceOpenPage(player);})
                .build();

        Button back = Button.builder()
                .item(new ItemStack(PixelmonItemsHeld.ejectButton))
                .displayName("§7Click to go Back")
                .onClick(buttonAction -> {StarterUI.StartersMenu(player).forceOpenPage(player);})
                .build();

        Template template = Template.builder(5)
                .fill(panes)
                .set(1, 1, gen1)
                .set(1, 2, gen2)
                .set(1, 3, gen3)
                .set(1, 4, gen4)
                .set(1, 5, gen5)
                .set(1, 6, gen6)
                .set(1, 7, gen7)
                .set(2, 4, back)
                .build();

        return Page.builder()
                .template(template)
                .title("§4Starter Pokemon")
                .build();
    }

    public static Page ShinyStartersMenu(EntityPlayerMP player) {
        Button panes = Button.builder()
                .item(new ItemStack(Blocks.STAINED_GLASS_PANE, 1, EnumDyeColor.SILVER.getMetadata()))
                .displayName("")
                .build();

        Button gen1 = Button.builder()
                .item(new ItemStack(PixelmonItemsPokeballs.pokeBall))
                .displayName("§6Shiny Generation 1 Starter Pokemon")
                .onClick(buttonAction -> {StarterUI.ShinyGen1(player).forceOpenPage(player);})
                .build();

        Button gen2 = Button.builder()
                .item(new ItemStack(PixelmonItemsPokeballs.greatBall))
                .displayName("§6Shiny Generation 2 Starter Pokemon")
                .onClick(buttonAction -> {StarterUI.ShinyGen2(player).forceOpenPage(player);})
                .build();

        Button gen3 = Button.builder()
                .item(new ItemStack(PixelmonItemsPokeballs.ultraBall))
                .displayName("§6Shiny Generation 3 Starter Pokemon")
                .onClick(buttonAction -> {StarterUI.ShinyGen3(player).forceOpenPage(player);})
                .build();

        Button gen4 = Button.builder()
                .item(new ItemStack(PixelmonItemsPokeballs.duskBall))
                .displayName("§6Shiny Generation 4 Starter Pokemon")
                .onClick(buttonAction -> {StarterUI.ShinyGen4(player).forceOpenPage(player);})
                .build();

        Button gen5 = Button.builder()
                .item(new ItemStack(PixelmonItemsPokeballs.heavyBall))
                .displayName("§6Shiny Generation 5 Starter Pokemon")
                .onClick(buttonAction -> {StarterUI.ShinyGen5(player).forceOpenPage(player);})
                .build();

        Button gen6 = Button.builder()
                .item(new ItemStack(PixelmonItemsPokeballs.luxuryBall))
                .displayName("§6Shiny Generation 6 Starter Pokemon")
                .onClick(buttonAction -> {StarterUI.ShinyGen6(player).forceOpenPage(player);})
                .build();

        Button gen7 = Button.builder()
                .item(new ItemStack(PixelmonItemsPokeballs.beastBall))
                .displayName("§6Shiny Generation 7 Starter Pokemon")
                .onClick(buttonAction -> {StarterUI.ShinyGen7(player).forceOpenPage(player);})
                .build();

        Button back = Button.builder()
                .item(new ItemStack(PixelmonItemsHeld.ejectButton))
                .displayName("§7Click to go Back")
                .onClick(buttonAction -> {StarterUI.StartersMenu(player).forceOpenPage(player);})
                .build();

        Template template = Template.builder(5)
                .fill(panes)
                .set(1, 1, gen1)
                .set(1, 2, gen2)
                .set(1, 3, gen3)
                .set(1, 4, gen4)
                .set(1, 5, gen5)
                .set(1, 6, gen6)
                .set(1, 7, gen7)
                .set(2, 4, back)
                .build();

        return Page.builder()
                .template(template)
                .title("§6Shiny Starter Pokemon")
                .build();
    }
    public static Page Gen1(EntityPlayerMP player) {
        MinecraftServer server = FMLCommonHandler.instance().getMinecraftServerInstance();

        Button panes = Button.builder()
                .item(new ItemStack(Blocks.STAINED_GLASS_PANE, 1, EnumDyeColor.SILVER.getMetadata()))
                .displayName("")
                .build();

        Button bulbasaur = Button.builder()
                .displayName("§2Bulbasaur")
                .item(new ItemStack(PixelmonItemsPokeballs.pokeBall))
                .lore(Arrays.asList("§7Are you sure you want Bulbasaur as your Starter?"))
                .onClick(buttonAction ->  {
                    player.getServer().getCommandManager().executeCommand(server, "pokegive "+ buttonAction.getPlayer().getName() +" Bulbasaur level:5");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &4&l[&9PixelmonStarter&4&l] &r&7It's Dangerous to go alone!");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &7Take this &2Bulbasaur &b"+ buttonAction.getPlayer().getName()+"&7!");
                    player.getServer().getCommandManager().executeCommand(server, "lp user "+ buttonAction.getPlayer().getName()+ " permission set itsdangeroustogoalone.command.starters false");
                    InventoryAPI.getInstance().closePlayerInventory(player);
                })
                .build();

        Button charmander = Button.builder()
                .displayName("§4Charmander")
                .item(new ItemStack(PixelmonItemsPokeballs.pokeBall))
                .lore(Arrays.asList("§7Are you sure you want Charmander as your Starter?"))
                .onClick(buttonAction ->  {
                    player.getServer().getCommandManager().executeCommand(server, "pokegive "+ buttonAction.getPlayer().getName() +" Bulbasaur level:5");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &4&l[&9PixelmonStarter&4&l] &r&7It's Dangerous to go alone!");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &7Take this &2Bulbasaur &b"+ buttonAction.getPlayer().getName()+"&7!");
                    player.getServer().getCommandManager().executeCommand(server, "lp user "+ buttonAction.getPlayer().getName()+ " permission set itsdangeroustogoalone.command.starters false");
                    InventoryAPI.getInstance().closePlayerInventory(player);
                })
                .build();

        Button squirtle = Button.builder()
                .displayName("§bSquirtle")
                .item(new ItemStack(PixelmonItemsPokeballs.pokeBall))
                .lore(Arrays.asList("§7Are you sure you want Squirtle as your Starter?"))
                .onClick(buttonAction ->  {
                    player.getServer().getCommandManager().executeCommand(server, "pokegive "+ buttonAction.getPlayer().getName() +" Bulbasaur level:5");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &4&l[&9PixelmonStarter&4&l] &r&7It's Dangerous to go alone!");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &7Take this &2Bulbasaur &b"+ buttonAction.getPlayer().getName()+"&7!");
                    player.getServer().getCommandManager().executeCommand(server, "lp user "+ buttonAction.getPlayer().getName()+ " permission set itsdangeroustogoalone.command.starters false");
                    InventoryAPI.getInstance().closePlayerInventory(player);
                })
                .build();

        Button back = Button.builder()
                .item(new ItemStack(PixelmonItemsHeld.ejectButton))
                .displayName("§7Click to go Back")
                .onClick(buttonAction -> {StarterUI.StarterSelect(player).forceOpenPage(player);})
                .build();

        Template template = Template.builder(5)
                .fill(panes)
                .set(2, 4, back)
                .set(1, 1, bulbasaur)
                .set(1, 4, charmander)
                .set(1, 7, squirtle)
                .build();

        return Page.builder()
                .template(template)
                .title("§4Gen 1 Starter Pokemon")
                .build();
    }
    public static Page Gen2(EntityPlayerMP player) {
        MinecraftServer server = FMLCommonHandler.instance().getMinecraftServerInstance();
        Button panes = Button.builder()
                .item(new ItemStack(Blocks.STAINED_GLASS_PANE, 1, EnumDyeColor.SILVER.getMetadata()))
                .displayName("")
                .build();

        Button chikorita = Button.builder()
                .displayName("§2Chikorita")
                .item(new ItemStack(PixelmonItemsPokeballs.pokeBall))
                .lore(Arrays.asList("§7Are you sure you want Chikorita as your Starter?"))
                .onClick(buttonAction ->  {
                    player.getServer().getCommandManager().executeCommand(server, "pokegive "+ buttonAction.getPlayer().getName() +" Chikorita level:5");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &4&l[&9PixelmonStarter&4&l] &r&7It's Dangerous to go alone!");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &7Take this &2Chikorita &b"+ buttonAction.getPlayer().getName()+"&7!");
                    player.getServer().getCommandManager().executeCommand(server, "lp user "+ buttonAction.getPlayer().getName()+ " permission set itsdangeroustogoalone.command.starters false");
                    InventoryAPI.getInstance().closePlayerInventory(player);
                })
                .build();

        Button totodile = Button.builder()
                .displayName("§bTotodile")
                .item(new ItemStack(PixelmonItemsPokeballs.pokeBall))
                .lore(Arrays.asList("§7Are you sure you want as your Starter?"))
                .onClick(buttonAction ->  {
                    player.getServer().getCommandManager().executeCommand(server, "pokegive "+ buttonAction.getPlayer().getName() +" Totodile level:5");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &4&l[&9PixelmonStarter&4&l] &r&7It's Dangerous to go alone!");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &7Take this &9Totodile &b"+ buttonAction.getPlayer().getName()+"&7!");
                    player.getServer().getCommandManager().executeCommand(server, "lp user "+ buttonAction.getPlayer().getName()+ " permission set itsdangeroustogoalone.command.starters false");
                    InventoryAPI.getInstance().closePlayerInventory(player);
                })
                .build();

        Button cyndaquil = Button.builder()
                .displayName("§4Cyndaquil")
                .item(new ItemStack(PixelmonItemsPokeballs.pokeBall))
                .lore(Arrays.asList("§7Are you sure you want as your Starter?"))
                .onClick(buttonAction ->  {
                    player.getServer().getCommandManager().executeCommand(server, "pokegive "+ buttonAction.getPlayer().getName() +" Cyndaquil level:5");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &4&l[&9PixelmonStarter&4&l] &r&7It's Dangerous to go alone!");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &7Take this &4Cyndaquil &b"+ buttonAction.getPlayer().getName()+"&7!");
                    player.getServer().getCommandManager().executeCommand(server, "lp user "+ buttonAction.getPlayer().getName()+ " permission set itsdangeroustogoalone.command.starters false");
                    InventoryAPI.getInstance().closePlayerInventory(player);
                })
                .build();
        Button back = Button.builder()
                .item(new ItemStack(PixelmonItemsHeld.ejectButton))
                .displayName("§7Click to go Back")
                .onClick(buttonAction -> {StarterUI.StarterSelect(player).forceOpenPage(player);})
                .build();

        Template template = Template.builder(5)
                .fill(panes)
                .set(2, 4, back)
                .set(1, 1, chikorita)
                .set(1, 4, cyndaquil)
                .set(1, 7, totodile)
                .build();

        return Page.builder()
                .template(template)
                .title("§4Gen 2 Starter Pokemon")
                .build();
    }

    public static Page Gen3 (EntityPlayerMP player) {
        MinecraftServer server = FMLCommonHandler.instance().getMinecraftServerInstance();
        Button panes = Button.builder()
                .item(new ItemStack(Blocks.STAINED_GLASS_PANE, 1, EnumDyeColor.SILVER.getMetadata()))
                .displayName("")
                .build();

        Button torchic = Button.builder()
                .displayName("§4Torchic")
                .item(new ItemStack(PixelmonItemsPokeballs.pokeBall))
                .lore(Arrays.asList("§7Are you sure you want Torchic as your Starter?"))
                .onClick(buttonAction ->  {
                    player.getServer().getCommandManager().executeCommand(server, "pokegive "+ buttonAction.getPlayer().getName() +" Torchic level:5");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &4&l[&9PixelmonStarter&4&l] &r&7It's Dangerous to go alone!");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &7Take this &4Torchic &b"+ buttonAction.getPlayer().getName()+"&7!");
                    player.getServer().getCommandManager().executeCommand(server, "lp user "+ buttonAction.getPlayer().getName()+ " permission set itsdangeroustogoalone.command.starters false");
                    InventoryAPI.getInstance().closePlayerInventory(player);
                })
                .build();

        Button mudkip = Button.builder()
                .displayName("§9Mudkip")
                .item(new ItemStack(PixelmonItemsPokeballs.pokeBall))
                .lore(Arrays.asList("§7Are you sure you want as Mudkip your Starter?"))
                .onClick(buttonAction ->  {
                    player.getServer().getCommandManager().executeCommand(server, "pokegive "+ buttonAction.getPlayer().getName() +" Mudkip level:5");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &4&l[&9PixelmonStarter&4&l] &r&7It's Dangerous to go alone!");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &7Take this &9Mudkip &b"+ buttonAction.getPlayer().getName()+"&7!");
                    player.getServer().getCommandManager().executeCommand(server, "lp user "+ buttonAction.getPlayer().getName()+ " permission set itsdangeroustogoalone.command.starters false");
                    InventoryAPI.getInstance().closePlayerInventory(player);
                })
                .build();

        Button treecko = Button.builder()
                .displayName("§2Treecko")
                .item(new ItemStack(PixelmonItemsPokeballs.pokeBall))
                .lore(Arrays.asList("§7Are you sure you want as your Starter?"))
                .onClick(buttonAction ->  {
                    player.getServer().getCommandManager().executeCommand(server, "pokegive "+ buttonAction.getPlayer().getName() +" Treecko level:5");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &4&l[&9PixelmonStarter&4&l] &r&7It's Dangerous to go alone!");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &7Take this &2Treecko &b"+ buttonAction.getPlayer().getName()+"&7!");
                    player.getServer().getCommandManager().executeCommand(server, "lp user "+ buttonAction.getPlayer().getName()+ " permission set itsdangeroustogoalone.command.starters false");
                    InventoryAPI.getInstance().closePlayerInventory(player);
                })
                .build();

        Button back = Button.builder()
                .item(new ItemStack(PixelmonItemsHeld.ejectButton))
                .displayName("§7Click to go Back")
                .onClick(buttonAction -> {StarterUI.StarterSelect(player).forceOpenPage(player);})
                .build();

        Template template = Template.builder(5)
                .fill(panes)
                .set(2, 4, back)
                .set(1, 1, treecko)
                .set(1, 4, torchic)
                .set(1, 7, mudkip)
                .build();

        return Page.builder()
                .template(template)
                .title("§4Gen 3 Starter Pokemon")
                .build();
    }

    public static Page Gen4(EntityPlayerMP player) {
        MinecraftServer server = FMLCommonHandler.instance().getMinecraftServerInstance();
        Button panes = Button.builder()
                .item(new ItemStack(Blocks.STAINED_GLASS_PANE, 1, EnumDyeColor.SILVER.getMetadata()))
                .displayName("")
                .build();

        Button piplup = Button.builder()
                .displayName("§bPiplup")
                .item(new ItemStack(PixelmonItemsPokeballs.pokeBall))
                .lore(Arrays.asList("§7Are you sure you want Piplup as your Starter?"))
                .onClick(buttonAction ->  {
                    player.getServer().getCommandManager().executeCommand(server, "pokegive "+ buttonAction.getPlayer().getName() +" Piplup level:5");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &4&l[&9PixelmonStarter&4&l] &r&7It's Dangerous to go alone!");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &7Take this &bPiplup &b"+ buttonAction.getPlayer().getName()+"&7!");
                    player.getServer().getCommandManager().executeCommand(server, "lp user "+ buttonAction.getPlayer().getName()+ " permission set itsdangeroustogoalone.command.starters false");
                    InventoryAPI.getInstance().closePlayerInventory(player);
                })
                .build();

        Button turtwig = Button.builder()
                .displayName("§2Turtwig")
                .item(new ItemStack(PixelmonItemsPokeballs.pokeBall))
                .lore(Arrays.asList("§7Are you sure you want Turtwig as your Starter?"))
                .onClick(buttonAction ->  {
                    player.getServer().getCommandManager().executeCommand(server, "pokegive "+ buttonAction.getPlayer().getName() +" Turtwig level:5");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &4&l[&9PixelmonStarter&4&l] &r&7It's Dangerous to go alone!");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &7Take this &2Turtwig &b"+ buttonAction.getPlayer().getName()+"&7!");
                    player.getServer().getCommandManager().executeCommand(server, "lp user "+ buttonAction.getPlayer().getName()+ " permission set itsdangeroustogoalone.command.starters false");
                    InventoryAPI.getInstance().closePlayerInventory(player);
                })
                .build();

        Button chimchar = Button.builder()
                .displayName("§4Chimchar")
                .item(new ItemStack(PixelmonItemsPokeballs.pokeBall))
                .lore(Arrays.asList("§7Are you sure you want Chimchar as your Starter?"))
                .onClick(buttonAction ->  {
                    player.getServer().getCommandManager().executeCommand(server, "pokegive "+ buttonAction.getPlayer().getName() +" Chimchar level:5");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &4&l[&9PixelmonStarter&4&l] &r&7It's Dangerous to go alone!");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &7Take this &4Chimchar &b"+ buttonAction.getPlayer().getName()+"&7!");
                    player.getServer().getCommandManager().executeCommand(server, "lp user "+ buttonAction.getPlayer().getName()+ " permission set itsdangeroustogoalone.command.starters false");
                    InventoryAPI.getInstance().closePlayerInventory(player);
                })
                .build();

        Button back = Button.builder()
                .item(new ItemStack(PixelmonItemsHeld.ejectButton))
                .displayName("§7Click to go Back")
                .onClick(buttonAction -> {StarterUI.StarterSelect(player).forceOpenPage(player);})
                .build();

        Template template = Template.builder(5)
                .fill(panes)
                .set(2, 4, back)
                .set(1, 1, turtwig)
                .set(1, 4, chimchar)
                .set(1, 7, piplup)
                .build();

        return Page.builder()
                .template(template)
                .title("§4Gen 4 Starter Pokemon")
                .build();
    }
    public static Page Gen5(EntityPlayerMP player) {
        MinecraftServer server = FMLCommonHandler.instance().getMinecraftServerInstance();
        Button panes = Button.builder()
                .item(new ItemStack(Blocks.STAINED_GLASS_PANE, 1, EnumDyeColor.SILVER.getMetadata()))
                .displayName("")
                .build();

        Button snivy = Button.builder()
                .displayName("§2Snivy")
                .item(new ItemStack(PixelmonItemsPokeballs.pokeBall))
                .lore(Arrays.asList("§7Are you sure you want Snivy as your Starter?"))
                .onClick(buttonAction ->  {
                    player.getServer().getCommandManager().executeCommand(server, "pokegive "+ buttonAction.getPlayer().getName() +" Snivy level:5");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &4&l[&9PixelmonStarter&4&l] &r&7It's Dangerous to go alone!");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &7Take this &2Snivy &b"+ buttonAction.getPlayer().getName()+"&7!");
                    player.getServer().getCommandManager().executeCommand(server, "lp user "+ buttonAction.getPlayer().getName()+ " permission set itsdangeroustogoalone.command.starters false");
                    InventoryAPI.getInstance().closePlayerInventory(player);
                })
                .build();

        Button oshawott = Button.builder()
                .displayName("§bOshawott")
                .item(new ItemStack(PixelmonItemsPokeballs.pokeBall))
                .lore(Arrays.asList("§7Are you sure you want Oshawott as your Starter?"))
                .onClick(buttonAction ->  {
                    player.getServer().getCommandManager().executeCommand(server, "pokegive "+ buttonAction.getPlayer().getName() +" Oshawott level:5");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &4&l[&9PixelmonStarter&4&l] &r&7It's Dangerous to go alone!");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &7Take this &bOshawott &b"+ buttonAction.getPlayer().getName()+"&7!");
                    player.getServer().getCommandManager().executeCommand(server, "lp user "+ buttonAction.getPlayer().getName()+ " permission set itsdangeroustogoalone.command.starters false");
                    InventoryAPI.getInstance().closePlayerInventory(player);
                })
                .build();

        Button tepig = Button.builder()
                .displayName("§4Tepig")
                .item(new ItemStack(PixelmonItemsPokeballs.pokeBall))
                .lore(Arrays.asList("§7Are you sure you want Tepig as your Starter?"))
                .onClick(buttonAction ->  {
                    player.getServer().getCommandManager().executeCommand(server, "pokegive "+ buttonAction.getPlayer().getName() +" Tepig level:5");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &4&l[&9PixelmonStarter&4&l] &r&7It's Dangerous to go alone!");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &7Take this &4Tepig &b"+ buttonAction.getPlayer().getName()+"&7!");
                    player.getServer().getCommandManager().executeCommand(server, "lp user "+ buttonAction.getPlayer().getName()+ " permission set itsdangeroustogoalone.command.starters false");
                    InventoryAPI.getInstance().closePlayerInventory(player);
                })
                .build();

        Button back = Button.builder()
                .item(new ItemStack(PixelmonItemsHeld.ejectButton))
                .displayName("§7Click to go Back")
                .onClick(buttonAction -> {StarterUI.StarterSelect(player).forceOpenPage(player);})
                .build();

        Template template = Template.builder(5)
                .fill(panes)
                .set(2, 4, back)
                .set(1, 1, snivy)
                .set(1, 4, tepig)
                .set(1, 7, oshawott)
                .build();

        return Page.builder()
                .template(template)
                .title("§4Gen 5 Starter Pokemon")
                .build();
    }
    public static Page Gen6(EntityPlayerMP player) {
        MinecraftServer server = FMLCommonHandler.instance().getMinecraftServerInstance();
        Button panes = Button.builder()
                .item(new ItemStack(Blocks.STAINED_GLASS_PANE, 1, EnumDyeColor.SILVER.getMetadata()))
                .displayName("")
                .build();

        Button froakie = Button.builder()
                .displayName("§bFroakie")
                .item(new ItemStack(PixelmonItemsPokeballs.pokeBall))
                .lore(Arrays.asList("§7Are you sure you want Froakie as your Starter?"))
                .onClick(buttonAction ->  {
                    player.getServer().getCommandManager().executeCommand(server, "pokegive "+ buttonAction.getPlayer().getName() +" Froakie level:5");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &4&l[&9PixelmonStarter&4&l] &r&7It's Dangerous to go alone!");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &7Take this &bFroakie &b"+ buttonAction.getPlayer().getName()+"&7!");
                    player.getServer().getCommandManager().executeCommand(server, "lp user "+ buttonAction.getPlayer().getName()+ " permission set itsdangeroustogoalone.command.starters false");
                    InventoryAPI.getInstance().closePlayerInventory(player);
                })
                .build();

        Button fennekin = Button.builder()
                .displayName("§4Fennekin")
                .item(new ItemStack(PixelmonItemsPokeballs.pokeBall))
                .lore(Arrays.asList("§7Are you sure you want Fennekin as your Starter?"))
                .onClick(buttonAction ->  {
                    player.getServer().getCommandManager().executeCommand(server, "pokegive "+ buttonAction.getPlayer().getName() +" Fennekin level:5");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &4&l[&9PixelmonStarter&4&l] &r&7It's Dangerous to go alone!");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &7Take this &4Fennekin &b"+ buttonAction.getPlayer().getName()+"&7!");
                    player.getServer().getCommandManager().executeCommand(server, "lp user "+ buttonAction.getPlayer().getName()+ " permission set itsdangeroustogoalone.command.starters false");
                    InventoryAPI.getInstance().closePlayerInventory(player);
                })
                .build();

        Button chespin = Button.builder()
                .displayName("§2Chespin")
                .item(new ItemStack(PixelmonItemsPokeballs.pokeBall))
                .lore(Arrays.asList("§7Are you sure you want Chespin as your Starter?"))
                .onClick(buttonAction ->  {
                    player.getServer().getCommandManager().executeCommand(server, "pokegive "+ buttonAction.getPlayer().getName() +" Chespin level:5");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &4&l[&9PixelmonStarter&4&l] &r&7It's Dangerous to go alone!");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &7Take this &2Chespin &b"+ buttonAction.getPlayer().getName()+"&7!");
                    player.getServer().getCommandManager().executeCommand(server, "lp user "+ buttonAction.getPlayer().getName()+ " permission set itsdangeroustogoalone.command.starters false");
                    InventoryAPI.getInstance().closePlayerInventory(player);
                })
                .build();
        Button back = Button.builder()
                .item(new ItemStack(PixelmonItemsHeld.ejectButton))
                .displayName("§7Click to go Back")
                .onClick(buttonAction -> {StarterUI.StarterSelect(player).forceOpenPage(player);})
                .build();

        Template template = Template.builder(5)
                .fill(panes)
                .set(2, 4, back)
                .set(1, 1, chespin)
                .set(1, 4, fennekin)
                .set(1, 7, froakie)
                .build();

        return Page.builder()
                .template(template)
                .title("§4Gen 6 Starter Pokemon")
                .build();
    }
    public static Page Gen7(EntityPlayerMP player) {
        MinecraftServer server = FMLCommonHandler.instance().getMinecraftServerInstance();
        Button panes = Button.builder()
                .item(new ItemStack(Blocks.STAINED_GLASS_PANE, 1, EnumDyeColor.SILVER.getMetadata()))
                .displayName("")
                .build();

        Button rowlett = Button.builder()
                .displayName("§2Rowlett")
                .item(new ItemStack(PixelmonItemsPokeballs.pokeBall))
                .lore(Arrays.asList("§7Are you sure you want Rowlett as your Starter?"))
                .onClick(buttonAction ->  {
                    player.getServer().getCommandManager().executeCommand(server, "pokegive "+ buttonAction.getPlayer().getName() +" Rowlett level:5");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &4&l[&9PixelmonStarter&4&l] &r&7It's Dangerous to go alone!");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &7Take this &2Rowlett &b"+ buttonAction.getPlayer().getName()+"&7!");
                    player.getServer().getCommandManager().executeCommand(server, "lp user "+ buttonAction.getPlayer().getName()+ " permission set itsdangeroustogoalone.command.starters false");
                    InventoryAPI.getInstance().closePlayerInventory(player);
                })
                .build();

        Button litten = Button.builder()
                .displayName("§4Litten")
                .item(new ItemStack(PixelmonItemsPokeballs.pokeBall))
                .lore(Arrays.asList("§7Are you sure you want Litten as your Starter?"))
                .onClick(buttonAction ->  {
                    player.getServer().getCommandManager().executeCommand(server, "pokegive "+ buttonAction.getPlayer().getName() +" Litten level:5");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &4&l[&9PixelmonStarter&4&l] &r&7It's Dangerous to go alone!");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &7Take this &4Litten &b"+ buttonAction.getPlayer().getName()+"&7!");
                    player.getServer().getCommandManager().executeCommand(server, "lp user "+ buttonAction.getPlayer().getName()+ " permission set itsdangeroustogoalone.command.starters false");
                    InventoryAPI.getInstance().closePlayerInventory(player);
                })
                .build();

        Button popplio = Button.builder()
                .displayName("§bPopplio")
                .item(new ItemStack(PixelmonItemsPokeballs.pokeBall))
                .lore(Arrays.asList("§7Are you sure you want Popplio as your Starter?"))
                .onClick(buttonAction ->  {
                    player.getServer().getCommandManager().executeCommand(server, "pokegive "+ buttonAction.getPlayer().getName() +" Popplio level:5");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &4&l[&9PixelmonStarter&4&l] &r&7It's Dangerous to go alone!");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &7Take this &bPopplio &b"+ buttonAction.getPlayer().getName()+"&7!");
                    player.getServer().getCommandManager().executeCommand(server, "lp user "+ buttonAction.getPlayer().getName()+ " permission set itsdangeroustogoalone.command.starters false");
                    InventoryAPI.getInstance().closePlayerInventory(player);
                })
                .build();

        Button back = Button.builder()
                .item(new ItemStack(PixelmonItemsHeld.ejectButton))
                .displayName("§7Click to go Back")
                .onClick(buttonAction -> {StarterUI.StarterSelect(player).forceOpenPage(player);})
                .build();

        Template template = Template.builder(5)
                .fill(panes)
                .set(2, 4, back)
                .set(1, 1, rowlett)
                .set(1, 4, litten)
                .set(1, 7, popplio)
                .build();

        return Page.builder()
                .template(template)
                .title("§4Gen 7 Starter Pokemon")
                .build();
    }
    public static Page ShinyGen1(EntityPlayerMP player) {
        MinecraftServer server = FMLCommonHandler.instance().getMinecraftServerInstance();

        Button panes = Button.builder()
                .item(new ItemStack(Blocks.STAINED_GLASS_PANE, 1, EnumDyeColor.SILVER.getMetadata()))
                .displayName("")
                .build();

        Button bulbasaur = Button.builder()
                .displayName("§2Bulbasaur")
                .item(new ItemStack(PixelmonItemsPokeballs.pokeBall))
                .lore(Arrays.asList("§7Are you sure you want Bulbasaur as your Starter?"))
                .onClick(buttonAction ->  {
                    player.getServer().getCommandManager().executeCommand(server, "pokegive "+ buttonAction.getPlayer().getName() +" Bulbasaur level:5 s");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &4&l[&9PixelmonStarter&4&l] &r&7It's Dangerous to go alone!");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &7Take this &2Bulbasaur &b"+ buttonAction.getPlayer().getName()+"&7!");
                    player.getServer().getCommandManager().executeCommand(server, "lp user "+ buttonAction.getPlayer().getName()+ " permission set itsdangeroustogoalone.command.starters false");
                    InventoryAPI.getInstance().closePlayerInventory(player);
                })
                .build();

        Button charmander = Button.builder()
                .displayName("§4Charmander")
                .item(new ItemStack(PixelmonItemsPokeballs.pokeBall))
                .lore(Arrays.asList("§7Are you sure you want Charmander as your Starter?"))
                .onClick(buttonAction ->  {
                    player.getServer().getCommandManager().executeCommand(server, "pokegive "+ buttonAction.getPlayer().getName() +" Charmander level:5 s");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &4&l[&9PixelmonStarter&4&l] &r&7It's Dangerous to go alone!");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &7Take this &4Charmander &b"+ buttonAction.getPlayer().getName()+"&7!");
                    player.getServer().getCommandManager().executeCommand(server, "lp user "+ buttonAction.getPlayer().getName()+ " permission set itsdangeroustogoalone.command.starters false");
                    InventoryAPI.getInstance().closePlayerInventory(player);
                })
                .build();

        Button squirtle = Button.builder()
                .displayName("§bSquirtle")
                .item(new ItemStack(PixelmonItemsPokeballs.pokeBall))
                .lore(Arrays.asList("§7Are you sure you want Squirtle as your Starter?"))
                .onClick(buttonAction ->  {
                    player.getServer().getCommandManager().executeCommand(server, "pokegive "+ buttonAction.getPlayer().getName() +" Squirtle level:5 s");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &4&l[&9PixelmonStarter&4&l] &r&7It's Dangerous to go alone!");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &7Take this &bSquirtle &b"+ buttonAction.getPlayer().getName()+"&7!");
                    player.getServer().getCommandManager().executeCommand(server, "lp user "+ buttonAction.getPlayer().getName()+ " permission set itsdangeroustogoalone.command.starters false");
                    InventoryAPI.getInstance().closePlayerInventory(player);
                })
                .build();

        Button back = Button.builder()
                .item(new ItemStack(PixelmonItemsHeld.ejectButton))
                .displayName("§7Click to go Back")
                .onClick(buttonAction -> {StarterUI.StarterSelect(player).forceOpenPage(player);})
                .build();

        Template template = Template.builder(5)
                .fill(panes)
                .set(2, 4, back)
                .set(1, 1, bulbasaur)
                .set(1, 4, charmander)
                .set(1, 7, squirtle)
                .build();

        return Page.builder()
                .template(template)
                .title("§6Shiny Gen 1 Starter Pokemon")
                .build();
    }
    public static Page ShinyGen2(EntityPlayerMP player) {
        MinecraftServer server = FMLCommonHandler.instance().getMinecraftServerInstance();
        Button panes = Button.builder()
                .item(new ItemStack(Blocks.STAINED_GLASS_PANE, 1, EnumDyeColor.SILVER.getMetadata()))
                .displayName("")
                .build();

        Button chikorita = Button.builder()
                .displayName("§2Chikorita")
                .item(new ItemStack(PixelmonItemsPokeballs.pokeBall))
                .lore(Arrays.asList("§7Are you sure you want Chikorita as your Starter?"))
                .onClick(buttonAction ->  {
                    player.getServer().getCommandManager().executeCommand(server, "pokegive "+ buttonAction.getPlayer().getName() +" Chikorita level:5 s");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &4&l[&9PixelmonStarter&4&l] &r&7It's Dangerous to go alone!");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &7Take this &2Chikorita &b"+ buttonAction.getPlayer().getName()+"&7!");
                    player.getServer().getCommandManager().executeCommand(server, "lp user "+ buttonAction.getPlayer().getName()+ " permission set itsdangeroustogoalone.command.starters false");
                    InventoryAPI.getInstance().closePlayerInventory(player);
                })
                .build();

        Button totodile = Button.builder()
                .displayName("§bTotodile")
                .item(new ItemStack(PixelmonItemsPokeballs.pokeBall))
                .lore(Arrays.asList("§7Are you sure you want as your Starter?"))
                .onClick(buttonAction ->  {
                    player.getServer().getCommandManager().executeCommand(server, "pokegive "+ buttonAction.getPlayer().getName() +" Totodile level:5 s");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &4&l[&9PixelmonStarter&4&l] &r&7It's Dangerous to go alone!");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &7Take this &9Totodile &b"+ buttonAction.getPlayer().getName()+"&7!");
                    player.getServer().getCommandManager().executeCommand(server, "lp user "+ buttonAction.getPlayer().getName()+ " permission set itsdangeroustogoalone.command.starters false");
                    InventoryAPI.getInstance().closePlayerInventory(player);
                })
                .build();

        Button cyndaquil = Button.builder()
                .displayName("§4Cyndaquil")
                .item(new ItemStack(PixelmonItemsPokeballs.pokeBall))
                .lore(Arrays.asList("§7Are you sure you want as your Starter?"))
                .onClick(buttonAction ->  {
                    player.getServer().getCommandManager().executeCommand(server, "pokegive "+ buttonAction.getPlayer().getName() +" Cyndaquil level:5 s");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &4&l[&9PixelmonStarter&4&l] &r&7It's Dangerous to go alone!");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &7Take this &4Cyndaquil &b"+ buttonAction.getPlayer().getName()+"&7!");
                    player.getServer().getCommandManager().executeCommand(server, "lp user "+ buttonAction.getPlayer().getName()+ " permission set itsdangeroustogoalone.command.starters false");
                    InventoryAPI.getInstance().closePlayerInventory(player);
                })
                .build();
        Button back = Button.builder()
                .item(new ItemStack(PixelmonItemsHeld.ejectButton))
                .displayName("§7Click to go Back")
                .onClick(buttonAction -> {StarterUI.StarterSelect(player).forceOpenPage(player);})
                .build();

        Template template = Template.builder(5)
                .fill(panes)
                .set(2, 4, back)
                .set(1, 1, chikorita)
                .set(1, 4, cyndaquil)
                .set(1, 7, totodile)
                .build();

        return Page.builder()
                .template(template)
                .title("§6Shiny Gen 2 Starter Pokemon")
                .build();
    }

    public static Page ShinyGen3 (EntityPlayerMP player) {
        MinecraftServer server = FMLCommonHandler.instance().getMinecraftServerInstance();
        Button panes = Button.builder()
                .item(new ItemStack(Blocks.STAINED_GLASS_PANE, 1, EnumDyeColor.SILVER.getMetadata()))
                .displayName("")
                .build();

        Button torchic = Button.builder()
                .displayName("§4Torchic")
                .item(new ItemStack(PixelmonItemsPokeballs.pokeBall))
                .lore(Arrays.asList("§7Are you sure you want Torchic as your Starter?"))
                .onClick(buttonAction ->  {
                    player.getServer().getCommandManager().executeCommand(server, "pokegive "+ buttonAction.getPlayer().getName() +" Torchic level:5 s");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &4&l[&9PixelmonStarter&4&l] &r&7It's Dangerous to go alone!");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &7Take this &4Torchic &b"+ buttonAction.getPlayer().getName()+"&7!");
                    player.getServer().getCommandManager().executeCommand(server, "lp user "+ buttonAction.getPlayer().getName()+ " permission set itsdangeroustogoalone.command.starters false");
                    InventoryAPI.getInstance().closePlayerInventory(player);
                })
                .build();

        Button mudkip = Button.builder()
                .displayName("§9Mudkip")
                .item(new ItemStack(PixelmonItemsPokeballs.pokeBall))
                .lore(Arrays.asList("§7Are you sure you want as Mudkip your Starter?"))
                .onClick(buttonAction ->  {
                    player.getServer().getCommandManager().executeCommand(server, "pokegive "+ buttonAction.getPlayer().getName() +" Mudkip level:5 s");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &4&l[&9PixelmonStarter&4&l] &r&7It's Dangerous to go alone!");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &7Take this &9Mudkip &b"+ buttonAction.getPlayer().getName()+"&7!");
                    player.getServer().getCommandManager().executeCommand(server, "lp user "+ buttonAction.getPlayer().getName()+ " permission set itsdangeroustogoalone.command.starters false");
                    InventoryAPI.getInstance().closePlayerInventory(player);
                })
                .build();

        Button treecko = Button.builder()
                .displayName("§2Treecko")
                .item(new ItemStack(PixelmonItemsPokeballs.pokeBall))
                .lore(Arrays.asList("§7Are you sure you want as your Starter?"))
                .onClick(buttonAction ->  {
                    player.getServer().getCommandManager().executeCommand(server, "pokegive "+ buttonAction.getPlayer().getName() +" Treecko level:5 s");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &4&l[&9PixelmonStarter&4&l] &r&7It's Dangerous to go alone!");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &7Take this &2Treecko &b"+ buttonAction.getPlayer().getName()+"&7!");
                    player.getServer().getCommandManager().executeCommand(server, "lp user "+ buttonAction.getPlayer().getName()+ " permission set itsdangeroustogoalone.command.starters false");
                    InventoryAPI.getInstance().closePlayerInventory(player);
                })
                .build();

        Button back = Button.builder()
                .item(new ItemStack(PixelmonItemsHeld.ejectButton))
                .displayName("§7Click to go Back")
                .onClick(buttonAction -> {StarterUI.StarterSelect(player).forceOpenPage(player);})
                .build();

        Template template = Template.builder(5)
                .fill(panes)
                .set(2, 4, back)
                .set(1, 1, treecko)
                .set(1, 4, torchic)
                .set(1, 7, mudkip)
                .build();

        return Page.builder()
                .template(template)
                .title("§6Shiny Gen 3 Starter Pokemon")
                .build();
    }

    public static Page ShinyGen4(EntityPlayerMP player) {
        MinecraftServer server = FMLCommonHandler.instance().getMinecraftServerInstance();
        Button panes = Button.builder()
                .item(new ItemStack(Blocks.STAINED_GLASS_PANE, 1, EnumDyeColor.SILVER.getMetadata()))
                .displayName("")
                .build();

        Button piplup = Button.builder()
                .displayName("§bPiplup")
                .item(new ItemStack(PixelmonItemsPokeballs.pokeBall))
                .lore(Arrays.asList("§7Are you sure you want Piplup as your Starter?"))
                .onClick(buttonAction ->  {
                    player.getServer().getCommandManager().executeCommand(server, "pokegive "+ buttonAction.getPlayer().getName() +" Piplup level:5 s");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &4&l[&9PixelmonStarter&4&l] &r&7It's Dangerous to go alone!");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &7Take this &bPiplup &b"+ buttonAction.getPlayer().getName()+"&7!");
                    player.getServer().getCommandManager().executeCommand(server, "lp user "+ buttonAction.getPlayer().getName()+ " permission set itsdangeroustogoalone.command.starters false");
                    InventoryAPI.getInstance().closePlayerInventory(player);
                })
                .build();

        Button turtwig = Button.builder()
                .displayName("§2Turtwig")
                .item(new ItemStack(PixelmonItemsPokeballs.pokeBall))
                .lore(Arrays.asList("§7Are you sure you want Turtwig as your Starter?"))
                .onClick(buttonAction ->  {
                    player.getServer().getCommandManager().executeCommand(server, "pokegive "+ buttonAction.getPlayer().getName() +" Turtwig level:5 s");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &4&l[&9PixelmonStarter&4&l] &r&7It's Dangerous to go alone!");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &7Take this &2Turtwig &b"+ buttonAction.getPlayer().getName()+"&7!");
                    player.getServer().getCommandManager().executeCommand(server, "lp user "+ buttonAction.getPlayer().getName()+ " permission set itsdangeroustogoalone.command.starters false");
                    InventoryAPI.getInstance().closePlayerInventory(player);
                })
                .build();

        Button chimchar = Button.builder()
                .displayName("§4Chimchar")
                .item(new ItemStack(PixelmonItemsPokeballs.pokeBall))
                .lore(Arrays.asList("§7Are you sure you want Chimchar as your Starter?"))
                .onClick(buttonAction ->  {
                    player.getServer().getCommandManager().executeCommand(server, "pokegive "+ buttonAction.getPlayer().getName() +" Chimchar level:5 s");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &4&l[&9PixelmonStarter&4&l] &r&7It's Dangerous to go alone!");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &7Take this &4Chimchar &b"+ buttonAction.getPlayer().getName()+"&7!");
                    player.getServer().getCommandManager().executeCommand(server, "lp user "+ buttonAction.getPlayer().getName()+ " permission set itsdangeroustogoalone.command.starters false");
                    InventoryAPI.getInstance().closePlayerInventory(player);
                })
                .build();

        Button back = Button.builder()
                .item(new ItemStack(PixelmonItemsHeld.ejectButton))
                .displayName("§7Click to go Back")
                .onClick(buttonAction -> {StarterUI.StarterSelect(player).forceOpenPage(player);})
                .build();

        Template template = Template.builder(5)
                .fill(panes)
                .set(2, 4, back)
                .set(1, 1, turtwig)
                .set(1, 4, chimchar)
                .set(1, 7, piplup)
                .build();

        return Page.builder()
                .template(template)
                .title("§6Shiny Gen 4 Starter Pokemon")
                .build();
    }
    public static Page ShinyGen5(EntityPlayerMP player) {
        MinecraftServer server = FMLCommonHandler.instance().getMinecraftServerInstance();
        Button panes = Button.builder()
                .item(new ItemStack(Blocks.STAINED_GLASS_PANE, 1, EnumDyeColor.SILVER.getMetadata()))
                .displayName("")
                .build();

        Button snivy = Button.builder()
                .displayName("§2Snivy")
                .item(new ItemStack(PixelmonItemsPokeballs.pokeBall))
                .lore(Arrays.asList("§7Are you sure you want Snivy as your Starter?"))
                .onClick(buttonAction ->  {
                    player.getServer().getCommandManager().executeCommand(server, "pokegive "+ buttonAction.getPlayer().getName() +" Snivy level:5 s");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &4&l[&9PixelmonStarter&4&l] &r&7It's Dangerous to go alone!");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &7Take this &2Snivy &b"+ buttonAction.getPlayer().getName()+"&7!");
                    player.getServer().getCommandManager().executeCommand(server, "lp user "+ buttonAction.getPlayer().getName()+ " permission set itsdangeroustogoalone.command.starters false");
                    InventoryAPI.getInstance().closePlayerInventory(player);
                })
                .build();

        Button oshawott = Button.builder()
                .displayName("§bOshawott")
                .item(new ItemStack(PixelmonItemsPokeballs.pokeBall))
                .lore(Arrays.asList("§7Are you sure you want Oshawott as your Starter?"))
                .onClick(buttonAction ->  {
                    player.getServer().getCommandManager().executeCommand(server, "pokegive "+ buttonAction.getPlayer().getName() +" Oshawott level:5 s");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &4&l[&9PixelmonStarter&4&l] &r&7It's Dangerous to go alone!");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &7Take this &bOshawott &b"+ buttonAction.getPlayer().getName()+"&7!");
                    player.getServer().getCommandManager().executeCommand(server, "lp user "+ buttonAction.getPlayer().getName()+ " permission set itsdangeroustogoalone.command.starters false");
                    InventoryAPI.getInstance().closePlayerInventory(player);
                })
                .build();

        Button tepig = Button.builder()
                .displayName("§4Tepig")
                .item(new ItemStack(PixelmonItemsPokeballs.pokeBall))
                .lore(Arrays.asList("§7Are you sure you want Tepig as your Starter?"))
                .onClick(buttonAction ->  {
                    player.getServer().getCommandManager().executeCommand(server, "pokegive "+ buttonAction.getPlayer().getName() +" Tepig level:5 s");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &4&l[&9PixelmonStarter&4&l] &r&7It's Dangerous to go alone!");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &7Take this &4Tepig &b"+ buttonAction.getPlayer().getName()+"&7!");
                    player.getServer().getCommandManager().executeCommand(server, "lp user "+ buttonAction.getPlayer().getName()+ " permission set itsdangeroustogoalone.command.starters false");
                    InventoryAPI.getInstance().closePlayerInventory(player);
                })
                .build();

        Button back = Button.builder()
                .item(new ItemStack(PixelmonItemsHeld.ejectButton))
                .displayName("§7Click to go Back")
                .onClick(buttonAction -> {StarterUI.StarterSelect(player).forceOpenPage(player);})
                .build();

        Template template = Template.builder(5)
                .fill(panes)
                .set(2, 4, back)
                .set(1, 1, snivy)
                .set(1, 4, tepig)
                .set(1, 7, oshawott)
                .build();

        return Page.builder()
                .template(template)
                .title("§6Shiny Gen 5 Starter Pokemon")
                .build();
    }
    public static Page ShinyGen6(EntityPlayerMP player) {
        MinecraftServer server = FMLCommonHandler.instance().getMinecraftServerInstance();
        Button panes = Button.builder()
                .item(new ItemStack(Blocks.STAINED_GLASS_PANE, 1, EnumDyeColor.SILVER.getMetadata()))
                .displayName("")
                .build();

        Button froakie = Button.builder()
                .displayName("§bFroakie")
                .item(new ItemStack(PixelmonItemsPokeballs.pokeBall))
                .lore(Arrays.asList("§7Are you sure you want Froakie as your Starter?"))
                .onClick(buttonAction ->  {
                    player.getServer().getCommandManager().executeCommand(server, "pokegive "+ buttonAction.getPlayer().getName() +" Froakie level:5 s");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &4&l[&9PixelmonStarter&4&l] &r&7It's Dangerous to go alone!");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &7Take this &bFroakie &b"+ buttonAction.getPlayer().getName()+"&7!");
                    player.getServer().getCommandManager().executeCommand(server, "lp user "+ buttonAction.getPlayer().getName()+ " permission set itsdangeroustogoalone.command.starters false");
                    InventoryAPI.getInstance().closePlayerInventory(player);
                })
                .build();

        Button fennekin = Button.builder()
                .displayName("§4Fennekin")
                .item(new ItemStack(PixelmonItemsPokeballs.pokeBall))
                .lore(Arrays.asList("§7Are you sure you want Fennekin as your Starter?"))
                .onClick(buttonAction ->  {
                    player.getServer().getCommandManager().executeCommand(server, "pokegive "+ buttonAction.getPlayer().getName() +" Fennekin level:5 s");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &4&l[&9PixelmonStarter&4&l] &r&7It's Dangerous to go alone!");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &7Take this &4Fennekin &b"+ buttonAction.getPlayer().getName()+"&7!");
                    player.getServer().getCommandManager().executeCommand(server, "lp user "+ buttonAction.getPlayer().getName()+ " permission set itsdangeroustogoalone.command.starters false");
                    InventoryAPI.getInstance().closePlayerInventory(player);
                })
                .build();

        Button chespin = Button.builder()
                .displayName("§2Chespin")
                .item(new ItemStack(PixelmonItemsPokeballs.pokeBall))
                .lore(Arrays.asList("§7Are you sure you want Chespin as your Starter?"))
                .onClick(buttonAction ->  {
                    player.getServer().getCommandManager().executeCommand(server, "pokegive "+ buttonAction.getPlayer().getName() +" Chespin level:5 s");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &4&l[&9PixelmonStarter&4&l] &r&7It's Dangerous to go alone!");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &7Take this &2Chespin &b"+ buttonAction.getPlayer().getName()+"&7!");
                    player.getServer().getCommandManager().executeCommand(server, "lp user "+ buttonAction.getPlayer().getName()+ " permission set itsdangeroustogoalone.command.starters false");
                    InventoryAPI.getInstance().closePlayerInventory(player);
                })
                .build();
        Button back = Button.builder()
                .item(new ItemStack(PixelmonItemsHeld.ejectButton))
                .displayName("§7Click to go Back")
                .onClick(buttonAction -> {StarterUI.StarterSelect(player).forceOpenPage(player);})
                .build();

        Template template = Template.builder(5)
                .fill(panes)
                .set(2, 4, back)
                .set(1, 1, chespin)
                .set(1, 4, fennekin)
                .set(1, 7, froakie)
                .build();

        return Page.builder()
                .template(template)
                .title("§4Gen 6 Starter Pokemon")
                .build();
    }
    public static Page ShinyGen7(EntityPlayerMP player) {
        MinecraftServer server = FMLCommonHandler.instance().getMinecraftServerInstance();
        Button panes = Button.builder()
                .item(new ItemStack(Blocks.STAINED_GLASS_PANE, 1, EnumDyeColor.SILVER.getMetadata()))
                .displayName("")
                .build();

        Button rowlett = Button.builder()
                .displayName("§2Rowlett")
                .item(new ItemStack(PixelmonItemsPokeballs.pokeBall))
                .lore(Arrays.asList("§7Are you sure you want Rowlett as your Starter?"))
                .onClick(buttonAction ->  {
                    player.getServer().getCommandManager().executeCommand(server, "pokegive "+ buttonAction.getPlayer().getName() +" Rowlett level:5 s");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &4&l[&9PixelmonStarter&4&l] &r&7It's Dangerous to go alone!");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &7Take this &2Rowlett &b"+ buttonAction.getPlayer().getName()+"&7!");
                    player.getServer().getCommandManager().executeCommand(server, "lp user "+ buttonAction.getPlayer().getName()+ " permission set itsdangeroustogoalone.command.starters false");
                    InventoryAPI.getInstance().closePlayerInventory(player);
                })
                .build();

        Button litten = Button.builder()
                .displayName("§4Litten")
                .item(new ItemStack(PixelmonItemsPokeballs.pokeBall))
                .lore(Arrays.asList("§7Are you sure you want Litten as your Starter?"))
                .onClick(buttonAction ->  {
                    player.getServer().getCommandManager().executeCommand(server, "pokegive "+ buttonAction.getPlayer().getName() +" Litten level:5 s");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &4&l[&9PixelmonStarter&4&l] &r&7It's Dangerous to go alone!");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &7Take this &4Litten &b"+ buttonAction.getPlayer().getName()+"&7!");
                    player.getServer().getCommandManager().executeCommand(server, "lp user "+ buttonAction.getPlayer().getName()+ " permission set itsdangeroustogoalone.command.starters false");
                    InventoryAPI.getInstance().closePlayerInventory(player);
                })
                .build();

        Button popplio = Button.builder()
                .displayName("§bPopplio")
                .item(new ItemStack(PixelmonItemsPokeballs.pokeBall))
                .lore(Arrays.asList("§7Are you sure you want Popplio as your Starter?"))
                .onClick(buttonAction ->  {
                    player.getServer().getCommandManager().executeCommand(server, "pokegive "+ buttonAction.getPlayer().getName() +" Popplio level:5 s");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &4&l[&9PixelmonStarter&4&l] &r&7It's Dangerous to go alone!");
                    player.getServer().getCommandManager().executeCommand(server, "plaintell "+ buttonAction.getPlayer().getName()+ " &7Take this &bPopplio &b"+ buttonAction.getPlayer().getName()+"&7!");
                    player.getServer().getCommandManager().executeCommand(server, "lp user "+ buttonAction.getPlayer().getName()+ " permission set itsdangeroustogoalone.command.starters false");
                    InventoryAPI.getInstance().closePlayerInventory(player);
                })
                .build();

        Button back = Button.builder()
                .item(new ItemStack(PixelmonItemsHeld.ejectButton))
                .displayName("§7Click to go Back")
                .onClick(buttonAction -> {StarterUI.StarterSelect(player).forceOpenPage(player);})
                .build();

        Template template = Template.builder(5)
                .fill(panes)
                .set(2, 4, back)
                .set(1, 1, rowlett)
                .set(1, 4, litten)
                .set(1, 7, popplio)
                .build();

        return Page.builder()
                .template(template)
                .title("§6Shiny Gen 7 Starter Pokemon")
                .build();
    }
}
