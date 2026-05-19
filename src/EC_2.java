/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bpa
 *  CZ
 *  EC
 *  Epa
 *  Hfa
 *  Ica
 *  JPa
 *  KA
 *  Kna
 *  Kpa
 *  MQa
 *  Mda
 *  NTa
 *  Oz
 *  PIa
 *  Pqa
 *  RPa
 *  RQa
 *  Sf
 *  Tz
 *  Uqa
 *  Usa
 *  Waa
 *  XTa
 *  YSa
 *  Ysa
 *  Zpa
 *  Zta
 *  aKa
 *  aSa
 *  aX
 *  ac
 *  aqa
 *  cQa
 *  cra
 *  dQa
 *  fTa
 *  gEa
 *  gY
 *  hra
 *  l
 *  ld
 *  lqa
 *  mka
 *  nLa
 *  nQa
 *  pKa
 *  pY
 *  pqa
 *  pua
 *  uKa
 *  uOa
 *  vRa
 *  wra
 *  xKa
 *  xta
 *  yca
 *  yra
 *  ysa
 */
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.util.ResourceLocation;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class EC_2
extends KA
implements l {
    private static final Logger G = LogManager.getLogger();
    private static final Splitter D;
    public boolean f;
    private URI F;
    public Kpa g;
    public Kna L;
    public List<ac> E = Lists.newArrayList();
    public xKa m;
    public List<ona> C = Lists.newArrayList();
    private long i;
    private int M;
    private int k;
    private static final Set<String> j;
    private ac J;
    public int A;
    public int I;

    public void A() {
    }

    public void i() {
        EC_2 a2;
        a2.l(uSa.E);
    }

    public void M() {
    }

    public void e() throws IOException {
        EC_2 a2;
        if (Mouse.isCreated()) {
            while (Mouse.next()) {
                a2.d();
            }
        }
        if (Keyboard.isCreated()) {
            while (Keyboard.next()) {
                if (OT.i.J(vRa.d != 0)) continue;
                a2.C();
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(List<String> list, int n2, int n3) {
        void b2;
        void c2;
        int d2 = n3;
        EC_2 a2 = this;
        a2.J((List<String>)c2, (int)b2, d2, vRa.d != 0);
    }

    public static boolean C() {
        if (Kpa.ca) {
            if (Keyboard.isKeyDown(yRa.T) || Keyboard.isKeyDown(fTa.Ja)) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        if (Keyboard.isKeyDown(ITa.A) || Keyboard.isKeyDown(Epa.ja)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void d() throws IOException {
        EC_2 eC_2 = this;
        int n2 = Mouse.getEventX() * eC_2.A / eC_2.g.t;
        int n3 = eC_2.I - Mouse.getEventY() * eC_2.I / eC_2.g.k - vRa.d;
        int a2 = Mouse.getEventButton();
        OT.i.f();
        if (Mouse.getEventButtonState()) {
            if (eC_2.g.z.tb) {
                int n4 = eC_2.M;
                eC_2.M = n4 + vRa.d;
                if (n4 > 0) {
                    return;
                }
            }
            if (WF.J(a2)) {
                return;
            }
            EC_2 eC_22 = eC_2;
            eC_22.k = a2;
            eC_22.i = Kpa.J();
            eC_2.J(n2, n3, eC_2.k);
            return;
        }
        if (a2 != pua.o) {
            if (eC_2.g.z.tb && (eC_2.M -= vRa.d) > 0) {
                return;
            }
            eC_2.k = pua.o;
            eC_2.f(n2, n3, a2);
            return;
        }
        if (eC_2.k != pua.o && eC_2.i > nqa.i) {
            long l2 = Kpa.J() - eC_2.i;
            EC_2 eC_23 = eC_2;
            eC_23.J(n2, n3, eC_23.k, l2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void f(int n2, int n3, int n4) {
        int d2 = n4;
        EC_2 a2 = this;
        if (a2.J != null && d2 == 0) {
            void b2;
            void c2;
            a2.J.J((int)c2, (int)b2);
            a2.J = null;
        }
    }

    public void l(int n2) {
        int b2 = n2;
        EC_2 a2 = this;
        if (a2.g.Ta != null) {
            EC_2 eC_2 = a2;
            eC_2.J(uSa.E, uSa.E, eC_2.A, a2.I, YSa.F, Uqa.Ja);
            return;
        }
        a2.f(b2);
    }

    public EC_2() {
        EC_2 a2;
    }

    public void J(ac object) throws IOException {
        EC_2 b2 = object;
        object = this;
    }

    /*
     * WARNING - void declaration
     */
    public void f(String string, boolean bl) {
        void a2;
        Object c2 = string;
        EC_2 b2 = this;
        if (a2 != false) {
            b2.g.Ya.J().J((String)c2);
        }
        if (xta.J((String)c2)) {
            return;
        }
        b2.g.c.f((String)c2);
    }

    public void C() throws IOException {
        EC_2 a2;
        if (Keyboard.getEventKeyState()) {
            a2.J(Keyboard.getEventCharacter(), Keyboard.getEventKey());
        }
        a2.g.D();
    }

    /*
     * WARNING - void declaration
     */
    private void J(URI uRI) {
        int n2;
        void a2;
        EC_2 eC_2 = this;
        int n3 = uSa.E;
        if (cra.j.equals(a2.getScheme()) || yra.a.equals(a2.getScheme())) {
            n2 = n3 = vRa.d;
        } else {
            if (Ysa.f.equals(a2.getScheme()) && new File(a2.getPath()).exists()) {
                String[] stringArray = new String[yRa.d];
                stringArray[uSa.E] = KPa.C;
                stringArray[vRa.d] = MTa.X;
                stringArray[uqa.g] = dQa.S;
                for (String object : Arrays.asList(stringArray)) {
                    if (!a2.getPath().endsWith(object)) continue;
                    n3 = vRa.d;
                }
            }
            n2 = n3;
        }
        if (n2 == 0) {
            return;
        }
        try {
            Class<?> b2 = Class.forName(Usa.e);
            Object object = b2.getMethod(csa.i, new Class[uSa.E]).invoke(null, new Object[uSa.E]);
            Class[] classArray = new Class[vRa.d];
            classArray[uSa.E] = URI.class;
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = a2;
            b2.getMethod(ySa.l, classArray).invoke(object, objectArray);
            return;
        }
        catch (Throwable b2) {
            G.error(XOa.la, b2);
            return;
        }
    }

    public void l() {
    }

    public void J(String string, boolean bl) {
        boolean c2 = bl;
        EC_2 eC_2 = this;
    }

    public static boolean C(int a2) {
        if (a2 == Bpa.Ha && EC_2.C() && !EC_2.l() && !EC_2.f()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void d(String string) {
        Object b2 = string;
        EC_2 a2 = this;
        a2.f((String)b2, vRa.d != 0);
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, float f2) {
        void b2;
        void c2;
        float d2 = f2;
        EC_2 a2 = this;
        int n4 = d2 = uSa.E;
        while (n4 < a2.E.size()) {
            a2.E.get(++d2).J(a2.g, (int)c2, (int)b2);
            n4 = d2;
        }
        int n5 = d2 = uSa.E;
        while (n5 < a2.C.size()) {
            a2.C.get(++d2).f(a2.g, (int)c2, (int)b2);
            n5 = d2;
        }
    }

    static {
        String[] stringArray = new String[uqa.g];
        stringArray[uSa.E] = cra.j;
        stringArray[vRa.d] = yra.a;
        j = Sets.newHashSet(stringArray);
        D = Splitter.on((char)NTa.C);
    }

    public static void C(String string) {
        String string2 = string;
        if (!StringUtils.isEmpty(string2)) {
            try {
                StringSelection a2 = new StringSelection(string2);
                Toolkit.getDefaultToolkit().getSystemClipboard().setContents(a2, null);
                return;
            }
            catch (Exception a2) {
                // empty catch block
            }
        }
    }

    public static boolean l() {
        if (Keyboard.isKeyDown(cQa.i) || Keyboard.isKeyDown(GPa.C)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void f(Kpa kpa2, int n2, int n3) {
        void a2;
        void b2;
        EC_2 c2;
        EC_2 d2 = kpa2;
        EC_2 eC_2 = c2 = this;
        c2.g = d2;
        eC_2.m = c2.g.J();
        eC_2.L = ((Kpa)d2).Ea;
        c2.A = b2;
        c2.I = a2;
        c2.E.clear();
        c2.A();
    }

    public static boolean f() {
        if (Keyboard.isKeyDown(Upa.D) || Keyboard.isKeyDown(kTa.T)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(boolean bl, int n2) {
        int c2 = n2;
        EC_2 a2 = this;
        if (c2 == cPa.A) {
            void b2;
            if (b2 != false) {
                EC_2 eC_2 = a2;
                eC_2.J(eC_2.F);
            }
            a2.F = null;
            a2.g.J((EC)a2);
        }
    }

    public static boolean l(int a2) {
        if (a2 == Fsa.d && EC_2.C() && !EC_2.l() && !EC_2.f()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void f(int n2) {
        int b2 = n2;
        EC_2 a2 = this;
        uKa.L();
        uKa.I();
        pKa pKa2 = pKa.J();
        aKa aKa2 = pKa2.J();
        a2.g.J().J((ResourceLocation)J);
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        aKa aKa3 = aKa2;
        aKa aKa4 = aKa2;
        aKa4.J(XTa.W, mka.a);
        aKa4.J(aSa.V, (double)a2.I, aSa.V).J(aSa.V, (double)((float)a2.I / Ura.m + (float)b2)).J(ysa.s, ysa.s, ysa.s, osa.Ja).M();
        aKa3.J((double)a2.A, (double)a2.I, aSa.V).J((double)((float)a2.A / Ura.m), (double)((float)a2.I / Ura.m + (float)b2)).J(ysa.s, ysa.s, ysa.s, osa.Ja).M();
        aKa3.J((double)a2.A, aSa.V, aSa.V).J((double)((float)a2.A / Ura.m), (double)b2).J(ysa.s, ysa.s, ysa.s, osa.Ja).M();
        aKa3.J(aSa.V, aSa.V, aSa.V).J(aSa.V, (double)b2).J(ysa.s, ysa.s, ysa.s, osa.Ja).M();
        pKa2.J();
    }

    /*
     * WARNING - void declaration
     */
    public void J(ld ld2, int n2, int n3) {
        Object d2 = ld2;
        EC_2 c2 = this;
        if (d2 != null && d2.J().J() != null) {
            block21: {
                void a2;
                void b2;
                if ((d2 = d2.J().J()).J() == Hfa.SHOW_ITEM) {
                    Mda mda2 = null;
                    try {
                        Waa waa2 = Ica.J((String)d2.J().f());
                        if (waa2 instanceof Waa) {
                            mda2 = Mda.J((Waa)waa2);
                        }
                    }
                    catch (yca yca2) {
                        // empty catch block
                    }
                    if (mda2 != null) {
                        c2.J(mda2, (int)b2, (int)a2);
                    } else {
                        c2.J(pY.RED + lTa.X, (int)b2, (int)a2);
                    }
                } else if (d2.J() == Hfa.SHOW_ENTITY) {
                    if (c2.g.z.aa) {
                        try {
                            Waa waa3 = Ica.J((String)d2.J().f());
                            if (waa3 instanceof Waa) {
                                Waa waa4;
                                ArrayList<String> arrayList = Lists.newArrayList();
                                Waa waa5 = waa4 = waa3;
                                arrayList.add(waa5.J(dua.T));
                                if (waa5.J(Zpa.x, Yqa.i)) {
                                    String string = waa4.J(Zpa.x);
                                    arrayList.add(GPa.K + string + nQa.T + PIa.J((String)string) + hpa.b);
                                }
                                arrayList.add(waa4.J(QTa.O));
                                c2.J(arrayList, (int)b2, (int)a2);
                                break block21;
                            }
                            c2.J(pY.RED + aqa.K, (int)b2, (int)a2);
                        }
                        catch (yca yca3) {
                            c2.J(pY.RED + aqa.K, (int)b2, (int)a2);
                        }
                    }
                } else if (d2.J() == Hfa.SHOW_TEXT) {
                    c2.J(D.splitToList(d2.J().l()), (int)b2, (int)a2);
                } else if (d2.J() == Hfa.SHOW_ACHIEVEMENT) {
                    aX aX2 = Tz.J((String)d2.J().f());
                    if (aX2 != null) {
                        ld ld3 = aX2.f();
                        CZ cZ2 = new CZ(new StringBuilder().insert(3 & 4, RPa.E).append(aX2.J() ? Usa.V : yRa.Ha).toString(), new Object[uSa.E]);
                        cZ2.J().i(Boolean.valueOf(vRa.d != 0));
                        String string = aX2 instanceof gY ? ((gY)aX2).J() : null;
                        String[] stringArray = new String[uqa.g];
                        stringArray[uSa.E] = ld3.l();
                        stringArray[vRa.d] = cZ2.l();
                        d2 = Lists.newArrayList(stringArray);
                        if (string != null) {
                            d2.addAll(c2.L.J(string, Jpa.Ha));
                        }
                        c2.J((List<String>)d2, (int)b2, (int)a2);
                    } else {
                        c2.J(pY.RED + uua.U, (int)b2, (int)a2);
                    }
                }
            }
            uKa.L();
        }
    }

    public boolean J(ld ld2) {
        URI a22;
        EC_2 eC_2 = this;
        if (a22 == null) {
            return uSa.E != 0;
        }
        PEa b2 = a22.J().J();
        if (EC_2.l()) {
            if (a22.J().J() != null) {
                eC_2.J(a22.J().J(), uSa.E != 0);
            }
        } else if (b2 != null) {
            block19: {
                if (b2.J() == gEa.OPEN_URL) {
                    if (!eC_2.g.z.Mc) {
                        return uSa.E != 0;
                    }
                    try {
                        a22 = new URI(b2.J());
                        String string = a22.getScheme();
                        if (string == null) {
                            throw new URISyntaxException(b2.J(), VPa.I);
                        }
                        if (!j.contains(string.toLowerCase())) {
                            throw new URISyntaxException(b2.J(), new StringBuilder().insert(3 ^ 3, RQa.Ia).append(string.toLowerCase()).toString());
                        }
                        if (eC_2.g.z.la) {
                            eC_2.F = a22;
                            eC_2.g.J((EC)new WNa((l)eC_2, b2.J(), cPa.A, uSa.E != 0));
                            break block19;
                        }
                        eC_2.J(a22);
                    }
                    catch (URISyntaxException a22) {
                        G.error(new StringBuilder().insert(3 & 4, Pqa.e).append(b2).toString(), (Throwable)a22);
                    }
                } else if (b2.J() == gEa.OPEN_FILE) {
                    a22 = new File(b2.J()).toURI();
                    eC_2.J(a22);
                } else if (b2.J() == gEa.SUGGEST_COMMAND) {
                    eC_2.J(b2.J(), vRa.d != 0);
                } else if (b2.J() == gEa.RUN_COMMAND) {
                    eC_2.f(b2.J(), uSa.E != 0);
                } else {
                    G.error(new StringBuilder().insert(3 & 4, Mqa.d).append(b2).toString());
                }
            }
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static boolean f(int a2) {
        if (a2 == uOa.F && EC_2.C() && !EC_2.l() && !EC_2.f()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Kpa kpa2, int n2, int n3) {
        void b2;
        void c2;
        int d2 = n3;
        EC_2 a2 = this;
        a2.f((Kpa)c2, (int)b2, d2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(Mda mda2, int n2, int n3) {
        void a2;
        void b2;
        int d2;
        void c2;
        EC_2 eC_2 = this;
        List list = c2.J((Sx)eC_2.g.c, eC_2.g.z.aa);
        int n4 = d2 = uSa.E;
        while (n4 < list.size()) {
            if (d2 == 0) {
                List list2 = list;
                list2.set(d2, c2.J().rarityColor + (String)list2.get(d2));
            } else {
                int n5 = d2;
                list.set(n5, pY.GRAY + (String)list.get(n5));
            }
            n4 = ++d2;
        }
        eC_2.J(list, (int)b2, (int)a2);
    }

    public static String J() {
        try {
            Transferable transferable = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null);
            if (transferable != null && transferable.isDataFlavorSupported(DataFlavor.stringFlavor)) {
                return Sf.J((String)((String)transferable.getTransferData(DataFlavor.stringFlavor)));
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return Mqa.y;
    }

    public boolean J() {
        return vRa.d != 0;
    }

    public void J(int n2, int n3, int n4, long l2) {
        int e2 = n4;
        EC_2 eC_2 = this;
    }

    public static boolean J(int a2) {
        if (a2 == wra.e && EC_2.C() && !EC_2.l() && !EC_2.f()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4) throws IOException {
        int d2 = n4;
        EC_2 a2 = this;
        if (d2 == 0) {
            int n5 = d2 = uSa.E;
            while (n5 < a2.E.size()) {
                void b2;
                void c2;
                ac ac2 = a2.E.get(d2);
                if (ac2.J(a2.g, (int)c2, (int)b2)) {
                    ac ac3 = a2.J = ac2;
                    ac3.J(a2.g.J());
                    a2.J(ac3);
                }
                n5 = ++d2;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(List<String> list, int n2, int n3, boolean bl) {
        block14: {
            int n4;
            void a2;
            int n5;
            int n6;
            int b22;
            int c22;
            int n7;
            int e2;
            int n8;
            void d2;
            EC_2 eC_2;
            block17: {
                block16: {
                    Map<Integer, Bp> map;
                    block15: {
                        eC_2 = this;
                        if (d2.isEmpty()) break block14;
                        uKa.E();
                        nLa.C();
                        uKa.L();
                        uKa.u();
                        n8 = uSa.E;
                        map = gP.I;
                        map.clear();
                        int n9 = e2 = uSa.E;
                        while (n9 < d2.size()) {
                            int n10;
                            String string = (String)d2.get(e2);
                            Bp bp2 = gP.J(string);
                            if (bp2 != null) {
                                Map<Integer, Bp> map2;
                                if (bp2.J(eC_2.g)) {
                                    map2 = map;
                                    n7 = Oz.f((float)(bp2.C() + bp2.J().I));
                                } else {
                                    n7 = uSa.E;
                                    map2 = map;
                                }
                                map2.put(e2, bp2);
                                n10 = n7;
                            } else {
                                n10 = eC_2.L.J(string);
                            }
                            if (n10 > n8) {
                                n8 = n7;
                            }
                            n9 = ++e2;
                        }
                        e2 = c22 + lqa.s;
                        n6 = Math.max(AQa.P, (int)(b22 - lqa.s));
                        n7 = uSa.E;
                        if (!map.isEmpty()) break block15;
                        n7 = Yqa.i;
                        if (d2.size() <= vRa.d) break block16;
                        n7 += uqa.g + (d2.size() - vRa.d) * NTa.C;
                        n5 = e2;
                        break block17;
                    }
                    void v4 = d2;
                    int n11 = v4.size() - map.size();
                    if (v4.size() > vRa.d) {
                        n7 += 8;
                    }
                    if (n11 > 0) {
                        n7 += uqa.g + (n11 - vRa.d) * NTa.C;
                    }
                    for (Bp b22 : map.values()) {
                        if (!b22.J(eC_2.g)) continue;
                        n7 = (int)((float)n7 + (b22.l() + b22.J().A));
                    }
                }
                n5 = e2;
            }
            if (n5 + n8 > eC_2.A) {
                e2 -= EPa.O + n8;
            }
            if (n6 + n7 + uua.p > eC_2.I) {
                n6 = eC_2.I - n7 - uua.p;
            }
            EC_2 eC_22 = eC_2;
            eC_22.I = (int)nua.M;
            eC_22.m.m = nua.M;
            if (a2 != false) {
                int n12 = Zta.m;
                EC_2 eC_23 = eC_2;
                EC_2 eC_24 = eC_2;
                int n13 = e2;
                EC_2 eC_25 = eC_2;
                int n14 = n12;
                eC_25.J(e2 - yRa.d, n6 - AQa.P, e2 + n8 + yRa.d, n6 - yRa.d, n14, n14);
                int n15 = n12;
                eC_25.J(e2 - yRa.d, n6 + n7 + yRa.d, e2 + n8 + yRa.d, n6 + n7 + AQa.P, n15, n15);
                int n16 = n12;
                eC_2.J(n13 - yRa.d, n6 - yRa.d, e2 + n8 + yRa.d, n6 + n7 + yRa.d, n16, n16);
                int n17 = n12;
                eC_24.J(n13 - AQa.P, n6 - yRa.d, e2 - yRa.d, n6 + n7 + yRa.d, n17, n17);
                int n18 = n12;
                eC_23.J(e2 + n8 + yRa.d, n6 - yRa.d, e2 + n8 + AQa.P, n6 + n7 + yRa.d, n18, n18);
                c22 = hra.b;
                b22 = (c22 & Psa.P) >> vRa.d | c22 & gsa.X;
                eC_24.J(e2 - yRa.d, n6 - yRa.d + vRa.d, e2 - yRa.d + vRa.d, n6 + n7 + yRa.d - vRa.d, c22, b22);
                eC_23.J(e2 + n8 + uqa.g, n6 - yRa.d + vRa.d, e2 + n8 + yRa.d, n6 + n7 + yRa.d - vRa.d, c22, b22);
                int n19 = c22;
                eC_23.J(e2 - yRa.d, n6 - yRa.d, e2 + n8 + yRa.d, n6 - yRa.d + vRa.d, n19, n19);
                int n20 = b22;
                eC_23.J(e2 - yRa.d, n6 + n7 + uqa.g, e2 + n8 + yRa.d, n6 + n7 + yRa.d, n20, n20);
            }
            int n21 = n4 = uSa.E;
            while (n21 < d2.size()) {
                int n22;
                block20: {
                    block19: {
                        String c22;
                        block18: {
                            c22 = (String)d2.get(n4);
                            Bp b22 = gP.J(c22);
                            if (b22 == null) break block18;
                            if (!b22.J(eC_2.g)) break block19;
                            uKa.J((float)e2, (float)((float)n6 - MQa.L), (float)JPa.N);
                            uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
                            b22.f(OT.e);
                            uKa.J((float)(-e2), (float)((float)(-n6) + MQa.L), (float)JPa.N);
                            n6 = (int)((float)n6 + (b22.l() + b22.J().A));
                            n22 = n4;
                            break block20;
                        }
                        int n23 = n6;
                        n6 += 10;
                        eC_2.L.J(c22, (float)e2, (float)n23, pua.o);
                    }
                    n22 = n4;
                }
                if (n22 == 0) {
                    n6 += 2;
                }
                n21 = ++n4;
            }
            EC_2 eC_26 = eC_2;
            eC_26.I = (int)JPa.N;
            eC_26.m.m = JPa.N;
            uKa.P();
            uKa.J();
            nLa.f();
            uKa.o();
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(String string, int n2, int n3) {
        void b2;
        void c2;
        int d2 = n3;
        EC_2 a2 = this;
        String[] stringArray = new String[vRa.d];
        stringArray[uSa.E] = c2;
        a2.J(Arrays.asList(stringArray), (int)b2, d2);
    }

    public void J(char c2, int n2) throws IOException {
        int c3 = n2;
        EC_2 a2 = this;
        if (c3 == vRa.d) {
            a2.g.J((EC)((EC_2)null));
            if (a2.g.ta == null) {
                a2.g.C();
            }
        }
    }
}

