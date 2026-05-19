/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  GY
 *  HGa
 *  Mda
 *  NTa
 *  Oz
 *  Uz
 *  gB
 *  wga
 *  ysa
 */
import java.util.Random;

public final class Zea_1
implements gB {
    /*
     * WARNING - void declaration
     */
    public void J(GY gY2, Random random) {
        void b2;
        void a22;
        Zea_1 zea_1 = this;
        Zea_1 c2 = wga.J[a22.nextInt(wga.J.length)];
        int n2 = Oz.J((Random)a22, (int)c2.l(), (int)c2.f());
        c2 = Gea.ha.J(new HGa((wga)c2, n2));
        int a22 = uqa.g + a22.nextInt(tTa.h + n2 * NTa.C) + yRa.d * n2;
        if (a22 > ysa.s) {
            a22 = ysa.s;
        }
        b2.add((Object)new Uz(new Mda(Gea.Qa), new Mda(Gea.kc, a22), (Mda)c2));
    }

    public Zea_1() {
        Zea_1 a2;
    }
}

