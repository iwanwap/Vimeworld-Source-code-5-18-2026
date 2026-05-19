/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  N
 *  RA
 *  U
 *  UK
 *  XTa
 *  aPa
 *  oKa
 */
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.util.ResourceLocation;

public final class Uj_2
extends UK {
    public N<ModelResourceLocation, RA> f() {
        Uj_2 a2;
        Uj_2 uj_2 = a2;
        uj_2.e();
        uj_2.d();
        uj_2.l();
        uj_2.i();
        uj_2.f();
        return uj_2.D;
    }

    /*
     * WARNING - void declaration
     */
    public Uj_2(U u2, WKa wKa2, oKa oKa2) {
        void b2;
        void c2;
        Uj_2 d2 = oKa2;
        Uj_2 a2 = this;
        super((U)c2, (WKa)b2, (oKa)d2);
    }

    public void J(List<String> list) {
        Iterator a2;
        Uj_2 uj_2 = this;
        a2 = a2.iterator();
        while (a2.hasNext()) {
            String string = (String)a2.next();
            Uj_2 uj_22 = uj_2;
            Object b2 = uj_22.J(string);
            uj_22.b.put(string, b2);
            if (uj_22.i.get(b2) != null) continue;
            try {
                Uj_2 uj_23 = uj_2;
                fKa fKa2 = uj_23.J((ResourceLocation)b2);
                uj_23.i.put(b2, fKa2);
            }
            catch (Exception exception) {
                OT.b.warn(new StringBuilder().insert(3 >> 2, aPa.Q).append(b2).append(iSa.f).append(string).append(XTa.Z).toString(), (Throwable)exception);
            }
        }
    }

    public Set<ResourceLocation> f() {
        return new HashSet<ResourceLocation>();
    }
}

