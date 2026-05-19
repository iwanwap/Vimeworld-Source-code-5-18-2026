/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  fA
 *  wca
 */
import java.io.IOException;

public final class wca_1
implements KC<fA> {
    private String I;

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        wca_1 a2 = this;
        b2.writeString(a2.I);
    }

    public wca_1(String string) {
        Object b2 = string;
        wca_1 a2 = this;
        if (((String)b2).length() > ySa.T) {
            b2 = ((String)b2).substring(uSa.E, ySa.T);
        }
        a2.I = b2;
    }

    public wca_1() {
        wca_1 a2;
    }

    @Override
    public void J(Lca lca) throws IOException {
        Lca b2 = lca;
        wca_1 a2 = this;
        a2.I = b2.readStringFromBuffer(ySa.T);
    }

    @Override
    public void J(fA fA2) {
        wca_1 b2 = fA2;
        wca_1 a2 = this;
        b2.J((wca)a2);
    }

    public String J() {
        wca_1 a2;
        return a2.I;
    }
}

