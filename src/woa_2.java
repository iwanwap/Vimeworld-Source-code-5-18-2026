/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  D
 *  MMa
 *  pqa
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class woa_2
implements D {
    private float pitch;
    private int weight;
    private MMa type;
    private String name;
    private boolean streaming;
    private float volume = pqa.r;

    public void J(String string) {
        String b2 = string;
        woa_2 a2 = this;
        a2.name = b2;
    }

    public void J(int n2) {
        int b2 = n2;
        woa_2 a2 = this;
        a2.weight = b2;
    }

    public String J() {
        woa_2 a2;
        return a2.name;
    }

    public float f() {
        woa_2 a2;
        return a2.pitch;
    }

    public void f(float f2) {
        float b2 = f2;
        woa_2 a2 = this;
        a2.pitch = b2;
    }

    public float J() {
        woa_2 a2;
        return a2.volume;
    }

    public MMa J() {
        woa_2 a2;
        return a2.type;
    }

    public void J(MMa mMa2) {
        woa_2 b2 = mMa2;
        woa_2 a2 = this;
        a2.type = b2;
    }

    public void J(boolean bl) {
        boolean b2 = bl;
        woa_2 a2 = this;
        a2.streaming = b2;
    }

    public void J(float f2) {
        float b2 = f2;
        woa_2 a2 = this;
        a2.volume = b2;
    }

    public woa_2() {
        woa_2 a2;
        a2.pitch = pqa.r;
        a2.weight = vRa.d;
        a2.type = MMa.FILE;
        a2.streaming = uSa.E;
    }

    public int J() {
        woa_2 a2;
        return a2.weight;
    }

    public boolean J() {
        woa_2 a2;
        return a2.streaming;
    }
}

