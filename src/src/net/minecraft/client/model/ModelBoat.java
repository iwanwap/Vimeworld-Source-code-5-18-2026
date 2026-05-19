/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  cT
 *  hqa
 *  jpa
 *  pua
 *  vL
 *  vRa
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ModelBase;

public final class ModelBoat
extends ModelBase {
    public cT[] boatSides;

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(vL vL2, float f2, float f3, float f4, float f5, float f6, float f7) {
        ModelBoat h2 = vL2;
        ModelBoat g2 = this;
        int n2 = h2 = uSa.E;
        while (n2 < tTa.h) {
            void a2;
            g2.boatSides[h2++].C((float)a2);
            n2 = h2;
        }
    }

    public ModelBoat() {
        ModelBoat modelBoat = this;
        modelBoat.boatSides = new cT[tTa.h];
        ModelBoat modelBoat2 = modelBoat;
        modelBoat2.boatSides[uSa.E] = new cT((ModelBase)modelBoat, uSa.E, Yqa.i);
        modelBoat2.boatSides[vRa.d] = new cT((ModelBase)modelBoat, uSa.E, uSa.E);
        modelBoat2.boatSides[uqa.g] = new cT((ModelBase)modelBoat, uSa.E, uSa.E);
        modelBoat2.boatSides[yRa.d] = new cT((ModelBase)modelBoat, uSa.E, uSa.E);
        modelBoat2.boatSides[AQa.P] = new cT((ModelBase)modelBoat, uSa.E, uSa.E);
        int a2 = osa.c;
        int n2 = uua.p;
        int n3 = kTa.j;
        int n4 = AQa.P;
        modelBoat2.boatSides[uSa.E].J((float)(-a2 / uqa.g), (float)(-n3 / uqa.g + uqa.g), TOa.p, a2, n3 - AQa.P, AQa.P, JPa.N);
        modelBoat2.boatSides[uSa.E].J(JPa.N, (float)n4, JPa.N);
        modelBoat2.boatSides[vRa.d].J((float)(-a2 / uqa.g + uqa.g), (float)(-n2 - vRa.d), vqa.T, a2 - AQa.P, n2, uqa.g, JPa.N);
        modelBoat2.boatSides[vRa.d].J((float)(-a2 / uqa.g + vRa.d), (float)n4, JPa.N);
        modelBoat2.boatSides[uqa.g].J((float)(-a2 / uqa.g + uqa.g), (float)(-n2 - vRa.d), vqa.T, a2 - AQa.P, n2, uqa.g, JPa.N);
        modelBoat2.boatSides[uqa.g].J((float)(a2 / uqa.g - vRa.d), (float)n4, JPa.N);
        modelBoat2.boatSides[yRa.d].J((float)(-a2 / uqa.g + uqa.g), (float)(-n2 - vRa.d), vqa.T, a2 - AQa.P, n2, uqa.g, JPa.N);
        modelBoat2.boatSides[yRa.d].J(JPa.N, (float)n4, (float)(-n3 / uqa.g + vRa.d));
        modelBoat2.boatSides[AQa.P].J((float)(-a2 / uqa.g + uqa.g), (float)(-n2 - vRa.d), vqa.T, a2 - AQa.P, n2, uqa.g, JPa.N);
        modelBoat2.boatSides[AQa.P].J(JPa.N, (float)n4, (float)(n3 / uqa.g - vRa.d));
        modelBoat2.boatSides[uSa.E].rotateAngleX = jpa.f;
        modelBoat2.boatSides[vRa.d].rotateAngleY = hqa.Y;
        modelBoat2.boatSides[uqa.g].rotateAngleY = jpa.f;
        modelBoat2.boatSides[yRa.d].rotateAngleY = pua.j;
    }
}

