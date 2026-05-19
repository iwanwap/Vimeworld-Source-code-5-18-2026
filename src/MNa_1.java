/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  D
 *  Kpa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class MNa_1
implements D {
    private String lanServerMotd;
    private String lanServerIpPort;
    private long timeLastSeen;

    public void J() {
        a.timeLastSeen = Kpa.J();
    }

    public String f() {
        MNa_1 a2;
        return a2.lanServerIpPort;
    }

    public String J() {
        MNa_1 a2;
        return a2.lanServerMotd;
    }

    /*
     * WARNING - void declaration
     */
    public MNa_1(String string, String string2) {
        void b2;
        MNa_1 a2;
        String c2 = string2;
        MNa_1 mNa_1 = a2 = this;
        mNa_1.lanServerMotd = b2;
        mNa_1.lanServerIpPort = c2;
        mNa_1.timeLastSeen = Kpa.J();
    }
}

