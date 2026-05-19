/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  pQa
 *  vRa
 *  yk
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class ul
extends RL {
    /*
     * WARNING - void declaration
     */
    public ul(t[] tArray, String string) throws Exception {
        void b2;
        String c2 = string;
        ul a2 = this;
        super((t[])b2, c2);
    }

    @Override
    public boolean f() {
        return vRa.d != 0;
    }

    @Override
    public t J() {
        ul a2;
        ul ul2 = a2;
        a2.result.J(ul2.J());
        return ul2.result;
    }

    @Override
    public boolean J() {
        ul a2;
        return yk.isTrue((double)a2.J());
    }

    @Override
    public void J(int n2, t t2) {
        t c2 = t2;
        ul a2 = this;
        if (c2.f()) {
            throw new IllegalStateException(new StringBuilder().insert(3 ^ 3, yRa.G).append(a2.name).append(pQa.ha).toString());
        }
    }

    @Override
    public String J() {
        return Mqa.y;
    }
}

