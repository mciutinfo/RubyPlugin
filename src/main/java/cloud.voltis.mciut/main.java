package cloud.voltis.mciut;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin{

    @Override
    public void onEnable(){

        Bukkit.getConsoleSender().sendMessage("§aLoading plugin ...");

        // listeners
        Bukkit.getPluginManager().registerEvents(new deathListener(), this);
        Bukkit.getPluginManager().registerEvents(new rubyItemProtection(), this);

        // commandes
        this.getCommand("doc").setExecutor(new docCommand());

        Bukkit.getConsoleSender().sendMessage("§aPlugin enabled!");
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info(ChatColor.RED + "Disabled " + this.getName());
    }

}
