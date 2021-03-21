package xyz.ichiidev.betterrpg.events;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ClickItem implements Listener {

    @EventHandler
    public void onItemClick(PlayerInteractEvent event) {
        ItemStack item = event.getItem();
        ItemMeta meta = item.getItemMeta();
        event.getPlayer().sendMessage(item.getType().name() + " " + meta.getDisplayName());
        System.out.println(item.getType() == Material.WRITTEN_BOOK && meta.getDisplayName().equals("§3The Quest Grimory"));
        if (item.getType() == Material.WRITTEN_BOOK && meta.getDisplayName().equals("§3The Quest Grimory")) {
            event.setCancelled(true);
        }
    }

}
