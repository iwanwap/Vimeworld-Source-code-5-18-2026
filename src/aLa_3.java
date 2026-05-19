/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ANa
 *  ERa
 *  Gg
 *  JPa
 *  Lz
 *  Oz
 *  Ppa
 *  QS
 *  TQa
 *  VS
 *  aSa
 *  cRa
 *  pua
 *  uKa
 *  vL
 *  vRa
 *  xJa
 */
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.state.IBlockState;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class aLa_3 {
    private static float E;
    private static float m;
    private static float C;
    private static final IntBuffer i;
    private static final FloatBuffer M;
    private static final FloatBuffer k;
    private static float j;
    private static final FloatBuffer J;
    private static Lz A;
    private static float I;

    public static float d() {
        return I;
    }

    public static float C() {
        return j;
    }

    /*
     * WARNING - void declaration
     */
    public static Block J(Gg gg2, vL vL2, float f2) {
        void a22;
        Lz b2;
        Gg gg3 = gg2;
        XF a22 = new XF(b2 = aLa_3.J((vL)b2, (double)a22));
        IBlockState c2 = gg3.J(a22);
        Block block = c2.J();
        if (block.J().l()) {
            float f3 = JPa.N;
            if (c2.J() instanceof BlockLiquid) {
                f3 = BlockLiquid.J(c2.J(BlockLiquid.LEVEL)) - Eqa.m;
            }
            if (b2.j >= (double)(c2 = (float)(a22.getY() + vRa.d) - f3)) {
                block = gg3.J(a22.up()).J();
            }
        }
        return block;
    }

    public static float l() {
        return m;
    }

    public static float f() {
        return C;
    }

    public static Lz J() {
        return A;
    }

    public static Lz J(vL b2, double a2) {
        vL vL2 = b2;
        double d2 = vL2.c + (b2.la - b2.c) * a2;
        vL vL3 = b2;
        double d3 = vL2.ba + (vL3.Z - b2.ba) * a2;
        a2 = vL3.r + (b2.A - b2.r) * a2;
        return new Lz(d2 += aLa_3.A.A, d3 += aLa_3.A.j, a2 += aLa_3.A.J);
    }

    public aLa_3() {
        aLa_3 a2;
    }

    static {
        i = xJa.J((int)ERa.C);
        J = xJa.J((int)ERa.C);
        M = xJa.J((int)ERa.C);
        k = xJa.J((int)yRa.d);
        A = new Lz(aSa.V, aSa.V, aSa.V);
    }

    public static void J(Sx sx2, boolean bl) {
        float f2;
        int a2;
        Sx sx3 = sx2;
        uKa.J((int)TQa.g, (FloatBuffer)J);
        uKa.J((int)Ppa.Q, (FloatBuffer)M);
        GL11.glGetInteger(cRa.Ia, i);
        float f3 = (i.get(uSa.E) + i.get(uqa.g)) / uqa.g;
        float b2 = (i.get(vRa.d) + i.get(yRa.d)) / uqa.g;
        GLU.gluUnProject(f3, b2, JPa.N, J, M, i, k);
        A = new Lz((double)k.get(uSa.E), (double)k.get(vRa.d), (double)k.get(uqa.g));
        a2 = a2 != 0 ? vRa.d : uSa.E;
        int n2 = VS.J() && sx3 instanceof ANa ? vRa.d : uSa.E;
        int n3 = b2 = QS.J() && sx3 instanceof ANa ? vRa.d : uSa.E;
        float f4 = b2 != 0 ? QS.C() : (f2 = n2 != 0 ? VS.i : (float)sx3.d);
        b2 = b2 != 0 ? QS.f() : (n2 != 0 ? VS.k : (float)sx3.X);
        j = Oz.C((float)(b2 * pua.j / Hra.Ga)) * (float)(vRa.d - a2 * uqa.g);
        E = Oz.d((float)(b2 * pua.j / Hra.Ga)) * (float)(vRa.d - a2 * uqa.g);
        I = -E * Oz.d((float)(f2 * pua.j / Hra.Ga)) * (float)(vRa.d - a2 * uqa.g);
        C = j * Oz.d((float)(f2 * pua.j / Hra.Ga)) * (float)(vRa.d - a2 * uqa.g);
        m = Oz.C((float)(f2 * pua.j / Hra.Ga));
    }

    public static float J() {
        return E;
    }
}

