/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
import net.minecraft.util.ResourceLocation;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class OLa_1 {
    private final boolean j;
    private final int J;
    private final AGa A;
    private final ResourceLocation I;

    public int hashCode() {
        OLa_1 oLa_1 = this;
        int a2 = oLa_1.I.hashCode();
        a2 = tua.U * a2 + (oLa_1.A != null ? oLa_1.A.hashCode() : uSa.E);
        a2 = tua.U * a2 + (oLa_1.j ? vRa.d : uSa.E);
        return a2;
    }

    public boolean equals(Object object) {
        Object a2 = this;
        Object b2 = object;
        if (a2 == b2) {
            return vRa.d != 0;
        }
        if (!(b2 instanceof OLa_1)) {
            return uSa.E != 0;
        }
        b2 = (OLa_1)b2;
        if (((OLa_1)a2).I.equals(((OLa_1)b2).I) && ((OLa_1)a2).A == ((OLa_1)b2).A && ((OLa_1)a2).j == ((OLa_1)b2).j) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public OLa_1(ResourceLocation resourceLocation, AGa aGa, boolean bl, int n2) {
        void e2;
        void b2;
        void c2;
        void d2;
        OLa_1 a2;
        int n3 = n2;
        OLa_1 oLa_1 = a2 = this;
        OLa_1 oLa_12 = a2;
        oLa_12.I = d2;
        oLa_12.A = c2;
        oLa_1.j = b2;
        oLa_1.J = e2;
    }

    public boolean J() {
        OLa_1 a2;
        return a2.j;
    }

    public int J() {
        OLa_1 a2;
        return a2.J;
    }

    public ResourceLocation J() {
        OLa_1 a2;
        return a2.I;
    }

    public AGa J() {
        OLa_1 a2;
        return a2.A;
    }
}

