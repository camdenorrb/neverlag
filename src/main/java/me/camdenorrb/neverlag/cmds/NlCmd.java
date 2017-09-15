package me.camdenorrb.neverlag.cmds;


import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;

import static org.bukkit.ChatColor.AQUA;


public class NlCmd implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		ConsoleCommandSender consoleSender = Bukkit.getConsoleSender();

		Bukkit.dispatchCommand(consoleSender, "lagg gc");
		Bukkit.dispatchCommand(consoleSender, "lagg clear");
		Bukkit.dispatchCommand(consoleSender, "lagg unloadchunks");

		sender.sendMessage(AQUA + "The server lag has been cleared.");
		return true;
	}

}
