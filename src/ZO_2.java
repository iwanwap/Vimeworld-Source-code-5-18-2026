/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Kpa
 *  sq
 *  vRa
 */
import java.util.function.Function;

public final class ZO_2
extends sq {
    private final Function<Bp, Bp> I;

    public boolean J(Kpa kpa2, Bp bp2) {
        Object c2 = bp2;
        ZO_2 a2 = this;
        if (a2.I.apply((Bp)c2) != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public ZO_2(String string) {
        Object b2 = string;
        ZO_2 a2 = this;
        a2.I = RJ.J((String)b2);
    }
}

