package org.bukkit;

import org.bukkit.plugin.messaging.PluginMessageRecipient;

public interface Server extends PluginMessageRecipient {

    void setMaxPlayers(int maxPlayers);

    void reloadConfigs();

}
