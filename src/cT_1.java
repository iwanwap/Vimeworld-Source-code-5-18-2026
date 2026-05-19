/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AMa
 *  JPa
 *  VQa
 *  aKa
 *  cT
 *  pKa
 *  pNa
 *  pqa
 *  uKa
 *  vRa
 *  xJa
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.model.ModelBase;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class cT_1 {
    public float offsetX;
    public float rotationPointY;
    private int textureOffsetY;
    public float rotationPointX;
    public boolean mirror;
    public float textureHeight;
    public float rotateAngleX;
    public List<AMa> cubeList;
    private boolean compiled;
    private int displayList;
    public float rotateAngleY;
    public boolean showModel;
    public List spriteList;
    public float rotationPointZ;
    public float savedScale;
    public boolean isHidden;
    public float rotateAngleZ;
    public List childModels;
    public boolean mirrorV;
    private ModelBase baseModel;
    public float textureWidth;
    public float offsetY;
    private int textureOffsetX;
    public float offsetZ;
    public final String boxName;
    private static final String __OBFID = "CL_00000874";

    public void J(cT cT2) {
        cT_1 b2 = cT2;
        cT_1 a2 = this;
        if (a2.childModels == null) {
            a2.childModels = Lists.newArrayList();
        }
        a2.childModels.add(b2);
    }

    public cT_1(ModelBase modelBase) {
        ModelBase b2 = modelBase;
        cT_1 a2 = this;
        a2(b2, null);
    }

    /*
     * WARNING - void declaration
     */
    public cT_1(ModelBase modelBase, int n2, int n3) {
        void b2;
        void c2;
        cT_1 a2;
        int d2 = n3;
        cT_1 cT_12 = a2 = this;
        cT_12((ModelBase)c2);
        cT_12.f((int)b2, d2);
    }

    /*
     * WARNING - void declaration
     */
    public cT f(int n2, int n3) {
        void b2;
        int c2 = n3;
        cT_1 a2 = this;
        a2.textureOffsetX = b2;
        a2.textureOffsetY = c2;
        return a2;
    }

    public void C(float f2) {
        block10: {
            cT_1 cT_12;
            cT_1 a2;
            block14: {
                block13: {
                    float b2;
                    block11: {
                        block12: {
                            b2 = f2;
                            a2 = this;
                            if (a2.isHidden || !a2.showModel) break block10;
                            if (!a2.compiled) {
                                a2.f(b2);
                            }
                            cT_1 cT_13 = a2;
                            uKa.J((float)cT_13.offsetX, (float)cT_13.offsetY, (float)a2.offsetZ);
                            if (cT_13.rotateAngleX != JPa.N || a2.rotateAngleY != JPa.N || a2.rotateAngleZ != JPa.N) break block11;
                            if (a2.rotationPointX != JPa.N || a2.rotationPointY != JPa.N || a2.rotationPointZ != JPa.N) break block12;
                            cT_1 cT_14 = a2;
                            uKa.l((int)cT_14.displayList);
                            if (cT_14.childModels != null) {
                                int n2;
                                int n3 = n2 = uSa.E;
                                while (n3 < a2.childModels.size()) {
                                    Object e2 = a2.childModels.get(n2);
                                    ((cT_1)e2).C(b2);
                                    n3 = ++n2;
                                }
                            }
                            break block13;
                        }
                        cT_1 cT_15 = a2;
                        cT_1 cT_16 = a2;
                        uKa.J((float)(cT_15.rotationPointX * b2), (float)(a2.rotationPointY * b2), (float)(cT_16.rotationPointZ * b2));
                        uKa.l((int)cT_16.displayList);
                        if (cT_15.childModels != null) {
                            int n4;
                            int n5 = n4 = uSa.E;
                            while (n5 < a2.childModels.size()) {
                                Object e3 = a2.childModels.get(n4);
                                ((cT_1)e3).C(b2);
                                n5 = ++n4;
                            }
                        }
                        cT_1 cT_17 = a2;
                        cT_12 = cT_17;
                        uKa.J((float)(-cT_17.rotationPointX * b2), (float)(-a2.rotationPointY * b2), (float)(-a2.rotationPointZ * b2));
                        break block14;
                    }
                    uKa.e();
                    cT_1 cT_18 = a2;
                    uKa.J((float)(a2.rotationPointX * b2), (float)(a2.rotationPointY * b2), (float)(cT_18.rotationPointZ * b2));
                    if (cT_18.rotateAngleZ != JPa.N) {
                        uKa.J((float)(a2.rotateAngleZ * zpa.Z), (float)JPa.N, (float)JPa.N, (float)pqa.r);
                    }
                    if (a2.rotateAngleY != JPa.N) {
                        uKa.J((float)(a2.rotateAngleY * zpa.Z), (float)JPa.N, (float)pqa.r, (float)JPa.N);
                    }
                    if (a2.rotateAngleX != JPa.N) {
                        uKa.J((float)(a2.rotateAngleX * zpa.Z), (float)pqa.r, (float)JPa.N, (float)JPa.N);
                    }
                    cT_1 cT_19 = a2;
                    uKa.l((int)cT_19.displayList);
                    if (cT_19.childModels != null) {
                        int n6;
                        int n7 = n6 = uSa.E;
                        while (n7 < a2.childModels.size()) {
                            Object e4 = a2.childModels.get(n6);
                            ((cT_1)e4).C(b2);
                            n7 = ++n6;
                        }
                    }
                    uKa.D();
                }
                cT_12 = a2;
            }
            uKa.J((float)(-cT_12.offsetX), (float)(-a2.offsetY), (float)(-a2.offsetZ));
        }
    }

    public void l(float f2) {
        float b2 = f2;
        cT_1 a2 = this;
        if (!a2.isHidden && a2.showModel) {
            if (!a2.compiled) {
                a2.f(b2);
            }
            if (a2.rotateAngleX == JPa.N && a2.rotateAngleY == JPa.N && a2.rotateAngleZ == JPa.N) {
                if (a2.rotationPointX != JPa.N || a2.rotationPointY != JPa.N || a2.rotationPointZ != JPa.N) {
                    uKa.J((float)(a2.rotationPointX * b2), (float)(a2.rotationPointY * b2), (float)(a2.rotationPointZ * b2));
                    return;
                }
            } else {
                cT_1 cT_12 = a2;
                uKa.J((float)(cT_12.rotationPointX * b2), (float)(a2.rotationPointY * b2), (float)(a2.rotationPointZ * b2));
                if (cT_12.rotateAngleZ != JPa.N) {
                    uKa.J((float)(a2.rotateAngleZ * zpa.Z), (float)JPa.N, (float)JPa.N, (float)pqa.r);
                }
                if (a2.rotateAngleY != JPa.N) {
                    uKa.J((float)(a2.rotateAngleY * zpa.Z), (float)JPa.N, (float)pqa.r, (float)JPa.N);
                }
                if (a2.rotateAngleX != JPa.N) {
                    uKa.J((float)(a2.rotateAngleX * zpa.Z), (float)pqa.r, (float)JPa.N, (float)JPa.N);
                }
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(float f2, float f3, float f4) {
        void b2;
        void c2;
        cT_1 a2;
        float d2 = f4;
        cT_1 cT_12 = a2 = this;
        a2.rotationPointX = c2;
        cT_12.rotationPointY = b2;
        cT_12.rotationPointZ = d2;
    }

    /*
     * WARNING - void declaration
     */
    public void f(float f2, float f3, float f4, int n2, int n3, int n4, float f5) {
        void h2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f6;
        void g2;
        cT_1 a2;
        float f7 = f5;
        cT_1 cT_12 = a2 = this;
        a2.spriteList.add(new ED((cT)cT_12, a2.textureOffsetX, cT_12.textureOffsetY, (float)g2, (float)f6, (float)e2, (int)d2, (int)c2, (int)b2, (float)h2));
    }

    /*
     * WARNING - void declaration
     */
    public cT J(String string, float f2, float f3, float f4, int n2, int n3, int n4) {
        void a2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f5;
        Object h2 = string;
        cT_1 g2 = this;
        h2 = new StringBuilder().insert(2 & 5, g2.boxName).append(VQa.ja).append((String)h2).toString();
        cT_1 cT_12 = g2;
        pNa pNa2 = cT_12.baseModel.J((String)h2);
        cT_1 cT_13 = g2;
        cT_12.f(pNa2.I, pNa2.A);
        cT_1 cT_14 = g2;
        cT_13.cubeList.add(new AMa((cT)cT_14, g2.textureOffsetX, cT_14.textureOffsetY, (float)f5, (float)e2, (float)d2, (int)c2, (int)b2, (int)a2, JPa.N).J((String)h2));
        return cT_13;
    }

    public void J() {
        cT_1 a2;
        if (a2.compiled) {
            cT_1 cT_12 = a2;
            cT_12.compiled = uSa.E;
            cT_12.f(cT_12.savedScale);
        }
    }

    /*
     * WARNING - void declaration
     */
    private void f(float f2) {
        int b2;
        void a2;
        cT_1 cT_12 = this;
        if (cT_12.displayList == 0) {
            cT_1 cT_13 = cT_12;
            cT_13.savedScale = a2;
            cT_13.displayList = xJa.J((int)vRa.d);
        }
        GL11.glNewList(cT_12.displayList, Wqa.O);
        aKa aKa2 = pKa.J().J();
        int n2 = b2 = uSa.E;
        while (n2 < cT_12.cubeList.size()) {
            cT_12.cubeList.get(++b2).J(aKa2, (float)a2);
            n2 = b2;
        }
        int n3 = b2 = uSa.E;
        while (n3 < cT_12.spriteList.size()) {
            ED eD2 = (ED)cT_12.spriteList.get(b2);
            eD2.J(pKa.J(), (float)a2);
            n3 = ++b2;
        }
        GL11.glEndList();
        cT_12.compiled = vRa.d;
    }

    /*
     * WARNING - void declaration
     */
    public cT J(float f2, float f3, float f4, int n2, int n3, int n4) {
        void g2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f5;
        cT_1 a2;
        int n5 = n4;
        cT_1 cT_12 = a2 = this;
        cT_1 cT_13 = a2;
        cT_12.cubeList.add(new AMa((cT)cT_13, a2.textureOffsetX, cT_13.textureOffsetY, (float)f5, (float)e2, (float)d2, (int)c2, (int)b2, (int)g2, JPa.N));
        return cT_12;
    }

    public void J(float f2) {
        float b2 = f2;
        cT_1 a2 = this;
        if (!a2.isHidden && a2.showModel) {
            if (!a2.compiled) {
                a2.f(b2);
            }
            uKa.e();
            cT_1 cT_12 = a2;
            uKa.J((float)(a2.rotationPointX * b2), (float)(a2.rotationPointY * b2), (float)(cT_12.rotationPointZ * b2));
            if (cT_12.rotateAngleY != JPa.N) {
                uKa.J((float)(a2.rotateAngleY * zpa.Z), (float)JPa.N, (float)pqa.r, (float)JPa.N);
            }
            if (a2.rotateAngleX != JPa.N) {
                uKa.J((float)(a2.rotateAngleX * zpa.Z), (float)pqa.r, (float)JPa.N, (float)JPa.N);
            }
            if (a2.rotateAngleZ != JPa.N) {
                uKa.J((float)(a2.rotateAngleZ * zpa.Z), (float)JPa.N, (float)JPa.N, (float)pqa.r);
            }
            uKa.l((int)a2.displayList);
            uKa.D();
        }
    }

    public int J() {
        cT_1 a2;
        return a2.displayList;
    }

    /*
     * WARNING - void declaration
     */
    public cT J(int n2, int n3) {
        void b2;
        int c2 = n3;
        cT_1 a2 = this;
        a2.textureWidth = (float)b2;
        a2.textureHeight = c2;
        return a2;
    }

    public boolean J() {
        cT_1 a2;
        return a2.compiled;
    }

    /*
     * WARNING - void declaration
     */
    public cT J(float f2, float f3, float f4, int n2, int n3, int n4, boolean bl) {
        void h2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f5;
        void g2;
        cT_1 a2;
        boolean bl2 = bl;
        cT_1 cT_12 = a2 = this;
        cT_1 cT_13 = a2;
        cT_12.cubeList.add(new AMa((cT)cT_13, a2.textureOffsetX, cT_13.textureOffsetY, (float)g2, (float)f5, (float)e2, (int)d2, (int)c2, (int)b2, JPa.N, (boolean)h2));
        return cT_12;
    }

    /*
     * WARNING - void declaration
     */
    public void J(float f2, float f3, float f4, int n2, int n3, int n4, float f5) {
        void h2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f6;
        void g2;
        cT_1 a2;
        float f7 = f5;
        cT_1 cT_12 = a2 = this;
        a2.cubeList.add(new AMa((cT)cT_12, a2.textureOffsetX, cT_12.textureOffsetY, (float)g2, (float)f6, (float)e2, (int)d2, (int)c2, (int)b2, (float)h2));
    }

    /*
     * WARNING - void declaration
     */
    public cT_1(ModelBase modelBase, String string) {
        void a2;
        ModelBase c2 = modelBase;
        cT_1 b2 = this;
        cT_1 cT_12 = b2;
        b2.spriteList = new ArrayList();
        cT_12.mirrorV = uSa.E;
        b2.textureWidth = EPa.r;
        b2.textureHeight = Ura.m;
        b2.showModel = vRa.d;
        b2.cubeList = Lists.newArrayList();
        b2.baseModel = c2;
        ((ModelBase)b2.baseModel).boxList.add((cT)b2);
        b2.boxName = a2;
        b2.J(c2.textureWidth, c2.textureHeight);
    }
}

