package cloud.voltis.mciut;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

import static cloud.voltis.mciut.tools.isAssured;

public class deathListener implements Listener {

    // 0-8: hotbar, 9-35: inventory, 36-40: armor
    private static final int INV_SIZE = 41;

    @EventHandler
    public void playerDeath(PlayerDeathEvent event) {
        event.setKeepInventory(true);

        List<ItemStack> notDropped = new ArrayList<>();

        for (ItemStack item : event.getDrops()) {
            if (isAssured(item)) {
                notDropped.add(item);
            } else {
                removeItemFromInventory(item, event.getEntity().getInventory());
            }
        }

        for (ItemStack item : notDropped) {
            event.getDrops().remove(item);
        }
    }

    private void removeItemFromInventory(ItemStack item, Inventory inventory) {
        // Retire un item de TOUS les emplacements de l'inventaire

        for (int i = 0; i < INV_SIZE; i++) {
            ItemStack invItem = inventory.getItem(i);
            if (invItem != null && invItem.isSimilar(item)) {
                inventory.setItem(i, null);
            }
        }
    }
}