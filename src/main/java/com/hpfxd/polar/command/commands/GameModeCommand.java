package com.hpfxd.polar.command.commands;

import com.hpfxd.polar.command.Command;
import com.hpfxd.polar.player.GameMode;
import com.hpfxd.polar.player.Player;
import com.hpfxd.polar.util.TextComponents;
import lombok.Getter;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.ComponentBuilder;

public class GameModeCommand extends Command {
    @Getter private final String[] aliases = { "gamemode", "gm" };
    @Getter private final String usage = "/gamemode <creative|survival|adventure|spectator> (<player>)";

    @Override
    public void execute(Player player, String[] args) {
        if (args.length != 1 || args.length != 2) throw new IllegalArgumentException("Game mode not specified.");


        if (args.length == 1) {
            String s = args[0].toLowerCase();
    
            switch (s) {
                case "survival":
                case "s":
                case "0":
                    this.success(player, GameMode.SURVIVAL);
                    break;
                case "creative":
                case "c":
                case "1":
                    this.success(player, GameMode.CREATIVE);
                    break;
                case "adventure":
                case "a":
                case "2":
                    this.success(player, GameMode.ADVENTURE);
                    break;
                case "spectator":
                case "sp":
                case "3":
                    this.success(player, GameMode.SPECTATOR);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid game mode \"" + args[0] + "\".");
            }
        } else if (length == 2) {
            Player target = player.getWorld().getPlayerByName(name);
            
            String s = args[1].toLowerCase();
    
            switch (s) {
                case "survival":
                case "s":
                case "0":
                    this.success(target, GameMode.SURVIVAL);
                    break;
                case "creative":
                case "c":
                case "1":
                    this.success(target, GameMode.CREATIVE);
                    break;
                case "adventure":
                case "a":
                case "2":
                    this.success(target, GameMode.ADVENTURE);
                    break;
                case "spectator":
                case "sp":
                case "3":
                    this.success(target, GameMode.SPECTATOR);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid game mode \"" + args[0] + "\".");
        }
    }

    private void success(Player player, GameMode gameMode) {
        player.setGameMode(gameMode);
        player.sendMessage(TextComponents.str(new ComponentBuilder("Your game mode is now ").color(ChatColor.GRAY)
                .append(gameMode.name()).color(ChatColor.GREEN)
                .append(".").color(ChatColor.GRAY)
                .create()));
    }
}
