/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Eba
 *  JAa
 *  fA
 *  wra
 */
import java.io.IOException;

public final class JAa_1
implements KC<fA> {
    private Eba A;
    private String I;

    /*
     * WARNING - void declaration
     */
    public JAa_1(String string, Eba eba2) {
        void a2;
        Object c2 = string;
        JAa_1 b2 = this;
        if (((String)c2).length() > wra.P) {
            c2 = ((String)c2).substring(uSa.E, wra.P);
        }
        b2.I = c2;
        b2.A = a2;
    }

    public JAa_1() {
        JAa_1 a2;
    }

    @Override
    public void J(fA fA2) {
        JAa_1 b2 = fA2;
        JAa_1 a2 = this;
        b2.J((JAa)a2);
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        JAa_1 a2 = this;
        b2.writeString(a2.I);
        b2.writeEnumValue((Enum<?>)a2.A);
    }

    @Override
    public void J(Lca lca) throws IOException {
        JAa_1 a2;
        Lca b2 = lca;
        JAa_1 jAa_1 = a2 = this;
        jAa_1.I = b2.readStringFromBuffer(wra.P);
        jAa_1.A = b2.readEnumValue(Eba.class);
    }
}

