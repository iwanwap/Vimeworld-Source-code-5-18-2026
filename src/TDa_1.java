/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Gl
 *  Mda
 *  QFa
 *  TDa
 *  UZ
 *  aSa
 *  jFa
 *  kta
 *  pqa
 *  vL
 *  vRa
 *  wEa
 */
import net.minecraft.block.Block;

public final class TDa_1
extends aDa {
    public TDa J(wEa wEa2) {
        TDa_1 b2 = wEa2;
        TDa_1 a2 = this;
        return new TDa_1(a2.j);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Sx sx2) {
        void a2;
        TDa_1 tDa_1 = this;
        Mda mda2 = a2.K.f();
        if (mda2 != null && mda2.J() == Gea.hC && tDa_1.I() >= 0) {
            if (mda2.E == vRa.d) {
                void v0 = a2;
                v0.K.J(v0.K.J, new Mda(Gea.Na));
                return vRa.d != 0;
            }
            if (a2.K.f(new Mda(Gea.Na)) && !a2.h.f()) {
                void v1 = a2;
                v1.K.J(v1.K.J, vRa.d);
                return vRa.d != 0;
            }
        }
        if (mda2 != null && mda2.J() == Gea.ja && tDa_1.I() >= 0) {
            TDa_1 tDa_12 = tDa_1;
            tDa_12.k();
            TDa_1 tDa_13 = tDa_1;
            tDa_12.j.J(UZ.EXPLOSION_LARGE, tDa_13.la, tDa_1.Z + (double)(tDa_1.u / kta.v), tDa_1.A, aSa.V, aSa.V, aSa.V, new int[uSa.E]);
            if (!tDa_13.j.e) {
                aDa b22 = new aDa(tDa_1.j);
                TDa_1 tDa_14 = tDa_1;
                aDa aDa2 = b22;
                TDa_1 tDa_15 = tDa_1;
                aDa2.f(tDa_1.la, tDa_1.Z, tDa_1.A, tDa_15.X, tDa_15.d);
                aDa2.A(tDa_1.f());
                new aDa(tDa_1.j).ba = tDa_14.ba;
                if (tDa_14.J()) {
                    b22.J(tDa_1.e());
                }
                tDa_1.j.f((vL)b22);
                int b22 = uSa.E;
                int n2 = b22;
                while (n2 < tTa.h) {
                    TDa_1 tDa_16 = tDa_1;
                    tDa_1.j.f((vL)new jFa(tDa_16.j, tDa_16.la, tDa_1.Z + (double)tDa_1.u, tDa_1.A, new Mda((Block)QFa.TC)));
                    n2 = ++b22;
                }
                mda2.J(vRa.d, (Gl)a2);
                tDa_1.J(tpa.m, pqa.r, pqa.r);
            }
            return vRa.d != 0;
        }
        return super.J((Sx)a2);
    }

    public TDa_1(Gg gg2) {
        TDa_1 a2;
        TDa_1 b2 = gg2;
        TDa_1 tDa_1 = a2 = this;
        super((Gg)b2);
        tDa_1.l(ATa.r, Jsa.Z);
        tDa_1.i = QFa.uB;
    }
}

