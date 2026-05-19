/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  JPa
 *  NTa
 *  XTa
 *  YSa
 *  cT
 *  hqa
 *  jpa
 *  pua
 *  vL
 *  vRa
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ModelBase;

public final class ModelMinecart
extends ModelBase {
    public cT[] sideModels;

    public ModelMinecart() {
        ModelMinecart modelMinecart = this;
        modelMinecart.sideModels = new cT[XTa.W];
        ModelMinecart modelMinecart2 = modelMinecart;
        modelMinecart2.sideModels[uSa.E] = new cT((ModelBase)modelMinecart, uSa.E, NTa.C);
        modelMinecart2.sideModels[vRa.d] = new cT((ModelBase)modelMinecart, uSa.E, uSa.E);
        modelMinecart2.sideModels[uqa.g] = new cT((ModelBase)modelMinecart, uSa.E, uSa.E);
        modelMinecart2.sideModels[yRa.d] = new cT((ModelBase)modelMinecart, uSa.E, uSa.E);
        modelMinecart2.sideModels[AQa.P] = new cT((ModelBase)modelMinecart, uSa.E, uSa.E);
        modelMinecart2.sideModels[tTa.h] = new cT((ModelBase)modelMinecart, Yqa.D, NTa.C);
        int a2 = kTa.j;
        int n2 = Yqa.i;
        int n3 = ERa.C;
        int n4 = AQa.P;
        modelMinecart2.sideModels[uSa.E].J((float)(-a2 / uqa.g), (float)(-n3 / uqa.g), vqa.T, a2, n3, uqa.g, JPa.N);
        modelMinecart2.sideModels[uSa.E].J(JPa.N, (float)n4, JPa.N);
        modelMinecart2.sideModels[tTa.h].J((float)(-a2 / uqa.g + vRa.d), (float)(-n3 / uqa.g + vRa.d), vqa.T, a2 - uqa.g, n3 - uqa.g, vRa.d, JPa.N);
        modelMinecart2.sideModels[tTa.h].J(JPa.N, (float)n4, JPa.N);
        modelMinecart2.sideModels[vRa.d].J((float)(-a2 / uqa.g + uqa.g), (float)(-n2 - vRa.d), vqa.T, a2 - AQa.P, n2, uqa.g, JPa.N);
        modelMinecart2.sideModels[vRa.d].J((float)(-a2 / uqa.g + vRa.d), (float)n4, JPa.N);
        modelMinecart2.sideModels[uqa.g].J((float)(-a2 / uqa.g + uqa.g), (float)(-n2 - vRa.d), vqa.T, a2 - AQa.P, n2, uqa.g, JPa.N);
        modelMinecart2.sideModels[uqa.g].J((float)(a2 / uqa.g - vRa.d), (float)n4, JPa.N);
        modelMinecart2.sideModels[yRa.d].J((float)(-a2 / uqa.g + uqa.g), (float)(-n2 - vRa.d), vqa.T, a2 - AQa.P, n2, uqa.g, JPa.N);
        modelMinecart2.sideModels[yRa.d].J(JPa.N, (float)n4, (float)(-n3 / uqa.g + vRa.d));
        modelMinecart2.sideModels[AQa.P].J((float)(-a2 / uqa.g + uqa.g), (float)(-n2 - vRa.d), vqa.T, a2 - AQa.P, n2, uqa.g, JPa.N);
        modelMinecart2.sideModels[AQa.P].J(JPa.N, (float)n4, (float)(n3 / uqa.g - vRa.d));
        modelMinecart2.sideModels[uSa.E].rotateAngleX = jpa.f;
        modelMinecart2.sideModels[vRa.d].rotateAngleY = hqa.Y;
        modelMinecart2.sideModels[uqa.g].rotateAngleY = jpa.f;
        modelMinecart2.sideModels[yRa.d].rotateAngleY = pua.j;
        modelMinecart2.sideModels[tTa.h].rotateAngleX = Fsa.s;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(vL vL2, float f2, float f3, float f4, float f5, float f6, float f7) {
        void d2;
        ModelMinecart h = vL2;
        ModelMinecart g = this;
        g.sideModels[tTa.h].rotationPointY = YSa.G - d2;
        int n2 = h = uSa.E;
        while (n2 < uua.p) {
            void a2;
            g.sideModels[h++].C((float)a2);
            n2 = h;
        }
    }
}

