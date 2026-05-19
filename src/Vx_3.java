/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Waa
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class Vx_3 {
    private boolean dirty;
    public final String mapName;

    public abstract void f(Waa var1);

    public void J() {
        Vx_3 a2;
        a2.J(vRa.d != 0);
    }

    public void J(boolean bl2) {
        boolean b2 = bl2;
        Vx_3 a2 = this;
        a2.dirty = b2;
    }

    public boolean J() {
        Vx_3 a2;
        return a2.dirty;
    }

    public abstract void J(Waa var1);

    public Vx_3(String string) {
        String b2 = string;
        Vx_3 a2 = this;
        a2.mapName = b2;
    }
}

