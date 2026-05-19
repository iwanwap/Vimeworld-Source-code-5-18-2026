/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CZ
 *  Ega
 *  Gg
 *  QFa
 *  TQa
 *  Ypa
 *  kea
 *  ld
 *  xA
 */
package net.minecraft.block;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockAnvil$Anvil
implements xA {
    private final Gg world;
    private final XF position;

    /*
     * WARNING - void declaration
     */
    public Ega J(kea kea2, Sx sx2) {
        void b2;
        BlockAnvil$Anvil a2;
        Object c2 = sx2;
        BlockAnvil$Anvil blockAnvil$Anvil = a2 = this;
        return new rda((kea)b2, blockAnvil$Anvil.world, blockAnvil$Anvil.position, (Sx)((Object)c2));
    }

    public String J() {
        return Ypa.G;
    }

    public String f() {
        return TQa.r;
    }

    public ld J() {
        return new CZ(new StringBuilder().insert(3 >> 2, QFa.Sb.J()).append(tpa.N).toString(), new Object[uSa.E]);
    }

    public boolean J() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public BlockAnvil$Anvil(Gg gg2, XF xF2) {
        void b2;
        BlockAnvil$Anvil a2;
        Object c2 = xF2;
        BlockAnvil$Anvil blockAnvil$Anvil = a2 = this;
        blockAnvil$Anvil.world = b2;
        blockAnvil$Anvil.position = c2;
    }
}

