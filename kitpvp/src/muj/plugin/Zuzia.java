package muj.plugin;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Zuzia implements Listener {
    @EventHandler
    public void powitanie (PlayerJoinEvent pszyszedl) {
        if(pszyszedl.getPlayer().getName().startsWith("a"))
            pszyszedl.getPlayer().sendMessage("Swietny mem, tak trzymaj! <3");
        if(pszyszedl.getPlayer().getName().startsWith("g"))
            for(Player p : Bukkit.getOnlinePlayers()){
                p.sendMessage(pszyszedl.getPlayer().getName()+"to Wartosciowy uzytkownik pozdrawiam");
            }
        if(pszyszedl.getPlayer().getName().startsWith("y"))
            Bukkit.broadcastMessage("niefajny gracz niepolecam");
        if(!pszyszedl.getPlayer().getName().startsWith("a"+"g"+"y".toLowerCase()))
            for(Player p: Bukkit.getOnlinePlayers()){
            p.sendMessage("hejka uwu");
        }
        if(!pszyszedl.getPlayer().getName().startsWith("a"+"g"+"y".toUpperCase()))
            for(Player p: Bukkit.getOnlinePlayers()){
                p.sendMessage("Gracz"+pszyszedl.getPlayer().getName()+"pszyszedl uwu hihi!");
            }
    }
}