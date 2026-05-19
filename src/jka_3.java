/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ad
 *  JPa
 *  Oea
 *  id
 *  jRa
 *  jka
 *  lja
 *  pqa
 *  sKa
 *  uKa
 */
import net.minecraft.client.model.ModelArmorStand;
import net.minecraft.client.model.ModelBase;
import net.minecraft.util.ResourceLocation;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class jka_3
extends Ad<Oea> {
    public static final ResourceLocation I = new ResourceLocation(jRa.r);

    public ResourceLocation J(Oea oea2) {
        jka_3 b2 = oea2;
        jka_3 a2 = this;
        return I;
    }

    public jka_3(oLa oLa2) {
        Object b2 = oLa2;
        jka_3 a2 = this;
        super((oLa)b2, (ModelBase)new ModelArmorStand(), JPa.N);
        jka_3 jka_32 = a2;
        jka_32.f((id)new sKa((jka)jka_32, (Ad)a2));
        jka_3 jka_33 = a2;
        jka_33.f((id)new lja((Ad)jka_33));
        jka_3 jka_34 = a2;
        jka_34.f(new CJa(((ModelArmorStand)jka_34.J()).bipedHead));
    }

    public void J(Oea oea2, float f2, float f3, float f4) {
        float e2 = f3;
        jka_3 b2 = this;
        uKa.J((float)(Hra.Ga - e2), (float)JPa.N, (float)pqa.r, (float)JPa.N);
    }

    public ModelArmorStand J() {
        jka_3 a2;
        return (ModelArmorStand)super.J();
    }

    public boolean J(Oea oea2) {
        jka_3 b2 = oea2;
        jka_3 a2 = this;
        return b2.a();
    }
}

