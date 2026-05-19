/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  MX
 *  Rv
 *  SRa
 *  Sy
 *  Waa
 *  dX
 *  hz
 *  iY
 *  lPa
 *  vU
 *  yc
 */
import java.io.File;

public final class uZ_3
extends dX {
    public void f() {
        uZ_3 uZ_32 = this;
        try {
            Rv.J().f();
        }
        catch (InterruptedException a2) {
            a2.printStackTrace();
        }
        iY.J();
    }

    /*
     * WARNING - void declaration
     */
    public yc J(Ty ty2) {
        Object b2;
        void a2;
        uZ_3 uZ_32 = this;
        File file = uZ_32.J();
        if (a2 instanceof MX) {
            b2 = new File(file, SRa.g);
            ((File)b2).mkdirs();
            return new Sy((File)b2);
        }
        if (a2 instanceof hz) {
            b2 = new File(file, fPa.X);
            ((File)b2).mkdirs();
            return new Sy((File)b2);
        }
        return new Sy(file);
    }

    /*
     * WARNING - void declaration
     */
    public uZ_3(File file, String string, boolean bl2) {
        void b2;
        void c2;
        boolean d2 = bl2;
        uZ_3 a2 = this;
        super((File)c2, (String)b2, d2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(vU vU2, Waa waa2) {
        void b2;
        uZ_3 c2 = waa2;
        uZ_3 a2 = this;
        void v0 = b2;
        v0.A(lPa.B);
        super.J((vU)v0, (Waa)c2);
    }
}

