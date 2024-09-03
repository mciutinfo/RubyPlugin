package cloud.voltis.mciut;


import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.inventory.ItemStack;
import static cloud.voltis.mciut.tools.isAssured;

public class rubyItemProtection implements Listener {

    @EventHandler
    public void onItemDrop(PlayerDropItemEvent event) {

        ItemStack item = event.getItemDrop().getItemStack();

        if (isAssured(item)) {
            event.getItemDrop().setUnlimitedLifetime(true);
            event.getItemDrop().setInvulnerable(true);
        }
    }
}
