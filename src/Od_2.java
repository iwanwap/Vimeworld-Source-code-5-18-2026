/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ANa
 *  BB
 *  Cra
 *  ISa
 *  JPa
 *  KA
 *  Kh
 *  Kpa
 *  NQa
 *  NTa
 *  Od
 *  Sf
 *  TU
 *  Ypa
 *  ZOa
 *  aSa
 *  asa
 *  cQa
 *  cRa
 *  eS
 *  pqa
 *  pua
 *  qta
 *  rt
 *  uKa
 *  uRa
 *  uf
 *  ui
 *  vRa
 *  zU
 */
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.MiniDotItem;
import net.xtrafrancyz.mods.minidot.items.impl.ImageArrowTrail;
import ru.vimeworld.minidot.atlas.emoji.MiniDotEmoji;
import ru.vimeworld.minidot.emotes.MiniDotEmote;

public final class Od_2 {
    private final jU M;
    private final uf k;
    private final vC j;
    private final MiniDotItem J;
    private static final ResourceLocation A = new ResourceLocation(Cra.V, xTa.z);
    private boolean I;

    /*
     * Unable to fully structure code
     */
    public void J(boolean var1_2) {
        b = var1_2;
        a = this;
        if (a.I == b) ** GOTO lbl16
        a.I = b;
        if (a.I) {
            v0 = a;
            v1 = v0;
            v0.j.J(ZOa.Ja, uRa.I);
        } else {
            a.j.e(aSa.V);
            a.j.C(aSa.V);
            a.j.J(aSa.V);
lbl16:
            // 2 sources

            v1 = a;
        }
        v1.j.J();
        if (b && a.j.l() >= ZOa.Ja) {
            a.j.e(aSa.V);
            a.j.J(ZOa.Ja, uRa.I);
        }
    }

    public jU J() {
        Od_2 a2;
        return a2.M;
    }

    /*
     * WARNING - void declaration
     */
    private void J(float f2, float f3, double d2, double d3, float f4, float f5, float f6, boolean bl) {
        void b2;
        void c2;
        void g2;
        void h2;
        void a2;
        void e2;
        void f7;
        int n2;
        void d4;
        Od_2 od_2 = this;
        if (od_2.J.type != eS.SHADOW) {
            uKa.B();
            uKa.J();
            uKa.K();
            uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
            n2 = (int)((double)d4 * Bta.c);
            int i2 = (int)((double)d4 / vqa.c);
            Kpa.J().J().J(A);
            int n3 = n2;
            KA.J((int)((int)(f7 - (double)n2 / KPa.y)), (int)((int)(e2 - (double)i2 / KPa.y / KPa.y) - Ypa.A), (float)n2, (float)i2, (int)n3, (int)i2, (float)n3, (float)i2);
        }
        n2 = Kpa.J().ta instanceof mx;
        if (od_2.k != null && (a2 != false || n2 != 0 && (mx.J().J() == TU.DEATH || mx.J().J() == TU.EMOTES))) {
            od_2.k.J((float)h2, (float)g2, (double)f7, (double)e2, (float)c2, (float)b2, (int)d4, JPa.N, uSa.E != 0);
            return;
        }
        int i2 = uSa.E;
        if (n2 != 0 && mx.J().J() == TU.AURAS) {
            i2 = Fsa.d;
        }
        vb.J((int)h2 + i2, (int)g2 + i2, (int)f7, (int)e2, (int)d4, (float)c2, (float)b2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(Od od2, double d2, double d3, double d4, double d5) {
        void a2;
        void b2;
        void c2;
        void d6;
        Od od3;
        Od od4 = od3 = od2;
        Od e2 = od4.J.preview.J();
        if (od4.J.type == eS.ARMOR) {
            ANa aNa2 = Kpa.J().c;
            Kpa.J().c.K.A = XR.j.get((int)(OT.e / asa.fa % (long)XR.j.size()));
        }
        int n2 = uSa.E;
        int n3 = uSa.E;
        if (e2 == null) {
            Od od5 = od3;
            super.J(od5.j.J(), JPa.N, (int)(d6 + (double)n3 + c2 / KPa.y), (int)(b2 + a2 - ypa.X), ISa.a, Ypa.A + n2, NQa.d);
            return;
        }
        int n4 = od3.J.preview.J() ? uSa.E : cRa.n;
        Od od6 = od3;
        super.J(od6.j.J() + (float)e2.C(), e2.l(), (int)(d6 + (double)n3 + c2 / KPa.y + (double)e2.d()), (int)(b2 + a2 - ypa.X + (double)e2.f()), e2.J(), qta.D + e2.J() + (float)(n2 += n4), NQa.d + e2.f());
    }

    public void J(double d2, double c2, double b2, double a2) {
        Od_2 e2;
        e2.J(d2, c2, b2, a2, uSa.E != 0);
    }

    /*
     * WARNING - void declaration
     */
    public Od_2(MiniDotItem miniDotItem, rt rt2) {
        void a2;
        Od_2 b2;
        MiniDotItem c2 = miniDotItem;
        Od_2 od_2 = b2 = this;
        Od_2 od_22 = b2;
        Od_2 od_23 = b2;
        od_22.j = new vC();
        od_2.J = c2;
        od_22.M = new jU(zU.M.J());
        od_2.M.k = vRa.d;
        od_2.M.J();
        eS eS2 = od_2.M.J(c2);
        if (eS2 == eS.PET) {
            eS2 = eS.PET_LEFT;
        }
        b2.M.J(eS2, c2, (rt)a2, uSa.E != 0);
        if (c2 instanceof MiniDotEmote) {
            b2.k = new uf((Sx)Kpa.J().c);
            return;
        }
        b2.k = null;
    }

    /*
     * WARNING - void declaration
     */
    public void J(double d2, double d3, double d4, double d5, boolean bl) {
        void b2;
        void d6;
        void c2;
        void e2;
        Object f2;
        Od_2 od_2 = this;
        if (od_2.k != null) {
            void a2;
            if (od_2.k.J() != od_2.J) {
                Od_2 od_22 = od_2;
                od_22.k.J((MiniDotEmote)od_22.J, null);
            }
            if ((f2 = od_2.J.preview.J()) == null) {
                Od_2 od_23 = od_2;
                od_23.J(od_23.j.J(), JPa.N, (double)(e2 + c2 / KPa.y), (double)(d6 + b2 - ypa.X), qta.D, NQa.d, ISa.a, (boolean)a2);
            } else {
                int n2 = od_2.J.preview.J() ? uSa.E : cRa.n;
                Od_2 od_24 = od_2;
                od_24.J(od_24.j.J() - (float)n2 + (float)f2.C(), f2.l(), (double)(e2 + c2 / KPa.y + (double)f2.d()), (double)(d6 + b2 - ypa.X + (double)f2.f()), Jsa.ha + f2.J(), qta.D + f2.J() + (float)n2, NQa.d + f2.f(), (boolean)a2);
            }
            uKa.K();
            return;
        }
        if (od_2.J.type == eS.ARROW && od_2.J.model instanceof ImageArrowTrail) {
            f2 = (ImageArrowTrail)od_2.J.model;
            if (((ImageArrowTrail)f2).J().f()) {
                ui ui2 = ((ImageArrowTrail)f2).J();
                uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
                uKa.K();
                uKa.C((int)ui2.I);
                ui ui3 = ui2;
                ui ui4 = ui2;
                Kh.J((float)((int)(e2 + c2 / KPa.y - NTa.la)), (float)((int)(d6 + b2 / KPa.y - NTa.la)), (float)cQa.Ha, (float)cQa.Ha, (float)ui3.A, (float)ui3.j, (float)ui4.k, (float)ui4.J);
                return;
            }
        } else {
            if (od_2.J.type == eS.EMOJI) {
                f2 = Sf.J((char)((MiniDotEmoji)od_2.J).J());
                if (f2 == null) {
                    return;
                }
                ((He)f2).J((int)(e2 + c2 / KPa.y - NTa.la), (int)(d6 + b2 / KPa.y - NTa.la), Jpa.Ha, Jpa.Ha, pua.o);
                return;
            }
            f2 = zU.M.J();
            zU.M.J(od_2.M);
            vb.J(BB.J((Od)od_2, (double)e2, (double)c2, (double)d6, (double)b2));
            zU.M.J((jU)f2);
        }
    }

    /*
     * WARNING - void declaration
     */
    private void J(float f2, float f3, double d2, double d3, float f4, float f5, float f6) {
        void h2;
        void b2;
        void c2;
        void d4;
        void e2;
        void f7;
        void g2;
        float f8 = f6;
        Od_2 a2 = this;
        a2.J((float)g2, (float)f7, (double)e2, (double)d4, (float)c2, (float)b2, (float)h2, uSa.E != 0);
    }
}

