/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Vna
 *  pMa
 *  yb
 */
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import net.minecraft.util.ResourceLocation;

public final class NMa_3
implements yb {
    public final /* synthetic */ Vna I;

    public NMa_3(Vna vna2) {
        NMa_3 b2 = vna2;
        NMa_3 a2 = this;
        a2.I = b2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(MinecraftProfileTexture.Type type, ResourceLocation resourceLocation, MinecraftProfileTexture minecraftProfileTexture) {
        void c2;
        ResourceLocation d2 = resourceLocation;
        NMa_3 b2 = this;
        switch (pMa.I[c2.ordinal()]) {
            case 1: {
                void a2;
                NMa_3 nMa_3 = b2;
                while (false) {
                }
                Vna.f((Vna)nMa_3.I, (ResourceLocation)d2);
                Vna.J((Vna)b2.I, (String)a2.getMetadata(Psa.b));
                if (Vna.J((Vna)nMa_3.I) != null) break;
                Vna.J((Vna)b2.I, (String)BQa.la);
                return;
            }
            case 2: {
                Vna.J((Vna)b2.I, (ResourceLocation)d2);
            }
        }
    }
}

