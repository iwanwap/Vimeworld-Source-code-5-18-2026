/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  LW
 *  pua
 *  vRa
 */
public final class LW_1
implements Comparable<LW> {
    private final String fileName;
    private final boolean hardcore;
    private final boolean requiresConversion;
    private final Daa theEnumGameType;
    private final long sizeOnDisk;
    private final long lastTimePlayed;
    private final boolean cheatsEnabled;
    private final String displayName;

    public boolean requiresConversion() {
        LW_1 a2;
        return a2.requiresConversion;
    }

    @Override
    public int compareTo(LW lW2) {
        LW_1 b2 = lW2;
        LW_1 a2 = this;
        if (a2.lastTimePlayed < b2.lastTimePlayed) {
            return vRa.d;
        }
        if (a2.lastTimePlayed > b2.lastTimePlayed) {
            return pua.o;
        }
        return a2.fileName.compareTo(b2.fileName);
    }

    public String getDisplayName() {
        LW_1 a2;
        return a2.displayName;
    }

    public long getLastTimePlayed() {
        LW_1 a2;
        return a2.lastTimePlayed;
    }

    public boolean isHardcoreModeEnabled() {
        LW_1 a2;
        return a2.hardcore;
    }

    public String getFileName() {
        LW_1 a2;
        return a2.fileName;
    }

    public boolean getCheatsEnabled() {
        LW_1 a2;
        return a2.cheatsEnabled;
    }

    /*
     * WARNING - void declaration
     */
    public LW_1(String string, String string2, long l2, long l3, Daa daa, boolean bl, boolean bl2, boolean bl3) {
        void i2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        void g2;
        void h2;
        LW_1 a2;
        boolean bl4 = bl3;
        LW_1 lW_1 = a2 = this;
        LW_1 lW_12 = a2;
        LW_1 lW_13 = a2;
        LW_1 lW_14 = a2;
        lW_14.fileName = h2;
        lW_14.displayName = g2;
        lW_13.lastTimePlayed = f2;
        lW_13.sizeOnDisk = e2;
        lW_12.theEnumGameType = d2;
        lW_12.requiresConversion = c2;
        lW_1.hardcore = b2;
        lW_1.cheatsEnabled = i2;
    }

    public long getSizeOnDisk() {
        LW_1 a2;
        return a2.sizeOnDisk;
    }

    public Daa getEnumGameType() {
        LW_1 a2;
        return a2.theEnumGameType;
    }
}

