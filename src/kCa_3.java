/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  D
 *  HAa
 *  QBa
 *  ld
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class kCa_3
implements D {
    private String favicon;
    private HAa protocolVersion;
    private ld serverMotd;
    private QBa playerCount;

    public kCa_3() {
        kCa_3 a2;
    }

    public void J(String string) {
        String b2 = string;
        kCa_3 a2 = this;
        a2.favicon = b2;
    }

    public void J(HAa hAa2) {
        kCa_3 b2 = hAa2;
        kCa_3 a2 = this;
        a2.protocolVersion = b2;
    }

    public void J(ld ld2) {
        kCa_3 b2 = ld2;
        kCa_3 a2 = this;
        a2.serverMotd = b2;
    }

    public QBa J() {
        kCa_3 a2;
        return a2.playerCount;
    }

    public ld J() {
        kCa_3 a2;
        return a2.serverMotd;
    }

    public String J() {
        kCa_3 a2;
        return a2.favicon;
    }

    public HAa J() {
        kCa_3 a2;
        return a2.protocolVersion;
    }

    public void J(QBa qBa2) {
        kCa_3 b2 = qBa2;
        kCa_3 a2 = this;
        a2.playerCount = b2;
    }
}

