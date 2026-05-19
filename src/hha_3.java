/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  NC
 *  UK
 */
import java.util.Iterator;
import java.util.Set;
import net.minecraft.util.ResourceLocation;

public final class hha_3
implements NC {
    public final /* synthetic */ Set A;
    public final /* synthetic */ UK I;

    /*
     * WARNING - void declaration
     */
    public void J(WKa wKa2) {
        Iterator iterator;
        hha_3 hha_32 = this;
        Iterator iterator2 = iterator = hha_32.A.iterator();
        while (iterator2.hasNext()) {
            void a2;
            ResourceLocation b2 = (ResourceLocation)iterator.next();
            KLa kLa2 = a2.J(b2);
            iterator2 = iterator;
            UK.J((UK)hha_32.I).put(b2, kLa2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public hha_3(UK uK2, Set object) {
        void a2;
        Object b2 = object;
        object = this;
        ((hha_3)object).I = a2;
        ((hha_3)object).A = b2;
        object();
    }
}

