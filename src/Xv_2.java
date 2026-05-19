/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  MD
 *  SQa
 *  Xv
 *  aPa
 *  cQa
 *  nW
 *  vRa
 *  wOa
 */
import com.google.common.base.Objects;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Xv_2 {
    public int minZ;
    public int maxZ;
    public int maxX;
    public int maxY;
    public int minX;
    public int minY;

    public boolean J(Xv xv2) {
        Xv_2 b2 = xv2;
        Xv_2 a2 = this;
        if (a2.maxX >= b2.minX && a2.minX <= b2.maxX && a2.maxZ >= b2.minZ && a2.minZ <= b2.maxZ && a2.maxY >= b2.minY && a2.minY <= b2.maxY) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public MD f() {
        Xv_2 a2;
        Xv_2 xv_2 = a2;
        Xv_2 xv_22 = a2;
        Xv_2 xv_23 = a2;
        return new XF(xv_2.minX + (xv_2.maxX - a2.minX + vRa.d) / uqa.g, xv_22.minY + (xv_22.maxY - a2.minY + vRa.d) / uqa.g, xv_23.minZ + (xv_23.maxZ - a2.minZ + vRa.d) / uqa.g);
    }

    public OAa J() {
        Xv_2 a2;
        int[] nArray = new int[uua.p];
        nArray[uSa.E] = a2.minX;
        nArray[vRa.d] = a2.minY;
        nArray[uqa.g] = a2.minZ;
        nArray[yRa.d] = a2.maxX;
        nArray[AQa.P] = a2.maxY;
        nArray[tTa.h] = a2.maxZ;
        return new OAa(nArray);
    }

    public int l() {
        Xv_2 a2;
        Xv_2 xv_2 = a2;
        return xv_2.maxZ - xv_2.minZ + vRa.d;
    }

    /*
     * WARNING - void declaration
     */
    public Xv_2(int n2, int n3, int n4, int n5) {
        void e2;
        void b2;
        void c2;
        void d2;
        Xv_2 a2;
        int n6 = n5;
        Xv_2 xv_2 = a2 = this;
        Xv_2 xv_22 = a2;
        Xv_2 xv_23 = a2;
        xv_23.minX = d2;
        xv_23.minZ = c2;
        xv_22.maxX = b2;
        xv_2.maxZ = e2;
        xv_22.minY = vRa.d;
        xv_2.maxY = cQa.z;
    }

    public boolean J(MD mD2) {
        Xv_2 b2 = mD2;
        Xv_2 a2 = this;
        if (b2.getX() >= a2.minX && b2.getX() <= a2.maxX && b2.getZ() >= a2.minZ && b2.getZ() <= a2.maxZ && b2.getY() >= a2.minY && b2.getY() <= a2.maxY) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public Xv_2() {
        Xv_2 a2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(int n2, int n3, int n4, int n5) {
        void e2;
        void c2;
        void b2;
        void d2;
        int n6 = n5;
        Xv_2 a2 = this;
        if (a2.maxX >= d2 && a2.minX <= b2 && a2.maxZ >= c2 && a2.minZ <= e2) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static Xv J(int n2, int n3, int n4, int n5, int n6, int n7) {
        int f2;
        void d2;
        void b2;
        void e2;
        void c2;
        int n8 = n2;
        n2 = n7;
        int a2 = n8;
        return new Xv_2(Math.min(a2, (int)c2), Math.min((int)e2, (int)b2), Math.min((int)d2, f2), Math.max(a2, (int)c2), Math.max((int)e2, (int)b2), Math.max((int)d2, f2));
    }

    public void J(Xv xv2) {
        Xv_2 a2;
        Xv_2 b2 = xv2;
        Xv_2 xv_2 = a2 = this;
        xv_2.minX = Math.min(xv_2.minX, b2.minX);
        xv_2.minY = Math.min(xv_2.minY, b2.minY);
        xv_2.minZ = Math.min(xv_2.minZ, b2.minZ);
        xv_2.maxX = Math.max(xv_2.maxX, b2.maxX);
        xv_2.maxY = Math.max(xv_2.maxY, b2.maxY);
        xv_2.maxZ = Math.max(xv_2.maxZ, b2.maxZ);
    }

    /*
     * WARNING - void declaration
     */
    public static Xv J(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, DZ dZ2) {
        void c2;
        void d2;
        int j2;
        void b2;
        void h2;
        void f2;
        void i2;
        void g2;
        void a2;
        int n11 = n2;
        n2 = n7;
        int e2 = n11;
        switch (nW.$SwitchMap$net$minecraft$util$EnumFacing[a2.ordinal()]) {
            case 1: {
                return new Xv_2(e2 + g2, (int)(i2 + f2), (int)(h2 - b2 + vRa.d + j2), e2 + d2 - vRa.d + g2, (int)(i2 + c2 - vRa.d + f2), (int)(h2 + j2));
            }
            case 2: {
                return new Xv_2(e2 + g2, (int)(i2 + f2), (int)(h2 + j2), e2 + d2 - vRa.d + g2, (int)(i2 + c2 - vRa.d + f2), (int)(h2 + b2 - vRa.d + j2));
            }
            case 3: {
                return new Xv_2(e2 - b2 + vRa.d + j2, (int)(i2 + f2), (int)(h2 + g2), e2 + j2, (int)(i2 + c2 - vRa.d + f2), (int)(h2 + d2 - vRa.d + g2));
            }
            case 4: {
                return new Xv_2(e2 + j2, (int)(i2 + f2), (int)(h2 + g2), e2 + b2 - vRa.d + j2, (int)(i2 + c2 - vRa.d + f2), (int)(h2 + d2 - vRa.d + g2));
            }
        }
        return new Xv_2(e2 + g2, (int)(i2 + f2), (int)(h2 + j2), e2 + d2 - vRa.d + g2, (int)(i2 + c2 - vRa.d + f2), (int)(h2 + b2 - vRa.d + j2));
    }

    public int f() {
        Xv_2 a2;
        Xv_2 xv_2 = a2;
        return xv_2.maxY - xv_2.minY + vRa.d;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4) {
        void b2;
        void c2;
        Xv_2 a2;
        int d2 = n4;
        Xv_2 xv_2 = a2 = this;
        xv_2.minX += c2;
        xv_2.minY += b2;
        xv_2.minZ += d2;
        xv_2.maxX += c2;
        xv_2.maxY += b2;
        xv_2.maxZ += d2;
    }

    public int J() {
        Xv_2 a2;
        Xv_2 xv_2 = a2;
        return xv_2.maxX - xv_2.minX + vRa.d;
    }

    public Xv_2(int[] nArray) {
        Object b2 = nArray;
        Xv_2 a2 = this;
        if (((Object)b2).length == uua.p) {
            Xv_2 xv_2 = a2;
            Object object = b2;
            Xv_2 xv_22 = a2;
            Object object2 = b2;
            a2.minX = (int)object2[uSa.E];
            xv_22.minY = (int)object2[vRa.d];
            xv_22.minZ = (int)b2[uqa.g];
            a2.maxX = (int)object[yRa.d];
            xv_2.maxY = (int)object[AQa.P];
            xv_2.maxZ = (int)b2[tTa.h];
        }
    }

    public Xv_2(Xv xv2) {
        Xv_2 a2;
        Xv_2 b2 = xv2;
        Xv_2 xv_2 = a2 = this;
        Xv_2 xv_22 = b2;
        Xv_2 xv_23 = a2;
        Xv_2 xv_24 = b2;
        a2.minX = xv_24.minX;
        xv_23.minY = xv_24.minY;
        xv_23.minZ = b2.minZ;
        a2.maxX = xv_22.maxX;
        xv_2.maxY = xv_22.maxY;
        xv_2.maxZ = b2.maxZ;
    }

    public String toString() {
        Xv_2 a2;
        return Objects.toStringHelper(a2).add(vqa.w, a2.minX).add(aPa.M, a2.minY).add(SQa.b, a2.minZ).add(xua.R, a2.maxX).add(Qpa.Ga, a2.maxY).add(wOa.y, a2.maxZ).toString();
    }

    /*
     * WARNING - void declaration
     */
    public Xv_2(MD mD2, MD mD3) {
        void b2;
        Xv_2 a2;
        Xv_2 c2 = mD3;
        Xv_2 xv_2 = a2 = this;
        void v1 = b2;
        Xv_2 xv_22 = a2;
        void v3 = b2;
        a2.minX = Math.min(v3.getX(), c2.getX());
        xv_22.minY = Math.min(v3.getY(), c2.getY());
        xv_22.minZ = Math.min(b2.getZ(), c2.getZ());
        a2.maxX = Math.max(v1.getX(), c2.getX());
        xv_2.maxY = Math.max(v1.getY(), c2.getY());
        xv_2.maxZ = Math.max(b2.getZ(), c2.getZ());
    }

    /*
     * WARNING - void declaration
     */
    public Xv_2(int n2, int n3, int n4, int n5, int n6, int n7) {
        void g2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        Xv_2 a2;
        int n8 = n7;
        Xv_2 xv_2 = a2 = this;
        Xv_2 xv_22 = a2;
        Xv_2 xv_23 = a2;
        xv_23.minX = f2;
        xv_23.minY = e2;
        xv_22.minZ = d2;
        xv_22.maxX = c2;
        xv_2.maxY = b2;
        xv_2.maxZ = g2;
    }

    public MD J() {
        Xv_2 a2;
        Xv_2 xv_2 = a2;
        Xv_2 xv_22 = a2;
        Xv_2 xv_23 = a2;
        return new MD(xv_2.maxX - xv_2.minX, xv_22.maxY - xv_22.minY, xv_23.maxZ - xv_23.minZ);
    }

    public static Xv J() {
        return new Xv_2(vqa.F, vqa.F, vqa.F, ypa.L, ypa.L, ypa.L);
    }
}

