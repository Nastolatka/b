package muj.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public class klasa extends JavaPlugin {
    @Override
    public void onEnable() {
getServer().getPluginManager().registerEvents(new Zuzia(), this);
    }
}