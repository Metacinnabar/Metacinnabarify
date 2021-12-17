package bar.metacinna;

import bar.metacinna.command.MetacinnabarCommand;
import bar.metacinna.event.ChatSuffixEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class MetacinnabarifyPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        // init our command
        getCommand("metacinnabar").setExecutor(new MetacinnabarCommand());
        // register our event
        getServer().getPluginManager().registerEvents(new ChatSuffixEvent(), this);

        // print stuff to console
        getLogger().info("Metacinnabarify has been enabled!");
    }

    @Override
    public void onDisable() {
        // print stuff to console
        getLogger().info("Metacinnabarify has been disabled :(");
    }
}
