/*

This event is only available for spigots with integrated VortexPearls.
For example VortexSpigot

* */

package org.bukkit.event.player;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;

public class PlayerPearlRefundEvent extends PlayerEvent {

    private static final HandlerList handlers = new HandlerList();

    public PlayerPearlRefundEvent(Player who) {
        super(who);
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
