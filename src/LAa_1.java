/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  LAa
 *  Pd
 */
import java.io.IOException;

public final class LAa_1
implements KC<Pd> {
    private String[] I;

    public String[] J() {
        LAa_1 a2;
        return a2.I;
    }

    public LAa_1() {
        LAa_1 a2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Lca lca) throws IOException {
        int b2;
        void a2;
        LAa_1 lAa_1 = this;
        a2.writeVarIntToBuffer(lAa_1.I.length);
        String[] stringArray = lAa_1.I;
        int n2 = lAa_1.I.length;
        int n3 = b2 = uSa.E;
        while (n3 < n2) {
            String string = stringArray[b2];
            a2.writeString(string);
            n3 = ++b2;
        }
    }

    public LAa_1(String[] stringArray) {
        String[] b2 = stringArray;
        String[] a2 = this;
        a2.I = b2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Lca lca) throws IOException {
        int b2;
        void a2;
        LAa_1 lAa_1 = this;
        lAa_1.I = new String[a2.readVarIntFromBuffer()];
        int n2 = b2 = uSa.E;
        while (n2 < lAa_1.I.length) {
            lAa_1.I[b2++] = a2.readStringFromBuffer(BQa.h);
            n2 = b2;
        }
    }

    @Override
    public void J(Pd pd2) {
        LAa_1 b2 = pd2;
        LAa_1 a2 = this;
        b2.J((LAa)a2);
    }
}

