package xyz.ichiidev.betterrpg.utils;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.inventory.meta.BookMeta;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

import java.util.ArrayList;

public class RecipeUtils {

//    ArrayList<ShapedRecipe> shapedRecipes = new ArrayList<ShapedRecipe>();
    ArrayList<ShapelessRecipe> shapelessRecipes = new ArrayList<ShapelessRecipe>();

    public void loadRecipes(Plugin plugin) {

        ItemStack item;
//        ItemMeta meta;
        BookMeta bmeta;
//        ShapedRecipe sRecipe;
        ShapelessRecipe slRecipe;
        NamespacedKey key;

        item = new ItemStack(Material.WRITTEN_BOOK);
        bmeta = (BookMeta) item.getItemMeta();
        bmeta.setDisplayName("§3The Quest Grimory");
        bmeta.setAuthor("The Creator");
        bmeta.addEnchant(Enchantment.DURABILITY, 1, true);
        item.setItemMeta(bmeta);
        key = new NamespacedKey(plugin, "rpg_grimory");
        slRecipe = new ShapelessRecipe(key, item);
        slRecipe.addIngredient(Material.BOOK);
        slRecipe.addIngredient(Material.DIAMOND);
        this.shapelessRecipes.add(slRecipe);

    }

    public void registerRecipes() {
        for (ShapelessRecipe recipe: shapelessRecipes) {
            Bukkit.addRecipe(recipe);
        }
    }
}
