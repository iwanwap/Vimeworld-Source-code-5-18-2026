/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Gl
 *  YTa
 *  lsa
 *  nda
 *  uTa
 *  vRa
 */
import java.util.ArrayList;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class hsa
extends lsa {
    public Gl I;

    public Gl J() {
        hsa a2;
        return a2.I;
    }

    public void J(YTa yTa) {
        hsa b2 = yTa;
        hsa a2 = this;
        super.J((YTa)b2);
        hsa hsa2 = a2;
        hsa.M.u = hsa2.I;
        if (hsa2.I instanceof Sx) {
            ((Sx)a2.I).h.f(vRa.d != 0);
        }
        hsa hsa3 = a2;
        hsa3.I.l(((YTa)b2).x, ((YTa)b2).y, ((YTa)b2).z, (float)((YTa)b2).rotationYaw, (float)((YTa)b2).rotationPitch);
        hsa3.I.f(((YTa)b2).x, ((YTa)b2).y, ((YTa)b2).z, (float)((YTa)b2).rotationYaw, (float)((YTa)b2).rotationPitch);
    }

    public void l() {
        hsa a2;
        super.l();
        hsa.M.u = hsa.M.c;
    }

    /*
     * WARNING - void declaration
     */
    public hsa(ArrayList<YTa> arrayList, long l2, uTa uTa2, Object object) {
        Object e2;
        void b2;
        void c2;
        void d2;
        hsa hsa2 = object2;
        Object object2 = object;
        hsa a2 = hsa2;
        void v1 = d2;
        super((ArrayList)v1, (long)c2, (uTa)b2, e2);
        if (v1 != null) {
            hsa hsa3 = a2;
            hsa3.I = new nda((Gg)hsa.M.Ta);
        }
    }

    public String J() {
        return LPa.G;
    }

    /*
     * WARNING - void declaration
     */
    public lsa J(ArrayList<YTa> arrayList, long l2, uTa uTa2, Object object) {
        Object e2;
        void b2;
        void c2;
        void d2;
        hsa hsa2 = object2;
        Object object2 = object;
        hsa a2 = hsa2;
        return new hsa((ArrayList<YTa>)d2, (long)c2, (uTa)b2, e2);
    }
}

