/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  wI
 *  wra
 */
public final class Pr_3
implements Runnable {
    private final wI A;
    public final /* synthetic */ ip I;

    public Pr_3(ip ip2, wI wI2) {
        Pr_3 b2 = wI2;
        Pr_3 a2 = this;
        a2.I = ip2;
        a2.A = b2;
    }

    @Override
    public void run() {
        Pr_3 a2;
        a2.A.put((Object)wra.n, (Object)ip.J(a2.I));
        OT.J(a2.A);
    }
}

