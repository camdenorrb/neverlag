package com.myhublive.mc.NeverLag;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class NeverLag extends JavaPlugin {
	
	public void onEnable() {
		
	}
	
	public void onDisable() {
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		Player player = (Player) sender;
		if(label.equalsIgnoreCase("nl")){
			if(player.hasPermission("nl.fix")) {
			if(args.length == 0){
				player.performCommand("lagg gc"); 
				player.performCommand("lagg unloadchunks");
				player.performCommand("lagg clear");
				player.performCommand("lag");
				}
				}
			
			if(args[0].equals("help")) {
				player.sendMessage("Run /nl to clear lag. The plugin, ClearLagg (http://goo.gl/E18aH) is required for NeverLag to work. This plugin was made by myHub MC Developers.");
			}
			else {
			player.sendMessage ("Unrecognized command! Type /nl help for help or /nl to clear the lag.");
			}
			}
		return false;
	}

}