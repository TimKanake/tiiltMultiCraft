package com.timkanake.multicraft;

import java.sql.Connection;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class MultiCraft extends JavaPlugin{
	public Connection connection;
	
	@Override
	public void onEnable() {
		getLogger().info("MultiCraft has been enabled");
		PluginManager pm = getServer().getPluginManager();
		this.getCommand("mbuild").setExecutor(new MultiCraftCommandExecutor(this));
		
		MySQL.connect();
		InventoryListener inventoryListener = new InventoryListener(this);
		pm.registerEvents(inventoryListener,  this);
		
		
	 LocationsListener locationsListener = new LocationsListener(this);
	 pm.registerEvents(locationsListener, this);
		
		
		new SpeechToTextServer(this).start();
		new CommandsListener(this).start();
		new CommandExecution(this).start();
	}
	
	@Override
	public void onDisable() {
		
		MySQL.disconnect();
		getLogger().info("MultiCraft has been disabled");
	}
	
}
