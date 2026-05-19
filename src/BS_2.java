/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ata
 *  Bpa
 *  Cta
 *  D
 *  EQa
 *  ES
 *  EU
 *  Epa
 *  Eu
 *  Fpa
 *  Gua
 *  Hs
 *  Iu
 *  JPa
 *  JQa
 *  KTa
 *  Kt
 *  Ku
 *  LQa
 *  Lra
 *  MQa
 *  NQa
 *  NTa
 *  Pqa
 *  QSa
 *  Qqa
 *  RPa
 *  RQa
 *  Ru
 *  Rua
 *  SQa
 *  Spa
 *  Sqa
 *  Ssa
 *  TPa
 *  Tpa
 *  Ts
 *  URa
 *  Uqa
 *  Usa
 *  VQa
 *  VT
 *  WQa
 *  Wsa
 *  XTa
 *  YSa
 *  Yra
 *  Ysa
 *  ZRa
 *  Zpa
 *  Zua
 *  aQa
 *  aSa
 *  bRa
 *  bSa
 *  bU
 *  bpa
 *  bqa
 *  bua
 *  cRa
 *  dQa
 *  dpa
 *  eC
 *  eS
 *  fsa
 *  gS
 *  hTa
 *  hra
 *  hs
 *  iPa
 *  jRa
 *  kpa
 *  lPa
 *  lqa
 *  oqa
 *  pPa
 *  pqa
 *  psa
 *  pua
 *  qta
 *  sS
 *  uOa
 *  uQa
 *  uRa
 *  ura
 *  vPa
 *  vQa
 *  vRa
 *  vpa
 *  wOa
 *  xOa
 *  xs
 *  xt
 *  yra
 *  ysa
 *  zTa
 *  zU
 *  zs
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import net.xtrafrancyz.mods.minidot.items.MDModel;
import net.xtrafrancyz.mods.minidot.items.MiniDotItem;
import net.xtrafrancyz.mods.minidot.items.body.BatWings;
import net.xtrafrancyz.mods.minidot.items.body.BatterflyWings;
import net.xtrafrancyz.mods.minidot.items.body.BatterflyWingsV2;
import net.xtrafrancyz.mods.minidot.items.body.BigWings;
import net.xtrafrancyz.mods.minidot.items.body.DemonicWings;
import net.xtrafrancyz.mods.minidot.items.body.DemonicWingsTail;
import net.xtrafrancyz.mods.minidot.items.body.ExoWings;
import net.xtrafrancyz.mods.minidot.items.body.FieryWings;
import net.xtrafrancyz.mods.minidot.items.body.FirstWings;
import net.xtrafrancyz.mods.minidot.items.body.Garlands;
import net.xtrafrancyz.mods.minidot.items.body.MercyWings;
import net.xtrafrancyz.mods.minidot.items.body.NeonWings;
import net.xtrafrancyz.mods.minidot.items.body.SkyeyWings;
import net.xtrafrancyz.mods.minidot.items.body.WingsDragon;
import net.xtrafrancyz.mods.minidot.items.impl.BedrockArmorLayer3D;
import net.xtrafrancyz.mods.minidot.items.impl.BedrockModel;
import net.xtrafrancyz.mods.minidot.items.impl.BedrockPlayerPet;
import net.xtrafrancyz.mods.minidot.items.impl.ImageArmorLayer;
import net.xtrafrancyz.mods.minidot.items.impl.ImageArrowTrail;
import net.xtrafrancyz.mods.minidot.items.impl.ImageShadow;
import net.xtrafrancyz.mods.minidot.items.pet.AndroidPet;
import net.xtrafrancyz.mods.minidot.items.pet.BearPet;
import net.xtrafrancyz.mods.minidot.items.pet.BedWars2017;
import net.xtrafrancyz.mods.minidot.items.pet.BimoPet;
import net.xtrafrancyz.mods.minidot.items.pet.BombPet;
import net.xtrafrancyz.mods.minidot.items.pet.CatGun;
import net.xtrafrancyz.mods.minidot.items.pet.ChestPet;
import net.xtrafrancyz.mods.minidot.items.pet.ChickenBabyPet;
import net.xtrafrancyz.mods.minidot.items.pet.ChickenPet;
import net.xtrafrancyz.mods.minidot.items.pet.ChipmunkPet;
import net.xtrafrancyz.mods.minidot.items.pet.CloudPet;
import net.xtrafrancyz.mods.minidot.items.pet.ConsolePet;
import net.xtrafrancyz.mods.minidot.items.pet.CreeperPet;
import net.xtrafrancyz.mods.minidot.items.pet.DeerPet;
import net.xtrafrancyz.mods.minidot.items.pet.ElfPet;
import net.xtrafrancyz.mods.minidot.items.pet.EndermanPet;
import net.xtrafrancyz.mods.minidot.items.pet.FarmSunflower;
import net.xtrafrancyz.mods.minidot.items.pet.GhastPet;
import net.xtrafrancyz.mods.minidot.items.pet.GiftPet;
import net.xtrafrancyz.mods.minidot.items.pet.GrinchPet;
import net.xtrafrancyz.mods.minidot.items.pet.HuggyWuggy;
import net.xtrafrancyz.mods.minidot.items.pet.KodamaPet;
import net.xtrafrancyz.mods.minidot.items.pet.LoveBearPet;
import net.xtrafrancyz.mods.minidot.items.pet.MegaBox;
import net.xtrafrancyz.mods.minidot.items.pet.MushroomPet;
import net.xtrafrancyz.mods.minidot.items.pet.OliviaPet;
import net.xtrafrancyz.mods.minidot.items.pet.OwlPet;
import net.xtrafrancyz.mods.minidot.items.pet.PersonaGrandArcades;
import net.xtrafrancyz.mods.minidot.items.pet.PinataPet;
import net.xtrafrancyz.mods.minidot.items.pet.PlayerNewPet;
import net.xtrafrancyz.mods.minidot.items.pet.PlayerPet;
import net.xtrafrancyz.mods.minidot.items.pet.SheepPig;
import net.xtrafrancyz.mods.minidot.items.pet.SkeletonPet;
import net.xtrafrancyz.mods.minidot.items.pet.SkullPet;
import net.xtrafrancyz.mods.minidot.items.pet.SlimePet;
import net.xtrafrancyz.mods.minidot.items.pet.SnailPet;
import net.xtrafrancyz.mods.minidot.items.pet.Spinner;
import net.xtrafrancyz.mods.minidot.items.pet.SpinnerFlash;
import net.xtrafrancyz.mods.minidot.items.pet.TriggerTeddy;
import net.xtrafrancyz.mods.minidot.items.pet.UnluckyCatPet;
import net.xtrafrancyz.mods.minidot.items.pet.VivillonPet;
import net.xtrafrancyz.mods.minidot.items.pet.WalrusPet;
import net.xtrafrancyz.mods.minidot.items.pet.WildDuckPet;
import net.xtrafrancyz.mods.minidot.items.pet.WumpusPet;
import net.xtrafrancyz.mods.minidot.items.pet.XmasGiftPet;
import net.xtrafrancyz.mods.minidot.items.pet.ZombiePet;
import ru.vimeworld.configuration.ConfigurationService;
import ru.vimeworld.configuration.impl.PresetsConfiguration;
import ru.vimeworld.minidot.emotes.MiniDotEmote;
import ru.vimeworld.minidot.items.body.BoobsItem;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BS_2
implements D {
    private static final Map<Integer, MDModel> JAVA_MODELS;
    public static final Map<Integer, MiniDotItem> ITEMS;
    private static final Map<eS, List<MiniDotItem>> BY_TYPE_CACHE;
    private static int autoId;

    /*
     * WARNING - void declaration
     */
    private static void J(int n2, Hs hs) {
        void a2;
        int n3 = n2;
        MiniDotItem b2 = ITEMS.get(n3);
        if (b2 == null) {
            throw new RuntimeException(new StringBuilder().insert(2 & 5, vua.u).append(n3).toString());
        }
        if (!(b2.model instanceof BedrockModel)) {
            throw new RuntimeException(new StringBuilder().insert(3 & 4, JQa.w).append(n3).toString());
        }
        ((BedrockModel)b2.model).J((Hs)a2);
    }

    public static void l() {
        long l2 = System.currentTimeMillis();
        try {
            BS_2.f();
            zU.L.info(new StringBuilder().insert(3 ^ 3, Ysa.J).append(System.currentTimeMillis() - l2).append(ypa.Z).append(ITEMS.size()).append(cPa.t).toString());
            return;
        }
        catch (Exception exception) {
            ITEMS.clear();
            zU.L.error(POa.u, (Throwable)exception);
            return;
        }
    }

    private static void f() {
        BS_2.J(rQa.i, new DemonicWingsTail());
        BS_2.J(Ura.U, new Garlands(Garlands.RGB));
        BS_2.J(xOa.p, new Garlands(Garlands.CMYK));
        BS_2.J(ura.z, new FieryWings(rQa.Y));
        BS_2.J(yRa.O, new FieryWings(rQa.a));
        BS_2.J(fsa.W, new FieryWings(NSa.A));
        BS_2.J(Bua.p, new FieryWings(bSa.q));
        BS_2.J(cPa.Fa, new FieryWings(aSa.F));
        BS_2.J(vua.B, new FirstWings(gQa.r));
        BS_2.J(QTa.Ha, new FirstWings(GPa.i));
        BS_2.J(ATa.O, new FirstWings(rQa.a));
        BS_2.J(wsa.L, new FirstWings(bSa.q));
        BS_2.J(VQa.h, new FirstWings(NSa.A));
        BS_2.J(psa.s, new FirstWings(pua.Ea));
        BS_2.J(Bta.T, new DemonicWings());
        BS_2.J(uua.z, new BigWings(GPa.i));
        BS_2.J(eua.G, new BigWings(gQa.r));
        BS_2.J(vTa.o, new BigWings(Cta.W));
        BS_2.J(NTa.k, new BigWings(pua.Ea));
        BS_2.J(FRa.a, new BatterflyWings());
        BS_2.J(csa.fa, new BatterflyWingsV2(gQa.r));
        BS_2.J(PRa.ha, new BatterflyWingsV2(Cta.W));
        BS_2.J(Ysa.N, new BatterflyWingsV2(rQa.a));
        BS_2.J(fqa.y, new BatterflyWingsV2(NSa.A));
        BS_2.J(rSa.ca, new WingsDragon());
        BS_2.J(rSa.U, new NeonWings(rQa.a));
        BS_2.J(Jpa.K, new NeonWings(rQa.Y));
        BS_2.J(gua.d, new NeonWings(NSa.A));
        BS_2.J(Nta.fa, new NeonWings(yRa.J));
        BS_2.J(SPa.e, new NeonWings(QTa.v));
        BS_2.J(uSa.H, new ExoWings(rQa.a));
        BS_2.J(URa.Aa, new ExoWings(rQa.Y));
        BS_2.J(iSa.F, new ExoWings(NSa.A));
        BS_2.J(cTa.w, new ExoWings(gQa.r));
        BS_2.J(YSa.X, new ExoWings(QTa.v));
        BS_2.J(fsa.l, new MercyWings(rQa.Y));
        BS_2.J(dpa.T, new MercyWings(QTa.v));
        BS_2.J(SQa.C, new MercyWings(Cta.W));
        BS_2.J(URa.A, new MercyWings(yRa.J));
        BS_2.J(Eqa.a, new MercyWings(rQa.a));
        BS_2.J(Uqa.I, new MercyWings(pta.A));
        BS_2.J(Ssa.t, new SkyeyWings());
        BS_2.J(uRa.o, new BatWings());
        BS_2.J(uqa.Y, new BoobsItem());
        BS_2.J(PQa.E, new PlayerNewPet());
        BS_2.J(fta.l, new FarmSunflower());
        BS_2.J(Jqa.S, new PersonaGrandArcades());
        BS_2.J(yRa.d, new BedWars2017(vQa.Z));
        BS_2.J(AQa.P, new BedWars2017(ura.u));
        BS_2.J(tTa.h, new BedWars2017(opa.Aa));
        BS_2.J(uua.p, new BedWars2017(pta.A));
        BS_2.J(dpa.A, new TriggerTeddy());
        BS_2.J(Jpa.Ha, new LoveBearPet());
        BS_2.J(Iqa.M, new GrinchPet());
        BS_2.J(wOa.h, new ElfPet());
        BS_2.J(AQa.ba, new XmasGiftPet(rQa.Y));
        BS_2.J(osa.c, new XmasGiftPet(rQa.a));
        BS_2.J(kTa.g, new XmasGiftPet(NSa.A));
        BS_2.J(ITa.E, new XmasGiftPet(QTa.v));
        BS_2.J(WOa.fa, new ChestPet(rQa.Y));
        BS_2.J(NTa.C, new ChestPet(NSa.A));
        BS_2.J(zta.Ga, new MegaBox());
        BS_2.J(hQa.R, new HuggyWuggy(osa.I));
        BS_2.J(sSa.b, new HuggyWuggy(dsa.Z));
        BS_2.J(Gua.S, new WumpusPet());
        BS_2.J(Uqa.W, new MushroomPet(JPa.y));
        BS_2.J(eua.A, new MushroomPet(rQa.Y));
        BS_2.J(vua.m, new MushroomPet(Usa.s));
        BS_2.J(TPa.B, new MushroomPet(osa.q));
        BS_2.J(ura.P, new SheepPig());
        BS_2.J(Fpa.Ga, new OliviaPet());
        BS_2.J(jRa.C, new CloudPet());
        BS_2.J(Cta.U, new PinataPet());
        BS_2.J(Usa.I, new EndermanPet());
        BS_2.J(UOa.M, new ZombiePet());
        BS_2.J(fsa.M, new SkeletonPet());
        BS_2.J(RPa.fa, new CreeperPet());
        BS_2.J(vTa.u, new SlimePet());
        BS_2.J(Ata.c, new PlayerPet(Lra.l));
        BS_2.J(Zra.A, new PlayerPet(MTa.Z));
        BS_2.J(Wqa.v, new PlayerPet(XTa.o));
        BS_2.J(oua.C, new PlayerPet(KTa.V));
        BS_2.J(bua.r, new PlayerPet(vqa.Da).J());
        BS_2.J(vqa.r, new PlayerPet(Wsa.H).J());
        BS_2.J(lqa.N, new PlayerPet(uSa.f).J());
        BS_2.J(zTa.U, new PlayerPet(mPa.a).J());
        BS_2.J(ATa.S, new PlayerPet(Nra.N).J());
        BS_2.J(zOa.Z, new PlayerPet(AQa.E).J());
        BS_2.J(RPa.d, new PlayerPet(gua.r).J());
        BS_2.J(dQa.g, new PlayerPet(kpa.ja).J());
        BS_2.J(cPa.o, new PlayerPet(Qpa.Ha).J());
        BS_2.J(pua.ha, new PlayerPet(ypa.x, uRa.H).J());
        BS_2.J(kua.p, new PlayerPet(uRa.X).J());
        BS_2.J(Eqa.i, new PlayerPet(fqa.j).J());
        BS_2.J(ATa.z, new PlayerPet(Epa.m).J());
        BS_2.J(FRa.H, new PlayerPet(Zua.a).J());
        BS_2.J(pqa.S, new PlayerPet(cRa.N).J());
        BS_2.J(qta.y, new WalrusPet());
        BS_2.J(uRa.O, new VivillonPet());
        BS_2.J(xSa.S, new BimoPet());
        BS_2.J(yra.e, new PlayerPet(dqa.R, Ata.a));
        BS_2.J(UOa.i, new BombPet());
        BS_2.J(eta.s, new GhastPet());
        BS_2.J(VQa.q, new BearPet());
        BS_2.J(Lsa.s, new ChestPet(AQa.t));
        BS_2.J(LQa.Y, new ChipmunkPet());
        BS_2.J(JPa.Q, new SnailPet());
        BS_2.J(Zua.C, new KodamaPet());
        BS_2.J(NTa.w, new ConsolePet());
        BS_2.J(opa.b, new DeerPet());
        BS_2.J(osa.w, new ChickenPet());
        BS_2.J(JPa.q, new ChickenBabyPet());
        BS_2.J(iPa.l, new WildDuckPet());
        BS_2.J(cPa.v, new UnluckyCatPet());
        BS_2.J(aQa.f, new GiftPet());
        BS_2.J(Sqa.D, new AndroidPet());
        BS_2.J(xSa.n, new SkullPet());
        BS_2.J(lTa.Ka, new OwlPet());
        BS_2.J(ysa.L, new PlayerPet(NQa.F, vRa.O));
        BS_2.J(Yra.I, new Spinner(gQa.r));
        BS_2.J(Lra.r, new Spinner(rQa.a));
        BS_2.J(ATa.la, new Spinner(rQa.Y));
        BS_2.J(RQa.Z, new Spinner(NSa.A));
        BS_2.J(Jta.z, new Spinner(QTa.v));
        BS_2.J(xOa.H, new SpinnerFlash());
        BS_2.J(uRa.Ha, new CatGun());
        BS_2.J();
        jD.J().f();
        XMa.J.f().forEach(Ts.J());
        BS_2.J(pPa.f, (Hs)new xt());
        BS_2.J(MQa.fa, (Hs)new hs(uSa.E != 0));
        BS_2.J(Spa.Z, (Hs)new Iu());
        BS_2.J(WPa.i, (Hs)new xs());
        BS_2.J(uQa.t, (Hs)new hs(vRa.d != 0));
        BS_2.J(NSa.Aa, (Hs)new hs(uSa.E != 0));
        BS_2.J(BQa.j, (Hs)new gS());
        BS_2.J(wua.o, (Hs)new Kt());
        BS_2.J(oqa.R, new QR());
        BS_2.J(lqa.f, (Hs)new Ku(Mqa.n));
        BS_2.J(KSa.H, (Hs)new Ku(Mqa.n));
        BS_2.J(Zpa.i, (Hs)new Ku(Mqa.n));
        BS_2.J(KSa.J, (Hs)new Ku(Mqa.n));
    }

    private static void J(File file) {
        int n2;
        File file2 = file;
        File[] fileArray = file2.listFiles();
        if (fileArray == null) {
            return;
        }
        int n3 = fileArray.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            File a2 = fileArray[n2];
            if (a2.isDirectory()) {
                BS_2.J(a2);
            } else if (!a2.getName().equals(pta.Fa)) {
                try {
                    BS_2.J(a2.getPath(), new FileInputStream(a2));
                }
                catch (FileNotFoundException fileNotFoundException) {
                    throw new RuntimeException(new StringBuilder().insert(5 >> 3, Lra.V).append(a2).toString(), fileNotFoundException);
                }
            }
            n4 = ++n2;
        }
    }

    private static boolean J() {
        try {
            Class.forName(Tpa.b);
            return vRa.d != 0;
        }
        catch (ClassNotFoundException classNotFoundException) {
            return uSa.E != 0;
        }
    }

    public BS_2() {
        BS_2 a2;
    }

    private static void J(String string, InputStream inputStream) {
        Object b22 = inputStream;
        String a2 = string;
        try {
            b22 = new JsonParser().parse(new InputStreamReader((InputStream)b22, StandardCharsets.UTF_8));
            BS_2.J(((JsonElement)b22).getAsJsonArray());
            return;
        }
        catch (Exception b22) {
            throw new RuntimeException(new StringBuilder().insert(3 ^ 3, Lra.V).append(a2).toString(), b22);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void J(JsonArray var0) {
        var2_1 = var0;
        var9_2 = var2_1.iterator();
        do {
            block77: {
                block74: {
                    block76: {
                        block72: {
                            v0 = var9_2;
                            while (true) {
                                block71: {
                                    block75: {
                                        if (!v0.hasNext()) {
                                            return;
                                        }
                                        a = var9_2.next().getAsJsonObject();
                                        var11_20 = eS.valueOf((String)a.get(Zpa.x).getAsString());
                                        var4_8 = a.has(QTa.O) != false ? a.get(QTa.O).getAsInt() : BS_2.autoId + vRa.d;
                                        v1 = a;
                                        var5_9 = v1.get(dua.T).getAsString();
                                        var6_10 = v1.has(QTa.O) != false ? new StringBuilder().insert(5 >> 3, Jqa.H).append(var4_8).toString() : var5_9;
                                        var8_12 = null;
                                        v2 = a;
                                        if (a.has(EQa.Ga)) {
                                            var8_12 = v2.get(EQa.Ga).getAsString();
                                            v3 = a;
                                        } else {
                                            if (v2.has(oua.D) && a.get(oua.D).isJsonArray()) {
                                                var8_12 = a.get(oua.D).getAsJsonArray().get(uSa.E).getAsJsonObject().get(dua.T).getAsString();
                                            }
                                            v3 = a;
                                        }
                                        var1_3 = v3.get(Uqa.l).getAsString();
                                        var10_14 = pua.o;
                                        switch (var1_3.hashCode()) {
                                            case -231550106: {
                                                if (!var1_3.equals(Zqa.w)) break;
                                                v4 = var10_14 = uSa.E;
                                                break block75;
                                            }
                                            case 1068565754: {
                                                if (!var1_3.equals(Jsa.M)) break;
                                                v4 = var10_14 = vRa.d;
                                                break block75;
                                            }
                                            case -687010350: {
                                                if (!var1_3.equals(csa.Ja)) break;
                                                v4 = var10_14 = uqa.g;
                                                break block75;
                                            }
                                            case -1343088176: {
                                                if (!var1_3.equals(cTa.C)) break;
                                                v4 = var10_14 = yRa.d;
                                                break block75;
                                            }
                                            case -1046173231: {
                                                if (!var1_3.equals(eua.y)) break;
                                                v4 = var10_14 = AQa.P;
                                                break block75;
                                            }
                                            case -661709988: {
                                                if (!var1_3.equals(Rua.Ka)) break;
                                                v4 = var10_14 = tTa.h;
                                                break block75;
                                            }
                                            case 3254818: {
                                                if (!var1_3.equals(vPa.I)) break;
                                                v4 = var10_14 = uua.p;
                                                break block75;
                                            }
                                            case 96633208: {
                                                if (!var1_3.equals(Nra.n)) break;
                                                var10_14 = XTa.W;
                                            }
                                        }
                                        v4 = var10_14;
                                    }
                                    switch (v4) {
                                        case 0: {
                                            var3_4 = new BedrockModel(a.get(Psa.b).getAsString(), var8_12);
                                            var7_11 = var3_4;
                                            if (a.has(Spa.e)) {
                                                v5 = a;
                                                var3_4.J(v5.get(Spa.e).getAsString());
                                                if (v5.has(oua.f)) {
                                                    var3_4.f(a.get(oua.f).getAsString());
                                                }
                                            }
                                            var12_21 = uSa.E;
                                            if (a.has(eua.t)) {
                                                var12_21 = a.get(eua.t).getAsBoolean();
                                            }
                                            var3_4.J(var12_21);
                                            if (ES.fromType((eS)var11_20) == ES.ARMS) {
                                                v6 = var11_20;
                                                var3_4.J((Hs)new bU());
                                                break block71;
                                            } else {
                                                if (ES.fromType((eS)var11_20) != ES.LEGS) break;
                                                v6 = var11_20;
                                                var3_4.J((Hs)new Ru());
                                            }
                                            break block71;
                                        }
                                        case 1: {
                                            if (!a.has(JQa.u)) {
                                                throw new RuntimeException(new StringBuilder().insert(3 & 4, sSa.n).append(var6_10).append(KSa.t).toString());
                                            }
                                            if (!a.has(Psa.b)) {
                                                throw new RuntimeException(new StringBuilder().insert(2 & 5, sSa.n).append(var6_10).append(Bta.l).toString());
                                            }
                                            v7 = a;
                                            var3_4 = v7.get(JQa.u).getAsString();
                                            var12_22 = v7.get(Psa.b).getAsString();
                                            var13_31 = v7.has(EQa.Ga) != false ? a.get(EQa.Ga).getAsString() : Zra.j;
                                            var14_32 = a.has(WOa.z) != false ? a.get(WOa.z).getAsString() : null;
                                            var15_33 = a.has(vPa.V) != false ? a.get(vPa.V).getAsString() : null;
                                            var7_11 = new BedrockPlayerPet((String)var3_4, var12_22, (String)var13_31, (String)var14_32, var15_33);
                                            v6 = var11_20;
                                            break block71;
                                        }
                                        case 2: {
                                            var3_4 = new ImageShadow(var8_12);
                                            if (a.has(Rua.C)) {
                                                var3_4.f(a.get(Rua.C).getAsFloat());
                                            }
                                            if (a.has(eua.t)) {
                                                var3_4.J(a.get(eua.t).getAsFloat());
                                            }
                                            var7_11 = var3_4;
                                            v6 = var11_20;
                                            break block71;
                                        }
                                        case 3: {
                                            var3_4 = new ImageArrowTrail(var8_12);
                                            if (a.has(Rua.C)) {
                                                var3_4.J(a.get(Rua.C).getAsFloat());
                                            }
                                            var7_11 = var3_4;
                                            v6 = var11_20;
                                            break block71;
                                        }
                                        case 4: {
                                            var7_11 = new ImageArmorLayer(a.get(DPa.w).getAsString(), a.get(fta.r).getAsString());
                                            v6 = var11_20;
                                            break block71;
                                        }
                                        case 5: {
                                            var3_4 = a.has(ATa.g) != false ? a.get(ATa.g).getAsString() : null;
                                            var12_23 = a.has(ITa.r) != false ? a.get(ITa.r).getAsString() : null;
                                            var13_31 = a.has(eua.j) != false ? a.get(eua.j).getAsString() : null;
                                            var14_32 = a.has(Bpa.R) != false ? a.get(Bpa.R).getAsString() : null;
                                            var15_33 = a.has(rQa.M) != false ? a.get(rQa.M).getAsString() : null;
                                            var16_34 = a.has(xSa.L) != false ? a.get(xSa.L).getAsString() : null;
                                            var17_36 = a.has(dQa.Ka) != false ? a.get(dQa.Ka).getAsString() : null;
                                            var18_37 = a.has(uSa.Ja) != false ? a.get(uSa.Ja).getAsString() : null;
                                            var19_38 = uSa.E;
                                            if (a.has(eua.t)) {
                                                var19_38 = a.get(eua.t).getAsBoolean();
                                            }
                                            var7_11 = new BedrockArmorLayer3D((String)var3_4, var12_23, (String)var13_31, (String)var14_32, var15_33, var16_34, var17_36, var18_37, var19_38);
                                            v6 = var11_20;
                                            break block71;
                                        }
                                        case 6: {
                                            var7_11 = BS_2.JAVA_MODELS.get(var4_8);
                                            if (var7_11 != null) break;
                                            throw new RuntimeException(new StringBuilder().insert(5 >> 3, Zpa.w).append(var6_10).toString());
                                        }
                                        case 7: {
                                            var7_11 = null;
                                            v6 = var11_20;
                                            break block71;
                                        }
                                        default: {
                                            throw new RuntimeException(new StringBuilder().insert(3 & 4, gQa.D).append(var6_10).toString());
                                        }
                                    }
                                    v6 = var11_20;
                                }
                                if (!v6.isEmote()) break block72;
                                if (a.has(QSa.m)) break;
                                v0 = var9_2;
                            }
                            v8 = var1_3 = new MiniDotEmote(var4_8, var11_20, a.get(QSa.m).getAsString(), var7_11);
                            break block76;
                        }
                        v8 = var1_3 = new MiniDotItem(var4_8, var11_20, var7_11);
                    }
                    v8.name = var5_9;
                    if (!(var1_3 instanceof MiniDotEmote)) break block77;
                    var10_15 = (MiniDotEmote)var1_3;
                    try {
                        v9 = var10_15;
                        if (a.has(TOa.v)) {
                            v9.J(JC.J(a.get(TOa.v).getAsInt()));
                        } else {
                            v9.J(a.get(bpa.V).getAsInt());
                        }
                    }
                    catch (Exception var3_5) {
                        // empty catch block
                    }
                    try {
                        var10_15.J(a.get(vpa.Ga).getAsBoolean());
                        v10 = var10_15;
                        ** GOTO lbl174
                    }
                    catch (Exception var3_6) {
                        try {
                            v10 = var10_15;
lbl174:
                            // 2 sources

                            v10.J(a.get(TOa.Ha).getAsDouble());
                        }
                        catch (Exception var3_7) {
                            v11 = a;
                            break block74;
                        }
                    }
                    v11 = a;
                }
                if (v11.has(RQa.H) && a.get(RQa.H).isJsonArray()) {
                    var3_4 = a.get(RQa.H).getAsJsonArray();
                    v12 = var3_4.iterator();
                    while (v12.hasNext()) {
                        var13_31 = var12_24.next();
                        v12 = var12_24;
                        var10_15.C().add(var13_31.getAsString());
                    }
                }
                if (a.has(WRa.w) && a.get(WRa.w).isJsonArray()) {
                    var3_4 = a.get(WRa.w).getAsJsonArray();
                    v13 = var3_4.iterator();
                    while (v13.hasNext()) {
                        var13_31 = var12_25.next();
                        v13 = var12_25;
                        var10_15.J(var13_31.getAsString());
                    }
                }
                if (a.has(IPa.k) && a.get(IPa.k).isJsonArray()) {
                    var3_4 = a.get(IPa.k).getAsJsonArray();
                    v14 = var3_4.iterator();
                    while (v14.hasNext()) {
                        var13_31 = var12_26.next();
                        if (!var13_31.isJsonObject()) {
                            v14 = var12_26;
                            continue;
                        }
                        var14_32 = var13_31.getAsJsonObject();
                        var15_33 = var14_32.get(NQa.I).getAsString();
                        var16_35 = var14_32.get(bqa.D).getAsInt();
                        v14 = var12_26;
                        var10_15.J(var15_33, var16_35);
                    }
                }
            }
            if (a.has(oua.D) && a.get(oua.D).isJsonArray()) {
                var10_16 = a.get(oua.D).getAsJsonArray();
                var3_4 = new zs(var8_12, var10_16);
                var1_3.options.J((eC)var3_4);
                var3_4.J(BQa.la);
            }
            if (Objects.requireNonNull(var1_3.type) == eS.PET) {
                var1_3.options.J((eC)new lu(hra.x, iSa.W, ZRa.r, aSa.V, fqa.W));
            }
            if (Objects.equals(var1_3.name, sqa.o) || var1_3.id == uqa.Y) {
                var1_3.options.J((eC)new lu(sqa.b, wsa.Q, ZRa.r, aSa.V, fqa.W));
            }
            if (Objects.equals(var1_3.name, STa.L) || var1_3.id == PQa.E) {
                var1_3.options.J((eC)new lu(sqa.b, wsa.Q, ZRa.r, aSa.V, fqa.W));
            }
            try {
                var1_3.status = YT.valueOf(a.get(zTa.Ga).getAsString().toUpperCase());
                v15 = var1_3;
            }
            catch (Exception var10_17) {
                v15 = var1_3;
                var1_3.status = YT.ARCHIVED;
            }
            if (v15.status == YT.CHEST_ONLY) {
                var10_18 = a.get(Ata.Aa);
                if (var10_18 != null && var10_18.isJsonPrimitive()) {
                    var3_4 = var10_18.getAsString();
                    var12_27 = var3_4.length();
                    if (var12_27 != vRa.d) {
                        throw new RuntimeException(new StringBuilder().insert(3 >> 2, Tqa.k).append(var12_27).append(oqa.I).append(var6_10).append(WQa.D).toString());
                    }
                    var1_3.chestTexture = Character.valueOf(var3_4.charAt(uSa.E));
                }
                if ((var3_4 = a.get(wOa.Y)) != null && var3_4.isJsonPrimitive()) {
                    var1_3.chestName = var3_4.getAsString();
                }
            }
            try {
                var10_13 = a.get(hTa.la).getAsJsonObject();
                var3_4 = null;
                if (var10_13.has(Pqa.M)) {
                    var3_4 = ConfigurationService.J(PresetsConfiguration.class).J(var10_13.get(Pqa.M).getAsString());
                }
                var12_28 = vRa.d;
                if (var10_13.has(Qqa.Ka)) {
                    var12_28 = var10_13.get(Qqa.Ka).getAsBoolean();
                }
                var1_3.preview = new sS((VT)var3_4, var12_28);
                v16 = a;
            }
            catch (Exception var10_19) {
                v16 = a;
            }
            var10_13 = v16.get(ITa.la);
            if (var10_13 != null) {
                var1_3.description = new ArrayList<String>();
                v17 = var10_13.getAsJsonArray().iterator();
                while (v17.hasNext()) {
                    var12_29 = (JsonElement)var3_4.next();
                    v17 = var3_4;
                    var1_3.description.add(var12_29.getAsString());
                }
            }
            if ((var10_13 = a.get(cPa.F)) != null) {
                var1_3.creators = new ArrayList<String>();
                v18 /* !! */  = var10_13.getAsJsonArray().iterator();
                while (v18 /* !! */ .hasNext()) {
                    var12_30 = (JsonElement)var3_4.next();
                    v18 /* !! */  = var3_4;
                    var1_3.creators.add(var12_30.getAsString());
                }
            }
            if ((var10_13 = a.get(lqa.J)) != null) {
                var1_3.collection = EU.valueOf((String)var10_13.getAsString());
            }
            v19 = var1_3;
            v20 = a;
            v21 = var1_3;
            v22 = a;
            v23 = var1_3;
            v24 = a;
            v25 = var1_3;
            v26 = a;
            v27 = var1_3;
            v28 = a;
            var1_3.isNew = BS_2.J((JsonObject)a, Ssa.ha, (boolean)uSa.E);
            var1_3.isUpdated = BS_2.J((JsonObject)v28, Fpa.E, (boolean)uSa.E);
            v27.hideWithHelmet = BS_2.J((JsonObject)v28, Gta.J, (boolean)uSa.E);
            v27.hideWithChestplate = BS_2.J((JsonObject)a, psa.Ka, (boolean)uSa.E);
            var1_3.hideCape = BS_2.J((JsonObject)v26, pua.u, (boolean)uSa.E);
            v25.hideWithLeggings = BS_2.J((JsonObject)v26, bRa.d, (boolean)uSa.E);
            v25.hideWithBoots = BS_2.J((JsonObject)a, WPa.p, (boolean)uSa.E);
            var1_3.replaceHead = BS_2.J((JsonObject)v24, lPa.E, (boolean)uSa.E);
            v23.hideHead = BS_2.J((JsonObject)v24, ura.Q, (boolean)uSa.E);
            v23.replaceBody = BS_2.J((JsonObject)a, psa.a, (boolean)uSa.E);
            var1_3.hideBodyWear = BS_2.J((JsonObject)v22, Usa.Ka, (boolean)uSa.E);
            v21.replaceLeftArm = BS_2.J((JsonObject)v22, uOa.a, (boolean)uSa.E);
            v21.replaceRightArm = BS_2.J((JsonObject)a, TOa.E, (boolean)uSa.E);
            v19.replaceLeftLeg = BS_2.J((JsonObject)v20, LPa.D, (boolean)uSa.E);
            v19.replaceRightLeg = BS_2.J((JsonObject)v20, fta.b, (boolean)uSa.E);
        } while (BS_2.ITEMS.put(var4_8, (MiniDotItem)var1_3) == null);
        throw new RuntimeException(new StringBuilder().insert(2 & 5, uua.j).append(var4_8).toString());
    }

    static {
        ITEMS = new HashMap<Integer, MiniDotItem>();
        autoId = fPa.Z;
        JAVA_MODELS = new HashMap<Integer, MDModel>();
        BY_TYPE_CACHE = new EnumMap<eS, List<MiniDotItem>>(eS.class);
    }

    public static /* synthetic */ int J(MiniDotItem miniDotItem, MiniDotItem miniDotItem2) {
        MiniDotItem b2 = miniDotItem2;
        MiniDotItem a2 = miniDotItem;
        if (a2.collection != b2.collection) {
            return a2.collection.ordinal() - b2.collection.ordinal();
        }
        return b2.id - a2.id;
    }

    private static void J(int n2, MDModel mDModel) {
        MDModel b2 = mDModel;
        int a2 = n2;
        JAVA_MODELS.put(a2, b2);
    }

    /*
     * Exception decompiling
     */
    private static void J() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK], 1[TRYBLOCK]], but top level block is 24[WHILELOOP]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * WARNING - void declaration
     */
    private static boolean J(JsonObject jsonObject, String string, boolean bl) {
        void a2;
        Object c2 = string;
        JsonObject b2 = jsonObject;
        if ((c2 = b2.get((String)c2)) != null) {
            return ((JsonElement)c2).getAsBoolean();
        }
        return (boolean)a2;
    }

    public static /* synthetic */ List J(eS eS2, eS eS3) {
        eS eS4 = eS2;
        ArrayList<MiniDotItem> a2 = new ArrayList<MiniDotItem>();
        for (MiniDotItem miniDotItem : ITEMS.values()) {
            if (miniDotItem.type != eS4) continue;
            a2.add(miniDotItem);
        }
        ArrayList<MiniDotItem> arrayList = a2;
        arrayList.sort(Eu.J());
        return arrayList;
    }

    public static List<MiniDotItem> J(eS a2) {
        eS eS2 = a2;
        return BY_TYPE_CACHE.computeIfAbsent(eS2, SS.J(eS2));
    }
}

