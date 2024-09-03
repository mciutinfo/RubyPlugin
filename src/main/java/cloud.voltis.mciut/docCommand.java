package cloud.voltis.mciut;

import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class docCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        TextComponent message = new TextComponent("Clique ");

        TextComponent here = new TextComponent("ici");
        here.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://minecraft.bdeinfo.fr"));
        here.setUnderlined(true);

        TextComponent message2 = new TextComponent(" pour accéder à la documentation du serveur.");

        message.addExtra(here);
        message.addExtra(message2);

        message.setColor(net.md_5.bungee.api.ChatColor.GOLD);

        sender.spigot().sendMessage(message);
        return true;
    }
}
