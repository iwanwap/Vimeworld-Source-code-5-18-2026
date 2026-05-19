/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CZ
 *  Epa
 *  Gl
 *  ISa
 *  JPa
 *  Mda
 *  QFa
 *  Rua
 *  SQa
 *  gZ
 *  ld
 *  paa
 *  vL
 *  vQa
 *  vRa
 *  vpa
 */
import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.block.Block;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class iaa_1 {
    private final List<paa> C;
    private int i;
    private boolean M;
    private final Gl k;
    private String j;
    private int J;
    private boolean A;
    private int I;

    public int J() {
        iaa_1 a2;
        if (a2.M) {
            return a2.k.g - a2.i;
        }
        iaa_1 iaa_12 = a2;
        return iaa_12.J - iaa_12.i;
    }

    public void l() {
        int a2;
        iaa_1 iaa_12 = this;
        int n2 = a2 = iaa_12.M ? vpa.Ja : ySa.T;
        if (iaa_12.A && (!iaa_12.k.K() || iaa_12.k.g - iaa_12.I > a2)) {
            iaa_1 iaa_13 = iaa_12;
            a2 = iaa_13.M ? 1 : 0;
            iaa_13.A = uSa.E;
            iaa_13.M = uSa.E;
            iaa_13.J = iaa_13.k.g;
            if (a2 != 0) {
                iaa_12.k.o();
            }
            iaa_12.C.clear();
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(gZ gZ2, float f2, float f3) {
        void a2;
        void b2;
        iaa_1 c2;
        iaa_1 d2 = gZ2;
        iaa_1 iaa_12 = c2 = this;
        iaa_12.l();
        iaa_12.f();
        iaa_1 iaa_13 = c2;
        d2 = new paa((gZ)d2, c2.k.g, (float)b2, (float)a2, iaa_13.j, iaa_13.k.O);
        iaa_12.C.add((paa)d2);
        c2.I = c2.k.g;
        c2.A = vRa.d;
        if (d2.J() && !c2.M && c2.k.K()) {
            iaa_1 iaa_14 = c2;
            iaa_14.M = vRa.d;
            iaa_14.J = iaa_14.i = iaa_14.k.g;
            iaa_14.k.m();
        }
    }

    private String J(paa paa2) {
        iaa_1 b2 = paa2;
        iaa_1 a2 = this;
        if (b2.J() == null) {
            return kra.Fa;
        }
        return b2.J();
    }

    public Gl f() {
        iaa_1 iaa_12 = this;
        Gl gl2 = null;
        Sx sx2 = null;
        float f2 = JPa.N;
        float f3 = JPa.N;
        for (paa a2 : iaa_12.C) {
            if (a2.J().f() instanceof Sx && (sx2 == null || a2.f() > f3)) {
                paa paa2 = a2;
                f3 = paa2.f();
                sx2 = (Sx)paa2.J().f();
            }
            if (!(a2.J().f() instanceof Gl) || gl2 != null && !(a2.f() > f2)) continue;
            paa paa3 = a2;
            f2 = paa3.f();
            gl2 = (Gl)paa3.J().f();
        }
        if (sx2 != null && f3 >= f2 / vQa.q) {
            return sx2;
        }
        return gl2;
    }

    public void f() {
        iaa_1 iaa_12;
        iaa_1 iaa_13 = iaa_12 = this;
        iaa_13.J();
        if (iaa_13.k.l()) {
            Block a2 = iaa_12.k.j.J(new XF(iaa_12.k.la, iaa_12.k.J().j, iaa_12.k.A)).J();
            if (a2 == QFa.z) {
                iaa_12.j = ISa.Aa;
                return;
            }
            if (a2 == QFa.vC) {
                iaa_12.j = DPa.W;
                return;
            }
        } else if (iaa_12.k.L()) {
            iaa_12.j = wua.i;
        }
    }

    public ld J() {
        iaa_1 a2;
        iaa_1 iaa_12 = this;
        if (iaa_12.C.size() == 0) {
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = iaa_12.k.J();
            return new CZ(Rua.u, objectArray);
        }
        iaa_1 iaa_13 = iaa_12;
        paa paa2 = iaa_13.J();
        paa paa3 = iaa_13.C.get(iaa_12.C.size() - vRa.d);
        ld ld2 = paa3.J();
        vL vL2 = paa3.J().f();
        if (paa2 != null && paa3.J() == gZ.B) {
            paa paa4 = paa2;
            ld ld3 = paa4.J();
            if (paa4.J() != gZ.B && paa2.J() != gZ.c) {
                if (!(ld3 == null || ld2 != null && ld3.equals(ld2))) {
                    Mda mda2;
                    vL vL3 = paa2.J().f();
                    Mda mda3 = mda2 = vL3 instanceof Gl ? ((Gl)vL3).J() : null;
                    if (mda2 != null && mda2.l()) {
                        Object[] objectArray = new Object[yRa.d];
                        objectArray[uSa.E] = iaa_12.k.J();
                        objectArray[vRa.d] = ld3;
                        objectArray[uqa.g] = mda2.J();
                        a2 = new CZ(Epa.K, objectArray);
                    } else {
                        Object[] objectArray = new Object[uqa.g];
                        objectArray[uSa.E] = iaa_12.k.J();
                        objectArray[vRa.d] = ld3;
                        a2 = new CZ(KQa.I, objectArray);
                    }
                } else if (ld2 != null) {
                    Mda mda4;
                    Mda mda5 = mda4 = vL2 instanceof Gl ? ((Gl)vL2).J() : null;
                    if (mda4 != null && mda4.l()) {
                        Object[] objectArray = new Object[yRa.d];
                        objectArray[uSa.E] = iaa_12.k.J();
                        objectArray[vRa.d] = ld2;
                        objectArray[uqa.g] = mda4.J();
                        a2 = new CZ(Bua.H, objectArray);
                    } else {
                        Object[] objectArray = new Object[uqa.g];
                        objectArray[uSa.E] = iaa_12.k.J();
                        objectArray[vRa.d] = ld2;
                        a2 = new CZ(Ora.S, objectArray);
                    }
                } else {
                    Object[] objectArray = new Object[vRa.d];
                    objectArray[uSa.E] = iaa_12.k.J();
                    a2 = new CZ(LRa.k, objectArray);
                }
            } else {
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = iaa_12.k.J();
                a2 = new CZ(new StringBuilder().insert(3 ^ 3, SQa.h).append(iaa_12.J(paa2)).toString(), objectArray);
            }
        } else {
            a2 = paa3.J().J(iaa_12.k);
        }
        return a2;
    }

    private paa J() {
        int n2;
        iaa_1 iaa_12 = this;
        Object object = null;
        iaa_1 iaa_13 = null;
        int n3 = uSa.E;
        float f2 = JPa.N;
        int n4 = n2 = uSa.E;
        while (n4 < iaa_12.C.size()) {
            paa paa2;
            iaa_1 a2 = iaa_12.C.get(n2);
            paa paa3 = paa2 = n2 > 0 ? iaa_12.C.get(n2 - vRa.d) : null;
            if ((a2.J() == gZ.B || a2.J() == gZ.c) && a2.J() > JPa.N && (object == null || a2.J() > f2)) {
                iaa_1 iaa_14;
                if (n2 > 0) {
                    object = paa2;
                    iaa_14 = a2;
                } else {
                    iaa_14 = a2;
                }
                f2 = iaa_14.J();
            }
            if (a2.J() != null && (iaa_13 == null || a2.f() > (float)n3)) {
                iaa_13 = a2;
            }
            n4 = ++n2;
        }
        if (f2 > eua.C && object != null) {
            return object;
        }
        if (n3 > tTa.h && iaa_13 != null) {
            return iaa_13;
        }
        return null;
    }

    public Gl J() {
        iaa_1 a2;
        return a2.k;
    }

    private void J() {
        a.j = null;
    }

    public iaa_1(Gl gl2) {
        iaa_1 b2 = gl2;
        iaa_1 a2 = this;
        a2.C = Lists.newArrayList();
        a2.k = b2;
    }
}

