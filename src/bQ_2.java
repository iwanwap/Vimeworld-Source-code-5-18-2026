/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  k
 */
import java.util.List;
import java.util.UUID;

public final class bQ_2 {
    /*
     * WARNING - void declaration
     */
    public static void J(k k2, UUID uUID, List list) {
        k k3 = k2;
        for (Object c2 : k3.J()) {
            void a2;
            void b2;
            if (b2.equals(((jI)c2).J())) {
                a2.add(c2);
            }
            if (!(c2 instanceof k)) continue;
            ((k)c2).J((UUID)b2, (List)a2);
        }
    }
}

