/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CY
 *  MAa
 *  OCa
 *  TB
 *  aA
 *  ld
 *  nz
 *  uOa
 *  wBa
 *  wra
 */
public final class Hy
implements TB {
    private final uba A;
    private final OCa I;

    /*
     * WARNING - void declaration
     */
    public Hy(OCa oCa, uba uba2) {
        void b2;
        Hy a2;
        uba c2 = uba2;
        Hy hy2 = a2 = this;
        hy2.I = b2;
        hy2.A = c2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(MAa mAa2) {
        void a2;
        Hy hy2 = this;
        switch (Raa.I[a2.J().ordinal()]) {
            case 1: {
                Hy b2;
                while (false) {
                }
                hy2.A.J(wBa.LOGIN);
                if (a2.J() > uOa.F) {
                    b2 = new CY(sOa.X);
                    Hy hy3 = hy2;
                    hy3.A.J(new sBa((ld)b2));
                    hy3.A.J((ld)b2);
                    return;
                }
                if (a2.J() < uOa.F) {
                    b2 = new CY(wra.Y);
                    Hy hy4 = hy2;
                    hy4.A.J(new sBa((ld)b2));
                    hy4.A.J((ld)b2);
                    return;
                }
                Hy hy5 = hy2;
                hy2.A.J((aA)new nz(hy5.I, hy5.A));
                return;
            }
            case 2: {
                Hy hy6 = hy2;
                hy6.A.J(wBa.STATUS);
                Hy hy7 = hy2;
                hy6.A.J((aA)new uz(hy7.I, hy7.A));
                return;
            }
        }
        throw new UnsupportedOperationException(new StringBuilder().insert(5 >> 3, sra.N).append(a2.J()).toString());
    }

    public void J(ld object) {
        Hy b2 = object;
        object = this;
    }
}

