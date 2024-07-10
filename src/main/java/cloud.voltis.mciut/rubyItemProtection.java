package cloud.voltis.mciut;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityCombustEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Objects;

public class rubyItemProtection implements Listener {

    @EventHandler
    public void EntityCombust(EntityCombustEvent event) {
        if (event.getEntity().getType() == org.bukkit.entity.EntityType.ITEM) {

            ItemStack item = (ItemStack) event.getEntity();

            if (item.getType() == Material.CLOCK && Objects.requireNonNull(item.getItemMeta()).hasCustomModelData()) {
                event.setCancelled(true);
            }
        }
    }

    @EventHandler
    public void onItemDrop(PlayerDropItemEvent event) {

        ItemStack item = event.getItemDrop().getItemStack();

        if (item.getType() == Material.CLOCK && Objects.requireNonNull(item.getItemMeta()).hasCustomModelData()) {
            event.getItemDrop().setUnlimitedLifetime(true);
            event.getItemDrop().setInvulnerable(true);
        }
    }
}
