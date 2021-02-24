package muj.plugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Zuzia2 implements Listener {
    @EventHandler
    public void powitanie (PlayerJoinEvent pszyszedl){
        Player p = pszyszedl.getPlayer();
        char ch = p.getName().charAt(0);
        char Jacek = Character.toLowerCase(ch);
        if(Jacek == 'a'){pszyszedl.getPlayer().sendMessage(klasa.prefix + ChatColor.BOLD + "" + ChatColor.GRAY + "Swietny mem, tak trzymaj! <3");
        }
        else if (Jacek == 'g'){
            for (Player player:Bukkit.getOnlinePlayers()){
                player.sendMessage(klasa.prefix + ChatColor.BOLD + "" + ChatColor.WHITE + pszyszedl.getPlayer().getName() + ChatColor.GRAY + "to Wartosciowy uzytkownik pozdrawiam");
            }
        }
        else if (Jacek == 'y'){
            Bukkit.broadcastMessage(klasa.prefix + ChatColor.BOLD + "" + ChatColor.WHITE + pszyszedl.getPlayer().getName()+ ChatColor.GRAY + "to niefajny gracz niepolecam");
        }
        else if (Character.isUpperCase(ch)){
            for (Player player : Bukkit.getOnlinePlayers()){
                player.sendMessage("hejka uwu");
            }
        }
        else for (Player player : Bukkit.getOnlinePlayers()){
            player.sendMessage(klasa.prefix + ChatColor.BOLD + "" + ChatColor.GRAY + "Gracz" + ChatColor.WHITE + pszyszedl.getPlayer().getName() + ChatColor.GRAY +"pszyszedl uwu hihi!");
            }
        }
    }
