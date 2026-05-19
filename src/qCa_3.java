/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mda
 *  VQa
 *  qCa
 *  vRa
 */
import net.minecraft.block.Block;

public class qCa_3
extends kda {
    private final Block A;
    private String[] I;

    public int J(int n2) {
        int b2 = n2;
        qCa_3 a2 = this;
        return b2;
    }

    public int J(Mda mda2, int n2) {
        qCa_3 b2;
        qCa_3 c2 = mda2;
        qCa_3 qCa_32 = b2 = this;
        return qCa_32.A.J(qCa_32.A.J(c2.J()));
    }

    /*
     * WARNING - void declaration
     */
    public qCa_3(Block block, boolean bl2) {
        void a2;
        Object c2 = block;
        qCa_3 b2 = this;
        super((Block)c2);
        b2.A = c2;
        if (a2 != false) {
            b2.f(uSa.E);
            b2.J(vRa.d != 0);
        }
    }

    @Override
    public String C(Mda mda2) {
        qCa_3 b2 = mda2;
        qCa_3 a2 = this;
        if (a2.I == null) {
            return super.C((Mda)b2);
        }
        int n2 = b2.J();
        if (n2 >= 0 && n2 < a2.I.length) {
            return new StringBuilder().insert(5 >> 3, super.C((Mda)b2)).append(VQa.ja).append(a2.I[n2]).toString();
        }
        return super.C((Mda)b2);
    }

    public qCa J(String[] stringArray) {
        String[] b2 = stringArray;
        String[] a2 = this;
        a2.I = b2;
        return a2;
    }
}

