/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  HA
 *  Mda
 *  QFa
 *  VEa
 *  eAa
 *  tda
 *  vRa
 */
import net.minecraft.block.Block;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class IEa_3
extends sEa {
    public final /* synthetic */ tda j;
    public final /* synthetic */ int J;

    /*
     * WARNING - void declaration
     */
    public IEa_3(tda tda2, HA hA2, int n2, int n3, int n4, int n5) {
        void a2;
        void b2;
        void c2;
        void d2;
        void f2;
        void e2;
        int n6 = n5;
        IEa_3 iEa_3 = this;
        iEa_3.j = e2;
        iEa_3.J = f2;
        super((HA)d2, (int)c2, (int)b2, (int)a2);
    }

    @Override
    public int J() {
        return vRa.d;
    }

    @Override
    public String J() {
        IEa_3 a2;
        return VEa.A[a2.J];
    }

    @Override
    public boolean J(Mda mda2) {
        IEa_3 b2 = mda2;
        IEa_3 a2 = this;
        if (b2 == null) {
            return uSa.E != 0;
        }
        if (b2.J() instanceof VEa) {
            if (((VEa)b2.J()).j == a2.J) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        if (b2.J() != eAa.J((Block)QFa.s) && b2.J() != Gea.GB) {
            return uSa.E != 0;
        }
        if (a2.J == 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

