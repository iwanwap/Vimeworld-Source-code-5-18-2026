/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  aJa
 *  dMa
 *  dW
 */
import com.google.common.collect.Maps;
import java.util.Map;
import net.minecraft.util.ResourceLocation;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class dMa_2 {
    private final Map<String, Lma> J;
    private static final ResourceLocation A = new ResourceLocation(tSa.x);
    private final aJa I;

    public dMa_2(aJa aJa2) {
        dMa_2 b2 = aJa2;
        dMa_2 a2 = this;
        a2.J = Maps.newHashMap();
        a2.I = b2;
    }

    public static /* synthetic */ aJa J(dMa a2) {
        return a2.I;
    }

    /*
     * WARNING - void declaration
     */
    public void J(dW dW2, boolean bl) {
        void b2;
        boolean c2 = bl;
        dMa_2 a2 = this;
        Lma.J(a2.J((dW)b2), c2);
    }

    public void J() {
        Object a2;
        dMa_2 dMa_22 = this;
        Object object = a2 = dMa_22.J.values().iterator();
        while (object.hasNext()) {
            Lma lma2 = (Lma)a2.next();
            object = a2;
            dMa_22.I.f(Lma.J(lma2));
        }
        dMa_22.J.clear();
    }

    public void J(dW dW2) {
        dMa_2 b2 = dW2;
        dMa_2 a2 = this;
        Lma.J(a2.J((dW)b2));
    }

    public static /* synthetic */ ResourceLocation J() {
        return A;
    }

    /*
     * WARNING - void declaration
     */
    private Lma J(dW dW2) {
        void a2;
        dMa_2 dMa_22 = this;
        Object b2 = dMa_22.J.get(a2.mapName);
        if (b2 == null) {
            b2 = new Lma((dMa)dMa_22, (dW)a2, null);
            dMa_22.J.put(a2.mapName, (Lma)b2);
        }
        return b2;
    }
}

