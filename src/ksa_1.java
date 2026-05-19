/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  YTa
 *  fSa
 *  pRa
 *  rTa
 *  tsa
 *  uTa
 */
import java.util.ArrayList;

public final class ksa_1
extends uTa {
    public tsa<pRa> k;
    public tsa<pRa> j;
    public tsa<pRa> J;
    public tsa<pRa> A;
    public tsa<rTa> I;

    public ksa_1() {
        ksa_1 a2;
    }

    /*
     * WARNING - void declaration
     */
    public YTa J(YTa yTa, YTa yTa2, double d2, double d3) {
        void a2;
        void b2;
        rTa c2;
        ksa_1 e2 = yTa;
        ksa_1 d4 = this;
        e2 = e2.J((YTa)c2, (double)b2);
        if (d4.J != null) {
            ((YTa)e2).roll = ((pRa)d4.J.J((double)a2)).x;
        }
        if (d4.k != null) {
            ((YTa)e2).zoom = ((pRa)d4.k.J((double)a2)).x;
        }
        if (d4.A != null) {
            ((YTa)e2).rotationYaw = ((pRa)d4.A.J((double)a2)).x;
        }
        if (d4.j != null) {
            ((YTa)e2).rotationPitch = ((pRa)d4.j.J((double)a2)).x;
        }
        if (d4.I != null) {
            c2 = (rTa)d4.I.J((double)a2);
            ksa_1 ksa_12 = e2;
            rTa rTa2 = c2;
            ((YTa)e2).x = rTa2.x;
            ((YTa)ksa_12).y = rTa2.y;
            ((YTa)ksa_12).z = c2.z;
        }
        return e2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(ArrayList<YTa> arrayList) {
        int b2;
        void a2;
        ksa_1 ksa_12 = this;
        pRa[] pRaArray = new pRa[a2.size()];
        pRa[] pRaArray2 = new pRa[a2.size()];
        pRa[] pRaArray3 = new pRa[a2.size()];
        pRa[] pRaArray4 = new pRa[a2.size()];
        rTa[] rTaArray = new rTa[a2.size()];
        int n2 = b2 = uSa.E;
        while (n2 < a2.size()) {
            pRaArray[b2] = new pRa(((YTa)a2.get((int)b2)).roll);
            pRaArray2[b2] = new pRa(((YTa)a2.get((int)b2)).zoom);
            pRaArray3[b2] = new pRa(((YTa)a2.get((int)b2)).rotationYaw);
            pRaArray4[b2] = new pRa(((YTa)a2.get((int)b2)).rotationPitch);
            rTaArray[b2++] = new rTa(((YTa)a2.get((int)b2)).x, ((YTa)a2.get((int)b2)).y, ((YTa)a2.get((int)b2)).z);
            n2 = b2;
        }
        ksa_1 ksa_13 = ksa_12;
        ksa_13.J = new tsa((fSa[])pRaArray);
        ksa_13.k = new tsa((fSa[])pRaArray2);
        ksa_13.j = new tsa((fSa[])pRaArray4);
        ksa_13.A = new tsa((fSa[])pRaArray3);
        ksa_13.I = new tsa((fSa[])rTaArray);
    }
}

