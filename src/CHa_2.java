/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ypa
 *  fTa
 *  sia
 *  vRa
 *  vpa
 *  wga
 */
import net.minecraft.util.ResourceLocation;

public final class CHa_2
extends wga {
    /*
     * WARNING - void declaration
     */
    public CHa_2(int n2, ResourceLocation resourceLocation, int n3, sia sia2) {
        CHa_2 e2;
        void b2;
        void c2;
        void d2;
        CHa_2 cHa_2 = cHa_22;
        CHa_2 cHa_22 = sia2;
        CHa_2 a2 = cHa_2;
        super((int)d2, (ResourceLocation)c2, (int)b2, (sia)e2);
        if (e2 == sia.DIGGER) {
            a2.J(dua.E);
            return;
        }
        if (e2 == sia.FISHING_ROD) {
            a2.J(fTa.M);
            return;
        }
        a2.J(tSa.s);
    }

    public int f(int n2) {
        int b2 = n2;
        CHa_2 a2 = this;
        return super.J(b2) + vpa.o;
    }

    public int f() {
        return yRa.d;
    }

    public boolean J(wga wga2) {
        CHa_2 a2 = this;
        CHa_2 b2 = wga2;
        if (super.J((wga)b2) && b2.I != CHa_2.W.I) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public int J(int n2) {
        int b2 = n2;
        CHa_2 a2 = this;
        return Ypa.A + (b2 - vRa.d) * WOa.fa;
    }
}

