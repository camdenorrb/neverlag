package me.camdenorrb.neverlag;

import me.camdenorrb.neverlag.cmds.NlCmd;
import org.bukkit.plugin.java.JavaPlugin;


public class NeverLag extends JavaPlugin {

	@Override
	public void onEnable() {
		getCommand("nl").setExecutor(new NlCmd());
	}

}
