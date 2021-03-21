package xyz.ichiidev.betterrpg;

import org.bukkit.plugin.java.JavaPlugin;
import xyz.ichiidev.betterrpg.commands.BetterRPGCommand;
import xyz.ichiidev.betterrpg.events.ClickItem;
import xyz.ichiidev.betterrpg.utils.RecipeUtils;

public class main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Better RPG has started, time to farm ! :p");

        saveDefaultConfig();

        registerCommands();
        registerEvents();

        RecipeUtils recipes = new RecipeUtils();
        recipes.loadRecipes(this);
        recipes.registerRecipes();
    }

    @Override
    public void onDisable() {
        System.out.println("The plugin is now disabled");
    }

    private void registerCommands() {
        getCommand("better-rpg").setExecutor(new BetterRPGCommand(this));
    }

    private void registerEvents() {
        getServer().getPluginManager().registerEvents(new ClickItem(), this);
    }

}
