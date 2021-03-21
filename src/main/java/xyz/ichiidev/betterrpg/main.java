package xyz.ichiidev.betterrpg;

import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Better RPG has started, time to farm !");
    }

    @Override
    public void onDisable() {
        System.out.println("The plugin is now disabled");
    }

}
