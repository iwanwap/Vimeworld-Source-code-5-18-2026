/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Xc
 */
import java.io.IOException;

public final class dBa
implements KC<Xc> {
    public byte[] I;

    @Override
    public void J(Lca lca) throws IOException {
        Lca b22 = lca;
        dBa a2 = this;
        Object object = b22;
        int b22 = ((Lca)object).readInt();
        a2.I = new byte[b22 + AQa.P];
        ((Lca)object).readBytes(a2.I);
    }

    public dBa() {
        dBa a2;
    }

    @Override
    public void f(Lca object) throws IOException {
        Object b2 = object;
        object = this;
    }

    @Override
    public void J(Xc xc) {
        dBa b2 = xc;
        dBa a2 = this;
        b2.J(a2);
    }
}

