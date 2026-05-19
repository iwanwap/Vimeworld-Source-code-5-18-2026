/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  LQa
 *  Uqa
 *  Ypa
 *  pQa
 *  uKa
 *  vRa
 *  wOa
 */
import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class kc_3 {
    public int A;
    public int I;

    private int J(int n2) {
        int b2 = n2;
        kc_3 a2 = this;
        int n3 = b2;
        b2 = n3 ^ n3 << uua.s;
        b2 ^= b2 >> yta.Ka;
        b2 ^= b2 << tTa.h;
        return b2;
    }

    public void J() {
        kc_3 a2;
        uKa.D((int)a2.I);
        a2.I = uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    private byte J(int n2, int n3, int n4) {
        void b2;
        void c2;
        kc_3 a2;
        int d2 = n4;
        kc_3 kc_32 = a2 = this;
        return (byte)(kc_32.J((a2.J((int)c2) + a2.J((int)(b2 * wOa.t))) * kc_32.J(d2 * AQa.ba) - d2) % XOa.h);
    }

    /*
     * WARNING - void declaration
     */
    public kc_3(int n2, int n3) {
        void a2;
        void b2;
        kc_3 kc_32 = this;
        kc_32.I = GL11.glGenTextures();
        kc_32.A = Ypa.A;
        byte[] byArray = kc_32.J((int)b2, (int)a2);
        ByteBuffer c2 = BufferUtils.createByteBuffer(byArray.length);
        c2.put(byArray);
        c2.flip();
        uKa.C((int)kc_32.I);
        GL11.glTexImage2D(BQa.Z, uSa.E, rSa.Da, (int)b2, (int)a2, uSa.E, rSa.Da, Uqa.P, c2);
        GL11.glTexParameteri(BQa.Z, LQa.P, kTa.o);
        GL11.glTexParameteri(BQa.Z, pQa.n, kTa.o);
        GL11.glTexParameteri(BQa.Z, wua.C, rSa.z);
        GL11.glTexParameteri(BQa.Z, lQa.E, rSa.z);
        uKa.C((int)uSa.E);
    }

    public int J() {
        kc_3 a2;
        return a2.I;
    }

    /*
     * WARNING - void declaration
     */
    private byte[] J(int n2, int n3) {
        int n4;
        void a2;
        void b2;
        kc_3 kc_32 = this;
        byte[] byArray = new byte[b2 * a2 * yRa.d];
        int n5 = uSa.E;
        int n6 = n4 = uSa.E;
        while (n6 < a2) {
            int n7 = uSa.E;
            while (n7 < b2) {
                int n8;
                int n9 = vRa.d;
                while (n9 < AQa.P) {
                    int c2;
                    int n10 = n5++;
                    byte by2 = kc_32.J(n8, n4, c2);
                    byArray[n10] = by2;
                    n9 = ++c2;
                }
                n7 = ++n8;
            }
            n6 = ++n4;
        }
        return byArray;
    }
}

