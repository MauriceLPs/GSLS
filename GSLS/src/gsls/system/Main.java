package gsls.system;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import gsls.system.listener.ScoreboardCLS;

public class Main extends JavaPlugin{
	
	public static String prefix = "�aRedi�cCraft �7� ";
	public static String mysqlprefix = "�6MySQL �7� ";
	public static String noperm = prefix + "�cInsufficent Permissions!";
	public static String consolesend = prefix + "�aPlease run the command on the game server.";
	public static String unavailable = prefix + "�cOoops. Thats currently unavailable.";
	public static Main instance;
	public static ArrayList<String> afk_list = new ArrayList<>();
	
	public void onEnable() {
		Bukkit.getConsoleSender().sendMessage(prefix + "�aPlugin will be activating...");
		Bukkit.getMessenger().registerOutgoingPluginChannel(this, "BungeeCord");
		instance = this;
		registerEvent();
		registerMisc();
		Bukkit.getConsoleSender().sendMessage(prefix + "�aPlugin is activated and running!");
	}
	
	public void onDisable() {
		Bukkit.getConsoleSender().sendMessage(prefix + "�cPlugin will be stopping...");
		Bukkit.getConsoleSender().sendMessage(prefix + "�cPlugin is stopped.");
	}
	
	private void registerMisc() {
		ScoreboardCLS.startScheduler(0, 100, 20);
	}
	
	private void registerEvent() {
		PluginManager pl = Bukkit.getPluginManager();
		pl.registerEvents(new ScoreboardCLS(), this);
	}

}
