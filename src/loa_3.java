/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KA
 *  Mda
 *  NPa
 *  QFa
 *  XTa
 *  aqa
 *  cb
 *  eAa
 *  hqa
 *  hra
 *  mka
 *  nLa
 *  pKa
 *  pQa
 *  pqa
 *  pua
 *  uKa
 *  vLa
 *  vRa
 *  xx
 */
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

public final class loa_3
extends cb {
    public int j;
    public final /* synthetic */ vLa I;

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, int n5, int n6, int n7) {
        loa_3 loa_32;
        void d2;
        void e2;
        String string;
        Mda mda2;
        Object b2;
        xx c2;
        void f2;
        loa_3 loa_33;
        block5: {
            loa_3 loa_34;
            loa_3 g2;
            Block a2;
            block8: {
                block7: {
                    block6: {
                        loa_33 = this;
                        c2 = (xx)vLa.J((vLa)loa_33.I).J().get(vLa.J((vLa)loa_33.I).J().size() - f2 - vRa.d);
                        b2 = c2.J();
                        a2 = b2.J();
                        g2 = eAa.J((Block)a2);
                        mda2 = a2 != QFa.HF && g2 != null ? new Mda((eAa)g2, vRa.d, a2.f((IBlockState)b2)) : null;
                        String string2 = string = mda2 == null ? pQa.l : g2.l(mda2);
                        if (g2 != null) break block5;
                        if (a2 == QFa.sc || a2 == QFa.jd) break block6;
                        if (a2 != QFa.bb && a2 != QFa.fA) break block7;
                        loa_34 = g2 = Gea.eb;
                        break block8;
                    }
                    g2 = Gea.Ba;
                }
                loa_34 = g2;
            }
            if (loa_34 != null) {
                mda2 = new Mda((eAa)g2, vRa.d, a2.f((IBlockState)b2));
                string = a2.f();
            }
        }
        loa_3 loa_35 = loa_33;
        loa_35.J((int)e2, (int)d2, mda2);
        loa_35.I.L.J(string, (int)(e2 + yOa.B + tTa.h), (int)(d2 + yRa.d), pua.o);
        if (f2 == false) {
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = c2.f();
            b2 = oha.J(kua.i, objectArray);
            loa_32 = loa_33;
        } else if (f2 == vLa.J((vLa)loa_33.I).J().size() - vRa.d) {
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = c2.f();
            b2 = oha.J(hqa.U, objectArray);
            loa_32 = loa_33;
        } else {
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = c2.f();
            b2 = oha.J(aqa.d, objectArray);
            loa_32 = loa_33;
        }
        Object object = b2;
        loa_32.I.L.J((String)object, (int)(e2 + uqa.g + xra.ja - loa_33.I.L.J((String)object)), (int)(d2 + yRa.d), pua.o);
    }

    public boolean f(int n2) {
        int b2 = n2;
        loa_3 a2 = this;
        if (b2 == a2.j) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, int n3, Mda mda2) {
        void b2;
        void c2;
        loa_3 d2 = mda2;
        loa_3 a2 = this;
        a2.C((int)(c2 + vRa.d), (int)(b2 + vRa.d));
        uKa.o();
        if (d2 != null && d2.J() != null) {
            nLa.J();
            a2.I.m.J((Mda)d2, (int)(c2 + uqa.g), (int)(b2 + uqa.g));
            nLa.C();
        }
        uKa.E();
    }

    public loa_3(vLa vLa2) {
        loa_3 b2 = vLa2;
        loa_3 a2 = this;
        a2.I = b2;
        loa_3 loa_32 = b2;
        super(((vLa)b2).g, ((vLa)loa_32).A, ((vLa)loa_32).I, iSa.x, ((vLa)b2).I - Psa.M, osa.c);
        a2.j = pua.o;
    }

    public void J(int n2, boolean bl2, int n3, int n4) {
        int e2 = n2;
        loa_3 d2 = this;
        d2.j = e2;
        d2.I.J();
    }

    public void l() {
    }

    public int M() {
        loa_3 a2;
        return a2.E - NPa.e;
    }

    public int e() {
        loa_3 a2;
        return vLa.J((vLa)a2.I).J().size();
    }

    /*
     * WARNING - void declaration
     */
    private void C(int n2, int n3, int n4, int n5) {
        void a2;
        void b2;
        void c2;
        void d2;
        loa_3 e2;
        loa_3 loa_32 = this;
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        loa_32.B.J().J(KA.j);
        pKa pKa2 = pKa.J();
        loa_3 loa_33 = e2 = pKa2.J();
        void v2 = d2;
        loa_3 loa_34 = e2;
        loa_34.J(XTa.W, mka.A);
        loa_34.J((double)(d2 + uSa.E), (double)(c2 + yOa.B), loa_32.I.I).J((double)((float)(b2 + uSa.E) * hra.Ka), (double)((float)(a2 + yOa.B) * hra.Ka)).M();
        e2.J((double)(v2 + yOa.B), (double)(c2 + yOa.B), loa_32.I.I).J((double)((float)(b2 + yOa.B) * hra.Ka), (double)((float)(a2 + yOa.B) * hra.Ka)).M();
        loa_33.J((double)(v2 + yOa.B), (double)(c2 + uSa.E), loa_32.I.I).J((double)((float)(b2 + yOa.B) * hra.Ka), (double)((float)(a2 + uSa.E) * hra.Ka)).M();
        loa_33.J((double)(d2 + uSa.E), (double)(c2 + uSa.E), loa_32.I.I).J((double)((float)(b2 + uSa.E) * hra.Ka), (double)((float)(a2 + uSa.E) * hra.Ka)).M();
        pKa2.J();
    }

    /*
     * WARNING - void declaration
     */
    private void C(int n2, int n3) {
        void b2;
        int c2 = n3;
        loa_3 a2 = this;
        a2.C((int)b2, c2, uSa.E, uSa.E);
    }
}

