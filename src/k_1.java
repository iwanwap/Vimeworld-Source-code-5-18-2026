/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.UUID;

public interface k_1 {
    /*
     * WARNING - void declaration
     */
    default public void J(UUID uUID, List<Bp> list) {
        k_1 k_12 = this;
        for (Bp c2 : k_12.J()) {
            void a2;
            void b2;
            if (b2.equals(c2.J())) {
                a2.add(c2);
            }
            if (!(c2 instanceof k_1)) continue;
            ((k_1)((Object)c2)).J((UUID)b2, (List<Bp>)a2);
        }
    }

    public float f();

    public float J();

    public List<Bp> J();

    public Bp J(String var1);
}

