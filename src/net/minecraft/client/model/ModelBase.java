/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  D
 *  Gl
 *  cT
 *  pNa
 *  vL
 *  vRa
 *  ysa
 */
package net.minecraft.client.model;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Random;
import ru.obfuscator.KeepClassName;

public abstract class ModelBase
implements D,
KeepClassName {
    public boolean isChild = vRa.d;
    public float swingProgress;
    private Map<String, pNa> modelTextureMap;
    public int textureWidth;
    public List<cT> boxList = Lists.newArrayList();
    public boolean isRiding;
    public int textureHeight;

    public ModelBase() {
        ModelBase a2;
        a2.modelTextureMap = Maps.newHashMap();
        a2.textureWidth = ysa.s;
        a2.textureHeight = fPa.i;
    }

    public cT J(Random random) {
        Random b2 = random;
        ModelBase a2 = this;
        return a2.boxList.get(b2.nextInt(a2.boxList.size()));
    }

    public void J(vL vL2, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = f7;
        ModelBase a2 = this;
    }

    public void J(Gl gl2, float f2, float f3, float f4) {
        float f5 = f4;
        ModelBase a2 = this;
    }

    public static void J(cT cT2, cT cT3) {
        cT b2 = cT3;
        cT a2 = cT2;
        cT cT4 = b2;
        cT cT5 = a2;
        cT cT6 = b2;
        cT cT7 = a2;
        b2.rotateAngleX = cT7.rotateAngleX;
        cT6.rotateAngleY = cT7.rotateAngleY;
        cT6.rotateAngleZ = a2.rotateAngleZ;
        b2.rotationPointX = cT5.rotationPointX;
        cT4.rotationPointY = cT5.rotationPointY;
        cT4.rotationPointZ = a2.rotationPointZ;
    }

    public void J(ModelBase modelBase) {
        ModelBase a2;
        ModelBase b2 = modelBase;
        ModelBase modelBase2 = a2 = this;
        ModelBase modelBase3 = b2;
        a2.swingProgress = modelBase3.swingProgress;
        modelBase2.isRiding = modelBase3.isRiding;
        modelBase2.isChild = b2.isChild;
    }

    /*
     * WARNING - void declaration
     */
    public void J(String string, int n2, int n3) {
        void b2;
        void c2;
        int d2 = n3;
        ModelBase a2 = this;
        a2.modelTextureMap.put((String)c2, new pNa((int)b2, d2));
    }

    public pNa J(String string) {
        String b2 = string;
        ModelBase a2 = this;
        return a2.modelTextureMap.get(b2);
    }

    public void J(float f2, float f3, float f4, float f5, float f6, float f7, vL vL2) {
        ModelBase modelBase = modelBase2;
        ModelBase modelBase2 = vL2;
        ModelBase a2 = modelBase;
    }
}

