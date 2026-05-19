/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class BR {
    public List<zr> A;
    public int I;

    public int J() {
        BR a2;
        return a2.I;
    }

    public BR(int n2) {
        int b2 = n2;
        BR a2 = this;
        BR bR = a2;
        a2.A = new ArrayList<zr>();
        a2.I = b2;
    }

    public List<zr> J() {
        BR a2;
        return a2.A;
    }

    /*
     * WARNING - void declaration
     */
    public void J(float[] fArray, float[] fArray2) {
        void b2;
        Object c2 = fArray2;
        BR a2 = this;
        a2.A.add(new zr((float[])b2, (float[])c2));
    }
}

