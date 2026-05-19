/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  RA
 *  Yka
 *  dZ
 *  jga
 */
import java.util.Collection;
import java.util.List;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class sIa
implements RA {
    private final List<jga> J;
    private final RA A;
    private final int I;

    public sIa(List<jga> list) {
        sIa a2;
        List<jga> b2 = list;
        sIa sIa2 = a2 = this;
        a2.J = b2;
        sIa2.I = dZ.J((Collection)a2.J);
        sIa2.A = ((jga)b2.get((int)uSa.E)).model;
    }

    public KLa J() {
        sIa a2;
        return a2.A.J();
    }

    public boolean f() {
        sIa a2;
        return a2.A.f();
    }

    public boolean J() {
        sIa a2;
        return a2.A.J();
    }

    public RA J(long a2) {
        sIa b2;
        return ((jga)dZ.J(b2.J, (int)(Math.abs((int)((int)a2 >> ERa.C)) % b2.I))).model;
    }

    public ItemCameraTransforms J() {
        sIa a2;
        return a2.A.J();
    }

    public List<Yka> J(DZ dZ2) {
        Object b2 = dZ2;
        sIa a2 = this;
        return a2.A.J((DZ)((Object)b2));
    }

    public boolean l() {
        sIa a2;
        return a2.A.l();
    }

    public List<Yka> J() {
        sIa a2;
        return a2.A.J();
    }
}

