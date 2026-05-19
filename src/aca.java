/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  JPa
 *  Mda
 *  NCa
 *  NTa
 *  Tca
 *  Uqa
 *  Waa
 *  pua
 *  tZ
 *  vRa
 *  waa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class aca
implements UB {
    @Override
    public Mda J(xFa xFa2) {
        aca aca2;
        Waa a2;
        Mda mda2;
        block7: {
            int n2;
            aca aca3 = this;
            mda2 = null;
            int n3 = n2 = uSa.E;
            while (n3 < a2.f()) {
                Mda mda3 = a2.J(n2);
                if (mda3 != null && mda3.J() == Gea.gC) {
                    mda2 = mda3.J();
                    aca2 = aca3;
                    mda2.E = vRa.d;
                    break block7;
                }
                n3 = ++n2;
            }
            aca2 = aca3;
        }
        Bz bz2 = aca2.J((xFa)a2);
        if (bz2 != null) {
            Mda mda4;
            aca b2;
            int n4;
            block8: {
                int n5;
                n4 = uSa.E;
                int n6 = n5 = uSa.E;
                while (n6 < a2.f()) {
                    b2 = a2.J(n5);
                    if (b2 != null && b2.J() == Gea.Q) {
                        mda4 = mda2;
                        n4 = b2.J();
                        break block8;
                    }
                    n6 = ++n5;
                }
                mda4 = mda2;
            }
            Waa waa2 = mda4.J(uua.M, vRa.d != 0);
            b2 = null;
            if (waa2.J(wta.M, WOa.fa)) {
                b2 = waa2.J(wta.M, NTa.C);
            } else {
                b2 = new waa();
                waa2.J(wta.M, (NCa)b2);
            }
            Waa waa3 = a2 = new Waa();
            waa3.J(Uqa.y, bz2.getPatternID());
            waa3.J(JPa.ca, n4);
            b2.J((NCa)waa3);
        }
        return mda2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(xFa xFa2, Gg gg2) {
        void b2;
        int n2;
        aca c22 = gg2;
        aca a2 = this;
        int c22 = uSa.E;
        int n3 = n2 = uSa.E;
        while (n3 < b2.f()) {
            Mda mda2 = b2.J(n2);
            if (mda2 != null && mda2.J() == Gea.gC) {
                if (c22 != 0) {
                    return uSa.E != 0;
                }
                if (tZ.f((Mda)mda2) >= uua.p) {
                    return uSa.E != 0;
                }
                c22 = vRa.d;
            }
            n3 = ++n2;
        }
        if (c22 == 0) {
            return uSa.E != 0;
        }
        if (a2.J((xFa)b2) != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public /* synthetic */ aca(Tca tca2) {
        aca b2 = tca2;
        aca a2 = this;
        a2();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public Mda[] J(xFa xFa2) {
        int b2;
        void a2;
        aca aca2 = this;
        Mda[] mdaArray = new Mda[a2.f()];
        int n2 = b2 = uSa.E;
        while (n2 < mdaArray.length) {
            Mda mda2 = a2.J(b2);
            if (mda2 != null && mda2.J().f()) {
                mdaArray[b2] = new Mda(mda2.J().f());
            }
            n2 = ++b2;
        }
        return mdaArray;
    }

    /*
     * WARNING - void declaration
     */
    private Bz J(xFa xFa2) {
        int n2;
        aca aca2 = this;
        Bz[] bzArray = Bz.values();
        int n3 = bzArray.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            Bz bz2 = bzArray[n2];
            if (bz2.hasValidCrafting()) {
                int n5;
                void a2;
                int n6;
                int n7;
                int b2 = vRa.d;
                if (bz2.hasCraftingStack()) {
                    int n8;
                    block21: {
                        n7 = uSa.E;
                        n6 = uSa.E;
                        int n9 = uSa.E;
                        while (n9 < a2.f() && b2 != 0) {
                            Mda mda2 = a2.J(n5);
                            if (mda2 != null && mda2.J() != Gea.gC) {
                                if (mda2.J() == Gea.Q) {
                                    if (n6 != 0) {
                                        b2 = uSa.E;
                                        n8 = n7;
                                        break block21;
                                    }
                                    n6 = vRa.d;
                                } else {
                                    if (n7 != 0 || !mda2.l(bz2.getCraftingStack())) {
                                        b2 = uSa.E;
                                        n8 = n7;
                                        break block21;
                                    }
                                    n7 = vRa.d;
                                }
                            }
                            n9 = ++n5;
                        }
                        n8 = n7;
                    }
                    if (n8 == 0) {
                        b2 = uSa.E;
                    }
                } else if (a2.f() == bz2.getCraftingLayers().length * bz2.getCraftingLayers()[uSa.E].length()) {
                    n7 = pua.o;
                    int n10 = uSa.E;
                    while (n10 < a2.f() && b2 != 0) {
                        n5 = n6 / yRa.d;
                        int n11 = n6 % yRa.d;
                        Mda mda3 = a2.J(n6);
                        if (mda3 != null && mda3.J() != Gea.gC) {
                            if (mda3.J() != Gea.Q) {
                                b2 = uSa.E;
                                break;
                            }
                            if (n7 != pua.o && n7 != mda3.J()) {
                                b2 = uSa.E;
                                break;
                            }
                            if (bz2.getCraftingLayers()[n5].charAt(n11) == fPa.i) {
                                b2 = uSa.E;
                                break;
                            }
                            n7 = mda3.J();
                        } else if (bz2.getCraftingLayers()[n5].charAt(n11) != fPa.i) {
                            b2 = uSa.E;
                            break;
                        }
                        n10 = ++n6;
                    }
                } else {
                    b2 = uSa.E;
                }
                if (b2 != 0) {
                    return bz2;
                }
            }
            n4 = ++n2;
        }
        return null;
    }

    @Override
    public int J() {
        return NTa.C;
    }

    private aca() {
        aca a2;
    }

    @Override
    public Mda J() {
        return null;
    }
}

