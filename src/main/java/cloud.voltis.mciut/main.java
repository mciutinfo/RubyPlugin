package cloud.voltis.mciut;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin{

    @Override
    public void onEnable(){
        Bukkit.getConsoleSender().sendMessage("§aPlugin enabled!");
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info(ChatColor.RED + "Disabled " + this.getName());
    }




}
