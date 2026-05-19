/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ega
 *  HA
 *  Mda
 *  NCa
 *  NTa
 *  Waa
 *  bea
 *  cRa
 *  eAa
 *  hra
 *  kba
 *  kea
 *  mb
 *  rd
 *  vRa
 *  vX
 *  waa
 *  ysa
 */
import java.util.Arrays;
import java.util.List;
import net.minecraft.block.BlockBrewingStand;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Xz_3
extends vX
implements rd,
mb {
    private eAa i;
    private Mda[] M = new Mda[AQa.P];
    private int k;
    private static final int[] j;
    private String J;
    private boolean[] A;
    private static final int[] I;

    private void M() {
        Xz_3 xz_3 = this;
        if (xz_3.e()) {
            int a2;
            Mda mda2 = xz_3.M[yRa.d];
            int n2 = a2 = uSa.E;
            while (n2 < yRa.d) {
                if (xz_3.M[a2] != null && xz_3.M[a2].J() == Gea.aa) {
                    Xz_3 xz_32 = xz_3;
                    int n3 = xz_32.M[a2].J();
                    int n4 = xz_32.J(n3, mda2);
                    List<kba> list = Gea.aa.J(n3);
                    List<kba> list2 = Gea.aa.J(n4);
                    if (n3 > 0 && list == list2 || list != null && (list.equals(list2) || list2 == null)) {
                        if (!eca.f(n3) && eca.f(n4)) {
                            xz_3.M[a2].J(n4);
                        }
                    } else if (n3 != n4) {
                        xz_3.M[a2].J(n4);
                    }
                }
                n2 = ++a2;
            }
            Xz_3 xz_33 = xz_3;
            if (mda2.J().f()) {
                xz_33.M[yRa.d] = new Mda(mda2.J().f());
                return;
            }
            xz_33.M[yRa.d].E -= vRa.d;
            if (xz_3.M[yRa.d].E <= 0) {
                xz_3.M[yRa.d] = null;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private int J(int n2, Mda mda2) {
        void b2;
        Xz_3 c2 = mda2;
        Xz_3 a2 = this;
        if (c2 == null) {
            return (int)b2;
        }
        if (c2.J().f((Mda)c2)) {
            return Qca.J((int)b2, c2.J().J((Mda)c2));
        }
        return (int)b2;
    }

    static {
        int[] nArray = new int[vRa.d];
        nArray[uSa.E] = yRa.d;
        j = nArray;
        int[] nArray2 = new int[yRa.d];
        nArray2[uSa.E] = uSa.E;
        nArray2[vRa.d] = vRa.d;
        nArray2[uqa.g] = uqa.g;
        I = nArray2;
    }

    public int l() {
        return ysa.s;
    }

    public Mda f(int n2) {
        int b2 = n2;
        Xz_3 a2 = this;
        if (b2 >= 0 && b2 < a2.M.length) {
            Xz_3 xz_3 = a2;
            Mda mda2 = xz_3.M[b2];
            xz_3.M[b2] = null;
            return mda2;
        }
        return null;
    }

    public int J() {
        return vRa.d;
    }

    public void l() {
        int a2;
        Xz_3 xz_3 = this;
        int n2 = a2 = uSa.E;
        while (n2 < xz_3.M.length) {
            xz_3.M[a2++] = null;
            n2 = a2;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public void J(int n2, int n3) {
        void b2;
        int c2 = n3;
        Xz_3 a2 = this;
        switch (b2) {
            case 0: {
                a2.k = c2;
                return;
            }
        }
    }

    public int[] J(DZ dZ2) {
        Object b2 = dZ2;
        Xz_3 a2 = this;
        if (b2 == DZ.UP) {
            return j;
        }
        return I;
    }

    public boolean J(int n2, Mda mda2, DZ dZ2) {
        Object d2 = dZ2;
        Xz_3 a2 = this;
        return vRa.d != 0;
    }

    public Ega J(kea kea2, Sx sx2) {
        Xz_3 c2 = kea2;
        Xz_3 b2 = this;
        return new bea((kea)c2, (HA)b2);
    }

    /*
     * WARNING - void declaration
     */
    public boolean f(int n2, Mda mda2, DZ dZ2) {
        void c2;
        Xz_3 d2 = mda2;
        Xz_3 b2 = this;
        return b2.J((int)c2, (Mda)d2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public int J(int n2) {
        int b2 = n2;
        Xz_3 a2 = this;
        switch (b2) {
            case 0: {
                return a2.k;
            }
        }
        return uSa.E;
    }

    public String J() {
        Xz_3 a2;
        if (a2.J()) {
            return a2.J;
        }
        return aua.s;
    }

    public void f(Waa waa2) {
        int n2;
        Xz_3 a2;
        Xz_3 b2 = waa2;
        Xz_3 xz_3 = a2 = this;
        super.f((Waa)b2);
        waa waa3 = b2.J(rua.la, NTa.C);
        xz_3.M = new Mda[xz_3.f()];
        int n3 = n2 = uSa.E;
        while (n3 < waa3.J()) {
            Waa waa4 = waa3.J(n2);
            byte by2 = waa4.J(kua.E);
            if (by2 >= 0 && by2 < a2.M.length) {
                a2.M[by2] = Mda.J((Waa)waa4);
            }
            n3 = ++n2;
        }
        a2.k = b2.J(gsa.r);
        if (b2.J(cRa.k, Yqa.i)) {
            a2.J = b2.J(cRa.k);
        }
    }

    public boolean J(Sx sx2) {
        Xz_3 a2;
        Object b2 = sx2;
        Xz_3 xz_3 = a2 = this;
        if (xz_3.worldObj.J(xz_3.pos) != a2) {
            return uSa.E != 0;
        }
        if (b2.f((double)a2.pos.getX() + kTa.B, (double)a2.pos.getY() + kTa.B, (double)a2.pos.getZ() + kTa.B) <= ypa.X) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public String f() {
        return wua.y;
    }

    public boolean[] J() {
        int a2;
        Xz_3 xz_3 = this;
        boolean[] blArray = new boolean[yRa.d];
        int n2 = a2 = uSa.E;
        while (n2 < yRa.d) {
            if (xz_3.M[a2] != null) {
                blArray[a2] = vRa.d;
            }
            n2 = ++a2;
        }
        return blArray;
    }

    public boolean J() {
        Xz_3 a2;
        if (a2.J != null && a2.J.length() > 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void f(Sx object) {
        Object b2 = object;
        object = this;
    }

    public void J(String string) {
        Object b2 = string;
        Xz_3 a2 = this;
        a2.J = b2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(int n2, Mda mda2) {
        void b2;
        Xz_3 c2 = mda2;
        Xz_3 a2 = this;
        if (b2 == yRa.d) {
            return c2.J().f((Mda)c2);
        }
        if (c2.J() == Gea.aa || c2.J() == Gea.J) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void J(Sx object) {
        Object b2 = object;
        object = this;
    }

    public Mda J(int n2, int n3) {
        int c2 = n2;
        Xz_3 b2 = this;
        if (c2 >= 0 && c2 < b2.M.length) {
            Xz_3 xz_3 = b2;
            Mda a2 = xz_3.M[c2];
            xz_3.M[c2] = null;
            return a2;
        }
        return null;
    }

    private boolean e() {
        Xz_3 xz_3 = this;
        if (xz_3.M[yRa.d] != null && xz_3.M[yRa.d].E > 0) {
            int a2;
            Mda mda2 = xz_3.M[yRa.d];
            if (!mda2.J().f(mda2)) {
                return uSa.E != 0;
            }
            boolean bl = uSa.E;
            int n2 = a2 = uSa.E;
            while (n2 < yRa.d) {
                if (xz_3.M[a2] != null && xz_3.M[a2].J() == Gea.aa) {
                    Xz_3 xz_32 = xz_3;
                    int n3 = xz_32.M[a2].J();
                    int n4 = xz_32.J(n3, mda2);
                    if (!eca.f(n3) && eca.f(n4)) {
                        boolean bl2 = vRa.d;
                        return bl2;
                    }
                    List<kba> list = Gea.aa.J(n3);
                    List<kba> list2 = Gea.aa.J(n4);
                    if (!(n3 > 0 && list == list2 || list != null && (list.equals(list2) || list2 == null) || n3 == n4)) {
                        boolean bl3 = vRa.d;
                        return bl3;
                    }
                }
                n2 = ++a2;
            }
            return bl;
        }
        return uSa.E != 0;
    }

    public Xz_3() {
        Xz_3 a2;
    }

    public Mda J(int n2) {
        int b2 = n2;
        Xz_3 a2 = this;
        if (b2 >= 0 && b2 < a2.M.length) {
            return a2.M[b2];
        }
        return null;
    }

    public int f() {
        Xz_3 a2;
        return a2.M.length;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, Mda mda2) {
        int c2 = n2;
        Xz_3 b2 = this;
        if (c2 >= 0 && c2 < b2.M.length) {
            void a2;
            b2.M[c2] = a2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(Waa waa2) {
        int b2;
        void a2;
        Xz_3 xz_3 = this;
        void v0 = a2;
        super.J((Waa)v0);
        v0.J(gsa.r, (short)xz_3.k);
        waa waa3 = new waa();
        int n2 = b2 = uSa.E;
        while (n2 < xz_3.M.length) {
            if (xz_3.M[b2] != null) {
                Waa waa4 = new Waa();
                waa4.J(kua.E, (byte)b2);
                xz_3.M[b2].J(waa4);
                waa3.J((NCa)waa4);
            }
            n2 = ++b2;
        }
        a2.J(rua.la, (NCa)waa3);
        if (xz_3.J()) {
            a2.J(cRa.k, xz_3.J);
        }
    }

    public void J() {
        boolean[] blArray;
        Xz_3 xz_3;
        Xz_3 xz_32;
        block6: {
            block8: {
                block4: {
                    block7: {
                        block5: {
                            xz_32 = this;
                            if (xz_32.k <= 0) break block4;
                            Xz_3 xz_33 = xz_32;
                            xz_33.k -= vRa.d;
                            if (xz_33.k != 0) break block5;
                            Xz_3 xz_34 = xz_32;
                            xz_3 = xz_34;
                            xz_34.M();
                            xz_34.f();
                            break block6;
                        }
                        if (xz_32.e()) break block7;
                        Xz_3 xz_35 = xz_32;
                        xz_3 = xz_35;
                        xz_35.k = uSa.E;
                        xz_35.f();
                        break block6;
                    }
                    Xz_3 xz_36 = xz_32;
                    if (xz_36.i == xz_36.M[yRa.d].J()) break block8;
                    Xz_3 xz_37 = xz_32;
                    xz_3 = xz_37;
                    xz_37.k = uSa.E;
                    xz_37.f();
                    break block6;
                }
                if (xz_32.e()) {
                    xz_32.k = hra.i;
                    xz_32.i = xz_32.M[yRa.d].J();
                }
            }
            xz_3 = xz_32;
        }
        if (!xz_3.worldObj.e && !Arrays.equals(blArray = xz_32.J(), xz_32.A)) {
            int a2;
            xz_32.A = blArray;
            IBlockState iBlockState = xz_32.worldObj.J(xz_32.J());
            if (!(iBlockState.J() instanceof BlockBrewingStand)) {
                return;
            }
            int n2 = a2 = uSa.E;
            while (n2 < BlockBrewingStand.HAS_BOTTLE.length) {
                PropertyBool propertyBool = BlockBrewingStand.HAS_BOTTLE[a2];
                boolean bl = blArray[a2];
                iBlockState = iBlockState.J(propertyBool, bl);
                n2 = ++a2;
            }
            Xz_3 xz_38 = xz_32;
            xz_38.worldObj.J(xz_38.pos, iBlockState, uqa.g);
        }
    }
}

