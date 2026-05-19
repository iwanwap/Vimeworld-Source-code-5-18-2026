/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nj
 *  vRa
 *  vj
 */
package net.xtrafrancyz.mods.texteria.snowstorm.components.shape;

import net.xtrafrancyz.mods.texteria.snowstorm.components.shape.BedrockComponentShapeBase;

public final class BedrockComponentShapePoint
extends BedrockComponentShapeBase {
    @Override
    public void J(nj nj2, vj vj2) {
        BedrockComponentShapePoint c2 = vj2;
        BedrockComponentShapePoint a2 = this;
        BedrockComponentShapePoint bedrockComponentShapePoint = c2;
        ((vj)bedrockComponentShapePoint).z.x = (float)a2.offset[uSa.E].J();
        BedrockComponentShapePoint bedrockComponentShapePoint2 = a2;
        ((vj)bedrockComponentShapePoint).z.y = (float)bedrockComponentShapePoint2.offset[vRa.d].J();
        ((vj)bedrockComponentShapePoint).z.z = (float)a2.offset[uqa.g].J();
        if (bedrockComponentShapePoint2.direction instanceof Dl) {
            BedrockComponentShapePoint bedrockComponentShapePoint3 = c2;
            a2.direction.J((vj)bedrockComponentShapePoint3, ((vj)c2).z.x, ((vj)bedrockComponentShapePoint3).z.y, ((vj)c2).z.z);
        }
    }

    public BedrockComponentShapePoint() {
        BedrockComponentShapePoint a2;
    }
}

