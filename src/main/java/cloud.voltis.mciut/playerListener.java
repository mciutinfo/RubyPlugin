package cloud.voltis.mciut;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;


public class playerListener implements Listener {

    @EventHandler
    public void playerJoin(PlayerJoinEvent event) {

        if (!event.getPlayer().hasPlayedBefore()) {
            event.getPlayer().sendMessage("§aBienvenue sur le serveur !");

            event.getPlayer().sendMessage("Si ce n'est pas déjà fait, prends connaissance de la documentation du serveur en faisant /doc");

            


            event.getPlayer().sendMessage("Tu as reçu §430 rubis§f ! Fais ");
        }

    }



}
