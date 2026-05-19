/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  YQ
 *  uf
 */
import java.util.function.Consumer;

public final class mf_3
implements Consumer {
    private final uf I;

    private mf_3(uf uf2) {
        mf_3 b2 = uf2;
        mf_3 a2 = this;
        a2.I = b2;
    }

    public static Consumer J(uf a2) {
        return new mf_3(a2);
    }

    public void accept(Object object) {
        Object b2 = object;
        mf_3 a2 = this;
        uf.J((uf)a2.I, (YQ)((YQ)b2));
    }
}

