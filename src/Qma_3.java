/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CY
 *  KA
 *  Kpa
 *  NQa
 *  Qsa
 *  ZRa
 *  hca
 *  kNa
 *  ld
 *  lqa
 *  pqa
 *  uKa
 *  vRa
 */
import com.mojang.authlib.GameProfile;
import net.minecraft.util.ResourceLocation;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Qma_3
implements PB {
    private final GameProfile A;
    private final ResourceLocation I;

    @Override
    public ld J() {
        Qma_3 a2;
        return new CY(a2.A.getName());
    }

    @Override
    public void J(kNa kNa2) {
        Qma_3 b2 = kNa2;
        Qma_3 a2 = this;
        Kpa.J().J().J((KC)new hca(a2.A.getId()));
    }

    public Qma_3(GameProfile gameProfile) {
        GameProfile b2 = gameProfile;
        Qma_3 a2 = this;
        a2.A = b2;
        a2.I = XW.J(b2.getName());
        XW.J(a2.I, b2.getName());
    }

    @Override
    public void J(float f2, int n2) {
        int c2 = n2;
        Qma_3 a2 = this;
        Kpa.J().J().J(a2.I);
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)((float)c2 / NQa.Y));
        KA.J((int)uqa.g, (int)uqa.g, (float)Qsa.k, (float)Qsa.k, (int)Yqa.i, (int)Yqa.i, (int)lqa.s, (int)lqa.s, (float)EPa.r, (float)EPa.r);
        KA.J((int)uqa.g, (int)uqa.g, (float)ZRa.l, (float)Qsa.k, (int)Yqa.i, (int)Yqa.i, (int)lqa.s, (int)lqa.s, (float)EPa.r, (float)EPa.r);
    }

    @Override
    public boolean J() {
        return vRa.d != 0;
    }
}

