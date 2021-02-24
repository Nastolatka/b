package muj.plugin;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class klasa extends JavaPlugin {
    @Override
    public void onEnable() {
getServer().getPluginManager().registerEvents(new Zuzia2(), this);
    }
    public static String prefix = ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "[LMAO]";
}