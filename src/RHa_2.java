/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  OLa
 *  RHa
 *  WSa
 *  XJa
 *  tJa
 *  vRa
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.minecraft.util.ResourceLocation;

public final class RHa_2 {
    private final String A;
    private final List<XJa> I;

    /*
     * WARNING - void declaration
     */
    public RHa J(String string, String string2, AGa aGa2) {
        void b2;
        void c2;
        Object d2 = aGa2;
        RHa_2 a2 = this;
        return a2.J((String)c2, (String)b2, (AGa)((Object)d2), vRa.d != 0);
    }

    public RHa_2(String string) {
        String b2 = string;
        RHa_2 a2 = this;
        RHa_2 rHa_2 = a2;
        a2.I = new ArrayList<XJa>();
        a2.A = b2;
    }

    /*
     * WARNING - void declaration
     */
    public RHa J(String string, String string2, AGa aGa2, boolean bl2) {
        void d2;
        void a2;
        void b2;
        Object e2 = string2;
        RHa_2 c2 = this;
        e2 = new ResourceLocation(new StringBuilder().insert(5 >> 3, eua.Ja).append((String)e2).append(WSa.f).append(c2.A).toString());
        e2 = new OLa((ResourceLocation)e2, (AGa)b2, (boolean)a2, vRa.d);
        RHa_2 rHa_2 = c2;
        rHa_2.I.add(new XJa((String)d2, Collections.singletonList(e2)));
        return rHa_2;
    }

    public tJa J() {
        RHa_2 a2;
        return new tJa(a2.I);
    }
}

