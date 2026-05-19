/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ata
 *  BRa
 *  Bpa
 *  Bsa
 *  Cta
 *  DQa
 *  EC
 *  ERa
 *  Epa
 *  FPa
 *  FTa
 *  Fpa
 *  Gc
 *  Gua
 *  HNa
 *  ISa
 *  Ic
 *  JPa
 *  JQa
 *  JSa
 *  JTa
 *  Jy
 *  KA
 *  Kpa
 *  LQa
 *  Lqa
 *  Lra
 *  MQa
 *  NQa
 *  NTa
 *  Oz
 *  Pqa
 *  QSa
 *  Qqa
 *  Qsa
 *  Qta
 *  RQa
 *  Rua
 *  SQa
 *  Ssa
 *  TPa
 *  TQa
 *  Tpa
 *  Uqa
 *  Uta
 *  WSa
 *  Woa
 *  XSa
 *  XTa
 *  YY
 *  Ypa
 *  Yra
 *  ZOa
 *  ZRa
 *  Zpa
 *  Zta
 *  Zua
 *  aSa
 *  ac
 *  bRa
 *  bSa
 *  bpa
 *  bqa
 *  bua
 *  cNa
 *  cQa
 *  cRa
 *  cra
 *  dpa
 *  fna
 *  fsa
 *  hTa
 *  hra
 *  iPa
 *  jRa
 *  jpa
 *  jsa
 *  koa
 *  kpa
 *  kqa
 *  lPa
 *  lqa
 *  mka
 *  mma
 *  nQa
 *  pKa
 *  pPa
 *  pqa
 *  pua
 *  toa
 *  uKa
 *  uOa
 *  vQa
 *  vRa
 *  vpa
 *  wOa
 *  wPa
 *  wra
 *  ysa
 *  zNa
 *  zTa
 *  zsa
 */
import com.google.common.base.Predicate;
import com.google.common.primitives.Floats;
import java.io.IOException;
import java.util.Random;
import net.minecraft.util.ResourceLocation;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ZLa
extends EC
implements Ic,
Gc {
    private int d;
    private ac a;
    private YY b;
    private ac l;
    private ac e;
    private ac G;
    private ac D;
    public String[] f;
    private fna F;
    public String g;
    public String L;
    private YY E;
    private ac m;
    private zNa C;
    private Predicate<String> i;
    private boolean M;
    private Random k;
    private ac j;
    private ac J;
    public String A;
    private boolean I;

    public void d() throws IOException {
        ZLa a2;
        ZLa zLa = a2;
        super.d();
        zLa.F.f();
    }

    private void G() {
        ZLa a2;
        ZLa zLa = a2;
        zLa.b.J();
        zLa.J();
        zLa.f(uSa.E != 0);
    }

    /*
     * WARNING - void declaration
     */
    private String J(int n2, float f2) {
        float c2;
        block9: {
            void b2;
            c2 = f2;
            ZLa a2 = this;
            switch (b2) {
                case 100: 
                case 101: 
                case 102: 
                case 103: 
                case 104: 
                case 107: 
                case 108: 
                case 110: 
                case 111: 
                case 132: 
                case 133: 
                case 134: 
                case 135: 
                case 136: 
                case 139: 
                case 140: 
                case 142: 
                case 143: {
                    while (false) {
                    }
                    Object[] objectArray = new Object[vRa.d];
                    objectArray[uSa.E] = Float.valueOf(c2);
                    return String.format(Qsa.ja, objectArray);
                }
                case 105: 
                case 106: 
                case 109: 
                case 112: 
                case 113: 
                case 114: 
                case 115: 
                case 137: 
                case 138: 
                case 141: 
                case 144: 
                case 145: 
                case 146: 
                case 147: {
                    Object[] objectArray = new Object[vRa.d];
                    objectArray[uSa.E] = Float.valueOf(c2);
                    return String.format(POa.L, objectArray);
                }
                default: {
                    Object[] objectArray = new Object[vRa.d];
                    objectArray[uSa.E] = (int)c2;
                    return String.format(Tpa.t, objectArray);
                }
                case 162: {
                    if (!(c2 < JPa.N)) break block9;
                }
            }
            return oha.J(vpa.Ia, new Object[uSa.E]);
        }
        if ((int)c2 >= Jy.B.Ka) {
            Jy b2 = Jy.J()[(int)c2 + uqa.g];
            if (b2 != null) {
                return b2.Ma;
            }
            return vRa.A;
        }
        Jy b2 = Jy.J()[(int)c2];
        if (b2 != null) {
            return b2.Ma;
        }
        return vRa.A;
    }

    private void f(boolean bl) {
        ZLa a2;
        boolean b2 = bl;
        ZLa zLa = a2 = this;
        zLa.M = b2;
        zLa.a.J = b2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public void J(char c2, int n2) throws IOException {
        void b2;
        ZLa a2;
        int c3 = n2;
        ZLa zLa = a2 = this;
        super.J((char)b2, c3);
        if (zLa.d == 0) {
            switch (c3) {
                case 200: {
                    a2.J(pqa.r);
                    return;
                }
                case 208: {
                    a2.J(vqa.T);
                    return;
                }
            }
            a2.F.J((char)b2, c3);
        }
    }

    private void D() throws IOException {
        ZLa a2;
        switch (a2.d) {
            case 300: {
                ZLa zLa = a2;
                while (false) {
                }
                zLa.J((Lna)zLa.F.J(vpa.Ja));
                ZLa zLa2 = a2;
                break;
            }
            case 304: {
                a2.G();
            }
            default: {
                ZLa zLa2 = a2;
            }
        }
        zLa2.d = uSa.E;
        a2.I = vRa.d;
        a2.J(uSa.E != 0);
    }

    /*
     * WARNING - void declaration
     */
    public void f(int n2, int n3, int n4) {
        void b2;
        void c2;
        ZLa a2;
        int d2 = n4;
        ZLa zLa = a2 = this;
        super.f((int)c2, (int)b2, d2);
        if (zLa.I) {
            a2.I = uSa.E;
            return;
        }
        if (a2.d == 0) {
            a2.F.f((int)c2, (int)b2, d2);
        }
    }

    private void f() {
        ZLa a2;
        a2.l.J = a2.F.i() != 0 ? vRa.d : uSa.E;
        a2.J.J = a2.F.i() != a2.F.A() - vRa.d ? vRa.d : uSa.E;
        Object[] objectArray = new Object[uqa.g];
        objectArray[uSa.E] = a2.F.i() + vRa.d;
        objectArray[vRa.d] = a2.F.A();
        a2.g = oha.J(yOa.fa, objectArray);
        a2.L = a2.f[a2.F.i()];
        a2.G.J = a2.F.i() != a2.F.A() - vRa.d ? vRa.d : uSa.E;
    }

    public void J(String string) {
        String b2 = string;
        ZLa a2 = this;
        if (b2 != null && b2.length() != 0) {
            a2.b = YY.J((String)b2);
            return;
        }
        a2.b = new YY();
    }

    /*
     * Unable to fully structure code
     */
    public void J(ac var1_1) throws IOException {
        block19: {
            var2_3 = this;
            if (!a.J) break block19;
            switch (a.C) {
                case 300: {
                    v0 = var2_3;
                    while (false) {
                    }
                    v0.C.k = v0.b.toString();
                    v0.g.J((EC)var2_3.C);
                    return;
                }
                case 301: {
                    v1 = a = uSa.E;
                    while (v1 < var2_3.F.e()) {
                        var4_6 = var2_3.F.J(a);
                        var5_8 = var4_6.J();
                        if (!(var5_8 instanceof ac)) ** GOTO lbl25
                        b = (ac)var5_8;
                        if (b instanceof cNa) {
                            var3_4 = ((cNa)b).J() * (wOa.w + var2_3.k.nextFloat() * MQa.L) + (var2_3.k.nextFloat() * Nra.e - Yqa.C);
                            ((cNa)b).J(Oz.J((float)var3_4, (float)JPa.N, (float)pqa.r));
                            v2 = var4_6;
                        } else {
                            if (b instanceof Lna) {
                                ((Lna)b).J(var2_3.k.nextBoolean());
                            }
lbl25:
                            // 4 sources

                            v2 = var4_6;
                        }
                        b = v2.f();
                        if (b instanceof ac) {
                            v3 = var3_5 = (ac)b;
                            if (var3_5 instanceof cNa) {
                                var4_7 = ((cNa)v3).J() * (wOa.w + var2_3.k.nextFloat() * MQa.L) + (var2_3.k.nextFloat() * Nra.e - Yqa.C);
                                ((cNa)var3_5).J(Oz.J((float)var4_7, (float)JPa.N, (float)pqa.r));
                            } else if (v3 instanceof Lna) {
                                ((Lna)var3_5).J(var2_3.k.nextBoolean());
                            }
                        }
                        v1 = ++a;
                    }
                    return;
                }
                case 302: {
                    v4 = var2_3;
                    v4.F.e();
                    v4.f();
                    return;
                }
                case 303: {
                    v5 = var2_3;
                    v5.F.M();
                    v5.f();
                    return;
                }
                case 304: {
                    if (!var2_3.M) break;
                    var2_3.J(JSa.P);
                    return;
                }
                case 305: {
                    var2_3.g.J((EC)new HNa(var2_3));
                    return;
                }
                case 306: {
                    var2_3.D();
                    return;
                }
                case 307: {
                    var2_3.d = uSa.E;
                    var2_3.D();
                }
            }
        }
    }

    public void A() {
        ZLa zLa = this;
        int a2 = uSa.E;
        int n2 = uSa.E;
        if (zLa.F != null) {
            ZLa zLa2 = zLa;
            a2 = zLa2.F.i();
            n2 = zLa2.F.f();
        }
        zLa.A = oha.J(cTa.Ga, new Object[uSa.E]);
        ZLa zLa3 = zLa;
        zLa3.E.clear();
        zLa.l = new ac(rRa.I, kTa.j, tTa.h, Fua.J, kTa.j, oha.J(tSa.q, new Object[uSa.E]));
        zLa3.E.add(zLa.l);
        zLa.J = new ac(BPa.Ja, (int)(zLa.A - ySa.T), tTa.h, Fua.J, kTa.j, oha.J(vTa.ja, new Object[uSa.E]));
        zLa.E.add(zLa.J);
        zLa.a = new ac(JSa.P, (int)(zLa.A / uqa.g - JQa.O), zLa.I - Lra.e, Jsa.ha, kTa.j, oha.J(Gta.s, new Object[uSa.E]));
        zLa.E.add(zLa.a);
        zLa.G = new ac(Asa.Ia, (int)(zLa.A / uqa.g - iSa.ca), zLa.I - Lra.e, Jsa.ha, kTa.j, oha.J(bRa.a, new Object[uSa.E]));
        zLa.E.add(zLa.G);
        zLa.D = new ac(Zpa.Q, (int)(zLa.A / uqa.g + yRa.d), zLa.I - Lra.e, Jsa.ha, kTa.j, oha.J(GPa.w, new Object[uSa.E]));
        zLa.E.add(zLa.D);
        zLa.m = new ac(vpa.Ja, (int)(zLa.A / uqa.g + dpa.A), zLa.I - Lra.e, Jsa.ha, kTa.j, oha.J(cra.g, new Object[uSa.E]));
        zLa.E.add(zLa.m);
        zLa.a.J = zLa.M;
        zLa.j = new ac(POa.C, (int)(zLa.A / uqa.g - Fpa.ca), rRa.f, vpa.o, kTa.j, oha.J(dsa.Ha, new Object[uSa.E]));
        zLa.j.k = uSa.E;
        zLa.E.add(zLa.j);
        zLa.e = new ac(Tpa.W, (int)(zLa.A / uqa.g + tTa.h), rRa.f, vpa.o, kTa.j, oha.J(MTa.P, new Object[uSa.E]));
        zLa.e.k = uSa.E;
        ZLa zLa4 = zLa;
        zLa.E.add(zLa4.e);
        if (zLa4.d != 0) {
            ZLa zLa5 = zLa;
            zLa5.j.k = vRa.d;
            zLa5.e.k = vRa.d;
        }
        zLa.J();
        if (a2 != 0) {
            ZLa zLa6 = zLa;
            zLa6.F.l(a2);
            zLa6.F.J(n2);
            zLa6.f();
        }
    }

    private void J(boolean bl) {
        boolean b2 = bl;
        ZLa a2 = this;
        a2.j.k = b2;
        a2.e.k = b2;
        a2.G.J = !b2 ? vRa.d : uSa.E;
        a2.m.J = !b2 ? vRa.d : uSa.E;
        a2.l.J = !b2 ? vRa.d : uSa.E;
        a2.J.J = !b2 ? vRa.d : uSa.E;
        a2.a.J = a2.M && !b2 ? vRa.d : uSa.E;
        a2.D.J = !b2 ? vRa.d : uSa.E;
        a2.F.l((!b2 ? vRa.d : uSa.E) != 0);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public void J(int n2, float f2) {
        KA kA2;
        int n3;
        void a2;
        ZLa b2;
        int c2;
        block71: {
            c2 = n2;
            b2 = this;
            switch (c2) {
                case 100: {
                    b2.b.mainNoiseScaleX = a2;
                    n3 = c2;
                    break block71;
                }
                case 101: {
                    b2.b.mainNoiseScaleY = a2;
                    n3 = c2;
                    break block71;
                }
                case 102: {
                    b2.b.mainNoiseScaleZ = a2;
                    n3 = c2;
                    break block71;
                }
                case 103: {
                    b2.b.depthNoiseScaleX = a2;
                    n3 = c2;
                    break block71;
                }
                case 104: {
                    b2.b.depthNoiseScaleZ = a2;
                    n3 = c2;
                    break block71;
                }
                case 105: {
                    b2.b.depthNoiseScaleExponent = a2;
                    n3 = c2;
                    break block71;
                }
                case 106: {
                    b2.b.baseSize = a2;
                    n3 = c2;
                    break block71;
                }
                case 107: {
                    b2.b.coordinateScale = a2;
                    n3 = c2;
                    break block71;
                }
                case 108: {
                    b2.b.heightScale = a2;
                    n3 = c2;
                    break block71;
                }
                case 109: {
                    b2.b.stretchY = a2;
                    n3 = c2;
                    break block71;
                }
                case 110: {
                    b2.b.upperLimitScale = a2;
                    n3 = c2;
                    break block71;
                }
                case 111: {
                    b2.b.lowerLimitScale = a2;
                    n3 = c2;
                    break block71;
                }
                case 112: {
                    b2.b.biomeDepthWeight = a2;
                    n3 = c2;
                    break block71;
                }
                case 113: {
                    b2.b.biomeDepthOffset = a2;
                    n3 = c2;
                    break block71;
                }
                case 114: {
                    b2.b.biomeScaleWeight = a2;
                    n3 = c2;
                    break block71;
                }
                case 115: {
                    b2.b.biomeScaleOffset = a2;
                }
                default: {
                    break;
                }
                case 157: {
                    b2.b.dungeonChance = (int)a2;
                    n3 = c2;
                    break block71;
                }
                case 158: {
                    b2.b.waterLakeChance = (int)a2;
                    n3 = c2;
                    break block71;
                }
                case 159: {
                    b2.b.lavaLakeChance = (int)a2;
                    n3 = c2;
                    break block71;
                }
                case 160: {
                    b2.b.seaLevel = (int)a2;
                    n3 = c2;
                    break block71;
                }
                case 162: {
                    b2.b.fixedBiome = (int)a2;
                    n3 = c2;
                    break block71;
                }
                case 163: {
                    b2.b.biomeSize = (int)a2;
                    n3 = c2;
                    break block71;
                }
                case 164: {
                    b2.b.riverSize = (int)a2;
                    n3 = c2;
                    break block71;
                }
                case 165: {
                    b2.b.dirtSize = (int)a2;
                    n3 = c2;
                    break block71;
                }
                case 166: {
                    b2.b.dirtCount = (int)a2;
                    n3 = c2;
                    break block71;
                }
                case 167: {
                    b2.b.dirtMinHeight = (int)a2;
                    n3 = c2;
                    break block71;
                }
                case 168: {
                    b2.b.dirtMaxHeight = (int)a2;
                    n3 = c2;
                    break block71;
                }
                case 169: {
                    b2.b.gravelSize = (int)a2;
                    n3 = c2;
                    break block71;
                }
                case 170: {
                    b2.b.gravelCount = (int)a2;
                    n3 = c2;
                    break block71;
                }
                case 171: {
                    b2.b.gravelMinHeight = (int)a2;
                    n3 = c2;
                    break block71;
                }
                case 172: {
                    b2.b.gravelMaxHeight = (int)a2;
                    n3 = c2;
                    break block71;
                }
                case 173: {
                    b2.b.graniteSize = (int)a2;
                    n3 = c2;
                    break block71;
                }
                case 174: {
                    b2.b.graniteCount = (int)a2;
                    n3 = c2;
                    break block71;
                }
                case 175: {
                    b2.b.graniteMinHeight = (int)a2;
                    n3 = c2;
                    break block71;
                }
                case 176: {
                    b2.b.graniteMaxHeight = (int)a2;
                    n3 = c2;
                    break block71;
                }
                case 177: {
                    b2.b.dioriteSize = (int)a2;
                    n3 = c2;
                    break block71;
                }
                case 178: {
                    b2.b.dioriteCount = (int)a2;
                    n3 = c2;
                    break block71;
                }
                case 179: {
                    b2.b.dioriteMinHeight = (int)a2;
                    n3 = c2;
                    break block71;
                }
                case 180: {
                    b2.b.dioriteMaxHeight = (int)a2;
                    n3 = c2;
                    break block71;
                }
                case 181: {
                    b2.b.andesiteSize = (int)a2;
                    n3 = c2;
                    break block71;
                }
                case 182: {
                    b2.b.andesiteCount = (int)a2;
                    n3 = c2;
                    break block71;
                }
                case 183: {
                    b2.b.andesiteMinHeight = (int)a2;
                    n3 = c2;
                    break block71;
                }
                case 184: {
                    b2.b.andesiteMaxHeight = (int)a2;
                    n3 = c2;
                    break block71;
                }
                case 185: {
                    b2.b.coalSize = (int)a2;
                    n3 = c2;
                    break block71;
                }
                case 186: {
                    b2.b.coalCount = (int)a2;
                    n3 = c2;
                    break block71;
                }
                case 187: {
                    b2.b.coalMinHeight = (int)a2;
                    n3 = c2;
                    break block71;
                }
                case 189: {
                    b2.b.coalMaxHeight = (int)a2;
                    n3 = c2;
                    break block71;
                }
                case 190: {
                    b2.b.ironSize = (int)a2;
                    n3 = c2;
                    break block71;
                }
                case 191: {
                    b2.b.ironCount = (int)a2;
                    n3 = c2;
                    break block71;
                }
                case 192: {
                    b2.b.ironMinHeight = (int)a2;
                    n3 = c2;
                    break block71;
                }
                case 193: {
                    b2.b.ironMaxHeight = (int)a2;
                    n3 = c2;
                    break block71;
                }
                case 194: {
                    b2.b.goldSize = (int)a2;
                    n3 = c2;
                    break block71;
                }
                case 195: {
                    b2.b.goldCount = (int)a2;
                    n3 = c2;
                    break block71;
                }
                case 196: {
                    b2.b.goldMinHeight = (int)a2;
                    n3 = c2;
                    break block71;
                }
                case 197: {
                    b2.b.goldMaxHeight = (int)a2;
                    n3 = c2;
                    break block71;
                }
                case 198: {
                    b2.b.redstoneSize = (int)a2;
                    n3 = c2;
                    break block71;
                }
                case 199: {
                    b2.b.redstoneCount = (int)a2;
                    n3 = c2;
                    break block71;
                }
                case 200: {
                    b2.b.redstoneMinHeight = (int)a2;
                    n3 = c2;
                    break block71;
                }
                case 201: {
                    b2.b.redstoneMaxHeight = (int)a2;
                    n3 = c2;
                    break block71;
                }
                case 202: {
                    b2.b.diamondSize = (int)a2;
                    n3 = c2;
                    break block71;
                }
                case 203: {
                    b2.b.diamondCount = (int)a2;
                    n3 = c2;
                    break block71;
                }
                case 204: {
                    b2.b.diamondMinHeight = (int)a2;
                    n3 = c2;
                    break block71;
                }
                case 205: {
                    b2.b.diamondMaxHeight = (int)a2;
                    n3 = c2;
                    break block71;
                }
                case 206: {
                    b2.b.lapisSize = (int)a2;
                    n3 = c2;
                    break block71;
                }
                case 207: {
                    b2.b.lapisCount = (int)a2;
                    n3 = c2;
                    break block71;
                }
                case 208: {
                    b2.b.lapisCenterHeight = (int)a2;
                    n3 = c2;
                    break block71;
                }
                case 209: {
                    b2.b.lapisSpread = (int)a2;
                }
            }
            n3 = c2;
        }
        if (n3 >= ySa.T && c2 < rQa.s && (kA2 = b2.F.J(c2 - ySa.T + gsa.Ja)) != null) {
            ((Woa)kA2).f(b2.J(c2, (float)a2));
        }
        ZLa zLa = b2;
        if (!zLa.b.equals((Object)zLa.E)) {
            b2.f(vRa.d != 0);
        }
    }

    private void J(int n2) {
        int b2 = n2;
        ZLa a2 = this;
        a2.d = b2;
        a2.J(vRa.d != 0);
    }

    /*
     * WARNING - void declaration
     */
    private void J(float f2) {
        block3: {
            KA kA2;
            void b22;
            Object object;
            ZLa zLa;
            block6: {
                block5: {
                    void a2;
                    block4: {
                        zLa = this;
                        object = zLa.F.J();
                        if (!(object instanceof Woa)) break block3;
                        b22 = a2;
                        if (!EC.l()) break block4;
                        b22 = a2 * Nra.e;
                        if (!EC.C()) break block5;
                        b22 *= Nra.e;
                        kA2 = object;
                        break block6;
                    }
                    if (EC.C()) {
                        b22 = a2 * FRa.Ga;
                        if (EC.f()) {
                            b22 *= FRa.Ga;
                        }
                    }
                }
                kA2 = object;
            }
            Object a2 = (Woa)kA2;
            object = Floats.tryParse(a2.f());
            if (object != null) {
                object = Float.valueOf(((Float)object).floatValue() + b22);
                int b22 = a2.l();
                Woa woa2 = a2;
                a2 = zLa.J(woa2.l(), ((Float)object).floatValue());
                woa2.f((String)a2);
                zLa.J(b22, (String)a2);
            }
        }
    }

    private void J() {
        toa[] toaArray = this;
        toa[] toaArray2 = new toa[yOa.B];
        toaArray2[uSa.E] = new koa(rRa.f, oha.J(wra.p, new Object[uSa.E]), vRa.d != 0, (Ic)toaArray, pqa.r, NQa.Y, (float)toaArray.b.seaLevel);
        toaArray2[vRa.d] = new gma(dpa.Ga, oha.J(pua.Z, new Object[uSa.E]), vRa.d != 0, toaArray.b.useCaves);
        toaArray2[uqa.g] = new gma(Jpa.Ha, oha.J(ERa.X, new Object[uSa.E]), vRa.d != 0, toaArray.b.useStrongholds);
        toaArray2[yRa.d] = new gma(Uqa.s, oha.J(APa.v, new Object[uSa.E]), vRa.d != 0, toaArray.b.useVillages);
        toaArray2[AQa.P] = new gma(kpa.Ha, oha.J(wPa.K, new Object[uSa.E]), vRa.d != 0, toaArray.b.useMineShafts);
        toaArray2[tTa.h] = new gma(Pua.k, oha.J(Eqa.t, new Object[uSa.E]), vRa.d != 0, toaArray.b.useTemples);
        toaArray2[uua.p] = new gma(vTa.y, oha.J(pPa.Z, new Object[uSa.E]), vRa.d != 0, toaArray.b.useMonuments);
        toaArray2[XTa.W] = new gma(Epa.u, oha.J(jsa.y, new Object[uSa.E]), vRa.d != 0, toaArray.b.useRavines);
        toaArray2[Yqa.i] = new gma(gQa.V, oha.J(bua.D, new Object[uSa.E]), vRa.d != 0, toaArray.b.useDungeons);
        toaArray2[WOa.fa] = new koa(Epa.ja, oha.J(Upa.Ha, new Object[uSa.E]), vRa.d != 0, (Ic)toaArray, pqa.r, QTa.G, (float)toaArray.b.dungeonChance);
        toaArray2[NTa.C] = new gma(BQa.Q, oha.J(nQa.e, new Object[uSa.E]), vRa.d != 0, toaArray.b.useWaterLakes);
        toaArray2[pPa.f] = new koa(EPa.l, oha.J(xra.z, new Object[uSa.E]), vRa.d != 0, (Ic)toaArray, pqa.r, QTa.G, (float)toaArray.b.waterLakeChance);
        toaArray2[lqa.s] = new gma(yRa.r, oha.J(Nra.A, new Object[uSa.E]), vRa.d != 0, toaArray.b.useLavaLakes);
        toaArray2[uua.s] = new koa(Qta.A, oha.J(Uta.I, new Object[uSa.E]), vRa.d != 0, (Ic)toaArray, FRa.Ga, QTa.G, (float)toaArray.b.lavaLakeChance);
        toaArray2[hpa.Z] = new gma(QSa.R, oha.J(PQa.j, new Object[uSa.E]), vRa.d != 0, toaArray.b.useLavaOceans);
        toaArray2[Ypa.A] = new koa(vua.y, oha.J(FPa.a, new Object[uSa.E]), vRa.d != 0, (Ic)toaArray, vqa.T, rpa.B, (float)toaArray.b.fixedBiome);
        toaArray2[ERa.C] = new koa(fta.l, oha.J(JQa.Ka, new Object[uSa.E]), vRa.d != 0, (Ic)toaArray, pqa.r, Qsa.k, (float)toaArray.b.biomeSize);
        toaArray2[yta.Ka] = new koa(yOa.a, oha.J(fsa.O, new Object[uSa.E]), vRa.d != 0, (Ic)toaArray, pqa.r, eua.C, (float)toaArray.b.riverSize);
        toa[] a2 = toaArray2;
        toa[] toaArray3 = new toa[SPa.T];
        toaArray3[uSa.E] = new mma(Epa.C, oha.J(cQa.B, new Object[uSa.E]), uSa.E != 0);
        toaArray3[vRa.d] = null;
        toaArray3[uqa.g] = new koa(Yqa.o, oha.J(fqa.F, new Object[uSa.E]), uSa.E != 0, (Ic)toaArray, pqa.r, SPa.b, (float)toaArray.b.dirtSize);
        toaArray3[yRa.d] = new koa(UTa.R, oha.J(oQa.G, new Object[uSa.E]), uSa.E != 0, (Ic)toaArray, JPa.N, ZRa.l, (float)toaArray.b.dirtCount);
        toaArray3[AQa.P] = new koa(TPa.Aa, oha.J(dsa.k, new Object[uSa.E]), uSa.E != 0, (Ic)toaArray, JPa.N, NQa.Y, (float)toaArray.b.dirtMinHeight);
        toaArray3[tTa.h] = new koa(tua.i, oha.J(ypa.Ka, new Object[uSa.E]), uSa.E != 0, (Ic)toaArray, JPa.N, NQa.Y, (float)toaArray.b.dirtMaxHeight);
        toaArray3[uua.p] = new mma(WRa.G, oha.J(SQa.O, new Object[uSa.E]), uSa.E != 0);
        toaArray3[XTa.W] = null;
        toaArray3[Yqa.i] = new koa(SPa.l, oha.J(fqa.F, new Object[uSa.E]), uSa.E != 0, (Ic)toaArray, pqa.r, SPa.b, (float)toaArray.b.gravelSize);
        toaArray3[WOa.fa] = new koa(JTa.M, oha.J(oQa.G, new Object[uSa.E]), uSa.E != 0, (Ic)toaArray, JPa.N, ZRa.l, (float)toaArray.b.gravelCount);
        toaArray3[NTa.C] = new koa(Jqa.q, oha.J(dsa.k, new Object[uSa.E]), uSa.E != 0, (Ic)toaArray, JPa.N, NQa.Y, (float)toaArray.b.gravelMinHeight);
        toaArray3[pPa.f] = new koa(ERa.T, oha.J(ypa.Ka, new Object[uSa.E]), uSa.E != 0, (Ic)toaArray, JPa.N, NQa.Y, (float)toaArray.b.gravelMaxHeight);
        toaArray3[lqa.s] = new mma(LRa.A, oha.J(Zta.U, new Object[uSa.E]), uSa.E != 0);
        toaArray3[uua.s] = null;
        toaArray3[hpa.Z] = new koa(bpa.fa, oha.J(fqa.F, new Object[uSa.E]), uSa.E != 0, (Ic)toaArray, pqa.r, SPa.b, (float)toaArray.b.graniteSize);
        toaArray3[Ypa.A] = new koa(Yra.J, oha.J(oQa.G, new Object[uSa.E]), uSa.E != 0, (Ic)toaArray, JPa.N, ZRa.l, (float)toaArray.b.graniteCount);
        toaArray3[ERa.C] = new koa(Bsa.n, oha.J(dsa.k, new Object[uSa.E]), uSa.E != 0, (Ic)toaArray, JPa.N, NQa.Y, (float)toaArray.b.graniteMinHeight);
        toaArray3[yta.Ka] = new koa(MTa.U, oha.J(ypa.Ka, new Object[uSa.E]), uSa.E != 0, (Ic)toaArray, JPa.N, NQa.Y, (float)toaArray.b.graniteMaxHeight);
        toaArray3[yOa.B] = new mma(bSa.Ka, oha.J(XTa.C, new Object[uSa.E]), uSa.E != 0);
        toaArray3[wOa.t] = null;
        toaArray3[kTa.j] = new koa(mPa.Ia, oha.J(fqa.F, new Object[uSa.E]), uSa.E != 0, (Ic)toaArray, pqa.r, SPa.b, (float)toaArray.b.dioriteSize);
        toaArray3[wOa.h] = new koa(DPa.J, oha.J(oQa.G, new Object[uSa.E]), uSa.E != 0, (Ic)toaArray, JPa.N, ZRa.l, (float)toaArray.b.dioriteCount);
        toaArray3[cQa.o] = new koa(Fsa.H, oha.J(dsa.k, new Object[uSa.E]), uSa.E != 0, (Ic)toaArray, JPa.N, NQa.Y, (float)toaArray.b.dioriteMinHeight);
        toaArray3[AQa.ba] = new koa(cRa.n, oha.J(ypa.Ka, new Object[uSa.E]), uSa.E != 0, (Ic)toaArray, JPa.N, NQa.Y, (float)toaArray.b.dioriteMaxHeight);
        toaArray3[osa.c] = new mma(Uqa.O, oha.J(rSa.P, new Object[uSa.E]), uSa.E != 0);
        toaArray3[kTa.g] = null;
        toaArray3[ITa.E] = new koa(Eqa.S, oha.J(fqa.F, new Object[uSa.E]), uSa.E != 0, (Ic)toaArray, pqa.r, SPa.b, (float)toaArray.b.andesiteSize);
        toaArray3[Lra.e] = new koa(Bsa.H, oha.J(oQa.G, new Object[uSa.E]), uSa.E != 0, (Ic)toaArray, JPa.N, ZRa.l, (float)toaArray.b.andesiteCount);
        toaArray3[EPa.O] = new koa(xua.r, oha.J(dsa.k, new Object[uSa.E]), uSa.E != 0, (Ic)toaArray, JPa.N, NQa.Y, (float)toaArray.b.andesiteMinHeight);
        toaArray3[ITa.A] = new koa(kTa.T, oha.J(ypa.Ka, new Object[uSa.E]), uSa.E != 0, (Ic)toaArray, JPa.N, NQa.Y, (float)toaArray.b.andesiteMaxHeight);
        toaArray3[Fsa.d] = new mma(wsa.fa, oha.J(Bta.o, new Object[uSa.E]), uSa.E != 0);
        toaArray3[tua.U] = null;
        toaArray3[fPa.i] = new koa(cQa.q, oha.J(fqa.F, new Object[uSa.E]), uSa.E != 0, (Ic)toaArray, pqa.r, SPa.b, (float)toaArray.b.coalSize);
        toaArray3[Zqa.G] = new koa(jpa.d, oha.J(oQa.G, new Object[uSa.E]), uSa.E != 0, (Ic)toaArray, JPa.N, ZRa.l, (float)toaArray.b.coalCount);
        toaArray3[Tpa.z] = new koa(JQa.O, oha.J(dsa.k, new Object[uSa.E]), uSa.E != 0, (Ic)toaArray, JPa.N, NQa.Y, (float)toaArray.b.coalMinHeight);
        toaArray3[TQa.ca] = new koa(kua.D, oha.J(ypa.Ka, new Object[uSa.E]), uSa.E != 0, (Ic)toaArray, JPa.N, NQa.Y, (float)toaArray.b.coalMaxHeight);
        toaArray3[Qsa.Ha] = new mma(Jpa.s, oha.J(vTa.H, new Object[uSa.E]), uSa.E != 0);
        toaArray3[LQa.c] = null;
        toaArray3[ISa.E] = new koa(Bpa.s, oha.J(fqa.F, new Object[uSa.E]), uSa.E != 0, (Ic)toaArray, pqa.r, SPa.b, (float)toaArray.b.ironSize);
        toaArray3[CRa.L] = new koa(tTa.L, oha.J(oQa.G, new Object[uSa.E]), uSa.E != 0, (Ic)toaArray, JPa.N, ZRa.l, (float)toaArray.b.ironCount);
        toaArray3[wra.P] = new koa(ppa.f, oha.J(dsa.k, new Object[uSa.E]), uSa.E != 0, (Ic)toaArray, JPa.N, NQa.Y, (float)toaArray.b.ironMinHeight);
        toaArray3[kra.U] = new koa(sOa.S, oha.J(ypa.Ka, new Object[uSa.E]), uSa.E != 0, (Ic)toaArray, JPa.N, NQa.Y, (float)toaArray.b.ironMaxHeight);
        toaArray3[cQa.i] = new mma(Gua.W, oha.J(Qqa.y, new Object[uSa.E]), uSa.E != 0);
        toaArray3[iSa.x] = null;
        toaArray3[Yqa.D] = new koa(UTa.L, oha.J(fqa.F, new Object[uSa.E]), uSa.E != 0, (Ic)toaArray, pqa.r, SPa.b, (float)toaArray.b.goldSize);
        toaArray3[wra.e] = new koa(xqa.W, oha.J(oQa.G, new Object[uSa.E]), uSa.E != 0, (Ic)toaArray, JPa.N, ZRa.l, (float)toaArray.b.goldCount);
        toaArray3[Bpa.Ha] = new koa(pta.c, oha.J(dsa.k, new Object[uSa.E]), uSa.E != 0, (Ic)toaArray, JPa.N, NQa.Y, (float)toaArray.b.goldMinHeight);
        toaArray3[uOa.F] = new koa(Bpa.a, oha.J(ypa.Ka, new Object[uSa.E]), uSa.E != 0, (Ic)toaArray, JPa.N, NQa.Y, (float)toaArray.b.goldMaxHeight);
        toaArray3[QSa.p] = new mma(BRa.u, oha.J(Iqa.p, new Object[uSa.E]), uSa.E != 0);
        toaArray3[jRa.q] = null;
        toaArray3[vpa.o] = new koa(FPa.e, oha.J(fqa.F, new Object[uSa.E]), uSa.E != 0, (Ic)toaArray, pqa.r, SPa.b, (float)toaArray.b.redstoneSize);
        toaArray3[cPa.Q] = new koa(DQa.Aa, oha.J(oQa.G, new Object[uSa.E]), uSa.E != 0, (Ic)toaArray, JPa.N, ZRa.l, (float)toaArray.b.redstoneCount);
        toaArray3[FPa.F] = new koa(ZOa.x, oha.J(dsa.k, new Object[uSa.E]), uSa.E != 0, (Ic)toaArray, JPa.N, NQa.Y, (float)toaArray.b.redstoneMinHeight);
        toaArray3[Bpa.Z] = new koa(Tqa.K, oha.J(ypa.Ka, new Object[uSa.E]), uSa.E != 0, (Ic)toaArray, JPa.N, NQa.Y, (float)toaArray.b.redstoneMaxHeight);
        toaArray3[GPa.C] = new mma(hTa.ca, oha.J(WSa.Ha, new Object[uSa.E]), uSa.E != 0);
        toaArray3[Fpa.ca] = null;
        toaArray3[Upa.D] = new koa(bqa.P, oha.J(fqa.F, new Object[uSa.E]), uSa.E != 0, (Ic)toaArray, pqa.r, SPa.b, (float)toaArray.b.diamondSize);
        toaArray3[KSa.x] = new koa(Bta.la, oha.J(oQa.G, new Object[uSa.E]), uSa.E != 0, (Ic)toaArray, JPa.N, ZRa.l, (float)toaArray.b.diamondCount);
        toaArray3[lQa.R] = new koa(zOa.a, oha.J(dsa.k, new Object[uSa.E]), uSa.E != 0, (Ic)toaArray, JPa.N, NQa.Y, (float)toaArray.b.diamondMinHeight);
        toaArray3[lPa.p] = new koa(kTa.Fa, oha.J(ypa.Ka, new Object[uSa.E]), uSa.E != 0, (Ic)toaArray, JPa.N, NQa.Y, (float)toaArray.b.diamondMaxHeight);
        toaArray3[Psa.M] = new mma(ZOa.P, oha.J(Zua.f, new Object[uSa.E]), uSa.E != 0);
        toaArray3[tua.w] = null;
        toaArray3[ITa.V] = new koa(NSa.ga, oha.J(fqa.F, new Object[uSa.E]), uSa.E != 0, (Ic)toaArray, pqa.r, SPa.b, (float)toaArray.b.lapisSize);
        toaArray3[Ssa.u] = new koa(bsa.X, oha.J(oQa.G, new Object[uSa.E]), uSa.E != 0, (Ic)toaArray, JPa.N, ZRa.l, (float)toaArray.b.lapisCount);
        toaArray3[ysa.s] = new koa(Pqa.i, oha.J(dpa.c, new Object[uSa.E]), uSa.E != 0, (Ic)toaArray, JPa.N, NQa.Y, (float)toaArray.b.lapisCenterHeight);
        toaArray3[fPa.ga] = new koa(ZOa.d, oha.J(sqa.w, new Object[uSa.E]), uSa.E != 0, (Ic)toaArray, JPa.N, NQa.Y, (float)toaArray.b.lapisSpread);
        toa[] toaArray4 = toaArray3;
        toa[] toaArray5 = new toa[ERa.C];
        toaArray5[uSa.E] = new koa(ySa.T, oha.J(Ata.j, new Object[uSa.E]), uSa.E != 0, (Ic)toaArray, pqa.r, Ssa.o, toaArray.b.mainNoiseScaleX);
        toaArray5[vRa.d] = new koa(zTa.C, oha.J(Mqa.F, new Object[uSa.E]), uSa.E != 0, (Ic)toaArray, pqa.r, Ssa.o, toaArray.b.mainNoiseScaleY);
        toaArray5[uqa.g] = new koa(jRa.v, oha.J(bqa.F, new Object[uSa.E]), uSa.E != 0, (Ic)toaArray, pqa.r, Ssa.o, toaArray.b.mainNoiseScaleZ);
        toaArray5[yRa.d] = new koa(Bsa.E, oha.J(Wqa.q, new Object[uSa.E]), uSa.E != 0, (Ic)toaArray, pqa.r, xqa.O, toaArray.b.depthNoiseScaleX);
        toaArray5[AQa.P] = new koa(Lqa.h, oha.J(uua.c, new Object[uSa.E]), uSa.E != 0, (Ic)toaArray, pqa.r, xqa.O, toaArray.b.depthNoiseScaleZ);
        toaArray5[tTa.h] = new koa(xua.S, oha.J(Bta.m, new Object[uSa.E]), uSa.E != 0, (Ic)toaArray, Jpa.B, eta.e, toaArray.b.depthNoiseScaleExponent);
        toaArray5[uua.p] = new koa(Yra.j, oha.J(vqa.s, new Object[uSa.E]), uSa.E != 0, (Ic)toaArray, pqa.r, sSa.E, toaArray.b.baseSize);
        toaArray5[XTa.W] = new koa(jpa.E, oha.J(Lra.fa, new Object[uSa.E]), uSa.E != 0, (Ic)toaArray, pqa.r, Ira.j, toaArray.b.coordinateScale);
        toaArray5[Yqa.i] = new koa(Jra.o, oha.J(eta.o, new Object[uSa.E]), uSa.E != 0, (Ic)toaArray, pqa.r, Ira.j, toaArray.b.heightScale);
        toaArray5[WOa.fa] = new koa(rSa.i, oha.J(JTa.I, new Object[uSa.E]), uSa.E != 0, (Ic)toaArray, Jpa.B, SPa.b, toaArray.b.stretchY);
        toaArray5[NTa.C] = new koa(Iqa.M, oha.J(NTa.r, new Object[uSa.E]), uSa.E != 0, (Ic)toaArray, pqa.r, Ssa.o, toaArray.b.upperLimitScale);
        toaArray5[pPa.f] = new koa(fPa.z, oha.J(Yra.ja, new Object[uSa.E]), uSa.E != 0, (Ic)toaArray, pqa.r, Ssa.o, toaArray.b.lowerLimitScale);
        toaArray5[lqa.s] = new koa(BRa.E, oha.J(jsa.z, new Object[uSa.E]), uSa.E != 0, (Ic)toaArray, pqa.r, eta.e, toaArray.b.biomeDepthWeight);
        toaArray5[uua.s] = new koa(XSa.C, oha.J(Yua.N, new Object[uSa.E]), uSa.E != 0, (Ic)toaArray, JPa.N, eta.e, toaArray.b.biomeDepthOffset);
        toaArray5[hpa.Z] = new koa(WSa.o, oha.J(kqa.q, new Object[uSa.E]), uSa.E != 0, (Ic)toaArray, pqa.r, eta.e, toaArray.b.biomeScaleWeight);
        toaArray5[Ypa.A] = new koa(pta.ba, oha.J(Jra.a, new Object[uSa.E]), uSa.E != 0, (Ic)toaArray, JPa.N, eta.e, toaArray.b.biomeScaleOffset);
        toa[] toaArray6 = toaArray5;
        toa[] toaArray7 = new toa[fPa.i];
        toaArray7[uSa.E] = new mma(hra.i, oha.J(Ata.j, new Object[uSa.E]) + Era.Aa, uSa.E != 0);
        Object[] objectArray = new Object[vRa.d];
        objectArray[uSa.E] = Float.valueOf(toaArray.b.mainNoiseScaleX);
        toaArray7[vRa.d] = new yNa(gsa.Ja, String.format(Qsa.ja, objectArray), uSa.E != 0, toaArray.i);
        toaArray7[uqa.g] = new mma(GPa.T, oha.J(Mqa.F, new Object[uSa.E]) + Era.Aa, uSa.E != 0);
        Object[] objectArray2 = new Object[vRa.d];
        objectArray2[uSa.E] = Float.valueOf(toaArray.b.mainNoiseScaleY);
        toaArray7[yRa.d] = new yNa(ITa.Da, String.format(Qsa.ja, objectArray2), uSa.E != 0, toaArray.i);
        toaArray7[AQa.P] = new mma(tua.ha, oha.J(bqa.F, new Object[uSa.E]) + Era.Aa, uSa.E != 0);
        Object[] objectArray3 = new Object[vRa.d];
        objectArray3[uSa.E] = Float.valueOf(toaArray.b.mainNoiseScaleZ);
        toaArray7[tTa.h] = new yNa(Qqa.Ja, String.format(Qsa.ja, objectArray3), uSa.E != 0, toaArray.i);
        toaArray7[uua.p] = new mma(Gua.w, oha.J(Wqa.q, new Object[uSa.E]) + Era.Aa, uSa.E != 0);
        Object[] objectArray4 = new Object[vRa.d];
        objectArray4[uSa.E] = Float.valueOf(toaArray.b.depthNoiseScaleX);
        toaArray7[XTa.W] = new yNa(RQa.R, String.format(Qsa.ja, objectArray4), uSa.E != 0, toaArray.i);
        toaArray7[Yqa.i] = new mma(ERa.P, oha.J(uua.c, new Object[uSa.E]) + Era.Aa, uSa.E != 0);
        Object[] objectArray5 = new Object[vRa.d];
        objectArray5[uSa.E] = Float.valueOf(toaArray.b.depthNoiseScaleZ);
        toaArray7[WOa.fa] = new yNa(PRa.D, String.format(Qsa.ja, objectArray5), uSa.E != 0, toaArray.i);
        toaArray7[NTa.C] = new mma(BRa.ja, oha.J(Bta.m, new Object[uSa.E]) + Era.Aa, uSa.E != 0);
        Object[] objectArray6 = new Object[vRa.d];
        objectArray6[uSa.E] = Float.valueOf(toaArray.b.depthNoiseScaleExponent);
        toaArray7[pPa.f] = new yNa(ATa.L, String.format(POa.L, objectArray6), uSa.E != 0, toaArray.i);
        toaArray7[lqa.s] = new mma(bRa.R, oha.J(vqa.s, new Object[uSa.E]) + Era.Aa, uSa.E != 0);
        Object[] objectArray7 = new Object[vRa.d];
        objectArray7[uSa.E] = Float.valueOf(toaArray.b.baseSize);
        toaArray7[uua.s] = new yNa(Ypa.Z, String.format(POa.L, objectArray7), uSa.E != 0, toaArray.i);
        toaArray7[hpa.Z] = new mma(vpa.W, oha.J(Lra.fa, new Object[uSa.E]) + Era.Aa, uSa.E != 0);
        Object[] objectArray8 = new Object[vRa.d];
        objectArray8[uSa.E] = Float.valueOf(toaArray.b.coordinateScale);
        toaArray7[Ypa.A] = new yNa(iPa.ca, String.format(Qsa.ja, objectArray8), uSa.E != 0, toaArray.i);
        toaArray7[ERa.C] = new mma(lQa.q, oha.J(eta.o, new Object[uSa.E]) + Era.Aa, uSa.E != 0);
        Object[] objectArray9 = new Object[vRa.d];
        objectArray9[uSa.E] = Float.valueOf(toaArray.b.heightScale);
        toaArray7[yta.Ka] = new yNa(Bua.v, String.format(Qsa.ja, objectArray9), uSa.E != 0, toaArray.i);
        toaArray7[yOa.B] = new mma(vQa.F, oha.J(JTa.I, new Object[uSa.E]) + Era.Aa, uSa.E != 0);
        Object[] objectArray10 = new Object[vRa.d];
        objectArray10[uSa.E] = Float.valueOf(toaArray.b.stretchY);
        toaArray7[wOa.t] = new yNa(SQa.i, String.format(POa.L, objectArray10), uSa.E != 0, toaArray.i);
        toaArray7[kTa.j] = new mma(zTa.n, oha.J(NTa.r, new Object[uSa.E]) + Era.Aa, uSa.E != 0);
        Object[] objectArray11 = new Object[vRa.d];
        objectArray11[uSa.E] = Float.valueOf(toaArray.b.upperLimitScale);
        toaArray7[wOa.h] = new yNa(Fsa.D, String.format(Qsa.ja, objectArray11), uSa.E != 0, toaArray.i);
        toaArray7[cQa.o] = new mma(Jsa.H, oha.J(Yra.ja, new Object[uSa.E]) + Era.Aa, uSa.E != 0);
        Object[] objectArray12 = new Object[vRa.d];
        objectArray12[uSa.E] = Float.valueOf(toaArray.b.lowerLimitScale);
        toaArray7[AQa.ba] = new yNa(NQa.L, String.format(Qsa.ja, objectArray12), uSa.E != 0, toaArray.i);
        toaArray7[osa.c] = new mma(Bpa.ga, oha.J(jsa.z, new Object[uSa.E]) + Era.Aa, uSa.E != 0);
        Object[] objectArray13 = new Object[vRa.d];
        objectArray13[uSa.E] = Float.valueOf(toaArray.b.biomeDepthWeight);
        toaArray7[kTa.g] = new yNa(FTa.A, String.format(POa.L, objectArray13), uSa.E != 0, toaArray.i);
        toaArray7[ITa.E] = new mma(vsa.S, oha.J(Yua.N, new Object[uSa.E]) + Era.Aa, uSa.E != 0);
        Object[] objectArray14 = new Object[vRa.d];
        objectArray14[uSa.E] = Float.valueOf(toaArray.b.biomeDepthOffset);
        toaArray7[Lra.e] = new yNa(Cta.a, String.format(POa.L, objectArray14), uSa.E != 0, toaArray.i);
        toaArray7[EPa.O] = new mma(ATa.Ma, oha.J(kqa.q, new Object[uSa.E]) + Era.Aa, uSa.E != 0);
        Object[] objectArray15 = new Object[vRa.d];
        objectArray15[uSa.E] = Float.valueOf(toaArray.b.biomeScaleWeight);
        toaArray7[ITa.A] = new yNa(sOa.x, String.format(POa.L, objectArray15), uSa.E != 0, toaArray.i);
        toaArray7[Fsa.d] = new mma(bsa.W, oha.J(Jra.a, new Object[uSa.E]) + Era.Aa, uSa.E != 0);
        Object[] objectArray16 = new Object[vRa.d];
        objectArray16[uSa.E] = Float.valueOf(toaArray.b.biomeScaleOffset);
        toaArray7[tua.U] = new yNa(Zqa.Ga, String.format(POa.L, objectArray16), uSa.E != 0, toaArray.i);
        toa[] toaArray8 = toaArray7;
        toa[] toaArray9 = toaArray;
        toa[][] toaArrayArray = new toa[AQa.P][];
        toaArrayArray[uSa.E] = a2;
        toaArrayArray[vRa.d] = toaArray4;
        toaArrayArray[uqa.g] = toaArray6;
        toaArrayArray[yRa.d] = toaArray8;
        toaArray.F = new fna((Kpa)toaArray.g, (int)toaArray.A, toaArray.I ? 1 : 0, fPa.i, toaArray.I - fPa.i, kTa.g, (Gc)toaArray, (toa[][])toaArrayArray);
        int n2 = a2 = uSa.E;
        while (n2 < AQa.P) {
            int n3 = a2++;
            toaArray.f[n3] = oha.J(new StringBuilder().insert(5 >> 3, zsa.y).append(n3).toString(), new Object[uSa.E]);
            n2 = a2;
        }
        super.f();
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, boolean bl) {
        ZLa zLa;
        void b2;
        boolean c2 = bl;
        ZLa a2 = this;
        switch (b2) {
            case 148: {
                while (false) {
                }
                zLa = a2;
                a2.b.useCaves = c2;
                break;
            }
            case 149: {
                zLa = a2;
                a2.b.useDungeons = c2;
                break;
            }
            case 150: {
                zLa = a2;
                a2.b.useStrongholds = c2;
                break;
            }
            case 151: {
                zLa = a2;
                a2.b.useVillages = c2;
                break;
            }
            case 152: {
                zLa = a2;
                a2.b.useMineShafts = c2;
                break;
            }
            case 153: {
                zLa = a2;
                a2.b.useTemples = c2;
                break;
            }
            case 154: {
                zLa = a2;
                a2.b.useRavines = c2;
                break;
            }
            case 155: {
                zLa = a2;
                a2.b.useWaterLakes = c2;
                break;
            }
            case 156: {
                zLa = a2;
                a2.b.useLavaLakes = c2;
                break;
            }
            case 161: {
                zLa = a2;
                a2.b.useLavaOceans = c2;
                break;
            }
            case 210: {
                a2.b.useMonuments = c2;
            }
            default: {
                zLa = a2;
            }
        }
        if (!zLa.b.equals((Object)a2.E)) {
            a2.f(vRa.d != 0);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void J(int n2, String string) {
        float f2;
        void b2;
        void var2_6;
        void c22 = var2_6;
        ZLa a2 = this;
        float f3 = JPa.N;
        try {
            f3 = Float.parseFloat((String)c22);
        }
        catch (NumberFormatException c22) {
            // empty catch block
        }
        float c22 = JPa.N;
        switch (b2) {
            case 132: {
                f2 = c22 = (a2.b.mainNoiseScaleX = Oz.J((float)f3, (float)pqa.r, (float)Ssa.o));
                break;
            }
            case 133: {
                f2 = c22 = (a2.b.mainNoiseScaleY = Oz.J((float)f3, (float)pqa.r, (float)Ssa.o));
                break;
            }
            case 134: {
                f2 = c22 = (a2.b.mainNoiseScaleZ = Oz.J((float)f3, (float)pqa.r, (float)Ssa.o));
                break;
            }
            case 135: {
                f2 = c22 = (a2.b.depthNoiseScaleX = Oz.J((float)f3, (float)pqa.r, (float)xqa.O));
                break;
            }
            case 136: {
                f2 = c22 = (a2.b.depthNoiseScaleZ = Oz.J((float)f3, (float)pqa.r, (float)xqa.O));
                break;
            }
            case 137: {
                f2 = c22 = (a2.b.depthNoiseScaleExponent = Oz.J((float)f3, (float)Jpa.B, (float)eta.e));
                break;
            }
            case 138: {
                f2 = c22 = (a2.b.baseSize = Oz.J((float)f3, (float)pqa.r, (float)sSa.E));
                break;
            }
            case 139: {
                f2 = c22 = (a2.b.coordinateScale = Oz.J((float)f3, (float)pqa.r, (float)Ira.j));
                break;
            }
            case 140: {
                f2 = c22 = (a2.b.heightScale = Oz.J((float)f3, (float)pqa.r, (float)Ira.j));
                break;
            }
            case 141: {
                f2 = c22 = (a2.b.stretchY = Oz.J((float)f3, (float)Jpa.B, (float)SPa.b));
                break;
            }
            case 142: {
                f2 = c22 = (a2.b.upperLimitScale = Oz.J((float)f3, (float)pqa.r, (float)Ssa.o));
                break;
            }
            case 143: {
                f2 = c22 = (a2.b.lowerLimitScale = Oz.J((float)f3, (float)pqa.r, (float)Ssa.o));
                break;
            }
            case 144: {
                f2 = c22 = (a2.b.biomeDepthWeight = Oz.J((float)f3, (float)pqa.r, (float)eta.e));
                break;
            }
            case 145: {
                f2 = c22 = (a2.b.biomeDepthOffset = Oz.J((float)f3, (float)JPa.N, (float)eta.e));
                break;
            }
            case 146: {
                f2 = c22 = (a2.b.biomeScaleWeight = Oz.J((float)f3, (float)pqa.r, (float)eta.e));
                break;
            }
            case 147: {
                c22 = a2.b.biomeScaleOffset = Oz.J((float)f3, (float)JPa.N, (float)eta.e);
            }
            default: {
                f2 = c22;
            }
        }
        if (f2 != f3 && f3 != JPa.N) {
            ((Woa)a2.F.J((int)b2)).f(a2.J((int)b2, c22));
        }
        ((cNa)a2.F.J((int)(b2 - gsa.Ja + ySa.T))).J(c22, uSa.E != 0);
        ZLa zLa = a2;
        if (!zLa.b.equals((Object)zLa.E)) {
            a2.f(vRa.d != 0);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, float f2) {
        void a22;
        void b2;
        void c2;
        ZLa zLa;
        ZLa zLa2 = zLa = this;
        ZLa zLa3 = zLa;
        zLa3.i();
        zLa3.F.J((int)c2, (int)b2, (float)a22);
        ZLa.J((String)zLa3.A, (int)(zLa.A / uqa.g), (int)uqa.g, (int)pua.o);
        ZLa.J((String)zLa3.g, (int)(zLa.A / uqa.g), (int)lqa.s, (int)pua.o);
        ZLa.J((String)zLa.L, (int)(zLa.A / uqa.g), (int)cQa.o, (int)pua.o);
        super.J((int)c2, (int)b2, (float)a22);
        if (zLa2.d != 0) {
            ZLa zLa4 = zLa;
            ZLa.J((int)uSa.E, (int)uSa.E, (int)zLa4.A, (int)(zLa4.I ? 1 : 0), (int)ypa.L);
            ZLa zLa5 = zLa;
            ZLa zLa6 = zLa;
            zLa5.l((int)(zLa5.A / uqa.g - rRa.R), (int)(zLa6.A / uqa.g + Jsa.ha), zOa.v, oua.S);
            zLa5.l((int)(zLa6.A / uqa.g - rRa.R), (int)(zLa.A / uqa.g + Jsa.ha), cQa.q, gsa.Ga);
            zLa5.f((int)(zLa5.A / uqa.g - rRa.R), zOa.v, cQa.q, oua.S);
            zLa5.f((int)(zLa5.A / uqa.g + Jsa.ha), zOa.v, cQa.q, gsa.Ga);
            uKa.L();
            uKa.I();
            pKa a22 = pKa.J();
            ZLa d2 = a22.J();
            zLa5.g.J().J((ResourceLocation)J);
            uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
            ZLa zLa7 = d2;
            ZLa zLa8 = zLa;
            ZLa zLa9 = d2;
            zLa9.J(XTa.W, mka.a);
            zLa9.J((double)(zLa.A / uqa.g - Jsa.ha), Hra.S, aSa.V).J(aSa.V, Zra.N).J(ysa.s, ysa.s, ysa.s, ysa.s).M();
            d2.J((double)(zLa8.A / uqa.g + Jsa.ha), Hra.S, aSa.V).J(Rua.s, Zra.N).J(ysa.s, ysa.s, ysa.s, ysa.s).M();
            zLa7.J((double)(zLa8.A / uqa.g + Jsa.ha), fqa.W, aSa.V).J(Rua.s, aSa.V).J(ysa.s, ysa.s, ysa.s, ysa.s).M();
            zLa7.J((double)(zLa.A / uqa.g - Jsa.ha), fqa.W, aSa.V).J(aSa.V, aSa.V).J(ysa.s, ysa.s, ysa.s, ysa.s).M();
            a22.J();
            ZLa.J((String)oha.J(UTa.w, new Object[uSa.E]), (int)(zLa.A / uqa.g), (int)xua.S, (int)pua.o);
            ZLa.J((String)oha.J(dpa.I, new Object[uSa.E]), (int)(zLa.A / uqa.g), (int)ySa.Z, (int)pua.o);
            ZLa.J((String)oha.J(Qta.Z, new Object[uSa.E]), (int)(zLa.A / uqa.g), (int)RQa.R, (int)pua.o);
            ZLa zLa10 = zLa;
            zLa.j.J((Kpa)zLa10.g, (int)c2, (int)b2);
            zLa10.e.J((Kpa)zLa.g, (int)c2, (int)b2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public String J(int n2, String string, float f2) {
        void c2;
        void b2;
        float d2 = f2;
        ZLa a2 = this;
        return new StringBuilder().insert(3 >> 2, (String)b2).append(Xpa.E).append(a2.J((int)c2, d2)).toString();
    }

    public String f() {
        ZLa a2;
        return a2.b.toString().replace(SPa.O, Mqa.y);
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4) throws IOException {
        void b2;
        void c2;
        ZLa a2;
        int d2 = n4;
        ZLa zLa = a2 = this;
        super.J((int)c2, (int)b2, d2);
        if (zLa.d == 0 && !a2.I) {
            a2.F.J((int)c2, (int)b2, d2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public ZLa(EC eC2, String string) {
        void b2;
        Object c2 = string;
        ZLa a2 = this;
        a2.A = xTa.Y;
        a2.g = opa.p;
        a2.L = yta.x;
        a2.f = new String[AQa.P];
        ZLa zLa = a2;
        ZLa zLa2 = a2;
        zLa2.M = uSa.E;
        zLa2.d = uSa.E;
        zLa2.I = uSa.E;
        ZLa zLa3 = a2;
        zLa2.i = new eMa(a2);
        zLa.E = new YY();
        zLa.k = new Random();
        zLa.C = (zNa)b2;
        a2.J((String)c2);
    }
}

