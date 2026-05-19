/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 *  yk
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class JK_2
extends RL {
    @Override
    public boolean f() {
        return vRa.d != 0;
    }

    @Override
    public t J() {
        JK_2 a2;
        JK_2 jK_2 = a2;
        a2.result.J(jK_2.J());
        return jK_2.result;
    }

    @Override
    public boolean J() {
        JK_2 a2;
        return yk.isTrue((double)a2.J());
    }

    @Override
    public String J() {
        return Mqa.y;
    }

    @Override
    public void J(int n2, t t2) {
        t c2 = t2;
        JK_2 a2 = this;
        if (!c2.f()) {
            throw new IllegalStateException(new StringBuilder().insert(2 & 5, yRa.G).append(a2.name).append(ITa.C).toString());
        }
    }

    /*
     * WARNING - void declaration
     */
    public JK_2(t[] tArray, String string) throws Exception {
        void b2;
        String c2 = string;
        JK_2 a2 = this;
        super((t[])b2, c2);
    }
}

