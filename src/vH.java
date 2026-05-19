/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Di
 *  Zg
 *  cH
 *  fH
 *  ng
 *  pua
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class vH {
    private int j;
    private final fH<Zg> J;
    private int A;
    private final fH<Zg> I;

    /*
     * WARNING - void declaration
     */
    private Zg d(int n2, int n3, int n4, int n5, boolean bl) {
        int n6;
        vH vH2 = this;
        vH f2 = new Zg();
        new Zg().score2 = vqa.F;
        int n7 = n6 = uSa.E;
        while (n7 < vH2.I.A) {
            void b2;
            void c2;
            void a2;
            int n8;
            int n9;
            int n10;
            int n11;
            void d2;
            void e2;
            if (((Zg)vH2.I.J((int)n6)).width >= e2 && ((Zg)vH2.I.J((int)n6)).height >= d2) {
                n11 = Math.abs(((Zg)vH2.I.J((int)n6)).width - e2);
                n10 = Math.abs(((Zg)vH2.I.J((int)n6)).height - d2);
                n9 = Math.min(n11, n10);
                n8 = Math.max(n11, n10);
                if (n8 < ((Zg)f2).score2 || n8 == ((Zg)f2).score2 && n9 < ((Zg)f2).score1) {
                    ((Zg)f2).x = ((Zg)vH2.I.J((int)n6)).x;
                    ((Zg)f2).y = ((Zg)vH2.I.J((int)n6)).y;
                    vH vH3 = f2;
                    vH vH4 = f2;
                    ((Zg)vH4).width = e2;
                    ((Zg)vH4).height = d2;
                    ((Zg)vH3).score1 = n9;
                    ((Zg)vH3).score2 = n8;
                    ((Zg)vH3).rotated = uSa.E;
                }
            }
            if (a2 != false && ((Zg)vH2.I.J((int)n6)).width >= c2 && ((Zg)vH2.I.J((int)n6)).height >= b2) {
                n11 = Math.abs(((Zg)vH2.I.J((int)n6)).width - c2);
                n10 = Math.abs(((Zg)vH2.I.J((int)n6)).height - b2);
                n9 = Math.min(n11, n10);
                n8 = Math.max(n11, n10);
                if (n8 < ((Zg)f2).score2 || n8 == ((Zg)f2).score2 && n9 < ((Zg)f2).score1) {
                    ((Zg)f2).x = ((Zg)vH2.I.J((int)n6)).x;
                    ((Zg)f2).y = ((Zg)vH2.I.J((int)n6)).y;
                    vH vH5 = f2;
                    vH vH6 = f2;
                    ((Zg)vH6).width = c2;
                    ((Zg)vH6).height = b2;
                    ((Zg)vH5).score1 = n9;
                    ((Zg)vH5).score2 = n8;
                    ((Zg)vH5).rotated = vRa.d;
                }
            }
            n7 = ++n6;
        }
        return f2;
    }

    /*
     * WARNING - void declaration
     */
    public Di J(fH<Zg> fH2, ng ng2) {
        vH vH2;
        fH b2;
        block4: {
            vH vH3 = this;
            fH fH3 = b2 = new fH(b2);
            while (fH3.A > 0) {
                int n2 = pua.o;
                vH c2 = new Zg();
                new Zg().score1 = vqa.F;
                new Zg().score2 = vqa.F;
                int n3 = uSa.E;
                while (n3 < b2.A) {
                    void a2;
                    int n4;
                    Zg zg2 = vH3.f((Zg)b2.J(n4), (ng)a2);
                    if (zg2.score1 < ((Zg)c2).score1 || zg2.score1 == ((Zg)c2).score1 && zg2.score2 < ((Zg)c2).score2) {
                        c2.set((Zg)b2.J(n4));
                        vH vH4 = c2;
                        Zg zg3 = zg2;
                        vH vH5 = c2;
                        Zg zg4 = zg2;
                        ((Zg)c2).score1 = zg2.score1;
                        ((Zg)c2).score2 = zg4.score2;
                        ((Zg)vH5).x = zg4.x;
                        ((Zg)vH5).y = zg2.y;
                        ((Zg)c2).width = zg3.width;
                        ((Zg)vH4).height = zg3.height;
                        ((Zg)vH4).rotated = zg2.rotated;
                        n2 = n4;
                    }
                    n3 = ++n4;
                }
                if (n2 == pua.o) {
                    vH2 = vH3;
                    break block4;
                }
                vH3.J((Zg)c2);
                fH fH4 = b2;
                fH3 = fH4;
                fH4.f(n2);
            }
            vH2 = vH3;
        }
        Di di2 = vH2.J();
        di2.i = b2;
        return di2;
    }

    private float J() {
        int a2;
        vH vH2 = this;
        int n2 = uSa.E;
        int n3 = a2 = uSa.E;
        while (n3 < vH2.J.A) {
            n2 += ((Zg)vH2.J.J((int)(++a2))).width * ((Zg)vH2.J.J((int)a2)).height;
            n3 = a2;
        }
        vH vH3 = vH2;
        return (float)n2 / (float)(vH3.A * vH3.j);
    }

    /*
     * WARNING - void declaration
     */
    private Zg C(int n2, int n3, int n4, int n5, boolean bl) {
        vH vH2 = this;
        vH f2 = new Zg();
        ((Zg)f2).score1 = pua.o;
        fH<Zg> fH2 = vH2.I;
        int n6 = uSa.E;
        int n7 = fH2.A;
        int n8 = n6;
        while (n8 < n7) {
            void b2;
            void c2;
            void a2;
            int n9;
            void d2;
            void e2;
            Zg zg2 = (Zg)fH2.J(n6);
            if (zg2.width >= e2 && zg2.height >= d2) {
                Zg zg3 = zg2;
                n9 = vH2.J(zg3.x, zg3.y, (int)e2, (int)d2);
                if (n9 > ((Zg)f2).score1) {
                    vH vH3 = f2;
                    vH vH4 = f2;
                    Zg zg4 = zg2;
                    ((Zg)f2).x = zg4.x;
                    ((Zg)vH4).y = zg4.y;
                    ((Zg)vH4).width = e2;
                    ((Zg)vH3).height = d2;
                    ((Zg)vH3).score1 = n9;
                    ((Zg)vH3).rotated = uSa.E;
                }
            }
            if (a2 != false && zg2.width >= c2 && zg2.height >= b2) {
                Zg zg5 = zg2;
                n9 = vH2.J(zg5.x, zg5.y, (int)c2, (int)b2);
                if (n9 > ((Zg)f2).score1) {
                    vH vH5 = f2;
                    vH vH6 = f2;
                    Zg zg6 = zg2;
                    ((Zg)f2).x = zg6.x;
                    ((Zg)vH6).y = zg6.y;
                    ((Zg)vH6).width = c2;
                    ((Zg)vH5).height = b2;
                    ((Zg)vH5).score1 = n9;
                    ((Zg)vH5).rotated = vRa.d;
                }
            }
            n8 = ++n6;
        }
        return f2;
    }

    public vH() {
        vH a2;
        vH vH2 = a2;
        a2.J = new fH();
        vH2.I = new fH();
    }

    /*
     * WARNING - void declaration
     */
    private Zg l(int n2, int n3, int n4, int n5, boolean bl) {
        int n6;
        vH vH2 = this;
        vH f2 = new Zg();
        new Zg().score1 = vqa.F;
        int n7 = n6 = uSa.E;
        while (n7 < vH2.I.A) {
            void b2;
            void c2;
            void a2;
            int n8;
            void d2;
            void e2;
            if (((Zg)vH2.I.J((int)n6)).width >= e2 && ((Zg)vH2.I.J((int)n6)).height >= d2 && ((n8 = ((Zg)vH2.I.J((int)n6)).y + d2) < ((Zg)f2).score1 || n8 == ((Zg)f2).score1 && ((Zg)vH2.I.J((int)n6)).x < ((Zg)f2).score2)) {
                ((Zg)f2).x = ((Zg)vH2.I.J((int)n6)).x;
                ((Zg)f2).y = ((Zg)vH2.I.J((int)n6)).y;
                vH vH3 = f2;
                vH vH4 = f2;
                ((Zg)vH4).width = e2;
                ((Zg)vH4).height = d2;
                ((Zg)vH3).score1 = n8;
                ((Zg)vH3).score2 = ((Zg)vH2.I.J((int)n6)).x;
                ((Zg)f2).rotated = uSa.E;
            }
            if (a2 != false && ((Zg)vH2.I.J((int)n6)).width >= c2 && ((Zg)vH2.I.J((int)n6)).height >= b2 && ((n8 = ((Zg)vH2.I.J((int)n6)).y + b2) < ((Zg)f2).score1 || n8 == ((Zg)f2).score1 && ((Zg)vH2.I.J((int)n6)).x < ((Zg)f2).score2)) {
                ((Zg)f2).x = ((Zg)vH2.I.J((int)n6)).x;
                ((Zg)f2).y = ((Zg)vH2.I.J((int)n6)).y;
                vH vH5 = f2;
                vH vH6 = f2;
                ((Zg)vH6).width = c2;
                ((Zg)vH6).height = b2;
                ((Zg)vH5).score1 = n8;
                ((Zg)vH5).score2 = ((Zg)vH2.I.J((int)n6)).x;
                ((Zg)f2).rotated = vRa.d;
            }
            n7 = ++n6;
        }
        return f2;
    }

    /*
     * WARNING - void declaration
     */
    private void J(Zg zg2) {
        void a2;
        int b2;
        vH vH2 = this;
        int n2 = vH2.I.A;
        int n3 = b2 = uSa.E;
        while (n3 < n2) {
            vH vH3 = vH2;
            if (vH3.J((Zg)vH3.I.J(b2), (Zg)a2)) {
                vH2.I.f(b2);
                --n2;
                --b2;
            }
            n3 = ++b2;
        }
        vH vH4 = vH2;
        vH4.J();
        vH4.J.J((Object)a2);
    }

    /*
     * WARNING - void declaration
     */
    private Zg f(int n2, int n3, int n4, int n5, boolean bl) {
        int n6;
        vH vH2 = this;
        vH f2 = new Zg();
        new Zg().score1 = vqa.F;
        int n7 = n6 = uSa.E;
        while (n7 < vH2.I.A) {
            void b2;
            void c2;
            void a2;
            int n8;
            int n9;
            int n10;
            int n11;
            void d2;
            void e2;
            if (((Zg)vH2.I.J((int)n6)).width >= e2 && ((Zg)vH2.I.J((int)n6)).height >= d2) {
                n11 = Math.abs(((Zg)vH2.I.J((int)n6)).width - e2);
                n10 = Math.abs(((Zg)vH2.I.J((int)n6)).height - d2);
                n9 = Math.min(n11, n10);
                n8 = Math.max(n11, n10);
                if (n9 < ((Zg)f2).score1 || n9 == ((Zg)f2).score1 && n8 < ((Zg)f2).score2) {
                    ((Zg)f2).x = ((Zg)vH2.I.J((int)n6)).x;
                    ((Zg)f2).y = ((Zg)vH2.I.J((int)n6)).y;
                    vH vH3 = f2;
                    vH vH4 = f2;
                    ((Zg)vH4).width = e2;
                    ((Zg)vH4).height = d2;
                    ((Zg)vH3).score1 = n9;
                    ((Zg)vH3).score2 = n8;
                    ((Zg)vH3).rotated = uSa.E;
                }
            }
            if (a2 != false && ((Zg)vH2.I.J((int)n6)).width >= c2 && ((Zg)vH2.I.J((int)n6)).height >= b2) {
                n11 = Math.abs(((Zg)vH2.I.J((int)n6)).width - c2);
                n10 = Math.abs(((Zg)vH2.I.J((int)n6)).height - b2);
                n9 = Math.min(n11, n10);
                n8 = Math.max(n11, n10);
                if (n9 < ((Zg)f2).score1 || n9 == ((Zg)f2).score1 && n8 < ((Zg)f2).score2) {
                    ((Zg)f2).x = ((Zg)vH2.I.J((int)n6)).x;
                    ((Zg)f2).y = ((Zg)vH2.I.J((int)n6)).y;
                    vH vH5 = f2;
                    vH vH6 = f2;
                    ((Zg)vH6).width = c2;
                    ((Zg)vH6).height = b2;
                    ((Zg)vH5).score1 = n9;
                    ((Zg)vH5).score2 = n8;
                    ((Zg)vH5).rotated = vRa.d;
                }
            }
            n7 = ++n6;
        }
        return f2;
    }

    private void J() {
        vH vH2 = this;
        fH<Zg> fH2 = vH2.I;
        int a2 = uSa.E;
        int n2 = fH2.A;
        int n3 = a2;
        while (n3 < n2) {
            int n4 = a2 + vRa.d;
            while (n4 < n2) {
                int n5;
                Zg zg2;
                Zg zg3 = (Zg)fH2.J(a2);
                if (vH2.f(zg3, zg2 = (Zg)fH2.J(n5))) {
                    fH2.f(a2);
                    --n2;
                    --a2;
                    break;
                }
                if (vH2.f(zg2, zg3)) {
                    fH2.f(n5);
                    --n2;
                    --n5;
                }
                n4 = ++n5;
            }
            n3 = ++a2;
        }
    }

    /*
     * WARNING - void declaration
     */
    private boolean f(Zg zg2, Zg zg3) {
        void b2;
        vH c2 = zg3;
        vH a2 = this;
        if (b2.x >= ((Zg)c2).x && b2.y >= ((Zg)c2).y) {
            void v0 = b2;
            vH vH2 = c2;
            if (v0.x + v0.width <= ((Zg)vH2).x + ((Zg)vH2).width) {
                void v2 = b2;
                vH vH3 = c2;
                if (v2.y + v2.height <= ((Zg)vH3).y + ((Zg)vH3).height) {
                    return vRa.d != 0;
                }
            }
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        vH c2;
        void a2;
        void b2;
        vH vH2;
        vH vH3 = vH2 = this;
        vH2.A = b2;
        vH3.j = a2;
        vH2.J.f();
        vH3.I.f();
        vH vH4 = c2 = new Zg();
        vH vH5 = c2;
        ((Zg)vH5).x = uSa.E;
        ((Zg)vH5).y = uSa.E;
        ((Zg)vH4).width = b2;
        ((Zg)vH4).height = a2;
        vH3.I.J((Object)c2);
    }

    public Di J() {
        int a2;
        vH vH2 = this;
        int n2 = uSa.E;
        int n3 = uSa.E;
        int n4 = a2 = uSa.E;
        while (n4 < vH2.J.A) {
            Zg zg2;
            Zg zg3 = zg2 = (Zg)vH2.J.J(a2);
            n2 = Math.max(n2, zg3.x + zg3.width);
            Zg zg4 = zg2;
            n3 = Math.max(n3, zg4.y + zg4.height);
            n4 = ++a2;
        }
        Di di2 = a2 = new Di();
        Di di3 = a2;
        di2.k = new fH(vH2.J);
        di2.J = vH2.J();
        a2.I = n2;
        a2.M = n3;
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    private boolean J(Zg zg2, Zg zg3) {
        Zg zg4;
        void a2;
        vH b2;
        vH c2;
        block14: {
            block13: {
                c2 = zg2;
                b2 = this;
                vH vH2 = c2;
                if (a2.x >= ((Zg)vH2).x + ((Zg)vH2).width) break block13;
                void v1 = a2;
                if (v1.x + v1.width <= ((Zg)c2).x) break block13;
                vH vH3 = c2;
                if (a2.y >= ((Zg)vH3).y + ((Zg)vH3).height) break block13;
                void v3 = a2;
                if (v3.y + v3.height > ((Zg)c2).y) break block14;
            }
            return uSa.E != 0;
        }
        vH vH4 = c2;
        if (a2.x < ((Zg)vH4).x + ((Zg)vH4).width) {
            void v5 = a2;
            if (v5.x + v5.width > ((Zg)c2).x) {
                if (a2.y > ((Zg)c2).y) {
                    vH vH5 = c2;
                    if (a2.y < ((Zg)vH5).y + ((Zg)vH5).height) {
                        zg4 = new Zg((Zg)c2);
                        zg4.height = a2.y - zg4.y;
                        b2.I.J((Object)zg4);
                    }
                }
                void v7 = a2;
                vH vH6 = c2;
                if (v7.y + v7.height < ((Zg)vH6).y + ((Zg)vH6).height) {
                    Zg zg5 = zg4 = new Zg((Zg)c2);
                    void v10 = a2;
                    zg5.y = v10.y + v10.height;
                    void v11 = a2;
                    zg5.height = ((Zg)c2).y + ((Zg)c2).height - (v11.y + v11.height);
                    b2.I.J((Object)zg4);
                }
            }
        }
        vH vH7 = c2;
        if (a2.y < ((Zg)vH7).y + ((Zg)vH7).height) {
            void v13 = a2;
            if (v13.y + v13.height > ((Zg)c2).y) {
                if (a2.x > ((Zg)c2).x) {
                    vH vH8 = c2;
                    if (a2.x < ((Zg)vH8).x + ((Zg)vH8).width) {
                        zg4 = new Zg((Zg)c2);
                        zg4.width = a2.x - zg4.x;
                        b2.I.J((Object)zg4);
                    }
                }
                void v15 = a2;
                vH vH9 = c2;
                if (v15.x + v15.width < ((Zg)vH9).x + ((Zg)vH9).width) {
                    Zg zg6 = zg4 = new Zg((Zg)c2);
                    void v18 = a2;
                    zg6.x = v18.x + v18.width;
                    void v19 = a2;
                    zg6.width = ((Zg)c2).x + ((Zg)c2).width - (v19.x + v19.width);
                    b2.I.J((Object)zg4);
                }
            }
        }
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private Zg f(Zg zg2, ng ng2) {
        vH vH2;
        void a2;
        int n2;
        void b22;
        vH vH3 = this;
        void v0 = b22;
        int b22 = v0.width;
        int n3 = n2 = v0.height;
        int n4 = b22;
        if (v0.canRotate) {
            // empty if block
        }
        boolean bl = uSa.E;
        vH c2 = null;
        switch (cH.I[a2.ordinal()]) {
            case 1: {
                vH2 = c2 = vH3.f(b22, n2, n3, n4, bl);
                break;
            }
            case 2: {
                vH2 = c2 = vH3.l(b22, n2, n3, n4, bl);
                break;
            }
            case 3: {
                vH2 = c2 = vH3.C(b22, n2, n3, n4, bl);
                ((Zg)c2).score1 = -((Zg)c2).score1;
                break;
            }
            case 4: {
                vH2 = c2 = vH3.d(b22, n2, n3, n4, bl);
                break;
            }
            case 5: {
                c2 = vH3.J(b22, n2, n3, n4, bl);
            }
            default: {
                vH2 = c2;
            }
        }
        if (((Zg)vH2).height == 0) {
            vH vH4 = c2;
            ((Zg)vH4).score1 = vqa.F;
            ((Zg)vH4).score2 = vqa.F;
        }
        return c2;
    }

    /*
     * WARNING - void declaration
     */
    private int f(int n2, int n3, int n4, int n5) {
        void d2;
        void e2;
        void b2;
        void c2;
        int n6 = n5;
        vH a2 = this;
        if (c2 < b2 || e2 < d2) {
            return uSa.E;
        }
        return Math.min((int)c2, (int)e2) - Math.max((int)d2, (int)b2);
    }

    /*
     * WARNING - void declaration
     */
    private int J(int n2, int n3, int n4, int n5) {
        void c2;
        void a2;
        void b2;
        void d2;
        vH vH2 = this;
        int e2 = uSa.E;
        if (d2 == false || d2 + b2 == vH2.A) {
            e2 += a2;
        }
        if (c2 == false || c2 + a2 == vH2.j) {
            e2 += b2;
        }
        fH<Zg> fH2 = vH2.J;
        int n6 = uSa.E;
        int n7 = fH2.A;
        int n8 = n6;
        while (n8 < n7) {
            block12: {
                Zg zg2;
                block11: {
                    block10: {
                        block9: {
                            zg2 = (Zg)fH2.J(n6);
                            if (zg2.x == d2 + b2) break block9;
                            Zg zg3 = zg2;
                            if (zg3.x + zg3.width != d2) break block10;
                        }
                        Zg zg4 = zg2;
                        void v3 = c2;
                        e2 += vH2.f(zg4.y, zg4.y + zg2.height, (int)v3, (int)(v3 + a2));
                    }
                    if (zg2.y == c2 + a2) break block11;
                    Zg zg5 = zg2;
                    if (zg5.y + zg5.height != c2) break block12;
                }
                Zg zg6 = zg2;
                void v6 = d2;
                e2 += vH2.f(zg6.x, zg6.x + zg2.width, (int)v6, (int)(v6 + b2));
            }
            n8 = ++n6;
        }
        return e2;
    }

    /*
     * WARNING - void declaration
     */
    public Zg J(Zg zg2, ng ng2) {
        int c2;
        Zg a2;
        void b2;
        vH vH2 = this;
        a2 = vH2.f((Zg)b2, (ng)a2);
        if (a2.height == 0) {
            return null;
        }
        int n2 = vH2.I.A;
        int n3 = c2 = uSa.E;
        while (n3 < n2) {
            vH vH3 = vH2;
            if (vH3.J((Zg)vH3.I.J(c2), a2)) {
                vH2.I.f(c2);
                --n2;
                --c2;
            }
            n3 = ++c2;
        }
        vH vH4 = vH2;
        vH4.J();
        Zg zg3 = c2 = new Zg();
        Zg zg4 = a2;
        Zg zg5 = c2;
        Zg zg6 = a2;
        c2.set((Zg)b2);
        c2.score1 = a2.score1;
        c2.score2 = zg6.score2;
        zg5.x = zg6.x;
        zg5.y = a2.y;
        c2.width = zg4.width;
        zg3.height = zg4.height;
        zg3.rotated = a2.rotated;
        vH4.J.J((Object)c2);
        return c2;
    }

    /*
     * WARNING - void declaration
     */
    private Zg J(int n2, int n3, int n4, int n5, boolean bl) {
        int f2;
        vH vH2 = this;
        Zg zg2 = new Zg();
        new Zg().score1 = vqa.F;
        int n6 = f2 = uSa.E;
        while (n6 < vH2.I.A) {
            void b2;
            void c2;
            void a2;
            int n7;
            int n8;
            int n9;
            void d2;
            void e2;
            int n10 = ((Zg)vH2.I.J((int)f2)).width * ((Zg)vH2.I.J((int)f2)).height - e2 * d2;
            if (((Zg)vH2.I.J((int)f2)).width >= e2 && ((Zg)vH2.I.J((int)f2)).height >= d2) {
                n9 = Math.abs(((Zg)vH2.I.J((int)f2)).width - e2);
                n8 = Math.abs(((Zg)vH2.I.J((int)f2)).height - d2);
                n7 = Math.min(n9, n8);
                if (n10 < zg2.score1 || n10 == zg2.score1 && n7 < zg2.score2) {
                    zg2.x = ((Zg)vH2.I.J((int)f2)).x;
                    zg2.y = ((Zg)vH2.I.J((int)f2)).y;
                    Zg zg3 = zg2;
                    Zg zg4 = zg2;
                    zg4.width = e2;
                    zg4.height = d2;
                    zg3.score2 = n7;
                    zg3.score1 = n10;
                    zg3.rotated = uSa.E;
                }
            }
            if (a2 != false && ((Zg)vH2.I.J((int)f2)).width >= c2 && ((Zg)vH2.I.J((int)f2)).height >= b2) {
                n9 = Math.abs(((Zg)vH2.I.J((int)f2)).width - c2);
                n8 = Math.abs(((Zg)vH2.I.J((int)f2)).height - b2);
                n7 = Math.min(n9, n8);
                if (n10 < zg2.score1 || n10 == zg2.score1 && n7 < zg2.score2) {
                    zg2.x = ((Zg)vH2.I.J((int)f2)).x;
                    zg2.y = ((Zg)vH2.I.J((int)f2)).y;
                    Zg zg5 = zg2;
                    Zg zg6 = zg2;
                    zg6.width = c2;
                    zg6.height = b2;
                    zg5.score2 = n7;
                    zg5.score1 = n10;
                    zg5.rotated = vRa.d;
                }
            }
            n6 = ++f2;
        }
        return zg2;
    }
}

