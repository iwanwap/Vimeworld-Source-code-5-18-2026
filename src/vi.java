/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  UG
 *  pua
 *  rr
 *  ui
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class vi
extends UG {
    public UG I;

    public vi() {
        vi a2;
    }

    public int J() {
        vi a2;
        if (a2.I == null) {
            return pua.o;
        }
        return a2.I.J();
    }

    public int f() {
        vi a2;
        if (a2.I == null) {
            return pua.o;
        }
        return a2.I.f();
    }

    public ui J(PG pG2) {
        Object b2 = pG2;
        vi a2 = this;
        if (a2.I == null) {
            return ui.M;
        }
        return a2.I.J((PG)b2);
    }

    public void J() {
        vi a2;
        if (a2.I != null) {
            a2.I.J();
            a2.I = null;
        }
    }

    public void J(rr rr2) {
        vi b2 = rr2;
        vi a2 = this;
        if (a2.I != null) {
            a2.I.J((rr)b2);
        }
    }

    public UG J() {
        vi a2;
        return a2.I;
    }
}

