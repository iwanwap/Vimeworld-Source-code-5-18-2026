/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gua
 *  pPa
 *  uca
 */
public class uca_2 {
    private final long J;
    public static final uca A = new KCa(nqa.i);
    private long I;

    public uca_2(long a2) {
        uca_2 b2;
        b2.J = a2;
    }

    public void J(long a2) {
        uca_2 b2;
        uca_2 uca_22 = b2;
        uca_22.I += a2 / Jra.V;
        if (uca_22.I > b2.J) {
            throw new RuntimeException(new StringBuilder().insert(3 >> 2, Gua.J).append(b2.I).append(pPa.N).append(b2.J).toString());
        }
    }
}

