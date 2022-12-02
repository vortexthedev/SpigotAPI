package eu.vortexdev.api;

import eu.vortexdev.api.knockback.KnockbackProfile;
import eu.vortexdev.api.protocol.MovementListenerAdapter;
import eu.vortexdev.api.protocol.PacketListenerAdapter;

import java.util.List;

public class SpigotAPI {

    /**
     * Get collection of all packet listeners {@link PacketListenerAdapter}
     *
     * @return the collection of packet listeners
     */
    public static List<PacketListenerAdapter> getPacketListeners() {
        return null;
    }

    /**
     * Get collection of all movement listeners {@link MovementListenerAdapter}
     *
     * @return the collection of movement listeners
     */
    public static List<MovementListenerAdapter> getMovementListeners() {
        return null;
    }

    /**
     * Add a movement listener adapter {@link MovementListenerAdapter}
     *
     * @param listener the movement listener adapter
     */
    public static void addMovementListener(MovementListenerAdapter listener) {
    }

    /**
     * Add a packet listener adapter {@link PacketListenerAdapter}
     *
     * @param listener the packet listener adapter
     */
    public static void addPacketListener(PacketListenerAdapter listener) {
    }

}
