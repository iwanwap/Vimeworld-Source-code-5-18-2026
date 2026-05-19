/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  HA
 *  Mda
 *  QFa
 *  XSa
 *  vRa
 */
import net.minecraft.block.BlockAnvil;

public final class mea
extends sEa {
    public final /* synthetic */ XF J;
    public final /* synthetic */ Gg A;
    public final /* synthetic */ rda I;

    @Override
    public boolean J(Sx sx2) {
        Object b2 = sx2;
        mea a2 = this;
        if ((((Sx)((Object)b2)).h.f() || ((Sx)((Object)b2)).j >= a2.I.j) && a2.I.j > 0 && a2.J()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public boolean J(Mda mda2) {
        mea b2 = mda2;
        mea a2 = this;
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Sx sx2, Mda mda2) {
        void b22;
        Object c2 = mda2;
        mea a2 = this;
        if (!b22.h.f()) {
            b22.k(-a2.I.j);
        }
        rda.J(a2.I).J(uSa.E, (Mda)null);
        if (rda.J(a2.I) > 0) {
            c2 = rda.J(a2.I).J(vRa.d);
            if (c2 != null && ((Mda)c2).E > rda.J(a2.I)) {
                mea mea2 = a2;
                ((Mda)c2).E -= rda.J(mea2.I);
                rda.J(mea2.I).J(vRa.d, (Mda)c2);
            } else {
                rda.J(a2.I).J(vRa.d, (Mda)null);
            }
        } else {
            rda.J(a2.I).J(vRa.d, (Mda)null);
        }
        a2.I.j = uSa.E;
        c2 = a2.A.J(a2.J);
        if (!b22.h.f() && !a2.A.e && c2.J() == QFa.Sb && b22.J().nextFloat() < XSa.I) {
            int b22 = c2.J(BlockAnvil.DAMAGE);
            if (++b22 > uqa.g) {
                mea mea3 = a2;
                mea3.A.G(mea3.J);
                a2.A.f(IPa.l, a2.J, uSa.E);
                return;
            }
            mea mea4 = a2;
            mea4.A.J(mea4.J, c2.J(BlockAnvil.DAMAGE, b22), uqa.g);
            a2.A.f(sOa.F, a2.J, uSa.E);
            return;
        }
        if (!a2.A.e) {
            a2.A.f(sOa.F, a2.J, uSa.E);
        }
    }

    /*
     * WARNING - void declaration
     */
    public mea(rda rda2, HA hA2, int n2, int n3, int n4, Gg gg2, XF object) {
        void a2;
        void b2;
        void c2;
        void d2;
        Object f2;
        void e2;
        mea mea2 = object2;
        Object object2 = object;
        Object object3 = object = mea2;
        ((mea)object3).I = e2;
        ((mea)object3).A = gg2;
        ((mea)object).J = f2;
        super((HA)d2, (int)c2, (int)b2, (int)a2);
    }
}

