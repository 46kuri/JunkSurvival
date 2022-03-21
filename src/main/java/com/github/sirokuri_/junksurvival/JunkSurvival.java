package com.github.sirokuri_.junksurvival;

import com.github.sirokuri_.junksurvival.listeners.JunkSurvivalGiantSpawnListener;
import com.github.sirokuri_.junksurvival.listeners.JunkSurvivalItemDropListener;
import com.github.sirokuri_.junksurvival.listeners.JunkSurvivalMessageListener;
import com.github.sirokuri_.junksurvival.listeners.JunkSurvivalPreventGriefListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class JunkSurvival extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new JunkSurvivalItemDropListener(), this);
        Bukkit.getPluginManager().registerEvents(new JunkSurvivalMessageListener(), this);
        Bukkit.getPluginManager().registerEvents(new JunkSurvivalPreventGriefListener(), this);
        Bukkit.getPluginManager().registerEvents(new JunkSurvivalGiantSpawnListener(), this);
        Bukkit.getLogger().info(getName() + " enabled.");
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info(getName() + " disabled.");
    }
}
