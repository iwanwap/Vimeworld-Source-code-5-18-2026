/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EC
 *  cBa
 *  iMa
 *  pua
 *  vRa
 *  vpa
 */
import java.io.IOException;

public final class tna_3
extends EC {
    private iMa j;
    private int J;

    public boolean J() {
        return uSa.E != 0;
    }

    public void l() {
        tna_3 a2;
        tna_3 tna_32 = a2;
        tna_32.J += vRa.d;
        if (tna_32.J % kTa.j == 0) {
            a2.j.J((KC)new cBa());
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, float f2) {
        void b2;
        void c2;
        float d2 = f2;
        tna_3 a2 = this;
        a2.f(uSa.E);
        tna_3.J((String)oha.J(wsa.Z, new Object[uSa.E]), (int)(a2.A / uqa.g), (int)(a2.I / uqa.g - vpa.o), (int)pua.o);
        super.J((int)c2, (int)b2, d2);
    }

    public void A() {
        tna_3 a2;
        a2.E.clear();
    }

    public tna_3(iMa iMa2) {
        tna_3 b2 = iMa2;
        tna_3 a2 = this;
        a2.j = b2;
    }

    public void J(char c2, int n2) throws IOException {
        int c3 = n2;
        tna_3 tna_32 = this;
    }
}

