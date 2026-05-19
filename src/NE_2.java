/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  af
 *  pqa
 *  vRa
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class NE_2 {
    private final float j;
    private final float J;
    private final List<lf> A;
    private final float I;

    public float l() {
        NE_2 a2;
        return a2.J;
    }

    public void J() {
        NE_2 nE_2;
        NE_2 nE_22 = nE_2 = this;
        nE_22.A.removeIf(af.J());
        if (!nE_22.A.isEmpty()) {
            Object a2;
            float f2 = JPa.N;
            Object object = a2 = nE_2.A.iterator();
            while (object.hasNext()) {
                lf lf2 = (lf)a2.next();
                f2 += lf2.J();
                object = a2;
            }
            if (f2 < pqa.r) {
                NE_2 nE_23 = nE_2;
                a2 = nE_23.A.get(nE_23.A.size() - vRa.d);
                if (a2 == null) {
                    return;
                }
                Object object2 = a2;
                ((lf)object2).J(((lf)object2).J() + (pqa.r - f2));
            }
        }
    }

    public List<lf> J() {
        NE_2 a2;
        return a2.A;
    }

    /*
     * WARNING - void declaration
     */
    public NE_2(float f2, float f3, float f4) {
        void b2;
        void c2;
        NE_2 a2;
        float d2 = f4;
        NE_2 nE_2 = a2 = this;
        NE_2 nE_22 = a2;
        a2.A = new ArrayList<lf>();
        a2.I = c2;
        nE_2.j = b2;
        nE_2.J = d2;
    }

    public float f() {
        NE_2 a2;
        return a2.j;
    }

    public static /* synthetic */ boolean J(lf a2) {
        if ((double)a2.J() < fPa.ca) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public float J() {
        NE_2 a2;
        return a2.I;
    }
}

