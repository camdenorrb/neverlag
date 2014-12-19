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
		if(label.equalsIgnoreCase("fixlag")){
			if(player.hasPermission("fixlag.fix")) {
			if(args.length == 0){
				player.performCommand("lagg gc"); 
				player.performCommand("lagg unloadchunks");
				player.performCommand("lagg clear");
				player.performCommand("lag");
				}
				}
			
			if(args[0].equals("help")) {
				player.sendMessage("Run /fixlag to clear lag. The plugin, ClearLagg (http://goo.gl/E18aH) is required for FixLag to work. This plugin was made by myHub MC Developers.");
			}
			else {
			player.sendMessage ("Unrecognized command. Type /fixlag help for help or /fixlag to clear the lag.");
			}
			}
		return false;
	}

}