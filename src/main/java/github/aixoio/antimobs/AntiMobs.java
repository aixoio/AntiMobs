package github.aixoio.antimobs;

import github.aixoio.antimobs.commands.ToggleCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class AntiMobs extends JavaPlugin {

    private static AntiMobs PLUGIN;

    @Override
    public void onEnable() {

        this.getLogger().info("Starting...");

        AntiMobs.PLUGIN = this;

        this.getConfig().options().copyDefaults();
        this.saveDefaultConfig();

        this.getCommand("toggle-mobs").setExecutor(new ToggleCommand());

        this.getLogger().info("Started");

    }

    @Override
    public void onDisable() {

        this.getLogger().info("Stopping...");

        this.getLogger().info("Stopped");

    }

    public static AntiMobs getPlugin() {

        return AntiMobs.PLUGIN;

    }

}
