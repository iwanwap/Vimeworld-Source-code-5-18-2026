/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Js
 *  Qu
 */
public final class Qu_2 {
    private final float scaleX;
    private final float scaleY;
    private final float rotationPointZ;
    private final float scaleZ;
    private final float rotationZ;
    private final float rotationX;
    private final float rotationPointX;
    private final Js bone;
    private final float rotationY;
    private final float rotationPointY;

    public static /* synthetic */ float A(Qu a2) {
        return a2.rotationPointX;
    }

    public static /* synthetic */ float i(Qu a2) {
        return a2.rotationZ;
    }

    public static /* synthetic */ float M(Qu a2) {
        return a2.scaleZ;
    }

    public static /* synthetic */ float e(Qu a2) {
        return a2.rotationPointZ;
    }

    public Qu_2(Js js2) {
        Qu_2 a2;
        Qu_2 b2 = js2;
        Qu_2 qu_2 = a2 = this;
        Qu_2 qu_22 = b2;
        Qu_2 qu_23 = a2;
        Qu_2 qu_24 = b2;
        Qu_2 qu_25 = a2;
        Qu_2 qu_26 = b2;
        a2.bone = b2;
        a2.scaleX = ((Js)qu_26).scaleX;
        qu_25.scaleY = ((Js)qu_26).scaleY;
        qu_25.scaleZ = ((Js)b2).scaleZ;
        a2.rotationX = ((Js)qu_24).rotationX;
        qu_23.rotationY = ((Js)qu_24).rotationY;
        qu_23.rotationZ = ((Js)b2).rotationZ;
        a2.rotationPointX = ((Js)qu_22).rotationPointX;
        qu_2.rotationPointY = ((Js)qu_22).rotationPointY;
        qu_2.rotationPointZ = ((Js)b2).rotationPointZ;
    }

    public static /* synthetic */ float d(Qu a2) {
        return a2.rotationPointY;
    }

    public static /* synthetic */ float C(Qu a2) {
        return a2.rotationX;
    }

    public static /* synthetic */ float l(Qu a2) {
        return a2.rotationY;
    }

    public static /* synthetic */ float f(Qu a2) {
        return a2.scaleY;
    }

    public static /* synthetic */ Js J(Qu a2) {
        return a2.bone;
    }

    public static /* synthetic */ float J(Qu a2) {
        return a2.scaleX;
    }
}

