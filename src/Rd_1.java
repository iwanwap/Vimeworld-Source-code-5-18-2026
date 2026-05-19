/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cb
 *  Rd
 *  Spa
 *  hqa
 *  pua
 *  uKa
 *  xb
 */
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class Rd_1
implements H {
    public boolean mipmap;
    private static final String __OBFID = "CL_00001047";
    public boolean blur;
    public boolean mipmapLast;
    public int glTextureId = pua.o;
    public Cb multiTex;
    public boolean blurLast;

    public Rd_1() {
        Rd_1 a2;
    }

    @Override
    public Cb J() {
        Rd_1 a2;
        return xb.J((Rd)a2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(boolean bl, boolean bl2) {
        void b2;
        Rd_1 a2;
        boolean c2 = bl2;
        Rd_1 rd_1 = a2 = this;
        a2.blurLast = a2.blur;
        rd_1.mipmapLast = rd_1.mipmap;
        rd_1.f((boolean)b2, c2);
    }

    public void l() {
        Rd_1 a2;
        Rd_1 rd_1 = a2;
        xb.J((Rd)rd_1, (int)rd_1.glTextureId);
        if (rd_1.glTextureId != pua.o) {
            gLa.J(a2.glTextureId);
            a2.glTextureId = pua.o;
        }
    }

    @Override
    public void J() {
        Rd_1 a2;
        Rd_1 rd_1 = a2;
        rd_1.f(a2.blurLast, rd_1.mipmapLast);
    }

    /*
     * WARNING - void declaration
     */
    public void f(boolean n2, boolean bl) {
        Rd_1 rd_1;
        int n3;
        void a2;
        Rd_1 b2;
        int c2 = n2;
        Rd_1 rd_12 = b2 = this;
        rd_12.blur = c2;
        rd_12.mipmap = a2;
        if (c2 != 0) {
            c2 = a2 != false ? ITa.n : rSa.z;
            n3 = rSa.z;
            rd_1 = b2;
        } else {
            c2 = a2 != false ? Spa.Ha : hqa.s;
            n3 = hqa.s;
            rd_1 = b2;
        }
        uKa.C((int)rd_1.J());
        GL11.glTexParameteri(BQa.Z, lQa.E, c2);
        GL11.glTexParameteri(BQa.Z, wua.C, n3);
    }

    @Override
    public int J() {
        Rd_1 a2;
        if (a2.glTextureId == pua.o) {
            a2.glTextureId = gLa.J();
        }
        return a2.glTextureId;
    }
}

