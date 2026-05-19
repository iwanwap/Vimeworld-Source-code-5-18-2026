/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BS
 *  Bc
 *  Cra
 *  ERa
 *  F
 *  Hu
 *  JPa
 *  KA
 *  KS
 *  Kd
 *  Ke
 *  Kh
 *  Kpa
 *  Le
 *  Lqa
 *  Oqa
 *  PF
 *  Ppa
 *  QSa
 *  Qsa
 *  TQa
 *  TU
 *  Vua
 *  WSa
 *  Wu
 *  XTa
 *  YSa
 *  Yu
 *  Zc
 *  Zta
 *  aQa
 *  aSa
 *  ad
 *  ax
 *  bpa
 *  cI
 *  eC
 *  eS
 *  eT
 *  hqa
 *  ht
 *  iS
 *  if
 *  lPa
 *  lqa
 *  mka
 *  pKa
 *  pqa
 *  pua
 *  px
 *  sB
 *  uKa
 *  uOa
 *  ura
 *  vRa
 *  wra
 *  ws
 *  xR
 *  yra
 *  ysa
 *  zTa
 *  zU
 */
import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.MiniDotItem;
import org.lwjgl.input.Keyboard;
import ru.vimeworld.configuration.ConfigurationService;
import ru.vimeworld.configuration.impl.HomeScreenConfiguration;
import ru.vimeworld.minidot.emotes.MiniDotEmote;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class mx
extends Ke {
    private static final HomeScreenConfiguration a = ConfigurationService.J(HomeScreenConfiguration.class);
    private MiniDotEmote b;
    private final XR l;
    private final TT e;
    private CT G;
    private final eF D;
    private final ws f;
    private int F;
    private TU g;
    public static final boolean L = false;
    private final eF E;
    private final Hu m;
    private static final mx C = new mx();
    private final vC i;
    private static final ResourceLocation M = new ResourceLocation(Cra.V, uOa.v);
    private final vC k;
    private float j;
    private static final int J = 500;

    public static /* synthetic */ boolean J(TU tU, MiniDotItem miniDotItem) {
        Object b2 = miniDotItem;
        TU a2 = tU;
        if (a2 != TU.HOME || b2.type != eS.EMOTE && b2.type != eS.DEATH && b2.type != eS.SHADOW && b2.type != eS.ARMOR && b2.type != eS.ARROW) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4) throws IOException {
        ad ad2;
        int c2;
        void a2;
        int d2 = n3;
        mx b2 = this;
        if (a2 != false) {
            return;
        }
        c2 = (int)((float)c2 / b2.j);
        d2 = (int)((float)d2 / b2.j);
        if (b2.G != null) {
            b2.G.J(c2, d2, (int)a2, vRa.d != 0);
            return;
        }
        if (b2.f.J().l() && !b2.f.J().f()) {
            b2.f.J().l(uSa.E != 0);
        }
        if (b2.m.J().f()) {
            b2.m.J().J(c2, d2, (int)a2, vRa.d != 0);
        }
        if (b2.f.J().J().f() && b2.f.J().l()) {
            b2.f.J().J().J(c2, d2, (int)a2, uSa.E != 0);
            return;
        }
        if (!b2.f.J().f()) {
            b2.f.J().l(uSa.E != 0);
        }
        if ((ad2 = b2.J()) == null) {
            return;
        }
        ((F)ad2).J(c2, d2, (int)a2, vRa.d != 0);
    }

    public void l(TU tU) {
        mx mx2;
        Object object;
        Object b2 = tU;
        mx a2 = this;
        int n2 = uSa.E;
        if (b2 == TU.HOME && a2.f.J().C() && !a.J().isEmpty()) {
            eT eT2 = a2.f.J();
            Stream stream = a.J().stream();
            Map map = BS.ITEMS;
            map.getClass();
            object = eT2.J(stream.map(Wu.J((Map)map)).filter(Yu.J()).collect(Collectors.toList()));
            mx2 = a2;
        } else {
            object = a2.f.J().J(a2.f.J((TU)b2).stream().filter(xT.J((TU)b2)).collect(Collectors.toList()));
            mx2 = a2;
        }
        if (mx2.f.J().C()) {
            object.removeIf(ht.J());
        }
        object.removeIf(zt.J(a2));
        b2 = object.iterator();
        Object object2 = b2;
        while (object2.hasNext()) {
            object = (MiniDotItem)b2.next();
            if (((MiniDotItem)object).type == eS.EMOJI) {
                object2 = b2;
                continue;
            }
            a2.e.f((ad)new vS(a2, (MiniDotItem)object, n2++));
            object2 = b2;
        }
    }

    public CT J() {
        mx a2;
        return a2.G;
    }

    public float J() {
        mx a2;
        return a2.j;
    }

    public int l() {
        mx a2;
        return (int)((float)a2.I / a2.j);
    }

    public eF f() {
        mx a2;
        return a2.E;
    }

    private void j() {
        mx mx2 = this;
        pKa pKa2 = pKa.J();
        mx a2 = pKa2.J();
        mx2.g.J().J(M);
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        mx mx3 = a2;
        mx mx4 = a2;
        mx4.J(XTa.W, mka.A);
        mx4.J(aSa.V, mx2.l() + tTa.h, aSa.V).J(aSa.V, (double)mx2.I / KPa.y / Jsa.V).M();
        mx3.J(mx2.J() + tTa.h, mx2.l() + tTa.h, aSa.V).J((double)mx2.A / KPa.y / Jsa.V, (double)mx2.I / KPa.y / Jsa.V).M();
        mx3.J(mx2.J() + tTa.h, aSa.V, aSa.V).J((double)mx2.A / KPa.y / Jsa.V, aSa.V).M();
        mx3.J(aSa.V, aSa.V, aSa.V).J(aSa.V, aSa.V).M();
        pKa2.J();
    }

    public void J() {
        mx a2;
        a2.b = Kpa.J().c.m.J();
        Kpa.J().c.m.J(null, null);
        a2.k.f(oua.i, BQa.ia, sB.v);
    }

    public static mx J() {
        return C;
    }

    public eF J() {
        mx a2;
        return a2.m;
    }

    public ws J() {
        mx a2;
        return a2.f;
    }

    public vC J() {
        mx a2;
        return a2.i;
    }

    public mx() {
        int n2;
        mx mx2;
        mx mx3 = mx2 = this;
        mx mx4 = mx2;
        mx2.i = new vC();
        mx4.k = new vC();
        mx2.E = new eF(Oqa.ROW, ERa.C, uSa.E != 0);
        mx2.D = new eF(Oqa.COLUMN, ERa.C, uSa.E != 0);
        mx2.m = new Hu((Ke)mx2);
        mx2.e = new TT(mx2);
        mx2.l = new XR(mx2);
        mx2.g = TU.HOME;
        mx2.F = uqa.g;
        mx3.G = null;
        mx3.b = null;
        int a2 = uSa.E;
        TU[] tUArray = TU.values();
        int n3 = tUArray.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            TU tU = tUArray[n2];
            if (tU.isShown()) {
                mx mx5 = mx2;
                mx5.m.f((ad)new KS((Ke)mx2, tU));
                if (mx5.g == tU) {
                    mx2.i.e(wra.P + a2 * wra.P);
                    mx2.i.J((double)(wra.P + a2 * wra.P));
                    mx2.i.C(wra.P + a2 * wra.P);
                }
                ++a2;
            }
            n4 = ++n2;
        }
        mx mx6 = mx2;
        mx mx7 = mx2;
        mx6.E.f(mx7.e);
        mx6.E.l(vRa.d != 0);
        mx7.E.d(fqa.W);
        mx6.E.J(ysa.s);
        mx6.D.C(ITa.a);
        mx6.D.l(ITa.a);
        mx6.k.e(aSa.V);
        mx2.k.J(aSa.V);
        mx2.k.C(aSa.V);
        mx mx8 = mx2;
        mx mx9 = mx2;
        mx8.D.f((ad)mx9.m);
        mx8.D.f(mx2.E);
        mx9.D.f((ad)mx2.l);
        mx8.I.add(mx2.D);
        mx mx10 = mx2;
        mx10.f = new ws(mx10, mx2.e);
        mx10.I.add(mx2.f);
    }

    public static /* synthetic */ boolean J(mx mx2, MiniDotItem miniDotItem) {
        Object b2 = miniDotItem;
        mx a2 = mx2;
        if (zU.M.f((MiniDotItem)b2) == a2.f.J().C()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public int f() {
        mx a2;
        return a2.F;
    }

    public TU J() {
        mx a2;
        return a2.g;
    }

    public static /* synthetic */ boolean f(MiniDotItem a2) {
        if (a2.type != eS.EMOTE && a2.type != eS.DEATH && a2.type != eS.SHADOW && a2.type != eS.ARMOR && a2.type != eS.ARROW) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void F() {
        mx a2;
        a2.E.f(a2.l() - kTa.j);
    }

    private void k() {
        mx a2;
        double d2 = mPa.s + a2.m.l() + (double)(a2.F * Fua.fa);
        mx mx2 = a2;
        a2.l.J((double)mx2.J() - d2 - ITa.a);
        mx2.l.f(a2.l() - Fua.J);
    }

    public static /* synthetic */ void J(mx e2, double d2, double c2, double b2, double a2) {
        Kh.J((double)((double)e2.J() / KPa.y - d2 / KPa.y), (double)((double)e2.l() / KPa.y - c2 / KPa.y), (double)d2, (double)c2, (int)pua.o, (double)Math.max(b2 / KPa.y, a2 / KPa.y));
    }

    public void G() {
        mx mx2;
        int n2;
        mx mx3;
        block7: {
            int a2;
            mx3 = this;
            n2 = mx3.F;
            while (true) {
                mx mx4 = mx3;
                mx4.k();
                int n3 = mx4.l.l() >= Ppa.N ? vRa.d : uSa.E;
                int n4 = a2 = mx3.l.l() < sra.M ? vRa.d : uSa.E;
                if (n3 == 0 || mx3.F < uqa.g) break;
                if (mx3.F >= AQa.P) {
                    mx2 = mx3;
                    break block7;
                }
                mx3.F += vRa.d;
            }
            if (mx3.F <= uqa.g) {
                mx2 = mx3;
                mx3.F = uqa.g;
            } else if (a2 != 0) {
                mx mx5 = mx3;
                mx2 = mx5;
                mx5.F -= vRa.d;
            } else {
                mx2 = mx3;
            }
        }
        if (mx2.F != n2) {
            mx3.k();
        }
    }

    public void D() {
        a.G = null;
    }

    public TT J() {
        mx a2;
        return a2.e;
    }

    public int J() {
        mx a2;
        return (int)((float)a2.A / a2.j);
    }

    public void A() {
        mx mx2;
        mx mx3 = this;
        Keyboard.enableRepeatEvents(vRa.d != 0);
        mx mx4 = mx3;
        super.A();
        if (mx4.A <= PRa.ga || mx3.I <= zTa.Ka) {
            mx2 = mx3;
            mx3.j = bpa.i;
        } else if (mx3.A <= nqa.N || mx3.I <= lTa.o) {
            mx2 = mx3;
            mx3.j = pqa.r;
        } else {
            float a2 = QSa.h;
            mx mx5 = mx3;
            mx2 = mx5;
            float f2 = (float)mx5.A * a2 / QTa.G;
            a2 = (float)mx5.I * a2 / QTa.G;
            a2 = f2 / a2 - BPa.R;
            mx5.j = f2 - a2 / YSa.G;
        }
        if (mx2.g == null) {
            mx3.J(TU.HOME);
        }
        mx mx6 = mx3;
        mx mx7 = mx3;
        mx6.e.J(mx7.F * Fua.fa - ERa.C);
        mx6.E.J(mx3.e.l());
        mx7.G();
        mx6.e.J(mx3.F * Fua.fa - ERa.C);
        mx6.E.J(mx3.e.l());
        if (mx6.e.f().isEmpty()) {
            mx mx8 = mx3;
            mx8.l(mx8.g);
        }
    }

    public List<MiniDotItem> J(TU tU) {
        int b2;
        eS[] a2;
        mx mx2 = this;
        ArrayList<MiniDotItem> arrayList = new ArrayList<MiniDotItem>();
        a2 = a2.getCategories();
        int n2 = a2.length;
        int n3 = b2 = uSa.E;
        while (n3 < n2) {
            eS eS2 = a2[b2];
            Stream stream = BS.J((eS)eS2).stream();
            zU zU2 = zU.M;
            zU2.getClass();
            arrayList.addAll(stream.filter(xR.J((zU)zU2)).collect(Collectors.toList()));
            n3 = ++b2;
        }
        return arrayList;
    }

    public void f(TU tU) {
        mx a2;
        mx b2 = tU;
        mx mx2 = a2 = this;
        mx mx3 = a2;
        mx3.e.f().clear();
        mx2.l((TU)b2);
        mx3.e.C();
        mx2.E.J().e(a2.E.f());
        a2.E.J().J((double)a2.E.f());
    }

    /*
     * WARNING - void declaration
     */
    public void J(MiniDotItem miniDotItem, int n2, Zc zc2) {
        void c2;
        mx mx2;
        int n3;
        mx d2 = zc2;
        mx a2 = this;
        if (Kpa.J().d()) {
            return;
        }
        int n4 = Kpa.J().d() ? uSa.E : (d2 == Zc.VIMER ? Zc.getVimers() : Zc.getCoins());
        if (Kpa.J().d()) {
            n3 = uSa.E;
            mx2 = d2;
        } else {
            void b2;
            n3 = b2;
            mx2 = d2;
        }
        a2.G = new CT(a2, n4, n3, (Zc)mx2, (MiniDotItem)c2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(mx mx2, int n2, int n3, float f2) {
        void b2;
        void c2;
        float d2 = f2;
        mx a2 = mx2;
        a2.f((int)c2, (int)b2, d2);
    }

    public XR J() {
        mx a2;
        return a2.l;
    }

    public static String J(Map<eS, cw> map) {
        Iterator<Map.Entry<eS, cw>> iterator;
        Map<eS, cw> map2 = map;
        Object a2 = Mqa.y;
        Iterator<Map.Entry<eS, cw>> iterator2 = iterator = map2.entrySet().iterator();
        while (iterator2.hasNext()) {
            Object object = iterator.next();
            Object object2 = object.getValue();
            a2 = new StringBuilder().insert(3 & 4, (String)a2).append(object.getKey()).append(WSa.ba).append(((cw)object2).I.name).append(dua.f).toString();
            if (((cw)object2).A == null) {
                a2 = new StringBuilder().insert(3 >> 2, (String)a2).append(SPa.V).toString();
            } else {
                Object object3 = object = ((cw)object2).A.J().entrySet().iterator();
                while (object3.hasNext()) {
                    object2 = (Map.Entry)object.next();
                    a2 = new StringBuilder().insert(3 ^ 3, (String)a2).append((String)object2.getKey()).append(vTa.S).append(((eC)object2.getValue()).J()).append(yra.t).toString();
                    object3 = object;
                }
            }
            a2 = new StringBuilder().insert(3 ^ 3, (String)a2).append(SPa.t).toString();
            iterator2 = iterator;
        }
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(char c2, int n2) throws IOException {
        int c3 = n2;
        mx a2 = this;
        if (a2.f.J().l()) {
            void b2;
            a2.f.J().J((char)b2, c3);
            return;
        }
        if (c3 == vRa.d || c3 == Kpa.J().z.xc.getKeyCode()) {
            if (a2.G == null) {
                Kpa.J().J(null);
                return;
            }
            a2.G = null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, float f2) {
        void a2;
        int c2;
        mx b2;
        int d2 = n3;
        mx mx2 = b2 = this;
        mx2.k.J();
        mx2.E.l((b2.G == null ? vRa.d : uSa.E) != 0);
        c2 = (int)((float)c2 / b2.j * (float)b2.A.l());
        d2 = (int)((float)d2 / b2.j * (float)b2.A.l());
        uKa.e();
        uKa.J((double)(oua.i / (double)b2.A.l()), (double)(oua.i / (double)b2.A.l()), (double)oua.i);
        mx mx3 = b2;
        uKa.J((double)b2.j, (double)mx3.j, (double)oua.i);
        boolean bl = mx3.k.l();
        if (bl) {
            mx mx4 = b2;
            double d3 = mx4.k.l() * (double)b2.J();
            mx mx5 = b2;
            double d4 = mx4.k.l() * (double)mx5.l();
            double d5 = (oua.i - b2.k.l()) * (double)b2.J();
            double d6 = (oua.i - b2.k.l()) * (double)b2.l();
            cI.J((Runnable)ax.J((mx)mx5, (double)d3, (double)d4, (double)d6, (double)d5));
        }
        mx mx6 = b2;
        mx6.j();
        uKa.e();
        uKa.J((float)JPa.N, (float)vqa.T, (float)pqa.r);
        mx6.F();
        int n4 = c2;
        int n5 = d2;
        vb.J(px.J((mx)b2, (int)n4, (int)n5, (float)a2));
        uKa.l((float)YSa.G, (float)YSa.G, (float)pqa.r);
        uKa.D();
        uKa.D();
        if (bl) {
            cI.J();
        }
        b2.k();
    }

    /*
     * WARNING - void declaration
     */
    public void f(int n2, int n3, int n4) {
        int c2;
        void a2;
        int d2 = n3;
        mx b2 = this;
        if (a2 != false) {
            return;
        }
        c2 = (int)((float)c2 / b2.j);
        d2 = (int)((float)d2 / b2.j);
        mx mx2 = b2;
        mx2.l.f(uSa.E != 0);
        if (mx2.G != null) {
            b2.G.J(c2, d2, (int)a2, uSa.E != 0);
            return;
        }
        mx mx3 = b2;
        mx3.m.J().J(c2, d2, (int)a2, uSa.E != 0);
        ad ad2 = mx3.J();
        if (ad2 == null) {
            return;
        }
        ((F)ad2).J(c2, d2, (int)a2, uSa.E != 0);
    }

    public static /* synthetic */ boolean J(MiniDotItem a2) {
        if (a2 != null && a2.status == YT.ARCHIVED) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private List<KS> J() {
        mx mx2 = this;
        ArrayList<KS> arrayList = new ArrayList<KS>();
        for (ad ad2 : mx2.m.f()) {
            if (!(ad2 instanceof KS)) continue;
            arrayList.add((KS)ad2);
        }
        return arrayList;
    }

    public void J(TU tU) {
        mx b2 = tU;
        mx a2 = this;
        if (a2.g == b2 || a2.i.l()) {
            return;
        }
        if (a2.g == TU.EMOTES || a2.g == TU.DEATH) {
            a2.l.J(null);
        }
        mx mx2 = a2;
        mx2.f.J().J(Mqa.y);
        for (KS kS2 : mx2.J()) {
            if (kS2.J() != b2) continue;
            a2.i.J(kS2.C(), tpa.k);
        }
        a2.g = b2;
        a2.f((TU)b2);
        a2.E.J().J(a2.E.f(), aQa.r);
    }

    public void l() {
        mx mx2;
        mx mx3 = mx2 = this;
        super.l();
        mx3.l.J();
        Iterator<ad> a2 = mx3.e.f().iterator();
        Object object = a2;
        while (object.hasNext()) {
            ad ad2 = (ad)a2.next();
            if (!(ad2 instanceof vS)) {
                object = a2;
                continue;
            }
            ((vS)ad2).J();
            object = a2;
        }
    }

    public void M() {
        mx a2;
        Keyboard.enableRepeatEvents(uSa.E != 0);
        mx mx2 = a2;
        mx mx3 = a2;
        mx3.f.J().C(vRa.d != 0);
        mx2.G = null;
        zU.M.J(iS.MINIDOT_GUI).J(new EnumMap<eS, cw>(zU.M.J().J()));
        mx3.e.f().clear();
        mx2.l.f(uSa.E != 0);
        mx2.k.C(aSa.V);
        a2.k.J(aSa.V);
        a2.k.e(aSa.V);
        if (mx2.b != null) {
            Kpa.J().c.m.J(a2.b, null);
        }
        super.M();
    }

    /*
     * WARNING - void declaration
     */
    private void f(int n2, int n3, float f2) {
        Object d2;
        mx mx2 = this;
        if (mx2.A <= FRa.x || mx2.I <= mSa.F) {
            int n4;
            d2 = Le.J((PF)PF.VIME_ART, (int)GPa.C);
            Ii ii2 = Le.J((PF)PF.VIME_ART, (int)Vua.J);
            ii2.J(csa.Ka, Math.max(uSa.E, mx2.J() / uqa.g - ii2.f(csa.Ka) / uqa.g), Math.max(mx2.l() / uqa.g - ii2.J(Mqa.y) / uqa.g, uSa.E), pua.o, uSa.E != 0);
            int n5 = Fsa.d;
            uKa.K();
            String[] stringArray = new String[uqa.g];
            stringArray[uSa.E] = TQa.ga;
            stringArray[vRa.d] = Lqa.w;
            String[] stringArray2 = stringArray;
            int n6 = stringArray.length;
            int n7 = n4 = uSa.E;
            while (n7 < n6) {
                String string = stringArray2[n4];
                int n8 = Math.max(mx2.l() / uqa.g - ((Ii)d2).J(string) / uqa.g, uSa.E) + n5;
                n5 += 30;
                ((Ii)d2).J(string, Math.max(uSa.E, mx2.J() / uqa.g - ((Ii)d2).f(string) / uqa.g), n8, pua.o, uSa.E != 0);
                n7 = ++n4;
            }
        } else {
            void a2;
            void b2;
            void c2;
            mx mx3 = mx2;
            super.J((int)c2, (int)b2, (float)a2);
            if (mx3.G != null) {
                KA.J((int)uSa.E, (int)uSa.E, (int)(mx2.J() + tTa.h), (int)(mx2.l() + tTa.h), (int)ura.y);
                mx2.G.J((int)c2, (int)b2);
                return;
            }
            mx mx4 = mx2;
            if (mx2.J() instanceof KS) {
                d2 = (KS)mx4.J();
                TU tU = d2.J();
                Ii ii3 = Le.J((PF)PF.VIME_ART, (int)Qsa.Ha);
                int n9 = ii3.f(tU.getDisplayName()) + kTa.j;
                Object object = d2;
                if.C((double)(d2.f() + CRa.N + zOa.X), (double)(object.C() - lPa.K), (double)(n9 + lqa.s), (double)WPa.P, (Color)Bc.z.transparent(PQa.ja), (Kd)Kd.S_X2);
                if.C((double)(object.f() + CRa.N + zOa.X + lPa.K), (double)d2.C(), (double)n9, (double)hqa.ha, (Color)Bc.Ja, (Kd)Kd.S_X2);
                uKa.K();
                ii3.J(tU.getDisplayName(), (int)(d2.f() + CRa.N + zOa.X + Zta.ba), (int)(d2.C() - KPa.y + Zta.ba - (double)(ii3.J(tU.getDisplayName()) / uqa.g)), pua.o, uSa.E != 0);
                return;
            }
            if (!(!(mx4.J() instanceof vS) || mx2.f.J().J().f() && mx2.f.J().l() || ((vS)((Object)(d2 = (vS)mx2.J()))).l())) {
                uKa.K();
                ((vS)((Object)d2)).l((int)c2, (int)b2);
            }
        }
    }
}

