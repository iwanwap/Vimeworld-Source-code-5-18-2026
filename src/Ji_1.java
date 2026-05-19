/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  FI
 *  KG
 *  KH
 *  Kpa
 *  Wo
 *  gn
 *  ph
 *  qG
 *  vL
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Ji_1
extends FI {
    public final ph k;
    public final KG j;
    public final int J;
    public final boolean A;
    public long I;

    /*
     * Enabled aggressive block sorting
     */
    public KH J() {
        Ji_1 ji_1 = this;
        Kpa kpa2 = Kpa.J();
        Ji_1 a2 = kpa2.Ta.J(ji_1.J);
        if (a2 == null) {
            if (!ji_1.A) return null;
            ji_1.I = OT.e;
            return null;
        }
        ji_1.I = OT.e;
        float f2 = kpa2.w.j.J();
        Ji_1 ji_12 = a2;
        double d2 = ((vL)a2).V + (((vL)ji_12).la - ((vL)a2).V) * (double)f2;
        Ji_1 ji_13 = a2;
        double d3 = ((vL)ji_12).Ga + (((vL)ji_13).Z - ((vL)a2).Ga) * (double)f2;
        double d4 = ((vL)ji_13).Ca + (((vL)a2).A - ((vL)a2).Ca) * (double)f2;
        switch (qG.A[ji_1.k.ordinal()]) {
            case 1: {
                return new KH(d2, d3 += (double)((vL)a2).u, d4);
            }
            case 2: {
                return new KH(d2, d3 += (double)a2.l(), d4);
            }
            case 3: {
                d3 += (double)((vL)a2).u * kTa.B;
                return new KH(d2, d3, d4);
            }
        }
        return new KH(d2, d3, d4);
    }

    public Ji_1(gn gn2) {
        Ji_1 a2;
        Ji_1 b2 = gn2;
        Ji_1 ji_1 = a2 = this;
        Ji_1 ji_12 = b2;
        a2.I = OT.e;
        a2.J = b2.getId();
        a2.k = ph.fromProto((yM)ji_12.getAlignment());
        ji_1.j = KG.fromProto((Wo)ji_12.getRotation());
        ji_1.A = b2.hasPersistent() && b2.getPersistent() ? vRa.d : uSa.E;
    }

    public vL J() {
        Ji_1 a2;
        return Kpa.J().Ta.J(a2.J);
    }
}

