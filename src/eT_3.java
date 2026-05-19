/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  Ke
 *  Le
 *  PF
 *  QF
 *  Qsa
 *  Tpa
 *  aSa
 *  bSa
 *  cI
 *  eT
 *  if
 *  mt
 *  vQa
 *  vRa
 *  wra
 *  zU
 *  zsa
 */
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import net.xtrafrancyz.mods.minidot.items.MiniDotItem;
import org.lwjgl.input.Keyboard;

public final class eT_3
extends QF {
    private final vC C;
    private boolean i;
    private boolean M;
    private String k;
    private long j;
    private boolean J;
    private static final Pattern I = Pattern.compile(nqa.a);

    public void l(boolean bl) {
        boolean b2 = bl;
        eT_3 a2 = this;
        if (a2.J == b2) {
            return;
        }
        a2.J = b2;
    }

    public List<MiniDotItem> J(List<MiniDotItem> list) {
        Iterator a2;
        eT_3 eT_32 = this;
        if (eT_32.k == null || eT_32.k.isEmpty()) {
            return a2;
        }
        ArrayList<MiniDotItem> arrayList = new ArrayList<MiniDotItem>();
        ArrayList<MiniDotItem> arrayList2 = new ArrayList<MiniDotItem>();
        ArrayList<MiniDotItem> arrayList3 = new ArrayList<MiniDotItem>();
        ArrayList<MiniDotItem> arrayList4 = new ArrayList<MiniDotItem>();
        ArrayList<MiniDotItem> arrayList5 = new ArrayList<MiniDotItem>();
        a2 = a2.iterator();
        block0: while (true) {
            Iterator iterator = a2;
            while (iterator.hasNext()) {
                MiniDotItem b2 = (MiniDotItem)a2.next();
                if (b2 == null) {
                    iterator = a2;
                    continue;
                }
                String string = b2.J() == null ? PRa.Ia : b2.J().toLowerCase();
                String string2 = b2.J() == null ? null : String.join((CharSequence)Tpa.E, b2.J()).toLowerCase();
                String string3 = b2.f() == null ? null : String.join((CharSequence)TOa.n, b2.f()).toLowerCase();
                eT_3 eT_33 = eT_32;
                if (eT_33.J(b2, eT_33.k, string, arrayList, arrayList2, arrayList3, arrayList4)) {
                    iterator = a2;
                    continue;
                }
                if (string2 != null) {
                    eT_3 eT_34 = eT_32;
                    if (eT_34.J(b2, eT_34.k, string2, arrayList, arrayList2, arrayList3, arrayList4)) {
                        iterator = a2;
                        continue;
                    }
                }
                if (string3 == null) continue block0;
                eT_3 eT_35 = eT_32;
                eT_35.J(b2, eT_35.k, string3, arrayList, arrayList2, arrayList3, arrayList4);
                continue block0;
            }
            break;
        }
        ArrayList<MiniDotItem> arrayList6 = arrayList5;
        arrayList6.addAll(arrayList);
        arrayList5.addAll(arrayList2);
        arrayList5.addAll(arrayList3);
        arrayList5.addAll(arrayList4);
        return arrayList6;
    }

    public eT_3(mx mx2) {
        Object b2 = mx2;
        eT_3 a2 = this;
        super(uSa.E, uSa.E, bSa.a, wra.P, (Color)Bc.Ea, (Ke)b2, (Color)Bc.Ja);
        eT_3 eT_32 = a2;
        a2.C = new vC();
        eT_32.k = Mqa.y;
        a2.J = uSa.E;
        a2.j = System.currentTimeMillis();
        a2.M = uSa.E;
        a2.i = vRa.d;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, boolean bl) {
        void e2;
        boolean bl2 = bl;
        eT_3 a2 = this;
        if (e2 == false) {
            return;
        }
        if (!a2.i) {
            return;
        }
        a2.l(vRa.d != 0);
    }

    /*
     * WARNING - void declaration
     */
    private boolean J(MiniDotItem miniDotItem, String string, String string2, List<MiniDotItem> list, List<MiniDotItem> list2, List<MiniDotItem> list3, List<MiniDotItem> list4) {
        void f2;
        void e2;
        Object h2 = miniDotItem;
        eT_3 g2 = this;
        if (zU.M.J().J((MiniDotItem)h2)) {
            void d2;
            d2.add(h2);
            return vRa.d != 0;
        }
        if (e2.startsWith(f2.toLowerCase())) {
            void c2;
            c2.add(h2);
            return vRa.d != 0;
        }
        if (e2.endsWith(f2.toLowerCase())) {
            void b2;
            b2.add(h2);
            return vRa.d != 0;
        }
        if (e2.contains(f2.toLowerCase())) {
            void a2;
            a2.add(h2);
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        Ii ii2;
        Ii ii3;
        long l2;
        eT_3 eT_32;
        void b22;
        eT_3 eT_33;
        eT_3 a2;
        int c22 = n3;
        eT_3 eT_34 = a2 = this;
        eT_34.C.J();
        if (eT_34.f() && a2.i) {
            if (a2.l()) {
                eT_3 eT_35 = a2;
                eT_33 = eT_35;
                eT_35.J(Bc.Ga);
                eT_35.f(Bc.Za);
            } else {
                eT_3 eT_36 = a2;
                eT_33 = eT_36;
                eT_36.J(Bc.Ja);
                eT_36.f(Bc.Ga);
            }
        } else {
            eT_3 eT_37 = a2;
            if (a2.l()) {
                eT_37.J(Bc.Ja);
                eT_3 eT_38 = a2;
                eT_33 = eT_38;
                eT_38.f(Bc.Ga);
            } else {
                eT_37.J(Bc.Ea);
                eT_3 eT_39 = a2;
                eT_33 = eT_39;
                eT_39.f(Bc.Ja);
            }
        }
        super.J((int)b22, c22);
        rc b22 = a2.J || !a2.k.isEmpty() ? Bc.Ba : Bc.E;
        eT_3 eT_310 = a2;
        cI.J((Runnable)mt.J((eT)eT_310));
        String c22 = Mqa.I;
        if (eT_310.k.isEmpty() && !a2.l()) {
            c22 = new StringBuilder().insert(3 & 4, c22).append(Tpa.r).toString();
            eT_32 = a2;
            a2.M = uSa.E;
        } else {
            c22 = new StringBuilder().insert(3 & 4, c22).append(a2.k).toString();
            eT_32 = a2;
        }
        if (eT_32.l() && (l2 = System.currentTimeMillis()) - a2.j >= zsa.R) {
            a2.M = !a2.M ? vRa.d : uSa.E;
            a2.j = l2;
        }
        Ii ii4 = Le.J((PF)PF.VIME_ART, (int)Qsa.Ha);
        eT_3 eT_311 = a2;
        if ((double)ii3.f(c22) >= a2.k - vQa.c) {
            eT_311.C.J((double)ii4.f(c22) / KPa.y, tpa.k);
            ii2 = ii4;
        } else {
            eT_311.C.J(aSa.V, tpa.k);
            ii2 = ii4;
        }
        ii2.J(new StringBuilder().insert(3 ^ 3, c22).append(a2.M ? IPa.W : Mqa.y).toString(), (int)(a2.I + Wqa.m - a2.C.l()), a2.J + Wqa.Z, b22.getRGB(), uSa.E != 0);
        cI.J();
    }

    public boolean l() {
        eT_3 a2;
        return a2.J;
    }

    public void f(boolean bl) {
        boolean b2 = bl;
        eT_3 a2 = this;
        if (a2.i == b2) {
            return;
        }
        a2.i = b2;
        if (!b2) {
            a2.l(uSa.E != 0);
        }
    }

    public String J() {
        eT_3 a2;
        return a2.k;
    }

    public void J(String string) {
        String b2 = string;
        eT_3 a2 = this;
        String string2 = b2;
        a2.k = string2.substring(uSa.E, Math.min(string2.length(), Fsa.d));
    }

    /*
     * WARNING - void declaration
     */
    public void J(char c2, int n2) {
        void b2;
        eT_3 a2;
        block5: {
            eT_3 eT_32;
            block8: {
                block9: {
                    block6: {
                        int c3;
                        block7: {
                            c3 = n2;
                            a2 = this;
                            if (c3 == vRa.d) {
                                a2.l(uSa.E != 0);
                                return;
                            }
                            if (c3 != hpa.Z) break block5;
                            if (a2.k.isEmpty()) {
                                return;
                            }
                            if (!Keyboard.isKeyDown(ITa.A)) break block6;
                            eT_3 eT_33 = a2;
                            if (eT_33.k.charAt(eT_33.k.length() - vRa.d) != fPa.i) break block7;
                            eT_3 eT_34 = a2;
                            eT_32 = eT_34;
                            eT_3 eT_35 = a2;
                            eT_35.J(eT_34.k.substring(uSa.E, eT_35.k.length() - vRa.d));
                            break block8;
                        }
                        c3 = a2.k.lastIndexOf(fPa.i);
                        if (c3 != vRa.d) {
                            eT_3 eT_36 = a2;
                            eT_36.J(eT_36.k.substring(uSa.E, c3 + vRa.d));
                        } else {
                            a2.J(Mqa.y);
                        }
                        break block9;
                    }
                    eT_3 eT_37 = a2;
                    eT_37.J(eT_37.k.substring(uSa.E, a2.k.length() - vRa.d));
                }
                eT_32 = a2;
            }
            ((mx)((Object)eT_32.I)).J().f().clear();
            ((mx)((Object)a2.I)).l(((mx)((Object)a2.I)).J());
            return;
        }
        if (I.matcher(String.valueOf((char)b2)).find() || b2 == fPa.i) {
            eT_3 eT_38 = a2;
            eT_38.J(new StringBuilder().insert(3 ^ 3, eT_38.J()).append((char)b2).toString());
            ((mx)((Object)a2.I)).J().f().clear();
            ((mx)((Object)a2.I)).l(((mx)((Object)a2.I)).J());
        }
    }

    public static /* synthetic */ void J(eT a2) {
        if.J((double)a2.I, (double)a2.J, (double)a2.k, (double)a2.j, (Color)Color.WHITE, uSa.E != 0);
    }
}

