package me.mrCookieSlime.Slimefun.Objects.SlimefunItem;

import org.bukkit.inventory.ItemStack;

import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.interfaces.Soulbound;

/**
 * Represents an Item that will not drop on death.
 * 
 * @author TheBusyBiscuit
 *
 */
public class SoulboundItem extends SlimefunItem implements Soulbound {

	public SoulboundItem(Category category, ItemStack item, String id, ItemStack[] recipe) {
		super(category, item, id, RecipeType.MAGIC_WORKBENCH, recipe);
	}
	
	public SoulboundItem(Category category, ItemStack item, String id, RecipeType type, ItemStack[] recipe) {
		super(category, item, id, type, recipe);
	}

}
