/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Ila
 *  MD
 *  QFa
 *  hra
 *  oY
 *  pua
 *  uY
 *  vRa
 *  vf
 */
import java.util.ArrayDeque;
import java.util.Arrays;
import net.minecraft.block.state.IBlockState;
import optifine.Config;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Hja_1
extends Ila {
    private IBlockState[] C;
    private static int i;
    private static ArrayDeque<int[]> M;
    private static final IBlockState k;
    private int[] j;
    private static ArrayDeque<IBlockState[]> J;
    private final XF A;
    private static final String I = "CL_00002565";

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void J(int[] nArray) {
        int[] nArray2 = nArray;
        ArrayDeque<int[]> arrayDeque = M;
        Object a2 = arrayDeque;
        synchronized (arrayDeque) {
            if (M.size() < i) {
                M.add(nArray2);
            }
            // ** MonitorExit[a /* !! */ ] (shouldn't be in output)
            return;
        }
    }

    private int J(XF xF) {
        Object b22 = xF;
        Hja_1 a2 = this;
        Object object = b22;
        int b22 = object.getX() - a2.A.getX();
        int n2 = object.getY() - a2.A.getY();
        int n3 = object.getZ() - a2.A.getZ();
        return b22 * hra.i + n3 * kTa.j + n2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static IBlockState[] J(int n2) {
        int n3 = n2;
        ArrayDeque<IBlockState[]> arrayDeque = J;
        synchronized (arrayDeque) {
            Object[] objectArray;
            Object[] a2 = J.pollLast();
            if (a2 != null && a2.length >= n3) {
                objectArray = a2;
                Arrays.fill(a2, null);
            } else {
                objectArray = a2 = new IBlockState[n3];
            }
            return objectArray;
        }
    }

    /*
     * WARNING - void declaration
     */
    public Hja_1(Gg gg2, XF xF, XF xF2, int n2) {
        void a2;
        void b2;
        void d2;
        XF e2 = xF;
        Hja_1 c2 = this;
        super((Gg)d2, e2, (XF)b2, (int)a2);
        XF xF3 = e2;
        void v1 = a2;
        c2.A = e2.subtract(new MD((int)v1, (int)v1, (int)v1));
        c2.j = Hja_1.J(CRa.C);
        Arrays.fill(c2.j, pua.o);
        c2.C = Hja_1.J(CRa.C);
    }

    private IBlockState f(XF xF) {
        Object b2 = xF;
        Hja_1 a2 = this;
        if (b2.getY() >= 0 && b2.getY() < hra.Ja) {
            Object object = b2;
            Hja_1 hja_1 = a2;
            int n2 = (object.getX() >> AQa.P) - hja_1.k;
            int n3 = (object.getZ() >> AQa.P) - a2.A;
            return hja_1.j[n2][n3].J((XF)((Object)b2));
        }
        return k;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void J(IBlockState[] iBlockStateArray) {
        IBlockState[] iBlockStateArray2 = iBlockStateArray;
        Object a2 = J;
        synchronized (a2) {
            if (J.size() < i) {
                J.add(iBlockStateArray2);
            }
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    public int J(XF xF, int n2) {
        void b2;
        Hja_1 hja_1;
        Hja_1 hja_12 = hja_1 = this;
        int n3 = hja_12.J((XF)b2);
        int c2 = hja_12.j[n3];
        if (c2 == pua.o) {
            void a2;
            c2 = super.J((XF)b2, (int)a2);
            if (Config.J() && !hja_1.J((XF)b2).J().g()) {
                c2 = vf.J((XF)b2, (int)c2);
            }
            hja_1.j[n3] = c2;
        }
        return c2;
    }

    /*
     * WARNING - void declaration
     */
    public uY J(XF xF) {
        void a2;
        Hja_1 hja_1 = this;
        void v0 = a2;
        Hja_1 hja_12 = hja_1;
        int n2 = (v0.getX() >> AQa.P) - hja_12.k;
        int b2 = (v0.getZ() >> AQa.P) - hja_1.A;
        return hja_12.j[n2][b2].J((XF)a2, oY.QUEUED);
    }

    public void J() {
        Hja_1 a2;
        Hja_1 hja_1 = a2;
        Hja_1.J(hja_1.j);
        Hja_1.J(hja_1.C);
    }

    static {
        k = QFa.HF.J();
        M = new ArrayDeque();
        J = new ArrayDeque();
        i = Config.J(Runtime.getRuntime().availableProcessors(), vRa.d, fPa.i);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static int[] J(int n2) {
        int n3 = n2;
        ArrayDeque<int[]> arrayDeque = M;
        synchronized (arrayDeque) {
            int[] a2 = M.pollLast();
            if (a2 == null || a2.length < n3) {
                a2 = new int[n3];
            }
            return a2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public IBlockState J(XF xF) {
        void a2;
        Hja_1 hja_1;
        Hja_1 hja_12 = hja_1 = this;
        int n2 = hja_12.J((XF)a2);
        Object b2 = hja_12.C[n2];
        if (b2 == null) {
            Hja_1 hja_13 = hja_1;
            b2 = hja_13.f((XF)a2);
            hja_13.C[n2] = b2;
        }
        return b2;
    }
}

