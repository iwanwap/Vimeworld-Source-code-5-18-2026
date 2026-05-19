/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CV
 *  D
 *  ES
 *  EU
 *  JPa
 *  MQa
 *  NOa
 *  Oz
 *  Vua
 *  YSa
 *  Zc
 *  bpa
 *  bua
 *  cT
 *  dT
 *  eS
 *  hra
 *  isa
 *  kta
 *  pqa
 *  psa
 *  pua
 *  rt
 *  sS
 *  uKa
 *  vPa
 *  vRa
 *  zU
 */
package net.xtrafrancyz.mods.minidot.items;

import java.util.List;
import net.minecraft.client.model.ModelPlayer;
import net.xtrafrancyz.mods.minidot.items.BaseItem;
import net.xtrafrancyz.mods.minidot.items.MDModel;
import ru.obfuscator.KeepClassName;
import ru.vimeworld.minidot.items.body.BoobsItem;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class MiniDotItem
implements D,
KeepClassName {
    public rt options;
    public List<String> description;
    public boolean replaceRightLeg;
    public boolean isNew;
    public boolean hideWithBoots;
    public String chestName;
    public boolean replaceBody;
    public boolean hideWithChestplate;
    public String name;
    public boolean replaceHead;
    public final MDModel model;
    public boolean hideWithLeggings;
    public Zc currency;
    public boolean hideBodyWear;
    public Character chestTexture;
    public boolean hideCape;
    public boolean replaceLeftArm;
    public YT status;
    public boolean replaceRightArm;
    public int price;
    public boolean hideWithHelmet;
    public sS preview;
    public EU collection;
    public int discount;
    public List<String> creators;
    public final eS type;
    public boolean hideHead;
    public boolean replaceLeftLeg;
    public final int id;
    public boolean isUpdated;

    public boolean f() {
        MiniDotItem a2;
        return a2.isNew;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void f(dT var1_1) {
        block20: {
            block21: {
                b = var1_1;
                a = this;
                var4_2 = uSa.E;
                if (b.view != gt.OUTFIT) break block20;
                var3_3 = b.item.type;
                if (var3_3 == null) {
                    return;
                }
                var2_5 = ES.fromType((eS)var3_3);
                if (var2_5 != null) break block21;
                if (var3_3 != eS.PET) break block20;
                v0 = b;
                var4_2 = (int)a.J((dT)v0, (boolean)(b.pi.J(v0.item) == eS.PET_RIGHT ? vRa.d : uSa.E));
                v1 = a;
                ** GOTO lbl70
            }
            switch (WR.$SwitchMap$net$xtrafrancyz$mods$minidot$items$ItemSlot[var2_5.ordinal()]) {
                case 1: {
                    if (b.f()) {
                        uKa.J((float)JPa.N, (float)mSa.n, (float)JPa.N);
                    }
                    v2 = b;
                    MiniDotItem.J(v2.model.bipedHead);
                    if (!v2.d()) break;
                    if (a.hideWithHelmet) {
                        return;
                    }
                    uKa.l((float)isa.W, (float)isa.W, (float)isa.W);
                    v1 = a;
                    ** GOTO lbl70
                }
                case 2: {
                    if (b.l() && a.hideWithChestplate) {
                        return;
                    }
                    v3 = b;
                    MiniDotItem.J(v3.model.bipedBody);
                    if (v3.f()) {
                        uKa.J((float)JPa.N, (float)STa.N, (float)Qra.j);
                    }
                    if (!(a.model instanceof BoobsItem) || (var2_5 = b.options.J(sqa.b)) == null) break;
                    ((BoobsItem)a.model).f(var2_5.J().floatValue() / kta.v);
                    break;
                }
                case 3: {
                    if (a.hideWithChestplate && b.l()) {
                        return;
                    }
                    if (a.replaceLeftArm) {
                        v4 = b;
                        v4.model.bipedLeftArm.showModel = vRa.d;
                        v4.model.bipedLeftArmwear.showModel = vRa.d;
                    }
                    if (a.replaceRightArm) {
                        v5 = b;
                        v5.model.bipedRightArm.showModel = vRa.d;
                        v5.model.bipedRightArmwear.showModel = vRa.d;
                    }
                    if (!b.f()) break;
                    uKa.J((float)JPa.N, (float)psa.N, (float)JPa.N);
                    v1 = a;
                    ** GOTO lbl70
                }
                case 4: {
                    if (a.hideWithLeggings && b.C()) {
                        return;
                    }
                    if (a.hideWithBoots && b.e()) {
                        return;
                    }
                    var2_6 = MQa.B;
                    if (b.f()) {
                        uKa.J((float)JPa.N, (float)(var2_6 + psa.N - sqa.Z), (float)rta.o);
                        v1 = a;
                    } else {
                        uKa.J((float)JPa.N, (float)var2_6, (float)Vua.e);
                        v1 = a;
                    }
                    ** GOTO lbl70
                }
            }
        }
        try {
            v1 = a;
lbl70:
            // 6 sources

            v1.model.J((dT)b);
            if (var4_2 == 0) return;
            uKa.M((int)Zra.W);
            return;
        }
        catch (Exception var3_4) {
            zU.L.error(new StringBuilder().insert(5 >> 3, YSa.M).append(a.name).toString(), (Throwable)var3_4);
        }
    }

    private static void J(cT a2) {
        if (a2.rotateAngleZ != JPa.N) {
            uKa.J((float)(a2.rotateAngleZ * Hra.Ga / pua.j), (float)JPa.N, (float)JPa.N, (float)pqa.r);
        }
        if (a2.rotateAngleY != JPa.N) {
            uKa.J((float)(a2.rotateAngleY * Hra.Ga / pua.j), (float)JPa.N, (float)pqa.r, (float)JPa.N);
        }
        if (a2.rotateAngleX != JPa.N) {
            uKa.J((float)(a2.rotateAngleX * Hra.Ga / pua.j), (float)pqa.r, (float)JPa.N, (float)JPa.N);
        }
    }

    public EU J() {
        MiniDotItem a2;
        return a2.collection;
    }

    private static void J(dT dT2) {
        dT dT3;
        float a2;
        dT dT4 = dT2;
        if (CV.I == pqa.r && CV.M != pqa.r) {
            a2 = JPa.N;
            dT3 = dT4;
        } else {
            a2 = CV.M;
            dT3 = dT4;
        }
        a2 = MiniDotItem.J(dT3.player.Ma, dT4.player.ba, a2);
        dT dT5 = dT4;
        dT4.pi.j = MiniDotItem.J(dT5.pi.j, a2, bua.T);
        uKa.J((float)(dT5.pi.j - a2), (float)ATa.x, (float)pqa.r, (float)JPa.N);
    }

    /*
     * WARNING - void declaration
     */
    public static float J(float f2, float f3, float f4) {
        void a2;
        float c2 = f3;
        float b2 = f2;
        float f5 = c2 = c2 - b2;
        while (f5 < xua.V) {
            f5 = c2 + CRa.ja;
        }
        float f6 = c2;
        while (f6 >= Hra.Ga) {
            f6 = c2 - CRa.ja;
        }
        return b2 + a2 * c2;
    }

    /*
     * WARNING - void declaration
     */
    public MiniDotItem(int n2, eS eS2, MDModel mDModel) {
        void b2;
        void c2;
        MiniDotItem a2;
        D d2 = mDModel;
        MiniDotItem miniDotItem = a2 = this;
        MiniDotItem miniDotItem2 = a2;
        a2.hideWithHelmet = uSa.E;
        a2.replaceHead = uSa.E;
        a2.hideHead = uSa.E;
        a2.hideWithChestplate = uSa.E;
        a2.replaceBody = uSa.E;
        a2.hideBodyWear = uSa.E;
        a2.hideCape = uSa.E;
        a2.hideWithLeggings = uSa.E;
        a2.hideWithBoots = uSa.E;
        a2.replaceLeftArm = uSa.E;
        a2.replaceRightArm = uSa.E;
        a2.replaceLeftLeg = uSa.E;
        a2.replaceRightLeg = uSa.E;
        a2.collection = EU.NONE;
        a2.isNew = uSa.E;
        a2.isUpdated = uSa.E;
        a2.price = uSa.E;
        a2.discount = uSa.E;
        a2.currency = Zc.COIN;
        a2.status = YT.ARCHIVED;
        MiniDotItem miniDotItem3 = a2;
        a2.options = new rt();
        miniDotItem2.preview = null;
        miniDotItem2.id = c2;
        miniDotItem.type = b2;
        miniDotItem.model = d2;
    }

    /*
     * WARNING - void declaration
     */
    private boolean J(dT dT2, boolean bl) {
        boolean bl2;
        void a2;
        float f2;
        float f3;
        lu f6;
        float f4;
        MiniDotItem c2 = dT2;
        MiniDotItem b2 = this;
        int bl22 = uSa.E;
        MiniDotItem.J((dT)c2);
        float f5 = f4 = b2.model instanceof BaseItem ? JPa.N : vPa.b;
        if (((dT)c2).options != null && (f6 = ((dT)c2).options.J(hra.x)) != null) {
            f3 = (float)((Double)f6.J() / fqa.W);
            f4 += bpa.K - f3 * Ora.D;
        }
        float f7 = b2.model instanceof BaseItem ? JPa.N : ZSa.q;
        f3 = b2.model instanceof BaseItem ? JPa.N : bpa.K;
        float f8 = b2.model instanceof BaseItem ? JPa.N : Oz.d((float)(((dT)c2).time * Nra.e)) * WRa.e;
        float f9 = f2 = b2.model instanceof BaseItem ? JPa.N : Oz.C((float)(((dT)c2).time * Nra.e));
        if (a2 != false) {
            uKa.l((float)vqa.T, (float)pqa.r, (float)pqa.r);
            uKa.M((int)Yua.O);
            bl2 = vRa.d;
        }
        uKa.J((float)f7, (float)(f4 + f8), (float)f3);
        uKa.J((float)(f2 * YSa.G), (float)JPa.N, (float)Ora.D, (float)JPa.N);
        return bl2;
    }

    public boolean J() {
        MiniDotItem a2;
        return a2.isUpdated;
    }

    public String toString() {
        MiniDotItem a2;
        return new StringBuilder().insert(3 ^ 3, NOa.fa).append(a2.id).append(NSa.Ga).append(a2.type).append(Ora.m).append(a2.model).append(tpa.Ha).append(a2.name).append((char)CRa.L).append((char)ySa.Z).toString();
    }

    public List<String> f() {
        MiniDotItem a2;
        return a2.creators;
    }

    public List<String> J() {
        MiniDotItem a2;
        return a2.description;
    }

    public String J() {
        MiniDotItem a2;
        return a2.name;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public void J(XW xW2, ModelPlayer modelPlayer) {
        void var2_3;
        void c2 = var2_3;
        MiniDotItem a2 = this;
        ES eS2 = ES.fromType((eS)a2.type);
        if (eS2 == null) {
            return;
        }
        switch (WR.$SwitchMap$net$xtrafrancyz$mods$minidot$items$ItemSlot[eS2.ordinal()]) {
            case 1: {
                void b2;
                if (a2.hideWithHelmet && b2.J(yRa.d) != null) {
                    return;
                }
                if (!a2.replaceHead) return;
                void v0 = c2;
                v0.bipedHead.showModel = uSa.E;
                v0.bipedHeadwear.showModel = uSa.E;
                return;
            }
            case 2: {
                if (a2.replaceBody) {
                    void v1 = c2;
                    v1.bipedBody.showModel = uSa.E;
                    v1.bipedBodyWear.showModel = uSa.E;
                }
                if (a2.hideBodyWear) {
                    c2.bipedHeadwear.showModel = uSa.E;
                }
                if (a2.hideCape) {
                    c2.bipedCape.showModel = uSa.E;
                }
                if (!a2.hideHead) return;
                void v2 = c2;
                v2.bipedHead.showModel = uSa.E;
                v2.bipedHeadwear.showModel = uSa.E;
                return;
            }
            case 3: {
                void b2;
                if (a2.hideWithChestplate && b2.J(uqa.g) != null) {
                    return;
                }
                if (a2.replaceLeftArm) {
                    void v3 = c2;
                    v3.bipedLeftArm.showModel = uSa.E;
                    v3.bipedLeftArmwear.showModel = uSa.E;
                }
                if (!a2.replaceRightArm) return;
                void v4 = c2;
                v4.bipedRightArm.showModel = uSa.E;
                v4.bipedRightArmwear.showModel = uSa.E;
                return;
            }
            case 4: {
                void b2;
                if (a2.hideWithLeggings && b2.J(vRa.d) != null) {
                    return;
                }
                if (a2.hideWithBoots && b2.J(uSa.E) != null) {
                    return;
                }
                if (a2.replaceLeftLeg) {
                    void v5 = c2;
                    v5.bipedLeftLeg.showModel = uSa.E;
                    v5.bipedLeftLegwear.showModel = uSa.E;
                }
                if (!a2.replaceRightLeg) return;
                void v6 = c2;
                v6.bipedRightLeg.showModel = uSa.E;
                v6.bipedRightLegwear.showModel = uSa.E;
                return;
            }
        }
    }
}

