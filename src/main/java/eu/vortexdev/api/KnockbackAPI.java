package eu.vortexdev.api;

import eu.vortexdev.api.knockback.KnockbackProfile;
import org.bukkit.entity.Player;

import java.util.Collection;

public class KnockbackAPI {

    /**
     * Get a {@link KnockbackProfile} by its name
     *
     * @param name the name of the profile
     * @return {@link KnockbackProfile}
     */
    public static KnockbackProfile getByName(String name) {
        return null;
    }

    /**
     * Apply a {@link KnockbackProfile} to the given player
     *
     * @param profile the knockback profile
     * @param player  the player
     */
    public static void applyKnockback(KnockbackProfile profile, Player player) {
    }

    /**
     * Get the default {@link KnockbackProfile}
     *
     * @return the default knockback
     */
    public static KnockbackProfile getDefault() {
        return null;
    }

    /**
     * Add a profile {@link KnockbackProfile}
     *
     * @param profile the knockback profile
     */
    public static void addProfile(KnockbackProfile profile) {
    }

    /**
     * Remove a profile {@link KnockbackProfile}
     *
     * @param profile the knockback profile
     */
    public static void removeProfile(KnockbackProfile profile) {
    }

    /**
     * Saves all profiles to knockback.yml
     */
    public static void saveProfiles() {
    }

    /**
     * Reloads all profiles from knockback.yml
     */
    public static void reloadProfiles() {
    }

    /**
     * Get collection of all profiles {@link KnockbackProfile}
     *
     * @return the collection of profiles
     */
    public static Collection<KnockbackProfile> getProfiles() {
        return null;
    }
}
