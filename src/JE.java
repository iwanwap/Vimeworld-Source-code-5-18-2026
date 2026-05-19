/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cf
 *  Cia
 *  I
 *  PLa
 *  Yka
 *  pua
 *  vRa
 */
import java.util.BitSet;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.state.BlockStateBase;
import net.minecraft.block.state.IBlockState;
import optifine.Config;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class JE {
    private Cf F;
    private I g;
    private int L;
    private static ThreadLocal E = new ThreadLocal();
    private float[] m;
    private int C;
    private PLa i;
    private XF M;
    private BitSet k;
    private int j;
    private Cia J;
    private IBlockState A;
    private boolean[] I;

    /*
     * Enabled aggressive block sorting
     */
    public int f() {
        JE jE2;
        JE jE3 = this;
        if (jE3.C < 0) {
            if (jE3.A instanceof BlockStateBase) {
                BlockStateBase a2 = (BlockStateBase)jE3.A;
                jE2 = jE3;
                jE3.C = a2.f();
                return jE2.C;
            }
            jE3.C = jE3.A.J().f(jE3.A);
        }
        jE2 = jE3;
        return jE2.C;
    }

    public BitSet J() {
        JE a2;
        return a2.k;
    }

    /*
     * WARNING - void declaration
     */
    private JE(I i2, IBlockState iBlockState, XF xF) {
        void b2;
        void c2;
        Object d2 = xF;
        JE a2 = this;
        a2.L = pua.o;
        a2.C = pua.o;
        a2.j = pua.o;
        a2.m = new float[DZ.values().length * uqa.g];
        JE jE2 = a2;
        JE jE3 = a2;
        JE jE4 = a2;
        JE jE5 = a2;
        jE4.k = new BitSet(yRa.d);
        jE4.i = new PLa();
        jE4.F = null;
        jE3.I = null;
        jE3.g = c2;
        jE2.A = b2;
        jE2.M = d2;
        jE2.J = Config.J();
    }

    public PLa J() {
        JE a2;
        return a2.i;
    }

    public boolean[] J() {
        JE a2;
        if (a2.I == null) {
            a2.I = new boolean[AQa.P];
        }
        return a2.I;
    }

    public float[] J() {
        JE a2;
        return a2.m;
    }

    /*
     * Unable to fully structure code
     */
    public boolean J(Yka var1_1) {
        b = var1_1;
        a = this;
        if (a.j >= 0) ** GOTO lbl9
        if (b instanceof eKa) {
            v0 = a;
            a.j = vRa.d;
        } else {
            a.j = uSa.E;
lbl9:
            // 2 sources

            v0 = a;
        }
        if (v0.j == vRa.d) {
            return (boolean)vRa.d;
        }
        return (boolean)uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    private void J(I i2, IBlockState iBlockState, XF xF) {
        void b2;
        void c2;
        JE a2;
        Object d2 = xF;
        JE jE2 = a2 = this;
        a2.g = c2;
        jE2.A = b2;
        a2.M = d2;
        jE2.L = pua.o;
        a2.C = pua.o;
        a2.j = pua.o;
        a2.k.clear();
    }

    /*
     * Enabled aggressive block sorting
     */
    public int J() {
        JE jE2;
        JE jE3 = this;
        if (jE3.L < 0) {
            if (jE3.A instanceof BlockStateBase) {
                BlockStateBase a2 = (BlockStateBase)jE3.A;
                jE2 = jE3;
                jE3.L = a2.l();
                return jE2.L;
            }
            jE3.L = Block.J(jE3.A.J());
        }
        jE2 = jE3;
        return jE2.L;
    }

    public boolean J() {
        JE a2;
        if (a2.j == vRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public Cf J() {
        JE a2;
        if (a2.F == null) {
            JE jE2 = a2;
            jE2.F = new Cf(uSa.E, uSa.E, uSa.E);
        }
        return a2.F;
    }

    public IBlockState J() {
        JE a2;
        return a2.A;
    }

    /*
     * Unable to fully structure code
     */
    public boolean J(List var1_1) {
        b = var1_1;
        a = this;
        if (a.j >= 0 || b.size() <= 0) ** GOTO lbl9
        if (b.get(uSa.E) instanceof eKa) {
            v0 = a;
            a.j = vRa.d;
        } else {
            a.j = uSa.E;
lbl9:
            // 2 sources

            v0 = a;
        }
        if (v0.j == vRa.d) {
            return (boolean)vRa.d;
        }
        return (boolean)uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    public static JE J(I i2, IBlockState iBlockState, XF xF) {
        void a2;
        void b2;
        I i3 = i2;
        Object c2 = (JE)E.get();
        if (c2 == null) {
            c2 = new JE(i3, (IBlockState)b2, (XF)a2);
            E.set(c2);
            return c2;
        }
        Object object = c2;
        super.J(i3, (IBlockState)b2, (XF)a2);
        return object;
    }
}

