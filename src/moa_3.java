/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  RBa
 *  Xoa
 *  ac
 *  fba
 *  vL
 *  vRa
 *  wra
 */
import java.io.IOException;

public final class moa_3
extends Xoa {
    public moa_3() {
        moa_3 a2;
    }

    public void A() {
        moa_3 a2;
        moa_3 moa_32 = a2;
        super.A();
        moa_32.E.add(new ac(vRa.d, a2.A / uqa.g - ySa.T, a2.I - wra.P, oha.J(MTa.D, new Object[uSa.E])));
    }

    /*
     * WARNING - void declaration
     */
    public void J(char c2, int n2) throws IOException {
        int c3 = n2;
        moa_3 a2 = this;
        if (c3 == vRa.d) {
            a2.f();
            return;
        }
        if (c3 != EPa.O && c3 != yRa.r) {
            void b2;
            super.J((char)b2, c3);
            return;
        }
        String b2 = a2.L.f().trim();
        if (!b2.isEmpty()) {
            a2.g.c.f(b2);
        }
        moa_3 moa_32 = a2;
        moa_32.L.f(Mqa.y);
        moa_32.g.Ya.J().J();
    }

    public void J(ac ac2) throws IOException {
        moa_3 b2 = ac2;
        moa_3 a2 = this;
        if (((ac)b2).C == vRa.d) {
            a2.f();
            return;
        }
        super.J((ac)b2);
    }

    private void f() {
        moa_3 moa_32 = this;
        moa_3 a2 = moa_32.g.c.F;
        a2.J((KC)new RBa((vL)moa_32.g.c, fba.STOP_SLEEPING));
    }
}

