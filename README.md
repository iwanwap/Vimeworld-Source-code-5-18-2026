# VimeWorld 1.8.8 Raw Client Dump

This repository contains the raw, obfuscated `.java` source files extracted directly from the VimeWorld client. Native anti-dump protections (VimeGuard) were bypassed via a custom memory dumper/unpacker.

## Note on File Naming (`_1`, `_2` suffixes)

If you look at the source files, you will notice many files end with `_1.java`, `_2.java` (e.g., `aw_1.java`, `AW_2.java`). 

This is an intentional feature of my dumper to bypass a specific Zelix KlassMaster (ZKM) obfuscation trick. ZKM generates hundreds of classes that only differ by case (e.g., `A.class` and `a.class`). 

Because the Windows filesystem is case-insensitive, dumping these directly to disk causes them to overwrite each other, destroying the client structure. 

To solve this, the dumper automatically detects case collisions, appends an incremental suffix to the file name, and **patches the bytecode constants on-the-fly** to point to the new names. This ensures 100% of the client is preserved without data loss.

## Next Steps
Full ZKM deobfuscation (flow/strings) and automated MCP remapping (restoring `Minecraft.java`, `EntityPlayer.java`, Netty packets, etc.) is currently in progress. A fully mapped version will be pushed soon.
