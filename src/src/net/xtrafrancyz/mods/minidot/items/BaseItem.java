/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AMa
 *  D
 *  ES
 *  It
 *  JPa
 *  Js
 *  Kpa
 *  Lu
 *  Oz
 *  SQa
 *  Ssa
 *  Tpa
 *  bpa
 *  cT
 *  cra
 *  dT
 *  eS
 *  kPa
 *  os
 *  pqa
 *  psa
 *  pua
 *  uKa
 *  vRa
 *  xJa
 */
package net.xtrafrancyz.mods.minidot.items;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.MDModel;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class BaseItem
extends ModelBase
implements MDModel {
    public boolean useDisplayLists;
    private static final float ANGLES_IN_RADIAN = 57.295776f;
    public float rotateY;
    public static Js LIGHT_FIX;
    private final eS type;
    private Js[] allModels;
    public static final float DEFAULT_SCALE = 0.0625f;
    public ResourceLocation tex;
    public boolean disableAnimationInPreview;
    private Js[] staticModels;
    public boolean compiled;
    private boolean firstRender;
    private Js[] dynamicModels;
    private boolean needLightFix;
    public float rotateZ;
    public int displayList;
    public float rotateX;

    /*
     * WARNING - void declaration
     */
    public void J(float f2, int n2) {
        float c2 = f2;
        BaseItem b2 = this;
        if (b2.type == eS.HEAD_FACE) {
            void a2;
            uKa.l((float)ATa.r, (float)ATa.r, (float)ATa.r);
            uKa.J((float)(Hra.Ga + Oz.d((float)(c2 * cra.S + (float)a2)) * eta.e), (float)JPa.N, (float)psa.N, (float)JPa.N);
            uKa.J((float)JPa.N, (float)Qra.j, (float)bpa.K);
            return;
        }
        uKa.J((float)(-c2 * Ssa.la), (float)JPa.N, (float)psa.N, (float)JPa.N);
    }

    /*
     * WARNING - void declaration
     */
    private void J(Js js2, Consumer<Js> consumer, Predicate<Js> predicate) {
        void b2;
        void a2;
        Object d2 = js2;
        BaseItem c2 = this;
        if (!a2.test(d2)) {
            return;
        }
        b2.accept(d2);
        if (((Js)d2).childModels != null) {
            Object object = d2 = ((Js)d2).childModels.iterator();
            while (object.hasNext()) {
                Object e2 = d2.next();
                c2.J((Js)e2, (Consumer<Js>)b2, (Predicate<Js>)a2);
                object = d2;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public final void J(Consumer<Js> consumer) {
        int b2;
        BaseItem baseItem = this;
        Js[] jsArray = baseItem.f();
        int n2 = jsArray.length;
        int n3 = b2 = uSa.E;
        while (n3 < n2) {
            void a2;
            Js js2 = jsArray[b2];
            baseItem.J(js2, (Consumer<Js>)a2, eU.J());
            n3 = ++b2;
        }
    }

    public final Js[] l() {
        BaseItem a2;
        BaseItem baseItem = a2;
        baseItem.C();
        return baseItem.allModels;
    }

    /*
     * Unable to fully structure code
     */
    public void J(float var1_3) {
        b = var1_3;
        a = this;
        b = ES.fromType((eS)a.type);
        if (b == null) ** GOTO lbl-1000
        switch (It.$SwitchMap$net$xtrafrancyz$mods$minidot$items$ItemSlot[b.ordinal()]) lbl-1000:
        // 2 sources

        {
            case 1: {
                if (false) ** GOTO lbl-1000
                uKa.J((float)JPa.N, (float)kPa.W, (float)JPa.N);
                v0 = a;
                break;
            }
            case 2: {
                uKa.J((float)JPa.N, (float)SQa.w, (float)Tpa.S);
                uKa.l((float)ZSa.q, (float)ZSa.q, (float)ZSa.q);
            }
            default: lbl-1000:
            // 2 sources

            {
                v0 = a;
            }
        }
        if (v0.disableAnimationInPreview) {
            a.J(os.J());
        }
        Kpa.J().J().J(a.tex);
        a.f();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void C() {
        Js js2 = this;
        if (js2.allModels != null) return;
        try {
            int n2;
            ArrayList<Object> arrayList = new ArrayList<Object>();
            ArrayList<Object> arrayList2 = new ArrayList<Object>();
            ArrayList<Object> arrayList3 = new ArrayList<Object>();
            Object object = js2.getClass().getDeclaredFields();
            int n3 = ((Field[])object).length;
            int n4 = n2 = uSa.E;
            while (true) {
                block16: {
                    int n5;
                    int n6;
                    int n7;
                    Js a2;
                    Field field;
                    block17: {
                        block14: {
                            block15: {
                                ArrayList<Object> arrayList4;
                                if (n4 >= n3) break block14;
                                field = object[n2];
                                field.setAccessible(vRa.d != 0);
                                if (!Js.class.isAssignableFrom(field.getType())) break block15;
                                a2 = (Js)field.get(js2);
                                if (a2 == null) break block16;
                                a2.name = field.getName();
                                if (a2.parent != null) break block16;
                                if (a2.f()) {
                                    arrayList4 = arrayList3;
                                    arrayList2.add(a2);
                                } else {
                                    arrayList.add(a2);
                                    arrayList4 = arrayList3;
                                }
                                arrayList4.add(a2);
                                break block16;
                            }
                            if (!Js[].class.isAssignableFrom(field.getType())) break block16;
                            a2 = (Js)field.get(js2);
                            n7 = uSa.E;
                            n6 = ((Js[])a2).length;
                            n5 = uSa.E;
                            break block17;
                        }
                        js2.staticModels = arrayList.toArray(new Js[uSa.E]);
                        js2.dynamicModels = arrayList2.toArray(new Js[uSa.E]);
                        js2.allModels = arrayList3.toArray(new Js[uSa.E]);
                        object = Lu.J();
                        Js js3 = null;
                        if (js2.staticModels.length > 0) {
                            js3 = js2.staticModels[js2.staticModels.length - vRa.d];
                        }
                        if (js2.dynamicModels.length > 0) {
                            js3 = js2.dynamicModels[js2.dynamicModels.length - vRa.d];
                        }
                        if (js3 != null) {
                            js2.needLightFix |= ((Boolean)object.apply(js3)).booleanValue();
                        }
                        if (js2.allModels.length <= 0) return;
                        js2.needLightFix |= ((Boolean)object.apply(js2.allModels[js2.allModels.length - vRa.d])).booleanValue();
                        return;
                    }
                    while (n5 < n6) {
                        int n8;
                        Js js4;
                        StringBuilder stringBuilder = new StringBuilder().append(field.getName()).append(dqa.X).append(n7).append(XOa.D);
                        ++n7;
                        (js4 = a2[n8]).name = stringBuilder.toString();
                        if ((js4 = a2[n8]).parent == null) {
                            ArrayList<Object> arrayList5;
                            if (js4.f()) {
                                arrayList5 = arrayList3;
                                arrayList2.add(js4);
                            } else {
                                arrayList.add(js4);
                                arrayList5 = arrayList3;
                            }
                            arrayList5.add(js4);
                        }
                        n5 = ++n8;
                    }
                }
                n4 = ++n2;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
            js2.staticModels = new Js[uSa.E];
            js2.dynamicModels = new Js[uSa.E];
            js2.allModels = new Js[uSa.E];
        }
    }

    public void J(ResourceLocation resourceLocation) {
        D b2 = resourceLocation;
        BaseItem a2 = this;
        a2.tex = b2;
    }

    public final Js[] f() {
        BaseItem a2;
        BaseItem baseItem = a2;
        baseItem.C();
        return baseItem.dynamicModels;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Js js2, float f2, float f3, float f4) {
        void a2;
        void b2;
        void c2;
        BaseItem e2 = js2;
        BaseItem d2 = this;
        BaseItem baseItem = e2;
        ((Js)e2).origRotationX = c2;
        ((Js)baseItem).origRotationY = b2;
        ((Js)baseItem).origRotationZ = a2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(float f2, float f3, float f4) {
        void c2;
        void b2;
        float d2 = f4;
        BaseItem a2 = this;
        if (d2 != JPa.N) {
            uKa.J((float)(d2 * zpa.Z), (float)JPa.N, (float)JPa.N, (float)pqa.r);
        }
        if (b2 != JPa.N) {
            uKa.J((float)(b2 * zpa.Z), (float)JPa.N, (float)pqa.r, (float)JPa.N);
        }
        if (c2 != JPa.N) {
            uKa.J((float)(c2 * zpa.Z), (float)pqa.r, (float)JPa.N, (float)JPa.N);
        }
    }

    public static /* synthetic */ void J(Js a2) {
        Js js2 = a2;
        js2.rotationX = JPa.N;
        js2.rotationY = JPa.N;
        js2.rotationZ = JPa.N;
        js2.rotationPointX = js2.origRotationPointX;
        js2.rotationPointY = js2.origRotationPointY;
        js2.rotationPointZ = js2.origRotationPointZ;
    }

    public final Js[] J() {
        BaseItem a2;
        BaseItem baseItem = a2;
        baseItem.C();
        return baseItem.staticModels;
    }

    public ResourceLocation J() {
        BaseItem a2;
        return a2.tex;
    }

    public void f(ModelPlayer modelPlayer, Sx sx2, float f2, jU jU2) {
        BaseItem baseItem = jU3;
        jU jU3 = jU2;
        BaseItem a2 = baseItem;
    }

    public BaseItem(eS eS2) {
        BaseItem a2;
        BaseItem b2 = eS2;
        BaseItem baseItem = a2 = this;
        BaseItem baseItem2 = a2;
        BaseItem baseItem3 = a2;
        BaseItem baseItem4 = a2;
        a2.rotateX = JPa.N;
        a2.rotateY = JPa.N;
        a2.rotateZ = JPa.N;
        baseItem4.tex = null;
        baseItem4.staticModels = null;
        baseItem3.dynamicModels = null;
        baseItem2.allModels = null;
        baseItem3.needLightFix = uSa.E;
        baseItem2.useDisplayLists = uSa.E;
        baseItem2.displayList = pua.o;
        baseItem2.compiled = uSa.E;
        baseItem.disableAnimationInPreview = uSa.E;
        baseItem.firstRender = vRa.d;
        baseItem.type = b2;
        if (LIGHT_FIX == null) {
            LIGHT_FIX = new Js((ModelBase)a2, uSa.E, uSa.E);
            LIGHT_FIX.J(JPa.N, JPa.N, JPa.N, vRa.d, vRa.d, uSa.E);
        }
    }

    @Override
    public Js J(String string) {
        String b2 = string;
        BaseItem a2 = this;
        return BaseItem.J(b2, a2.l());
    }

    /*
     * WARNING - void declaration
     */
    private static Js J(String string, Js[] jsArray) {
        int n2;
        void a2;
        String string2 = string;
        int n3 = ((void)a2).length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            Object b2 = a2[n2];
            if (((Js)b2).name.equals(string2)) {
                return b2;
            }
            if (((Js)b2).childModels != null) {
                Js[] jsArray2 = new Js[((Js)b2).childModels.size()];
                int n5 = uSa.E;
                Object object = b2 = ((Js)b2).childModels.iterator();
                while (object.hasNext()) {
                    Object e2 = b2.next();
                    jsArray2[n5++] = (Js)e2;
                    object = b2;
                }
                b2 = BaseItem.J(string2, jsArray2);
                if (b2 != null) {
                    return b2;
                }
            }
            n4 = ++n2;
        }
        return null;
    }

    public void l() {
        int a2;
        BaseItem baseItem = this;
        Js[] jsArray = baseItem.J();
        int n2 = jsArray.length;
        int n3 = a2 = uSa.E;
        while (n3 < n2) {
            jsArray[a2++].C(rRa.T);
            n3 = a2;
        }
    }

    public void f() {
        BaseItem baseItem;
        block6: {
            BaseItem baseItem2;
            block5: {
                int a22;
                block3: {
                    block4: {
                        int a22;
                        baseItem2 = this;
                        if (!baseItem2.useDisplayLists) break block3;
                        if (!baseItem2.compiled) break block4;
                        BaseItem baseItem3 = baseItem2;
                        uKa.l((int)baseItem3.displayList);
                        Js[] jsArray = baseItem3.dynamicModels;
                        int n2 = baseItem3.dynamicModels.length;
                        int n3 = a22 = uSa.E;
                        while (n3 < n2) {
                            Js js2 = jsArray[a22];
                            js2.C(rRa.T);
                            n3 = ++a22;
                        }
                        break block5;
                    }
                    BaseItem baseItem4 = baseItem2;
                    baseItem = baseItem4;
                    baseItem4.l();
                    baseItem4.displayList = xJa.J((int)vRa.d);
                    GL11.glNewList(baseItem4.displayList, Wqa.O);
                    baseItem4.l();
                    GL11.glEndList();
                    baseItem4.compiled = vRa.d;
                    break block6;
                }
                Js[] jsArray = baseItem2.l();
                int n4 = jsArray.length;
                int n5 = a22 = uSa.E;
                while (n5 < n4) {
                    Js js3 = jsArray[a22];
                    js3.C(rRa.T);
                    n5 = ++a22;
                }
            }
            baseItem = baseItem2;
        }
        if (baseItem.needLightFix) {
            LIGHT_FIX.C(aua.V);
        }
    }

    public final void J() {
        BaseItem a2;
        a2.allModels = null;
        a2.C();
    }

    /*
     * WARNING - void declaration
     */
    public void J(ModelPlayer modelPlayer, Sx sx2, float f2, jU jU2) {
        jU e2;
        void b2;
        void c2;
        void d2;
        BaseItem baseItem = jU3;
        jU jU3 = jU2;
        BaseItem a2 = baseItem;
        uKa.e();
        a2.f((ModelPlayer)d2, (Sx)c2, (float)b2, e2);
        BaseItem baseItem2 = a2;
        Kpa.J().J().J(baseItem2.tex);
        baseItem2.f();
        uKa.D();
    }

    public void J(cT cT2) {
        BaseItem a2;
        BaseItem b2 = cT2;
        BaseItem baseItem = a2 = this;
        BaseItem baseItem2 = b2;
        a2.rotateX = ((cT)baseItem2).rotateAngleX;
        baseItem.rotateY = ((cT)baseItem2).rotateAngleY;
        baseItem.rotateZ = ((cT)b2).rotateAngleZ;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static /* synthetic */ Boolean J(cT cT2) {
        int n2;
        cT cT3;
        cT cT4 = cT3 = cT2;
        while (cT4.childModels != null) {
            cT cT5 = cT3;
            cT4 = (cT)cT5.childModels.get(cT5.childModels.size() - vRa.d);
        }
        cT cT6 = cT3;
        cT a2 = (AMa)cT6.cubeList.get(cT6.cubeList.size() - vRa.d);
        if (a2.C != a2.j) {
            cT cT7 = a2;
            if (cT7.M != cT7.J) {
                n2 = uSa.E;
                return n2 != 0;
            }
        }
        n2 = vRa.d;
        return n2 != 0;
    }

    @Override
    public void J(dT dT2) {
        BaseItem b2 = dT2;
        BaseItem a2 = this;
        if (a2.firstRender) {
            int n2;
            a2.firstRender = uSa.E;
            Js[] jsArray = a2.J();
            int n3 = jsArray.length;
            int n4 = n2 = uSa.E;
            while (n4 < n3) {
                if (jsArray[n2].f()) {
                    a2.J();
                    break;
                }
                n4 = ++n2;
            }
        }
        switch (It.$SwitchMap$net$xtrafrancyz$mods$minidot$items$RenderContext$View[((dT)b2).view.ordinal()]) {
            case 1: {
                while (false) {
                }
                if (ES.fromType((eS)((dT)b2).item.type) == ES.BODY && b2.l()) {
                    uKa.J((float)JPa.N, (float)JPa.N, (float)POa.o);
                }
                BaseItem baseItem = b2;
                BaseItem baseItem2 = b2;
                a2.J(((dT)baseItem).model, ((dT)baseItem).player, ((dT)baseItem2).time, ((dT)baseItem2).pi);
                return;
            }
            case 2: {
                BaseItem baseItem = a2;
                BaseItem baseItem3 = b2;
                baseItem.J(((dT)baseItem3).time, uSa.E);
                baseItem.J(((dT)baseItem3).time);
            }
        }
    }
}

