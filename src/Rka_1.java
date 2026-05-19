/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ad
 *  Gja
 *  Gl
 *  Lla
 *  MQa
 *  Nja
 *  Rka
 *  Tpa
 *  id
 *  kpa
 *  lja
 *  nda
 *  pqa
 */
import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.model.ModelZombieVillager;
import net.minecraft.util.ResourceLocation;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Rka_1
extends Lla<nda> {
    private static final ResourceLocation M;
    private static final ResourceLocation k;
    private final ModelZombieVillager j;
    private final List<id<nda>> J;
    private final ModelBiped A;
    private final List<id<nda>> I;

    /*
     * WARNING - void declaration
     */
    public void J(nda nda2, double d2, double d3, double d4, float f2, float f3) {
        void a2;
        void b2;
        void c2;
        void d5;
        void e2;
        Rka_1 g2 = nda2;
        Rka_1 f4 = this;
        f4.J((nda)g2);
        super.J((Gl)g2, (double)e2, (double)d5, (double)c2, (float)b2, (float)a2);
    }

    public ResourceLocation J(nda nda2) {
        Rka_1 b2 = nda2;
        Rka_1 a2 = this;
        if (b2.Fa()) {
            return M;
        }
        return k;
    }

    private void J(nda nda2) {
        Rka_1 rka_1;
        Rka_1 b2 = nda2;
        Rka_1 a2 = this;
        if (b2.Fa()) {
            Rka_1 rka_12 = a2;
            rka_1 = rka_12;
            rka_12.C = rka_12.j;
            rka_12.k = rka_12.J;
        } else {
            Rka_1 rka_13 = a2;
            rka_1 = rka_13;
            rka_13.C = rka_13.A;
            rka_13.k = rka_13.I;
        }
        rka_1.I = (ModelBiped)a2.C;
    }

    /*
     * WARNING - void declaration
     */
    public void J(nda nda2, float f2, float f3, float f4) {
        void a2;
        void c2;
        void d2;
        float e2 = f3;
        Rka_1 b2 = this;
        if (d2.v()) {
            e2 += (float)(Math.cos((double)d2.g * kpa.e) * lQa.f * VPa.W);
        }
        super.J((Gl)d2, (float)c2, e2, (float)a2);
    }

    static {
        k = new ResourceLocation(Tpa.O);
        M = new ResourceLocation(Eqa.s);
    }

    public Rka_1(oLa oLa2) {
        Rka_1 a2;
        Object b2 = oLa2;
        Rka_1 rka_1 = a2 = this;
        super((oLa)b2, (ModelBiped)new ModelZombie(), MQa.L, pqa.r);
        b2 = (id)rka_1.k.get(uSa.E);
        Rka_1 rka_12 = a2;
        rka_12.A = rka_12.I;
        rka_12.j = new ModelZombieVillager();
        rka_12.f((id)new lja((Ad)a2));
        Rka_1 rka_13 = a2;
        Nja nja2 = new Nja((Rka)rka_13, (Ad)rka_13);
        a2.f((id)nja2);
        a2.I = Lists.newArrayList(a2.k);
        if (b2 instanceof CJa) {
            a2.J((id)b2);
            Rka_1 rka_14 = a2;
            rka_14.f(new CJa(rka_14.j.bipedHead));
        }
        a2.J((id)nja2);
        Rka_1 rka_15 = a2;
        rka_15.f((id)new Gja((Ad)rka_15));
        a2.J = Lists.newArrayList(a2.k);
    }
}

