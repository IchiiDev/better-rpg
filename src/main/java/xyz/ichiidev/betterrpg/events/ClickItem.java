package xyz.ichiidev.betterrpg.events;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import xyz.ichiidev.betterrpg.utils.guis.GrimoryMainGUI;

public class ClickItem implements Listener {

    @EventHandler
    public void onItemClick(PlayerInteractEvent event) {
        if (event.getItem() == null) return;
        ItemStack item = event.getItem();
        ItemMeta meta = item.getItemMeta();
        if (item.getType() == Material.WRITTEN_BOOK && meta.getDisplayName().equals("§3The Quest Grimory")) {
            event.setCancelled(true);
            GrimoryMainGUI.openGUI(event.getPlayer());
        }
    }

}
