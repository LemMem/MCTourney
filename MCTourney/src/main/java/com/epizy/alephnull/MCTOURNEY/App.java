package com.epizy.alephnull.MCTOURNEY;

import org.bukkit.plugin.java.JavaPlugin;

import com.epizy.alephnull.MCTOURNEY.cmd.HelloWorld;

/**
 * This plugin was made by Aleph Null
 * If anyone pretends to be Aleph Null and steals this plugin's file, please download the real plugin at (Insert web url here)
 */
public class App extends JavaPlugin
{
	@Override
	public void onEnable() {
		new HelloWorld(this);
	}
}
