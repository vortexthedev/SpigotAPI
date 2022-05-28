package eu.vortexdev.api.chunk;

import net.minecraft.server.v1_8_R3.NibbleArray;

public class ChunkSectionSnapshot {

    public ChunkSectionSnapshot(int yPos, int nonEmptyBlockCount, int tickingBlockCount, char[] blockIds, NibbleArray emittedLight, NibbleArray skyLight, boolean isDirty) {
    }

    public int getYPos() {
        return 0;
    }

    public int getNonEmptyBlockCount() {
        return 0;
    }

    public int getTickingBlockCount() {
        return 0;
    }

    public char[] getBlockIds() {
        return null;
    }

    public NibbleArray getEmittedLight() {
        return null;
    }

    public NibbleArray getSkyLight() {
        return null;
    }

    public boolean isDirty() {
        return false;
    }

}
