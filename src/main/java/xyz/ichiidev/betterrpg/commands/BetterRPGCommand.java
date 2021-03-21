package xyz.ichiidev.betterrpg.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import xyz.ichiidev.betterrpg.main;

import java.io.IOException;

public class BetterRPGCommand implements CommandExecutor {

    main plugin;

    public BetterRPGCommand(main plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        String argument;
        if (args.length < 1) argument = "";
        else argument = args[0];
        switch (argument) {
            case "help":
                sender.sendMessage("§3Better-RPG's commands:\n§f- §3/brpg reload\n§f- §3/brpg help\n§f- §3/brpg about");
                break;
            case "reload":
                if (sender.hasPermission("brpg.admin")) {
                    sender.sendMessage("§7[§3BRPG§7]§3 Reloading the config....");
                    this.plugin.reloadConfig();
                    sender.sendMessage("§7[§3BRPG§7]§3 Config reloaded!");
                    System.out.println("[BRPG] the config was reloaded by " + sender.getName());
                    break;
                }
                sender.sendMessage("§4" + sender.getName() + " is not in sudoers file. this incident will be reported.");
                System.out.println(sender.getName() + " tried to reload the BRPG configuration file but wasn't allowed to do so.");
                break;

            case "about":
                sender.sendMessage("§2Better-RPG§3 is a plugin made by §2IchiiDev§3 to improve the RPG experience in minecraft multiplayer. Jobs, Skills & more are added to the game by this plugin.");
                break;
            default:
                sender.sendMessage("§3This is the default command for §2Better-RPG§3, type §2\"/brpg help\"§3 for the commands list");
        }

        return true;
    }

}
