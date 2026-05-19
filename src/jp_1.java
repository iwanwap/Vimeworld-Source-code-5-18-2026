/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Kpa
 *  sq
 *  vRa
 */
import java.util.function.Function;

public final class jp_1
extends sq {
    private final Function<Bp, Bp> I;

    public jp_1(String string) {
        Object b2 = string;
        jp_1 a2 = this;
        a2.I = RJ.J((String)b2);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Kpa kpa2, Bp bp2) {
        void a2;
        Object c2 = kpa2;
        jp_1 b2 = this;
        c2 = b2.I.apply((Bp)a2);
        if (c2 != null && (((Bp)c2).e || ((Bp)c2).q)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

