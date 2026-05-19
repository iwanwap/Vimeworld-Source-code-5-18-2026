/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Hfa
 *  ld
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class pEa_3 {
    private final Hfa A;
    private final ld I;

    public ld J() {
        pEa_3 a2;
        return a2.I;
    }

    public String toString() {
        pEa_3 a2;
        return new StringBuilder().insert(3 ^ 3, POa.d).append(a2.A).append(uqa.Da).append(a2.I).append((char)CRa.L).append((char)ySa.Z).toString();
    }

    /*
     * WARNING - void declaration
     */
    public pEa_3(Hfa hfa, ld ld2) {
        void b2;
        pEa_3 a2;
        pEa_3 c2 = ld2;
        pEa_3 pEa_32 = a2 = this;
        pEa_32.A = b2;
        pEa_32.I = c2;
    }

    public int hashCode() {
        pEa_3 pEa_32 = this;
        int a2 = pEa_32.A.hashCode();
        a2 = tua.U * a2 + (pEa_32.I != null ? pEa_32.I.hashCode() : uSa.E);
        return a2;
    }

    public boolean equals(Object object) {
        Object a2 = this;
        Object b2 = object;
        if (a2 == b2) {
            return vRa.d != 0;
        }
        if (b2 != null && a2.getClass() == b2.getClass()) {
            b2 = (pEa_3)b2;
            if (((pEa_3)a2).A != ((pEa_3)b2).A) {
                return uSa.E != 0;
            }
            if (((pEa_3)a2).I != null ? !((pEa_3)a2).I.equals(((pEa_3)b2).I) : ((pEa_3)b2).I != null) {
                return uSa.E != 0;
            }
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public Hfa J() {
        pEa_3 a2;
        return a2.A;
    }
}

