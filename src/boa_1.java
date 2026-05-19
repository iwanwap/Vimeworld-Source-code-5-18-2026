/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EC
 *  URa
 *  ZOa
 *  ac
 *  boa
 *  cra
 *  mNa
 *  pda
 *  pua
 *  vRa
 */
import java.io.IOException;

public final class boa_1
extends EC {
    private final EC A;
    private String I;

    public void J(ac ac2) throws IOException {
        boa_1 b2 = ac2;
        boa_1 a2 = this;
        if (((ac)b2).J) {
            if (((ac)b2).C == ZOa.x) {
                boa_1 boa_12 = a2;
                boa_12.g.z.d();
                boa_12.g.J(a2.A);
                return;
            }
            if (b2 instanceof mNa) {
                pda pda2 = mNa.J((mNa)((mNa)b2));
                boa_1 boa_13 = a2;
                boa_13.g.z.J(pda2);
                ((ac)b2).i = boa_13.J(pda2);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, float f2) {
        void b2;
        void c2;
        boa_1 a2;
        float d2 = f2;
        boa_1 boa_12 = a2 = this;
        a2.i();
        boa_1.J((String)boa_12.I, (int)(a2.A / uqa.g), (int)kTa.j, (int)pua.o);
        super.J((int)c2, (int)b2, d2);
    }

    public boa_1(EC eC2) {
        boa_1 b2 = eC2;
        boa_1 a2 = this;
        a2.A = b2;
    }

    public void A() {
        int n2;
        boa_1 boa_12 = this;
        int a2 = uSa.E;
        boa_12.I = oha.J(URa.f, new Object[uSa.E]);
        pda[] pdaArray = pda.values();
        int n3 = pdaArray.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            pda pda2 = pdaArray[n2];
            boa_1 boa_13 = boa_12;
            boa_12.E.add(new mNa((boa)boa_13, pda2.getPartId(), (int)(boa_12.A / uqa.g - BQa.Q + ++a2 % uqa.g * rRa.f), (int)(boa_13.I / uua.p + osa.c * (a2 >> vRa.d)), Jpa.Ha, kTa.j, pda2, null));
            n4 = ++n2;
        }
        if (++a2 % uqa.g == vRa.d) {
            ++a2;
        }
        boa_12.E.add(new ac(ZOa.x, (int)(boa_12.A / uqa.g - ySa.T), (int)(boa_12.I / uua.p + osa.c * (a2 >> vRa.d)), oha.J(cra.g, new Object[uSa.E])));
    }

    public static /* synthetic */ String J(boa boa2, pda pda2) {
        boa b2 = pda2;
        boa a2 = boa2;
        return super.J((pda)b2);
    }

    /*
     * WARNING - void declaration
     */
    private String J(pda pda2) {
        void a2;
        boa_1 boa_12 = this;
        Object b2 = boa_12.g.z.J().contains(a2) ? oha.J(ppa.H, new Object[uSa.E]) : oha.J(tSa.Ha, new Object[uSa.E]);
        return new StringBuilder().insert(3 ^ 3, a2.func_179326_d().l()).append(Xpa.E).append((String)b2).toString();
    }
}

