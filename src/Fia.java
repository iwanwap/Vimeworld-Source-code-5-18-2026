/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  N
 *  RA
 *  U
 *  UK
 *  j
 *  oKa
 */
import net.minecraft.client.resources.model.ModelResourceLocation;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Fia
implements j {
    private final WKa j;
    private final oKa J;
    public N<ModelResourceLocation, RA> A;
    private RA I;

    public Fia(WKa wKa2) {
        Object b2 = wKa2;
        Fia a2 = this;
        a2.j = b2;
        Fia fia2 = a2;
        a2.J = new oKa(a2);
    }

    public oKa J() {
        Fia a2;
        return a2.J;
    }

    public WKa J() {
        Fia a2;
        return a2.j;
    }

    public RA J() {
        Fia a2;
        return a2.I;
    }

    public RA J(ModelResourceLocation modelResourceLocation) {
        Object b2 = modelResourceLocation;
        Fia a2 = this;
        if (b2 == null) {
            return a2.I;
        }
        if ((b2 = (RA)a2.A.J(b2)) == null) {
            return a2.I;
        }
        return b2;
    }

    public void J(U u2) {
        Fia a2;
        Fia b2 = u2;
        Fia fia2 = a2 = this;
        b2 = new UK((U)b2, fia2.j, fia2.J);
        a2.A = b2.J();
        a2.I = (RA)a2.A.J((Object)UK.g);
        a2.J.J();
    }
}

