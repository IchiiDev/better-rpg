package xyz.ichiidev.betterrpg;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.ichiidev.betterrpg.commands.BetterRPGCommand;
import xyz.ichiidev.betterrpg.commands.TestCommand;
import xyz.ichiidev.betterrpg.events.ClickItem;
import xyz.ichiidev.betterrpg.utils.InvUtils;
import xyz.ichiidev.betterrpg.utils.RecipeUtils;

public class main extends JavaPlugin {
    public static JavaPlugin plugin;

    @Override
    public void onEnable() {
        System.out.println("Better RPG has started, time to farm ! :p");

        saveDefaultConfig();

        plugin = this;

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
        getCommand("test").setExecutor(new TestCommand());
    }

    private void registerEvents() {
        getServer().getPluginManager().registerEvents(new ClickItem(), this);
        getServer().getPluginManager().registerEvents(new InvUtils(), this);
    }

}
