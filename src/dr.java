/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Zm
 */
public final class dr
implements Runnable {
    private final String J;
    private final int A;
    public final /* synthetic */ ip I;

    @Override
    public void run() {
        dr a2;
        dr dr2 = a2;
        ip.J(a2.I).J(dr2.A, dr2.J);
    }

    public dr(ip ip2, Zm zm2) {
        dr a2;
        dr b2 = zm2;
        dr dr2 = a2 = this;
        a2.I = ip2;
        dr2.A = b2.getKey();
        dr2.J = b2.hasId() ? b2.getId() : null;
    }
}

