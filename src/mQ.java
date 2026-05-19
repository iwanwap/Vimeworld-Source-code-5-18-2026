/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EC
 *  PQ
 *  SN
 *  Vr
 *  vRa
 *  wI
 */
import java.io.IOException;

public final class mQ
extends EC {
    private boolean M;
    private wI k;
    private boolean j;
    private final Vr J;
    public final PQ A;
    private boolean I;

    public void J() {
        mQ a2;
        mQ mQ2 = a2;
        mQ2.g.J(null);
        if (mQ2.g.ta == null) {
            a2.g.C();
        }
    }

    public void J(int n2, int n3, float f2) {
        float d2 = f2;
        mQ a2 = this;
        if (a2.j) {
            a2.i();
        }
    }

    public void A() {
    }

    public void C() throws IOException {
        mQ a2;
        if (a2.J.J()) {
            return;
        }
        super.C();
    }

    public mQ(ko ko2, PQ pQ) {
        SN a2;
        mQ b2;
        Object c2 = ko2;
        mQ mQ2 = b2 = this;
        mQ mQ3 = b2;
        b2.J = new Vr();
        mQ3.j = vRa.d;
        b2.I = vRa.d;
        b2.M = vRa.d;
        mQ2.k = null;
        mQ2.A = a2;
        if (((ko)c2).hasDefaultBackground()) {
            b2.j = ((ko)c2).getDefaultBackground();
        }
        if (((ko)c2).hasCloseOnEsc()) {
            b2.I = ((ko)c2).getCloseOnEsc();
        }
        if (((ko)c2).hasCloseOnInventoryKey()) {
            b2.M = ((ko)c2).getCloseOnInventoryKey();
        }
        if (((ko)c2).hasCloseCallback()) {
            b2.k = new wI(((ko)c2).getCloseCallback().toByteArray());
        }
        c2 = ((ko)c2).getKeyBindingsList().iterator();
        Object object = c2;
        while (object.hasNext()) {
            a2 = (SN)c2.next();
            object = c2;
            b2.J.J(a2);
        }
    }

    public void l() {
        mQ a2;
        super.l();
        if (OT.i.F.J(a2.A.I) != a2.A) {
            a2.J();
        }
    }

    public void M() {
        mQ a2;
        if (a2.k != null) {
            OT.J(a2.k);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(char c2, int n2) throws IOException {
        void b2;
        int c3 = n2;
        mQ a2 = this;
        if (a2.A.J((char)b2, c3)) {
            return;
        }
        if (a2.I && c3 == vRa.d || a2.M && c3 == a2.g.z.xc.getKeyCode()) {
            a2.J();
            return;
        }
    }
}

