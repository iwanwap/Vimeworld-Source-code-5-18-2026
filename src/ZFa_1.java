/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Ega
 *  Gg
 *  Gl
 *  Hba
 *  JPa
 *  KZ
 *  MQa
 *  Mda
 *  NQa
 *  NTa
 *  OIa
 *  Oz
 *  QFa
 *  Qsa
 *  SIa
 *  Sqa
 *  Waa
 *  XTa
 *  YSa
 *  Yfa
 *  Ypa
 *  Yra
 *  ZFa
 *  bAa
 *  bpa
 *  dpa
 *  eAa
 *  fEa
 *  fsa
 *  gFa
 *  iea
 *  isa
 *  jFa
 *  lqa
 *  nHa
 *  oA
 *  oDa
 *  oHa
 *  pqa
 *  psa
 *  vRa
 *  wEa
 *  wra
 */
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Random;
import net.minecraft.block.Block;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ZFa_1
extends fEa {
    private cIa m;
    private final xFa C;
    private static final Map<iea, float[]> i = Maps.newEnumMap(iea.class);
    private int M;

    /*
     * WARNING - void declaration
     */
    public boolean J(Sx sx2) {
        void a2;
        ZFa_1 zFa_1 = this;
        ZFa_1 b2 = a2.K.f();
        if (b2 != null && b2.J() == Gea.ja && !zFa_1.v() && !zFa_1.Y()) {
            if (!zFa_1.j.e) {
                int n2;
                zFa_1.F(vRa.d != 0);
                int n3 = vRa.d + zFa_1.R.nextInt(yRa.d);
                int n4 = n2 = uSa.E;
                while (n4 < n3) {
                    jFa jFa2 = zFa_1.J(new Mda(eAa.J((Block)QFa.cd), vRa.d, zFa_1.J().getMetadata()), pqa.r);
                    jFa2.J(jFa2.Ea + (double)(zFa_1.R.nextFloat() * Yqa.C));
                    jFa2.f(jFa2.i + (double)((zFa_1.R.nextFloat() - zFa_1.R.nextFloat()) * Nra.e));
                    jFa2.l(jFa2.f + (double)((zFa_1.R.nextFloat() - zFa_1.R.nextFloat()) * Nra.e));
                    n4 = ++n2;
                }
            }
            b2.J(vRa.d, (Gl)a2);
            zFa_1.J(tpa.m, pqa.r, pqa.r);
        }
        return super.J((Sx)a2);
    }

    public ZFa_1(Gg gg2) {
        ZFa_1 a2;
        ZFa_1 b2 = gg2;
        ZFa_1 zFa_1 = a2 = this;
        super((Gg)b2);
        ZFa_1 zFa_12 = a2;
        zFa_1.C = new xFa((Ega)new oDa((ZFa)a2), uqa.g, vRa.d);
        zFa_12.m = new cIa((Yfa)a2);
        zFa_1.l(ATa.r, Jsa.Z);
        ((Hba)zFa_1.J()).J(vRa.d != 0);
        ZFa_1 zFa_13 = a2;
        zFa_13.D.J(uSa.E, (gFa)new oHa((Yfa)a2));
        zFa_13.D.J(vRa.d, (gFa)new nfa((bga)((Object)a2), Qpa.Aa));
        zFa_13.D.J(uqa.g, (gFa)new Pia(a2, oua.i));
        zFa_13.D.J(yRa.d, (gFa)new OIa((bga)((Object)a2), Yra.f, Gea.DC, uSa.E != 0));
        zFa_13.D.J(AQa.P, (gFa)new AIa(a2, Yra.f));
        zFa_13.D.J(tTa.h, (gFa)a2.m);
        zFa_13.D.J(uua.p, (gFa)new HDa((bga)((Object)a2), oua.i));
        zFa_13.D.J(XTa.W, (gFa)new nHa((Yfa)a2, Sx.class, lqa.ga));
        zFa_13.D.J(Yqa.i, (gFa)new SIa((Yfa)a2));
        zFa_13.C.J(uSa.E, new Mda(Gea.Q, vRa.d, uSa.E));
        zFa_13.C.J(vRa.d, new Mda(Gea.Q, vRa.d, uSa.E));
    }

    public boolean v() {
        ZFa_1 a2;
        if ((a2.aa.J(ERa.C) & ERa.C) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public float C(float f2) {
        float b2 = f2;
        ZFa_1 a2 = this;
        if (a2.M > AQa.P && a2.M <= Qsa.Ha) {
            b2 = ((float)(a2.M - AQa.P) - b2) / Ura.m;
            return vRa.Aa + psa.U * Oz.d((float)(b2 * dpa.o));
        }
        if (a2.M > 0) {
            return vRa.Aa;
        }
        return a2.d / zpa.Z;
    }

    public void J(boolean bl, int n2) {
        int c2 = n2;
        ZFa_1 a2 = this;
        if (!a2.v()) {
            a2.J(new Mda(eAa.J((Block)QFa.cd), vRa.d, a2.J().getMetadata()), JPa.N);
        }
        int b2 = a2.R.nextInt(uqa.g) + vRa.d + a2.R.nextInt(vRa.d + c2);
        int n3 = c2 = uSa.E;
        while (n3 < b2) {
            if (a2.o()) {
                a2.J(Gea.JA, vRa.d);
            } else {
                a2.J(Gea.v, vRa.d);
            }
            n3 = ++c2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(iea iea2) {
        void a2;
        ZFa_1 zFa_1;
        ZFa_1 zFa_12 = zFa_1 = this;
        byte b2 = zFa_12.aa.J(ERa.C);
        zFa_12.aa.J(ERa.C, Byte.valueOf((byte)(b2 & YSa.c | a2.getMetadata() & Ypa.A)));
    }

    static {
        float[] fArray = new float[yRa.d];
        fArray[uSa.E] = pqa.r;
        fArray[vRa.d] = pqa.r;
        fArray[uqa.g] = pqa.r;
        i.put(iea.WHITE, fArray);
        float[] fArray2 = new float[yRa.d];
        fArray2[uSa.E] = Sqa.g;
        fArray2[vRa.d] = MQa.L;
        fArray2[uqa.g] = psa.N;
        i.put(iea.ORANGE, fArray2);
        float[] fArray3 = new float[yRa.d];
        fArray3[uSa.E] = ZSa.q;
        fArray3[vRa.d] = bpa.K;
        fArray3[uqa.g] = Sqa.g;
        i.put(iea.MAGENTA, fArray3);
        float[] fArray4 = new float[yRa.d];
        fArray4[uSa.E] = Xpa.R;
        fArray4[vRa.d] = Ora.D;
        fArray4[uqa.g] = Sqa.g;
        i.put(iea.LIGHT_BLUE, fArray4);
        float[] fArray5 = new float[yRa.d];
        fArray5[uSa.E] = ATa.r;
        fArray5[vRa.d] = ATa.r;
        fArray5[uqa.g] = psa.N;
        i.put(iea.YELLOW, fArray5);
        float[] fArray6 = new float[yRa.d];
        fArray6[uSa.E] = MQa.L;
        fArray6[vRa.d] = xSa.la;
        fArray6[uqa.g] = Nra.e;
        i.put(iea.LIME, fArray6);
        float[] fArray7 = new float[yRa.d];
        fArray7[uSa.E] = fsa.Ia;
        fArray7[vRa.d] = MQa.L;
        fArray7[uqa.g] = pta.d;
        i.put(iea.PINK, fArray7);
        float[] fArray8 = new float[yRa.d];
        fArray8[uSa.E] = bpa.K;
        fArray8[vRa.d] = bpa.K;
        fArray8[uqa.g] = bpa.K;
        i.put(iea.GRAY, fArray8);
        float[] fArray9 = new float[yRa.d];
        fArray9[uSa.E] = Ora.D;
        fArray9[vRa.d] = Ora.D;
        fArray9[uqa.g] = Ora.D;
        i.put(iea.SILVER, fArray9);
        float[] fArray10 = new float[yRa.d];
        fArray10[uSa.E] = bpa.K;
        fArray10[vRa.d] = MQa.L;
        fArray10[uqa.g] = Ora.D;
        i.put(iea.CYAN, fArray10);
        float[] fArray11 = new float[yRa.d];
        fArray11[uSa.E] = MQa.L;
        fArray11[vRa.d] = rta.o;
        fArray11[uqa.g] = ZSa.q;
        i.put(iea.PURPLE, fArray11);
        float[] fArray12 = new float[yRa.d];
        fArray12[uSa.E] = psa.N;
        fArray12[vRa.d] = bpa.K;
        fArray12[uqa.g] = ZSa.q;
        i.put(iea.BLUE, fArray12);
        float[] fArray13 = new float[yRa.d];
        fArray13[uSa.E] = Xpa.R;
        fArray13[vRa.d] = bpa.K;
        fArray13[uqa.g] = psa.N;
        i.put(iea.BROWN, fArray13);
        float[] fArray14 = new float[yRa.d];
        fArray14[uSa.E] = Xpa.R;
        fArray14[vRa.d] = MQa.L;
        fArray14[uqa.g] = psa.N;
        i.put(iea.GREEN, fArray14);
        float[] fArray15 = new float[yRa.d];
        fArray15[uSa.E] = Ora.D;
        fArray15[vRa.d] = psa.N;
        fArray15[uqa.g] = psa.N;
        i.put(iea.RED, fArray15);
        float[] fArray16 = new float[yRa.d];
        fArray16[uSa.E] = Nra.e;
        fArray16[vRa.d] = Nra.e;
        fArray16[uqa.g] = Nra.e;
        i.put(iea.BLACK, fArray16);
    }

    public void w() {
        ZFa_1 a2;
        ZFa_1 zFa_1 = a2;
        zFa_1.F(uSa.E != 0);
        if (zFa_1.Y()) {
            a2.G(Psa.M);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void F(boolean bl) {
        void a2;
        ZFa_1 zFa_1 = this;
        byte b2 = zFa_1.aa.J(ERa.C);
        if (a2 != false) {
            zFa_1.aa.J(ERa.C, Byte.valueOf((byte)(b2 | ERa.C)));
            return;
        }
        zFa_1.aa.J(ERa.C, Byte.valueOf((byte)(b2 & NQa.A)));
    }

    /*
     * WARNING - void declaration
     */
    private iea J(fEa fEa2, fEa fEa3) {
        int n2;
        int n3;
        void a22;
        ZFa_1 c2 = fEa2;
        ZFa_1 b2 = this;
        int n4 = c2.J().getDyeDamage();
        int a22 = ((ZFa_1)a22).J().getDyeDamage();
        ZFa_1 zFa_1 = b2;
        zFa_1.C.J(uSa.E).J(n4);
        zFa_1.C.J(vRa.d).J(a22);
        c2 = bAa.J().J(b2.C, c2.j);
        return iea.byDyeDamage((int)(c2 != null && c2.J() == Gea.Q ? (n3 = c2.J()) : (n2 = b2.j.v.nextBoolean() ? n4 : a22)));
    }

    public String i() {
        return isa.w;
    }

    public float l(float f2) {
        float b2 = f2;
        ZFa_1 a2 = this;
        if (a2.M <= 0) {
            return JPa.N;
        }
        if (a2.M >= AQa.P && a2.M <= Qsa.Ha) {
            return pqa.r;
        }
        if (a2.M < AQa.P) {
            return ((float)a2.M - b2) / YSa.G;
        }
        return -((float)(a2.M - wra.P) - b2) / YSa.G;
    }

    public void y() {
        ZFa_1 a2;
        if (a2.j.e) {
            a2.M = Math.max(uSa.E, a2.M - vRa.d);
        }
        super.y();
    }

    public void J(XF xF, Block block) {
        Object c2 = block;
        ZFa_1 a2 = this;
        a2.J(Gta.L, VPa.i, pqa.r);
    }

    public float l() {
        ZFa_1 a2;
        return fsa.Ia * a2.u;
    }

    public void r() {
        ZFa_1 a2;
        ZFa_1 zFa_1 = a2;
        zFa_1.M = zFa_1.m.f();
        super.r();
    }

    public void J(Waa waa2) {
        ZFa_1 a2;
        ZFa_1 b2 = waa2;
        ZFa_1 zFa_1 = a2 = this;
        ZFa_1 zFa_12 = b2;
        super.J((Waa)zFa_12);
        zFa_1.F(zFa_12.f(Sqa.i));
        zFa_1.J(iea.byMetadata((int)b2.J(JPa.ca)));
    }

    public static float[] J(iea a2) {
        return i.get(a2);
    }

    public static iea J(Random random) {
        Random random2 = random;
        int a2 = random2.nextInt(ySa.T);
        if (a2 < tTa.h) {
            return iea.BLACK;
        }
        if (a2 < NTa.C) {
            return iea.GRAY;
        }
        if (a2 < Ypa.A) {
            return iea.SILVER;
        }
        if (a2 < yOa.B) {
            return iea.BROWN;
        }
        if (random2.nextInt(dsa.f) == 0) {
            return iea.PINK;
        }
        return iea.WHITE;
    }

    public iea J() {
        ZFa_1 a2;
        return iea.byMetadata((int)(a2.aa.J(ERa.C) & Ypa.A));
    }

    public eAa J() {
        return eAa.J((Block)QFa.cd);
    }

    public void J(byte by2) {
        byte b2 = by2;
        ZFa_1 a2 = this;
        if (b2 == NTa.C) {
            a2.M = wra.P;
            return;
        }
        super.J(b2);
    }

    /*
     * WARNING - void declaration
     */
    public oA J(KZ kZ, oA oA2) {
        void b2;
        ZFa_1 a2;
        ZFa_1 c2 = oA2;
        ZFa_1 zFa_1 = a2 = this;
        c2 = super.J((KZ)b2, (oA)c2);
        zFa_1.J(ZFa_1.J(zFa_1.j.v));
        return c2;
    }

    public void J() {
        ZFa_1 a2;
        ZFa_1 zFa_1 = a2;
        super.J();
        zFa_1.aa.f(ERa.C, new Byte((byte)uSa.E));
    }

    public String f() {
        return isa.w;
    }

    public ZFa J(wEa wEa2) {
        ZFa_1 b2 = wEa2;
        ZFa_1 a2 = this;
        ZFa_1 zFa_1 = new ZFa_1(a2.j);
        ZFa_1 zFa_12 = a2;
        zFa_1.J(zFa_12.J(zFa_12, b2));
        return zFa_1;
    }

    public void f(Waa waa2) {
        ZFa_1 b2 = waa2;
        ZFa_1 a2 = this;
        ZFa_1 zFa_1 = b2;
        super.f((Waa)zFa_1);
        zFa_1.J(Sqa.i, a2.v());
        zFa_1.J(JPa.ca, (byte)a2.J().getMetadata());
    }

    public void s() {
        ZFa_1 a2;
        ZFa_1 zFa_1 = a2;
        super.s();
        zFa_1.J(Kha.M).J(Wqa.Z);
        zFa_1.J(Kha.j).J(Qpa.o);
    }

    public String A() {
        return isa.w;
    }
}

