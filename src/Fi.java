/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Di
 *  Zg
 *  hG
 *  ng
 *  pua
 */
public final class Fi {
    public int M;
    public vH k;
    public int j;
    public int J;
    public int A;
    public int I;

    public void J() {
        Fi fi2 = this;
        Fi a2 = fi2.k.J();
        fi2.M = ((Di)a2).I;
        fi2.j = ((Di)a2).M;
    }

    /*
     * WARNING - void declaration
     */
    public hG J(int n2, int n3) {
        void a2;
        void b2;
        Fi fi2 = this;
        Fi c2 = new Zg((int)b2, (int)a2);
        if ((c2 = fi2.k.J((Zg)c2, ng.BestAreaFit)) != null) {
            Fi fi3 = c2;
            return new hG(fi2, ((Zg)fi3).x, ((Zg)fi3).y, (int)b2, (int)a2);
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public Fi(int n2, int n3, boolean bl, int n4) {
        void b2;
        void a2;
        void d2;
        Fi c2;
        int e2 = n3;
        Fi fi2 = c2 = this;
        c2.J = pua.o;
        c2.M = d2;
        fi2.j = e2;
        fi2.I = a2;
        if (b2 != false) {
            c2.k = new vH();
            c2.k.J((int)d2, e2);
        }
    }
}

