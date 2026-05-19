/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  Bc
 *  CV
 *  ERa
 *  ES
 *  FPa
 *  JPa
 *  KA
 *  Kd
 *  Ke
 *  Kh
 *  Kpa
 *  Le
 *  MQa
 *  Od
 *  Oqa
 *  PF
 *  QF
 *  Qsa
 *  RQa
 *  TPa
 *  Xr
 *  Yra
 *  Ysa
 *  ZRa
 *  Zta
 *  ad
 *  bua
 *  cI
 *  cka
 *  cs
 *  eS
 *  hqa
 *  iS
 *  if
 *  kC
 *  kPa
 *  lPa
 *  lT
 *  oR
 *  pqa
 *  pua
 *  rT
 *  rt
 *  uKa
 *  vQa
 *  vRa
 *  vpa
 *  wI
 *  wu
 *  zR
 *  zTa
 *  zU
 */
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.xtrafrancyz.mods.minidot.items.MiniDotItem;
import net.xtrafrancyz.mods.minidot.items.impl.ImageArrowTrail;
import ru.vimeworld.configuration.ConfigurationService;
import ru.vimeworld.configuration.impl.MDConfiguration;
import ru.vimeworld.minidot.emotes.MiniDotEmote;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class vS
extends QF {
    private final lT G;
    private boolean D;
    private final int f;
    private rt F;
    private int g;
    private final List<zR> L;
    private final rT E;
    private final eF m;
    private final nu C;
    private final MiniDotItem i;
    private final nu M;
    private long k;
    private static final MDConfiguration j = ConfigurationService.J(MDConfiguration.class);
    private MiniDotItem J;
    private final Od A;
    private boolean I;

    /*
     * WARNING - void declaration
     */
    public void l(int n2, int n3) {
        void a2;
        void b2;
        vS vS2;
        vS vS3 = vS2 = this;
        vS vS4 = vS2;
        vS4.m.C();
        void var3_4 = b2 + vpa.o;
        int n4 = (int)((double)a2 - vS2.m.J() / KPa.y);
        vS3.m.C((double)var3_4);
        vS4.m.l(n4);
        rc c2 = Bc.z;
        if.C((double)((double)((var3_4 -= 16) - uua.p)), (double)((n4 -= 16) - uua.p), (double)(vS2.m.l() + hQa.x + hqa.ha), (double)(vS2.m.J() + hQa.x + hqa.ha), (Color)new Color(c2.getRed(), c2.getGreen(), c2.getBlue(), Jpa.Ha), (Kd)Kd.S_X2);
        if.J((double)((double)var3_4), (double)n4, (double)(vS2.m.l() + hqa.ha), (double)(vS2.m.J() + hqa.ha), (Color)Bc.Ja, (Color)Bc.Ga, (Kd)Kd.S_X2);
        vS3.m.J((int)b2, (int)a2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, boolean bl) {
        void b2;
        void c2;
        void d2;
        void a2;
        vS vS2 = this;
        if (a2 == false) {
            return;
        }
        if (!vS2.I && !vS2.D) {
            Object e2;
            if (vS2.M.l() && vS2.E.f()) {
                vS2.E.J((int)d2, (int)c2, (int)b2, (boolean)a2);
                return;
            }
            if (vS2.C() && vS2.G.f()) {
                vS2.G.J((int)d2, (int)c2, (int)b2, (boolean)a2);
                return;
            }
            if (vS2.i instanceof MiniDotEmote) {
                vS vS3;
                e2 = ((mx)vS2.I).J();
                if (((XR)((Object)e2)).J() != vS2.i) {
                    ((XR)((Object)e2)).J((MiniDotEmote)vS2.i);
                    vS3 = vS2;
                } else {
                    ((XR)((Object)e2)).J(null);
                    vS3 = vS2;
                }
                if (!vS3.i.type.isWearable()) {
                    return;
                }
            } else {
                e2 = ((mx)vS2.I).J();
                ((XR)((Object)e2)).J(null);
            }
            if (zU.M.f(vS2.i)) {
                if (zU.M.J().J(vS2.i)) {
                    zU.M.J().J(vS2.i);
                    vS vS4 = vS2;
                    vS vS5 = vS2;
                    vS5.J(new rt(vS5.J().options));
                } else {
                    e2 = zU.M.J();
                    eS eS2 = ((jU)e2).J(vS2.i.type);
                    vS vS6 = vS2;
                    zU.M.J(iS.MINIDOT_GUI).J(eS2, vS6.i, vS6.F, uSa.E != 0);
                    vS vS7 = vS2;
                    ((jU)e2).J(eS2, vS7.i, vS7.F, vRa.d != 0);
                }
            } else if ((double)c2 > vS2.J + vS2.j - ZRa.r && (double)c2 < vS2.J + vS2.j && vS2.i.status == YT.BUYABLE) {
                e2 = new wI();
                e2.put(Wqa.fa, bua.Y);
                e2.put(xua.Aa, vS2.i.id);
                zU.M.f((wI)e2);
            } else {
                if (vS2.i.type == eS.DEATH) {
                    return;
                }
                if (zU.M.J(iS.MINIDOT_GUI).J(vS2.i)) {
                    zU.M.J(iS.MINIDOT_GUI).J(vS2.i);
                    vS vS8 = vS2;
                    vS8.J(new rt(vS8.J().options));
                } else {
                    e2 = zU.M.J(iS.MINIDOT_GUI);
                    eS eS3 = ((jU)e2).J(vS2.i.type);
                    vS vS9 = vS2;
                    ((jU)e2).J(eS3, vS9.i, vS9.F, vRa.d != 0);
                }
            }
            mx.J().J().f().clear();
            mx.J().l(mx.J().J());
            return;
        }
        vS vS10 = vS2;
        if (vS2.I) {
            vS10.C.J((int)d2, (int)c2, (int)b2, (boolean)a2);
            return;
        }
        vS10.M.J((int)d2, (int)c2, (int)b2, (boolean)a2);
    }

    public static /* synthetic */ void J(vS a2) {
        if.J((double)a2.I, (double)a2.J, (double)a2.k, (double)a2.j, (Color)Color.WHITE, (Kd)Kd.S_X2, uSa.E != 0);
    }

    public MiniDotItem J() {
        vS a2;
        return a2.i;
    }

    public static boolean J(MiniDotItem a2) {
        if (a2.J().name().equals(oR.getCurrentSeason().name()) && !a2.isNew) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean C() {
        vS a2;
        return a2.C.l();
    }

    public void f() {
        vS a2;
        if (a2.A != false) {
            a2.j = Bc.Ea;
            return;
        }
        a2.j = Bc.c;
    }

    public void l(boolean bl) {
        boolean b2 = bl;
        vS a2 = this;
        a2.D = b2;
        if (a2.D) {
            a2.I = uSa.E;
            a2.M.C();
        }
    }

    public rt J() {
        vS a2;
        return a2.F;
    }

    public void J(rt rt2) {
        vS a2;
        vS b2 = rt2;
        vS vS2 = a2 = this;
        vS2.F = b2;
        vS2.C.C();
        vS2.M.C();
    }

    public void J() {
        Iterator<zR> iterator;
        vS vS2 = this;
        if (vS2.i.type != eS.ARROW) {
            vS2.J = null;
            vS2.L.clear();
            return;
        }
        vS vS3 = vS2;
        if (vS3.i != vS3.J) {
            vS vS4 = vS2;
            vS4.L.clear();
            vS4.J = vS4.i;
        }
        if (Xr.J()) {
            vS2.L.add(new zR());
        }
        Iterator<zR> iterator2 = iterator = vS2.L.iterator();
        while (iterator2.hasNext()) {
            vS a2 = iterator.next();
            if (OT.e > ((zR)a2).i) {
                Iterator<zR> iterator3 = iterator;
                iterator2 = iterator3;
                iterator3.remove();
                continue;
            }
            vS vS5 = a2;
            ((zR)vS5).k += lTa.la;
            ((zR)vS5).A *= IPa.fa;
            ((zR)vS5).k *= IPa.fa;
            ((zR)vS5).I = ((zR)vS5).M;
            ((zR)vS5).J = ((zR)vS5).C;
            ((zR)vS5).M += ((zR)a2).A;
            ((zR)vS5).C += ((zR)a2).k;
            iterator2 = iterator;
        }
    }

    public boolean l() {
        vS a2;
        return a2.I;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void J(int var1_3, int var2_4) {
        block40: {
            block39: {
                var3_5 = this;
                var5_6 = mx.J().f() - vRa.d;
                var3_5.k = var5_6 == vRa.d ? (long)kPa.r : (long)(var3_5.f % (var5_6 * uqa.g) % (var5_6 * uqa.g - vRa.d) == 0 ? zTa.s : kPa.r);
                var5_6 = uSa.E;
                var4_7 = uSa.E;
                c = zU.M.J(iS.MINIDOT_GUI);
                var6_8 = c.J(var3_5.i);
                var7_9 = c.J();
                if (var3_5.i.type.isWearable() && ES.isCombineable((MiniDotItem)var3_5.i) && var7_9.get(var3_5.i.type) == null && (var8_11 = ES.fromType((eS)var3_5.i.type)) != null) {
                    var9_13 /* !! */  = var8_11.getSubtypes();
                    var10_14 = var9_13 /* !! */ .length;
                    v0 = var11_18 = uSa.E;
                    while (v0 < var10_14) {
                        var12_22 = var9_13 /* !! */ [var11_18];
                        if (var7_9.get(var12_22) != null) {
                            if (!var8_11.canCombine(var3_5.i.type, var12_22)) {
                                var5_6 = uSa.E;
                                v1 = var3_5;
                                break block39;
                            }
                            var5_6 = vRa.d;
                        }
                        v0 = ++var11_18;
                    }
                }
                v1 = var3_5;
            }
            if (v1.i.type == eS.PET && (var7_9.get(eS.PET_LEFT) != null || var7_9.get(eS.PET_RIGHT) != null)) {
                var5_6 = vRa.d;
            }
            if (var6_8 || mx.J().J().J() == var3_5.i) {
                var3_5.I = Bc.Ba;
            } else if (var5_6 != 0) {
                var3_5.I = Bc.va;
            } else if (c.J(var3_5.i)) {
                var3_5.j = var3_5.A != false ? Bc.c : Bc.z;
                var3_5.I = var3_5.A != false ? Bc.Ea : Bc.c;
            } else {
                var3_5.j = var3_5.A != false ? Bc.Ja : Bc.Ea;
                var3_5.I = var3_5.A != false ? Bc.Ga : Bc.Ja;
            }
            var8_12 = uSa.E;
            var9_13 /* !! */  = null;
            var10_15 = null;
            var11_19 = var3_5.A.J().J().get(c.J(var3_5.i));
            v2 = var12_22 = var11_19 == null ? null : var11_19.A.J();
            if (var12_22 != null && (c = var12_22.J().size()) > vRa.d) {
                var8_12 = vRa.d;
                var9_13 /* !! */  = var12_22.l();
                if (OT.e - var3_5.k >= tpa.Ja) {
                    var3_5.k = OT.e;
                    var3_5.g += vRa.d;
                }
                if (var3_5.g >= c - vRa.d) {
                    var3_5.g = uSa.E;
                }
                var10_15 = ((Rt)new ArrayList<V>(var12_22.J().values()).get(var3_5.g)).getName();
            }
            if (var8_12 != 0 && !var3_5.I && !var3_5.D) {
                var12_22.J(var10_15);
            }
            v3 = var3_5;
            super.J((int)b, (int)a);
            c = Le.J((PF)PF.VIME_ART, (int)Qsa.Ha);
            cI.J((Runnable)cs.J((vS)v3));
            if (v3.I || var3_5.D) break block40;
            var7_10 = zU.M.f(var3_5.i);
            if (var3_5.i.type == eS.ARROW) {
                v4 = var3_5;
                if (v4.i != v4.J) {
                    v5 = var3_5;
                    v5.L.clear();
                    v5.J = v5.i;
                }
                v6 = var3_5;
                v7 = var3_5;
                var10_16 = v6.I + v7.k / KPa.y;
                var11_20 = (float)(v7.J + var3_5.j / FPa.T);
                var13_23 = ((ImageArrowTrail)v6.i.model).J();
                var14_25 = CV.M;
                v8 = var15_28 = var3_5.L.iterator();
                while (v8.hasNext()) {
                    var16_29 /* !! */  = var15_28.next();
                    var17_30 /* !! */  = var13_23.J(var16_29 /* !! */ .j);
                    v8 = var15_28;
                    uKa.C((int)var17_30 /* !! */ .I);
                    v9 = var16_29 /* !! */ ;
                    var18_31 = var16_29 /* !! */ .I + (var16_29 /* !! */ .M - v9.I) * var14_25;
                    v10 = var16_29 /* !! */ ;
                    var19_33 = v9.J + (v10.C - v10.J) * var14_25;
                    v11 = var17_30 /* !! */ ;
                    v12 /* !! */  = var17_30 /* !! */ ;
                    Kh.J((float)(var10_16 + (var18_31 *= QTa.G)), (float)(var11_20 + (var19_33 *= QTa.G) - sSa.E), (float)SPa.b, (float)SPa.b, (float)v11.A, (float)v11.j, (float)v12 /* !! */ .k, (float)v12 /* !! */ .J);
                }
                Kpa.J().J().J(cka.I);
                uKa.e();
                uKa.J((float)(var10_16 + vRa.Q), (float)(var11_20 + eta.e), (float)JPa.N);
                uKa.J((float)Qsa.U, (float)JPa.N, (float)JPa.N, (float)pqa.r);
                Kh.J((float)Lsa.X, (float)JPa.N, (float)QTa.G, (float)eta.e, (float)JPa.N, (float)JPa.N, (float)pqa.r, (float)kua.Fa);
                uKa.D();
                v13 = var4_7;
            } else {
                v14 = var3_5;
                v14.A.J((boolean)v14.A);
                v14.A.J((double)var3_5.I, (double)var3_5.J, (double)var3_5.k, (double)var3_5.j);
                v13 = var4_7;
            }
            if (v13 != 0) {
                if.f((double)var3_5.I, (double)var3_5.J, (double)var3_5.k, (double)var3_5.j, (Color)Bc.z.transparent(MQa.L));
            }
            var10_17 = uSa.E;
            if (!var7_10 && var3_5.i.status == YT.BUYABLE && var3_5.A != false) {
                KA.J((int)((int)var3_5.I), (int)((int)(var3_5.J + var3_5.j - ZRa.r)), (int)(var3_5.I + var3_5.k), (int)((int)(var3_5.J + var3_5.j)), (int)Bc.sb.getRGB());
                var10_17 = vRa.d;
            }
            var11_21 = Mqa.y;
            var13_24 = Bc.Ba.getRGB();
            if (var7_10) {
                if (var5_6 != 0) {
                    var11_21 = var6_8 != false ? BPa.i : TPa.g;
                    var13_24 = Bc.l.getRGB();
                    v15 = c;
                } else {
                    var11_21 = ROa.o;
                    v15 = c;
                }
            } else if (var10_17 != 0) {
                v16 = c;
                v15 = v16;
                v16.J(BRa.n, var3_5.I + var3_5.k / KPa.y - (double)(c.f(BRa.n) / uqa.g), (int)(var3_5.J + var3_5.j - Zta.ba - (double)c.J(BRa.n)), pua.o, (boolean)uSa.E);
            } else if (var3_5.i.status == YT.BUYABLE) {
                var11_21 = new StringBuilder().insert(5 >> 3, nqa.A).append(var3_5.i.currency.getSymbol()).append(cPa.Ia).append(Kpa.J().d() != false ? GPa.J : var3_5.i.price + Mqa.y).toString();
                v15 = c;
                var13_24 = var3_5.i.currency.getColor().getRGB();
            } else {
                v17 = var3_5;
                var14_26 = v17.i.status.getSymbol();
                var15_28 = v17.i.status.getShownStatus();
                if (v17.i.status == YT.CHEST_ONLY) {
                    if (var3_5.i.chestTexture != null) {
                        var14_26 = var3_5.i.chestTexture.charValue();
                    }
                    if (var3_5.i.chestName != null) {
                        var15_28 = var3_5.i.chestName;
                    }
                }
                var11_21 = var14_26 + Hta.V + (String)var15_28;
                v15 = c;
                var13_24 = var3_5.i.status.getShownStatusColor().getRGB();
            }
            v15.J(var11_21, var3_5.I + Zta.ba, (int)(var3_5.J + var3_5.j - Zta.ba - vQa.c - KPa.y), var13_24, (boolean)uSa.E);
            if (var3_5.C()) {
                var3_5.G.J((int)b, (int)a);
            }
            if (var3_5.M.l()) {
                var3_5.E.J((int)b, (int)a);
            }
            if (ES.isCombineable((MiniDotItem)var3_5.i) || var3_5.i.type == eS.PET) {
                c.J(Bua.w, var3_5.I + var3_5.k - Zta.ba - vQa.c, (int)(var3_5.J + Zta.ba), pua.o, (boolean)uSa.E);
            }
            cI.J();
            if (var3_5.i.isNew || vS.J(var3_5.i)) {
                var14_27 = vS.J(var3_5.i);
                var15_28 = var14_27 != false ? tpa.o : MRa.j;
                var16_29 /* !! */  = var14_27 != false ? Bc.k : Bc.S;
                var17_30 /* !! */  = var14_27 != false ? Bc.Wa : Bc.Ia;
                v18 = c;
                var18_32 = v18.f((String)var15_28) + ERa.C;
                if.J((double)(var3_5.I + var3_5.k / KPa.y - (double)(var18_32 / uqa.g)), (double)(var3_5.J - hQa.x), (double)var18_32, (double)hqa.ha, (Color)var16_29 /* !! */ , (Color)var17_30 /* !! */ , (Kd)Kd.XS_X2);
                uKa.K();
                v18.J((String)var15_28, var3_5.I + var3_5.k / KPa.y - (double)((var18_32 - ERa.C) / uqa.g), (int)(var3_5.J - hQa.x + Zta.ba - (double)(c.J(Mqa.y) / uqa.g)) - vRa.d, pua.o, (boolean)uSa.E);
            }
            ** GOTO lbl165
        }
        v19 = var3_5;
        if (var3_5.I) {
            v19.C.J((int)b, (int)a);
            cI.J();
            v20 = var8_12;
        } else {
            v19.M.J((int)b, (int)a);
            cI.J();
lbl165:
            // 2 sources

            v20 = var8_12;
        }
        if (v20 != 0) {
            var12_22.J((String)var9_13 /* !! */ );
        }
    }

    public void f(boolean bl) {
        boolean b22 = bl;
        vS a2 = this;
        a2.I = b22;
        if (a2.I) {
            a2.D = uSa.E;
        }
        if (b22) {
            cw b22 = zU.M.J().J(a2.i);
            a2.J(new rt(b22 != null ? b22.A : a2.i.options));
        }
    }

    /*
     * WARNING - void declaration
     */
    public vS(Ke ke, MiniDotItem miniDotItem, int n2) {
        Object a222;
        vS vS2;
        int n3;
        void a222;
        void b2;
        vS c2;
        Object d2 = ke;
        vS vS3 = c2 = this;
        super(uSa.E, uSa.E, Yra.v, lPa.Ja, (Color)Bc.c, (Ke)d2, (Color)Bc.Ea);
        vS vS4 = c2;
        c2.m = new eF(Oqa.COLUMN, tTa.h, uSa.E != 0);
        vS4.G = new lT(c2);
        c2.E = new rT(c2);
        c2.I = uSa.E;
        c2.D = uSa.E;
        c2.g = uSa.E;
        c2.k = OT.e;
        c2.L = new ArrayList<zR>();
        vS3.i = b2;
        vS3.f = a222;
        int n4 = mx.J().f() - vRa.d;
        cw cw2 = zU.M.J().J((MiniDotItem)b2);
        if (cw2 != null) {
            n3 = n4;
            c2.F = cw2.A;
        } else {
            c2.F = new rt(b2.options);
            n3 = n4;
        }
        if (n3 == vRa.d) {
            vS2 = c2;
            c2.k = (long)kPa.r;
        } else {
            c2.k = (long)(a222 % (n4 * uqa.g) % (n4 * uqa.g - vRa.d) == false ? zTa.s : kPa.r);
            vS2 = c2;
        }
        vS2.C = new nu(c2, (Ke)d2);
        c2.M = new nu(c2, (Ke)d2, vRa.d != 0);
        c2.A = new Od((MiniDotItem)b2, c2.F);
        c2.m.f((ad)new kC(null, b2.name, (Color)Bc.Ba));
        d2 = b2.f();
        if (d2 != null && !d2.isEmpty()) {
            String a222 = d2.size() > vRa.d ? Ysa.o : RQa.C;
            c2.m.f((ad)new kC(null, new StringBuilder().insert(2 & 5, a222).append(Xpa.E).append(String.join((CharSequence)TOa.n, (Iterable<? extends CharSequence>)d2)).toString(), (Color)Bc.qa));
        }
        if ((a222 = b2.J()) != null && !a222.isEmpty()) {
            d2 = a222.iterator();
            Object object = d2;
            while (object.hasNext()) {
                a222 = (String)d2.next();
                object = d2;
                c2.m.f((ad)new kC(null, (String)a222));
            }
        }
        if (wu.J((MiniDotItem)b2)) {
            c2.m.f((ad)new wu((MiniDotItem)b2));
        }
    }
}

