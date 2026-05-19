/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  rh
 *  rr
 *  ui
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class UG_1 {
    public rh I = rh.LOADING;

    public abstract void J(rr var1);

    public UG_1() {
        UG_1 a2;
    }

    public boolean f() {
        UG_1 a2;
        if (a2.I == rh.READY) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public abstract ui J(PG var1);

    public abstract int f();

    public abstract int J();

    public boolean J() {
        UG_1 a2;
        if (a2.I == rh.LOADING) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void J() {
    }
}

