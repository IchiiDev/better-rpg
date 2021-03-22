package xyz.ichiidev.betterrpg.utils;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import xyz.ichiidev.betterrpg.utils.guis.GrimoryMainGUI;

public class InvUtils implements Listener {

    @EventHandler
    public static void playerClickInventory(InventoryClickEvent event) {

        switch (event.getInventory().getTitle()) {
            case "§3Grimory's Summary":
                GrimoryMainGUI.interactGUI(event);
                break;

        }


    }

}
