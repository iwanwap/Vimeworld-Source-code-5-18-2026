/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  QFa
 *  lqa
 *  pua
 *  vRa
 */
package net.minecraft.block.state;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPistonBase;
import net.minecraft.block.material.Material;

public final class BlockPistonStructureHelper {
    private final DZ moveDirection;
    private final XF blockToMove;
    private final XF pistonPos;
    private final Gg world;
    private final List<XF> toMove;
    private final List<XF> toDestroy;

    public List<XF> f() {
        BlockPistonStructureHelper a2;
        return a2.toDestroy;
    }

    /*
     * WARNING - void declaration
     */
    private boolean f(XF xF2) {
        XF xF3;
        void a2;
        BlockPistonStructureHelper blockPistonStructureHelper = this;
        Block block = blockPistonStructureHelper.world.J((XF)a2).J();
        if (block.J() == Material.air) {
            return vRa.d != 0;
        }
        if (!BlockPistonBase.J(block, blockPistonStructureHelper.world, (XF)a2, blockPistonStructureHelper.moveDirection, uSa.E != 0)) {
            return vRa.d != 0;
        }
        if (a2.equals((Object)blockPistonStructureHelper.pistonPos)) {
            return vRa.d != 0;
        }
        if (blockPistonStructureHelper.toMove.contains(a2)) {
            return vRa.d != 0;
        }
        int b2 = vRa.d;
        if (b2 + blockPistonStructureHelper.toMove.size() > lqa.s) {
            return uSa.E != 0;
        }
        while (block == QFa.iA && (block = blockPistonStructureHelper.world.J(xF3 = a2.offset(blockPistonStructureHelper.moveDirection.getOpposite(), b2)).J()).J() != Material.air && BlockPistonBase.J(block, blockPistonStructureHelper.world, xF3, blockPistonStructureHelper.moveDirection, uSa.E != 0) && !xF3.equals((Object)blockPistonStructureHelper.pistonPos)) {
            if (++b2 + blockPistonStructureHelper.toMove.size() <= lqa.s) continue;
            return uSa.E != 0;
        }
        int n2 = uSa.E;
        int n3 = b2 = b2 - vRa.d;
        while (n3 >= 0) {
            ++n2;
            blockPistonStructureHelper.toMove.add(a2.offset(blockPistonStructureHelper.moveDirection.getOpposite(), b2));
            n3 = --b2;
        }
        b2 = vRa.d;
        void v1 = a2;
        while (true) {
            XF xF4;
            int n4;
            if ((n4 = blockPistonStructureHelper.toMove.indexOf((Object)(xF4 = v1.offset(blockPistonStructureHelper.moveDirection, b2)))) > pua.o) {
                int n5;
                blockPistonStructureHelper.J(n2, n4);
                int n6 = n5 = uSa.E;
                while (n6 <= n4 + n2) {
                    XF xF5 = blockPistonStructureHelper.toMove.get(n5);
                    if (blockPistonStructureHelper.world.J(xF5).J() == QFa.iA && !blockPistonStructureHelper.J(xF5)) {
                        return uSa.E != 0;
                    }
                    n6 = ++n5;
                }
                return vRa.d != 0;
            }
            block = blockPistonStructureHelper.world.J(xF4).J();
            if (block.J() == Material.air) {
                return vRa.d != 0;
            }
            if (!BlockPistonBase.J(block, blockPistonStructureHelper.world, xF4, blockPistonStructureHelper.moveDirection, vRa.d != 0) || xF4.equals((Object)blockPistonStructureHelper.pistonPos)) {
                return uSa.E != 0;
            }
            if (block.l() == vRa.d) {
                blockPistonStructureHelper.toDestroy.add(xF4);
                return vRa.d != 0;
            }
            if (blockPistonStructureHelper.toMove.size() >= lqa.s) {
                return uSa.E != 0;
            }
            ++n2;
            blockPistonStructureHelper.toMove.add(xF4);
            ++b2;
            v1 = a2;
        }
    }

    public boolean J() {
        BlockPistonStructureHelper blockPistonStructureHelper;
        BlockPistonStructureHelper blockPistonStructureHelper2 = blockPistonStructureHelper = this;
        blockPistonStructureHelper2.toMove.clear();
        blockPistonStructureHelper2.toDestroy.clear();
        Block a2 = blockPistonStructureHelper2.world.J(blockPistonStructureHelper.blockToMove).J();
        BlockPistonStructureHelper blockPistonStructureHelper3 = blockPistonStructureHelper;
        if (!BlockPistonBase.J(a2, blockPistonStructureHelper3.world, blockPistonStructureHelper3.blockToMove, blockPistonStructureHelper.moveDirection, uSa.E != 0)) {
            if (a2.l() != vRa.d) {
                return uSa.E != 0;
            }
            BlockPistonStructureHelper blockPistonStructureHelper4 = blockPistonStructureHelper;
            blockPistonStructureHelper4.toDestroy.add(blockPistonStructureHelper4.blockToMove);
            return vRa.d != 0;
        }
        BlockPistonStructureHelper blockPistonStructureHelper5 = blockPistonStructureHelper;
        if (!blockPistonStructureHelper5.f(blockPistonStructureHelper5.blockToMove)) {
            return uSa.E != 0;
        }
        int n2 = a2 = uSa.E;
        while (n2 < blockPistonStructureHelper.toMove.size()) {
            XF xF2 = blockPistonStructureHelper.toMove.get(a2);
            if (blockPistonStructureHelper.world.J(xF2).J() == QFa.iA && !blockPistonStructureHelper.J(xF2)) {
                return uSa.E != 0;
            }
            n2 = ++a2;
        }
        return vRa.d != 0;
    }

    public List<XF> J() {
        BlockPistonStructureHelper a2;
        return a2.toMove;
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, int n3) {
        void b2;
        void a2;
        BlockPistonStructureHelper blockPistonStructureHelper = this;
        ArrayList<XF> arrayList = Lists.newArrayList();
        ArrayList<XF> arrayList2 = Lists.newArrayList();
        ArrayList c2 = Lists.newArrayList();
        arrayList.addAll(blockPistonStructureHelper.toMove.subList(uSa.E, (int)a2));
        BlockPistonStructureHelper blockPistonStructureHelper2 = blockPistonStructureHelper;
        arrayList2.addAll(blockPistonStructureHelper2.toMove.subList(blockPistonStructureHelper2.toMove.size() - b2, blockPistonStructureHelper.toMove.size()));
        c2.addAll(blockPistonStructureHelper.toMove.subList((int)a2, blockPistonStructureHelper.toMove.size() - b2));
        BlockPistonStructureHelper blockPistonStructureHelper3 = blockPistonStructureHelper;
        blockPistonStructureHelper3.toMove.clear();
        blockPistonStructureHelper3.toMove.addAll(arrayList);
        blockPistonStructureHelper.toMove.addAll(arrayList2);
        blockPistonStructureHelper.toMove.addAll(c2);
    }

    /*
     * WARNING - void declaration
     */
    public BlockPistonStructureHelper(Gg gg2, XF xF2, DZ dZ2, boolean bl) {
        void a2;
        void c2;
        void d2;
        BlockPistonStructureHelper b2;
        DZ e2 = dZ2;
        BlockPistonStructureHelper blockPistonStructureHelper = b2 = this;
        b2.toMove = Lists.newArrayList();
        b2.toDestroy = Lists.newArrayList();
        blockPistonStructureHelper.world = d2;
        blockPistonStructureHelper.pistonPos = c2;
        if (a2 != false) {
            BlockPistonStructureHelper blockPistonStructureHelper2 = b2;
            blockPistonStructureHelper2.moveDirection = e2;
            blockPistonStructureHelper2.blockToMove = c2.offset(e2);
            return;
        }
        DZ dZ3 = e2;
        b2.moveDirection = dZ3.getOpposite();
        b2.blockToMove = c2.offset(dZ3, uqa.g);
    }

    /*
     * WARNING - void declaration
     */
    private boolean J(XF xF2) {
        int b2;
        BlockPistonStructureHelper blockPistonStructureHelper = this;
        DZ[] dZArray = DZ.values();
        int n2 = dZArray.length;
        int n3 = b2 = uSa.E;
        while (n3 < n2) {
            void a2;
            DZ dZ2 = dZArray[b2];
            if (dZ2.getAxis() != blockPistonStructureHelper.moveDirection.getAxis() && !blockPistonStructureHelper.f(a2.offset(dZ2))) {
                return uSa.E != 0;
            }
            n3 = ++b2;
        }
        return vRa.d != 0;
    }
}

