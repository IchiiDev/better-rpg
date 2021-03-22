package xyz.ichiidev.betterrpg.commands;

import io.github.theluca98.textapi.Title;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TestCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {

        Title title = new Title("1", "2", 20, 60, 20);
        title.send((Player) sender);

        return true;
    }
}
