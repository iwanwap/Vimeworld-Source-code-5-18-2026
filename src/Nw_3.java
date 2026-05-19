/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Dw
 *  EV
 *  Fw
 *  NPa
 *  NTa
 *  QFa
 *  XTa
 *  Xv
 *  Ypa
 *  eAa
 *  iea
 *  jsa
 *  lqa
 *  pPa
 *  tU
 *  vRa
 *  vpa
 */
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;

public final class Nw_3 {
    private static final List<baa> CHEST_CONTENT_WEIGHT_LIST;

    public Nw_3() {
        Nw_3 a2;
    }

    public static void J() {
        uv.f(Dw.class, lQa.i);
        uv.f(Fw.class, jsa.ja);
        uv.f(tU.class, zua.k);
        uv.f(EV.class, vpa.L);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ uU f(uU uU2, List list, Random random, int n2, int n3, int n4, DZ dZ2, int n5) {
        void h2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        void g2;
        int n6 = n5;
        uU a2 = uU2;
        return Nw_3.J(a2, (List<uU>)g2, (Random)f2, (int)e2, (int)d2, (int)c2, (DZ)b2, (int)h2);
    }

    public static /* synthetic */ List J() {
        return CHEST_CONTENT_WEIGHT_LIST;
    }

    /*
     * WARNING - void declaration
     */
    private static uU J(List<uU> list, Random random, int n2, int n3, int n4, DZ dZ2, int n5) {
        void a2;
        void b2;
        void c2;
        void d2;
        void e2;
        Random g2 = random;
        List<uU> f2 = list;
        int n6 = g2.nextInt(ySa.T);
        if (n6 >= Fua.J) {
            Xv xv2 = Fw.J(f2, (Random)g2, (int)e2, (int)d2, (int)c2, (DZ)b2);
            if (xv2 != null) {
                return new Fw((int)a2, g2, xv2, (DZ)b2);
            }
        } else if (n6 >= NPa.e) {
            Xv xv3 = EV.J(f2, (Random)g2, (int)e2, (int)d2, (int)c2, (DZ)b2);
            if (xv3 != null) {
                return new EV((int)a2, g2, xv3, (DZ)b2);
            }
        } else {
            Xv xv4 = Dw.J(f2, (Random)g2, (int)e2, (int)d2, (int)c2, (DZ)b2);
            if (xv4 != null) {
                return new Dw((int)a2, g2, xv4, (DZ)b2);
            }
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private static uU J(uU uU2, List<uU> list, Random random, int n2, int n3, int n4, DZ dZ2, int n5) {
        void c2;
        void a2;
        int h22 = n2;
        uU e2 = uU2;
        if (a2 > Yqa.i) {
            return null;
        }
        if (Math.abs(h22 - e2.J().minX) <= Fua.J && Math.abs((int)(c2 - e2.J().minZ)) <= Fua.J) {
            void b2;
            void d2;
            void f2;
            void g2;
            uU h22 = Nw_3.J((List<uU>)g2, (Random)f2, h22, (int)d2, (int)c2, (DZ)b2, (int)(a2 + vRa.d));
            if (h22 != null) {
                g2.add(h22);
                h22.J(e2, (List<uU>)g2, (Random)f2);
            }
            return h22;
        }
        return null;
    }

    static {
        baa[] baaArray = new baa[uua.s];
        baaArray[uSa.E] = new baa(Gea.GA, uSa.E, vRa.d, tTa.h, NTa.C);
        baaArray[vRa.d] = new baa(Gea.Bb, uSa.E, vRa.d, yRa.d, tTa.h);
        baaArray[uqa.g] = new baa(Gea.zc, uSa.E, AQa.P, WOa.fa, tTa.h);
        baaArray[yRa.d] = new baa(Gea.Q, iea.BLUE.getDyeDamage(), AQa.P, WOa.fa, tTa.h);
        baaArray[AQa.P] = new baa(Gea.b, uSa.E, vRa.d, uqa.g, yRa.d);
        baaArray[tTa.h] = new baa(Gea.qc, uSa.E, yRa.d, Yqa.i, NTa.C);
        baaArray[uua.p] = new baa(Gea.Ra, uSa.E, vRa.d, yRa.d, Ypa.A);
        baaArray[XTa.W] = new baa(Gea.gB, uSa.E, vRa.d, vRa.d, vRa.d);
        baaArray[Yqa.i] = new baa(eAa.J((Block)QFa.SA), uSa.E, AQa.P, Yqa.i, vRa.d);
        baaArray[WOa.fa] = new baa(Gea.wc, uSa.E, uqa.g, AQa.P, NTa.C);
        baaArray[NTa.C] = new baa(Gea.tb, uSa.E, uqa.g, AQa.P, NTa.C);
        baaArray[pPa.f] = new baa(Gea.NA, uSa.E, vRa.d, vRa.d, yRa.d);
        baaArray[lqa.s] = new baa(Gea.La, uSa.E, vRa.d, vRa.d, vRa.d);
        CHEST_CONTENT_WEIGHT_LIST = Lists.newArrayList(baaArray);
    }
}

