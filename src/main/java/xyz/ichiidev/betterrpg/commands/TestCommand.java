package xyz.ichiidev.betterrpg.commands;

import io.github.theluca98.textapi.Title;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import xyz.ichiidev.betterrpg.utils.PlayerUtils;
import xyz.ichiidev.betterrpg.utils.enums.Achievements;

public class TestCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {

        PlayerUtils utils = new PlayerUtils((Player) sender);
        utils.addAchievement(Achievements.FIRST_STEPS);

        return true;
    }
}
