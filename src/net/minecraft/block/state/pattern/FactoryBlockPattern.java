/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Epa
 *  vRa
 *  yra
 */
package net.minecraft.block.state.pattern;

import com.google.common.base.Joiner;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import net.minecraft.block.state.BlockWorldState;
import net.minecraft.block.state.pattern.BlockPattern;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class FactoryBlockPattern {
    private int rowWidth;
    private int aisleHeight;
    private final List<String[]> depth;
    private static final Joiner COMMA_JOIN = Joiner.on(yra.t);
    private final Map<Character, Predicate<BlockWorldState>> symbolMap;

    public static FactoryBlockPattern J() {
        return new FactoryBlockPattern();
    }

    private FactoryBlockPattern() {
        FactoryBlockPattern a2;
        FactoryBlockPattern factoryBlockPattern = a2;
        factoryBlockPattern.depth = Lists.newArrayList();
        factoryBlockPattern.symbolMap = Maps.newHashMap();
        factoryBlockPattern.symbolMap.put(Character.valueOf((char)fPa.i), Predicates.alwaysTrue());
    }

    public BlockPattern J() {
        FactoryBlockPattern a2;
        return new BlockPattern(a2.J());
    }

    private Predicate<BlockWorldState>[][][] J() {
        int n2;
        FactoryBlockPattern factoryBlockPattern = this;
        factoryBlockPattern.J();
        int[] nArray = new int[yRa.d];
        nArray[uSa.E] = factoryBlockPattern.depth.size();
        nArray[vRa.d] = factoryBlockPattern.aisleHeight;
        nArray[uqa.g] = factoryBlockPattern.rowWidth;
        Predicate[][][] predicateArray = (Predicate[][][])Array.newInstance(Predicate.class, nArray);
        int n3 = n2 = uSa.E;
        while (n3 < factoryBlockPattern.depth.size()) {
            int n4 = uSa.E;
            while (n4 < factoryBlockPattern.aisleHeight) {
                int a2;
                int n5 = uSa.E;
                while (n5 < factoryBlockPattern.rowWidth) {
                    int n6;
                    Predicate<BlockWorldState> predicate;
                    FactoryBlockPattern factoryBlockPattern2 = factoryBlockPattern;
                    predicateArray[n2][a2][n6++] = predicate;
                    n5 = n6;
                }
                n4 = ++a2;
            }
            n3 = ++n2;
        }
        return predicateArray;
    }

    private void J() {
        FactoryBlockPattern factoryBlockPattern = this;
        ArrayList a2 = Lists.newArrayList();
        for (Map.Entry<Character, Predicate<BlockWorldState>> entry : factoryBlockPattern.symbolMap.entrySet()) {
            if (entry.getValue() != null) continue;
            a2.add(entry.getKey());
        }
        if (!a2.isEmpty()) {
            throw new IllegalStateException(new StringBuilder().insert(3 ^ 3, zua.N).append(COMMA_JOIN.join(a2)).append(LPa.Y).toString());
        }
    }

    public FactoryBlockPattern J(String ... stringArray) {
        String[] b2 = stringArray;
        String[] a2 = this;
        if (!ArrayUtils.isEmpty(b2) && !StringUtils.isEmpty(b2[uSa.E])) {
            int n2;
            if (a2.depth.isEmpty()) {
                a2.aisleHeight = b2.length;
                a2.rowWidth = b2[uSa.E].length();
            }
            if (b2.length != a2.aisleHeight) {
                throw new IllegalArgumentException(new StringBuilder().insert(3 >> 2, osa.Z).append(a2.aisleHeight).append(Epa.R).append(b2.length).append(hpa.b).toString());
            }
            String[] stringArray2 = b2;
            int n3 = b2.length;
            int n4 = n2 = uSa.E;
            while (n4 < n3) {
                Object object = stringArray2[n2];
                if (((String)object).length() != a2.rowWidth) {
                    throw new IllegalArgumentException(new StringBuilder().insert(3 & 4, CRa.x).append(a2.rowWidth).append(tTa.n).append(((String)object).length()).append(hpa.b).toString());
                }
                char[] cArray = ((String)object).toCharArray();
                object = cArray;
                int n5 = cArray.length;
                int n6 = uSa.E;
                while (n6 < n5) {
                    int n7;
                    Object object2 = object[n7];
                    if (!a2.symbolMap.containsKey(Character.valueOf((char)object2))) {
                        a2.symbolMap.put(Character.valueOf((char)object2), null);
                    }
                    n6 = ++n7;
                }
                n4 = ++n2;
            }
            a2.depth.add(b2);
            return a2;
        }
        throw new IllegalArgumentException(VPa.y);
    }

    /*
     * WARNING - void declaration
     */
    public FactoryBlockPattern J(char c2, Predicate<BlockWorldState> predicate) {
        void b2;
        FactoryBlockPattern a2;
        Predicate<BlockWorldState> c3 = predicate;
        FactoryBlockPattern factoryBlockPattern = a2 = this;
        factoryBlockPattern.symbolMap.put(Character.valueOf((char)b2), c3);
        return factoryBlockPattern;
    }
}

