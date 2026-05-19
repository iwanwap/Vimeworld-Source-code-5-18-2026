/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Kga
 *  RA
 *  WGa
 *  Xsa
 *  Yka
 */
import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;

public final class WGa_3 {
    private ItemCameraTransforms M;
    private boolean k;
    private final List<List<Yka>> j;
    private final boolean J;
    private KLa A;
    private final List<Yka> I;

    public WGa J(KLa kLa2) {
        KLa b2 = kLa2;
        WGa_3 a2 = this;
        a2.A = b2;
        return a2;
    }

    public RA J() {
        WGa_3 a2;
        if (a2.A == null) {
            throw new RuntimeException(Xsa.e);
        }
        WGa_3 wGa_3 = a2;
        WGa_3 wGa_32 = a2;
        WGa_3 wGa_33 = a2;
        return new Kga(wGa_3.I, wGa_3.j, wGa_32.J, wGa_32.k, wGa_33.A, wGa_33.M);
    }

    /*
     * WARNING - void declaration
     */
    private void J(RA rA2, KLa kLa2) {
        Object c2 = rA2;
        WGa_3 b2 = this;
        Object object = c2 = c2.J().iterator();
        while (object.hasNext()) {
            void a2;
            Yka yka2 = (Yka)c2.next();
            object = c2;
            b2.J(new eKa(yka2, (KLa)a2));
        }
    }

    /*
     * WARNING - void declaration
     */
    private void J(RA rA2, KLa kLa2, DZ dZ2) {
        void a2;
        Object d2 = rA2;
        WGa_3 c2 = this;
        Object object = d2 = d2.J((DZ)a2).iterator();
        while (object.hasNext()) {
            void b2;
            Yka yka2 = (Yka)d2.next();
            object = d2;
            c2.J((DZ)a2, new eKa(yka2, (KLa)b2));
        }
    }

    public WGa J(Yka yka2) {
        WGa_3 a2;
        WGa_3 b2 = yka2;
        WGa_3 wGa_3 = a2 = this;
        wGa_3.I.add((Yka)b2);
        return wGa_3;
    }

    public WGa_3(fKa fKa2) {
        fKa b2 = fKa2;
        WGa_3 a2 = this;
        a2(b2.l(), b2.f(), b2.J());
    }

    /*
     * WARNING - void declaration
     */
    public WGa_3(RA rA2, KLa kLa2) {
        void a2;
        int n2;
        WGa_3 c2 = rA2;
        WGa_3 b2 = this;
        b2(c2.J(), c2.l(), c2.J());
        b2.A = c2.J();
        DZ[] dZArray = DZ.VALUES;
        int n3 = DZ.VALUES.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            DZ dZ2 = dZArray[n2];
            b2.J((RA)c2, (KLa)a2, dZ2);
            n4 = ++n2;
        }
        b2.J((RA)c2, (KLa)a2);
    }

    /*
     * WARNING - void declaration
     */
    private WGa_3(boolean bl2, boolean bl3, ItemCameraTransforms itemCameraTransforms) {
        void a2;
        void b2;
        void c2;
        int d2;
        WGa_3 wGa_3 = this;
        wGa_3.I = Lists.newArrayList();
        wGa_3.j = Lists.newArrayListWithCapacity(uua.p);
        DZ[] dZArray = DZ.VALUES;
        int n2 = DZ.VALUES.length;
        int n3 = d2 = uSa.E;
        while (n3 < n2) {
            DZ cfr_ignored_0 = dZArray[d2];
            wGa_3.j.add(Lists.newArrayList());
            n3 = ++d2;
        }
        WGa_3 wGa_32 = wGa_3;
        wGa_32.J = c2;
        wGa_32.k = b2;
        wGa_3.M = a2;
    }

    /*
     * WARNING - void declaration
     */
    public WGa J(DZ dZ2, Yka yka2) {
        void b2;
        WGa_3 c2 = yka2;
        WGa_3 a2 = this;
        a2.j.get(b2.ordinal()).add((Yka)c2);
        return a2;
    }
}

