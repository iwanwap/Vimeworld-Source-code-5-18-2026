/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Kpa
 *  sq
 *  vRa
 */
import java.util.function.Function;

public final class Dp
extends sq {
    private final Function<Bp, Bp> I;

    /*
     * WARNING - void declaration
     */
    public boolean J(Kpa kpa2, Bp bp) {
        void a2;
        Object c2 = kpa2;
        Dp b2 = this;
        c2 = b2.I.apply((Bp)a2);
        if (c2 != null && ((Bp)c2).W && OT.i.F.J((Bp)c2)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public Dp(String string) {
        Object b2 = string;
        Dp a2 = this;
        a2.I = RJ.J((String)b2);
    }
}

