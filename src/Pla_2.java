/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Jka
 *  Vc
 */
import com.google.common.base.Objects;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.model.ModelResourceLocation;

public final class Pla_2 {
    private Map<Block, Vc> A = Maps.newIdentityHashMap();
    private Set<Block> I = Sets.newIdentityHashSet();

    /*
     * WARNING - void declaration
     */
    public void J(Block block, Vc vc2) {
        void b2;
        Pla_2 c2 = vc2;
        Pla_2 a2 = this;
        a2.A.put((Block)b2, (Vc)c2);
    }

    public Map<IBlockState, ModelResourceLocation> J() {
        Pla_2 pla_2 = this;
        IdentityHashMap<IBlockState, ModelResourceLocation> identityHashMap = Maps.newIdentityHashMap();
        Iterator iterator = Block.blockRegistry.iterator();
        while (iterator.hasNext()) {
            Block a2 = (Block)iterator.next();
            if (pla_2.I.contains(a2)) continue;
            identityHashMap.putAll(((Vc)Objects.firstNonNull(pla_2.A.get(a2), new Jka())).J(a2));
        }
        return identityHashMap;
    }

    public void J(Block ... blockArray) {
        Block[] b2 = blockArray;
        Block[] a2 = this;
        Collections.addAll(a2.I, b2);
    }

    public Pla_2() {
        Pla_2 a2;
    }
}

