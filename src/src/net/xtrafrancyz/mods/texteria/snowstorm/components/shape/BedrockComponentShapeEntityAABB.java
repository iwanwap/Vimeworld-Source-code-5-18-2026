/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  MQa
 *  kta
 *  lPa
 *  nj
 *  vRa
 *  vj
 */
package net.xtrafrancyz.mods.texteria.snowstorm.components.shape;

import net.xtrafrancyz.mods.texteria.snowstorm.components.shape.BedrockComponentShapeBase;

public final class BedrockComponentShapeEntityAABB
extends BedrockComponentShapeBase {
    public BedrockComponentShapeEntityAABB() {
        BedrockComponentShapeEntityAABB a2;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void J(nj var1_2, vj var2_4) {
        v0 = var3_5 = this;
        b = (float)v0.offset[uSa.E].J();
        var8_6 = (float)v0.offset[vRa.d].J();
        var4_7 = (float)v0.offset[uqa.g].J();
        var5_8 = JPa.N;
        var6_9 = JPa.N;
        var7_10 = JPa.N;
        c = b.J();
        if (c != null) {
            v1 = c;
            var5_8 = v1.F;
            var6_9 = v1.u;
            var7_10 = v1.F;
        }
        v2 = a;
        v2.z.x = b + ((float)Math.random() - MQa.L) * var5_8;
        v2.z.y = var8_6 + ((float)Math.random() - MQa.L) * var6_9;
        v2.z.z = var4_7 + ((float)Math.random() - MQa.L) * var7_10;
        if (!var3_5.surface) ** GOTO lbl42
        c = (int)(Math.random() * lPa.K * fqa.W) % uua.p;
        if (c == 0) {
            v3 = var3_5;
            a.z.x = b + var5_8 / kta.v;
        } else if (c == vRa.d) {
            v3 = var3_5;
            a.z.x = b - var5_8 / kta.v;
        } else if (c == uqa.g) {
            v3 = var3_5;
            a.z.y = var8_6 + var6_9 / kta.v;
        } else if (c == yRa.d) {
            v3 = var3_5;
            a.z.y = var8_6 - var6_9 / kta.v;
        } else if (c == AQa.P) {
            v3 = var3_5;
            a.z.z = var4_7 + var7_10 / kta.v;
        } else {
            if (c == tTa.h) {
                a.z.z = var4_7 - var7_10 / kta.v;
            }
lbl42:
            // 4 sources

            v3 = var3_5;
        }
        v3.direction.J((vj)a, (double)b, (double)var8_6, (double)var4_7);
    }
}

