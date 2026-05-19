/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Hs
 *  Js
 *  dT
 */
public final class Ku_2
extends Hs {
    private final String hideBoneName;
    private Js bone;

    public void f(dT dT2) {
        Ku_2 b2 = dT2;
        Ku_2 a2 = this;
        if (((dT)b2).view == gt.OUTFIT) {
            a2.bone.isHidden = b2.d();
            return;
        }
        a2.bone.isHidden = uSa.E;
    }

    public Ku_2(String string) {
        Object b2 = string;
        Ku_2 a2 = this;
        a2.hideBoneName = b2;
    }

    public void J() {
        Ku_2 a2;
        a2.bone = a2.model.J(a2.hideBoneName);
    }
}

