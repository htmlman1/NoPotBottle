package com.htmlman1.nopotbottles;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public static Plugin plugin;

	@Override
	public void onDisable() { plugin = null; }
	
	@Override
	public void onEnable() {
		plugin = this;
		getServer().getPluginManager().registerEvents(new Events(), this);
	}
	
}
