package xyz.ichiidev.betterrpg.utils.guis;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.ipvp.canvas.type.ChestMenu;

import java.util.ArrayList;

public class GrimoryMainGUI {

    public static void openGUI(Player p) {
        ChestMenu menu = ChestMenu.builder(1).title("§3Grimory's Summary").build();
        ItemStack item;
        ItemMeta meta;
        ArrayList<String> lore;

        item = new ItemStack(Material.DIAMOND);
        meta = item.getItemMeta();
        meta.setDisplayName("§3Skills");
        lore = new ArrayList<>();
        lore.add("§8Your skill table & levels");
        meta.setLore(lore);
        item.setItemMeta(meta);
        menu.getSlot(0).setItem(item);

        item = new ItemStack(Material.BOOK);
        meta = item.getItemMeta();
        meta.setDisplayName("§3Classes");
        lore = new ArrayList<>();
        lore.add("§8Choose your class in this tab");
        meta.setLore(lore);
        item.setItemMeta(meta);
        menu.getSlot(4).setItem(item);

        item = new ItemStack(Material.EXP_BOTTLE);
        meta = item.getItemMeta();
        meta.setDisplayName("§3Achievements");
        lore = new ArrayList<>();
        lore.add("§8Track your achievements here");
        meta.setLore(lore);
        item.setItemMeta(meta);
        menu.getSlot(8).setItem(item);

        p.playSound(p.getLocation(), Sound.BLOCK_ENCHANTMENT_TABLE_USE, 1, 1);
        menu.open(p);
    }

    public static void interactGUI(InventoryClickEvent event) {
        switch (event.getSlot()) {
        }

        event.setCancelled(true);
    }

}
