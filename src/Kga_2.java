/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  RA
 *  Yka
 */
import java.util.List;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Kga_2
implements RA {
    public final boolean M;
    public final ItemCameraTransforms k;
    public final KLa j;
    public final List<Yka> J;
    public final List<List<Yka>> A;
    public final boolean I;

    public boolean l() {
        Kga_2 a2;
        return a2.I;
    }

    public KLa J() {
        Kga_2 a2;
        return a2.j;
    }

    /*
     * WARNING - void declaration
     */
    public Kga_2(List<Yka> list, List<List<Yka>> list2, boolean bl, boolean bl2, KLa kLa2, ItemCameraTransforms itemCameraTransforms) {
        ItemCameraTransforms g2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        Kga_2 a2;
        Kga_2 kga_2 = itemCameraTransforms2;
        ItemCameraTransforms itemCameraTransforms2 = itemCameraTransforms;
        Kga_2 kga_22 = a2 = kga_2;
        Kga_2 kga_23 = a2;
        Kga_2 kga_24 = a2;
        kga_24.J = f2;
        kga_24.A = e2;
        kga_23.M = d2;
        kga_23.I = c2;
        kga_22.j = b2;
        kga_22.k = g2;
    }

    public boolean f() {
        return uSa.E != 0;
    }

    public List<Yka> J() {
        Kga_2 a2;
        return a2.J;
    }

    public List<Yka> J(DZ dZ2) {
        DZ b2 = dZ2;
        Kga_2 a2 = this;
        return a2.A.get(b2.ordinal());
    }

    public ItemCameraTransforms J() {
        Kga_2 a2;
        return a2.k;
    }

    public boolean J() {
        Kga_2 a2;
        return a2.M;
    }
}

