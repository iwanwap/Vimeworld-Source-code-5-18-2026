/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ISa
 *  JPa
 *  Kpa
 *  LLa
 *  MQa
 *  Ola
 *  Oz
 *  QFa
 *  Qqa
 *  XTa
 *  Yra
 *  aPa
 *  fLa
 *  hra
 *  kPa
 *  pqa
 *  pua
 *  tZ
 *  uKa
 *  vRa
 *  wOa
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import net.minecraft.client.model.ModelBanner;
import net.minecraft.util.ResourceLocation;

public final class zja_3
extends Ola<tZ> {
    private static final Map<String, LLa> J = Maps.newHashMap();
    private static final ResourceLocation A = new ResourceLocation(ROa.e);
    private ModelBanner I;

    /*
     * WARNING - void declaration
     */
    public void J(tZ tZ2, double d2, double d3, double d4, float f2, int n2) {
        float b2;
        void v0;
        float g222;
        void c2;
        void d5;
        void e2;
        ResourceLocation f3;
        zja_3 zja_32 = this;
        int a22 = f3.f() != null ? vRa.d : uSa.E;
        int g222 = a22 == 0 || f3.J() == QFa.w ? vRa.d : uSa.E;
        int n3 = a22 != 0 ? f3.C() : uSa.E;
        long l2 = a22 != 0 ? f3.f().l() : nqa.i;
        uKa.e();
        float a22 = lTa.T;
        if (g222 != 0) {
            uKa.J((float)((float)e2 + MQa.L), (float)((float)d5 + wOa.w * a22), (float)((float)c2 + MQa.L));
            g222 = (float)(n3 * aPa.Y) / Yra.i;
            uKa.J((float)(-g222), (float)JPa.N, (float)pqa.r, (float)JPa.N);
            v0 = f3;
            zja_32.I.bannerStand.showModel = vRa.d;
        } else {
            g222 = JPa.N;
            if (n3 == uqa.g) {
                g222 = Hra.Ga;
            }
            if (n3 == AQa.P) {
                g222 = ISa.a;
            }
            if (n3 == tTa.h) {
                g222 = kPa.Ha;
            }
            uKa.J((float)((float)e2 + MQa.L), (float)((float)d5 - rta.o * a22), (float)((float)c2 + MQa.L));
            uKa.J((float)(-g222), (float)JPa.N, (float)pqa.r, (float)JPa.N);
            uKa.J((float)JPa.N, (float)Qra.Z, (float)Qqa.fa);
            v0 = f3;
            zja_32.I.bannerStand.showModel = uSa.E;
        }
        XF g222 = v0.J();
        b2 = (float)(g222.getX() * XTa.W + g222.getY() * WOa.fa + g222.getZ() * uua.s) + (float)l2 + b2;
        zja_32.I.bannerSlate.rotateAngleX = (ITa.L + Jpa.B * Oz.C((float)(b2 * pua.j * WRa.e))) * pua.j;
        uKa.o();
        f3 = zja_32.J((tZ)f3);
        if (f3 != null) {
            zja_3 zja_33 = zja_32;
            zja_33.J(f3);
            uKa.e();
            uKa.l((float)a22, (float)(-a22), (float)(-a22));
            zja_33.I.J();
            uKa.D();
        }
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        uKa.D();
    }

    public zja_3() {
        zja_3 a2;
        zja_3 zja_32 = a2;
        zja_32.I = new ModelBanner();
    }

    /*
     * WARNING - void declaration
     */
    private ResourceLocation J(tZ tZ2) {
        void a2;
        zja_3 zja_32 = this;
        String string = a2.J();
        if (string.isEmpty()) {
            return null;
        }
        LLa lLa2 = J.get(string);
        if (lLa2 == null) {
            Object object;
            Object object2;
            Object b2;
            if (J.size() >= hra.Ja) {
                long l2 = System.currentTimeMillis();
                b2 = J.keySet().iterator();
                while (b2.hasNext()) {
                    object2 = (String)b2.next();
                    object = J.get(object2);
                    if (l2 - ((LLa)object).I <= kra.ja) continue;
                    Kpa.J().J().f(((LLa)object).A);
                    b2.remove();
                }
                if (J.size() >= hra.Ja) {
                    return null;
                }
            }
            void v0 = a2;
            List list = v0.J();
            List list2 = v0.f();
            b2 = Lists.newArrayList();
            Object object3 = object2 = list.iterator();
            while (object3.hasNext()) {
                object = (Bz)((Object)object2.next());
                object3 = object2;
                b2.add(ITa.b + ((Bz)((Object)object)).getPatternName() + KPa.C);
            }
            lLa2 = new LLa(null);
            new LLa(null).A = new ResourceLocation(string);
            Kpa.J().J().J(lLa2.A, (H)new fLa(A, (List)b2, list2));
            J.put(string, lLa2);
        }
        lLa2.I = System.currentTimeMillis();
        return lLa2.A;
    }
}

