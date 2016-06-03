package com.gitlab.boraware.neverlag;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public final class neverlag extends JavaPlugin {
    @Override
    public void onEnable() {
    	getLogger().info("NeverLag has been enabled!");
    }
    
    @Override
    public void onDisable() {
    	getLogger().info("NeverLag has been disabled!");
    }
    
    @Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		if (cmd.getName().equalsIgnoreCase("nl")) {
			if (args.length == 0) {
				if (sender.hasPermission("nl.lag")) {
					Bukkit.getServer().dispatchCommand(
							Bukkit.getConsoleSender(), "lagg gc");
					Bukkit.getServer().dispatchCommand(
							Bukkit.getConsoleSender(), "lagg clear");
					Bukkit.getServer().dispatchCommand(
							Bukkit.getConsoleSender(), "lagg unloadchunks");
					Bukkit.getServer().dispatchCommand(
							Bukkit.getConsoleSender(), "lagg");
					sender.sendMessage(ChatColor.AQUA
							+ "The server lag has been cleared.");
				}
			} else if (args.length > 0 && args[0].equalsIgnoreCase("help")) {
				sender.sendMessage(ChatColor.GREEN
						+ "Run /nl to clear lag. The plugin, ClearLagg http://goo.gl/E18aH is required for NeverLag to work. This plugin was made by boz and poke. The permission to run NeverLag is nl.lag. You can toggle the automatic lagg clearing with /nl toggle.");
			} else {
				sender.sendMessage("Unrecognized command! Type /nl help for help or /nl to clear the lag. NeverLag permission: nl.lag");
			}
		}
		return true;
	}
}