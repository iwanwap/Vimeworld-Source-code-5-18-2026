/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  fv
 *  jRa
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class fv_3 {
    public int field_175967_a;
    public int field_175962_f;
    public boolean field_175964_e;
    public boolean[] field_175966_c;
    public boolean field_175963_d;
    public fv[] field_175965_b;

    public fv_3(int n2) {
        int b2 = n2;
        fv_3 a2 = this;
        a2.field_175965_b = new fv_3[uua.p];
        fv_3 fv_32 = a2;
        fv_32.field_175966_c = new boolean[uua.p];
        fv_32.field_175967_a = b2;
    }

    public boolean J() {
        fv_3 a2;
        if (a2.field_175967_a >= jRa.X) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(DZ dZ2, fv fv2) {
        void a2;
        DZ c2 = dZ2;
        fv_3 b2 = this;
        void v0 = a2;
        b2.field_175965_b[c2.getIndex()] = v0;
        v0.field_175965_b[c2.getOpposite().getIndex()] = b2;
    }

    public int J() {
        int a2;
        fv_3 fv_32 = this;
        int n2 = uSa.E;
        int n3 = a2 = uSa.E;
        while (n3 < uua.p) {
            if (fv_32.field_175966_c[a2]) {
                ++n2;
            }
            n3 = ++a2;
        }
        return n2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(int n2) {
        int b2;
        void a2;
        fv_3 fv_32 = this;
        if (fv_32.field_175964_e) {
            return vRa.d != 0;
        }
        fv_32.field_175962_f = a2;
        int n3 = b2 = uSa.E;
        while (n3 < uua.p) {
            if (fv_32.field_175965_b[b2] != null && fv_32.field_175966_c[b2] && fv_32.field_175965_b[b2].field_175962_f != a2 && fv_32.field_175965_b[b2].J((int)a2)) {
                return vRa.d != 0;
            }
            n3 = ++b2;
        }
        return uSa.E != 0;
    }

    public void J() {
        int a2;
        fv_3 fv_32 = this;
        int n2 = a2 = uSa.E;
        while (n2 < uua.p) {
            fv_3 fv_33 = fv_32;
            int n3 = a2;
            fv_33.field_175966_c[n3] = fv_33.field_175965_b[n3] != null ? vRa.d : uSa.E;
            n2 = ++a2;
        }
    }
}

