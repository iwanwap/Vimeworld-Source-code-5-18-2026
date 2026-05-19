/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Fpa
 */
package net.minecraft.block.state.pattern;

import com.google.common.base.Objects;
import com.google.common.cache.LoadingCache;
import net.minecraft.block.state.BlockWorldState;
import net.minecraft.block.state.pattern.BlockPattern;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockPattern$PatternHelper {
    private final int field_181121_f;
    private final DZ finger;
    private final DZ thumb;
    private final LoadingCache<XF, BlockWorldState> lcache;
    private final int field_181120_e;
    private final int field_181122_g;
    private final XF pos;

    /*
     * WARNING - void declaration
     */
    public BlockPattern$PatternHelper(XF xF2, DZ dZ2, DZ dZ3, LoadingCache<XF, BlockWorldState> loadingCache, int n2, int n3, int n4) {
        void h2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        void g2;
        BlockPattern$PatternHelper a2;
        int n5 = n4;
        BlockPattern$PatternHelper blockPattern$PatternHelper = a2 = this;
        BlockPattern$PatternHelper blockPattern$PatternHelper2 = a2;
        BlockPattern$PatternHelper blockPattern$PatternHelper3 = a2;
        a2.pos = g2;
        blockPattern$PatternHelper3.finger = f2;
        blockPattern$PatternHelper3.thumb = e2;
        blockPattern$PatternHelper2.lcache = d2;
        blockPattern$PatternHelper2.field_181120_e = c2;
        blockPattern$PatternHelper.field_181121_f = b2;
        blockPattern$PatternHelper.field_181122_g = h2;
    }

    /*
     * WARNING - void declaration
     */
    public BlockWorldState J(int n2, int n3, int n4) {
        void b2;
        void c2;
        BlockPattern$PatternHelper a2;
        int d2 = n4;
        BlockPattern$PatternHelper blockPattern$PatternHelper = a2 = this;
        return blockPattern$PatternHelper.lcache.getUnchecked(BlockPattern.J(blockPattern$PatternHelper.pos, a2.f(), a2.J(), (int)c2, (int)b2, d2));
    }

    public DZ f() {
        BlockPattern$PatternHelper a2;
        return a2.finger;
    }

    public int f() {
        BlockPattern$PatternHelper a2;
        return a2.field_181120_e;
    }

    public String toString() {
        BlockPattern$PatternHelper a2;
        return Objects.toStringHelper(a2).add(dsa.a, (Object)a2.thumb).add(Fpa.s, (Object)a2.finger).add(Qpa.j, (Object)a2.pos).toString();
    }

    public XF J() {
        BlockPattern$PatternHelper a2;
        return a2.pos;
    }

    public int J() {
        BlockPattern$PatternHelper a2;
        return a2.field_181121_f;
    }

    public DZ J() {
        BlockPattern$PatternHelper a2;
        return a2.thumb;
    }
}

