/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  Cra
 *  DQa
 *  FPa
 *  Kpa
 *  NTa
 *  if
 *  lPa
 *  mra
 *  uRa
 *  vB
 */
import java.util.Objects;
import net.minecraft.util.ResourceLocation;

public final class df_3
extends vB {
    private final String J;
    private static final ResourceLocation A;
    private static final ResourceLocation I;

    public void J(int n2, int n3) {
        df_3 a2;
        int c2 = n3;
        df_3 df_32 = a2 = this;
        if.J((String)df_32.J, (double)(df_32.I + oua.i), (double)(a2.J + oua.i), (double)Wqa.Z, (double)Wqa.Z, (int)Bc.Ba.transparent(WF.J()).getRGB());
        if (Boolean.TRUE.equals(WF.L.get(a2.J))) {
            Kpa.J().J().J(I);
            if.J((double)(a2.I - oua.i), (double)(a2.J - oua.i), (double)(a2.k + KPa.y), (double)(a2.j + KPa.y));
        }
        if (Objects.equals(WF.f(), a2.J)) {
            Kpa.J().J().J(A);
            if.J((double)(a2.I + a2.k - DQa.S), (double)(a2.J + a2.j - uRa.I), (double)lPa.K, (double)FPa.T);
        }
    }

    public df_3(String string) {
        Object b2 = string;
        df_3 a2 = this;
        super(uSa.E, uSa.E, NTa.C, NTa.C, null, null);
        a2.J = b2;
    }

    static {
        I = new ResourceLocation(Cra.V, mra.d);
        A = new ResourceLocation(Cra.V, APa.w);
    }
}

