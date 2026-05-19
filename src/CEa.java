/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Oz
 *  SRa
 *  pqa
 *  vRa
 *  vpa
 */
import io.netty.util.internal.ThreadLocalRandom;
import java.util.Random;
import java.util.UUID;
import org.apache.commons.lang3.Validate;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class CEa {
    private boolean k;
    private final double j;
    private final int J;
    private final String A;
    private final UUID I;

    public boolean J() {
        CEa a2;
        return a2.k;
    }

    public int J() {
        CEa a2;
        return a2.J;
    }

    public boolean equals(Object object) {
        Object a2 = this;
        Object b2 = object;
        if (a2 == b2) {
            return vRa.d != 0;
        }
        if (b2 instanceof CEa) {
            b2 = (CEa)b2;
            if (((CEa)a2).I != null ? !((CEa)a2).I.equals(((CEa)b2).I) : ((CEa)b2).I != null) {
                return uSa.E != 0;
            }
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public UUID J() {
        CEa a2;
        return a2.I;
    }

    public CEa J(boolean bl) {
        boolean b2 = bl;
        CEa a2 = this;
        a2.k = b2;
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public CEa(UUID uUID, String string, double d2, int n2) {
        void e2;
        void b2;
        void c2;
        void d3;
        CEa a2;
        int n3 = n2;
        CEa cEa2 = a2 = this;
        CEa cEa3 = a2;
        a2.k = vRa.d;
        cEa3.I = d3;
        cEa3.A = c2;
        cEa2.j = b2;
        cEa2.J = e2;
        Validate.notEmpty(c2, SRa.r, new Object[uSa.E]);
        Validate.inclusiveBetween(nqa.i, kra.G, (long)e2, vpa.ja);
    }

    public String toString() {
        CEa a2;
        return new StringBuilder().insert(3 >> 2, pqa.C).append(a2.j).append(rpa.i).append(a2.J).append(tpa.Ha).append(a2.A).append((char)CRa.L).append(tua.Ha).append(a2.I).append(wta.Y).append(a2.k).append((char)ySa.Z).toString();
    }

    public int hashCode() {
        CEa a2;
        if (a2.I != null) {
            return a2.I.hashCode();
        }
        return uSa.E;
    }

    public String J() {
        CEa a2;
        return a2.A;
    }

    public double J() {
        CEa a2;
        return a2.j;
    }

    /*
     * WARNING - void declaration
     */
    public CEa(String string, double d2, int n2) {
        void d3;
        void b2;
        void c2;
        int n3 = n2;
        CEa a2 = this;
        a2(Oz.J((Random)ThreadLocalRandom.current()), (String)c2, (double)b2, (int)d3);
    }
}

