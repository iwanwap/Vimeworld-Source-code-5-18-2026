/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  DV
 *  Gg
 *  KTa
 *  MD
 *  Waa
 *  Xv
 *  hqa
 *  pua
 *  vRa
 *  ysa
 */
import java.util.Random;

public abstract class UW_3
extends uU {
    public int scatteredFeatureSizeY;
    public int scatteredFeatureSizeX;
    public int scatteredFeatureSizeZ;
    public int field_74936_d;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public UW_3(Random random, int n2, int n3, int n4, int n5, int n6, int n7) {
        void h2;
        void e2;
        void f2;
        void g2;
        void a2;
        void b2;
        void c2;
        UW_3 d2;
        int n8 = n4;
        UW_3 uW_3 = d2 = this;
        super(uSa.E);
        d2.field_74936_d = pua.o;
        d2.scatteredFeatureSizeX = c2;
        uW_3.scatteredFeatureSizeY = b2;
        uW_3.scatteredFeatureSizeZ = a2;
        uW_3.coordBaseMode = LX.HORIZONTAL.random((Random)g2);
        switch (DV.$SwitchMap$net$minecraft$util$EnumFacing[d2.coordBaseMode.ordinal()]) {
            case 1: 
            case 2: {
                void v1 = f2;
                d2.boundingBox = new Xv((int)v1, (int)e2, (int)h2, (int)(v1 + c2 - vRa.d), (int)(e2 + b2 - vRa.d), (int)(h2 + a2 - vRa.d));
                return;
            }
        }
        void v2 = f2;
        d2.boundingBox = new Xv((int)v2, (int)e2, (int)h2, (int)(v2 + a2 - vRa.d), (int)(e2 + b2 - vRa.d), (int)(h2 + c2 - vRa.d));
    }

    @Override
    public void f(Waa waa2) {
        UW_3 b2 = waa2;
        UW_3 a2 = this;
        UW_3 uW_3 = b2;
        uW_3.J(hqa.R, a2.scatteredFeatureSizeX);
        uW_3.J(Asa.M, a2.scatteredFeatureSizeY);
        uW_3.J(gua.P, a2.scatteredFeatureSizeZ);
        uW_3.J(KTa.U, a2.field_74936_d);
    }

    public UW_3() {
        UW_3 a2;
        a2.field_74936_d = pua.o;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Xv xv2, int n2) {
        void a2;
        int n3;
        UW_3 uW_3 = this;
        if (uW_3.field_74936_d >= 0) {
            return vRa.d != 0;
        }
        int d2 = uSa.E;
        int n4 = uSa.E;
        zz zz2 = new zz();
        int n5 = n3 = uW_3.boundingBox.minZ;
        while (n5 <= uW_3.boundingBox.maxZ) {
            int n6 = uW_3.boundingBox.minX;
            while (n6 <= uW_3.boundingBox.maxX) {
                void b2;
                int n7;
                zz zz3 = zz2;
                zz3.func_181079_c(n7, ysa.s, n3);
                if (b2.J((MD)zz3)) {
                    void c2;
                    ++n4;
                    d2 += Math.max(c2.f((XF)zz2).getY(), c2.F.f());
                }
                n6 = ++n7;
            }
            n5 = ++n3;
        }
        if (n4 == 0) {
            return uSa.E != 0;
        }
        uW_3.field_74936_d = d2 / n4;
        UW_3 uW_32 = uW_3;
        uW_3.boundingBox.J(uSa.E, uW_32.field_74936_d - uW_32.boundingBox.minY + a2, uSa.E);
        return vRa.d != 0;
    }

    @Override
    public void J(Waa waa2) {
        UW_3 a2;
        UW_3 b2 = waa2;
        UW_3 uW_3 = a2 = this;
        UW_3 uW_32 = b2;
        a2.scatteredFeatureSizeX = b2.J(hqa.R);
        a2.scatteredFeatureSizeY = uW_32.J(Asa.M);
        uW_3.scatteredFeatureSizeZ = uW_32.J(gua.P);
        uW_3.field_74936_d = b2.J(KTa.U);
    }
}

