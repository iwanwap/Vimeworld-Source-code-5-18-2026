/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  pua
 *  vL
 *  vRa
 */
import java.util.Comparator;

public final class Gga
implements Comparator<vL> {
    private final vL I;

    public Gga(vL vL2) {
        Gga b2 = vL2;
        Gga a2 = this;
        a2.I = b2;
    }

    /*
     * WARNING - void declaration
     */
    public int J(vL vL2, vL vL3) {
        double d2;
        void b2;
        Gga a2;
        Gga c2 = vL3;
        Gga gga = a2 = this;
        double d3 = gga.I.J((vL)b2);
        if (d3 < (d2 = gga.I.J((vL)c2))) {
            return pua.o;
        }
        if (d3 > d2) {
            return vRa.d;
        }
        return uSa.E;
    }
}

