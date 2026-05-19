/*
 * Decompiled with CFR 0.152.
 */
public final class uL_1 {
    public Zk A;
    public Zk I;

    public uL_1() {
        uL_1 a2;
        uL_1 uL_12 = a2;
        uL_12.I = null;
        uL_12.A = null;
    }

    public void J(Pm pm2) {
        Pm b2 = pm2;
        uL_1 a2 = this;
        if (b2.hasStart()) {
            uL_1 uL_12 = a2;
            uL_12.I = new Zk(b2.getStart());
        }
        if (b2.hasFinish()) {
            a2.A = new Zk(b2.getFinish());
        }
    }
}

