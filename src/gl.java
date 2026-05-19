/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  aSa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class gl
extends RL {
    @Override
    public double J() {
        return aSa.V;
    }

    @Override
    public boolean J() {
        gl a2;
        return a2.J().equalsIgnoreCase(oQa.l);
    }

    @Override
    public t J() {
        gl a2;
        gl gl2 = a2;
        a2.result.J(gl2.J());
        return gl2.result;
    }

    /*
     * WARNING - void declaration
     */
    public gl(t[] tArray, String string) throws Exception {
        int c2;
        void a2;
        void b2;
        gl gl2 = this;
        void v0 = b2;
        super((t[])v0, (String)a2);
        b2 = v0;
        int n2 = ((void)v0).length;
        int n3 = c2 = uSa.E;
        while (n3 < n2) {
            if (!b2[c2].f()) {
                throw new IllegalStateException(new StringBuilder().insert(3 & 4, yRa.G).append((String)a2).append(ITa.C).toString());
            }
            n3 = ++c2;
        }
    }

    @Override
    public void J(int n2, t t2) {
        t c2 = t2;
        gl a2 = this;
        if (!c2.f()) {
            throw new IllegalStateException(new StringBuilder().insert(3 >> 2, yRa.G).append(a2.name).append(ITa.C).toString());
        }
    }

    @Override
    public boolean f() {
        return uSa.E != 0;
    }
}

