/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ata
 *  Hs
 *  JPa
 *  Js
 *  Lra
 *  TQa
 *  ZOa
 *  dT
 *  hra
 *  psa
 */
public final class WS
extends Hs {
    private Js rightLeg;
    private Js body;
    private Js rightArm;
    private Js leftLeg;
    private xB animAttack;
    private Js leftArm;
    private xB animIdle;
    private Js head;

    public WS() {
        WS a2;
    }

    /*
     * Unable to fully structure code
     */
    public void f(dT var1_1) {
        b = var1_1;
        a = this;
        if (a.head == null) ** GOTO lbl17
        v0 = a;
        v0.head.rotationX = b.model.bipedHead.rotateAngleX;
        v0.head.rotationY = b.model.bipedHead.rotateAngleY;
        v0.head.rotationZ = b.model.bipedHead.rotateAngleZ;
        v0.head.rotationPointX = b.model.bipedHead.rotationPointX;
        v1 = b;
        v0.head.rotationPointY = v1.model.bipedHead.rotationPointY;
        v0.head.rotationPointZ = b.model.bipedHead.rotationPointZ;
        if (v1.model.isSneak) {
            v2 = a;
            a.head.offsetY = fqa.w;
        } else {
            a.head.offsetY = JPa.N;
lbl17:
            // 2 sources

            v2 = a;
        }
        if (v2.body == null) ** GOTO lbl34
        v3 = a;
        v3.body.rotationX = b.model.bipedBody.rotateAngleX;
        v3.body.rotationY = b.model.bipedBody.rotateAngleY;
        v3.body.rotationZ = b.model.bipedBody.rotateAngleZ;
        v4 = b;
        v3.body.rotationPointX = v4.model.bipedBody.rotationPointX;
        v3.body.rotationPointZ = b.model.bipedBody.rotationPointZ;
        if (v4.model.isSneak) {
            v5 = a;
            a.body.offsetZ = JPa.N;
            a.body.offsetY = Era.D;
        } else {
            v6 = a;
            v6.body.offsetZ = JPa.N;
            v6.body.offsetY = ZOa.l;
lbl34:
            // 2 sources

            v5 = a;
        }
        if (v5.leftArm == null) ** GOTO lbl50
        v7 = a;
        v7.leftArm.rotationX = b.model.bipedLeftArm.rotateAngleX;
        v7.leftArm.rotationY = b.model.bipedLeftArm.rotateAngleY;
        v7.leftArm.rotationZ = b.model.bipedLeftArm.rotateAngleZ;
        v7.leftArm.rotationPointX = b.model.bipedLeftArm.rotationPointX;
        v8 = b;
        v7.leftArm.rotationPointY = v8.model.bipedLeftArm.rotationPointY;
        v7.leftArm.rotationPointZ = b.model.bipedLeftArm.rotationPointZ;
        v9 = a;
        if (v8.model.isSneak) {
            v9.leftArm.offsetY = TOa.r;
            v10 = a;
        } else {
            v9.leftArm.offsetY = JPa.N;
lbl50:
            // 2 sources

            v10 = a;
        }
        if (v10.rightArm == null) ** GOTO lbl66
        v11 = a;
        v11.rightArm.rotationX = b.model.bipedRightArm.rotateAngleX;
        v11.rightArm.rotationY = b.model.bipedRightArm.rotateAngleY;
        v11.rightArm.rotationZ = b.model.bipedRightArm.rotateAngleZ;
        v11.rightArm.rotationPointX = b.model.bipedRightArm.rotationPointX;
        v12 = b;
        v11.rightArm.rotationPointY = v12.model.bipedRightArm.rotationPointY;
        v11.rightArm.rotationPointZ = b.model.bipedRightArm.rotationPointZ;
        v13 = a;
        if (v12.model.isSneak) {
            v13.rightArm.offsetY = TOa.r;
            v14 = a;
        } else {
            v13.rightArm.offsetY = JPa.N;
lbl66:
            // 2 sources

            v14 = a;
        }
        if (v14.leftLeg == null) ** GOTO lbl83
        v15 = a;
        v15.leftLeg.rotationX = b.model.bipedLeftLeg.rotateAngleX;
        v15.leftLeg.rotationY = b.model.bipedLeftLeg.rotateAngleY;
        v15.leftLeg.rotationZ = b.model.bipedLeftLeg.rotateAngleZ;
        v15.leftLeg.rotationPointX = b.model.bipedLeftLeg.rotationPointX;
        v16 = b;
        v15.leftLeg.rotationPointY = v16.model.bipedLeftLeg.rotationPointY;
        v15.leftLeg.rotationPointZ = b.model.bipedLeftLeg.rotationPointZ;
        v17 = a;
        if (v16.model.isSneak) {
            v17.leftLeg.offsetY = fqa.w;
            v18 = a;
        } else {
            v17.leftLeg.offsetZ = JPa.N;
            a.leftLeg.offsetY = JPa.N;
lbl83:
            // 2 sources

            v18 = a;
        }
        if (v18.rightLeg == null) ** GOTO lbl100
        v19 = a;
        v19.rightLeg.rotationX = b.model.bipedRightLeg.rotateAngleX;
        v19.rightLeg.rotationY = b.model.bipedRightLeg.rotateAngleY;
        v19.rightLeg.rotationZ = b.model.bipedRightLeg.rotateAngleZ;
        v19.rightLeg.rotationPointX = b.model.bipedRightLeg.rotationPointX;
        v20 = b;
        v19.rightLeg.rotationPointY = v20.model.bipedRightLeg.rotationPointY;
        v19.rightLeg.rotationPointZ = b.model.bipedRightLeg.rotationPointZ;
        v21 = a;
        if (v20.model.isSneak) {
            v21.rightLeg.offsetY = fqa.w;
            v22 = a;
        } else {
            v21.rightLeg.offsetZ = JPa.N;
            a.rightLeg.offsetY = JPa.N;
lbl100:
            // 2 sources

            v22 = a;
        }
        if (v22.animAttack != null) {
            var2_2 = a.model.J((dT)b);
            if (b.J()) {
                if (b.f() < psa.N && var2_2.J()) {
                    var2_2.J(null);
                }
                var2_2.J(a.animAttack);
                return;
            }
            if (a.animIdle != null) {
                var2_2.J(a.animIdle);
            }
        }
    }

    public void J() {
        WS a2;
        WS wS = a2;
        wS.head = wS.model.J(WRa.q);
        wS.body = wS.model.J(Eqa.Z);
        wS.leftArm = wS.model.J(TQa.z);
        wS.rightArm = wS.model.J(Xpa.f);
        wS.leftLeg = wS.model.J(hra.U);
        wS.rightLeg = wS.model.J(yta.U);
        wS.animIdle = wS.model.J();
        if (wS.animIdle == null) {
            a2.animIdle = a2.model.J().get(Lra.W);
        }
        a2.animAttack = a2.model.J().get(Ata.b);
    }
}

