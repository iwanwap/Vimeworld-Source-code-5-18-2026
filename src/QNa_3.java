/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  Bb
 *  Bsa
 *  Cia
 *  EC
 *  ERa
 *  Ega
 *  Gl
 *  HA
 *  JPa
 *  Joa
 *  Kna
 *  Kpa
 *  Lra
 *  Mda
 *  Oz
 *  QNa
 *  Qsa
 *  Qta
 *  Woa
 *  Wsa
 *  Ypa
 *  ac
 *  aqa
 *  bSa
 *  bpa
 *  eAa
 *  hTa
 *  kGa
 *  kPa
 *  lqa
 *  nLa
 *  pPa
 *  pY
 *  pqa
 *  pua
 *  qta
 *  sna
 *  uKa
 *  vRa
 *  wga
 *  wra
 *  yDa
 */
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class QNa_3
extends xLa {
    private float F;
    private boolean g;
    private List<sEa> L;
    private boolean m;
    private static int C;
    private sEa i;
    private sna M;
    private static final ResourceLocation k;
    private Woa J;
    private static yDa A;
    private boolean I;

    public QNa_3(Sx sx2) {
        QNa_3 a2;
        Object b2 = sx2;
        QNa_3 qNa_3 = a2 = this;
        super(new Jna((Sx)((Object)b2)));
        ((Sx)((Object)b2)).G = (Ega)a2.I;
        qNa_3.f = vRa.d;
        a2.F = PRa.D;
        qNa_3.j = xqa.W;
    }

    public void l() {
        QNa_3 a2;
        if (!a2.g.L.A()) {
            a2.g.J((EC)new Joa((Sx)a2.g.c));
        }
        a2.J();
    }

    @Override
    public void J() {
        QNa_3 qNa_3;
        QNa_3 qNa_32 = qNa_3 = this;
        int a2 = qNa_32.e;
        super.J();
        if (qNa_32.J != null && qNa_3.e != a2) {
            qNa_3.J.L = qNa_3.e + aqa.Aa;
        }
    }

    public void J(int n2, int n3) {
        int c22 = n2;
        QNa_3 b2 = this;
        yGa c22 = yGa.k[C];
        if (c22.f()) {
            uKa.k();
            b2.L.J(oha.J(c22.l(), new Object[uSa.E]), Yqa.i, uua.p, tpa.i);
        }
    }

    public void f(yGa yGa2) {
        boolean bl2;
        Mda a2;
        QNa_3 qNa_3 = this;
        int n2 = a2.l() == C ? vRa.d : uSa.E;
        void v0 = a2;
        boolean bl3 = v0.J();
        int n3 = v0.J();
        int n4 = n3 * EPa.O;
        int n5 = uSa.E;
        int n6 = qNa_3.e + EPa.O * n3;
        int b2 = qNa_3.v;
        int n7 = fPa.i;
        if (n2 != 0) {
            n5 += 32;
        }
        if (n3 == tTa.h) {
            QNa_3 qNa_32 = qNa_3;
            n6 = qNa_32.e + qNa_32.j - EPa.O;
            bl2 = bl3;
        } else {
            if (n3 > 0) {
                n6 += n3;
            }
            bl2 = bl3;
        }
        if (bl2) {
            b2 -= EPa.O;
        } else {
            n5 += 64;
            b2 += qNa_3.F - AQa.P;
        }
        uKa.L();
        qNa_3.f(n6, b2, n4, n5, EPa.O, n7);
        qNa_3.I = QTa.G;
        qNa_3.m.m = QTa.G;
        n6 += uua.p;
        b2 = b2 + Yqa.i + (bl3 ? vRa.d : pua.o);
        uKa.P();
        uKa.o();
        a2 = a2.J();
        QNa_3 qNa_33 = qNa_3;
        qNa_33.m.f(a2, n6, b2);
        qNa_33.m.J(qNa_3.L, a2, n6, b2);
        uKa.L();
        qNa_3.m.m = JPa.N;
        qNa_33.I = JPa.N;
    }

    /*
     * Unable to fully structure code
     */
    private void J(yGa var1_2) {
        var2_3 = this;
        var5_4 = QNa_3.C;
        QNa_3.C = a.l();
        var3_5 = (Jna)var2_3.I;
        v0 = a;
        var2_3.a.clear();
        var3_5.J.clear();
        v0.J(var3_5.J);
        if (v0 == yGa.L) {
            v1 = var2_3;
            var4_6 = v1.g.c.x;
            if (v1.L == null) {
                var2_3.L = var3_5.A;
            }
            var3_5.A = Lists.newArrayList();
            v2 = b = uSa.E;
            while (v2 < var4_6.A.size()) {
                var6_7 = new cma((QNa)var2_3, (sEa)var4_6.A.get(b), b);
                var3_5.A.add(var6_7);
                if (b >= tTa.h && b < WOa.fa) {
                    var7_8 = b - tTa.h;
                    var8_9 = var7_8 / uqa.g;
                    var9_10 = var7_8 % uqa.g;
                    v3 = var6_7;
                    v3.j = WOa.fa + var8_9 * GPa.C;
                    v3.A = uua.p + var9_10 * Lra.e;
                } else if (b >= 0 && b < tTa.h) {
                    v4 = var6_7;
                    v4.A = hTa.z;
                    v4.j = hTa.z;
                } else if (b < var4_6.A.size()) {
                    var7_8 = b - WOa.fa;
                    var8_9 = var7_8 % WOa.fa;
                    var9_10 = var7_8 / WOa.fa;
                    var6_7.j = WOa.fa + var8_9 * yOa.B;
                    var6_7.A = b >= Qsa.Ha ? BRa.E : GPa.C + var9_10 * yOa.B;
                }
                v2 = ++b;
            }
            v5 = var2_3;
            var2_3.i = new sEa((HA)QNa_3.A, uSa.E, bpa.fa, BRa.E);
            var3_5.A.add(var2_3.i);
        } else {
            if (var5_4 == yGa.L.l()) {
                var3_5.A = var2_3.L;
                var2_3.L = null;
            }
            v5 = var2_3;
        }
        if (v5.J == null) ** GOTO lbl64
        if (a == yGa.F) {
            v6 = var2_3;
            v7 = v6;
            v6.J.f((boolean)vRa.d);
            v6.J.C((boolean)uSa.E);
            v6.J.l((boolean)vRa.d);
            v6.J.f(Mqa.y);
            v6.f();
        } else {
            v8 = var2_3;
            v8.J.f((boolean)uSa.E);
            v8.J.C((boolean)vRa.d);
            v8.J.l((boolean)uSa.E);
lbl64:
            // 2 sources

            v7 = var2_3;
        }
        v7.F = JPa.N;
        var3_5.J(JPa.N);
    }

    public static /* synthetic */ yDa J() {
        return A;
    }

    public int J() {
        return C;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void J(sEa sEa2, int n2, int n3, int n4) {
        void b2;
        QNa_3 e22;
        void d2;
        void c2;
        void a2;
        QNa_3 qNa_3 = this;
        qNa_3.m = vRa.d;
        int n5 = a2 == vRa.d ? vRa.d : uSa.E;
        int n6 = a2 = c2 == rta.n && a2 == false ? AQa.P : a2;
        if (d2 == null && C != yGa.L.l() && a2 != tTa.h) {
            e22 = qNa_3.g.c.K;
            if (e22.J() == null) return;
            if (b2 == false) {
                QNa_3 qNa_32 = e22;
                qNa_3.g.c.J(qNa_32.J(), vRa.d != 0);
                qNa_3.g.L.J(e22.J());
                qNa_32.J(null);
            }
            if (b2 != vRa.d) return;
            QNa_3 qNa_33 = e22;
            Mda mda2 = qNa_33.J().J(vRa.d);
            qNa_3.g.c.J(mda2, vRa.d != 0);
            qNa_3.g.L.J(mda2);
            if (qNa_33.J().E != 0) return;
            e22.J(null);
            return;
        }
        if (d2 == qNa_3.i && n5 != 0) {
            int e22;
            int n7 = e22 = uSa.E;
            while (n7 < qNa_3.g.c.x.J().size()) {
                qNa_3.g.L.J((Mda)null, e22++);
                n7 = e22;
            }
            return;
        } else {
            void v13;
            int n8;
            if (C == yGa.L.l()) {
                void v7;
                int n9;
                if (d2 == qNa_3.i) {
                    qNa_3.g.c.K.J((Mda)null);
                    return;
                }
                if (a2 == AQa.P && d2 != null && d2.J()) {
                    e22 = d2.J(b2 == false ? vRa.d : d2.J().e());
                    qNa_3.g.c.J((Mda)e22, vRa.d != 0);
                    qNa_3.g.L.J((Mda)e22);
                    return;
                }
                if (a2 == AQa.P && qNa_3.g.c.K.J() != null) {
                    QNa_3 qNa_34 = qNa_3;
                    qNa_3.g.c.J(qNa_3.g.c.K.J(), vRa.d != 0);
                    qNa_3.g.L.J(qNa_34.g.c.K.J());
                    qNa_34.g.c.K.J((Mda)null);
                    return;
                }
                Ega ega2 = qNa_3.g.c.x;
                if (d2 == null) {
                    n9 = c2;
                    v7 = b2;
                } else {
                    n9 = cma.J((cma)((cma)d2)).I;
                    v7 = b2;
                }
                ega2.J(n9, (int)v7, (int)a2, (Sx)qNa_3.g.c);
                qNa_3.g.c.x.J();
                return;
            }
            if (a2 != tTa.h && d2.J == A) {
                e22 = qNa_3.g.c.K;
                Mda mda3 = e22.J();
                Mda mda4 = d2.J();
                if (a2 == uqa.g) {
                    if (mda4 == null || b2 < 0 || b2 >= WOa.fa) return;
                    Mda mda5 = mda4.J();
                    QNa_3 qNa_35 = qNa_3;
                    mda5.E = mda5.e();
                    qNa_35.g.c.K.J((int)b2, mda5);
                    qNa_35.g.c.x.J();
                    return;
                }
                if (a2 == yRa.d) {
                    Mda mda6;
                    if (e22.J() != null || !d2.J()) return;
                    Mda mda7 = mda6 = d2.J().J();
                    mda7.E = mda7.e();
                    e22.J(mda7);
                    return;
                }
                if (a2 == AQa.P) {
                    if (mda4 == null) return;
                    Mda mda8 = mda4.J();
                    mda4.J().E = b2 == false ? vRa.d : mda8.e();
                    qNa_3.g.c.J(mda8, vRa.d != 0);
                    qNa_3.g.L.J(mda8);
                    return;
                }
                if (mda3 != null && mda4 != null && mda3.l(mda4)) {
                    if (b2 == false) {
                        if (n5 != 0) {
                            mda3.E = mda3.e();
                            return;
                        }
                        if (mda3.E >= mda3.e()) return;
                        mda3.E += vRa.d;
                        return;
                    }
                    if (mda3.E <= vRa.d) {
                        e22.J(null);
                        return;
                    }
                    mda3.E -= vRa.d;
                    return;
                }
                if (mda4 != null && mda3 == null) {
                    QNa_3 qNa_36 = e22;
                    qNa_36.J(Mda.J((Mda)mda4));
                    mda3 = qNa_36.J();
                    if (n5 == 0) return;
                    mda3.E = mda3.e();
                    return;
                }
                e22.J(null);
                return;
            }
            boolean bl2 = qNa_3.I;
            if (d2 == null) {
                n8 = c2;
                v13 = b2;
            } else {
                n8 = d2.I;
                v13 = b2;
            }
            bl2.J(n8, (int)v13, (int)a2, (Sx)qNa_3.g.c);
            if (Ega.f((int)b2) == uqa.g) {
                int e22;
                int n10 = e22 = uSa.E;
                while (n10 < WOa.fa) {
                    qNa_3.g.L.J(qNa_3.I.J(wra.e + e22).J(), Qsa.Ha + e22++);
                    n10 = e22;
                }
                return;
            } else {
                if (d2 == null) return;
                QNa_3 qNa_37 = qNa_3;
                e22 = qNa_37.I.J(d2.I).J();
                qNa_37.g.L.J((Mda)e22, d2.I - qNa_3.I.A.size() + WOa.fa + Qsa.Ha);
            }
        }
    }

    public void J(ac ac2) throws IOException {
        QNa_3 b2 = ac2;
        QNa_3 a2 = this;
        if (((ac)b2).C == 0) {
            QNa_3 qNa_3 = a2;
            a2.g.J((EC)new nNa((EC)qNa_3, qNa_3.g.c.J()));
        }
        if (((ac)b2).C == vRa.d) {
            QNa_3 qNa_3 = a2;
            a2.g.J((EC)new cna((EC)qNa_3, qNa_3.g.c.J()));
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean f(yGa yGa2, int n2, int n3) {
        void a2;
        void v1;
        void b2;
        void v0;
        void c2;
        QNa_3 qNa_3 = this;
        int n4 = c2.J();
        int n5 = EPa.O * n4;
        int d2 = uSa.E;
        if (n4 == tTa.h) {
            v0 = c2;
            n5 = qNa_3.j - EPa.O + uqa.g;
        } else {
            if (n4 > 0) {
                n5 += n4;
            }
            v0 = c2;
        }
        if (v0.J()) {
            d2 -= fPa.i;
            v1 = b2;
        } else {
            d2 += qNa_3.F;
            v1 = b2;
        }
        if (v1 >= n5 && b2 <= n5 + EPa.O && a2 >= d2 && a2 <= d2 + fPa.i) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(yGa yGa2, int n2, int n3) {
        void a2;
        void b2;
        QNa_3 qNa_3;
        void v0;
        void c2;
        QNa_3 qNa_32 = this;
        int n4 = c2.J();
        int n5 = EPa.O * n4;
        int d2 = uSa.E;
        if (n4 == tTa.h) {
            v0 = c2;
            n5 = qNa_32.j - EPa.O + uqa.g;
        } else {
            if (n4 > 0) {
                n5 += n4;
            }
            v0 = c2;
        }
        if (v0.J()) {
            d2 -= fPa.i;
            qNa_3 = qNa_32;
        } else {
            d2 += qNa_32.F;
            qNa_3 = qNa_32;
        }
        if (qNa_3.J(n5 + yRa.d, d2 + yRa.d, AQa.ba, Lra.e, (int)b2, (int)a2)) {
            qNa_32.J(oha.J(c2.l(), new Object[uSa.E]), (int)b2, (int)a2);
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Mda mda2, int n2, int n3) {
        void a2;
        void b2;
        void c2;
        QNa_3 qNa_3 = this;
        if (C == yGa.F.l()) {
            int d22;
            yGa yGa2;
            yGa yGa3;
            List list;
            block8: {
                Object d22;
                void v0 = c2;
                list = v0.J((Sx)qNa_3.g.c, qNa_3.g.z.aa);
                yGa3 = v0.J().J();
                if (yGa3 == null && c2.J() == Gea.ha && (d22 = kGa.J((Mda)c2)).size() == vRa.d) {
                    int n4;
                    wga wga2 = wga.J((int)((Integer)d22.keySet().iterator().next()));
                    yGa[] yGaArray = yGa.k;
                    int n5 = yGa.k.length;
                    int n6 = n4 = uSa.E;
                    while (n6 < n5) {
                        yGa yGa4 = yGaArray[n4];
                        if (yGa4.J(wga2.e)) {
                            yGa2 = yGa3 = yGa4;
                            break block8;
                        }
                        n6 = ++n4;
                    }
                }
                yGa2 = yGa3;
            }
            if (yGa2 != null) {
                list.add(vRa.d, new StringBuilder().insert(2 & 5, Mqa.y).append(pY.BOLD).append(pY.BLUE).append(oha.J(yGa3.l(), new Object[uSa.E])).toString());
            }
            int n7 = d22 = uSa.E;
            while (n7 < list.size()) {
                List list2 = list;
                if (d22 == 0) {
                    int n8 = d22;
                    int n9 = d22;
                    list2.set(n9, c2.J().rarityColor + (String)list.get(n9));
                } else {
                    list2.set(d22, pY.GRAY + (String)list.get(d22));
                }
                n7 = ++d22;
            }
            qNa_3.J(list, (int)b2, (int)a2);
            return;
        }
        super.J((Mda)c2, (int)b2, (int)a2);
    }

    static {
        k = new ResourceLocation(Qta.a);
        A = new yDa(UTa.b, vRa.d != 0, wra.e);
        C = yGa.A.l();
    }

    public void d() throws IOException {
        QNa_3 qNa_3 = this;
        super.d();
        int a2 = Mouse.getEventDWheel();
        if (a2 != 0 && qNa_3.d()) {
            int n2 = ((Jna)qNa_3.I).J.size() / WOa.fa - tTa.h;
            if (a2 > 0) {
                a2 = vRa.d;
            }
            if (a2 < 0) {
                a2 = pua.o;
            }
            QNa_3 qNa_32 = qNa_3;
            qNa_32.F = (float)((double)qNa_32.F - (double)a2 / (double)n2);
            qNa_32.F = Oz.J((float)qNa_32.F, (float)JPa.N, (float)pqa.r);
            ((Jna)qNa_32.I).J(qNa_3.F);
        }
    }

    @Override
    public void A() {
        QNa_3 qNa_3 = this;
        if (qNa_3.g.L.A()) {
            QNa_3 qNa_32 = qNa_3;
            super.A();
            qNa_32.E.clear();
            Keyboard.enableRepeatEvents(vRa.d != 0);
            QNa_3 qNa_33 = qNa_3;
            QNa_3 qNa_34 = qNa_3;
            qNa_33.J = new Woa(uSa.E, qNa_34.L, qNa_34.e + aqa.Aa, qNa_3.v + uua.p, bSa.Da, ((Kna)qNa_3.L).u);
            qNa_32.J.M(Ypa.A);
            qNa_32.J.J(uSa.E != 0);
            qNa_32.J.f(uSa.E != 0);
            qNa_32.J.C(Wsa.K);
            int a2 = C;
            C = pua.o;
            qNa_32.J(yGa.k[a2]);
            qNa_32.M = new sna((Kpa)qNa_3.g);
            qNa_32.g.c.x.f((Bb)qNa_3.M);
            return;
        }
        qNa_3.g.J((EC)new Joa((Sx)qNa_3.g.c));
    }

    private void f() {
        int n2;
        QNa_3 qNa_3 = this;
        Jna jna2 = (Jna)qNa_3.I;
        jna2.J.clear();
        for (eAa eAa2 : eAa.C) {
            if (eAa2 == null || eAa2.J() == null) continue;
            eAa eAa3 = eAa2;
            eAa3.J(eAa3, (yGa)null, jna2.J);
        }
        Object a2 = wga.J;
        int n3 = wga.J.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            Object object = a2[n2];
            if (object != null && ((wga)object).e != null) {
                Gea.ha.J((wga)object, jna2.J);
            }
            n4 = ++n2;
        }
        a2 = jna2.J.iterator();
        String string = qNa_3.J.f().toLowerCase();
        while (a2.hasNext()) {
            int n5;
            block5: {
                Mda mda2 = (Mda)a2.next();
                int n6 = uSa.E;
                Iterator iterator = mda2.J((Sx)qNa_3.g.c, qNa_3.g.z.aa).iterator();
                while (iterator.hasNext()) {
                    if (!pY.getTextWithoutFormattingCodes((String)((String)iterator.next())).toLowerCase().contains(string)) continue;
                    n5 = n6 = vRa.d;
                    break block5;
                }
                n5 = n6;
            }
            if (n5 != 0) continue;
            a2.remove();
        }
        qNa_3.F = JPa.N;
        jna2.J(JPa.N);
    }

    private boolean d() {
        QNa_3 a2;
        if (C != yGa.L.l() && yGa.k[C].l() && ((Jna)a2.I).J()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4) throws IOException {
        void b2;
        void c2;
        void a2;
        QNa_3 qNa_3 = this;
        if (a2 == false) {
            int d2;
            void var4_6 = c2 - qNa_3.e;
            void var5_7 = b2 - qNa_3.v;
            yGa[] yGaArray = yGa.k;
            int n5 = yGa.k.length;
            int n6 = d2 = uSa.E;
            while (n6 < n5) {
                yGa yGa2 = yGaArray[d2];
                if (qNa_3.f(yGa2, (int)var4_6, (int)var5_7)) {
                    return;
                }
                n6 = ++d2;
            }
        }
        super.J((int)c2, (int)b2, (int)a2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(char c2, int n2) throws IOException {
        void b2;
        int c3 = n2;
        QNa_3 a2 = this;
        if (C != yGa.F.l()) {
            if (Cia.J((mIa)a2.g.z.wc)) {
                a2.J(yGa.F);
                return;
            }
            super.J((char)b2, c3);
            return;
        }
        if (a2.m) {
            a2.m = uSa.E;
            a2.J.f(Mqa.y);
        }
        if (!a2.d(c3)) {
            QNa_3 qNa_3 = a2;
            if (a2.J.J((char)b2, c3)) {
                qNa_3.f();
                return;
            }
            super.J((char)b2, c3);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(int n2, int n3, float f2) {
        QNa_3 qNa_3;
        void b2;
        void c2;
        QNa_3 qNa_32;
        block7: {
            void a22;
            qNa_32 = this;
            int n4 = Mouse.isButtonDown(uSa.E);
            QNa_3 qNa_33 = qNa_32;
            int n5 = qNa_33.e;
            int d22 = qNa_33.v;
            int n6 = (n5 += Bsa.n) + hpa.Z;
            int n7 = (d22 += yOa.B) + BRa.E;
            if (!qNa_33.I && n4 != 0 && c2 >= n5 && b2 >= d22 && c2 < n6 && b2 < n7) {
                qNa_32.g = qNa_32.d();
            }
            if (n4 == 0) {
                qNa_32.g = uSa.E;
            }
            qNa_32.I = n4;
            if (qNa_32.g) {
                QNa_3 qNa_34 = qNa_32;
                qNa_34.F = ((float)(b2 - d22) - kPa.y) / ((float)(n7 - d22) - qta.D);
                qNa_34.F = Oz.J((float)qNa_34.F, (float)JPa.N, (float)pqa.r);
                ((Jna)qNa_34.I).J(qNa_32.F);
            }
            super.J((int)c2, (int)b2, (float)a22);
            yGa[] a22 = yGa.k;
            n4 = yGa.k.length;
            int n8 = n5 = uSa.E;
            while (n8 < n4) {
                yGa d22 = a22[n5];
                if (qNa_32.J(d22, (int)c2, (int)b2)) {
                    qNa_3 = qNa_32;
                    break block7;
                }
                n8 = ++n5;
            }
            qNa_3 = qNa_32;
        }
        if (qNa_3.i != null && C == yGa.L.l()) {
            QNa_3 qNa_35 = qNa_32;
            if (qNa_35.J(qNa_32.i.j, qNa_35.i.A, ERa.C, ERa.C, (int)c2, (int)b2)) {
                qNa_32.J(oha.J(pua.Ka, new Object[uSa.E]), (int)c2, (int)b2);
            }
        }
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        uKa.L();
    }

    /*
     * WARNING - void declaration
     */
    public void f(int n2, int n3, int n4) {
        void b2;
        void c2;
        void a2;
        QNa_3 qNa_3 = this;
        if (a2 == false) {
            int n5;
            void var4_5 = c2 - qNa_3.e;
            void var5_6 = b2 - qNa_3.v;
            yGa[] yGaArray = yGa.k;
            int n6 = yGa.k.length;
            int n7 = n5 = uSa.E;
            while (n7 < n6) {
                Object d2 = yGaArray[n5];
                if (qNa_3.f((yGa)d2, (int)var4_5, (int)var5_6)) {
                    qNa_3.J((yGa)d2);
                    return;
                }
                n7 = ++n5;
            }
        }
        super.f((int)c2, (int)b2, (int)a2);
    }

    public void M() {
        QNa_3 a2;
        QNa_3 qNa_3 = a2;
        super.M();
        if (qNa_3.g.c != null && a2.g.c.K != null) {
            a2.g.c.x.J((Bb)a2.M);
        }
        Keyboard.enableRepeatEvents(uSa.E != 0);
    }

    /*
     * WARNING - void declaration
     */
    public void J(float f2, int n2, int n3) {
        int d2;
        QNa_3 qNa_3 = this;
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        nLa.J();
        yGa c2 = yGa.k[C];
        yGa[] yGaArray = yGa.k;
        int n4 = yGa.k.length;
        int n5 = d2 = uSa.E;
        while (n5 < n4) {
            yGa yGa2 = yGaArray[d2];
            qNa_3.g.J().J(k);
            if (yGa2.l() != C) {
                qNa_3.f(yGa2);
            }
            n5 = ++d2;
        }
        QNa_3 qNa_32 = qNa_3;
        qNa_32.g.J().J(new ResourceLocation(new StringBuilder().insert(2 & 5, pPa.C).append(c2.J()).toString()));
        QNa_3 qNa_33 = qNa_3;
        QNa_3 qNa_34 = qNa_3;
        qNa_33.f(qNa_32.e, qNa_33.v, uSa.E, uSa.E, qNa_34.j, (int)qNa_34.F);
        qNa_32.J.J();
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        int n6 = qNa_32.e + Bsa.n;
        n4 = qNa_32.v + yOa.B;
        d2 = n4 + BRa.E;
        qNa_32.g.J().J(k);
        if (c2.l()) {
            int n7 = n4;
            qNa_3.f(n6, n7 + (int)((float)(d2 - n7 - yta.Ka) * qNa_3.F), STa.y + (qNa_3.d() ? uSa.E : lqa.s), uSa.E, lqa.s, Ypa.A);
        }
        qNa_3.f(c2);
        if (c2 == yGa.L) {
            void a2;
            void b2;
            Joa.J((int)(qNa_3.e + iSa.x), (int)(qNa_3.v + wra.e), (int)kTa.j, (float)(qNa_3.e + iSa.x - b2), (float)(qNa_3.v + wra.e - Fsa.d - a2), (Gl)qNa_3.g.c);
        }
    }
}

