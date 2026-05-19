/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gEa
 *  vRa
 *  wOa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class PEa {
    private final String A;
    private final gEa I;

    public String toString() {
        PEa a2;
        return new StringBuilder().insert(2 & 5, wOa.D).append(a2.I).append(uqa.Da).append(a2.A).append((char)CRa.L).append((char)ySa.Z).toString();
    }

    /*
     * WARNING - void declaration
     */
    public PEa(gEa gEa2, String string) {
        void b2;
        PEa a2;
        String c2 = string;
        PEa pEa2 = a2 = this;
        pEa2.I = b2;
        pEa2.A = c2;
    }

    public gEa J() {
        PEa a2;
        return a2.I;
    }

    public String J() {
        PEa a2;
        return a2.A;
    }

    public int hashCode() {
        PEa pEa2 = this;
        int a2 = pEa2.I.hashCode();
        a2 = tua.U * a2 + (pEa2.A != null ? pEa2.A.hashCode() : uSa.E);
        return a2;
    }

    public boolean equals(Object object) {
        Object a2 = this;
        Object b2 = object;
        if (a2 == b2) {
            return vRa.d != 0;
        }
        if (b2 != null && a2.getClass() == b2.getClass()) {
            b2 = (PEa)b2;
            if (((PEa)a2).I != ((PEa)b2).I) {
                return uSa.E != 0;
            }
            if (((PEa)a2).A != null ? !((PEa)a2).A.equals(((PEa)b2).A) : ((PEa)b2).A != null) {
                return uSa.E != 0;
            }
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

