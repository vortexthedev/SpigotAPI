package org.bukkit;

import eu.vortexdev.api.chunk.ChunkSnapshot;

public interface Chunk {

    ChunkSnapshot takeSnapshot();

    void restoreSnapshot(ChunkSnapshot snapshot);
}
