/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  D
 *  Gua
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class hJa_2
implements D {
    public final int rotation;
    public float[] uvs;

    public int f(int n2) {
        int b2 = n2;
        hJa_2 a2 = this;
        return (b2 + (AQa.P - a2.rotation / Jsa.ha)) % AQa.P;
    }

    private int J(int n2) {
        int b2 = n2;
        hJa_2 a2 = this;
        return (b2 + a2.rotation / Jsa.ha) % AQa.P;
    }

    /*
     * WARNING - void declaration
     */
    public hJa_2(float[] fArray, int n2) {
        void b2;
        hJa_2 a2;
        int c2 = n2;
        hJa_2 hJa_22 = a2 = this;
        hJa_22.uvs = b2;
        hJa_22.rotation = c2;
    }

    public float f(int n2) {
        int b2 = n2;
        hJa_2 a2 = this;
        if (a2.uvs == null) {
            throw new NullPointerException(Gua.v);
        }
        if ((b2 = a2.J(b2)) != 0 && b2 != yRa.d) {
            return a2.uvs[yRa.d];
        }
        return a2.uvs[vRa.d];
    }

    public float J(int n2) {
        int b2 = n2;
        hJa_2 a2 = this;
        if (a2.uvs == null) {
            throw new NullPointerException(Gua.v);
        }
        if ((b2 = a2.J(b2)) != 0 && b2 != vRa.d) {
            return a2.uvs[uqa.g];
        }
        return a2.uvs[uSa.E];
    }

    public void J(float[] fArray) {
        Object b2 = fArray;
        hJa_2 a2 = this;
        if (a2.uvs == null) {
            a2.uvs = (float[])b2;
        }
    }
}

