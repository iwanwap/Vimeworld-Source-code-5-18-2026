/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
import java.net.InetAddress;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class rla {
    public int J;
    public boolean A;
    public InetAddress[] I;

    public void J() {
        rla rla2 = this;
        if (rla2.J()) {
            int a2;
            InetAddress inetAddress = rla2.I[uSa.E];
            int n2 = a2 = uSa.E;
            while (n2 < rla2.I.length - vRa.d) {
                rla rla3 = rla2;
                int n3 = a2++;
                rla3.I[n3] = rla3.I[n3 + vRa.d];
                n2 = a2;
            }
            rla rla4 = rla2;
            rla4.I[rla4.I.length - vRa.d] = inetAddress;
            rla2.J += vRa.d;
        }
    }

    public boolean J() {
        rla a2;
        if (a2.I != null && a2.I.length > vRa.d) {
            rla rla2 = a2;
            if (rla2.J < rla2.I.length - vRa.d) {
                return vRa.d != 0;
            }
        }
        return uSa.E != 0;
    }

    private rla() {
        rla a2;
    }

    public /* synthetic */ rla(eLa eLa2) {
        eLa b2 = eLa2;
        rla a2 = this;
        a2();
    }
}

