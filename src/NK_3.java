/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  N
 *  RA
 *  cJ
 */
import java.util.Iterator;
import net.minecraft.client.resources.model.ModelResourceLocation;

public final class NK_3
implements N<ModelResourceLocation, RA> {
    public final /* synthetic */ N A;
    public final /* synthetic */ cJ I;

    public Iterator<RA> iterator() {
        throw new UnsupportedOperationException();
    }

    /*
     * WARNING - void declaration
     */
    public RA J(ModelResourceLocation modelResourceLocation) {
        void a2;
        NK_3 nK_3 = this;
        NK_3 b2 = (RA)cJ.J((cJ)nK_3.I).get(a2);
        if (b2 != null) {
            return b2;
        }
        return (RA)nK_3.A.J((Object)a2);
    }

    /*
     * WARNING - void declaration
     */
    public NK_3(cJ cJ2, N n2) {
        void a2;
        NK_3 b2 = n2;
        n2 = this;
        n2.I = a2;
        n2.A = b2;
    }

    public void J(ModelResourceLocation modelResourceLocation, RA rA2) {
        NK_3 c2 = rA2;
        NK_3 a2 = this;
        throw new UnsupportedOperationException();
    }
}

