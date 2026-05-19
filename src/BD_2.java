/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BD
 *  BS
 *  Cra
 *  F
 *  ISa
 *  JPa
 *  JSa
 *  KA
 *  Kpa
 *  Yra
 *  ad
 *  cI
 *  if
 *  kpa
 *  kqa
 *  kta
 *  ne
 *  pQa
 *  pqa
 *  uKa
 *  uf
 *  vRa
 *  vpa
 *  wI
 *  zU
 */
import net.minecraft.util.ResourceLocation;
import ru.vimeworld.configuration.ConfigurationService;
import ru.vimeworld.configuration.impl.MDConfiguration;
import ru.vimeworld.minidot.emotes.MiniDotEmote;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BD_2
extends ad
implements F {
    private final int e;
    private static final ResourceLocation G;
    private final uf D;
    private MiniDotEmote f;
    private final boolean F;
    private final Xe g;
    private boolean L;
    private final ResourceLocation E;
    private final boolean m;
    private final ResourceLocation C;
    private vC i;
    private MiniDotEmote M;
    private final ResourceLocation k;
    private static final MDConfiguration j;
    private final boolean J;
    private ResourceLocation I;

    public MiniDotEmote f() {
        BD_2 a2;
        return a2.f;
    }

    public void f() {
        BD_2 bD_2;
        BD_2 a2;
        if (a2.A) {
            BD_2 bD_22 = a2;
            bD_2 = bD_22;
            bD_22.i.f(Yra.f, uSa.W);
        } else {
            BD_2 bD_23 = a2;
            bD_2 = bD_23;
            bD_23.i.f(oua.i, uSa.W);
        }
        if (bD_2.L) {
            return;
        }
        BD_2 bD_24 = a2;
        if (a2.A) {
            bD_24.I = a2.k;
            return;
        }
        bD_24.I = a2.E;
    }

    public void f(MiniDotEmote miniDotEmote) {
        Object b2 = miniDotEmote;
        BD_2 a2 = this;
        if (a2.M == b2) {
            return;
        }
        a2.M = b2;
    }

    public BD_2(Xe xe, int n2) {
        String b2;
        BD_2 a2;
        int c2 = n2;
        BD_2 bD_2 = a2 = this;
        BD_2 bD_22 = a2;
        BD_2 bD_23 = a2;
        BD_2 bD_24 = a2;
        bD_23.i = new vC();
        bD_23.L = uSa.E;
        bD_23.g = b2;
        bD_22.e = c2;
        bD_22.f = a2.J(c2);
        a2.k = (ResourceLocation)kpa.t;
        bD_2.j = (MDConfiguration)kpa.t;
        bD_2.D = new uf((Sx)Kpa.J().c);
        bD_2.J = c2 != vRa.d && c2 != AQa.P ? vRa.d : uSa.E;
        a2.m = c2 == tTa.h || c2 == uua.p ? vRa.d : uSa.E;
        a2.F = c2 >= yRa.d && c2 <= tTa.h ? vRa.d : uSa.E;
        int n3 = a2.F ? 1 : 0;
        b2 = c2 == vRa.d || c2 == AQa.P ? Mqa.y : new StringBuilder().insert(3 >> 2, IPa.W).append(a2.m ? pQa.i : kta.Aa).toString();
        a2.E = new ResourceLocation(Cra.V, new StringBuilder().insert(2 & 5, BQa.f).append(a2.F ? JSa.z : vsa.Ha).append(b2).append(KPa.C).toString());
        a2.k = new ResourceLocation(Cra.V, new StringBuilder().insert(3 & 4, BQa.f).append(a2.F ? JSa.z : vsa.Ha).append(b2).append(Ira.b).toString());
        a2.C = new ResourceLocation(Cra.V, new StringBuilder().insert(5 >> 3, MTa.la).append(a2.F ? JSa.z : vsa.Ha).append(b2).append(KPa.C).toString());
        BD_2 bD_25 = a2;
        bD_25.I = bD_25.E;
        bD_25.i.e(oua.i);
        a2.i.C(oua.i);
        a2.i.J(oua.i);
    }

    public MiniDotEmote J() {
        BD_2 a2;
        return a2.M;
    }

    public void J(boolean bl) {
        boolean b2 = bl;
        BD_2 a2 = this;
        if (a2.L == b2) {
            return;
        }
        a2.L = b2;
        if (b2) {
            a2.I = a2.C;
            return;
        }
        BD_2 bD_2 = a2;
        a2.I = a2.A ? bD_2.k : bD_2.E;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, boolean bl) {
        void a2;
        int e22 = n2;
        BD_2 d2 = this;
        if (a2 == false) {
            return;
        }
        if (d2.g.d()) {
            d2.g.J().J(d2.e);
            return;
        }
        if (d2.f == null) {
            BD_2 bD_2 = d2;
            bD_2.g.J(vRa.d != 0);
            bD_2.g.J().J(d2.e);
            return;
        }
        wI e22 = new wI();
        e22.put((Object)Wqa.fa, (Object)BQa.F);
        e22.put((Object)kqa.x, (Object)d2.f.id);
        zU.M.f(e22);
        Kpa.J().J(null);
    }

    public static /* synthetic */ void J(BD a2) {
        KA.J((int)((int)super.d()), (int)(a2.J ? 1 : 0), (float)((float)super.e()), (float)((float)a2.j), (int)((int)super.e()), (int)((int)a2.j), (float)((float)super.e()), (float)((float)a2.j));
    }

    static {
        j = ConfigurationService.J(MDConfiguration.class);
        G = new ResourceLocation(Cra.V, IPa.R);
    }

    /*
     * WARNING - void declaration
     */
    public void f(int n2, int n3) {
        void a2;
        int c2 = n2;
        BD_2 b2 = this;
        int n4 = (double)c2 >= b2.I && (double)a2 >= b2.J && (double)c2 <= b2.I + b2.k && (double)a2 <= b2.J + b2.j ? vRa.d : uSa.E;
        c2 = b2.A ? 1 : 0;
        b2.A = n4;
        if (n4 != c2) {
            b2.f();
        }
    }

    private double e() {
        BD_2 a2;
        return (double)(a2.k + (double)(a2.J ? ISa.E : uSa.E));
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        BD_2 bD_2;
        void b2;
        BD_2 a2;
        int c2 = n3;
        BD_2 bD_22 = a2 = this;
        bD_22.f((int)b2, c2);
        boolean bl = bD_22.i.J();
        uKa.e();
        BD_2 bD_23 = a2;
        BD_2 bD_24 = a2;
        uKa.f((double)(a2.d() + bD_24.e() / KPa.y), (double)(a2.J + a2.j / KPa.y), (double)oua.i);
        uKa.J((double)bD_24.i.l(), (double)a2.i.l(), (double)oua.i);
        uKa.f((double)(-(bD_23.d() + a2.e() / KPa.y)), (double)(-(a2.J + a2.j / KPa.y)), (double)oua.i);
        Kpa.J().J().J(a2.I);
        uKa.K();
        uKa.B();
        uKa.J();
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)a2.g.f().J());
        KA.J((int)((int)bD_23.d()), (int)(a2.J ? 1 : 0), (float)((float)a2.e()), (float)((float)a2.j), (int)((int)a2.e()), (int)((int)a2.j), (float)((float)a2.e()), (float)((float)a2.j));
        if (bD_23.f == null && a2.M == null) {
            Kpa.J().J().J(G);
            BD_2 bD_25 = a2;
            bD_2 = bD_25;
            KA.J((int)((int)(a2.I + bD_25.k / KPa.y - Wqa.m)), (int)(a2.J + a2.j / KPa.y - Wqa.m), (float)eta.e, (float)eta.e, (int)kTa.j, (int)kTa.j, (float)eta.e, (float)eta.e);
        } else {
            BD_2 bD_26;
            BD_2 bD_27 = a2;
            cI.J((Runnable)ne.J((BD)bD_27));
            if (bD_27.M != null && a2.D.J() != a2.M) {
                BD_2 bD_28 = a2;
                bD_26 = bD_28;
                a2.D.J(bD_28.M, null);
            } else {
                if (a2.M == null && a2.f != null && a2.D.J() != a2.f) {
                    BD_2 bD_29 = a2;
                    bD_29.D.J(bD_29.f, null);
                }
                bD_26 = a2;
            }
            bD_26.D.J(JPa.N, JPa.N, (double)(a2.I + a2.k / KPa.y), (double)(a2.J + a2.j - zOa.X), NSa.B, JPa.N, vpa.o, JPa.N, uSa.E != 0);
            cI.J();
            bD_2 = a2;
        }
        reference var3_5 = bD_2.I + (a2.J ? (a2.m ? vqa.P : (double)(a2.k - hQa.x)) : (double)(a2.k / KPa.y - hQa.x));
        int n4 = a2.J + (a2.J ? (a2.F ? (double)(a2.j - Asa.y) : zOa.y) : (a2.F ? (double)(a2.j - hQa.x) : vqa.P));
        if.f((String)(a2.e + Mqa.y), (double)var3_5, (double)n4, (float)kta.v, (float)a2.g.f().J(), (boolean)a2.L);
        uKa.D();
    }

    public void J(MiniDotEmote miniDotEmote) {
        Object b2 = miniDotEmote;
        BD_2 a2 = this;
        if (a2.f == b2) {
            return;
        }
        a2.f = b2;
    }

    private double d() {
        BD_2 a2;
        return (double)(a2.I - (double)(a2.J ? (a2.m ? uSa.E : ISa.E) : uSa.E));
    }

    private MiniDotEmote J(int n2) {
        int b22;
        block3: {
            b22 = n2;
            BD_2 a2 = this;
            try {
                b22 = j.J().get(b22);
                if (b22 != 0) break block3;
                return null;
            }
            catch (Exception b22) {
                return null;
            }
        }
        return (MiniDotEmote)BS.ITEMS.get(b22);
    }
}

