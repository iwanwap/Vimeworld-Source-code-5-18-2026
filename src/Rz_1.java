/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AZ
 *  ERa
 *  Faa
 *  Gg
 *  Jy
 *  NPa
 *  Oz
 *  QFa
 *  gc
 *  hd
 *  vRa
 */
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Rz_1
implements hd {
    private static final int j;
    private static final int J;
    private final Gg A;
    private static final List<IBlockState> I;

    static {
        Iterator iterator;
        I = Lists.newArrayList();
        Iterator iterator2 = iterator = Block.blockRegistry.iterator();
        while (iterator2.hasNext()) {
            Block block = (Block)iterator.next();
            I.addAll(block.f().J());
            iterator2 = iterator;
        }
        j = Oz.f((float)Oz.J((float)I.size()));
        J = Oz.f((float)((float)I.size() / (float)j));
    }

    public String J() {
        return POa.n;
    }

    public void J(hd hd2, int n2, int n3) {
        int d2 = n3;
        Rz_1 rz_1 = this;
    }

    public boolean J() {
        return uSa.E != 0;
    }

    public boolean f() {
        return vRa.d != 0;
    }

    public boolean J(boolean bl, gc gc2) {
        Rz_1 c2 = gc2;
        Rz_1 a2 = this;
        return vRa.d != 0;
    }

    public void J() {
    }

    public void J(Faa faa2, int n2, int n3) {
        int d2 = n3;
        Rz_1 rz_1 = this;
    }

    /*
     * WARNING - void declaration
     */
    public Faa J(int n2, int n3) {
        int n4;
        void a2;
        void b2;
        int c22;
        Rz_1 rz_1 = this;
        oz oz2 = new oz();
        int n5 = c22 = uSa.E;
        while (n5 < ERa.C) {
            int n6 = uSa.E;
            while (n6 < ERa.C) {
                int n7;
                void var6_9 = b2 * ERa.C + c22;
                n4 = a2 * ERa.C + n7;
                oz2.J(c22, Psa.M, n7, QFa.fE.J());
                IBlockState iBlockState = Rz_1.J((int)var6_9, n4);
                if (iBlockState != null) {
                    oz2.J(c22, NPa.e, n7, iBlockState);
                }
                n6 = ++n7;
            }
            n5 = ++c22;
        }
        Faa c22 = new Faa(rz_1.A, oz2, (int)b2, (int)a2);
        c22.d();
        Jy[] jyArray = rz_1.A.J().J((Jy[])null, (int)(b2 * ERa.C), (int)(a2 * ERa.C), ERa.C, ERa.C);
        byte[] byArray = c22.J();
        int n8 = n4 = uSa.E;
        while (n8 < byArray.length) {
            int n9 = n4++;
            byArray[n9] = (byte)jyArray[n9].Ka;
            n8 = n4;
        }
        Faa faa2 = c22;
        faa2.d();
        return faa2;
    }

    public Rz_1(Gg gg2) {
        Rz_1 b2 = gg2;
        Rz_1 a2 = this;
        a2.A = b2;
    }

    public boolean J(hd hd2, Faa faa2, int n2, int n3) {
        int n4 = n3;
        Rz_1 a2 = this;
        return uSa.E != 0;
    }

    public int J() {
        return uSa.E;
    }

    public Faa J(XF xF) {
        Object b2 = xF;
        Rz_1 a2 = this;
        return a2.J(b2.getX() >> AQa.P, b2.getZ() >> AQa.P);
    }

    public static IBlockState J(int n2, int n3) {
        int b2 = n3;
        int a2 = n2;
        IBlockState iBlockState = null;
        if (a2 > 0 && b2 > 0 && a2 % uqa.g != 0 && b2 % uqa.g != 0) {
            b2 /= uqa.g;
            if ((a2 /= uqa.g) <= j && b2 <= J && (b2 = Oz.f((int)(a2 * j + b2))) < I.size()) {
                iBlockState = I.get(b2);
            }
        }
        return iBlockState;
    }

    public boolean J(int n2, int n3) {
        int c2 = n3;
        Rz_1 a2 = this;
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public List<AZ> J(VIa vIa, XF xF) {
        void b2;
        Object c2 = xF;
        Rz_1 a2 = this;
        return a2.A.J((XF)((Object)c2)).J((VIa)b2);
    }

    public XF J(Gg gg2, String string, XF xF) {
        Object d2 = xF;
        Rz_1 a2 = this;
        return null;
    }
}

