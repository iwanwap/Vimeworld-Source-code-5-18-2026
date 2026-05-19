/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Pd
 *  Tpa
 *  wra
 */
import java.io.IOException;

public final class OBa
implements KC<Pd> {
    private String A;
    private String I;

    public OBa() {
        OBa a2;
    }

    @Override
    public void J(Pd pd2) {
        OBa b2 = pd2;
        OBa a2 = this;
        b2.J(a2);
    }

    /*
     * WARNING - void declaration
     */
    public OBa(String string, String string2) {
        void b2;
        String c2 = string2;
        OBa a2 = this;
        a2.I = b2;
        a2.A = c2;
        if (((String)a2.A).length() > wra.P) {
            throw new IllegalArgumentException(new StringBuilder().insert(3 >> 2, Tpa.R).append(c2.length()).append(hpa.b).toString());
        }
    }

    public String f() {
        OBa a2;
        return a2.I;
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        OBa a2 = this;
        b2.writeString(a2.I);
        b2.writeString(a2.A);
    }

    public String J() {
        OBa a2;
        return a2.A;
    }

    @Override
    public void J(Lca lca) throws IOException {
        OBa a2;
        Lca b2 = lca;
        OBa oBa = a2 = this;
        oBa.I = b2.readStringFromBuffer(BQa.h);
        oBa.A = b2.readStringFromBuffer(wra.P);
    }
}

