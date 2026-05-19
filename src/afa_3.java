/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Gl
 *  Hda
 *  NTa
 *  Qsa
 *  gZ
 *  kba
 *  kqa
 *  pqa
 *  vL
 *  vRa
 *  wPa
 *  wra
 */
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class afa_3
extends oEa {
    @Override
    public void J(RY rY2) {
        block7: {
            afa_3 a2;
            block8: {
                Object object;
                Object b2;
                block11: {
                    block10: {
                        block9: {
                            b2 = rY2;
                            a2 = this;
                            if (a2.j.e) break block7;
                            if (((RY)b2).J == null) break block8;
                            if (a2.G == null) break block9;
                            if (!((RY)b2).J.J(gZ.J((Gl)a2.G), Qsa.k)) break block10;
                            if (!((RY)b2).J.K()) {
                                object = b2;
                                a2.G.e(eua.C);
                            } else {
                                afa_3 afa_32 = a2;
                                afa_32.J(afa_32.G, ((RY)b2).J);
                                object = b2;
                            }
                            break block11;
                        }
                        ((RY)b2).J.J(gZ.l, eua.C);
                    }
                    object = b2;
                }
                if (((RY)object).J instanceof Gl) {
                    int n2;
                    int n3 = uSa.E;
                    if (a2.j.J() == sZ.NORMAL) {
                        n2 = n3 = NTa.C;
                    } else {
                        if (a2.j.J() == sZ.HARD) {
                            n3 = wra.P;
                        }
                        n2 = n3;
                    }
                    if (n2 > 0) {
                        ((Gl)((RY)b2).J).J(new kba(Hda.H.O, kTa.j * n3, vRa.d));
                    }
                }
            }
            afa_3 afa_33 = a2;
            afa_3 afa_34 = a2;
            afa_33.j.J((vL)afa_34, afa_33.la, afa_34.Z, a2.A, pqa.r, uSa.E != 0, a2.j.J().f(kqa.N));
            a2.k();
        }
    }

    public boolean o() {
        return uSa.E != 0;
    }

    public void A(boolean bl) {
        boolean b2 = bl;
        afa_3 a2 = this;
        a2.aa.J(NTa.C, Byte.valueOf((byte)(b2 ? vRa.d : uSa.E)));
    }

    public afa_3(Gg gg2) {
        afa_3 a2;
        afa_3 b2 = gg2;
        afa_3 afa_32 = a2 = this;
        super((Gg)b2);
        afa_32.l(wPa.F, wPa.F);
    }

    /*
     * WARNING - void declaration
     */
    public afa_3(Gg gg2, Gl gl2, double d2, double d3, double d4) {
        void a2;
        void b2;
        void c2;
        void e2;
        afa_3 d5;
        afa_3 f2 = gl2;
        afa_3 afa_32 = d5 = this;
        super((Gg)e2, (Gl)f2, (double)c2, (double)b2, (double)a2);
        afa_32.l(wPa.F, wPa.F);
    }

    @Override
    public boolean J(gZ gZ2, float f2) {
        float c2 = f2;
        afa_3 a2 = this;
        return uSa.E != 0;
    }

    public boolean l() {
        afa_3 a2;
        if (a2.aa.J(NTa.C) == vRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public float J(NZ nZ2, Gg gg2, XF xF2, IBlockState iBlockState) {
        void a2;
        void b2;
        Block c2;
        afa_3 d2;
        Object e22 = nZ2;
        afa_3 afa_32 = d2 = this;
        float e22 = super.J((NZ)e22, (Gg)c2, (XF)b2, (IBlockState)a2);
        c2 = a2.J();
        if (afa_32.l() && IDa.J(c2)) {
            e22 = Math.min(xSa.la, e22);
        }
        return e22;
    }

    @Override
    public void J() {
        afa_3 a2;
        a2.aa.f(NTa.C, (byte)uSa.E);
    }

    @Override
    public float J() {
        afa_3 a2;
        if (a2.l()) {
            return rpa.P;
        }
        return super.J();
    }

    /*
     * WARNING - void declaration
     */
    public afa_3(Gg gg2, double d2, double d3, double d4, double d5, double d6, double d7) {
        void a2;
        void b2;
        void c2;
        void d8;
        void e2;
        void f2;
        afa_3 g2;
        afa_3 h2 = gg2;
        afa_3 afa_32 = g2 = this;
        super((Gg)h2, (double)f2, (double)e2, (double)d8, (double)c2, (double)b2, (double)a2);
        afa_32.l(wPa.F, wPa.F);
    }

    @Override
    public boolean E() {
        return uSa.E != 0;
    }
}

