/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mda
 *  ZOa
 *  xKa
 */
import net.minecraft.client.resources.model.ModelResourceLocation;

public final class Uka_1
implements Fb {
    public final /* synthetic */ xKa A;
    private static final String I = "CL_00002440";

    public Uka_1(xKa xKa2) {
        Uka_1 b2 = xKa2;
        Uka_1 a2 = this;
        a2.A = b2;
    }

    @Override
    public ModelResourceLocation J(Mda mda2) {
        Uka_1 b2 = mda2;
        Uka_1 a2 = this;
        if (eca.f(b2.J())) {
            return new ModelResourceLocation(Ura.k, ZOa.F);
        }
        return new ModelResourceLocation(zta.Y, ZOa.F);
    }
}

