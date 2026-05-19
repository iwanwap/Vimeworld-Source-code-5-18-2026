/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Hs
 *  Js
 *  MQa
 *  Oz
 *  dT
 *  gS
 *  pqa
 */
import java.util.Iterator;

public final class hs_1
extends Hs {
    private Hs rainbowHook;

    public void J(dT dT2) {
        hs_1 b2 = dT2;
        hs_1 a2 = this;
        if (a2.rainbowHook != null) {
            a2.rainbowHook.J((dT)b2);
        }
    }

    public hs_1(boolean bl) {
        boolean b2 = bl;
        hs_1 a2 = this;
        if (b2) {
            hs_1 hs_12 = a2;
            hs_12.rainbowHook = new gS();
        }
    }

    public void f(dT dT2) {
        Iterator<Js> iterator;
        hs_1 b22 = dT2;
        hs_1 a2 = this;
        if (a2.rainbowHook != null) {
            a2.rainbowHook.f((dT)b22);
        }
        float b22 = ((dT)b22).time % Jpa.r * MQa.L;
        Iterator<Js> iterator2 = iterator = a2.model.J().iterator();
        while (iterator2.hasNext()) {
            iterator.next().offsetY = Oz.C((float)b22) * APa.Ha;
            b22 -= pqa.r;
            iterator2 = iterator;
        }
    }
}

