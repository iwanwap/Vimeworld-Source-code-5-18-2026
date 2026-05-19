/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cra
 *  Dla
 *  Kpa
 *  Lra
 *  dT
 *  eS
 *  id
 *  jt
 *  kpa
 *  pqa
 *  pua
 *  uKa
 *  zU
 *  zs
 */
import java.util.Iterator;
import java.util.Objects;
import java.util.Optional;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.MiniDotItem;
import net.xtrafrancyz.mods.minidot.items.impl.BedrockModel;

public final class CV_1
implements id<XW> {
    public static float M;
    private static final Kpa k;
    private final zU j;
    private final ModelPlayer J;
    public static int A;
    public static float I;

    public CV_1(Dla dla2) {
        CV_1 b2 = dla2;
        CV_1 a2 = this;
        a2.j = zU.M;
        a2.J = b2.J();
    }

    /*
     * WARNING - void declaration
     */
    public void J(XW xW2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        void e22;
        void h2;
        float f9 = f7;
        CV_1 b2 = this;
        if (h2.C()) {
            return;
        }
        if (!b2.j.J()) {
            return;
        }
        if (!jt.b && !h2.J().equals(k.J().J().getId())) {
            return;
        }
        jU g2 = b2.j.f(h2.J());
        if (g2.J().isEmpty()) {
            return;
        }
        I = e22;
        float d2 = (float)Kpa.J().N.f() + M;
        int f222 = jI.J(A);
        jI.J(jI.l(pua.o, f222));
        uKa.o();
        uKa.B();
        uKa.f((int)Lra.k, (int)kpa.J);
        uKa.h();
        Iterator<cw> f222 = g2.J().values().iterator();
        block0: while (true) {
            Iterator<cw> iterator = f222;
            while (iterator.hasNext()) {
                Optional a2;
                dT i2;
                Object e22 = f222.next();
                if (e22 == null) {
                    iterator = f222;
                    continue;
                }
                MiniDotItem c2 = ((cw)e22).I;
                if (c2 == null) continue block0;
                if (c2.type == eS.ARROW) {
                    iterator = f222;
                    continue;
                }
                dT dT2 = i2 = new dT();
                i2.item = c2;
                dT2.time = d2;
                dT2.view = gt.OUTFIT;
                dT2.model = b2.J;
                i2.player = h2;
                i2.pi = g2;
                if (i2.options == null) {
                    i2.options = ((cw)e22).A;
                }
                e22 = null;
                if (i2.options != null && (a2 = i2.options.J()).isPresent()) {
                    BedrockModel bedrockModel;
                    String string = ((zs)a2.get()).J().getTexture();
                    if (c2.model instanceof BedrockModel && !Objects.equals((bedrockModel = (BedrockModel)c2.model).J().J(), string)) {
                        e22 = bedrockModel.J();
                        bedrockModel.J(new ResourceLocation(Cra.V, ((zs)a2.get()).J().getTexture()));
                    }
                }
                uKa.e();
                c2.f(i2);
                uKa.D();
                if (e22 == null) continue block0;
                ((BedrockModel)c2.model).J((ResourceLocation)e22);
                continue block0;
            }
            break;
        }
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        uKa.m();
    }

    /*
     * WARNING - void declaration
     */
    public void J(XW xW2) {
        void a2;
        CV_1 cV_1 = this;
        if (a2.C()) {
            return;
        }
        if (!cV_1.j.J()) {
            return;
        }
        if (!jt.b && !a2.J().equals(k.J().J().getId())) {
            return;
        }
        Object b2 = cV_1.j.f(a2.J());
        if (((jU)b2).J().isEmpty()) {
            return;
        }
        b2 = ((jU)b2).J().values().iterator();
        block0: while (true) {
            Iterator<cw> iterator = b2;
            while (iterator.hasNext()) {
                cw cw2 = b2.next();
                if (cw2 == null) continue block0;
                if (cw2.I.type.isEmote()) {
                    iterator = b2;
                    continue;
                }
                cw2.I.J((XW)a2, cV_1.J);
                iterator = b2;
            }
            break;
        }
    }

    public boolean J() {
        return uSa.E != 0;
    }

    static {
        k = Kpa.J();
    }
}

