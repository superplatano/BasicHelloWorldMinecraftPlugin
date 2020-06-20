package me.gabriel.helloworld;

import me.gabriel.helloworld.commands.HelloCommands;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		new HelloCommands(this);
	}

}
