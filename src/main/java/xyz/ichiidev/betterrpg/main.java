package xyz.ichiidev.betterrpg;

import org.bukkit.plugin.java.JavaPlugin;
import xyz.ichiidev.betterrpg.commands.BetterRPGCommand;

public class main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Better RPG has started, time to farm ! :p");

        saveDefaultConfig();

        registerCommands();
    }

    @Override
    public void onDisable() {
        System.out.println("The plugin is now disabled");
    }

    private void registerCommands() {
        getCommand("better-rpg").setExecutor(new BetterRPGCommand(this));
    }

}
