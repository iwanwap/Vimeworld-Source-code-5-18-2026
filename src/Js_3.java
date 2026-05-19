/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  Js
 *  cT
 *  pqa
 *  uKa
 *  vRa
 */
import net.minecraft.client.model.ModelBase;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Js_3
extends cT {
    public float rotationY;
    public float origRotationPointX;
    public float scaleZ;
    public float origRotationY;
    private boolean isDynamicIndirectly;
    public float rotationX;
    public Js parent;
    public float scaleY;
    public String name;
    public float scaleModifier;
    public float origRotationZ;
    public float scaleX;
    private boolean isDynamic;
    public float origRotationPointY;
    public float origRotationX;
    public float rotationZ;
    public float origRotationPointZ;

    public void J(boolean bl) {
        boolean b2 = bl;
        Js_3 a2 = this;
        a2.isDynamic = b2;
        if (a2.isDynamic) {
            a2.f();
        }
    }

    /*
     * WARNING - void declaration
     */
    public Js_3(ModelBase modelBase, int n2, int n3) {
        void b2;
        void c2;
        Js_3 a2;
        int d2 = n3;
        Js_3 js_3 = a2 = this;
        super((ModelBase)c2, (int)b2, d2);
        a2.origRotationX = JPa.N;
        a2.origRotationY = JPa.N;
        a2.origRotationZ = JPa.N;
        a2.rotationX = JPa.N;
        a2.rotationY = JPa.N;
        a2.rotationZ = JPa.N;
        a2.scaleX = pqa.r;
        a2.scaleY = pqa.r;
        a2.scaleZ = pqa.r;
        a2.isDynamic = uSa.E;
        js_3.isDynamicIndirectly = uSa.E;
        js_3.parent = null;
        js_3.scaleModifier = pqa.r;
    }

    /*
     * WARNING - void declaration
     */
    public void J(float f2, float f3, float f4) {
        void b2;
        void c2;
        Js_3 a2;
        float d2 = f4;
        Js_3 js_3 = a2 = this;
        js_3.origRotationPointX = c2;
        js_3.origRotationPointY = b2;
        a2.origRotationPointZ = d2;
        super.J((float)c2, (float)b2, d2);
    }

    private void f() {
        Js_3 js_3 = this;
        Js_3 a2 = js_3.parent;
        Object object = a2;
        while (object != null) {
            a2.isDynamicIndirectly = vRa.d;
            object = a2.parent;
        }
    }

    public void J(cT cT2) {
        Js_3 b2 = cT2;
        Js_3 a2 = this;
        Js_3 js_3 = b2;
        super.J((cT)js_3);
        if (js_3 instanceof Js_3) {
            b2.parent = a2;
        }
    }

    public boolean l() {
        Js_3 a2;
        return a2.isDynamic;
    }

    /*
     * WARNING - void declaration
     */
    public Js_3(ModelBase modelBase, String string) {
        void b2;
        Js_3 a2;
        Object c2 = string;
        Js_3 js_3 = a2 = this;
        super((ModelBase)b2, (String)c2);
        a2.origRotationX = JPa.N;
        a2.origRotationY = JPa.N;
        a2.origRotationZ = JPa.N;
        a2.rotationX = JPa.N;
        a2.rotationY = JPa.N;
        a2.rotationZ = JPa.N;
        a2.scaleX = pqa.r;
        a2.scaleY = pqa.r;
        a2.scaleZ = pqa.r;
        a2.isDynamic = uSa.E;
        js_3.isDynamicIndirectly = uSa.E;
        js_3.parent = null;
        js_3.scaleModifier = pqa.r;
    }

    public Js_3(ModelBase modelBase) {
        Js_3 a2;
        Object b2 = modelBase;
        Js_3 js_3 = a2 = this;
        super((ModelBase)b2);
        a2.origRotationX = JPa.N;
        a2.origRotationY = JPa.N;
        a2.origRotationZ = JPa.N;
        a2.rotationX = JPa.N;
        a2.rotationY = JPa.N;
        a2.rotationZ = JPa.N;
        a2.scaleX = pqa.r;
        a2.scaleY = pqa.r;
        a2.scaleZ = pqa.r;
        a2.isDynamic = uSa.E;
        js_3.isDynamicIndirectly = uSa.E;
        js_3.parent = null;
        js_3.scaleModifier = pqa.r;
    }

    public boolean f() {
        Js_3 a2;
        if (a2.isDynamic || a2.isDynamicIndirectly) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void C(float f2) {
        float b2 = f2;
        Js_3 a2 = this;
        if (a2.isHidden || !a2.showModel) {
            return;
        }
        Js_3 js_3 = a2;
        Js_3 js_32 = a2;
        js_3.rotateAngleX = js_3.origRotationX + js_32.rotationX;
        js_3.rotateAngleY = js_32.origRotationY + a2.rotationY;
        js_3.rotateAngleZ = js_3.origRotationZ + a2.rotationZ;
        if (js_3.scaleX != pqa.r || a2.scaleY != pqa.r || a2.scaleZ != pqa.r) {
            uKa.e();
            Js_3 js_33 = a2;
            uKa.J((float)(a2.rotationPointX * b2), (float)(a2.rotationPointY * b2), (float)(a2.rotationPointZ * b2));
            Js_3 js_34 = a2;
            uKa.l((float)js_33.scaleX, (float)js_34.scaleY, (float)js_34.scaleZ);
            uKa.J((float)(-js_33.rotationPointX * b2), (float)(-a2.rotationPointY * b2), (float)(-a2.rotationPointZ * b2));
            super.C(b2 * a2.scaleModifier);
            uKa.D();
            return;
        }
        super.C(b2 * a2.scaleModifier);
    }
}

