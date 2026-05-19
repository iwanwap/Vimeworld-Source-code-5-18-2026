/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AU
 *  Kpa
 *  RR
 *  jt
 *  mS
 *  pS
 *  qu
 */
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class RR_3 {
    public static Du j;
    public static final RR J;
    public static Du A;
    public static final Logger I;

    public RR_3() {
        RR_3 a2;
    }

    /*
     * WARNING - void declaration
     */
    public static void J(Bp bp2, boolean bl2) {
        void a2;
        Bp bp3 = bp2;
        eq b2 = OT.i.F;
        if (a2 != false) {
            if (b2.J((String)bp3.I) == null) {
                b2.l(bp3);
                return;
            }
        } else {
            b2.l((String)bp3.I);
        }
    }

    static {
        J = new RR_3();
        I = LogManager.getLogger(Zqa.c);
        j = new Du();
        A = new Du();
    }

    public void J(Kpa kpa2) {
        RR_3 b2 = kpa2;
        RR_3 a2 = this;
        jt.J((Kpa)b2);
        mS.D();
        qu.A();
        pS.A();
        AU.A();
    }
}

