/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ata
 *  Hs
 *  Js
 *  Lra
 *  TQa
 *  dT
 *  isa
 *  nS
 *  psa
 */
public final class bU_3
extends Hs {
    private Js otherBody;
    private xB animAttack;
    private Js otherHead;
    private Js rightArm;
    private Js leftArm;
    private xB animIdle;

    public void J() {
        bU_3 a2;
        bU_3 bU_32 = a2;
        bU_32.leftArm = bU_32.model.J(TQa.z);
        bU_32.rightArm = bU_32.model.J(Xpa.f);
        bU_32.otherBody = bU_32.model.J(wta.O);
        bU_32.otherHead = bU_32.model.J(isa.fa);
        bU_32.animIdle = bU_32.model.J();
        if (bU_32.animIdle == null) {
            a2.animIdle = a2.model.J().get(Lra.W);
        }
        a2.animAttack = a2.model.J().get(Ata.b);
    }

    public bU_3() {
        bU_3 a2;
    }

    public void f(dT dT2) {
        bU_3 b2 = dT2;
        bU_3 a2 = this;
        if (a2.leftArm != null) {
            bU_3 bU_32 = a2;
            bU_32.leftArm.rotationX = ((dT)b2).model.bipedLeftArm.rotateAngleX;
            bU_32.leftArm.rotationY = ((dT)b2).model.bipedLeftArm.rotateAngleY;
            bU_32.leftArm.rotationZ = ((dT)b2).model.bipedLeftArm.rotateAngleZ;
            bU_32.leftArm.rotationPointX = ((dT)b2).model.bipedLeftArm.rotationPointX;
            bU_32.leftArm.rotationPointY = ((dT)b2).model.bipedLeftArm.rotationPointY;
            bU_32.leftArm.rotationPointZ = ((dT)b2).model.bipedLeftArm.rotationPointZ;
        }
        if (a2.rightArm != null) {
            bU_3 bU_33 = a2;
            bU_33.rightArm.rotationX = ((dT)b2).model.bipedRightArm.rotateAngleX;
            bU_33.rightArm.rotationY = ((dT)b2).model.bipedRightArm.rotateAngleY;
            bU_33.rightArm.rotationZ = ((dT)b2).model.bipedRightArm.rotateAngleZ;
            bU_33.rightArm.rotationPointX = ((dT)b2).model.bipedRightArm.rotationPointX;
            bU_33.rightArm.rotationPointY = ((dT)b2).model.bipedRightArm.rotationPointY;
            bU_33.rightArm.rotationPointZ = ((dT)b2).model.bipedRightArm.rotationPointZ;
        }
        if (a2.otherBody != null) {
            bU_3 bU_34 = a2;
            bU_34.otherBody.rotationX = ((dT)b2).model.bipedBody.rotateAngleX;
            bU_34.otherBody.rotationPointX = ((dT)b2).model.bipedBody.rotationPointX;
            bU_34.otherBody.rotationZ = ((dT)b2).model.bipedBody.rotateAngleZ;
            bU_34.otherBody.rotationPointZ = ((dT)b2).model.bipedBody.rotationPointZ;
            bU_34.otherBody.offsetY = Ira.d;
        }
        if (a2.otherHead != null) {
            bU_3 bU_35 = a2;
            bU_35.otherHead.rotationX = ((dT)b2).model.bipedHead.rotateAngleX;
            bU_35.otherHead.rotationY = ((dT)b2).model.bipedHead.rotateAngleY;
            bU_35.otherHead.rotationZ = ((dT)b2).model.bipedHead.rotateAngleZ;
            bU_35.otherHead.rotationPointX = ((dT)b2).model.bipedHead.rotationPointX;
            bU_35.otherHead.rotationPointY = ((dT)b2).model.bipedHead.rotationPointY;
            bU_35.otherHead.rotationPointZ = ((dT)b2).model.bipedHead.rotationPointZ;
        }
        if (a2.animAttack != null) {
            nS nS2 = a2.model.J((dT)b2);
            if (b2.J()) {
                if (b2.f() < psa.N && nS2.J()) {
                    nS2.J(null);
                }
                nS2.J(a2.animAttack);
                return;
            }
            nS2.J(a2.animIdle);
        }
    }
}

