package github.aixoio.antimobs.commands;

import github.aixoio.antimobs.AntiMobs;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ToggleCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender.hasPermission("antimobs.toggle")) {

            if (AntiMobs.getPlugin().getConfig().getBoolean("Active")) {

                AntiMobs.getPlugin().getConfig().set("Active", false);
                sender.sendMessage(ChatColor.GREEN + "Mobs off");

            } else {

                AntiMobs.getPlugin().getConfig().set("Active", true);
                sender.sendMessage(ChatColor.GREEN + "Mobs on");

            }

            AntiMobs.getPlugin().saveConfig();
            AntiMobs.getPlugin().reloadConfig();

        } else {

            sender.sendMessage(ChatColor.DARK_RED + "You do not have the required permission to use this command!");

        }

        return true;
    }
}
