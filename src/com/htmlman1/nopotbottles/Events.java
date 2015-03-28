package com.htmlman1.nopotbottles;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.ItemStack;

public class Events implements Listener {

	@EventHandler
	public void onPlayerItemConsume(final PlayerItemConsumeEvent event) {
		ItemStack item = event.getItem();
		if(item.getType() == Material.POTION) {
			short datavalue = item.getDurability();
			if(datavalue > 0) {
				Bukkit.getScheduler().runTaskLater(Main.plugin, new Runnable() {
					public void run() {
						event.getPlayer().setItemInHand(new ItemStack(Material.AIR));
					}
				}, 1);
			}
		}
	}
	
}
