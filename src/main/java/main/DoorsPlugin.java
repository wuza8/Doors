package main;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.java.JavaPluginLoader;

import java.io.File;

public class DoorsPlugin extends JavaPlugin {

    private Doors doors = new Doors();
    public Doors getDoors() { return doors; }

    private static DoorsPlugin instance;
    public static DoorsPlugin getInstance() { return instance; }

    public void onEnable(){
        instance = this;
        getCommand("dtp").setExecutor(Cli.createMainCommand());
    }

    //Constuctors for MockBukkit
    public DoorsPlugin()
    {
        super();
    }
    protected DoorsPlugin(JavaPluginLoader loader, PluginDescriptionFile description, File dataFolder, File file)
    {
        super(loader, description, dataFolder, file);
    }
}
