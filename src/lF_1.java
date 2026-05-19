/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  UD
 *  lF
 */
public final class lF_1 {
    public long A;
    public long I = nqa.i;

    private void l() {
        lF_1 a2;
        lF_1 lF_12 = a2;
        lF_12.A = nqa.i;
        lF_12.I = nqa.i;
    }

    public void f() {
        lF_1 a2;
        if (UD.b && a2.I == nqa.i) {
            a2.I = System.nanoTime();
        }
    }

    public lF_1() {
        lF_1 a2;
        a2.A = nqa.i;
    }

    public void J() {
        lF_1 a2;
        if (UD.b && a2.I != nqa.i) {
            a2.A += System.nanoTime() - a2.I;
            a2.I = nqa.i;
        }
    }

    public static /* synthetic */ void J(lF a2) {
        super.l();
    }
}

