/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ad
 *  MQa
 *  pqa
 *  vRa
 */
import net.minecraft.client.model.ModelBiped;

public class PKa_1
extends pja<ModelBiped> {
    public void J(ModelBiped modelBiped) {
        ModelBiped b2 = modelBiped;
        PKa_1 a2 = this;
        b2.J(uSa.E != 0);
    }

    @Override
    public void J() {
        PKa_1 a2;
        PKa_1 pKa_1 = a2;
        pKa_1.j = new ModelBiped(MQa.L);
        pKa_1.A = new ModelBiped(pqa.r);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(ModelBiped modelBiped, int n2) {
        void a2;
        ModelBiped c2 = modelBiped;
        PKa_1 b2 = this;
        b2.J(c2);
        switch (a2) {
            case 1: {
                ModelBiped modelBiped2 = c2;
                while (false) {
                }
                modelBiped2.bipedRightLeg.showModel = vRa.d;
                modelBiped2.bipedLeftLeg.showModel = vRa.d;
                return;
            }
            case 2: {
                ModelBiped modelBiped3 = c2;
                modelBiped3.bipedBody.showModel = vRa.d;
                modelBiped3.bipedRightLeg.showModel = vRa.d;
                modelBiped3.bipedLeftLeg.showModel = vRa.d;
                return;
            }
            case 3: {
                ModelBiped modelBiped4 = c2;
                modelBiped4.bipedBody.showModel = vRa.d;
                modelBiped4.bipedRightArm.showModel = vRa.d;
                modelBiped4.bipedLeftArm.showModel = vRa.d;
                return;
            }
            case 4: {
                ModelBiped modelBiped5 = c2;
                modelBiped5.bipedHead.showModel = vRa.d;
                modelBiped5.bipedHeadwear.showModel = vRa.d;
            }
        }
    }

    public PKa_1(Ad<?> ad2) {
        Ad<?> b2 = ad2;
        Ad<?> a2 = this;
        super(b2);
    }
}

