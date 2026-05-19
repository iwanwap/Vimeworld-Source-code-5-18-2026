/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ala
 *  ERa
 *  I
 *  PLa
 *  XTa
 *  vRa
 */
import java.util.BitSet;
import net.minecraft.block.Block;

public final class PLa_1 {
    private final int[] J;
    private static final String A = "CL_00002515";
    private final float[] I = new float[AQa.P];

    public static /* synthetic */ float[] J(PLa a2) {
        return a2.I;
    }

    /*
     * WARNING - void declaration
     */
    public void J(I i2, Block block, XF xF, DZ dZ2, float[] fArray, BitSet bitSet) {
        void v11;
        int n2;
        float f2;
        boolean bl;
        int n3;
        float f3;
        boolean bl2;
        int n4;
        float f4;
        boolean bl3;
        int n5;
        float f5;
        void f222;
        UKa e2;
        void c22;
        void d22;
        void a22;
        PLa_1 pLa_1 = this;
        void var7_17 = a22.get(uSa.E) ? d22.offset((DZ)c22) : d22;
        PLa_1 g22 = Ala.getNeighbourInfo((DZ)c22);
        void v0 = var7_17;
        XF xF2 = v0.offset(((Ala)g22).field_178276_g[uSa.E]);
        XF xF3 = v0.offset(((Ala)g22).field_178276_g[vRa.d]);
        XF xF4 = v0.offset(((Ala)g22).field_178276_g[uqa.g]);
        XF xF5 = v0.offset(((Ala)g22).field_178276_g[yRa.d]);
        void v1 = e2;
        void v2 = f222;
        void v3 = e2;
        int n6 = v3.f((I)f222, xF2);
        int n7 = v3.f((I)f222, xF3);
        int n8 = v1.f((I)v2, xF4);
        int n9 = v1.f((I)v2, xF5);
        void v4 = f222;
        void v5 = f222;
        void v6 = f222;
        void v7 = f222;
        float f6 = Kja.J(v7.J(xF2).J().J());
        float f7 = Kja.J(v7.J(xF3).J().J());
        float f8 = Kja.J(v6.J(xF4).J().J());
        float f9 = Kja.J(v6.J(xF5).J().J());
        boolean bl4 = v5.J(xF2.offset((DZ)c22)).J().i();
        boolean bl5 = v5.J(xF3.offset((DZ)c22)).J().i();
        boolean bl6 = v4.J(xF4.offset((DZ)c22)).J().i();
        boolean bl7 = v4.J(xF5.offset((DZ)c22)).J().i();
        if (!bl6 && !bl4) {
            f5 = f6;
            n5 = n6;
            bl3 = bl7;
        } else {
            XF xF6 = xF2.offset(((Ala)g22).field_178276_g[uqa.g]);
            f5 = Kja.J(f222.J(xF6).J().J());
            n5 = ((Block)((Object)e2)).f((I)f222, xF6);
            bl3 = bl7;
        }
        if (!bl3 && !bl4) {
            f4 = f6;
            n4 = n6;
            bl2 = bl6;
        } else {
            XF xF7 = xF2.offset(((Ala)g22).field_178276_g[yRa.d]);
            f4 = Kja.J(f222.J(xF7).J().J());
            n4 = ((Block)((Object)e2)).f((I)f222, xF7);
            bl2 = bl6;
        }
        if (!bl2 && !bl5) {
            f3 = f7;
            n3 = n7;
            bl = bl7;
        } else {
            XF xF8 = xF3.offset(((Ala)g22).field_178276_g[uqa.g]);
            f3 = Kja.J(f222.J(xF8).J().J());
            n3 = ((Block)((Object)e2)).f((I)f222, xF8);
            bl = bl7;
        }
        if (!bl && !bl5) {
            f2 = f7;
            n2 = n7;
            v11 = e2;
        } else {
            XF xF9 = xF3.offset(((Ala)g22).field_178276_g[yRa.d]);
            v11 = e2;
            f2 = Kja.J(f222.J(xF9).J().J());
            n2 = ((Block)((Object)e2)).f((I)f222, xF9);
        }
        int n10 = v11.f((I)f222, (XF)d22);
        if (a22.get(uSa.E) || !f222.J(d22.offset((DZ)c22)).J().g()) {
            n10 = ((Block)((Object)e2)).f((I)f222, d22.offset((DZ)c22));
        }
        void v12 = f222;
        float f222 = a22.get(uSa.E) ? v12.J((XF)var7_17).J().J() : v12.J((XF)d22).J().J();
        f222 = Kja.J(f222);
        e2 = UKa.getVertexTranslations((DZ)c22);
        if (a22.get(vRa.d) && ((Ala)g22).field_178289_i) {
            void b2;
            float d22 = (f9 + f6 + f4 + f222) * rta.o;
            float c22 = (f8 + f6 + f5 + f222) * rta.o;
            float a22 = (f8 + f7 + f3 + f222) * rta.o;
            float f10 = (f9 + f7 + f2 + f222) * rta.o;
            void v13 = b2;
            PLa_1 pLa_12 = g22;
            void var9_21 = v13[((Ala)g22).field_178286_j[uSa.E].field_178229_m] * b2[((Ala)pLa_12).field_178286_j[vRa.d].field_178229_m];
            PLa_1 pLa_13 = g22;
            void var10_23 = v13[((Ala)pLa_12).field_178286_j[uqa.g].field_178229_m] * b2[((Ala)pLa_13).field_178286_j[yRa.d].field_178229_m];
            PLa_1 pLa_14 = g22;
            void var19_35 = v13[((Ala)pLa_13).field_178286_j[AQa.P].field_178229_m] * b2[((Ala)pLa_14).field_178286_j[tTa.h].field_178229_m];
            PLa_1 pLa_15 = g22;
            void var20_37 = v13[((Ala)pLa_14).field_178286_j[uua.p].field_178229_m] * b2[((Ala)pLa_15).field_178286_j[XTa.W].field_178229_m];
            PLa_1 pLa_16 = g22;
            void var21_39 = v13[((Ala)pLa_15).field_178287_k[uSa.E].field_178229_m] * b2[((Ala)pLa_16).field_178287_k[vRa.d].field_178229_m];
            PLa_1 pLa_17 = g22;
            void var22_41 = v13[((Ala)pLa_16).field_178287_k[uqa.g].field_178229_m] * b2[((Ala)pLa_17).field_178287_k[yRa.d].field_178229_m];
            PLa_1 pLa_18 = g22;
            void var32_55 = v13[((Ala)pLa_17).field_178287_k[AQa.P].field_178229_m] * b2[((Ala)pLa_18).field_178287_k[tTa.h].field_178229_m];
            PLa_1 pLa_19 = g22;
            void var33_56 = v13[((Ala)pLa_18).field_178287_k[uua.p].field_178229_m] * b2[((Ala)pLa_19).field_178287_k[XTa.W].field_178229_m];
            PLa_1 pLa_110 = g22;
            void var34_57 = v13[((Ala)pLa_19).field_178284_l[uSa.E].field_178229_m] * b2[((Ala)pLa_110).field_178284_l[vRa.d].field_178229_m];
            PLa_1 pLa_111 = g22;
            void var35_58 = v13[((Ala)pLa_110).field_178284_l[uqa.g].field_178229_m] * b2[((Ala)pLa_111).field_178284_l[yRa.d].field_178229_m];
            PLa_1 pLa_112 = g22;
            void var36_59 = v13[((Ala)pLa_111).field_178284_l[AQa.P].field_178229_m] * b2[((Ala)pLa_112).field_178284_l[tTa.h].field_178229_m];
            PLa_1 pLa_113 = g22;
            void var37_60 = v13[((Ala)pLa_112).field_178284_l[uua.p].field_178229_m] * b2[((Ala)pLa_113).field_178284_l[XTa.W].field_178229_m];
            PLa_1 pLa_114 = g22;
            void var38_61 = v13[((Ala)pLa_113).field_178285_m[uSa.E].field_178229_m] * b2[((Ala)pLa_114).field_178285_m[vRa.d].field_178229_m];
            PLa_1 pLa_115 = g22;
            void var39_62 = v13[((Ala)pLa_114).field_178285_m[uqa.g].field_178229_m] * b2[((Ala)pLa_115).field_178285_m[yRa.d].field_178229_m];
            PLa_1 pLa_116 = g22;
            void var40_63 = v13[((Ala)pLa_115).field_178285_m[AQa.P].field_178229_m] * b2[((Ala)pLa_116).field_178285_m[tTa.h].field_178229_m];
            b2 = v13[((Ala)pLa_116).field_178285_m[uua.p].field_178229_m] * b2[((Ala)g22).field_178285_m[XTa.W].field_178229_m];
            PLa_1 pLa_117 = pLa_1;
            PLa_1 pLa_118 = pLa_1;
            PLa_1 pLa_119 = pLa_1;
            PLa_1 pLa_120 = pLa_1;
            pLa_120.I[UKa.access$200((UKa)e2)] = d22 * var9_21 + c22 * var10_23 + a22 * var19_35 + f10 * var20_37;
            pLa_120.I[UKa.access$300((UKa)e2)] = d22 * var21_39 + c22 * var22_41 + a22 * var32_55 + f10 * var33_56;
            pLa_120.I[UKa.access$400((UKa)e2)] = d22 * var34_57 + c22 * var35_58 + a22 * var36_59 + f10 * var37_60;
            pLa_119.I[UKa.access$500((UKa)e2)] = d22 * var38_61 + c22 * var39_62 + a22 * var40_63 + f10 * b2;
            int g22 = pLa_118.J(n9, n6, n4, n10);
            int n11 = pLa_119.J(n8, n6, n5, n10);
            int n12 = pLa_118.J(n8, n7, n3, n10);
            int n13 = pLa_118.J(n9, n7, n2, n10);
            pLa_117.J[UKa.access$200((UKa)e2)] = pLa_1.J(g22, n11, n12, n13, (float)var9_21, (float)var10_23, (float)var19_35, (float)var20_37);
            pLa_117.J[UKa.access$300((UKa)e2)] = pLa_1.J(g22, n11, n12, n13, (float)var21_39, (float)var22_41, (float)var32_55, (float)var33_56);
            pLa_117.J[UKa.access$400((UKa)e2)] = pLa_1.J(g22, n11, n12, n13, (float)var34_57, (float)var35_58, (float)var36_59, (float)var37_60);
            pLa_117.J[UKa.access$500((UKa)e2)] = pLa_1.J(g22, n11, n12, n13, (float)var38_61, (float)var39_62, (float)var40_63, (float)b2);
            return;
        }
        float d22 = (f9 + f6 + f4 + f222) * rta.o;
        float c22 = (f8 + f6 + f5 + f222) * rta.o;
        float a22 = (f8 + f7 + f3 + f222) * rta.o;
        float f11 = (f9 + f7 + f2 + f222) * rta.o;
        PLa_1 pLa_121 = pLa_1;
        pLa_121.J[UKa.access$200((UKa)e2)] = pLa_1.J(n9, n6, n4, n10);
        PLa_1 pLa_122 = pLa_1;
        pLa_121.J[UKa.access$300((UKa)e2)] = pLa_122.J(n8, n6, n5, n10);
        pLa_122.J[UKa.access$400((UKa)e2)] = pLa_1.J(n8, n7, n3, n10);
        pLa_121.J[UKa.access$500((UKa)e2)] = pLa_1.J(n9, n7, n2, n10);
        pLa_121.I[UKa.access$200((UKa)e2)] = d22;
        pLa_121.I[UKa.access$300((UKa)e2)] = c22;
        pLa_121.I[UKa.access$400((UKa)e2)] = a22;
        pLa_121.I[UKa.access$500((UKa)e2)] = f11;
    }

    /*
     * WARNING - void declaration
     */
    private int J(int n2, int n3, int n4, int n5) {
        void b2;
        void c2;
        void e2;
        void d2;
        int n6 = n5;
        PLa_1 a2 = this;
        if (d2 == false) {
            d2 = e2;
        }
        if (c2 == false) {
            c2 = e2;
        }
        if (b2 == false) {
            b2 = e2;
        }
        return d2 + c2 + b2 + e2 >> uqa.g & IPa.r;
    }

    public static /* synthetic */ int[] J(PLa a2) {
        return a2.J;
    }

    /*
     * WARNING - void declaration
     */
    private int J(int n2, int n3, int n4, int n5, float f2, float f3, float f4, float f5) {
        void a2;
        void e2;
        void b2;
        void f6;
        void c2;
        void g2;
        void d2;
        int i2 = n2;
        PLa_1 h = this;
        int n6 = (int)((float)(i2 >> ERa.C & osa.Ja) * d2 + (float)(g2 >> ERa.C & osa.Ja) * c2 + (float)(f6 >> ERa.C & osa.Ja) * b2 + (float)(e2 >> ERa.C & osa.Ja) * a2) & osa.Ja;
        i2 = (int)((float)(i2 & osa.Ja) * d2 + (float)(g2 & osa.Ja) * c2 + (float)(f6 & osa.Ja) * b2 + (float)(e2 & osa.Ja) * a2) & osa.Ja;
        return n6 << ERa.C | i2;
    }

    public PLa_1() {
        PLa_1 a2;
        a2.J = new int[AQa.P];
    }
}

