/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  MQa
 *  QFa
 *  Waa
 *  laa
 *  pqa
 *  rd
 *  uY
 *  vL
 *  xy
 */
import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class nZ_2
extends uY
implements rd {
    private boolean i;
    private boolean M;
    private float k;
    private DZ j;
    private float J;
    private List<vL> A;
    private IBlockState I;

    public boolean l() {
        nZ_2 a2;
        return a2.i;
    }

    public float C(float f2) {
        float b2 = f2;
        nZ_2 a2 = this;
        if (a2.M) {
            return (a2.f(b2) - pqa.r) * (float)a2.j.getFrontOffsetY();
        }
        return (pqa.r - a2.f(b2)) * (float)a2.j.getFrontOffsetY();
    }

    public nZ_2() {
        nZ_2 a2;
        a2.A = Lists.newArrayList();
    }

    public void l() {
        nZ_2 a2;
        if (a2.k < pqa.r && a2.worldObj != null) {
            nZ_2 nZ_22 = a2;
            nZ_22.k = nZ_22.J = pqa.r;
            nZ_2 nZ_23 = a2;
            nZ_2 nZ_24 = a2;
            nZ_23.worldObj.f(nZ_24.pos);
            nZ_23.d();
            if (nZ_24.worldObj.J(a2.pos).J() == QFa.zA) {
                nZ_2 nZ_25 = a2;
                nZ_25.worldObj.J(nZ_25.pos, a2.I, yRa.d);
                nZ_2 nZ_26 = a2;
                nZ_26.worldObj.l(nZ_26.pos, a2.I.J());
            }
        }
    }

    public boolean J() {
        nZ_2 a2;
        return a2.M;
    }

    public void J(Waa waa2) {
        nZ_2 b2 = waa2;
        nZ_2 a2 = this;
        nZ_2 nZ_22 = b2;
        super.J((Waa)nZ_22);
        nZ_2 nZ_23 = b2;
        nZ_23.J(Wqa.U, Block.J(a2.I.J()));
        nZ_23.J(gQa.Ka, a2.I.J().f(a2.I));
        nZ_23.J(oua.ja, a2.j.getIndex());
        nZ_22.J(ERa.F, a2.k);
        nZ_22.J(Zqa.o, a2.M);
    }

    public float l(float f2) {
        float b2 = f2;
        nZ_2 a2 = this;
        if (a2.M) {
            return (a2.f(b2) - pqa.r) * (float)a2.j.getFrontOffsetZ();
        }
        return (pqa.r - a2.f(b2)) * (float)a2.j.getFrontOffsetZ();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private void J(float f2, float f3) {
        float c22 = f2;
        nZ_2 b2 = this;
        c22 = b2.M ? pqa.r - c22 : (c22 -= pqa.r);
        nZ_2 nZ_22 = b2;
        Object c22 = QFa.zA.J(nZ_22.worldObj, nZ_22.pos, b2.I, c22, b2.j);
        if (c22 != null && !(c22 = b2.worldObj.f((vL)null, (xy)c22)).isEmpty()) {
            b2.A.addAll((Collection<vL>)c22);
            c22 = b2.A.iterator();
            while (c22.hasNext()) {
                void a2;
                vL vL2 = (vL)c22.next();
                if (b2.I.J() == QFa.iA && b2.M) {
                    switch (laa.I[b2.j.getAxis().ordinal()]) {
                        case 1: {
                            vL2.f((double)b2.j.getFrontOffsetX());
                            break;
                        }
                        case 2: {
                            vL2.J((double)b2.j.getFrontOffsetY());
                            break;
                        }
                        case 3: {
                            vL2.l((double)b2.j.getFrontOffsetZ());
                            break;
                        }
                    }
                    continue;
                }
                vL2.J((double)(a2 * (float)b2.j.getFrontOffsetX()), (double)(a2 * (float)b2.j.getFrontOffsetY()), (double)(a2 * (float)b2.j.getFrontOffsetZ()));
            }
            b2.A.clear();
        }
    }

    public float f(float f2) {
        float b2 = f2;
        nZ_2 a2 = this;
        if (b2 > pqa.r) {
            b2 = pqa.r;
        }
        nZ_2 nZ_22 = a2;
        return nZ_22.k + (nZ_22.J - a2.k) * b2;
    }

    public void J() {
        nZ_2 a2;
        nZ_2 nZ_22 = a2;
        nZ_22.k = nZ_22.J;
        if (nZ_22.k >= pqa.r) {
            nZ_2 nZ_23 = a2;
            nZ_23.J(pqa.r, rta.o);
            nZ_2 nZ_24 = a2;
            nZ_23.worldObj.f(nZ_24.pos);
            nZ_24.d();
            if (nZ_23.worldObj.J(a2.pos).J() == QFa.zA) {
                nZ_2 nZ_25 = a2;
                nZ_25.worldObj.J(nZ_25.pos, a2.I, yRa.d);
                nZ_2 nZ_26 = a2;
                nZ_26.worldObj.l(nZ_26.pos, a2.I.J());
                return;
            }
        } else {
            nZ_2 nZ_27 = a2;
            nZ_27.J += MQa.L;
            if (nZ_27.J >= pqa.r) {
                a2.J = pqa.r;
            }
            if (a2.M) {
                nZ_2 nZ_28 = a2;
                nZ_2 nZ_29 = a2;
                nZ_29.J(nZ_28.J, nZ_28.J - nZ_29.k + rRa.T);
            }
        }
    }

    public int C() {
        return uSa.E;
    }

    public IBlockState J() {
        nZ_2 a2;
        return a2.I;
    }

    public float J(float f2) {
        float b2 = f2;
        nZ_2 a2 = this;
        if (a2.M) {
            return (a2.f(b2) - pqa.r) * (float)a2.j.getFrontOffsetX();
        }
        return (pqa.r - a2.f(b2)) * (float)a2.j.getFrontOffsetX();
    }

    public DZ J() {
        nZ_2 a2;
        return a2.j;
    }

    public void f(Waa waa2) {
        nZ_2 a2;
        nZ_2 b2 = waa2;
        nZ_2 nZ_22 = a2 = this;
        nZ_2 nZ_23 = b2;
        super.f((Waa)nZ_23);
        nZ_2 nZ_24 = b2;
        a2.I = Block.f(nZ_23.J(Wqa.U)).J(nZ_24.J(gQa.Ka));
        nZ_22.j = DZ.getFront(nZ_24.J(oua.ja));
        nZ_22.k = nZ_22.J = b2.J(ERa.F);
        a2.M = b2.f(Zqa.o);
    }

    /*
     * WARNING - void declaration
     */
    public nZ_2(IBlockState iBlockState, DZ dZ2, boolean bl, boolean bl2) {
        void e2;
        void b2;
        void c2;
        void d2;
        nZ_2 a2;
        boolean bl3 = bl2;
        nZ_2 nZ_22 = a2 = this;
        nZ_2 nZ_23 = a2;
        a2.A = Lists.newArrayList();
        nZ_23.I = d2;
        nZ_23.j = c2;
        nZ_22.M = b2;
        nZ_22.i = e2;
    }
}

