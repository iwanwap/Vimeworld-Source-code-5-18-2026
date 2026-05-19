/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ey
 *  Gg
 *  Lra
 *  Mda
 *  QFa
 *  Tz
 *  eAa
 *  kqa
 *  vRa
 */
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import net.minecraft.block.BlockJukebox;
import net.minecraft.block.state.IBlockState;

public final class Aba
extends eAa {
    private static final Map<String, Aba> A = Maps.newHashMap();
    public final String I;

    public oda J(Mda mda2) {
        Aba b2 = mda2;
        Aba a2 = this;
        return oda.RARE;
    }

    public Aba(String string) {
        Object b2 = string;
        Aba a2 = this;
        a2.I = b2;
        a2.i = vRa.d;
        a2.J(yGa.g);
        A.put(new StringBuilder().insert(3 >> 2, kqa.L).append((String)b2).toString(), a2);
    }

    public String f() {
        Aba a2;
        return Ey.f((String)new StringBuilder().insert(5 >> 3, Lra.z).append(a2.I).append(kra.Ca).toString());
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Mda mda2, Sx sx2, Gg gg2, XF xF, DZ dZ2, float f2, float f3, float f4) {
        void e2;
        Aba i2 = gg2;
        Aba f5 = this;
        IBlockState d2 = i2.J((XF)e2);
        if (d2.J() == QFa.nB && !d2.J(BlockJukebox.HAS_RECORD).booleanValue()) {
            void g2;
            void h2;
            if (((Gg)i2).e) {
                return vRa.d != 0;
            }
            ((BlockJukebox)QFa.nB).J((Gg)i2, (XF)e2, d2, (Mda)h2);
            i2.J(null, CRa.r, (XF)e2, eAa.J((eAa)f5));
            h2.E -= vRa.d;
            g2.J(Tz.fa);
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void J(Mda mda2, Sx sx2, List<String> list, boolean bl) {
        boolean bl2 = bl;
        Aba a2 = this;
    }

    public static Aba J(String a2) {
        return A.get(a2);
    }
}

