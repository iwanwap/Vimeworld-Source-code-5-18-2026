/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Kpa
 *  Oz
 *  PNa
 *  ooa
 *  rd
 *  vRa
 */
import java.util.Random;
import net.minecraft.util.ResourceLocation;

public final class WMa_2
implements rd {
    private final Kpa j;
    private final Random J;
    private int A;
    private X I;

    public void J(ooa ooa2) {
        WMa_2 b2 = ooa2;
        WMa_2 a2 = this;
        a2.I = PNa.J((ResourceLocation)b2.getMusicLocation());
        a2.j.J().J(a2.I);
        a2.A = vqa.F;
    }

    public WMa_2(Kpa kpa2) {
        WMa_2 a2;
        WMa_2 b2 = kpa2;
        WMa_2 wMa_2 = a2 = this;
        WMa_2 wMa_22 = a2;
        wMa_2.J = new Random();
        wMa_2.A = ySa.T;
        wMa_2.j = b2;
    }

    public void f() {
        WMa_2 a2;
        if (a2.I != null) {
            a2.j.J().f(a2.I);
            a2.I = null;
            a2.A = uSa.E;
        }
    }

    public void J() {
        WMa_2 wMa_2;
        WMa_2 wMa_22 = wMa_2 = this;
        WMa_2 a2 = wMa_22.j.J();
        if (wMa_22.I != null) {
            if (!a2.getMusicLocation().equals(wMa_2.I.J())) {
                WMa_2 wMa_23 = wMa_2;
                wMa_23.j.J().f(wMa_2.I);
                wMa_2.A = Oz.J((Random)wMa_23.J, (int)uSa.E, (int)(a2.getMinDelay() / uqa.g));
            }
            if (!wMa_2.j.J().J(wMa_2.I)) {
                wMa_2.I = null;
                wMa_2.A = Math.min(Oz.J((Random)wMa_2.J, (int)a2.getMinDelay(), (int)a2.getMaxDelay()), wMa_2.A);
            }
        }
        if (wMa_2.I == null) {
            int n2 = wMa_2.A;
            wMa_2.A = n2 - vRa.d;
            if (n2 <= 0) {
                wMa_2.J((ooa)a2);
            }
        }
    }
}

