package org.waqe.pl.customrecipes;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public final class CustomRecipes extends JavaPlugin {

    @Override
    public void onEnable() {
    //    getServer().getPluginManager().registerEvents(new MyEvents(), this);

        ItemStack apple = new ItemStack(Material.APPLE);
        NamespacedKey applekey = new NamespacedKey(this, "apple_key");
        ShapedRecipe applerecipe = new ShapedRecipe(applekey, apple);

        // space represents nothing
        // use any chars you want
        applerecipe.shape("   "," W "," T ");
        applerecipe.setIngredient('W', Material.WATER_BUCKET);
        applerecipe.setIngredient('T', Material.OAK_SAPLING);

        Bukkit.addRecipe(applerecipe);





        // shapeless place 3 apples (not stacked) anywhere on table....
        ItemStack gapple = new ItemStack(Material.GOLDEN_APPLE);
        NamespacedKey gapplekey = new NamespacedKey(this, "gapple_key");
        ShapelessRecipe gapplerecipe = new ShapelessRecipe(gapplekey, gapple);
        gapplerecipe.addIngredient(3, Material.APPLE);
        gapplerecipe.addIngredient(3, Material.DIAMOND);

        Bukkit.addRecipe(gapplerecipe);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
