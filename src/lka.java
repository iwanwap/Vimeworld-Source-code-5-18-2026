/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ad
 *  MQa
 *  PKa
 *  fka
 *  pqa
 *  vRa
 */
import net.minecraft.client.model.ModelZombie;

public final class lka
extends PKa {
    public final /* synthetic */ fka I;

    /*
     * WARNING - void declaration
     */
    public lka(fka fka2, Ad ad2) {
        void b2;
        lka c2 = ad2;
        lka a2 = this;
        a2.I = b2;
        super((Ad)c2);
    }

    public void J() {
        lka a2;
        lka lka2 = a2;
        lka2.j = new ModelZombie(MQa.L, vRa.d != 0);
        lka2.A = new ModelZombie(pqa.r, vRa.d != 0);
    }
}

