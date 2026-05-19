/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CZ
 *  Ega
 *  Gg
 *  QFa
 *  fDa
 *  fpa
 *  kea
 *  ld
 *  xA
 */
package net.minecraft.block;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockWorkbench$InterfaceCraftingTable
implements xA {
    private final XF position;
    private final Gg world;

    public ld J() {
        return new CZ(new StringBuilder().insert(5 >> 3, QFa.IE.J()).append(tpa.N).toString(), new Object[uSa.E]);
    }

    public Ega J(kea kea2, Sx sx2) {
        BlockWorkbench$InterfaceCraftingTable b2;
        BlockWorkbench$InterfaceCraftingTable c2 = kea2;
        BlockWorkbench$InterfaceCraftingTable blockWorkbench$InterfaceCraftingTable = b2 = this;
        return new fDa((kea)c2, blockWorkbench$InterfaceCraftingTable.world, blockWorkbench$InterfaceCraftingTable.position);
    }

    public boolean J() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public BlockWorkbench$InterfaceCraftingTable(Gg gg2, XF xF2) {
        void b2;
        BlockWorkbench$InterfaceCraftingTable a2;
        Object c2 = xF2;
        BlockWorkbench$InterfaceCraftingTable blockWorkbench$InterfaceCraftingTable = a2 = this;
        blockWorkbench$InterfaceCraftingTable.world = b2;
        blockWorkbench$InterfaceCraftingTable.position = c2;
    }

    public String f() {
        return fpa.j;
    }

    public String J() {
        return null;
    }
}

