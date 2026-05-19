/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Aq
 *  Ar
 *  CP
 *  Cr
 *  DP
 *  DR
 *  Eq
 *  JPa
 *  KQ
 *  Kpa
 *  Kq
 *  NQ
 *  QQ
 *  Qr
 *  Uta
 *  VO
 *  XTa
 *  YQ
 *  di
 *  fi
 *  hG
 *  iP
 *  iPa
 *  iq
 *  jq
 *  oc
 *  pQ
 *  pqa
 *  pr
 *  pua
 *  sG
 *  vRa
 *  zO
 *  zp
 */
import com.google.gson.JsonElement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.logging.log4j.Level;

public final class xr_3
extends iP<Aq> {
    /*
     * Unable to fully structure code
     */
    private static b[] J(Aq var0, JsonElement[] var1_2) {
        var2_3 = var0;
        var4_4 = new b[((void)a).length];
        v0 = var3_5 = uSa.E;
        while (v0 < ((void)a).length) {
            b = a[var3_5];
            if (!b.isJsonPrimitive()) ** GOTO lbl25
            if ((b = b.getAsJsonPrimitive()).isNumber()) {
                v1 = var4_4;
                var4_4[var3_5] = fi.J((float)b.getAsNumber().floatValue());
            } else {
                if (b.isString()) {
                    block8: {
                        b = b.getAsString().toLowerCase(Locale.ENGLISH).trim();
                        if (!b.isEmpty()) break block8;
                        var4_4[var3_5] = fi.J((float)JPa.N);
                    }
                    try {
                        var4_4[var3_5] = pQ.A.J((String)b);
                    }
                    catch (Exception b) {
                        OT.b.log(Level.ERROR, new StringBuilder().insert(3 & 4, iPa.S).append(var2_3.J()).append(XTa.Z).toString(), (Throwable)b);
                    }
                }
lbl25:
                // 6 sources

                v1 = var4_4;
            }
            if (v1[var3_5] == null) {
                var4_4[var3_5] = fi.J((float)JPa.N);
            }
            v0 = ++var3_5;
        }
        return var4_4;
    }

    /*
     * WARNING - void declaration
     */
    private static zp J(Aq aq2, YQ yQ2, NQ nQ2) {
        Iterator iterator;
        void b2;
        void a22;
        Aq aq3 = aq2;
        void v0 = a22;
        float[] fArray = v0.f();
        float[] fArray2 = v0.J();
        Aq c2 = new zp((YQ)b2);
        c2.I = a22.J();
        if (fArray2 != null) {
            float f2 = Cr.d((float)(-fArray2[uSa.E]));
            float f3 = Cr.d((float)(-fArray2[vRa.d]));
            float f4 = Cr.d((float)fArray2[uqa.g]);
            c2.f(f2, f3, f4);
        }
        Iterator iterator2 = iterator = a22.J().iterator();
        while (iterator2.hasNext()) {
            Fq fq2 = (Fq)iterator.next();
            if (c2.K.isEmpty()) {
                Aq aq4 = c2;
                aq4.K = new ArrayList();
            }
            c2.K.add(xr_3.J(aq3, (YQ)b2, (zp)c2, (NQ)a22, fq2));
            iterator2 = iterator;
        }
        iterator = a22.f().iterator();
        Iterator iterator3 = iterator;
        while (iterator3.hasNext()) {
            NQ nQ3 = (NQ)iterator.next();
            float[] fArray3 = nQ3.f();
            float a22 = -fArray3[uSa.E] + fArray[uSa.E];
            float f5 = -fArray3[vRa.d] + fArray[vRa.d];
            float f6 = fArray3[uqa.g] - fArray[uqa.g];
            zp zp2 = xr_3.J(aq3, (YQ)b2, nQ3);
            iterator3 = iterator;
            zp zp3 = zp2;
            zp3.J(a22, f5, f6);
            c2.J(zp3);
        }
        return c2;
    }

    /*
     * WARNING - void declaration
     */
    private static jq J(Aq aq2, YQ yQ2, zp zp2, NQ nQ2, HR hR2) {
        Aq aq3 = aq2;
        jq c2 = new jq();
        for (BR a2 : ((HR)((Object)a2)).J()) {
            List<Object> list;
            Object e2 = a2.J();
            if (e2.size() == yRa.d) {
                list = Collections.singletonList(e2);
            } else {
                List[] listArray = new List[uqa.g];
                listArray[uSa.E] = e2.subList(uSa.E, yRa.d);
                zr[] zrArray = new zr[yRa.d];
                zrArray[uSa.E] = (zr)e2.get(uSa.E);
                zrArray[vRa.d] = (zr)e2.get(uqa.g);
                zrArray[uqa.g] = (zr)e2.get(yRa.d);
                listArray[vRa.d] = Arrays.asList(zrArray);
                list = Arrays.asList(listArray);
            }
            e2 = list.iterator();
            while (e2.hasNext()) {
                Iterator iterator = ((List)e2.next()).iterator();
                while (iterator.hasNext()) {
                    Iterator iterator2;
                    zr zr2 = (zr)iterator2.next();
                    float[] fArray = zr2.A;
                    float[] fArray2 = zr2.I;
                    float f2 = fArray[uSa.E];
                    float f3 = -fArray[vRa.d];
                    float f4 = -fArray[uqa.g];
                    float f5 = JPa.N;
                    float f6 = JPa.N;
                    if (a2.I != pua.o) {
                        void d2;
                        iq iq2;
                        DP dP2 = aq3.J(a2.I);
                        iq iq3 = iq2 = d2.J(a2.I);
                        f5 = ((float)iq2.M.I + fArray2[uSa.E] / (float)dP2.C() * (float)iq3.M.k) / (float)iq2.M.M.M;
                        f6 = ((float)iq3.M.j + fArray2[vRa.d] / (float)dP2.f() * (float)iq2.M.J) / (float)iq2.M.M.j;
                    }
                    c2.J(f2, f3, f4, f5, f6);
                    iterator = iterator2;
                }
            }
        }
        return c2;
    }

    public static /* synthetic */ int J(QQ qQ2, QQ qQ3) {
        QQ b2 = qQ3;
        QQ a2 = qQ2;
        return Float.compare(a2.J(), b2.J());
    }

    /*
     * WARNING - void declaration
     */
    private static KQ J(Aq aq2, YQ yQ2, zp zp2, NQ nQ2, Kq kq2) {
        KQ kQ2;
        void c2;
        KQ kQ3;
        Qr d2;
        void a2;
        float[] b22;
        Aq aq3 = aq2;
        float[] fArray = b22 != null ? b22.f() : new float[yRa.d];
        void v0 = a2;
        b22 = v0.C();
        float[] fArray2 = v0.l();
        float f2 = v0.J();
        float f3 = fArray2[uSa.E] - b22[uSa.E];
        float f4 = fArray2[vRa.d] - b22[vRa.d];
        float f5 = fArray2[uqa.g] - b22[uqa.g];
        float f6 = fArray[uSa.E] - fArray2[uSa.E];
        float b22 = -b22[vRa.d] - f4 + fArray[vRa.d];
        float f7 = b22[uqa.g] - fArray[uqa.g];
        if (v0.f()) {
            void v1 = a2;
            float[] fArray3 = v1.d();
            boolean bl2 = v1.J();
            int n2 = Cr.J((float)fArray3[uSa.E]);
            int n3 = Cr.J((float)fArray3[vRa.d]);
            float f8 = pqa.r;
            float e2 = pqa.r;
            if (v1.J() != null && !a2.J().isEmpty()) {
                iR iR2 = (iR)a2.J().get(uSa.E);
                if (iR2.J != pua.o) {
                    DP dP2 = aq3.J(iR2.J);
                    iq iq2 = d2.J(iR2.J);
                    f8 = (float)iq2.M.k / (float)dP2.C();
                    e2 = (float)iq2.M.J / (float)dP2.f();
                    n2 = (int)((float)iq2.M.I + (float)n2 * f8);
                    n3 = (int)((float)iq2.M.j + (float)n3 * e2);
                }
            }
            kQ2 = kQ3 = new KQ((zp)c2, n2, n3, f8, e2, f6, b22, f7, f3, f4, f5, f2, bl2);
        } else {
            Aq e2;
            int n4;
            List list = a2.J();
            float[][] fArrayArray = new float[list.size()][];
            int n5 = n4 = uSa.E;
            while (n5 < list.size()) {
                float[][] fArrayArray2;
                iR iR3 = (iR)list.get(n4);
                if (iR3.J != pua.o) {
                    DP dP3 = aq3.J(iR3.J);
                    e2 = d2.J(iR3.J);
                    fArrayArray2 = fArrayArray;
                    iR iR4 = iR3;
                    iR4.j[uSa.E] = (float)e2.M.I + iR3.j[uSa.E] / (float)dP3.C() * (float)e2.M.k;
                    iR4.j[vRa.d] = (float)e2.M.j + iR3.j[vRa.d] / (float)dP3.f() * (float)e2.M.J;
                    iR4.j[uqa.g] = (float)e2.M.I + iR3.j[uqa.g] / (float)dP3.C() * (float)e2.M.k;
                    iR4.j[yRa.d] = (float)e2.M.j + iR3.j[yRa.d] / (float)dP3.f() * (float)e2.M.J;
                } else {
                    iR iR5 = iR3;
                    iR5.j[uSa.E] = JPa.N;
                    iR5.j[vRa.d] = JPa.N;
                    iR5.j[uqa.g] = JPa.N;
                    iR5.j[yRa.d] = JPa.N;
                    fArrayArray2 = fArrayArray;
                }
                fArrayArray2[n4++] = iR3.j;
                n5 = n4;
            }
            kQ3 = new KQ((zp)c2, f6, b22, f7, f3, f4, f5, f2, (float[][])fArrayArray);
            for (iR iR3 : list) {
                int n6 = uSa.E;
                while (n6 < iR3.I) {
                    e2 = kQ3.I[iR3.A.index];
                    Qr qr2 = e2.I[yRa.d];
                    int n7 = yRa.d;
                    while (n7 >= 0) {
                        Aq aq4;
                        int n8;
                        Qr qr3 = e2.I[n8];
                        if (n8 == 0) {
                            d2 = qr2;
                            aq4 = e2;
                        } else {
                            Aq aq5 = e2;
                            aq4 = aq5;
                            d2 = aq5.I[n8 - vRa.d];
                        }
                        Qr qr4 = d2;
                        aq4.I[n8--] = new Qr(qr3.I, qr4.J, qr4.A);
                        n7 = n8;
                    }
                    n6 = var16_27 += 90;
                }
            }
            kQ2 = kQ3;
        }
        kQ2.J(a2.f());
        return kQ3;
    }

    public xr_3() {
        xr_3 a2;
    }

    /*
     * WARNING - void declaration
     */
    private static oc J(Aq object, YQ yQ2, zp zp2, NQ nQ2, Fq fq2) {
        void b2;
        void c2;
        void d2;
        Aq e2;
        Aq aq2 = object;
        object = fq2;
        Aq a2 = aq2;
        if (e2 instanceof Kq) {
            return xr_3.J(a2, (YQ)d2, (zp)c2, (NQ)b2, (Kq)e2);
        }
        if (e2 instanceof HR) {
            return xr_3.J(a2, (YQ)d2, (zp)c2, (NQ)b2, (HR)e2);
        }
        OT.b.log(Level.WARN, new StringBuilder().insert(2 & 5, Uta.M).append(e2.getClass().getName()).toString());
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public YQ J(Aq aq2) {
        Object object4;
        Object b2;
        void a2;
        Iterator zp22;
        xr_3 xr_32 = this;
        YQ yQ2 = new YQ();
        Object object2 = new Fi(di.E, di.E, vRa.d != 0, Kpa.J().z.ea);
        Iterator iterator = zp22 = a2.J().iterator();
        while (iterator.hasNext()) {
            b2 = (DP)zp22.next();
            object4 = ((Fi)object2).J(b2.J().J(), b2.J().f() / b2.l());
            iterator = zp22;
            yQ2.J(new iq((hG)object4, b2.J(), b2.l(), b2.J()));
        }
        ((Fi)object2).J();
        YQ yQ3 = yQ2;
        yQ2.g = vRa.d;
        yQ3.E = ((Fi)object2).M;
        yQ3.L = ((Fi)object2).j;
        Object var4_6 = null;
        if (!a2.l().isEmpty()) {
            zp zp2 = new zp(yQ2);
            b2 = a2.l().iterator();
            Object object3 = b2;
            while (object3.hasNext()) {
                object4 = (Fq)b2.next();
                if (zp2.K.isEmpty()) {
                    zp2.K = new ArrayList();
                }
                zp2.K.add(xr_3.J((Aq)a2, yQ2, zp2, null, (Fq)object4));
                object3 = b2;
            }
        }
        for (Object object4 : a2.J()) {
            void var4_8;
            object2 = object4.f();
            zp zp3 = xr_3.J((Aq)a2, yQ2, (NQ)object4);
            zp3.J((float)(-object2[uSa.E]), (float)(-object2[vRa.d]), (float)object2[uqa.g]);
            if (var4_8 == null) continue;
            var4_8.J(zp3);
        }
        b2 = a2.f().iterator();
        Object object5 = b2;
        while (object5.hasNext()) {
            object4 = (hQ)b2.next();
            object2 = new pp(((hQ)object4).J(), ((hQ)object4).J());
            block4: for (DR dR2 : ((hQ)object4).J()) {
                for (Object object6 : yQ2.I) {
                    if (!dR2.J().equals(((zp)object6).I)) continue;
                    VO vO2 = new VO((zp)object6);
                    object6.J(vRa.d != 0);
                    object6 = dR2.J().entrySet().iterator();
                    Iterator iterator2 = object6;
                    while (iterator2.hasNext()) {
                        K[] kArray;
                        CP cP2;
                        CP cP3;
                        Object object7;
                        Map.Entry entry = (Map.Entry)object6.next();
                        Ar ar2 = Ar.valueOf((String)((String)entry.getKey()).toUpperCase());
                        ar2 = new Eq(ar2);
                        ((List)entry.getValue()).sort(wp.J());
                        Object object8 = object7 = ((List)entry.getValue()).iterator();
                        while (object8.hasNext()) {
                            QQ qQ2 = (QQ)object7.next();
                            cP3 = xr_3.J((Aq)a2, qQ2.J());
                            cP2 = qQ2.J() == qQ2.f() ? cP3 : xr_3.J((Aq)a2, qQ2.f());
                            kArray = new CP((b[])cP3, (b[])cP2, qQ2.J(), zO.valueOf((String)qQ2.J().toUpperCase()));
                            object8 = object7;
                            ar2.J().add(kArray);
                        }
                        object7 = ar2.J();
                        int n2 = uSa.E;
                        while (n2 < object7.size() - vRa.d) {
                            int n3;
                            cP3 = (CP)object7.get(n3);
                            cP2 = (CP)object7.get(n3 + vRa.d);
                            if (cP3.J() == zO.BEZIER || cP2.J() == zO.BEZIER) {
                                kArray = new K[yRa.d];
                                QQ qQ3 = (QQ)((List)entry.getValue()).get(n3);
                                QQ qQ4 = (QQ)((List)entry.getValue()).get(n3 + vRa.d);
                                int n4 = uSa.E;
                                while (n4 < yRa.d) {
                                    int n5;
                                    float f2 = qQ3.J() == null ? JPa.N : qQ3.J()[n5];
                                    float f3 = qQ3.f() == null ? JPa.N : qQ3.f()[n5];
                                    float f4 = qQ4.l() == null ? JPa.N : qQ4.l()[n5];
                                    float f5 = qQ4.C() == null ? JPa.N : qQ4.C()[n5];
                                    float f6 = cP3.f()[n5].J();
                                    float f7 = cP2.J()[n5].J();
                                    float f8 = cP2.J() - cP3.J();
                                    f6 = f7 - f6;
                                    if (f8 == JPa.N || f6 == JPa.N) {
                                        kArray[n5] = pr.J();
                                    } else {
                                        f4 = pqa.r + f4 / f8;
                                        f5 = pqa.r + f5 / f6;
                                        kArray[n5] = sG.J((float)(f2 /= f8), (float)(f3 /= f6), (float)f4, (float)f5);
                                    }
                                    n4 = ++n5;
                                }
                                cP3.J(kArray);
                            }
                            n2 = ++n3;
                        }
                        vO2.J((Eq)ar2);
                        iterator2 = object6;
                    }
                    ((pp)object2).J().add(vO2);
                    continue block4;
                }
            }
            yQ2.J((pp)object2);
            object5 = b2;
        }
        for (Object object4 : yQ2.I) {
            if (!object4.l()) continue;
            yQ2.m.add(object4);
            object2 = object4;
            Object object9 = object2;
            while (((zp)object9).M != null) {
                object9 = object2 = ((zp)object2).M;
                ((zp)object2).E = vRa.d;
            }
        }
        return yQ2;
    }
}

