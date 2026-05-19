/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ad
 *  KJa
 *  Lla
 *  MEa
 *  MQa
 *  id
 *  lja
 *  pqa
 *  wja
 */
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelZombie;
import net.minecraft.util.ResourceLocation;

public final class wja_1
extends Lla<MEa> {
    private static final ResourceLocation I = new ResourceLocation(xua.M);

    public wja_1(oLa oLa2) {
        Object b2 = oLa2;
        wja_1 a2 = this;
        super((oLa)b2, (ModelBiped)new ModelZombie(), MQa.L, pqa.r);
        wja_1 wja_12 = a2;
        wja_12.f((id)new lja((Ad)wja_12));
        wja_1 wja_13 = a2;
        wja_13.f((id)new KJa((wja)wja_13, (Ad)a2));
    }

    public ResourceLocation J(MEa mEa2) {
        wja_1 b2 = mEa2;
        wja_1 a2 = this;
        return I;
    }
}

