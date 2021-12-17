package bar.metacinna.command;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.*;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class MetacinnabarCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        // if player
        if (sender instanceof Player) {
            Player player = (Player) sender;

            // send chat message
            player.sendMessage("hi - metacinnabar");
            Bukkit.broadcastMessage("metacinnabar is not a clown");

            // give player diamond
            ItemStack diamond = new ItemStack(Material.DIAMOND);
            // named "metacinnabar"
            ItemMeta diamondMeta = diamond.getItemMeta();
            diamondMeta.setDisplayName("metacinnabar");
            diamond.setItemMeta(diamondMeta);

            player.getInventory().addItem(diamond);

            // executed successfully
            return true;
        }

        // if command block
        if (sender instanceof BlockCommandSender) {
            // send chat message
            Bukkit.broadcastMessage("metacinnabar is not a clown");

            // executed successfully
            return true;
        }

        // if console
        if (sender instanceof ConsoleCommandSender) {
            // broadcast message
            Bukkit.broadcastMessage("someone's in the console!! hide!!");

            // log msg to console
            Bukkit.getLogger().info("You should give metacinnabar op!");

            // executed successfully
            return true;
        }

        // command failed
        return false;
    }
}