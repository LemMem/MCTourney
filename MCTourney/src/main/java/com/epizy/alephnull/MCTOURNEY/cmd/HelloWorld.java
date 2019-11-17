package com.epizy.alephnull.MCTOURNEY.cmd;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.epizy.alephnull.MCTOURNEY.App;

public class HelloWorld implements CommandExecutor {

	private App plugin;
	
	public HelloWorld(App running) {
		plugin = running;
		plugin.getCommand("helloworld").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(!(sender instanceof Player)) {
			sender.sendMessage("Only players may execute this command");
			return true;
		}
		sender.sendMessage("Hello, World!");
		return true;
	}

}
