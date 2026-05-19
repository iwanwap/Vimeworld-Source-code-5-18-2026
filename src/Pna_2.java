/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cta
 *  EC
 *  Epa
 *  FPa
 *  FTa
 *  Fna
 *  Kpa
 *  LW
 *  NOa
 *  NPa
 *  Pna
 *  Qta
 *  SOa
 *  Ssa
 *  Tpa
 *  XB
 *  XTa
 *  Zua
 *  aRa
 *  ac
 *  aqa
 *  jsa
 *  kPa
 *  kqa
 *  l
 *  mZ
 *  mra
 *  oqa
 *  pb
 *  pua
 *  ura
 *  vRa
 *  vU
 *  vpa
 *  zNa
 */
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Pna_2
extends EC
implements l {
    private ac G;
    public String D;
    private String f;
    public EC F;
    private boolean g;
    private static final Logger L = LogManager.getLogger();
    private String[] E;
    private int m;
    private ena C;
    private List<LW> i;
    private boolean M;
    private ac k;
    private final DateFormat j;
    private String J;
    private ac A;
    private ac I;

    private void f() throws aRa {
        Pna_2 a2;
        Pna_2 pna_2 = a2;
        pna_2.i = pna_2.g.J().J();
        Collections.sort(pna_2.i);
        pna_2.m = pua.o;
    }

    public static /* synthetic */ ac C(Pna a2) {
        return a2.I;
    }

    public static /* synthetic */ String f(Pna a2) {
        return a2.J;
    }

    /*
     * WARNING - void declaration
     */
    public String f(int n2) {
        void a2;
        Pna_2 pna_2 = this;
        Object b2 = pna_2.i.get((int)a2).getDisplayName();
        if (StringUtils.isEmpty((CharSequence)b2)) {
            b2 = oha.J(NOa.F, new Object[uSa.E]) + Tpa.E + (int)(a2 + vRa.d);
        }
        return b2;
    }

    public void d() throws IOException {
        Pna_2 a2;
        Pna_2 pna_2 = a2;
        super.d();
        pna_2.C.f();
    }

    public void J() {
        Pna_2 a2;
        a2.I = new ac(vRa.d, (int)(a2.A / uqa.g - Epa.u), (int)(a2.I - FPa.F), Jpa.Ha, kTa.j, oha.J(Cta.u, new Object[uSa.E]));
        a2.E.add(a2.I);
        a2.E.add(new ac(yRa.d, (int)(a2.A / uqa.g + AQa.P), (int)(a2.I - FPa.F), Jpa.Ha, kTa.j, oha.J(KQa.b, new Object[uSa.E])));
        a2.G = new ac(uua.p, (int)(a2.A / uqa.g - Epa.u), (int)(a2.I - EPa.O), Eqa.Ka, kTa.j, oha.J(Qta.b, new Object[uSa.E]));
        a2.E.add(a2.G);
        a2.A = new ac(uqa.g, (int)(a2.A / uqa.g - NPa.i), (int)(a2.I - EPa.O), Eqa.Ka, kTa.j, oha.J(Ssa.W, new Object[uSa.E]));
        a2.E.add(a2.A);
        a2.k = new ac(XTa.W, (int)(a2.A / uqa.g + AQa.P), (int)(a2.I - EPa.O), Eqa.Ka, kTa.j, oha.J(vpa.K, new Object[uSa.E]));
        a2.E.add(a2.k);
        a2.E.add(new ac(uSa.E, (int)(a2.A / uqa.g + aqa.Aa), (int)(a2.I - EPa.O), Eqa.Ka, kTa.j, oha.J(SOa.l, new Object[uSa.E])));
        Pna_2 pna_2 = a2;
        pna_2.I.J = uSa.E;
        pna_2.A.J = uSa.E;
        pna_2.G.J = uSa.E;
        pna_2.k.J = uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    public static Vma J(l l2, String string, int n2) {
        void a2;
        Object c2 = string;
        l b2 = l2;
        String string2 = oha.J(oqa.Ka, new Object[uSa.E]);
        c2 = new StringBuilder().insert(3 >> 2, XTa.Z).append((String)c2).append(qQa.E).append(oha.J(jsa.a, new Object[uSa.E])).toString();
        String string3 = oha.J(lTa.Ia, new Object[uSa.E]);
        String string4 = oha.J(SOa.l, new Object[uSa.E]);
        return new Vma(b2, string2, (String)c2, string3, string4, (int)a2);
    }

    public static /* synthetic */ int J(Pna a2) {
        return a2.m;
    }

    public Pna_2(EC eC2) {
        Pna_2 b2 = eC2;
        Pna_2 a2 = this;
        Pna_2 pna_2 = a2;
        a2.j = new SimpleDateFormat();
        pna_2.D = kqa.p;
        a2.E = new String[AQa.P];
        a2.F = b2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, float f2) {
        void b2;
        void c2;
        Pna_2 a2;
        float d2 = f2;
        Pna_2 pna_2 = a2 = this;
        a2.C.J((int)c2, (int)b2, d2);
        Pna_2.J((String)pna_2.D, (int)(a2.A / uqa.g), (int)kTa.j, (int)pua.o);
        super.J((int)c2, (int)b2, d2);
    }

    public void A() {
        Pna_2 pna_2 = this;
        pna_2.D = oha.J(lQa.ja, new Object[uSa.E]);
        try {
            pna_2.f();
        }
        catch (aRa a2) {
            L.error(nOa.N, (Throwable)a2);
            pna_2.g.J((EC)new Fna(mra.g, a2.getMessage()));
            return;
        }
        pna_2.f = oha.J(NOa.F, new Object[uSa.E]);
        pna_2.J = oha.J(kPa.ca, new Object[uSa.E]);
        pna_2.E[Daa.SURVIVAL.getID()] = oha.J(Zua.Aa, new Object[uSa.E]);
        pna_2.E[Daa.CREATIVE.getID()] = oha.J(FTa.O, new Object[uSa.E]);
        pna_2.E[Daa.ADVENTURE.getID()] = oha.J(aqa.V, new Object[uSa.E]);
        pna_2.E[Daa.SPECTATOR.getID()] = oha.J(ySa.K, new Object[uSa.E]);
        Pna_2 pna_22 = pna_2;
        pna_2.C = new ena((Pna)pna_22, (Kpa)pna_22.g);
        pna_2.C.l(AQa.P, tTa.h);
        pna_2.J();
    }

    public static /* synthetic */ ac l(Pna a2) {
        return a2.A;
    }

    public static /* synthetic */ ac f(Pna a2) {
        return a2.G;
    }

    public static /* synthetic */ String J(Pna a2) {
        return a2.f;
    }

    /*
     * WARNING - void declaration
     */
    public void J(boolean bl, int n2) {
        boolean c22 = bl;
        Pna_2 b2 = this;
        if (b2.M) {
            Pna_2 pna_2;
            block4: {
                b2.M = uSa.E;
                if (c22) {
                    void a2;
                    pb pb2 = c22 = b2.g.J();
                    pb2.J();
                    pb2.J(b2.J((int)a2));
                    try {
                        b2.f();
                        pna_2 = b2;
                        break block4;
                    }
                    catch (aRa c22) {
                        L.error(nOa.N, (Throwable)c22);
                    }
                }
                pna_2 = b2;
            }
            pna_2.g.J((EC)b2);
        }
    }

    public static /* synthetic */ String[] J(Pna a2) {
        return a2.E;
    }

    public void J(ac ac2) throws IOException {
        Pna_2 b2 = ac2;
        Pna_2 a2 = this;
        if (((ac)b2).J) {
            if (((ac)b2).C == uqa.g) {
                Pna_2 pna_2 = a2;
                String string = pna_2.f(pna_2.m);
                if (string != null) {
                    Pna_2 pna_22 = a2;
                    a2.M = vRa.d;
                    Vma vma = Pna_2.J(pna_22, string, pna_22.m);
                    pna_22.g.J((EC)vma);
                    return;
                }
            } else {
                if (((ac)b2).C == vRa.d) {
                    Pna_2 pna_2 = a2;
                    pna_2.J(pna_2.m);
                    return;
                }
                if (((ac)b2).C == yRa.d) {
                    a2.g.J((EC)new zNa((EC)a2));
                    return;
                }
                if (((ac)b2).C == uua.p) {
                    Pna_2 pna_2 = a2;
                    a2.g.J((EC)new bma(pna_2, pna_2.J(pna_2.m)));
                    return;
                }
                if (((ac)b2).C == 0) {
                    Pna_2 pna_2 = a2;
                    pna_2.g.J(pna_2.F);
                    return;
                }
                if (((ac)b2).C == XTa.W) {
                    zNa zNa2 = new zNa((EC)a2);
                    Pna_2 pna_2 = a2;
                    XB xB2 = a2.g.J().J(pna_2.J(pna_2.m), uSa.E != 0);
                    XB xB3 = xB2;
                    xB3 = xB2.J();
                    xB2.f();
                    zNa2.J((vU)xB3);
                    pna_2.g.J((EC)zNa2);
                    return;
                }
                a2.C.J((ac)b2);
            }
        }
    }

    public static /* synthetic */ DateFormat J(Pna a2) {
        return a2.j;
    }

    public static /* synthetic */ List J(Pna a2) {
        return a2.i;
    }

    public static /* synthetic */ int J(Pna pna2, int n2) {
        int b2 = n2;
        Pna a2 = pna2;
        a2.m = b2;
        return a2.m;
    }

    public static /* synthetic */ ac J(Pna a2) {
        return a2.k;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2) {
        Pna_2 pna_2 = this;
        pna_2.g.J((EC)null);
        if (!pna_2.g) {
            String string;
            void a2;
            pna_2.g = vRa.d;
            Object b2 = pna_2.J((int)a2);
            if (b2 == null) {
                b2 = new StringBuilder().insert(3 & 4, ura.ja).append((int)a2).toString();
            }
            if ((string = pna_2.f((int)a2)) == null) {
                string = new StringBuilder().insert(5 >> 3, ura.ja).append((int)a2).toString();
            }
            if (pna_2.g.J().C((String)b2)) {
                pna_2.g.J((String)b2, string, (mZ)null);
            }
        }
    }

    public String J(int n2) {
        int b2 = n2;
        Pna_2 a2 = this;
        return a2.i.get(b2).getFileName();
    }
}

