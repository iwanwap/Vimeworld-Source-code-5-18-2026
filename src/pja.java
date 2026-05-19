/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ad
 *  CV
 *  ERa
 *  Gl
 *  JPa
 *  JQa
 *  MQa
 *  Mda
 *  Me
 *  NQa
 *  RQa
 *  SQa
 *  VEa
 *  Vt
 *  Vua
 *  dT
 *  eS
 *  id
 *  jKa
 *  jt
 *  lPa
 *  pqa
 *  pua
 *  tA
 *  uKa
 *  vL
 *  vRa
 *  zU
 */
import com.google.common.collect.Maps;
import java.util.Map;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.MiniDotItem;
import net.xtrafrancyz.mods.minidot.items.impl.BedrockArmorLayer3D;
import net.xtrafrancyz.mods.minidot.items.impl.BedrockModel;
import net.xtrafrancyz.mods.minidot.items.impl.ImageArmorLayer;
import optifine.Config;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class pja<T extends ModelBase>
implements id<Gl> {
    private float L;
    public static final ResourceLocation E = new ResourceLocation(SQa.k);
    private float m;
    private float C;
    private static final Map<String, ResourceLocation> i = Maps.newHashMap();
    private float M;
    private boolean k;
    public ModelBase j;
    private final Ad J;
    public ModelBase A;
    private static final String I = "CL_00002428";

    public ModelBase J(Gl gl2, Mda mda2, int n2, ModelBase modelBase) {
        ModelBase e2;
        pja pja2 = modelBase2;
        ModelBase modelBase2 = modelBase;
        pja a2 = pja2;
        return e2;
    }

    public pja(Ad ad2) {
        pja b2 = ad2;
        pja a2 = this;
        a2.M = pqa.r;
        a2.L = pqa.r;
        a2.C = pqa.r;
        a2.m = pqa.r;
        a2.J = b2;
        a2.J();
    }

    public abstract void J(T var1, int var2);

    private boolean J(int n2) {
        int b2 = n2;
        pja a2 = this;
        if (b2 == uqa.g) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private void J(Gl gl2, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int n2) {
        Object j2;
        Object object;
        void a2;
        void i2;
        Object object2 = this;
        Mda mda2 = ((pja)object2).J((Gl)i2, (int)a2);
        if (mda2 != null && mda2.J() instanceof VEa && i2 instanceof Sx && jt.f && (object = zU.M.f(i2.J())) != null && (j2 = ((jU)object).J(eS.ARMOR)) != null && ((MiniDotItem)j2).model instanceof BedrockArmorLayer3D) {
            BedrockArmorLayer3D bedrockArmorLayer3D;
            Object object3;
            dT dT2;
            VEa vEa2 = (VEa)mda2.J();
            String string = vEa2.J().getName();
            String string2 = null;
            BedrockArmorLayer3D bedrockArmorLayer3D2 = (BedrockArmorLayer3D)((MiniDotItem)j2).model;
            dT dT3 = dT2 = new dT();
            dT2.view = gt.OUTFIT;
            dT3.item = j2;
            dT3.player = (Sx)i2;
            dT2.model = ((pja)object2).J.J() instanceof ModelPlayer ? (ModelPlayer)((pja)object2).J.J() : null;
            dT dT4 = dT2;
            dT2.pi = object;
            dT4.options = ((MiniDotItem)j2).options;
            dT4.time = (float)i2.g + CV.M;
            dT4.numberInList = uSa.E;
            switch (a2) {
                case 4: {
                    object3 = Vt.HELMET;
                    bedrockArmorLayer3D = bedrockArmorLayer3D2;
                    break;
                }
                case 3: {
                    object3 = Vt.CHEST;
                    bedrockArmorLayer3D = bedrockArmorLayer3D2;
                    break;
                }
                case 2: {
                    object3 = Vt.LEGGINGS;
                    bedrockArmorLayer3D = bedrockArmorLayer3D2;
                    break;
                }
                case 1: {
                    object3 = Vt.BOOTS;
                    bedrockArmorLayer3D = bedrockArmorLayer3D2;
                    break;
                }
                default: {
                    object3 = Vt.CHEST;
                    bedrockArmorLayer3D = bedrockArmorLayer3D2;
                }
            }
            object3 = bedrockArmorLayer3D.J((Vt)object3, string, string2);
            if (object3 != null) {
                ((BedrockModel)object3).J(dT2);
                return;
            }
        }
        if (mda2 != null && mda2.J() instanceof VEa) {
            void b2;
            void c2;
            void d2;
            void e2;
            void f9;
            void g2;
            void h2;
            object = (VEa)mda2.J();
            pja pja2 = object2;
            Object object4 = j2 = pja2.J((int)a2);
            ((ModelBase)j2).J(((pja)object2).J.J());
            ((ModelBase)object4).J((Gl)i2, (float)h2, (float)g2, (float)f9);
            pja2.J(object4, (int)a2);
            boolean bl = pja2.J((int)a2);
            pja2.J((Gl)i2, mda2, (VEa)object, bl, null);
            switch (jKa.A[object.J().ordinal()]) {
                case 1: {
                    int n3 = object.f(mda2);
                    float f10 = (float)(n3 >> ERa.C & osa.Ja) / NQa.Y;
                    float f11 = (float)(n3 >> Yqa.i & osa.Ja) / NQa.Y;
                    float f12 = (float)(n3 & osa.Ja) / NQa.Y;
                    void v5 = i2;
                    uKa.f((float)(((pja)object2).L * f10), (float)(((pja)object2).C * f11), (float)(((pja)object2).m * f12), (float)((pja)object2).M);
                    ((ModelBase)j2).J((vL)v5, (float)h2, (float)g2, (float)e2, (float)d2, (float)c2, (float)b2);
                    ((pja)object2).J((Gl)v5, mda2, (VEa)object, bl, Asa.J);
                }
                case 2: 
                case 3: 
                case 4: 
                case 5: 
                case 6: {
                    pja pja3 = object2;
                    pja pja4 = object2;
                    uKa.f((float)pja3.L, (float)pja3.C, (float)pja4.m, (float)pja4.M);
                    ((ModelBase)j2).J((vL)i2, (float)h2, (float)g2, (float)e2, (float)d2, (float)c2, (float)b2);
                    break;
                }
            }
            if (!(((pja)object2).k || !mda2.J() || Config.v() && Me.J((Gl)i2, (Mda)mda2, (ModelBase)j2, (float)h2, (float)g2, (float)f9, (float)e2, (float)d2, (float)c2, (float)b2))) {
                ((pja)object2).J((Gl)i2, (ModelBase)j2, (float)h2, (float)g2, (float)f9, (float)e2, (float)d2, (float)c2, (float)b2);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private void J(Gl gl2, ModelBase modelBase, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        pja pja2 = this;
        if (!(Config.v() && !Me.J() || Config.h() && pA.eA)) {
            int n2;
            float e2;
            void i2;
            e2 = (float)i2.g + e2;
            pja2.J.J(E);
            if (Config.h()) {
                tA.J();
            }
            uKa.B();
            uKa.I((int)Jqa.e);
            uKa.J(uSa.E != 0);
            float f9 = MQa.L;
            uKa.f((float)f9, (float)f9, (float)f9, (float)pqa.r);
            int n3 = n2 = uSa.E;
            while (n3 < uqa.g) {
                void a2;
                void b2;
                void c2;
                void d2;
                void f10;
                void g2;
                void h2;
                uKa.L();
                uKa.f((int)tua.C, (int)vRa.d);
                float j2 = IPa.S;
                uKa.f((float)(MQa.L * j2), (float)(rta.o * j2), (float)(xSa.la * j2), (float)pqa.r);
                uKa.G((int)RQa.j);
                uKa.y();
                float f11 = eta.B;
                uKa.l((float)f11, (float)f11, (float)f11);
                uKa.J((float)(NSa.B - (float)n2 * gua.l), (float)JPa.N, (float)JPa.N, (float)pqa.r);
                uKa.J((float)JPa.N, (float)(e2 * (ZSa.r + (float)n2 * lTa.la) * eta.e), (float)JPa.N);
                uKa.G((int)SQa.ca);
                h2.J((vL)i2, (float)g2, (float)f10, (float)d2, (float)c2, (float)b2, (float)a2);
                n3 = ++n2;
            }
            uKa.G((int)RQa.j);
            uKa.y();
            uKa.G((int)SQa.ca);
            uKa.P();
            uKa.J(vRa.d != 0);
            uKa.I((int)Ira.A);
            uKa.k();
            if (Config.h()) {
                tA.f();
            }
        }
    }

    public ModelBase J(int n2) {
        pja a2 = this;
        int b2 = n2;
        if (a2.J(b2)) {
            return a2.j;
        }
        return a2.A;
    }

    /*
     * WARNING - void declaration
     */
    private void J(Gl gl2, Mda mda2, VEa vEa2, boolean bl, String string) {
        block8: {
            void a2;
            void c2;
            void b2;
            pja e2;
            block7: {
                void v2;
                int n2;
                void d2;
                Object f2 = gl2;
                e2 = this;
                int n3 = sDa.f((Mda)d2);
                if (n3 == pua.o && f2 instanceof Sx && jt.f && (f2 = zU.M.f(f2.J())) != null && (f2 = ((jU)f2).J(eS.ARMOR)) != null && ((MiniDotItem)f2).model instanceof ImageArmorLayer) {
                    f2 = (ImageArmorLayer)((MiniDotItem)f2).model;
                    int n4 = n3 = b2 != false ? ((ImageArmorLayer)f2).J(c2.J().getName(), (String)a2) : ((ImageArmorLayer)f2).f(c2.J().getName(), (String)a2);
                }
                if (n3 != pua.o) {
                    uKa.C((int)n3);
                    return;
                }
                if (!Config.v()) break block7;
                if (b2 != false) {
                    n2 = uqa.g;
                    v2 = a2;
                } else {
                    n2 = vRa.d;
                    v2 = a2;
                }
                if (Me.J((Mda)d2, (int)n2, (String)v2)) break block8;
            }
            e2.J.J(e2.J((VEa)c2, (boolean)b2, (String)a2));
        }
    }

    /*
     * WARNING - void declaration
     */
    public ResourceLocation J(vL vL2, Mda mda2, int n2, String string) {
        String string2;
        void a2;
        void b2;
        Object c2;
        Object e2 = vL2;
        pja d2 = this;
        e2 = ((VEa)c2.J()).J().getName();
        c2 = APa.m;
        int n3 = ((String)e2).indexOf(lQa.R);
        if (n3 != pua.o) {
            Object object = e2;
            c2 = ((String)object).substring(uSa.E, n3);
            e2 = ((String)object).substring(n3 + vRa.d);
        }
        Object[] objectArray = new Object[AQa.P];
        objectArray[uSa.E] = c2;
        objectArray[vRa.d] = e2;
        objectArray[uqa.g] = b2 == uqa.g ? uqa.g : vRa.d;
        if (a2 == null) {
            string2 = Mqa.y;
        } else {
            Object[] objectArray2 = new Object[vRa.d];
            objectArray2[uSa.E] = a2;
            string2 = String.format(lPa.i, objectArray2);
        }
        objectArray[yRa.d] = string2;
        e2 = String.format(ZSa.T, objectArray);
        c2 = i.get(e2);
        if (c2 == null) {
            c2 = new ResourceLocation((String)e2);
            i.put((String)e2, (ResourceLocation)c2);
        }
        return c2;
    }

    /*
     * WARNING - void declaration
     */
    private ResourceLocation J(VEa vEa2, boolean bl) {
        void b2;
        boolean c2 = bl;
        pja a2 = this;
        return a2.J((VEa)b2, c2, null);
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gl gl2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        void i2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f9;
        void g2;
        void h2;
        pja a2;
        float f10 = f8;
        pja pja2 = a2 = this;
        void v1 = h2;
        void v2 = g2;
        a2.J((Gl)h2, (float)v2, (float)f9, (float)e2, (float)d2, (float)c2, (float)b2, (float)i2, AQa.P);
        a2.J((Gl)v1, (float)v2, (float)f9, (float)e2, (float)d2, (float)c2, (float)b2, (float)i2, yRa.d);
        pja2.J((Gl)v1, (float)g2, (float)f9, (float)e2, (float)d2, (float)c2, (float)b2, (float)i2, uqa.g);
        pja2.J((Gl)h2, (float)g2, (float)f9, (float)e2, (float)d2, (float)c2, (float)b2, (float)i2, vRa.d);
    }

    /*
     * WARNING - void declaration
     */
    public Mda J(Gl gl2, int n2) {
        void b2;
        int c2 = n2;
        pja a2 = this;
        return b2.J(c2 - vRa.d);
    }

    public abstract void J();

    /*
     * WARNING - void declaration
     */
    private ResourceLocation J(VEa vEa2, boolean bl, String string) {
        void a2;
        ResourceLocation c2;
        boolean d22 = bl;
        pja b2 = this;
        String d22 = new StringBuilder().insert(5 >> 3, Vua.i).append(c2.J().getName()).append(JQa.B).append(d22 ? uqa.g : vRa.d).append(a2 == null ? Mqa.y : new StringBuilder().insert(5 >> 3, IPa.W).append((String)a2).toString()).append(KPa.C).toString();
        c2 = i.get(d22);
        if (c2 == null) {
            c2 = new ResourceLocation(d22);
            i.put(d22, c2);
        }
        return c2;
    }

    public boolean J() {
        return uSa.E != 0;
    }
}

