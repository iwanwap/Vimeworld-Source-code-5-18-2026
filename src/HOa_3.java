/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CY
 *  EC
 *  ERa
 *  Epa
 *  Fma
 *  HY
 *  ISa
 *  Kna
 *  Mda
 *  NCa
 *  NTa
 *  QSa
 *  Qsa
 *  Rba
 *  SOa
 *  WQa
 *  Waa
 *  ZOa
 *  Zta
 *  aQa
 *  ac
 *  bSa
 *  cX
 *  cra
 *  dpa
 *  gEa
 *  hra
 *  ld
 *  pY
 *  pqa
 *  pua
 *  tca
 *  uKa
 *  vRa
 *  vpa
 *  wPa
 *  waa
 */
import com.google.common.collect.Lists;
import com.google.gson.JsonParseException;
import io.netty.buffer.Unpooled;
import java.io.IOException;
import java.util.List;
import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class HOa_3
extends EC {
    private int H;
    private List<ld> c;
    private final boolean B;
    private boolean d;
    private ac a;
    private Fma b;
    private boolean l;
    private int e;
    private ac G;
    private int D;
    private final Mda f;
    private int F;
    private ac g;
    private waa L;
    private int E;
    private final Sx m;
    private ac C;
    private static final ResourceLocation i;
    private Fma M;
    private String k;
    private static final Logger j;
    private int J;

    private void f() {
        HOa_3 a2;
        if (a2.L != null && a2.L.J() < vpa.o) {
            HOa_3 hOa_3 = a2;
            hOa_3.L.J((NCa)new tca(Mqa.y));
            hOa_3.E += vRa.d;
            hOa_3.d = vRa.d;
        }
    }

    public void A() {
        HOa_3 hOa_3;
        HOa_3 hOa_32;
        HOa_3 hOa_33 = hOa_32 = this;
        hOa_33.E.clear();
        Keyboard.enableRepeatEvents(vRa.d != 0);
        if (hOa_33.B) {
            hOa_32.g = new ac(yRa.d, hOa_32.A / uqa.g - ySa.T, AQa.P + hOa_32.e, dpa.A, kTa.j, oha.J(bSa.Ha, new Object[uSa.E]));
            hOa_32.E.add(hOa_32.g);
            hOa_32.C = new ac(uSa.E, hOa_32.A / uqa.g + uqa.g, AQa.P + hOa_32.e, dpa.A, kTa.j, oha.J(cra.g, new Object[uSa.E]));
            hOa_32.E.add(hOa_32.C);
            hOa_32.a = new ac(tTa.h, hOa_32.A / uqa.g - ySa.T, AQa.P + hOa_32.e, dpa.A, kTa.j, oha.J(QSa.r, new Object[uSa.E]));
            hOa_32.E.add(hOa_32.a);
            hOa_32.G = new ac(AQa.P, hOa_32.A / uqa.g + uqa.g, AQa.P + hOa_32.e, dpa.A, kTa.j, oha.J(SOa.l, new Object[uSa.E]));
            hOa_32.E.add(hOa_32.G);
            hOa_3 = hOa_32;
        } else {
            hOa_32.C = new ac(uSa.E, hOa_32.A / uqa.g - ySa.T, AQa.P + hOa_32.e, ZOa.x, kTa.j, oha.J(cra.g, new Object[uSa.E]));
            hOa_32.E.add(hOa_32.C);
            hOa_3 = hOa_32;
        }
        int n2 = (hOa_3.A - hOa_32.J) / uqa.g;
        int a2 = uqa.g;
        hOa_32.M = new Fma(vRa.d, n2 + sOa.D, a2 + Epa.u, vRa.d != 0);
        hOa_32.E.add(hOa_32.M);
        hOa_32.b = new Fma(uqa.g, n2 + ISa.E, a2 + Epa.u, uSa.E != 0);
        hOa_32.E.add(hOa_32.b);
        hOa_32.J();
    }

    /*
     * WARNING - void declaration
     */
    public void J(char c2, int n2) throws IOException {
        void b2;
        HOa_3 a2;
        int c3 = n2;
        HOa_3 hOa_3 = a2 = this;
        super.J((char)b2, c3);
        if (hOa_3.B) {
            if (a2.l) {
                a2.f((char)b2, c3);
                return;
            }
            a2.l((char)b2, c3);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, float f2) {
        void a2;
        void b2;
        void c2;
        HOa_3 hOa_3;
        Object d2;
        HOa_3 hOa_32 = this;
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        HOa_3 hOa_33 = hOa_32;
        hOa_33.g.J().J(i);
        HOa_3 hOa_34 = hOa_32;
        int n4 = (hOa_33.A - hOa_34.J) / uqa.g;
        int n5 = uqa.g;
        HOa_3 hOa_35 = hOa_32;
        hOa_34.f(n4, n5, uSa.E, uSa.E, hOa_35.J, hOa_35.e);
        if (hOa_33.l) {
            HOa_3 hOa_36 = hOa_32;
            String string = hOa_36.k;
            if (hOa_36.B) {
                string = hOa_32.D / uua.p % uqa.g == 0 ? new StringBuilder().insert(2 & 5, string).append(Mqa.y).append(pY.BLACK).append(IPa.W).toString() : new StringBuilder().insert(3 ^ 3, string).append(Mqa.y).append(pY.GRAY).append(IPa.W).toString();
            }
            d2 = oha.J(WQa.T, new Object[uSa.E]);
            HOa_3 hOa_37 = hOa_32;
            int n6 = hOa_37.L.J((String)d2);
            hOa_37.L.J((String)d2, n4 + Qsa.Ha + (rQa.s - n6) / uqa.g, n5 + ERa.C + ERa.C, uSa.E);
            HOa_3 hOa_38 = hOa_32;
            int n7 = hOa_38.L.J(string);
            hOa_38.L.J(string, n4 + Qsa.Ha + (rQa.s - n7) / uqa.g, n5 + QSa.p, uSa.E);
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = hOa_32.m.J();
            String string2 = oha.J(cra.p, objectArray);
            HOa_3 hOa_39 = hOa_32;
            int n8 = hOa_39.L.J(string2);
            hOa_39.L.J(pY.DARK_GRAY + string2, n4 + Qsa.Ha + (rQa.s - n8) / uqa.g, n5 + QSa.p + NTa.C, uSa.E);
            String string3 = oha.J(rQa.j, new Object[uSa.E]);
            HOa_3 hOa_310 = hOa_32;
            hOa_3 = hOa_310;
            hOa_310.L.J(string3, n4 + Qsa.Ha, n5 + Fua.J, rQa.s, uSa.E);
        } else {
            HOa_3 hOa_311;
            Object[] objectArray = new Object[uqa.g];
            objectArray[uSa.E] = hOa_32.F + vRa.d;
            objectArray[vRa.d] = hOa_32.E;
            String string = oha.J(yOa.fa, objectArray);
            d2 = Mqa.y;
            if (hOa_32.L != null && hOa_32.F >= 0) {
                HOa_3 hOa_312 = hOa_32;
                if (hOa_312.F < hOa_312.L.J()) {
                    HOa_3 hOa_313 = hOa_32;
                    d2 = hOa_313.L.J(hOa_313.F);
                }
            }
            if (hOa_32.B) {
                StringBuilder stringBuilder;
                if (hOa_32.L.J()) {
                    d2 = new StringBuilder().insert(5 >> 3, (String)d2).append(IPa.W).toString();
                    hOa_311 = hOa_32;
                } else if (hOa_32.D / uua.p % uqa.g == 0) {
                    stringBuilder = new StringBuilder();
                    d2 = stringBuilder.insert(5 >> 3, (String)d2).append(Mqa.y).append(pY.BLACK).append(IPa.W).toString();
                    hOa_311 = hOa_32;
                } else {
                    stringBuilder = new StringBuilder();
                    d2 = stringBuilder.insert(5 >> 3, (String)d2).append(Mqa.y).append(pY.GRAY).append(IPa.W).toString();
                    hOa_311 = hOa_32;
                }
            } else {
                HOa_3 hOa_314 = hOa_32;
                if (hOa_314.H != hOa_314.F) {
                    HOa_3 hOa_315;
                    ld ld2;
                    if (JDa.f(hOa_32.f.J())) {
                        try {
                            ld2 = HY.J((String)d2);
                            hOa_32.c = ld2 != null ? OMa.J(ld2, rQa.s, (Kna)hOa_32.L, vRa.d != 0, vRa.d != 0) : null;
                            hOa_315 = hOa_32;
                        }
                        catch (JsonParseException jsonParseException) {
                            hOa_315 = hOa_32;
                            hOa_32.c = null;
                        }
                    } else {
                        ld2 = new CY(new StringBuilder().insert(3 ^ 3, pY.DARK_RED.toString()).append(aQa.Q).toString());
                        hOa_315 = hOa_32;
                        hOa_32.c = Lists.newArrayList(ld2);
                    }
                    hOa_315.H = hOa_32.F;
                }
                hOa_311 = hOa_32;
            }
            int n9 = hOa_311.L.J(string);
            HOa_3 hOa_316 = hOa_32;
            hOa_316.L.J(string, n4 - n9 + hOa_32.J - Yqa.D, n5 + ERa.C, uSa.E);
            if (hOa_316.c == null) {
                HOa_3 hOa_317 = hOa_32;
                hOa_3 = hOa_317;
                hOa_317.L.J((String)d2, n4 + Qsa.Ha, n5 + ERa.C + ERa.C, rQa.s, uSa.E);
            } else {
                int n10;
                int n11 = Math.min(XOa.h / hOa_32.L.u, hOa_32.c.size());
                int n12 = n10 = uSa.E;
                while (n12 < n11) {
                    ld ld3 = hOa_32.c.get(n10);
                    int n13 = n10 * hOa_32.L.u;
                    hOa_32.L.J(ld3.f(), n4 + Qsa.Ha, n5 + ERa.C + ERa.C + n13, uSa.E);
                    n12 = ++n10;
                }
                ld ld4 = hOa_32.J((int)c2, (int)b2);
                if (ld4 != null) {
                    hOa_32.J(ld4, (int)c2, (int)b2);
                }
                hOa_3 = hOa_32;
            }
        }
        super.J((int)c2, (int)b2, (float)a2);
    }

    /*
     * WARNING - void declaration
     */
    public HOa_3(Sx sx2, Mda mda2, boolean bl2) {
        void a2;
        Waa c2;
        HOa_3 b2;
        HOa_3 d2 = mda2;
        HOa_3 hOa_3 = b2 = this;
        HOa_3 hOa_32 = b2;
        b2.J = ppa.f;
        b2.e = ppa.f;
        b2.E = vRa.d;
        hOa_32.k = Mqa.y;
        hOa_32.H = pua.o;
        hOa_32.m = c2;
        hOa_3.f = d2;
        hOa_3.B = a2;
        if (d2.M()) {
            c2 = d2.J();
            b2.L = c2.J(sra.A, Yqa.i);
            if (b2.L != null) {
                b2.L = (waa)b2.L.J();
                HOa_3 hOa_33 = b2;
                hOa_33.E = hOa_33.L.J();
                if (hOa_33.E < vRa.d) {
                    b2.E = vRa.d;
                }
            }
        }
        if (b2.L == null && a2 != false) {
            HOa_3 hOa_34 = b2;
            hOa_34.L = new waa();
            b2.L.J((NCa)new tca(Mqa.y));
            hOa_34.E = vRa.d;
        }
    }

    private void f(String string) {
        HOa_3 a2;
        Object b2 = string;
        HOa_3 hOa_3 = a2 = this;
        String string2 = hOa_3.f();
        b2 = new StringBuilder().insert(3 & 4, string2).append((String)b2).toString();
        if (hOa_3.L.J(new StringBuilder().insert(3 >> 2, (String)b2).append(Mqa.y).append(pY.BLACK).append(IPa.W).toString(), Zta.Q) <= XOa.h && ((String)b2).length() < hra.Ja) {
            a2.J((String)b2);
        }
    }

    private String f() {
        HOa_3 a2;
        if (a2.L != null && a2.F >= 0) {
            HOa_3 hOa_3 = a2;
            if (hOa_3.F < hOa_3.L.J()) {
                HOa_3 hOa_32 = a2;
                return hOa_32.L.J(hOa_32.F);
            }
        }
        return Mqa.y;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4) throws IOException {
        void b2;
        void c2;
        int d2 = n4;
        HOa_3 a2 = this;
        if (d2 == 0) {
            HOa_3 hOa_3 = a2;
            if (hOa_3.J(hOa_3.J((int)c2, (int)b2))) {
                return;
            }
        }
        super.J((int)c2, (int)b2, d2);
    }

    public static /* synthetic */ ResourceLocation J() {
        return i;
    }

    private void J(boolean n2) throws IOException {
        int b22 = n2;
        HOa_3 a2 = this;
        if (a2.B && a2.d && a2.L != null) {
            HOa_3 hOa_3;
            Object object;
            block7: {
                HOa_3 hOa_32 = a2;
                while (hOa_32.L.J() > vRa.d) {
                    HOa_3 hOa_33 = a2;
                    object = hOa_33.L.J(hOa_33.L.J() - vRa.d);
                    if (object.length() != 0) {
                        hOa_3 = a2;
                        break block7;
                    }
                    HOa_3 hOa_34 = a2;
                    hOa_32 = hOa_34;
                    hOa_34.L.J(hOa_34.L.J() - vRa.d);
                }
                hOa_3 = a2;
            }
            HOa_3 hOa_35 = a2;
            if (hOa_3.f.M()) {
                object = hOa_35.f.J();
                object.J(sra.A, (NCa)a2.L);
            } else {
                hOa_35.f.J(sra.A, (NCa)a2.L);
            }
            object = Gta.i;
            if (b22 != 0) {
                object = qsa.M;
                HOa_3 hOa_36 = a2;
                hOa_36.f.J(osa.i, (NCa)new tca(a2.m.J()));
                hOa_36.f.J(xqa.U, (NCa)new tca(a2.k.trim()));
                int n3 = b22 = uSa.E;
                while (n3 < a2.L.J()) {
                    HOa_3 hOa_37 = a2;
                    String string = hOa_37.L.J(b22);
                    string = HY.J((ld)new CY(string));
                    hOa_37.L.J(b22++, (NCa)new tca(string));
                    n3 = b22;
                }
                a2.f.J(Gea.sb);
            }
            Lca b22 = new Lca(Unpooled.buffer());
            HOa_3 hOa_38 = a2;
            b22.writeItemStackToBuffer(hOa_38.f);
            hOa_38.g.J().J((KC)new Rba((String)object, b22));
        }
    }

    /*
     * Unable to fully structure code
     */
    public void J(ac var1_1) throws IOException {
        block3: {
            block5: {
                block9: {
                    block7: {
                        block8: {
                            block6: {
                                block4: {
                                    b = var1_1;
                                    a = this;
                                    if (!b.J) break block3;
                                    if (b.C != 0) break block4;
                                    a.g.J((EC)null);
                                    v0 = a;
                                    v1 = v0;
                                    v0.J((boolean)uSa.E);
                                    break block5;
                                }
                                if (b.C != yRa.d || !a.B) break block6;
                                v1 = a;
                                a.l = vRa.d;
                                break block5;
                            }
                            if (b.C != vRa.d) break block7;
                            v2 = a;
                            if (v2.F >= v2.E - vRa.d) break block8;
                            v3 = a;
                            v1 = v3;
                            v3.F += vRa.d;
                            break block5;
                        }
                        if (!a.B) ** GOTO lbl48
                        v4 = a;
                        v4.f();
                        if (v4.F >= a.E - vRa.d) ** GOTO lbl48
                        v5 = a;
                        v1 = v5;
                        v5.F += vRa.d;
                        break block5;
                    }
                    if (b.C != uqa.g) break block9;
                    if (a.F <= 0) ** GOTO lbl48
                    v6 = a;
                    v1 = v6;
                    v6.F -= vRa.d;
                    break block5;
                }
                if (b.C == tTa.h && a.l) {
                    v7 = a;
                    v7.J((boolean)vRa.d);
                    v7.g.J((EC)null);
                    v1 = a;
                } else {
                    if (b.C == AQa.P && a.l) {
                        a.l = uSa.E;
                    }
lbl48:
                    // 6 sources

                    v1 = a;
                }
            }
            v1.J();
        }
    }

    public void l() {
        HOa_3 a2;
        HOa_3 hOa_3 = a2;
        super.l();
        hOa_3.D += vRa.d;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private void l(char c2, int n2) {
        void b2;
        int c32 = n2;
        HOa_3 a2 = this;
        if (EC.f((int)c32)) {
            a2.f(EC.J());
            return;
        }
        switch (c32) {
            case 14: {
                String c32 = a2.f();
                if (c32.length() > 0) {
                    String string = c32;
                    a2.J(string.substring(uSa.E, string.length() - vRa.d));
                }
                return;
            }
            case 28: 
            case 156: {
                a2.f(SPa.O);
                return;
            }
        }
        if (cX.J((char)b2)) {
            a2.f(Character.toString((char)b2));
        }
    }

    static {
        j = LogManager.getLogger();
        i = new ResourceLocation(wPa.I);
    }

    public void M() {
        Keyboard.enableRepeatEvents(uSa.E != 0);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(ld ld2) {
        void a2;
        PEa pEa2;
        HOa_3 hOa_3 = this;
        PEa pEa3 = pEa2 = a2 == null ? null : a2.J().J();
        if (pEa2 == null) {
            return uSa.E != 0;
        }
        if (pEa2.J() == gEa.CHANGE_PAGE) {
            String string = pEa2.J();
            try {
                int b2 = Integer.parseInt(string) - vRa.d;
                if (b2 >= 0 && b2 < hOa_3.E && b2 != hOa_3.F) {
                    hOa_3.F = b2;
                    hOa_3.J();
                    return vRa.d != 0;
                }
            }
            catch (Throwable b2) {
                // empty catch block
            }
            return uSa.E != 0;
        }
        boolean bl2 = super.J((ld)a2);
        if (bl2 && pEa2.J() == gEa.RUN_COMMAND) {
            hOa_3.g.J((EC)null);
        }
        return bl2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private void f(char c2, int n2) throws IOException {
        void a2;
        char c3 = c2;
        HOa_3 b2 = this;
        switch (a2) {
            case 14: {
                if (!b2.k.isEmpty()) {
                    HOa_3 hOa_3 = b2;
                    b2.k = hOa_3.k.substring(uSa.E, b2.k.length() - vRa.d);
                    hOa_3.J();
                }
                return;
            }
            case 28: 
            case 156: {
                if (!b2.k.isEmpty()) {
                    HOa_3 hOa_3 = b2;
                    hOa_3.J(vRa.d != 0);
                    hOa_3.g.J((EC)null);
                }
                return;
            }
        }
        if (b2.k.length() < ERa.C && cX.J((char)c3)) {
            HOa_3 hOa_3 = b2;
            hOa_3.k = b2.k + Character.toString(c3);
            b2.J();
            hOa_3.d = vRa.d;
        }
    }

    /*
     * WARNING - void declaration
     */
    public ld J(int n2, int n3) {
        void b2;
        int c22 = n3;
        HOa_3 a2 = this;
        if (a2.c == null) {
            return null;
        }
        HOa_3 hOa_3 = a2;
        b2 = b2 - (hOa_3.A - hOa_3.J) / uqa.g - Qsa.Ha;
        c22 = c22 - uqa.g - ERa.C - ERa.C;
        if (b2 >= 0 && c22 >= 0) {
            int n4 = Math.min(XOa.h / a2.L.u, a2.c.size());
            if (b2 <= rQa.s && c22 < a2.g.Ea.u * n4 + n4) {
                if ((c22 /= a2.g.Ea.u) >= 0 && c22 < a2.c.size()) {
                    Object c22 = a2.c.get(c22);
                    n4 = uSa.E;
                    c22 = c22.iterator();
                    while (c22.hasNext()) {
                        ld ld2 = (ld)c22.next();
                        if (!(ld2 instanceof CY) || (n4 += a2.g.Ea.J(((CY)ld2).C())) <= b2) continue;
                        return ld2;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    private void J(String string) {
        Object b2 = string;
        HOa_3 a2 = this;
        if (a2.L != null && a2.F >= 0) {
            HOa_3 hOa_3 = a2;
            if (hOa_3.F < hOa_3.L.J()) {
                a2.L.J(a2.F, (NCa)new tca((String)b2));
                a2.d = vRa.d;
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private void J() {
        if (a.l) ** GOTO lbl-1000
        v0 = a;
        if (v0.F < v0.E - vRa.d || a.B) {
            v1 = vRa.d;
        } else lbl-1000:
        // 2 sources

        {
            v1 = uSa.E;
        }
        a.M.k = v1;
        a.b.k = a.l == false && a.F > 0 ? vRa.d : uSa.E;
        a.C.k = a.B == false || a.l == false ? vRa.d : uSa.E;
        v2 = (int)a.C.k;
        if (a.B) {
            a.g.k = a.l == false ? vRa.d : uSa.E;
            v3 = a;
            v3.G.k = a.l;
            v3.a.k = a.l;
            a.a.J = a.k.trim().length() > 0 ? vRa.d : uSa.E;
        }
    }
}

