/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Yha
 *  ZIa
 *  vRa
 *  yra
 */
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class gC {
    private final ZIa k;
    private int j;
    private int J;
    private final Yha A;
    private static final Logger I = LogManager.getLogger();

    public final int l() {
        gC a2;
        return a2.j;
    }

    public boolean equals(Object object) {
        Object a2 = this;
        Object b2 = object;
        if (a2 == b2) {
            return vRa.d != 0;
        }
        if (b2 != null && a2.getClass() == b2.getClass()) {
            b2 = (gC)b2;
            if (((gC)a2).J != ((gC)b2).J) {
                return uSa.E != 0;
            }
            if (((gC)a2).j != ((gC)b2).j) {
                return uSa.E != 0;
            }
            if (((gC)a2).A != ((gC)b2).A) {
                return uSa.E != 0;
            }
            if (((gC)a2).k == ((gC)b2).k) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    private final boolean J(int n2, ZIa zIa) {
        void b2;
        gC c2 = zIa;
        gC a2 = this;
        if (b2 == false || c2 == ZIa.UV) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public final Yha J() {
        gC a2;
        return a2.A;
    }

    /*
     * WARNING - void declaration
     */
    public gC(int n2, Yha yha, ZIa zIa, int n3) {
        void a2;
        void c2;
        gC gC2;
        void d2;
        gC b2;
        gC e2 = zIa;
        gC gC3 = b2 = this;
        if (!gC3.J((int)d2, (ZIa)e2)) {
            I.warn(fPa.c);
            gC2 = b2;
            b2.k = ZIa.UV;
        } else {
            gC2 = b2;
            b2.k = e2;
        }
        gC2.A = c2;
        gC gC4 = b2;
        gC4.j = d2;
        gC4.J = a2;
    }

    public final boolean J() {
        gC a2;
        if (a2.k == ZIa.POSITION) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public int hashCode() {
        gC gC2 = this;
        int a2 = gC2.A.hashCode();
        a2 = tua.U * a2 + gC2.k.hashCode();
        a2 = tua.U * a2 + gC2.j;
        a2 = tua.U * a2 + gC2.J;
        return a2;
    }

    public final ZIa J() {
        gC a2;
        return a2.k;
    }

    public final int f() {
        gC a2;
        return a2.A.getSize() * a2.J;
    }

    public final int J() {
        gC a2;
        return a2.J;
    }

    public String toString() {
        gC a2;
        return a2.J + yra.t + a2.k.getDisplayName() + yra.t + a2.A.getDisplayName();
    }
}

