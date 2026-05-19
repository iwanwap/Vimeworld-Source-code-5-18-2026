/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cra
 *  PF
 *  lE
 *  pn
 *  uQa
 *  vRa
 */
import net.minecraft.util.ResourceLocation;
import optifine.Config;

public final class Le_3 {
    public Le_3() {
        Le_3 a2;
    }

    /*
     * WARNING - void declaration
     */
    public static Ii J(PF pF2, int n2, int n3) {
        void b2;
        int c2 = n3;
        PF a2 = pF2;
        return Le_3.J(a2, lE.fromInt((int)b2), c2);
    }

    /*
     * WARNING - void declaration
     */
    public static Ii J(PF pF2, lE lE2, int n2) {
        void a2;
        void b2;
        PF pF3 = pF2;
        Object c2 = new StringBuilder().insert(5 >> 3, pF3.name().toLowerCase()).append(b2.name().toLowerCase()).toString();
        try {
            if (OT.i.C.J((String)c2) == null) {
                byte[] byArray = Config.J(Config.J(new ResourceLocation(Cra.V, new StringBuilder().insert(3 ^ 3, rSa.f).append(pF3.name().toLowerCase()).append(IPa.W).append(b2.name().toLowerCase()).append(bsa.J).toString())));
                OT.i.C.J((String)c2, byArray);
            }
            return OT.i.g.J((pn)pn.J().setSize((int)a2).setAntiAlias(uSa.E != 0).setFractionalMetrics(vRa.d != 0).setBlur(uSa.E != 0).setPath(new StringBuilder().insert(3 & 4, uQa.Y).append((String)c2).toString()).build());
        }
        catch (Exception exception) {
            return OT.i.g.J((pn)pn.J().setSize((int)a2).setAntiAlias(uSa.E != 0).setFractionalMetrics(vRa.d != 0).setBlur(uSa.E != 0).build());
        }
    }

    public static Ii J(PF pF2, int n2) {
        int b2 = n2;
        PF a2 = pF2;
        return Le_3.J(a2, lE.REGULAR, b2);
    }
}

