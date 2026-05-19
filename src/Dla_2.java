/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ANa
 *  Ad
 *  CV
 *  Dla
 *  Gl
 *  JPa
 *  MQa
 *  Mda
 *  Mja
 *  PKa
 *  QS
 *  TPa
 *  Tpa
 *  WTa
 *  ica
 *  id
 *  lja
 *  pda
 *  pqa
 *  uKa
 *  vL
 *  vRa
 *  ysa
 */
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.util.ResourceLocation;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Dla_2
extends Ad<XW> {
    private boolean A;
    private CV I;

    /*
     * WARNING - void declaration
     */
    public void J(XW xW2, double d2, double d3, double d4, String string, float f2, double d5) {
        void c2;
        void b2;
        void d6;
        void e2;
        void f3;
        void g2;
        Dla_2 h2;
        ica ica2;
        void a2;
        Dla_2 dla_2 = this;
        if (a2 < fqa.W && (ica2 = (h2 = g2.J()).J(uqa.g)) != null) {
            h2 = h2.J(g2.J(), ica2);
            dla_2.J((vL)g2, h2.J() + Tpa.E + ica2.f(), (double)f3, (double)e2, (double)d6, ysa.s);
            e2 += (double)((float)dla_2.J().u * TPa.z * b2);
        }
        super.J((vL)g2, (double)f3, (double)e2, (double)d6, (String)c2, (float)b2, (double)a2);
    }

    public ModelPlayer J() {
        Dla_2 a2;
        return (ModelPlayer)super.J();
    }

    public ResourceLocation J(XW xW2) {
        XW b2 = xW2;
        Dla_2 a2 = this;
        return b2.J();
    }

    /*
     * WARNING - void declaration
     */
    public Dla_2(oLa oLa2, boolean bl) {
        void b2;
        Dla_2 a2;
        boolean c2 = bl;
        Dla_2 dla_2 = a2 = this;
        super((oLa)b2, (ModelBase)new ModelPlayer(JPa.N, c2), MQa.L);
        a2.A = c2;
        dla_2.f((id)new PKa((Ad)a2));
        a2.I = new CV((Dla)a2);
        dla_2.f((id)a2.I);
        Dla_2 dla_22 = a2;
        dla_22.f((id)new lja((Ad)dla_22));
        Dla_2 dla_23 = a2;
        dla_23.f(new Nla(dla_23));
        Dla_2 dla_24 = a2;
        dla_24.f((id)new Mja((Dla)dla_24));
        Dla_2 dla_25 = a2;
        dla_25.f(new CJa(((ModelPlayer)dla_25.J()).bipedHead));
    }

    /*
     * WARNING - void declaration
     */
    public void l(XW xW2) {
        void a2;
        Dla_2 dla_2 = this;
        float f2 = pqa.r;
        uKa.f((float)f2, (float)f2, (float)f2);
        Dla_2 dla_22 = dla_2;
        ModelBase b2 = dla_22.J();
        dla_22.J((XW)a2);
        ModelBase modelBase = b2;
        ((ModelPlayer)modelBase).isSneak = uSa.E;
        ((ModelPlayer)modelBase).swingProgress = JPa.N;
        ((ModelPlayer)modelBase).J(JPa.N, JPa.N, JPa.N, JPa.N, JPa.N, rRa.T, (vL)a2);
        ((ModelPlayer)modelBase).J();
    }

    /*
     * WARNING - void declaration
     */
    public void f(XW xW2) {
        void a2;
        Dla_2 dla_2 = this;
        float f2 = pqa.r;
        uKa.f((float)f2, (float)f2, (float)f2);
        Dla_2 dla_22 = dla_2;
        ModelBase b2 = dla_22.J();
        dla_22.J((XW)a2);
        ModelBase modelBase = b2;
        ((ModelPlayer)modelBase).swingProgress = JPa.N;
        ((ModelPlayer)modelBase).isSneak = uSa.E;
        ((ModelPlayer)modelBase).J(JPa.N, JPa.N, JPa.N, JPa.N, JPa.N, rRa.T, (vL)a2);
        ((ModelPlayer)modelBase).bipedRightArm.rotateAngleY = JPa.N;
        ((ModelPlayer)modelBase).bipedRightArm.rotateAngleX = JPa.N;
        ((ModelPlayer)modelBase).bipedRightArmwear.rotateAngleY = JPa.N;
        ((ModelPlayer)modelBase).bipedRightArmwear.rotateAngleX = JPa.N;
        ((ModelPlayer)modelBase).f();
    }

    public void l() {
        uKa.J((float)JPa.N, (float)sqa.Z, (float)JPa.N);
    }

    private void J(XW xW2) {
        Object b2 = xW2;
        Dla_2 a2 = this;
        ModelBase modelBase = a2.J();
        if (((XW)((Object)b2)).t()) {
            ((ModelPlayer)modelBase).J(uSa.E != 0);
            ((ModelPlayer)modelBase).bipedHead.showModel = vRa.d;
            ((ModelPlayer)modelBase).bipedHeadwear.showModel = vRa.d;
            return;
        }
        Mda mda2 = ((XW)((Object)b2)).K.f();
        ModelBase modelBase2 = modelBase;
        ((ModelPlayer)modelBase).J(vRa.d != 0);
        ((ModelPlayer)modelBase).bipedHeadwear.showModel = ((Sx)((Object)b2)).J(pda.HAT);
        ((ModelPlayer)modelBase).bipedBodyWear.showModel = ((Sx)((Object)b2)).J(pda.JACKET);
        ((ModelPlayer)modelBase).bipedLeftLegwear.showModel = ((Sx)((Object)b2)).J(pda.LEFT_PANTS_LEG);
        ((ModelPlayer)modelBase).bipedRightLegwear.showModel = ((Sx)((Object)b2)).J(pda.RIGHT_PANTS_LEG);
        ((ModelPlayer)modelBase).bipedLeftArmwear.showModel = ((Sx)((Object)b2)).J(pda.LEFT_SLEEVE);
        ((ModelPlayer)modelBase).bipedRightArmwear.showModel = ((Sx)((Object)b2)).J(pda.RIGHT_SLEEVE);
        ((ModelPlayer)modelBase2).heldItemLeft = uSa.E;
        ((ModelPlayer)modelBase2).aimedBow = uSa.E;
        ((ModelPlayer)modelBase2).isSneak = b2.q();
        if (mda2 == null) {
            ((ModelPlayer)modelBase).heldItemRight = uSa.E;
            return;
        }
        ((ModelPlayer)modelBase).heldItemRight = vRa.d;
        if (((Sx)((Object)b2)).j() > 0) {
            b2 = mda2.J();
            if (b2 == YFa.BLOCK) {
                ((ModelPlayer)modelBase).heldItemRight = yRa.d;
                return;
            }
            if (b2 == YFa.BOW) {
                ((ModelPlayer)modelBase).aimedBow = vRa.d;
            }
        }
    }

    public void J(XW xW2, float f2) {
        float c2 = f2;
        Dla_2 a2 = this;
        float f3 = pqa.Ha;
        uKa.l((float)f3, (float)f3, (float)f3);
    }

    /*
     * WARNING - void declaration
     */
    public void J(XW xW2, double d2, double d3, double d4, float f2, float f3) {
        void c2;
        void d5;
        void e2;
        void a2;
        XW g2 = xW2;
        Dla_2 f4 = this;
        if (QS.J()) {
            return;
        }
        XW xW3 = g2;
        WTa.f((Sx)xW3, (Dla)f4, (float)a2, (double)e2, (double)d5, (double)c2);
        if (!xW3.Q() || f4.A.B == g2) {
            void b2;
            void var10_7 = d5;
            if (g2.q() && !(g2 instanceof ANa)) {
                var10_7 = d5 - fqa.ca;
            }
            Dla_2 dla_2 = f4;
            dla_2.J(g2);
            dla_2.I.J(g2);
            super.J((Gl)g2, (double)e2, (double)var10_7, (double)c2, (float)b2, (float)a2);
        }
        WTa.J((Sx)g2, (Dla)f4, (float)a2, (double)e2, (double)d5, (double)c2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(XW xW2, float f2, float f3, float f4) {
        void a2;
        void b2;
        void c2;
        XW e2 = xW2;
        Dla_2 d2 = this;
        if (e2.K() && e2.p()) {
            Object object = e2;
            uKa.J((float)((Sx)((Object)object)).F(), (float)JPa.N, (float)pqa.r, (float)JPa.N);
            uKa.J((float)d2.J((Gl)object), (float)JPa.N, (float)JPa.N, (float)pqa.r);
            uKa.J((float)zta.B, (float)JPa.N, (float)pqa.r, (float)JPa.N);
            return;
        }
        super.J((Gl)e2, (float)c2, (float)b2, (float)a2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(XW xW2, double d2, double d3, double d4) {
        void a2;
        void b2;
        void c2;
        XW e2 = xW2;
        Dla_2 d5 = this;
        if (e2.K() && e2.p()) {
            Object object = e2;
            super.f((Gl)object, (double)(c2 + (double)((XW)((Object)object)).n), (double)(b2 + (double)e2.y), (double)(a2 + (double)e2.c));
            return;
        }
        super.f((Gl)e2, (double)c2, (double)b2, (double)a2);
    }

    public Dla_2(oLa oLa2) {
        Object b2 = oLa2;
        Dla_2 a2 = this;
        a2((oLa)b2, uSa.E != 0);
    }
}

