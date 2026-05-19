/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Faa
 *  Gg
 *  LQa
 *  Mz
 *  QFa
 *  RPa
 *  ZOa
 *  oY
 *  uY
 *  vL
 *  vRa
 *  xy
 */
import com.google.common.base.Predicate;
import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Saa_1
extends Faa {
    /*
     * WARNING - void declaration
     */
    public boolean J(int n2, int n3) {
        void b2;
        int c2 = n3;
        Saa_1 a2 = this;
        if (b2 == a2.I && c2 == a2.G) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public Saa_1(Gg gg2, int n2, int n3) {
        void b2;
        void c2;
        int d2 = n3;
        Saa_1 a2 = this;
        super((Gg)c2, (int)b2, d2);
    }

    public uY J(XF xF, oY oY2) {
        Saa_1 c2 = oY2;
        Saa_1 a2 = this;
        return null;
    }

    public void M() {
    }

    public boolean f(int n2, int n3) {
        int c2 = n3;
        Saa_1 a2 = this;
        return vRa.d != 0;
    }

    public int l(XF xF) {
        Object b2 = xF;
        Saa_1 a2 = this;
        return uSa.E;
    }

    public boolean f() {
        return vRa.d != 0;
    }

    public boolean J(XF xF) {
        Object b2 = xF;
        Saa_1 a2 = this;
        return uSa.E != 0;
    }

    public void C() {
    }

    public void J(vL vL2, xy xy2, List<vL> list, Predicate<? super vL> predicate) {
        Saa_1 saa_1 = object;
        Object object = predicate;
        Saa_1 a2 = saa_1;
    }

    public int J(Mz mz2, XF xF) {
        Saa_1 c2 = mz2;
        Saa_1 b2 = this;
        return ((Mz)c2).defaultLightValue;
    }

    public IBlockState J(XF xF) {
        Object b2 = xF;
        Saa_1 a2 = this;
        return QFa.HF.J();
    }

    public Block J(XF xF) {
        Object b2 = xF;
        Saa_1 a2 = this;
        return QFa.HF;
    }

    public <T extends vL> void J(Class<? extends T> clazz, xy xy2, List<T> list, Predicate<? super T> predicate) {
        Saa_1 saa_1 = object;
        Object object = predicate;
        Saa_1 a2 = saa_1;
    }

    public boolean J(boolean bl) {
        boolean b2 = bl;
        Saa_1 a2 = this;
        return uSa.E != 0;
    }

    public int J(XF xF, int n2) {
        int c2 = n2;
        Saa_1 a2 = this;
        return uSa.E;
    }

    public void J(byte[] byArray, int n2, boolean bl) {
        boolean d2 = bl;
        Saa_1 saa_1 = this;
    }

    public int J(XF xF) {
        Object b2 = xF;
        Saa_1 a2 = this;
        return osa.Ja;
    }

    public Random J(long a2) {
        Saa_1 b2;
        Saa_1 saa_1 = b2;
        Saa_1 saa_12 = b2;
        return new Random(b2.J().J() + (long)(saa_1.I * saa_1.I * ZOa.Y) + (long)(b2.I * LQa.Da) + (long)(saa_12.G * saa_12.G) * aua.x + (long)(b2.G * RPa.q) ^ a2);
    }

    public int J(int n2, int n3) {
        int c2 = n3;
        Saa_1 a2 = this;
        return uSa.E;
    }

    public void d() {
    }

    public void f(vL object) {
        Saa_1 b2 = object;
        object = this;
    }

    public void J(XF xF, uY object) {
        Saa_1 c2 = object;
        object = this;
    }

    public void J(vL object) {
        Saa_1 b2 = object;
        object = this;
    }

    public void A() {
    }

    public void J(vL vL2, int n2) {
        int c2 = n2;
        Saa_1 saa_1 = this;
    }

    public IBlockState J(XF xF, IBlockState iBlockState) {
        Object c2 = iBlockState;
        Saa_1 a2 = this;
        return null;
    }

    public void l() {
    }

    public void J(uY object) {
        Saa_1 b2 = object;
        object = this;
    }

    public void J(XF object) {
        Object b2 = object;
        object = this;
    }

    public void J(Mz mz2, XF xF, int n2) {
        int d2 = n2;
        Saa_1 saa_1 = this;
    }
}

