/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  D
 *  Kb
 */
public final class xz_2
implements D {
    private Kb jsonSerializableValue;
    private int integerValue;

    public int J() {
        xz_2 a2;
        return a2.integerValue;
    }

    public <T extends Kb> T J() {
        xz_2 a2;
        return (T)a2.jsonSerializableValue;
    }

    public xz_2() {
        xz_2 a2;
    }

    public void J(Kb kb2) {
        xz_2 b2 = kb2;
        xz_2 a2 = this;
        a2.jsonSerializableValue = b2;
    }

    public void J(int n2) {
        int b2 = n2;
        xz_2 a2 = this;
        a2.integerValue = b2;
    }
}

