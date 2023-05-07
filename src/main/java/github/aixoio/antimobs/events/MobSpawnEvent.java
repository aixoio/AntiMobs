package github.aixoio.antimobs.events;

import github.aixoio.antimobs.AntiMobs;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;

public class MobSpawnEvent implements Listener {

    @EventHandler
    public void onEntitySpawn(EntitySpawnEvent e) {

        if (AntiMobs.getPlugin().getConfig().getBoolean("Active")) {

            e.setCancelled(true);

        }

    }

}
