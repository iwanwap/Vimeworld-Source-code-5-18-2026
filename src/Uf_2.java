/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  D
 *  JPa
 *  Uf
 *  Uqa
 *  Waa
 *  bqa
 *  cra
 *  pqa
 *  sB
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Uf_2
implements D {
    private float scaleY;
    private float scaleX;
    private float rotateZ;
    private float y;
    private float rotateY;
    private float x;
    private float scaleZ;
    private String boneName;
    private float z;
    private float rotateX;

    public void J(String string) {
        String b2 = string;
        Uf_2 a2 = this;
        a2.boneName = b2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Uf uf2, Uf uf3, float f2, d d2) {
        void b2;
        d e2;
        void c2;
        void d3;
        Uf_2 a2;
        Uf_2 uf_2 = d4;
        d d4 = d2;
        Uf_2 uf_22 = a2 = uf_2;
        void v2 = d3;
        Uf_2 uf_23 = a2;
        void v4 = d3;
        Uf_2 uf_24 = a2;
        void v6 = d3;
        a2.x = sB.J((float)v6.x, (float)c2.x, (float)((float)e2.J((double)b2)));
        uf_24.y = sB.J((float)v6.y, (float)c2.y, (float)((float)e2.J((double)b2)));
        uf_24.z = sB.J((float)d3.z, (float)c2.z, (float)((float)e2.J((double)b2)));
        a2.scaleX = sB.J((float)v4.scaleX, (float)c2.scaleX, (float)((float)e2.J((double)b2)));
        uf_23.scaleY = sB.J((float)v4.scaleY, (float)c2.scaleY, (float)((float)e2.J((double)b2)));
        uf_23.scaleZ = sB.J((float)d3.scaleZ, (float)c2.scaleZ, (float)((float)e2.J((double)b2)));
        a2.rotateX = sB.J((float)v2.rotateX, (float)c2.rotateX, (float)((float)e2.J((double)b2)));
        uf_22.rotateY = sB.J((float)v2.rotateY, (float)c2.rotateY, (float)((float)e2.J((double)b2)));
        uf_22.rotateZ = sB.J((float)d3.rotateZ, (float)c2.rotateZ, (float)((float)e2.J((double)b2)));
    }

    public float A() {
        Uf_2 a2;
        return a2.rotateX;
    }

    public float i() {
        Uf_2 a2;
        return a2.rotateZ;
    }

    public void A(float f2) {
        float b2 = f2;
        Uf_2 a2 = this;
        a2.scaleZ = b2;
    }

    public float M() {
        Uf_2 a2;
        return a2.scaleX;
    }

    public void i(float f2) {
        float b2 = f2;
        Uf_2 a2 = this;
        a2.rotateZ = b2;
    }

    public float e() {
        Uf_2 a2;
        return a2.scaleY;
    }

    public String J() {
        Uf_2 a2;
        return a2.boneName;
    }

    public void M(float f2) {
        float b2 = f2;
        Uf_2 a2 = this;
        a2.rotateX = b2;
    }

    public void e(float f2) {
        float b2 = f2;
        Uf_2 a2 = this;
        a2.x = b2;
    }

    public void d(float f2) {
        float b2 = f2;
        Uf_2 a2 = this;
        a2.scaleY = b2;
    }

    public Uf_2(String string) {
        Uf_2 a2;
        String b2 = string;
        Uf_2 uf_2 = a2 = this;
        a2.scaleX = pqa.r;
        uf_2.scaleY = pqa.r;
        uf_2.scaleZ = pqa.r;
        uf_2.boneName = b2;
    }

    public float d() {
        Uf_2 a2;
        return a2.scaleZ;
    }

    public float C() {
        Uf_2 a2;
        return a2.z;
    }

    public float l() {
        Uf_2 a2;
        return a2.rotateY;
    }

    public Uf clone() {
        Uf_2 uf_2 = this;
        Uf_2 a2 = new Uf_2(uf_2.boneName);
        Uf_2 uf_22 = uf_2;
        Uf_2 uf_23 = a2;
        Uf_2 uf_24 = uf_2;
        Uf_2 uf_25 = a2;
        Uf_2 uf_26 = uf_2;
        a2.x = uf_26.x;
        uf_25.y = uf_26.y;
        uf_25.z = uf_2.z;
        a2.scaleX = uf_24.scaleX;
        uf_23.scaleY = uf_24.scaleY;
        uf_23.scaleZ = uf_2.scaleZ;
        a2.rotateX = uf_22.rotateX;
        a2.rotateY = uf_22.rotateY;
        a2.rotateZ = uf_2.rotateZ;
        return a2;
    }

    public Waa J(Waa waa2) {
        Uf_2 b2 = waa2;
        Uf_2 a2 = this;
        if (b2 == null) {
            b2 = new Waa();
        }
        if (a2.x != JPa.N) {
            b2.J(DPa.ba, a2.x);
        }
        if (a2.y != JPa.N) {
            b2.J(wua.q, a2.y);
        }
        if (a2.z != JPa.N) {
            b2.J(Psa.V, a2.z);
        }
        if (a2.scaleX != pqa.r) {
            b2.J(cTa.R, a2.scaleX);
        }
        if (a2.scaleY != pqa.r) {
            b2.J(bqa.R, a2.scaleY);
        }
        if (a2.scaleZ != pqa.r) {
            b2.J(nua.c, a2.scaleZ);
        }
        if (a2.rotateX != JPa.N) {
            b2.J(Uqa.H, a2.rotateX);
        }
        if (a2.rotateY != JPa.N) {
            b2.J(mPa.M, a2.rotateY);
        }
        if (a2.rotateZ != JPa.N) {
            b2.J(cra.E, a2.rotateZ);
        }
        return b2;
    }

    public float f() {
        Uf_2 a2;
        return a2.x;
    }

    public void C(float f2) {
        float b2 = f2;
        Uf_2 a2 = this;
        a2.y = b2;
    }

    public void l(float f2) {
        float b2 = f2;
        Uf_2 a2 = this;
        a2.rotateY = b2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object object) {
        void a2;
        Uf_2 uf_2 = this;
        if (a2 instanceof Uf_2) {
            Uf_2 b2 = (Uf_2)a2;
            int n2 = b2.x == uf_2.x && b2.y == uf_2.y && b2.z == uf_2.z ? vRa.d : uSa.E;
            n2 = n2 != 0 && b2.scaleX == uf_2.scaleX && b2.scaleY == uf_2.scaleY && b2.scaleZ == uf_2.scaleZ ? vRa.d : uSa.E;
            n2 = n2 != 0 && b2.rotateX == uf_2.rotateX && b2.rotateY == uf_2.rotateY && b2.rotateZ == uf_2.rotateZ ? vRa.d : uSa.E;
            return n2 != 0;
        }
        return super.equals(a2);
    }

    public void f(float f2) {
        float b2 = f2;
        Uf_2 a2 = this;
        a2.z = b2;
    }

    public void J(Waa waa2) {
        Uf_2 b2 = waa2;
        Uf_2 a2 = this;
        if (b2.J(DPa.ba, zOa.v)) {
            a2.x = b2.J(DPa.ba);
        }
        if (b2.J(wua.q, zOa.v)) {
            a2.y = b2.J(wua.q);
        }
        if (b2.J(Psa.V, zOa.v)) {
            a2.z = b2.J(Psa.V);
        }
        if (b2.J(cTa.R, zOa.v)) {
            a2.scaleX = b2.J(cTa.R);
        }
        if (b2.J(bqa.R, zOa.v)) {
            a2.scaleY = b2.J(bqa.R);
        }
        if (b2.J(nua.c, zOa.v)) {
            a2.scaleZ = b2.J(nua.c);
        }
        if (b2.J(Uqa.H, zOa.v)) {
            a2.rotateX = b2.J(Uqa.H);
        }
        if (b2.J(mPa.M, zOa.v)) {
            a2.rotateY = b2.J(mPa.M);
        }
        if (b2.J(cra.E, zOa.v)) {
            a2.rotateZ = b2.J(cra.E);
        }
    }

    public void J(float f2) {
        float b2 = f2;
        Uf_2 a2 = this;
        a2.scaleX = b2;
    }

    public float J() {
        Uf_2 a2;
        return a2.y;
    }
}

