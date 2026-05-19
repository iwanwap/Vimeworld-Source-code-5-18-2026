/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  HEa
 *  JPa
 *  Mda
 *  QFa
 *  Taa
 *  bpa
 *  eAa
 *  iea
 *  kPa
 *  pqa
 *  psa
 *  vRa
 */
import com.google.common.collect.Maps;
import java.util.Map;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStoneBrick;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Taa_2 {
    private Map<Mda, Mda> J;
    private static final Taa A = new Taa_2();
    private Map<Mda, Float> I;

    /*
     * WARNING - void declaration
     */
    private boolean J(Mda mda2, Mda mda3) {
        void b2;
        Taa_2 c2 = mda3;
        Taa_2 a2 = this;
        if (c2.J() == b2.J() && (c2.J() == BQa.h || c2.J() == b2.J())) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static Taa J() {
        return A;
    }

    private Taa_2() {
        int a2;
        Taa_2 taa_2;
        Taa_2 taa_22 = taa_2 = this;
        taa_22.J = Maps.newHashMap();
        taa_22.I = Maps.newHashMap();
        taa_22.J(QFa.b, new Mda(Gea.GA), ZSa.q);
        taa_22.J(QFa.zE, new Mda(Gea.Bb), pqa.r);
        taa_22.J(QFa.Ic, new Mda(Gea.b), pqa.r);
        taa_22.J(QFa.R, new Mda(QFa.ye), Nra.e);
        taa_22.J(Gea.fa, new Mda(Gea.kd), kPa.W);
        taa_22.J(Gea.mC, new Mda(Gea.y), kPa.W);
        taa_22.J(Gea.od, new Mda(Gea.Aa), kPa.W);
        taa_22.J(Gea.Za, new Mda(Gea.m), kPa.W);
        taa_22.J(Gea.v, new Mda(Gea.JA), kPa.W);
        taa_22.J(QFa.yB, new Mda(QFa.Gd), Nra.e);
        Taa_2 taa_23 = taa_2;
        taa_22.J(new Mda(QFa.v, vRa.d, BlockStoneBrick.DEFAULT_META), new Mda(QFa.v, vRa.d, BlockStoneBrick.CRACKED_META), Nra.e);
        taa_22.J(Gea.c, new Mda(Gea.N), bpa.K);
        taa_22.J(QFa.pd, new Mda(QFa.MB), kPa.W);
        taa_22.J(QFa.dd, new Mda(Gea.Q, vRa.d, iea.GREEN.getDyeDamage()), psa.N);
        taa_22.J(QFa.UA, new Mda(Gea.qc, vRa.d, vRa.d), VPa.i);
        taa_22.J(QFa.hf, new Mda(Gea.qc, vRa.d, vRa.d), VPa.i);
        taa_22.J(QFa.nE, new Mda(Gea.qc, vRa.d, vRa.d), VPa.i);
        taa_22.J(QFa.c, new Mda(Gea.kc), pqa.r);
        taa_22.J(Gea.cA, new Mda(Gea.jC), kPa.W);
        taa_22.J(QFa.GA, new Mda(Gea.za), Nra.e);
        taa_22.J(new Mda(QFa.ba, vRa.d, vRa.d), new Mda(QFa.ba, vRa.d, uSa.E), VPa.i);
        HEa[] hEaArray = HEa.values();
        int n2 = hEaArray.length;
        int n3 = a2 = uSa.E;
        while (n3 < n2) {
            HEa hEa2 = hEaArray[a2];
            if (hEa2.canCook()) {
                taa_2.J(new Mda(Gea.E, vRa.d, hEa2.getMetadata()), new Mda(Gea.Ka, vRa.d, hEa2.getMetadata()), kPa.W);
            }
            n3 = ++a2;
        }
        Taa_2 taa_24 = taa_2;
        taa_24.J(QFa.Za, new Mda(Gea.qc), Nra.e);
        taa_24.J(QFa.M, new Mda(Gea.zc), ZSa.q);
        taa_24.J(QFa.xC, new Mda(Gea.Q, vRa.d, iea.BLUE.getDyeDamage()), psa.N);
        taa_24.J(QFa.Lb, new Mda(Gea.wA), psa.N);
        taa_24.J(QFa.zd, new Mda(Gea.qc, vRa.d, vRa.d), VPa.i);
        taa_24.J(QFa.Hc, new Mda(Gea.qc, vRa.d, vRa.d), VPa.i);
        taa_24.J(QFa.Nf, new Mda(Gea.qc, vRa.d, vRa.d), VPa.i);
        taa_24.J(QFa.GC, new Mda(QFa.Dd), Nra.e);
        taa_24.J(new Mda(QFa.za, vRa.d, iea.WHITE.getMetadata()), new Mda(QFa.iB), Nra.e);
        taa_24.J(new Mda(QFa.za, vRa.d, iea.ORANGE.getMetadata()), new Mda(QFa.iB, vRa.d, vRa.d), Nra.e);
        taa_24.J(new Mda(QFa.za, vRa.d, iea.MAGENTA.getMetadata()), new Mda(QFa.iB, vRa.d, uqa.g), Nra.e);
        taa_24.J(new Mda(QFa.za, vRa.d, iea.LIGHT_BLUE.getMetadata()), new Mda(QFa.iB, vRa.d, yRa.d), Nra.e);
        taa_24.J(new Mda(QFa.za, vRa.d, iea.YELLOW.getMetadata()), new Mda(QFa.kB), Nra.e);
        taa_24.J(new Mda(QFa.za, vRa.d, iea.LIME.getMetadata()), new Mda(QFa.kB, vRa.d, vRa.d), Nra.e);
        taa_24.J(new Mda(QFa.za, vRa.d, iea.PINK.getMetadata()), new Mda(QFa.kB, vRa.d, uqa.g), Nra.e);
        taa_24.J(new Mda(QFa.za, vRa.d, iea.GRAY.getMetadata()), new Mda(QFa.kB, vRa.d, yRa.d), Nra.e);
        taa_24.J(new Mda(QFa.za, vRa.d, iea.SILVER.getMetadata()), new Mda(QFa.lE), Nra.e);
        taa_24.J(new Mda(QFa.za, vRa.d, iea.CYAN.getMetadata()), new Mda(QFa.lE, vRa.d, vRa.d), Nra.e);
        taa_24.J(new Mda(QFa.za, vRa.d, iea.PURPLE.getMetadata()), new Mda(QFa.lE, vRa.d, uqa.g), Nra.e);
        taa_24.J(new Mda(QFa.za, vRa.d, iea.BLUE.getMetadata()), new Mda(QFa.lE, vRa.d, yRa.d), Nra.e);
        taa_24.J(new Mda(QFa.za, vRa.d, iea.BROWN.getMetadata()), new Mda(QFa.lc), Nra.e);
        taa_24.J(new Mda(QFa.za, vRa.d, iea.GREEN.getMetadata()), new Mda(QFa.lc, vRa.d, vRa.d), Nra.e);
        taa_24.J(new Mda(QFa.za, vRa.d, iea.RED.getMetadata()), new Mda(QFa.lc, vRa.d, uqa.g), Nra.e);
        taa_24.J(new Mda(QFa.za, vRa.d, iea.BLACK.getMetadata()), new Mda(QFa.lc, vRa.d, yRa.d), Nra.e);
    }

    /*
     * WARNING - void declaration
     */
    public Mda J(Mda mda2) {
        Taa_2 taa_2 = this;
        for (Map.Entry<Mda, Mda> b2 : taa_2.J.entrySet()) {
            void a2;
            if (!taa_2.J((Mda)a2, (Mda)b2.getKey())) continue;
            return (Mda)b2.getValue();
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Block block, Mda mda2, float f2) {
        void b2;
        void c2;
        float d2 = f2;
        Taa_2 a2 = this;
        a2.J(eAa.J((Block)c2), (Mda)b2, d2);
    }

    /*
     * WARNING - void declaration
     */
    public float J(Mda mda2) {
        Taa_2 taa_2 = this;
        for (Map.Entry<Mda, Float> b2 : taa_2.I.entrySet()) {
            void a2;
            if (!taa_2.J((Mda)a2, (Mda)b2.getKey())) continue;
            return ((Float)b2.getValue()).floatValue();
        }
        return JPa.N;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Mda mda2, Mda mda3, float f2) {
        void a2;
        void c2;
        Taa_2 d2 = mda3;
        Taa_2 b2 = this;
        b2.J.put((Mda)c2, (Mda)d2);
        b2.I.put((Mda)d2, Float.valueOf((float)a2));
    }

    public Map<Mda, Mda> J() {
        Taa_2 a2;
        return a2.J;
    }

    /*
     * WARNING - void declaration
     */
    public void J(eAa eAa2, Mda mda2, float f2) {
        void b2;
        void c2;
        float d2 = f2;
        Taa_2 a2 = this;
        a2.J(new Mda((eAa)c2, vRa.d, BQa.h), (Mda)b2, d2);
    }
}

