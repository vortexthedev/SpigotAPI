package eu.vortexdev.api.protocol;

import net.minecraft.server.v1_8_R3.Packet;
import net.minecraft.server.v1_8_R3.PlayerConnection;

public interface PacketListenerAdapter {
    default void onSend(PlayerConnection playerConnection, Packet packet) {
    }

    default void onReceive(PlayerConnection playerConnection, Packet packet) {
    }
}
