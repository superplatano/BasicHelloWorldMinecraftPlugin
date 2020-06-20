package me.gabriel.helloworld.commands;

import me.gabriel.helloworld.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class HelloCommands implements CommandExecutor{
	
	@SuppressWarnings("unused")
	private Main plugin;
	
	public HelloCommands(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("hello").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("What are you? Oh the ruddy cmd!");
			return true;
		}
		
		Player player = (Player) sender;
		
		if (player.hasPermission("hello.say")) {
			player.sendMessage("Hello. How are you on this fine day?");
			return true;
		}else {
			player.sendMessage("You are either a big idiot and don't have permission or you are using a cracked client");
		}
		return false;
	}

}
