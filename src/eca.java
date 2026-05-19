/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EQa
 *  Ey
 *  Gg
 *  Gl
 *  Hda
 *  MQa
 *  Mda
 *  NTa
 *  QFa
 *  RC
 *  Rua
 *  Sqa
 *  Tpa
 *  Tz
 *  Waa
 *  Wsa
 *  Ypa
 *  aSa
 *  bqa
 *  eAa
 *  fsa
 *  hTa
 *  kDa
 *  kba
 *  nQa
 *  pY
 *  pqa
 *  psa
 *  qta
 *  uOa
 *  vL
 *  vRa
 *  wPa
 *  waa
 *  ysa
 */
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.minecraft.block.BlockMud;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class eca
extends eAa {
    private static final Map<List<kba>, Integer> J = Maps.newLinkedHashMap();
    private Map<Integer, List<kba>> A;
    private final List<kba> I;

    /*
     * WARNING - void declaration
     */
    public int J(Mda mda2, int n2) {
        void b2;
        int c2 = n2;
        eca a2 = this;
        if (c2 > 0) {
            return Wsa.K;
        }
        return a2.f(b2.J());
    }

    public boolean l(Mda mda2) {
        Object b2 = mda2;
        Object a2 = this;
        if ((b2 = a2.J((Mda)b2)) != null && !b2.isEmpty()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public YFa J(Mda mda2) {
        eca b2 = mda2;
        eca a2 = this;
        return YFa.DRINK;
    }

    public static boolean f(int a2) {
        if ((a2 & qQa.O) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Mda mda2, Sx sx, List<String> list, boolean bl) {
        Object d2;
        eca eca2 = this;
        if (d2.J() != 0) {
            void b2;
            Object e2;
            Object object;
            Iterator a2;
            d2 = Gea.aa.J((Mda)d2);
            HashMultimap<String, Object> c2 = HashMultimap.create();
            if (d2 != null && !d2.isEmpty()) {
                a2 = d2.iterator();
                while (a2.hasNext()) {
                    object = (kba)a2.next();
                    e2 = Ey.f((String)object.J()).trim();
                    Hda hda = Hda.A[object.f()];
                    Map map = hda.J();
                    if (map != null && map.size() > 0) {
                        Iterator iterator = map.entrySet().iterator();
                        while (iterator.hasNext()) {
                            Iterator iterator2;
                            Map.Entry entry = iterator2.next();
                            d2 = (CEa)entry.getValue();
                            d2 = new CEa(((CEa)d2).J(), hda.J(object.J(), (CEa)d2), ((CEa)d2).J());
                            c2.put(((RC)entry.getKey()).J(), d2);
                            iterator = iterator2;
                        }
                    }
                    if (object.J() > 0) {
                        e2 = new StringBuilder().insert(3 >> 2, (String)e2).append(Tpa.E).append(Ey.f((String)new StringBuilder().insert(2 & 5, fsa.D).append(object.J()).toString()).trim()).toString();
                    }
                    if (object.l() > kTa.j) {
                        e2 = new StringBuilder().insert(3 >> 2, (String)e2).append(nQa.T).append(Hda.J((kba)object)).append(hpa.b).toString();
                    }
                    if (hda.C()) {
                        b2.add(pY.RED + (String)e2);
                        continue;
                    }
                    b2.add(pY.GRAY + (String)e2);
                }
            } else {
                a2 = Ey.f((String)Rua.fa).trim();
                b2.add(pY.GRAY + (String)((Object)a2));
            }
            if (!c2.isEmpty()) {
                b2.add(Mqa.y);
                b2.add(pY.DARK_PURPLE + Ey.f((String)bqa.fa));
                a2 = c2.entries().iterator();
                while (a2.hasNext()) {
                    double d3;
                    double d4;
                    object = a2.next();
                    e2 = (CEa)object.getValue();
                    double d5 = ((CEa)e2).J();
                    if (((CEa)e2).J() != vRa.d && ((CEa)e2).J() != uqa.g) {
                        d4 = ((CEa)e2).J();
                        d3 = d5;
                    } else {
                        d4 = ((CEa)e2).J() * fqa.W;
                        d3 = d5;
                    }
                    if (d3 > aSa.V) {
                        Object[] objectArray = new Object[uqa.g];
                        objectArray[uSa.E] = Mda.L.format(d4);
                        objectArray[vRa.d] = Ey.f((String)new StringBuilder().insert(3 >> 2, Sqa.I).append((String)object.getKey()).toString());
                        b2.add(pY.BLUE + Ey.J((String)new StringBuilder().insert(3 & 4, gua.v).append(((CEa)e2).J()).toString(), (Object[])objectArray));
                        continue;
                    }
                    if (!(d5 < aSa.V)) continue;
                    Object[] objectArray = new Object[uqa.g];
                    objectArray[uSa.E] = Mda.L.format(d4 *= pqa.q);
                    objectArray[vRa.d] = Ey.f((String)new StringBuilder().insert(5 >> 3, Sqa.I).append((String)object.getKey()).toString());
                    b2.add(pY.RED + Ey.J((String)new StringBuilder().insert(2 & 5, ysa.v).append(((CEa)e2).J()).toString(), (Object[])objectArray));
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public boolean J(Mda var1_1, Sx var2_2, Gg var3_3, XF var4_4, DZ var5_5, float var6_6, float var7_7, float var8_8) {
        block3: {
            i = var3_3;
            f = this;
            if (d == DZ.DOWN || h.J() != 0 || h.M() && h.J().J(wPa.U, WOa.fa) || !BlockMud.J(i.J((XF)e))) break block3;
            if (g.h.f()) ** GOTO lbl11
            if ((h.E -= vRa.d) == 0) {
                v0 = i;
                g.K.j[g.K.J] = new Mda(Gea.J);
            } else {
                g.K.f(new Mda(Gea.J));
lbl11:
                // 2 sources

                v0 = i;
            }
            v0.J((vL)g, hTa.i, MQa.L, Xpa.R / (eca.M.nextFloat() * Xpa.R + xSa.la));
            if (!i.e) {
                i.J((XF)e, QFa.q.J());
            }
            return (boolean)vRa.d;
        }
        return super.J((Mda)h, (Sx)g, (Gg)i, (XF)e, (DZ)d, (float)c, (float)b, (float)a);
    }

    public int f(int n2) {
        int b2 = n2;
        eca a2 = this;
        return Qca.J(b2, uSa.E != 0);
    }

    /*
     * WARNING - void declaration
     */
    public Mda f(Mda mda2, Gg gg2, Sx sx) {
        void c2;
        void a2;
        Object d2 = gg2;
        eca b2 = this;
        if (!a2.h.f()) {
            c2.E -= vRa.d;
        }
        if (!((Gg)d2).e && (d2 = b2.J((Mda)c2)) != null) {
            d2 = d2.iterator();
            Object object = d2;
            while (object.hasNext()) {
                kba kba2 = (kba)d2.next();
                object = d2;
                a2.J(new kba(kba2));
            }
        }
        void v1 = a2;
        v1.J(Tz.H[eAa.J((eAa)b2)]);
        if (!v1.h.f()) {
            if (c2.E <= 0) {
                return new Mda(Gea.J);
            }
            a2.K.f(new Mda(Gea.J));
        }
        return c2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void J(eAa var1_3, yGa var2_4, List<Mda> var3_5) {
        block8: {
            d /* !! */  = var2_4;
            b = this /* !! */ ;
            super.J((eAa)c, (yGa)d /* !! */ , (List)a);
            if (!eca.J.isEmpty()) break block8;
            v0 = d = uSa.E;
            while (v0 <= Ypa.A) {
                v1 = uSa.E;
                while (v1 <= vRa.d) {
                    var5_7 = var4_6 == 0 ? d | uOa.M : d | qQa.O;
                    v2 = uSa.E;
                    while (v2 <= uqa.g) {
                        var7_9 = var5_7;
                        if (var6_8 == 0) ** GOTO lbl19
                        if (var6_8 == vRa.d) {
                            v3 = var7_9 = var5_7 | fPa.i;
                        } else {
                            if (var6_8 == uqa.g) {
                                var7_9 = var5_7 | ysa.s;
                            }
lbl19:
                            // 4 sources

                            v3 = var7_9;
                        }
                        var8_10 = Qca.J(v3, (boolean)uSa.E);
                        if (var8_10 != null && !var8_10.isEmpty()) {
                            eca.J.put(var8_10, var7_9);
                        }
                        v2 = ++var6_8;
                    }
                    v1 = ++var4_6;
                }
                v0 = ++d;
            }
        }
        v4 = d = eca.J.values().iterator();
        while (v4.hasNext()) {
            var4_6 = d.next();
            v4 = d;
            a.add(new Mda((eAa)c, vRa.d, var4_6));
        }
    }

    public boolean J(int n2) {
        eca a2 = this;
        int b22 = n2;
        List<kba> b22 = a2.J(b22);
        if (b22 != null && !b22.isEmpty()) {
            for (kba kba2 : b22) {
                if (!Hda.A[kba2.f()].l()) continue;
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        return uSa.E != 0;
    }

    public List<kba> J(Mda mda2) {
        eca b2 = mda2;
        eca a2 = this;
        if (b2.M() && b2.J().J(wPa.U, WOa.fa)) {
            int n2;
            ArrayList<kba> arrayList = Lists.newArrayList();
            waa waa2 = b2.J().J(wPa.U, NTa.C);
            int n3 = n2 = uSa.E;
            while (n3 < waa2.J()) {
                kba kba2 = kba.J((Waa)waa2.J(n2));
                if (kba2 != null) {
                    arrayList.add(kba2);
                }
                n3 = ++n2;
            }
            return arrayList;
        }
        return a2.J(b2.J());
    }

    public eca() {
        eca a2;
        eca eca2 = a2;
        eca2.A = Maps.newHashMap();
        eca eca3 = a2;
        eca3.I = new ArrayList<kba>();
        eca2.J(vRa.d);
        a2.J(vRa.d != 0);
        a2.f(uSa.E);
        a2.J(yGa.C);
    }

    /*
     * WARNING - void declaration
     */
    public Mda J(Mda mda2, Gg gg2, Sx sx) {
        void a2;
        eca d2 = mda2;
        eca c2 = this;
        if (eca.f(d2.J())) {
            void b2;
            if (!a2.h.f()) {
                ((Mda)d2).E -= vRa.d;
            }
            void v0 = b2;
            v0.J((vL)a2, EQa.R, MQa.L, Xpa.R / (M.nextFloat() * Xpa.R + xSa.la));
            if (!v0.e) {
                void v1 = b2;
                void v2 = b2;
                v2.f((vL)new kDa((Gg)v2, (Gl)a2, (Mda)d2));
            }
            a2.J(Tz.H[eAa.J((eAa)c2)]);
            return d2;
        }
        eca eca2 = d2;
        a2.f((Mda)eca2, c2.J((Mda)eca2));
        return d2;
    }

    /*
     * WARNING - void declaration
     */
    public String l(Mda mda2) {
        Object b2;
        List<kba> list;
        void a2;
        eca eca2 = this;
        if (a2.J() == 0) {
            return Ey.f((String)qta.E).trim();
        }
        String string = Mqa.y;
        if (eca.f(a2.J())) {
            string = new StringBuilder().insert(3 >> 2, Ey.f((String)psa.ha).trim()).append(Tpa.E).toString();
        }
        if ((list = Gea.aa.J((Mda)a2)) != null && !list.isEmpty()) {
            b2 = list.get(uSa.E).J();
            b2 = new StringBuilder().insert(5 >> 3, (String)b2).append(QTa.e).toString();
            return new StringBuilder().insert(3 & 4, string).append(Ey.f((String)b2).trim()).toString();
        }
        b2 = Qca.J(a2.J());
        return new StringBuilder().insert(3 ^ 3, Ey.f((String)b2).trim()).append(Tpa.E).append(super.l((Mda)a2)).toString();
    }

    public int J(Mda mda2) {
        eca b2 = mda2;
        eca a2 = this;
        return fPa.i;
    }

    /*
     * WARNING - void declaration
     */
    public List<kba> J(int n2) {
        void a2;
        eca eca2 = this;
        Object b2 = eca2.A.get((int)a2);
        if (b2 == null) {
            b2 = Qca.J((int)a2, uSa.E != 0);
            if (b2 == null) {
                b2 = eca2.I;
            }
            eca2.A.put((int)a2, (List<kba>)b2);
        }
        if (b2 == eca2.I) {
            return null;
        }
        return b2;
    }
}

