package eu.vortexdev.api.chunk;

import net.minecraft.server.v1_8_R3.NBTTagCompound;

import java.util.List;

public class CraftChunkSnapshot implements ChunkSnapshot {

    public ChunkSectionSnapshot[] getSections() {
        return null;
    }

    public List<NBTTagCompound> getTileEntities() {
        return null;
    }
}
