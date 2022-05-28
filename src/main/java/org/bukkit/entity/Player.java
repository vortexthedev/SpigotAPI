package org.bukkit.entity;

import eu.vortexdev.api.knockback.KnockbackProfile;

public interface Player {

    void sendPacket(Object packet);

    boolean canSeeEntity(Entity entity);

    KnockbackProfile getKnockbackProfile();

    void setKnockbackProfile(KnockbackProfile knockbackProfile);

    void sendActionBar(String message);

    int getPing();

}
