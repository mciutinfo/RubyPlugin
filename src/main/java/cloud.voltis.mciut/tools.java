package cloud.voltis.mciut;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.block.Block;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemStack;

import java.lang.reflect.Field;
import java.util.Objects;

public class tools {

    public static Boolean isAssured(ItemStack item) {

        NamespacedKey key = new NamespacedKey("mciut", "assurance");

        return Objects.requireNonNull(item.getItemMeta()).getPersistentDataContainer().has(key, org.bukkit.persistence.PersistentDataType.BOOLEAN)
                && Boolean.TRUE.equals(item.getItemMeta().getPersistentDataContainer().get(key, org.bukkit.persistence.PersistentDataType.BOOLEAN));

    }

    public static ItemStack getRuby() throws NoSuchFieldException {
        ItemStack ruby = new ItemStack(Material.CLOCK);
        Objects.requireNonNull(ruby.getItemMeta()).setCustomModelData(1);
        Objects.requireNonNull(ruby.getItemMeta()).setDisplayName("§4Rubis");
        ruby.setAmount(1);
        ruby.getItemMeta().getPersistentDataContainer().set(new NamespacedKey("mciut", "assurance"), org.bukkit.persistence.PersistentDataType.BOOLEAN, true);

        return ruby;
    }


    public static ItemStack getRubyBlock() throws NoSuchFieldException {
        ItemStack rubyBlock = new ItemStack(Material.LAPIS_BLOCK);
        Objects.requireNonNull(rubyBlock.getItemMeta()).setCustomModelData(1);
        Objects.requireNonNull(rubyBlock.getItemMeta()).setDisplayName("§4Bloc de rubis");
        rubyBlock.setAmount(1);
        rubyBlock.getItemMeta().getPersistentDataContainer().set(new NamespacedKey("mciut", "assurance"), org.bukkit.persistence.PersistentDataType.BOOLEAN, true);

        return rubyBlock;
    }
}
