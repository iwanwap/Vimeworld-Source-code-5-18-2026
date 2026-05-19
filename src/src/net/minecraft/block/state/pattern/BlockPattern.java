/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  MD
 *  vRa
 */
package net.minecraft.block.state.pattern;

import com.google.common.base.Predicate;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;
import java.util.Iterator;
import net.minecraft.block.state.BlockWorldState;
import net.minecraft.block.state.pattern.BlockPattern$CacheLoader;
import net.minecraft.block.state.pattern.BlockPattern$PatternHelper;

public final class BlockPattern {
    private final int palmLength;
    private final int fingerLength;
    private final int thumbLength;
    private final Predicate<BlockWorldState>[][][] blockMatches;

    /*
     * WARNING - void declaration
     */
    private BlockPattern$PatternHelper J(XF xF2, DZ dZ2, DZ dZ3, LoadingCache<XF, BlockWorldState> loadingCache) {
        void b2;
        void c2;
        void d2;
        void a2;
        int n2;
        BlockPattern blockPattern = this;
        int n3 = n2 = uSa.E;
        while (n3 < blockPattern.palmLength) {
            int n4 = uSa.E;
            while (n4 < blockPattern.thumbLength) {
                int n5;
                int n6 = uSa.E;
                while (n6 < blockPattern.fingerLength) {
                    int e2;
                    if (!blockPattern.blockMatches[e2][n5][n2].apply((BlockWorldState)a2.getUnchecked(BlockPattern.J((XF)d2, (DZ)c2, (DZ)b2, n2, n5, e2)))) {
                        return null;
                    }
                    n6 = ++e2;
                }
                n4 = ++n5;
            }
            n3 = ++n2;
        }
        BlockPattern blockPattern2 = blockPattern;
        return new BlockPattern$PatternHelper((XF)d2, (DZ)c2, (DZ)b2, (LoadingCache<XF, BlockWorldState>)a2, blockPattern2.palmLength, blockPattern2.thumbLength, blockPattern.fingerLength);
    }

    public int f() {
        BlockPattern a2;
        return a2.thumbLength;
    }

    /*
     * WARNING - void declaration
     */
    public static XF J(XF xF2, DZ dZ2, DZ dZ3, int n2, int n3, int n4) {
        MD e2;
        Object f2 = dZ3;
        XF d2 = xF2;
        if (e2 != f2 && e2 != ((DZ)((Object)f2)).getOpposite()) {
            void a2;
            void c2;
            void b2;
            e2 = new MD(e2.getFrontOffsetX(), e2.getFrontOffsetY(), e2.getFrontOffsetZ());
            f2 = new MD(((DZ)((Object)f2)).getFrontOffsetX(), ((DZ)((Object)f2)).getFrontOffsetY(), ((DZ)((Object)f2)).getFrontOffsetZ());
            MD mD2 = e2.crossProduct((MD)f2);
            return d2.add(f2.getX() * -b2 + mD2.getX() * c2 + e2.getX() * a2, f2.getY() * -b2 + mD2.getY() * c2 + e2.getY() * a2, f2.getZ() * -b2 + mD2.getZ() * c2 + e2.getZ() * a2);
        }
        throw new IllegalArgumentException(Npa.ga);
    }

    public int J() {
        BlockPattern a2;
        return a2.palmLength;
    }

    public static LoadingCache<XF, BlockWorldState> J(Gg gg2, boolean bl) {
        boolean b2 = bl;
        Gg a2 = gg2;
        return CacheBuilder.newBuilder().build(new BlockPattern$CacheLoader(a2, b2));
    }

    public BlockPattern$PatternHelper J(Gg gg2, XF xF2) {
        Iterator<XF> a2;
        LoadingCache<XF, BlockWorldState> b2;
        BlockPattern blockPattern = this;
        b2 = BlockPattern.J((Gg)b2, uSa.E != 0);
        BlockPattern blockPattern2 = blockPattern;
        int c22 = Math.max(Math.max(blockPattern2.palmLength, blockPattern2.thumbLength), blockPattern.fingerLength);
        for (XF c22 : XF.getAllInBox((XF)((Object)a2), ((XF)((Object)a2)).add(c22 - vRa.d, c22 - vRa.d, c22 - vRa.d))) {
            DZ[] dZArray = DZ.VALUES;
            int n2 = DZ.VALUES.length;
            int n3 = uSa.E;
            while (n3 < n2) {
                int n4;
                DZ dZ2 = dZArray[n4];
                DZ[] dZArray2 = DZ.VALUES;
                int n5 = DZ.VALUES.length;
                int n6 = uSa.E;
                while (n6 < n5) {
                    int n7;
                    Object object = dZArray2[n7];
                    if (object != dZ2 && object != dZ2.getOpposite() && (object = blockPattern.J(c22, dZ2, (DZ)((Object)object), b2)) != null) {
                        return object;
                    }
                    n6 = ++n7;
                }
                n3 = ++n4;
            }
        }
        return null;
    }

    public BlockPattern(Predicate<BlockWorldState>[][][] predicateArray) {
        Predicate<BlockWorldState>[][][] b2 = predicateArray;
        Predicate<BlockWorldState>[][][] a2 = this;
        a2.blockMatches = b2;
        a2.fingerLength = b2.length;
        if (a2.fingerLength > 0) {
            a2.thumbLength = b2[uSa.E].length;
            if (a2.thumbLength > 0) {
                a2.palmLength = b2[uSa.E][uSa.E].length;
                return;
            }
            a2.palmLength = uSa.E;
            return;
        }
        a2.thumbLength = uSa.E;
        a2.palmLength = uSa.E;
    }
}

