/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ama
 *  Bpa
 *  ERa
 *  Ega
 *  FPa
 *  GEa
 *  Gg
 *  ISa
 *  JPa
 *  JQa
 *  JTa
 *  Kna
 *  Kpa
 *  Mda
 *  Oz
 *  Ppa
 *  SQa
 *  Uqa
 *  XTa
 *  YSa
 *  Ypa
 *  Zta
 *  bpa
 *  bqa
 *  cQa
 *  hTa
 *  jRa
 *  kPa
 *  kea
 *  lqa
 *  mX
 *  nLa
 *  pY
 *  pqa
 *  psa
 *  sMa
 *  uKa
 *  vPa
 *  vRa
 *  wOa
 *  wga
 */
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import net.minecraft.client.model.ModelBook;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.util.glu.Project;

public final class fma
extends Ama {
    public Mda D;
    public int f;
    private static final ResourceLocation F;
    private Random g;
    private static final ResourceLocation L;
    public float E;
    public float m;
    public float C;
    public float i;
    private final kea M;
    public float k;
    private final fc j;
    private static final ModelBook J;
    public float A;
    private GEa I;

    public void l() {
        fma a2;
        fma fma2 = a2;
        super.l();
        fma2.J();
    }

    /*
     * WARNING - void declaration
     */
    public fma(kea kea2, Gg gg2, fc fc2) {
        void a2;
        void b2;
        fma c2;
        fma d2 = kea2;
        fma fma2 = c2 = this;
        super((Ega)new GEa((kea)d2, (Gg)b2));
        c2.g = new Random();
        fma2.M = d2;
        fma2.I = c2.I;
        c2.j = a2;
    }

    /*
     * Unable to fully structure code
     */
    public void J() {
        var1_3 = this;
        a = var1_3.I.J(uSa.E).J();
        if (!Mda.J((Mda)a, (Mda)var1_3.D)) {
            var1_3.D = a;
            do {
                v0 = var1_3;
                v0.A += (float)(var1_3.g.nextInt(AQa.P) - var1_3.g.nextInt(AQa.P));
                if (v0.E > var1_3.A + pqa.r) ** break block7
                v1 = var1_3;
            } while (!(v1.E < v1.A - pqa.r));
            v2 = var1_3;
        } else {
            v2 = var1_3;
        }
        v2.f += vRa.d;
        v3 = var1_3;
        v3.C = v3.E;
        v3.k = v3.i;
        a = uSa.E;
        v4 = var2_4 = uSa.E;
        while (v4 < yRa.d) {
            if (var1_3.I.J[var2_4] != 0) {
                a = vRa.d;
            }
            v4 = ++var2_4;
        }
        v5 = var1_3;
        if (a != 0) {
            v5.i += psa.N;
            v6 = var1_3;
        } else {
            v5.i -= psa.N;
            v6 = var1_3;
        }
        v6.i = Oz.J((float)var1_3.i, (float)JPa.N, (float)pqa.r);
        v7 = var1_3;
        v8 = var1_3;
        var2_5 = (v7.A - v8.E) * Xpa.R;
        a = psa.N;
        var2_5 = Oz.J((float)var2_5, (float)(-a), (float)a);
        v7.m += (var2_5 - var1_3.m) * ATa.r;
        v8.E += var1_3.m;
    }

    /*
     * WARNING - void declaration
     */
    public void J(float f2, int n2, int n3) {
        float c232;
        fma fma2 = this;
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        fma fma3 = fma2;
        fma3.g.J().J(L);
        fma fma4 = fma2;
        float f3 = (fma3.A - fma4.j) / uqa.g;
        reference var5_9 = (fma4.I - fma2.F) / uqa.g;
        fma fma5 = fma2;
        fma3.f((int)f3, (int)var5_9, uSa.E, uSa.E, (int)fma5.j, (int)fma5.F);
        uKa.e();
        uKa.G((int)WPa.s);
        uKa.e();
        uKa.y();
        fma d232 = new sMa((Kpa)fma2.g);
        uKa.f((int)((d232.f() - cQa.Z) / uqa.g * d232.l()), (int)((d232.J() - YSa.c) / uqa.g * d232.l()), (int)(cQa.Z * d232.l()), (int)(YSa.c * d232.l()));
        uKa.J((float)tSa.Aa, (float)Zta.Da, (float)JPa.N);
        Project.gluPerspective(ISa.a, jRa.J, kPa.S, KSa.z);
        float d232 = pqa.r;
        uKa.G((int)SQa.ca);
        uKa.y();
        nLa.f();
        uKa.J((float)JPa.N, (float)hTa.w, (float)FRa.B);
        float f4 = d232;
        uKa.l((float)f4, (float)f4, (float)f4);
        float f5 = eua.C;
        uKa.l((float)f5, (float)f5, (float)f5);
        uKa.J((float)Hra.Ga, (float)JPa.N, (float)JPa.N, (float)pqa.r);
        fma3.g.J().J(F);
        uKa.J((float)eta.e, (float)pqa.r, (float)JPa.N, (float)JPa.N);
        fma fma6 = fma2;
        d232 = fma3.k + (fma6.i - fma6.k) * c232;
        uKa.J((float)((pqa.r - d232) * psa.N), (float)((pqa.r - d232) * Nra.e), (float)((pqa.r - d232) * rta.o));
        uKa.J((float)(-(pqa.r - d232) * ISa.a - ISa.a), (float)JPa.N, (float)pqa.r, (float)JPa.N);
        uKa.J((float)Hra.Ga, (float)pqa.r, (float)JPa.N, (float)JPa.N);
        fma fma7 = fma2;
        float f6 = fma3.C + (fma7.E - fma7.C) * c232 + rta.o;
        fma fma8 = fma2;
        c232 = fma3.C + (fma8.E - fma8.C) * c232 + wOa.w;
        float f7 = f6;
        f6 = (f7 - (float)Oz.C((double)f7)) * ySa.Da - bpa.K;
        float f8 = c232;
        c232 = (f8 - (float)Oz.C((double)f8)) * ySa.Da - bpa.K;
        if (f6 < JPa.N) {
            f6 = JPa.N;
        }
        if (c232 < JPa.N) {
            c232 = JPa.N;
        }
        if (f6 > pqa.r) {
            f6 = pqa.r;
        }
        if (c232 > pqa.r) {
            c232 = pqa.r;
        }
        uKa.o();
        J.J(null, JPa.N, f6, c232, d232, JPa.N, rRa.T);
        uKa.E();
        nLa.C();
        uKa.G((int)WPa.s);
        uKa.f((int)uSa.E, (int)uSa.E, (int)((Kpa)fma2.g).t, (int)((Kpa)fma2.g).k);
        uKa.D();
        uKa.G((int)SQa.ca);
        uKa.D();
        nLa.C();
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        mX.J().J((long)fma2.I.i);
        int c232 = fma2.I.J();
        int n4 = d232 = uSa.E;
        while (n4 < yRa.d) {
            float f9 = f3 + Psa.M;
            float f10 = f9 + kTa.j;
            int n5 = Bra.C;
            String string = mX.J().J();
            fma fma9 = fma2;
            fma9.I = (GEa)JPa.N;
            fma9.g.J().J(L);
            int n6 = fma9.I.J[d232];
            uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
            if (n6 == 0) {
                fma2.f((int)f9, (int)(var5_9 + hpa.Z + wOa.t * d232), uSa.E, cQa.q, Jra.o, wOa.t);
            } else {
                fma fma10;
                String string2 = new StringBuilder().insert(3 >> 2, Mqa.y).append(n6).toString();
                Kna kna2 = ((Kpa)fma2.g).xa;
                int n7 = Bpa.S;
                if (!(c232 >= d232 + vRa.d && ((Kpa)fma2.g).c.j >= n6 || ((Kpa)fma2.g).c.h.f())) {
                    fma fma11 = fma2;
                    fma10 = fma11;
                    float f11 = f9;
                    fma2.f((int)f11, (int)(var5_9 + hpa.Z + wOa.t * d232), uSa.E, cQa.q, Jra.o, wOa.t);
                    fma11.f((int)(f11 + vRa.d), (int)(var5_9 + Ypa.A + wOa.t * d232), ERa.C * d232, fPa.b, ERa.C, ERa.C);
                    kna2.J(string, (int)f10, (int)(var5_9 + ERa.C + wOa.t * d232), n5, (n7 & Psa.P) >> vRa.d);
                    n7 = bqa.o;
                } else {
                    fma fma12;
                    void a2;
                    void b2;
                    n6 = b2 - (f3 + Psa.M);
                    void var15_19 = a2 - (var5_9 + hpa.Z + wOa.t * d232);
                    if (n6 >= 0 && var15_19 >= 0 && n6 < Jra.o && var15_19 < wOa.t) {
                        fma fma13 = fma2;
                        fma12 = fma13;
                        fma13.f((int)f9, (int)(var5_9 + hpa.Z + wOa.t * d232), uSa.E, zOa.a, Jra.o, wOa.t);
                        n7 = FPa.U;
                    } else {
                        fma fma14 = fma2;
                        fma12 = fma14;
                        fma14.f((int)f9, (int)(var5_9 + hpa.Z + wOa.t * d232), uSa.E, UTa.R, Jra.o, wOa.t);
                    }
                    fma12.f((int)(f9 + vRa.d), (int)(var5_9 + Ypa.A + wOa.t * d232), ERa.C * d232, sqa.e, ERa.C, ERa.C);
                    fma10 = fma2;
                    kna2.J(string, (int)f10, (int)(var5_9 + ERa.C + wOa.t * d232), n5, n7);
                    n7 = JQa.c;
                }
                Kna kna3 = kna2 = ((Kpa)fma10.g).Ea;
                kna3.J(string2, f10 + Bra.C - kna3.J(string2), (float)(var5_9 + ERa.C + wOa.t * d232 + XTa.W), n7);
            }
            n4 = ++d232;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4) throws IOException {
        int d2;
        float a2;
        void b2;
        void c2;
        fma fma2;
        fma fma3 = fma2 = this;
        super.J((int)c2, (int)b2, (int)a2);
        fma fma4 = fma2;
        a2 = (fma3.A - fma4.j) / uqa.g;
        reference var4_6 = (fma4.I - fma2.F) / uqa.g;
        int n5 = d2 = uSa.E;
        while (n5 < yRa.d) {
            void var6_7 = c2 - (a2 + Psa.M);
            void var7_8 = b2 - (var4_6 + hpa.Z + wOa.t * d2);
            if (var6_7 >= 0 && var7_8 >= 0 && var6_7 < Jra.o && var7_8 < wOa.t) {
                fma fma5 = fma2;
                if (fma5.I.J((Sx)((Kpa)fma5.g).c, d2)) {
                    ((Kpa)fma2.g).L.J(fma2.I.k, d2);
                }
            }
            n5 = ++d2;
        }
    }

    public void J(int n2, int n3) {
        fma a2;
        int c2 = n3;
        fma fma2 = a2 = this;
        fma2.L.J(fma2.j.J().f(), lqa.s, tTa.h, tpa.i);
        fma fma3 = a2;
        fma3.L.J(fma3.M.J().f(), Yqa.i, (int)(a2.F - zua.m + uqa.g), tpa.i);
    }

    static {
        L = new ResourceLocation(Zta.y);
        F = new ResourceLocation(vPa.T);
        J = new ModelBook();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public void J(int n2, int n3, float f2) {
        fma fma2;
        ArrayList<String> arrayList;
        int n4;
        void a22;
        void b2;
        void c2;
        fma fma3;
        fma fma4 = fma3 = this;
        super.J((int)c2, (int)b2, (float)a22);
        boolean a22 = ((Kpa)fma4.g).c.h.f();
        int n5 = fma4.I.J();
        int n6 = n4 = uSa.E;
        while (true) {
            if (n6 >= yRa.d) {
                return;
            }
            fma fma5 = fma3;
            int n7 = fma5.I.J[n4];
            int n8 = fma5.I.k[n4];
            int n9 = n4 + vRa.d;
            if (fma5.J(Psa.M, hpa.Z + wOa.t * n4, Jra.o, yta.Ka, (int)c2, (int)b2) && n7 > 0 && n8 >= 0) {
                arrayList = Lists.newArrayList();
                if (n8 >= 0 && wga.J((int)(n8 & osa.Ja)) != null) {
                    String d2 = wga.J((int)(n8 & osa.Ja)).J((n8 & Uqa.Q) >> Yqa.i);
                    Object[] objectArray = new Object[vRa.d];
                    objectArray[uSa.E] = d2;
                    arrayList.add(pY.WHITE.toString() + pY.ITALIC.toString() + oha.J(Ppa.F, objectArray));
                }
                if (!a22) {
                    ArrayList<String> arrayList2;
                    int n10;
                    int n11;
                    if (n8 >= 0) {
                        arrayList.add(Mqa.y);
                    }
                    if (((Kpa)fma3.g).c.j < n7) {
                        fma fma6 = fma3;
                        fma2 = fma6;
                        arrayList.add(new StringBuilder().insert(5 >> 3, pY.RED.toString()).append(Asa.t).append(fma6.I.J[n4]).toString());
                        break;
                    }
                    String d2 = Mqa.y;
                    if (n9 == vRa.d) {
                        d2 = oha.J(vqa.L, new Object[uSa.E]);
                        n11 = n5;
                    } else {
                        Object[] objectArray = new Object[vRa.d];
                        objectArray[uSa.E] = n9;
                        d2 = oha.J(JTa.p, objectArray);
                        n11 = n5;
                    }
                    if (n11 >= n9) {
                        n10 = n9;
                        arrayList.add(new StringBuilder().insert(5 >> 3, pY.GRAY.toString()).append(Mqa.y).append((String)d2).toString());
                    } else {
                        arrayList.add(new StringBuilder().insert(3 ^ 3, pY.RED.toString()).append(Mqa.y).append((String)d2).toString());
                        n10 = n9;
                    }
                    if (n10 == vRa.d) {
                        d2 = oha.J(MTa.w, new Object[uSa.E]);
                        arrayList2 = arrayList;
                    } else {
                        Object[] objectArray = new Object[vRa.d];
                        objectArray[uSa.E] = n9;
                        d2 = oha.J(uua.b, objectArray);
                        arrayList2 = arrayList;
                    }
                    arrayList2.add(new StringBuilder().insert(3 & 4, pY.GRAY.toString()).append(Mqa.y).append((String)d2).toString());
                }
                fma2 = fma3;
                break;
            }
            n6 = ++n4;
        }
        fma2.J(arrayList, (int)c2, (int)b2);
    }
}

