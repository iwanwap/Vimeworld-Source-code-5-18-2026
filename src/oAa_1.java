/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Pd
 *  Tz
 *  aX
 *  oAa
 */
import com.google.common.collect.Maps;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

public final class oAa_1
implements KC<Pd> {
    private Map<aX, Integer> I;

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Lca lca) throws IOException {
        int n2;
        void a2;
        oAa_1 oAa_12 = this;
        int n3 = a2.readVarIntFromBuffer();
        oAa_12.I = Maps.newHashMap();
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            void v1 = a2;
            oAa_1 b2 = Tz.J((String)v1.readStringFromBuffer(BQa.h));
            int n5 = v1.readVarIntFromBuffer();
            if (b2 != null) {
                oAa_12.I.put((aX)b2, n5);
            }
            n4 = ++n2;
        }
    }

    public Map<aX, Integer> J() {
        oAa_1 a2;
        return a2.I;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Lca lca) throws IOException {
        Iterator<Map.Entry<aX, Integer>> iterator;
        void a2;
        oAa_1 oAa_12;
        oAa_1 oAa_13 = oAa_12 = this;
        a2.writeVarIntToBuffer(oAa_13.I.size());
        Iterator<Map.Entry<aX, Integer>> iterator2 = iterator = oAa_13.I.entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry<aX, Integer> b2 = iterator.next();
            a2.writeString(((aX)b2.getKey()).statId);
            a2.writeVarIntToBuffer((Integer)b2.getValue());
            iterator2 = iterator;
        }
    }

    public oAa_1(Map<aX, Integer> map) {
        Map<aX, Integer> b2 = map;
        oAa_1 a2 = this;
        a2.I = b2;
    }

    @Override
    public void J(Pd pd2) {
        oAa_1 b2 = pd2;
        oAa_1 a2 = this;
        b2.J((oAa)a2);
    }

    public oAa_1() {
        oAa_1 a2;
    }
}

