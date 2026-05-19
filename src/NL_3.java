/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  aSa
 *  pQa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class NL_3
extends RL {
    /*
     * WARNING - void declaration
     */
    public NL_3(t[] tArray, String string) throws Exception {
        void b2;
        String c2 = string;
        NL_3 a2 = this;
        super((t[])b2, c2);
    }

    @Override
    public t J() {
        NL_3 a2;
        NL_3 nL_3 = a2;
        a2.result.J(nL_3.J());
        return nL_3.result;
    }

    @Override
    public boolean J() {
        NL_3 a2;
        return a2.J().equalsIgnoreCase(oQa.l);
    }

    @Override
    public boolean f() {
        return uSa.E != 0;
    }

    @Override
    public void J(int n2, t t2) {
        t c2 = t2;
        NL_3 a2 = this;
        if (c2.f()) {
            throw new IllegalStateException(new StringBuilder().insert(2 & 5, yRa.G).append(a2.name).append(pQa.ha).toString());
        }
    }

    @Override
    public double J() {
        return aSa.V;
    }
}

