package xyz.ichiidev.betterrpg.utils;

import io.github.theluca98.textapi.Title;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import xyz.ichiidev.betterrpg.utils.enums.Achievements;
import xyz.ichiidev.betterrpg.main;

public class PlayerUtils {

    public Player player;

    public PlayerUtils(Player p) {
        this.player = p;
    }

    public void addAchievement(Achievements achievement) {

        // TODO: Add DB insertion

        Title title = new Title(achievement.type.color + achievement.title, "§2" + achievement.subtitle, 20, 60, 20);
        title.send(player);

        if (main.plugin.getConfig().getBoolean("broadcast_achievements")) Bukkit.broadcastMessage("§3" + player.getDisplayName() + "§7 has unlocked the achievement " + achievement.type.color + achievement.title);

        player.playSound(player.getLocation(), achievement.type.sound, 1, 1);
    }
}
