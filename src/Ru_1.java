/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Hs
 *  Js
 *  Lra
 *  dT
 *  hra
 *  nS
 */
public final class Ru_1
extends Hs {
    private Js rightLeg;
    private xB sneak;
    private Js leftLeg;
    private Js otherBody;
    private xB idle;
    private xB walk;

    public void f(dT dT2) {
        Ru_1 b2 = dT2;
        Ru_1 a2 = this;
        if (a2.leftLeg != null) {
            Ru_1 ru_1 = a2;
            ru_1.leftLeg.rotationX = ((dT)b2).model.bipedLeftLeg.rotateAngleX;
            ru_1.leftLeg.rotationY = ((dT)b2).model.bipedLeftLeg.rotateAngleY;
            ru_1.leftLeg.rotationZ = ((dT)b2).model.bipedLeftLeg.rotateAngleZ;
        }
        if (a2.rightLeg != null) {
            Ru_1 ru_1 = a2;
            ru_1.rightLeg.rotationX = ((dT)b2).model.bipedRightLeg.rotateAngleX;
            ru_1.rightLeg.rotationY = ((dT)b2).model.bipedRightLeg.rotateAngleY;
            ru_1.rightLeg.rotationZ = ((dT)b2).model.bipedRightLeg.rotateAngleZ;
        }
        if (a2.otherBody != null) {
            Ru_1 ru_1 = a2;
            ru_1.otherBody.rotationX = ((dT)b2).model.bipedBody.rotateAngleX;
            ru_1.otherBody.rotationPointX = ((dT)b2).model.bipedBody.rotationPointX;
        }
        nS nS2 = a2.model.J((dT)b2);
        if (b2.J() > Nra.e && a2.walk != null) {
            nS2.J(a2.walk);
            return;
        }
        if (((dT)b2).player.q() && a2.sneak != null) {
            nS2.J(a2.sneak);
            return;
        }
        if (a2.idle != null) {
            nS2.J(a2.idle);
        }
    }

    public void J() {
        Ru_1 a2;
        Ru_1 ru_1 = a2;
        ru_1.leftLeg = ru_1.model.J(hra.U);
        ru_1.rightLeg = ru_1.model.J(yta.U);
        ru_1.otherBody = ru_1.model.J(wta.O);
        ru_1.idle = ru_1.model.J().get(Lra.W);
        a2.walk = a2.model.J().get(qQa.Ka);
        a2.sneak = a2.model.J().get(qQa.Ha);
    }

    public Ru_1() {
        Ru_1 a2;
    }
}

