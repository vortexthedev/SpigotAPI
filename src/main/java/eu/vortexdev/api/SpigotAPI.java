package eu.vortexdev.api;

import eu.vortexdev.api.protocol.MovementListenerAdapter;
import eu.vortexdev.api.protocol.PacketListenerAdapter;

import java.util.List;

public class SpigotAPI {

    public static List<PacketListenerAdapter> getPacketListeners() {
        return null;
    }

    public static List<MovementListenerAdapter> getMovementListeners() {
        return null;
    }

    public static void addMovementListener(MovementListenerAdapter listener) {
    }

    public static void addPacketListener(PacketListenerAdapter listener) {
    }

}
