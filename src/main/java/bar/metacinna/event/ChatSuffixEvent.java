package bar.metacinna.event;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class ChatSuffixEvent implements Listener {
    // send last
    @EventHandler(priority = EventPriority.LOWEST)
    public void onPlayerJoin(PlayerJoinEvent event) {
        // set player join message
        event.setJoinMessage("psst" + event.getPlayer().getName() + "raymond is a clownnn");
        // broadcast message to whole server
        Bukkit.broadcastMessage("do /metacinnabar for free money");
    }

    // highest priority, also send no matter hat
    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
    public void onChatMessage(AsyncPlayerChatEvent event) {
        // grab the sent message
        String message = event.getMessage();
        // append my suffix (lol += for strings are cool)
        message += " | #MetaForDev";
        // set to our new message
        event.setMessage(message);
    }
}
