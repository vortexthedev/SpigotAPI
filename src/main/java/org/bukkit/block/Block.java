package org.bukkit.block;

import org.bukkit.metadata.Metadatable;

public interface Block extends Metadatable {

    /**
     * Gets the durability for this block
     * <p>
     * This method only supported in spigots
     * that have an explosion destroyer
     *
     * @return durability for this block or -1
     */
    int getDurability();

    /**
     * Sets the durability of this block
     * <p>
     * This method only supported in spigots
     * that have an explosion destroyer
     *
     * @param durability Durability to change this block to
     */
    void setDurability(int durability);

}
