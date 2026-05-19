/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cra
 *  DQa
 *  Ifa
 *  NCa
 *  NTa
 *  RC
 *  RQa
 *  Sda
 *  Usa
 *  Waa
 *  XTa
 *  aSa
 *  asa
 *  cRa
 *  dpa
 *  fpa
 *  hqa
 *  hra
 *  isa
 *  vQa
 *  vRa
 *  waa
 *  yra
 */
import java.util.Iterator;
import java.util.UUID;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class Kha {
    public static final RC M;
    public static final RC k;
    public static final RC j;
    private static final Logger J;
    public static final RC A;
    public static final RC I;

    static {
        J = LogManager.getLogger();
        M = new Sda((RC)null, zOa.ga, vQa.c, aSa.V, yra.Y).J(Npa.x).J(vRa.d != 0);
        I = new Sda((RC)null, tpa.Z, hqa.ha, aSa.V, fpa.r).J(tTa.w);
        k = new Sda((RC)null, gua.o, aSa.V, aSa.V, oua.i).J(asa.i);
        j = new Sda((RC)null, cRa.ja, dpa.X, aSa.V, yra.Y).J(isa.u).J(vRa.d != 0);
        A = new Sda((RC)null, sqa.B, KPa.y, aSa.V, fpa.r);
    }

    public static waa J(Ifa ifa) {
        Ifa ifa2 = ifa;
        waa waa2 = new waa();
        Iterator a2 = ifa2.J().iterator();
        Iterator iterator = a2;
        while (iterator.hasNext()) {
            bA bA2 = (bA)a2.next();
            iterator = a2;
            waa2.J((NCa)Kha.J(bA2));
        }
        return waa2;
    }

    /*
     * WARNING - void declaration
     */
    public static void J(Ifa ifa, waa waa2) {
        void a2;
        int n2;
        Ifa ifa2 = ifa;
        int n3 = n2 = uSa.E;
        while (n3 < a2.J()) {
            Ifa b2 = a2.J(n2);
            bA bA2 = ifa2.J(b2.J(DQa.N));
            if (bA2 != null) {
                Kha.J(bA2, (Waa)b2);
            } else {
                J.warn(new StringBuilder().insert(3 >> 2, DQa.b).append(b2.J(DQa.N)).append(XTa.Z).toString());
            }
            n3 = ++n2;
        }
    }

    private static void J(bA bA2, Waa waa2) {
        bA b2 = waa2;
        bA a2 = bA2;
        bA bA3 = b2;
        a2.J(bA3.J(Cra.g));
        if (bA3.J(hra.J, WOa.fa)) {
            int n2;
            b2 = b2.J(hra.J, NTa.C);
            int n3 = n2 = uSa.E;
            while (n3 < b2.J()) {
                CEa cEa = Kha.J(b2.J(n2));
                if (cEa != null) {
                    CEa cEa2 = a2.J(cEa.J());
                    if (cEa2 != null) {
                        a2.f(cEa2);
                    }
                    a2.J(cEa);
                }
                n3 = ++n2;
            }
        }
    }

    public static CEa J(Waa waa2) {
        Waa waa3 = waa2;
        Object a22 = new UUID(waa3.J(NTa.j), waa3.J(csa.R));
        try {
            return new CEa((UUID)a22, waa3.J(DQa.N), waa3.J(tua.h), waa3.J(Usa.G));
        }
        catch (Exception a22) {
            J.warn(new StringBuilder().insert(3 >> 2, RQa.z).append(a22.getMessage()).toString());
            return null;
        }
    }

    private static Waa J(bA bA2) {
        bA bA3 = bA2;
        Waa waa2 = new Waa();
        Iterator a2 = bA3.J();
        Waa waa3 = waa2;
        waa3.J(DQa.N, a2.J());
        bA bA4 = bA3;
        waa3.J(Cra.g, bA4.J());
        a2 = bA4.J();
        if (a2 != null && !a2.isEmpty()) {
            waa waa4 = new waa();
            a2 = a2.iterator();
            while (a2.hasNext()) {
                CEa cEa = (CEa)a2.next();
                if (!cEa.J()) continue;
                waa4.J((NCa)Kha.J(cEa));
            }
            waa2.J(hra.J, (NCa)waa4);
        }
        return waa2;
    }

    public Kha() {
        Kha a2;
    }

    private static Waa J(CEa a2) {
        Waa waa2 = new Waa();
        waa2.J(DQa.N, a2.J());
        waa2.J(tua.h, a2.J());
        waa2.J(Usa.G, a2.J());
        waa2.J(NTa.j, a2.J().getMostSignificantBits());
        waa2.J(csa.R, a2.J().getLeastSignificantBits());
        return waa2;
    }
}

