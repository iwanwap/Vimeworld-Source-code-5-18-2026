/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Dh
 *  EK
 *  Eoa
 *  Gg
 *  IG
 *  JPa
 *  Kpa
 *  NA
 *  Tg
 *  U
 *  XTa
 *  ZJa
 *  eI
 *  j
 *  jRa
 *  mka
 *  pqa
 *  pua
 *  ska
 *  uKa
 *  uw
 *  vRa
 *  xy
 */
import java.io.IOException;
import java.util.Iterator;
import net.minecraft.util.ResourceLocation;
import optifine.Config;

public final class wi_3
implements j {
    public int m;
    private final Kpa C;
    public final Dh i;
    public final cj M;
    public int k;
    public static int[] j = new int[opa.w];
    public final eI J;
    public static int[] A = j;
    private long I;

    public wi_3(Kpa kpa2) {
        wi_3 a2;
        wi_3 b2 = kpa2;
        wi_3 wi_32 = a2 = this;
        a2.I = nqa.i;
        a2.m = uSa.E;
        a2.k = uSa.E;
        a2.C = b2;
        wi_3 wi_33 = a2;
        wi_32.i = new Dh();
        wi_33.J = new eI();
        wi_32.M = new cj();
        if (a2.C.J() instanceof NA) {
            ((NA)b2.J()).J((j)a2);
        }
    }

    public void l() {
        Object a2;
        wi_3 wi_32 = this;
        if (wi_32.J.J() == 0) {
            return;
        }
        wi_3 wi_33 = wi_32;
        Eoa eoa2 = wi_33.C.Ta;
        Object object = a2 = wi_33.J.J().iterator();
        while (object.hasNext()) {
            ((qI)a2.next()).f((Gg)eoa2);
            object = a2;
        }
    }

    public void f() {
        wi_3 a2;
        wi_3 wi_32 = a2;
        wi_32.i.J();
        wi_32.J.J();
        wi_32.M.J();
    }

    public static int l(int a2) {
        if (uw.f != pua.o) {
            return EK.J((int)a2, (int)uw.f);
        }
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(float f2) {
        wi_3 wi_32 = this;
        wi_32.k = uSa.E;
        if (wi_32.J.J() == 0) {
            return;
        }
        wi_3 wi_33 = wi_32;
        wi_33.C.Ta.H.J(Upa.Da);
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        IG iG2 = new IG(XTa.W, mka.F);
        iG2.J();
        float f3 = (float)ska.C;
        float f4 = (float)ska.k;
        float f5 = (float)ska.j;
        long l2 = OT.e = System.currentTimeMillis();
        Iterator b2 = wi_33.J.J(l2).iterator();
        block0: while (true) {
            Iterator iterator = b2;
            while (iterator.hasNext()) {
                void a2;
                qI qI2 = (qI)b2.next();
                if (qI2.x < l2) {
                    iterator = b2;
                    wi_32.J.J(qI2);
                    continue;
                }
                if (!qI2.J()) continue block0;
                qI2.J(iG2, l2, (float)a2, f3, f4, f5);
                wi_32.k += vRa.d;
                continue block0;
            }
            break;
        }
        iG2.f();
        wi_32.C.Ta.H.f();
    }

    public void J() {
        Object a2;
        wi_3 wi_32 = this;
        Object object = a2 = wi_32.i.J().iterator();
        while (object.hasNext()) {
            ((Tg)a2.next()).f();
            object = a2;
        }
    }

    public static int f(int a2) {
        if (uw.J != pua.o) {
            return uw.J;
        }
        if (uw.t != pua.o) {
            return EK.J((int)a2, (int)uw.t);
        }
        return a2;
    }

    /*
     * Unable to fully structure code
     */
    public void J(ALa var1_1) {
        var2_2 = this;
        var2_2.C.Ta.H.J(Upa.Da);
        uKa.e();
        uKa.I((int)Ira.A);
        uKa.J((int)jRa.m, (float)Jpa.B);
        if (Config.h()) {
            pA.r();
        }
        var2_2.m = uSa.E;
        var9_3 = var2_2.C.J().l();
        var3_4 = OT.e = System.currentTimeMillis();
        v0 = var5_5 = OT.e - var2_2.I > DPa.o ? vRa.d : uSa.E;
        if (var5_5 != 0) {
            var2_2.I = var3_4;
        }
        var6_6 = var2_2.i.J(var3_4);
        var7_7 = var6_6.length;
        v1 = var8_8 = uSa.E;
        while (v1 < var7_7) {
            block10: {
                block9: {
                    b = var6_6[var8_8];
                    if (b.M >= var3_4) break block9;
                    if (var2_2.i.J().contains(b)) {
                        b.J();
                        var2_2.i.J((Tg)b);
                    }
                    break block10;
                }
                if (!b.J()) ** GOTO lbl38
                if (var9_3 && b.e != Tg.I) {
                    uKa.z();
                    uKa.f((float)pqa.r, (float)pqa.r, (float)JPa.N, (float)pqa.r);
                    uKa.C((float)pqa.r);
                    ZJa.J((xy)b.e.C(-RKa.k, -RKa.C, -RKa.f));
                    uKa.H();
                }
                if (b.J((ALa)a)) {
                    b.J(var3_4);
                    var2_2.m += vRa.d;
                } else {
                    if (var5_5 != 0) {
                        b.l(var3_4);
                    }
lbl38:
                    // 4 sources

                    b.f(var3_4);
                }
            }
            v1 = ++var8_8;
        }
        if (var9_3) {
            var2_2.M.J((ALa)a);
        }
        uKa.J();
        uKa.J((boolean)vRa.d);
        uKa.k();
        uKa.D();
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        var2_2.C.Ta.H.f();
    }

    public void J(U u2) {
        wi_3 b2 = u2;
        wi_3 a2 = this;
        try {
            wi_3 wi_32 = b2;
            j = gLa.J((U)wi_32, new ResourceLocation(zua.fa, Nta.Aa));
            wi_3 wi_33 = b2;
            A = gLa.J((U)wi_32, new ResourceLocation(zua.fa, Xpa.j));
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    public static int J(int a2) {
        if (uw.s != pua.o) {
            return uw.s;
        }
        if (uw.K != pua.o) {
            return EK.J((int)a2, (int)uw.K);
        }
        return a2;
    }
}

