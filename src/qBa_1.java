/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Qba
 *  fA
 *  qBa
 */
import java.io.IOException;

public final class qBa_1
implements KC<fA> {
    private Qba I;

    public qBa_1(Qba qba2) {
        qBa_1 b2 = qba2;
        qBa_1 a2 = this;
        a2.I = b2;
    }

    @Override
    public void J(Lca lca) throws IOException {
        Lca b2 = lca;
        qBa_1 a2 = this;
        a2.I = b2.readEnumValue(Qba.class);
    }

    @Override
    public void J(fA fA2) {
        qBa_1 b2 = fA2;
        qBa_1 a2 = this;
        b2.J((qBa)a2);
    }

    public qBa_1() {
        qBa_1 a2;
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        qBa_1 a2 = this;
        b2.writeEnumValue((Enum<?>)a2.I);
    }

    public Qba J() {
        qBa_1 a2;
        return a2.I;
    }
}

