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
			if(args.length == 0){
				if(player.hasPermission("nl.lag")) {
					Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lagg gc"); 
					Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lagg clear"); 
					Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lagg unloadchunks"); 
					Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lagg"); 
				}
			}
			else if(args[0].equals("help")) {
				player.sendMessage(ChatColor.GREEN + "Run /nl to clear lag. The plugin, ClearLagg http://goo.gl/E18aH is required for NeverLag to work. This plugin was made by myHub MC Developers.");
			} else {
			player.sendMessage ("Unrecognized command! Type /nl help for help or /nl to clear the lag.");
			}
		}
	return false; 
	}
}
