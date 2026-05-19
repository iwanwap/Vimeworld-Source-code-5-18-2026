/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Av
 *  BS
 *  CY
 *  Cra
 *  EC
 *  EH
 *  ERa
 *  FPa
 *  Gg
 *  Gx
 *  HW
 *  JPa
 *  Kl
 *  Kpa
 *  Mda
 *  NTa
 *  QSa
 *  Qqa
 *  Rba
 *  Sk
 *  Ssa
 *  URa
 *  Usa
 *  Vua
 *  Vz
 *  XTa
 *  YQ
 *  ZOa
 *  Zc
 *  Zpa
 *  aSa
 *  bSa
 *  bq
 *  bua
 *  cQa
 *  di
 *  dpa
 *  eS
 *  hra
 *  iS
 *  iq
 *  jsa
 *  kpa
 *  kqa
 *  lqa
 *  mra
 *  pPa
 *  pY
 *  pqa
 *  psa
 *  pua
 *  qH
 *  rt
 *  uOa
 *  vL
 *  vRa
 *  vV
 *  wI
 *  zTa
 *  zU
 */
import com.mojang.authlib.GameProfile;
import io.netty.buffer.Unpooled;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.MiniDotItem;
import net.xtrafrancyz.mods.minidot.items.impl.BedrockModel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.vimeworld.configuration.ConfigurationService;
import ru.vimeworld.configuration.impl.EmojisConfiguration;
import ru.vimeworld.configuration.impl.MDConfiguration;
import ru.vimeworld.minidot.atlas.emoji.MiniDotEmoji;
import ru.vimeworld.minidot.emotes.MiniDotEmote;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class zU_1 {
    private static MDConfiguration D;
    private boolean f;
    private final Map<iS, jU> F;
    private di g;
    public static final Logger L;
    public static final boolean E;
    private final Set<String> m;
    private bq C;
    public static final String i;
    public static final zU M;
    private final Map<String, XW> k;
    private boolean j = uSa.E;
    private final Map<UUID, jU> J;
    private Kpa A;
    private final Set<MiniDotItem> I;

    public void J(jU jU2) {
        zU_1 a2;
        jU b2 = jU2;
        zU_1 zU_12 = a2 = this;
        zU_12.J.put(zU_12.A.J().J().getId(), b2);
    }

    public jU f(UUID uUID) {
        UUID b2 = uUID;
        zU_1 a2 = this;
        return a2.J.computeIfAbsent(b2, dw.J());
    }

    public void d() {
        zU_1 a2;
        a2.k.clear();
    }

    public di J() {
        zU_1 a2;
        return a2.g;
    }

    public void J(String string) {
        zU_1 a2;
        String b2 = string;
        zU_1 zU_12 = a2 = this;
        zU_12.A.c.r();
        zU_12.A.c.J(new CY(new StringBuilder().insert(3 & 4, NSa.V).append(b2).toString()).J(new Vz().J(pY.RED)));
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(List list, String[] stringArray, vL vL2, MiniDotItem miniDotItem, boolean bl, boolean bl2, YQ yQ2) {
        void f2;
        void a2;
        List e2;
        List g2 = vL2;
        List list2 = e2 = list;
        list2.add(a2);
        if (list2.size() == ((void)f2).length) {
            void b2;
            void c2;
            void d2;
            ((Sx)((Object)g2)).m.J((MiniDotEmote)d2, e2);
            ((Sx)((Object)g2)).m.f((boolean)c2);
            ((Sx)((Object)g2)).m.l((boolean)b2);
        }
    }

    public void J(boolean bl) {
        boolean b2 = bl;
        zU_1 a2 = this;
        a2.f = b2;
    }

    public boolean f(MiniDotItem miniDotItem) {
        MiniDotItem b2 = miniDotItem;
        zU_1 a2 = this;
        if (QTa.ca.equals(i)) {
            return vRa.d != 0;
        }
        if (b2 instanceof MiniDotEmoji) {
            if (ConfigurationService.J(EmojisConfiguration.class).J(b2.id).J() || a2.I.contains(b2)) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        return a2.I.contains(b2);
    }

    static {
        M = new zU_1();
        L = LogManager.getLogger(psa.Q);
        E = Boolean.getBoolean(ySa.Ha);
        i = System.getProperty(bsa.x, Mqa.y);
    }

    public jU J(iS iS2) {
        zU_1 b2 = iS2;
        zU_1 a2 = this;
        if (b2 == iS.LOCAL) {
            return a2.J();
        }
        return a2.F.get(b2);
    }

    private void l(wI wI2) {
        Sx a2;
        zU_1 zU_12 = this;
        int b22 = a2.getInt(kqa.x);
        MiniDotItem b22 = (MiniDotItem)BS.ITEMS.get(b22);
        if (!(b22 instanceof MiniDotEmote)) {
            return;
        }
        if ((a2 = zU_12.J(a2.getInt(Mqa.k))) != null) {
            a2.m.J((MiniDotEmote)b22, null);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private Sx J(int n2) {
        void a2;
        vL vL2;
        zU_1 zU_12 = this;
        Iterator b2 = Kpa.J().Ta.J().iterator();
        block0: do {
            Iterator iterator = b2;
            while (true) {
                if (!iterator.hasNext()) {
                    return null;
                }
                vL2 = (vL)b2.next();
                if (vL2 instanceof Sx) continue block0;
                iterator = b2;
            }
        } while (vL2.M() != a2);
        return (Sx)vL2;
    }

    public boolean f() {
        zU_1 a2;
        return a2.f;
    }

    public void C() {
        zU_1 zU_12;
        zU_1 zU_13 = zU_12 = this;
        zU_13.k.clear();
        if (zU_13.A != null) {
            Object a2;
            zU_1 zU_14 = zU_12;
            zU_14.I.clear();
            zU_14.m.clear();
            Object object = a2 = BS.ITEMS.values().iterator();
            while (object.hasNext()) {
                ((MiniDotItem)a2.next()).discount = uSa.E;
                object = a2;
            }
            zU_12.J.clear();
            zU_12.j = uSa.E;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(MiniDotEmote miniDotEmote, String string, GameProfile gameProfile, double d2, double d3, double d4, float f2, Map<uEa, Mda> map, int n2, List<YQ> list) {
        void i2;
        void a2;
        void j2;
        void c2;
        void d5;
        void e2;
        void f3;
        void g2;
        void b2;
        Object k2 = gameProfile;
        zU_1 h2 = this;
        EH eH = new HashSet();
        zU_1 zU_12 = h2;
        EH eH2 = eH;
        zU_12.k.forEach(HW.J(eH2));
        Map<String, XW> map2 = zU_12.k;
        map2.getClass();
        eH2.forEach(Av.J(map2));
        k2 = new VW((zU)h2, (Gg)Kpa.J().Ta, (GameProfile)k2);
        if (b2 != pua.o && (b2 = Ni.J(h2.A.Ta.J((int)b2))) != null) {
            eH = new EH();
            eH.J = b2;
            Ni.J(k2.M(), eH);
        }
        Object object = k2;
        Object object2 = k2;
        ((XW)((Object)object2)).T = vRa.d;
        object2.f((double)g2, (double)f3, (double)e2, (float)d5, JPa.N);
        object2.getClass();
        c2.forEach(tv.J((XW)((Object)object2)));
        ((XW)((Object)object)).ba = d5;
        ((XW)((Object)object)).Ma = d5;
        ((XW)((Object)k2)).m.J((MiniDotEmote)j2, (List)a2);
        h2.k.put((String)i2, (XW)((Object)k2));
    }

    public boolean J() {
        zU_1 a2;
        return a2.j;
    }

    public static /* synthetic */ jU J(UUID a2) {
        return new jU();
    }

    public jU J() {
        zU_1 a2;
        zU_1 zU_12 = a2;
        return zU_12.f(zU_12.A.J().J().getId());
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public void f(wI wI2) {
        void a2;
        zU_1 zU_12;
        block10: {
            int n2;
            Object b222;
            block11: {
                zU_12 = this;
                if (!zU_12.A.d()) break block10;
                b222 = a2.getString(Wqa.fa);
                int n3 = pua.o;
                switch (((String)b222).hashCode()) {
                    case 1029271112: {
                        if (!((String)b222).equals(bua.Y)) break;
                        n2 = n3 = uSa.E;
                        break block11;
                    }
                    case -231354533: {
                        if (!((String)b222).equals(BQa.F)) break;
                        n3 = vRa.d;
                    }
                }
                n2 = n3;
            }
            switch (n2) {
                case 0: {
                    b222 = (MiniDotItem)BS.ITEMS.get(a2.getInt(xua.Aa));
                    zU_12.I.add((MiniDotItem)b222);
                    mx.J().D();
                    return;
                }
                case 1: {
                    int b222 = a2.getInt(kqa.x);
                    MiniDotItem b222 = (MiniDotItem)BS.ITEMS.get(b222);
                    if (!(b222 instanceof MiniDotEmote)) {
                        return;
                    }
                    Kpa.J().c.m.J((MiniDotEmote)b222, null);
                    return;
                }
            }
            return;
        }
        if (zU_12.A.J() == null) {
            return;
        }
        zU_12.A.J().J((KC)new Rba(psa.Q, new Lca(Unpooled.wrappedBuffer(a2.toByteArray()))));
    }

    /*
     * WARNING - void declaration
     */
    public void J(iS iS2, jU jU2) {
        void b2;
        jU c2 = jU2;
        zU_1 a2 = this;
        a2.F.put((iS)b2, c2);
    }

    public void l() {
        XW xW2;
        zU_1 zU_12 = this;
        Iterator a2 = M.J().values().iterator();
        while (a2.hasNext()) {
            xW2 = (XW)((Object)a2.next());
            if (xW2.m.J() == null) continue;
            xW2.m.J(vRa.d != 0);
        }
        Iterator iterator = a2 = zU_12.C.J().iterator();
        while (iterator.hasNext()) {
            xW2 = (iq)a2.next();
            iterator = a2;
            xW2.f();
        }
    }

    public void f() {
        zU_1 a2;
        a2.j = a2.A.d();
    }

    private void J(wI wI2) {
        int n2;
        int[] a2;
        zU_1 zU_12 = this;
        jU jU2 = zU_12.f(a2.getUUID(Usa.w));
        jU2.J();
        void v0 = a2;
        a2 = v0.getIntArray(QTa.Ga);
        wI wI3 = a2.getMap(Ssa.Ja);
        int[] nArray = v0.getIntArray(mra.Ha);
        int n3 = n2 = uSa.E;
        while (n3 < a2.length) {
            int b22 = a2[n2];
            MiniDotItem b22 = (MiniDotItem)BS.ITEMS.get(b22);
            if (b22 != null) {
                eS eS2 = b22.type == eS.PET && nArray != null && n2 < nArray.length ? (nArray[n2] == vRa.d ? eS.PET_RIGHT : eS.PET_LEFT) : jU2.J(b22.type);
                rt rt2 = new rt(b22.options);
                wI wI4 = (wI)wI3.get((Object)String.valueOf(b22.id));
                if (wI4 != null) {
                    rt2.J(wI4);
                }
                jU2.J(eS2, b22, rt2, uSa.E != 0);
            }
            n3 = ++n2;
        }
        jU2.f();
    }

    public void J(Kpa kpa2) {
        int b2;
        iS[] a2;
        zU_1 zU_12;
        zU_1 zU_13 = zU_12 = this;
        zU_13.A = a2;
        zU_13.g = new di(OT.i.C);
        zU_12.g.J(cQa.z);
        zU_13.C = new bq(zU_12.g);
        BS.l();
        Kpa.Z.add(psa.Q);
        D = ConfigurationService.J(MDConfiguration.class);
        a2 = iS.values();
        int n2 = a2.length;
        int n3 = b2 = uSa.E;
        while (n3 < n2) {
            iS iS2 = a2[b2];
            if (iS2 != iS.LOCAL) {
                jU jU2 = new jU(zU_12.J());
                jU2.k = vRa.d;
                zU_12.F.put(iS2, jU2);
            }
            n3 = ++b2;
        }
    }

    public void J() {
        zU_1 zU_12 = this;
        Iterator a2 = zU_12.J.values().iterator();
        Iterator<jU> iterator = a2;
        while (iterator.hasNext()) {
            Object object = (jU)a2.next();
            iterator = a2;
            ((jU)object).J.clear();
        }
        for (Object object : BS.ITEMS.values()) {
            if (!(((MiniDotItem)object).model instanceof BedrockModel)) continue;
            ((BedrockModel)((MiniDotItem)object).model).J();
        }
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(zU zU2, List list, String[] stringArray, MiniDotItem miniDotItem, String string, GameProfile gameProfile, double d2, double d3, double d4, float f2, Map map, int n2, YQ yQ2) {
        void k2;
        void a2;
        List m2 = list;
        zU l2 = zU2;
        List list2 = m2;
        list2.add(a2);
        if (list2.size() == ((void)k2).length) {
            void b2;
            void c2;
            void d5;
            void e2;
            void f3;
            void g2;
            void h2;
            void i2;
            void j2;
            l2.J((MiniDotEmote)j2, (String)i2, (GameProfile)h2, (double)g2, (double)f3, (double)e2, (float)d5, (Map<uEa, Mda>)c2, (int)b2, m2);
        }
    }

    private zU_1() {
        zU_1 a2;
        zU_1 zU_12 = a2;
        zU_12.J = new HashMap<UUID, jU>();
        a2.I = new HashSet<MiniDotItem>();
        a2.m = new HashSet<String>();
        a2.f = vRa.d;
        a2.k = new HashMap<String, XW>();
        a2.F = new EnumMap<iS, jU>(iS.class);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(MiniDotItem miniDotItem) {
        void a2;
        zU_1 zU_12 = this;
        zU_1 b2 = a2.J();
        if (b2.isVisible() || E || zU_12.I.contains(a2) || zU_12.m.contains(b2.getStringId())) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public Map<String, XW> J() {
        zU_1 a2;
        return a2.k;
    }

    /*
     * Unable to fully structure code
     */
    public void J(Cda var1_1) {
        b = var1_1;
        a = this;
        a.j = vRa.d;
        b = new wI(b.J());
        var2_2 = b.getString(Wqa.fa, Mqa.y);
        var5_4 = pua.o;
        switch (var2_2.hashCode()) {
            case -733902135: {
                if (var2_2.equals(Ira.ja)) {
                    v0 = var5_4 = uSa.E;
                    break;
                }
                ** GOTO lbl72
            }
            case -690212803: {
                if (var2_2.equals(Psa.W)) {
                    v0 = var5_4 = vRa.d;
                    break;
                }
                ** GOTO lbl72
            }
            case 113762: {
                if (var2_2.equals(pta.G)) {
                    v0 = var5_4 = uqa.g;
                    break;
                }
                ** GOTO lbl72
            }
            case 94839810: {
                if (var2_2.equals(zua.g)) {
                    v0 = var5_4 = yRa.d;
                    break;
                }
                ** GOTO lbl72
            }
            case 1983818166: {
                if (var2_2.equals(pqa.W)) {
                    v0 = var5_4 = AQa.P;
                    break;
                }
                ** GOTO lbl72
            }
            case 1797264985: {
                if (var2_2.equals(yta.C)) {
                    v0 = var5_4 = tTa.h;
                    break;
                }
                ** GOTO lbl72
            }
            case -934610812: {
                if (var2_2.equals(aSa.c)) {
                    v0 = var5_4 = uua.p;
                    break;
                }
                ** GOTO lbl72
            }
            case 2107309864: {
                if (var2_2.equals(Gta.E)) {
                    v0 = var5_4 = XTa.W;
                    break;
                }
                ** GOTO lbl72
            }
            case -714143716: {
                if (var2_2.equals(zOa.Aa)) {
                    v0 = var5_4 = Yqa.i;
                    break;
                }
                ** GOTO lbl72
            }
lbl53:
            // 2 sources

            case -2135526146: {
                if (false) ** GOTO lbl53
                if (var2_2.equals(QSa.W)) {
                    v0 = var5_4 = WOa.fa;
                    break;
                }
                ** GOTO lbl72
            }
            case 481356191: {
                if (var2_2.equals(URa.x)) {
                    v0 = var5_4 = NTa.C;
                    break;
                }
                ** GOTO lbl72
            }
            case 1843991533: {
                if (var2_2.equals(Yqa.x)) {
                    v0 = var5_4 = pPa.f;
                    break;
                }
                ** GOTO lbl72
            }
            case -663942534: {
                if (var2_2.equals(tTa.E)) {
                    var5_4 = lqa.s;
                }
            }
lbl72:
            // 16 sources

            default: {
                v0 = var5_4;
            }
        }
        switch (v0) lbl-1000:
        // 2 sources

        {
            case 0: {
                if (false) ** GOTO lbl-1000
                a.I.clear();
                var4_8 = b.getIntArray(Wqa.Y);
                var3_16 = var4_8.length;
                v1 = var6_23 = uSa.E;
                while (v1 < var3_16) {
                    var7_28 = var4_8[var6_23];
                    var8_32 = (MiniDotItem)BS.ITEMS.get(var7_28);
                    if (var8_32 != null) {
                        a.I.add(var8_32);
                    }
                    v1 = ++var6_23;
                }
                break;
            }
            case 1: {
                a.m.clear();
                var4_9 = b.getStringArray(XOa.T);
                if (var4_9 != null) {
                    a.m.addAll(Arrays.asList(var4_9));
                }
                v2 = var3_17 = BS.ITEMS.values().iterator();
                while (v2.hasNext()) {
                    var6_24 = (MiniDotItem)var3_17.next();
                    v2 = var3_17;
                    v3 = var6_24;
                    v3.discount = uSa.E;
                    v3.price = uSa.E;
                }
                v4 = b;
                var3_17 = v4.getIntArray(dpa.G);
                var6_24 = v4.getIntArray(ERa.f);
                var7_29 = v4.getIntArray(Qqa.E);
                var8_33 = v4.getIntArray(jsa.R);
                var9_36 = v4.getIntArray(FPa.J);
                var10_38 = v4.getIntArray(fqa.z);
                if (var3_17 != null) {
                    v5 = var11_41 = uSa.E;
                    while (v5 < ((Object)var3_17).length) {
                        var12_43 = (MiniDotItem)BS.ITEMS.get((int)var3_17[var11_41]);
                        if (var12_43 != null) {
                            var12_43.discount = (int)var6_24[var11_41];
                        }
                        v5 = ++var11_41;
                    }
                }
                if (var7_29 != null) {
                    v6 = var11_41 = uSa.E;
                    while (v6 < var7_29.length) {
                        var12_43 = (MiniDotItem)BS.ITEMS.get(var7_29[var11_41]);
                        if (var12_43 != null) {
                            var12_43.price = var8_33[var11_41];
                        }
                        v6 = ++var11_41;
                    }
                }
                if (var9_36 == null) break;
                v7 = var11_41 = uSa.E;
                while (v7 < var9_36.length) {
                    var12_43 = (MiniDotItem)BS.ITEMS.get(var9_36[var11_41]);
                    if (var12_43 != null) {
                        var12_43.currency = Zc.values()[var10_38[var11_41]];
                    }
                    v7 = ++var11_41;
                }
                break;
            }
            case 2: {
                a.J((wI)b);
                return;
            }
            case 3: {
                v8 = b;
                Zc.setCoins((int)v8.getInt(zua.g));
                Zc.setVimers((int)(v8.getInt(uua.h) + b.getInt(xua.J)));
                return;
            }
            case 4: {
                a.J.clear();
                var4_10 = b.getMapArray(Qpa.B);
                var3_18 = var4_10.length;
                v9 = var6_25 = uSa.E;
                while (v9 < var3_18) {
                    var7_30 = var4_10[var6_25];
                    a.J(var7_30);
                    v9 = ++var6_25;
                }
                break;
            }
            case 5: {
                a.l((wI)b);
                return;
            }
            case 6: {
                a.J.remove(b.getUUID(Usa.w));
                return;
            }
            case 7: {
                var4_11 = b.getString(zTa.Ga);
                var3_19 = pua.o;
                switch (var4_11.hashCode()) {
                    case 1582872719: {
                        if (var4_11.equals(hpa.o)) {
                            v10 = var3_19 = uSa.E;
                            break;
                        }
                        ** GOTO lbl190
                    }
lbl171:
                    // 2 sources

                    case -733902135: {
                        if (false) ** GOTO lbl171
                        if (var4_11.equals(Ira.ja)) {
                            v10 = var3_19 = vRa.d;
                            break;
                        }
                        ** GOTO lbl190
                    }
                    case 3151468: {
                        if (var4_11.equals(IPa.O)) {
                            v10 = var3_19 = uqa.g;
                            break;
                        }
                        ** GOTO lbl190
                    }
                    case 253684815: {
                        if (var4_11.equals(MTa.h)) {
                            v10 = var3_19 = yRa.d;
                            break;
                        }
                        ** GOTO lbl190
                    }
                    case 1978314576: {
                        if (var4_11.equals(hra.o)) {
                            var3_19 = AQa.P;
                        }
                    }
lbl190:
                    // 8 sources

                    default: {
                        v10 = var3_19;
                    }
                }
                switch (v10) lbl-1000:
                // 2 sources

                {
                    case 0: {
                        if (false) ** GOTO lbl-1000
                        a.J(Nra.l);
                        return;
                    }
                    case 1: {
                        a.J(mra.C);
                        return;
                    }
                    case 2: {
                        a.J(xra.A);
                        return;
                    }
                    case 3: {
                        a.J(Hta.r);
                        return;
                    }
                    case 4: {
                        mx.J().J((MiniDotItem)BS.ITEMS.get(b.getInt(xua.Aa)), b.getInt(Hra.y), Zc.values()[b.getInt(LRa.Ga)]);
                    }
                }
                return;
            }
            case 8: {
                var4_12 = b.getInt(bSa.x);
                var3_20 = (MiniDotItem)BS.ITEMS.get(var4_12);
                if (!(var3_20 instanceof MiniDotEmote)) {
                    return;
                }
                v11 = b;
                var6_26 = v11.getDouble(rRa.X);
                var8_34 = v11.getDouble(uOa.Ja);
                var10_39 = v11.getDouble(oua.v);
                var12_44 = v11.getFloat(ROa.n);
                var13_46 = v11.getMap(ZOa.F);
                var14_48 = new HashMap<uEa, Mda>();
                for (String var16_52 : var13_46.keySet()) {
                    try {
                        var2_2 = uEa.valueOf(var16_52);
                        var5_5 = qH.J((String)var13_46.getString((String)var16_52)).j;
                        var14_48.put((uEa)var2_2, var5_5);
                    }
                    catch (Throwable var2_3) {
                        zU_1.L.error(var2_3);
                    }
                }
                var15_50 = UUID.fromString(b.getString(Zpa.m));
                var16_52 = Kpa.J().J().J(var15_50);
                var2_2 = null;
                if (var16_52 != null) {
                    var2_2 = var16_52.J();
                    var5_6 = b.getString(rua.f);
                    if (var5_6 != null) {
                        var17_54 = new GameProfile(var2_2.getId(), var5_6);
                        var17_54.getProperties().putAll(var2_2.getProperties());
                        var2_2 = var17_54;
                    }
                }
                v12 = b;
                var5_7 = v12.getInt(kpa.s, pua.o);
                var17_54 = v12.getString(QTa.O, UUID.randomUUID().toString());
                if (v12.containsKey((Object)KQa.F)) {
                    var18_55 = var2_2;
                    var19_56 = b.getStringArray(KQa.F);
                    var20_57 = new ArrayList<E>();
                    var21_58 = var19_56;
                    var22_59 = var19_56.length;
                    v13 = var23_60 = uSa.E;
                    while (v13 < var22_59) {
                        var24_61 = var21_58[var23_60];
                        var24_61 = Sk.J((ResourceLocation)new ResourceLocation(Cra.V, var24_61));
                        zU_1.M.J().J((Kl)var24_61, vV.J((zU)a, var20_57, (String[])var19_56, (MiniDotItem)var3_20, (String)var17_54, (GameProfile)var18_55, (double)var6_26, (double)var8_34, (double)var10_39, (float)var12_44, var14_48, (int)var5_7));
                        v13 = ++var23_60;
                    }
                    return;
                }
                a.J((MiniDotEmote)var3_20, (String)var17_54, (GameProfile)var2_2, var6_26, var8_34, var10_39, var12_44, var14_48, var5_7, null);
                return;
            }
            case 9: {
                var4_13 = b.getString(QTa.O);
                a.k.remove(var4_13);
                return;
            }
            case 10: {
                var4_14 = b.getInt(bSa.x);
                var3_21 = (MiniDotItem)BS.ITEMS.get(var4_14);
                if (!(var3_21 instanceof MiniDotEmote)) {
                    return;
                }
                v14 = b;
                var6_27 = v14.getInt(kpa.s);
                var7_31 = v14.getBoolean(Vua.Ka, (boolean)uSa.E);
                var8_35 = v14.getBoolean(kTa.la, (boolean)uSa.E);
                var9_37 = Kpa.J().Ta.J(var6_27);
                if (!(var9_37 instanceof Sx)) break;
                if (b.containsKey((Object)KQa.F)) {
                    var10_40 = b.getStringArray(KQa.F);
                    var11_42 = new ArrayList<E>();
                    var12_45 = var10_40;
                    var13_47 = var10_40.length;
                    v15 = var14_49 = uSa.E;
                    while (v15 < var13_47) {
                        var15_51 = var12_45[var14_49];
                        var16_53 = Sk.J((ResourceLocation)new ResourceLocation(Cra.V, var15_51));
                        zU_1.M.J().J(var16_53, Gx.J(var11_42, (String[])var10_40, (vL)var9_37, (MiniDotItem)var3_21, (boolean)var7_31, (boolean)var8_35));
                        v15 = ++var14_49;
                    }
                    return;
                }
                ((Sx)var9_37).m.J((MiniDotEmote)var3_21, null);
                ((Sx)var9_37).m.f(var7_31);
                ((Sx)var9_37).m.l(var8_35);
                return;
            }
            case 11: {
                var4_15 = b.getInt(kpa.s);
                var3_22 = Kpa.J().Ta.J(var4_15);
                if (!(var3_22 instanceof Sx)) break;
                ((Sx)var3_22).m.J();
                return;
            }
            case 12: {
                Kpa.J().J((EC)mx.J());
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(Set set, String string, XW xW2) {
        Object c2 = xW2;
        Set a2 = set;
        if (((XW)((Object)c2)).m.J() == null) {
            void b2;
            a2.add(b2);
        }
    }

    public bq J() {
        zU_1 a2;
        return a2.C;
    }
}

