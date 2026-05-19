/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Pca
 */
public final class lz_1
implements cd {
    public final /* synthetic */ Cba I;

    @Override
    public void l(PX object, double d2) {
        Object c2 = object;
        object = this;
    }

    @Override
    public void J(PX pX, double d2, double d3, long l2) {
        PX e2 = pX;
        lz_1 d4 = this;
        d4.I.J(new Oca(e2, Pca.LERP_SIZE));
    }

    @Override
    public void J(PX pX, double d2, double d3) {
        PX d4 = pX;
        lz_1 c2 = this;
        c2.I.J(new Oca(d4, Pca.SET_CENTER));
    }

    public lz_1(Cba cba) {
        Cba b2 = cba;
        lz_1 a2 = this;
        a2.I = b2;
    }

    @Override
    public void J(PX object, double d2) {
        Object c2 = object;
        object = this;
    }

    @Override
    public void f(PX pX, int n2) {
        PX c2 = pX;
        lz_1 b2 = this;
        b2.I.J(new Oca(c2, Pca.SET_WARNING_TIME));
    }

    @Override
    public void f(PX pX, double d2) {
        PX c2 = pX;
        lz_1 b2 = this;
        b2.I.J(new Oca(c2, Pca.SET_SIZE));
    }

    @Override
    public void J(PX pX, int n2) {
        PX c2 = pX;
        lz_1 b2 = this;
        b2.I.J(new Oca(c2, Pca.SET_WARNING_BLOCKS));
    }
}

