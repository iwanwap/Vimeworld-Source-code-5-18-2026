/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CY
 *  Loa
 *  MAa
 *  OS
 *  Sna
 *  aA
 *  coa
 *  ld
 *  uOa
 *  wBa
 */
import java.net.InetAddress;

public final class vna_2
extends Thread {
    public final /* synthetic */ String A;
    public final /* synthetic */ Loa I;

    /*
     * WARNING - void declaration
     */
    public vna_2(Loa loa, String string, String object) {
        void a2;
        void b2;
        Object c2 = object;
        object = this;
        ((vna_2)object).I = b2;
        ((vna_2)object).A = c2;
        ((Thread)object)((String)a2);
    }

    public synchronized void J() {
        InetAddress inetAddress;
        vna_2 a2;
        vna_2 vna_22;
        block8: {
            block7: {
                vna_2 vna_23 = vna_22 = this;
                a2 = Loa.J((Loa)vna_23.I, (String)vna_23.A);
                inetAddress = null;
                try {
                    if (!vna_22.I.J) break block7;
                    return;
                }
                catch (Exception exception) {
                    if (vna_22.I.J) {
                        return;
                    }
                    vna_22.I.J(exception, inetAddress, (Sna)a2);
                    return;
                }
            }
            if (vna_22.I.k != null) {
                vna_22.I.k.J((ld)new CY(opa.k));
            }
            inetAddress = InetAddress.getByName(a2.J());
            vna_2 vna_24 = vna_22;
            vna_24.I.k = uba.J(inetAddress, a2.J(), Loa.l((Loa)vna_22.I).z.J());
            vna_2 vna_25 = vna_22;
            vna_24.I.k.J(vna_25.A);
            vna_25.I.k.J(vna_22.I.I);
            if (!vna_24.I.I) {
                OS.I = null;
            }
            if (!vna_22.I.J) break block8;
            vna_22.I.k.J((ld)new CY(MTa.r));
            return;
        }
        vna_2 vna_26 = vna_22;
        vna_26.I.k.J((aA)new coa(vna_22.I.k, Loa.J((Loa)vna_22.I), Loa.J((Loa)vna_22.I)));
        String string = inetAddress.getHostAddress();
        string = a2.J();
        vna_26.I.k.J((KC)new MAa(uOa.F, string, a2.J(), wBa.LOGIN));
        vna_22.I.k.J(new VBa(Loa.f((Loa)vna_22.I).J().J()));
    }

    @Override
    public void run() {
        vna_2 a2;
        a2.J();
    }
}

