/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  MQa
 *  URa
 *  bKa
 *  gja
 *  vRa
 *  vea
 */
import java.util.Random;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelEnderman;
import net.minecraft.util.ResourceLocation;

public final class bKa_3
extends ic<vea> {
    private ModelEnderman J;
    private Random A;
    private static final ResourceLocation I = new ResourceLocation(URa.D);

    public bKa_3(oLa oLa2) {
        bKa_3 a2;
        Object b2 = oLa2;
        bKa_3 bKa_32 = a2 = this;
        super((oLa)b2, new ModelEnderman(JPa.N), MQa.L);
        bKa_32.A = new Random();
        bKa_32.J = (ModelEnderman)bKa_32.C;
        bKa_3 bKa_33 = a2;
        bKa_33.f(new pLa((bKa)bKa_33));
        bKa_3 bKa_34 = a2;
        bKa_34.f(new gja((bKa)bKa_34));
    }

    public ResourceLocation J(vea vea2) {
        bKa_3 b2 = vea2;
        bKa_3 a2 = this;
        return I;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(vea vea2, double d2, double d3, double d4, float f2, float f3) {
        void a2;
        void b2;
        void c2;
        void d5;
        void e2;
        bKa_3 g2 = vea2;
        bKa_3 f4 = this;
        f4.J.isCarrying = g2.J().J().J() != Material.air ? vRa.d : uSa.E;
        bKa_3 bKa_32 = g2;
        f4.J.isAttacking = bKa_32.ba();
        if (bKa_32.ba()) {
            double d6 = GPa.g;
            e2 += f4.A.nextGaussian() * d6;
            c2 += f4.A.nextGaussian() * d6;
        }
        super.J(g2, (double)e2, (double)d5, (double)c2, (float)b2, (float)a2);
    }
}

