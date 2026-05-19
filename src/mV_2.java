/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  QFa
 *  jW
 *  pua
 *  vRa
 */
import com.google.common.base.Predicates;
import java.util.Iterator;
import java.util.Random;
import net.minecraft.block.BlockSand;
import net.minecraft.block.BlockSand$EnumType;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockSlab$EnumBlockHalf;
import net.minecraft.block.BlockStoneSlab;
import net.minecraft.block.BlockStoneSlab$EnumType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockStateHelper;

public final class mV_2
extends jW {
    private final IBlockState j = QFa.Ib.J().J(BlockStoneSlab.VARIANT, BlockStoneSlab$EnumType.SAND).J(BlockSlab.HALF, BlockSlab$EnumBlockHalf.BOTTOM);
    private static final BlockStateHelper J = BlockStateHelper.J(QFa.R).J(BlockSand.VARIANT, Predicates.equalTo(BlockSand$EnumType.SAND));
    private final IBlockState A;
    private final IBlockState I = QFa.qC.J();

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, XF xF2) {
        int n2;
        XF a2;
        void c2;
        Object d322 = random;
        mV_2 b2 = this;
        void v0 = c2;
        while (v0.J(a2) && a2.getY() > uqa.g) {
            a2 = a2.down();
            v0 = c2;
        }
        if (!J.J(c2.J(a2))) {
            return uSa.E != 0;
        }
        int n3 = d322 = rQa.p;
        while (n3 <= uqa.g) {
            int n4 = rQa.p;
            while (n4 <= uqa.g) {
                if (c2.J(a2.add(d322, pua.o, n2)) && c2.J(a2.add(d322, rQa.p, n2))) {
                    return uSa.E != 0;
                }
                n4 = ++n2;
            }
            n3 = ++d322;
        }
        int n5 = d322 = pua.o;
        while (n5 <= 0) {
            int n6 = rQa.p;
            while (n6 <= uqa.g) {
                int n7 = rQa.p;
                while (n7 <= uqa.g) {
                    int n8;
                    XF xF3 = a2.add(n2, d322, n8);
                    c2.J(xF3, b2.I, uqa.g);
                    n7 = ++n8;
                }
                n6 = ++n2;
            }
            n5 = ++d322;
        }
        c2.J(a2, b2.A, uqa.g);
        Iterator<DZ> d322 = LX.HORIZONTAL.iterator();
        Iterator<DZ> iterator = d322;
        while (iterator.hasNext()) {
            DZ dZ2 = d322.next();
            c2.J(a2.offset(dZ2), b2.A, uqa.g);
            iterator = d322;
        }
        int n9 = d322 = rQa.p;
        while (n9 <= uqa.g) {
            int n10 = rQa.p;
            while (n10 <= uqa.g) {
                int n11;
                if (d322 == rQa.p || d322 == uqa.g || n11 == rQa.p || n11 == uqa.g) {
                    c2.J(a2.add(d322, vRa.d, n11), b2.I, uqa.g);
                }
                n10 = ++n11;
            }
            n9 = ++d322;
        }
        c2.J(a2.add(uqa.g, vRa.d, uSa.E), b2.j, uqa.g);
        c2.J(a2.add(rQa.p, vRa.d, uSa.E), b2.j, uqa.g);
        c2.J(a2.add(uSa.E, vRa.d, uqa.g), b2.j, uqa.g);
        c2.J(a2.add(uSa.E, vRa.d, rQa.p), b2.j, uqa.g);
        int d322 = pua.o;
        int n12 = d322;
        while (n12 <= vRa.d) {
            int n13 = pua.o;
            while (n13 <= vRa.d) {
                int n14;
                if (d322 == 0 && n14 == 0) {
                    c2.J(a2.add(d322, AQa.P, n14), b2.I, uqa.g);
                } else {
                    c2.J(a2.add(d322, AQa.P, n14), b2.j, uqa.g);
                }
                n13 = ++n14;
            }
            n12 = ++d322;
        }
        int n15 = d322 = vRa.d;
        while (n15 <= yRa.d) {
            c2.J(a2.add(pua.o, d322, pua.o), b2.I, uqa.g);
            c2.J(a2.add(pua.o, d322, vRa.d), b2.I, uqa.g);
            c2.J(a2.add(vRa.d, d322, pua.o), b2.I, uqa.g);
            XF xF4 = a2.add(vRa.d, d322, vRa.d);
            c2.J(xF4, b2.I, uqa.g);
            n15 = ++d322;
        }
        return vRa.d != 0;
    }

    public mV_2() {
        mV_2 a2;
        a2.A = QFa.jd.J();
    }
}

