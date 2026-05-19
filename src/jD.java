/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BS
 *  Cra
 *  Epa
 *  KTa
 *  Kpa
 *  Lqa
 *  U
 *  UF
 *  Uf
 *  Uqa
 *  WSa
 *  aD
 *  dQa
 *  fF
 *  fsa
 *  jE
 *  mF
 *  pf
 *  qta
 *  rf
 *  ue
 *  vRa
 *  wF
 *  xE
 *  yE
 *  zU
 */
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.MiniDotItem;
import optifine.Config;
import ru.vimeworld.minidot.emotes.MiniDotEmote;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class jD {
    private final Map<String, fF> m;
    private final U C;
    private static final jD i;
    public static boolean M;
    private final Map<String, mF> k;
    public static final /* synthetic */ boolean j;
    private Map<String, ue> J;
    private final Gson A;
    public static long I;

    static {
        j = !jD.class.desiredAssertionStatus() ? vRa.d : uSa.E;
        M = uSa.E;
        I = nqa.i;
        i = new jD();
    }

    /*
     * WARNING - void declaration
     */
    private aD J(String string, String string2) {
        void a2;
        void b2;
        jD jD2 = this;
        try {
            jD jD3 = jD2;
            return jD3.A.fromJson(Config.J(jD3.C.J(new ResourceLocation(Cra.V, new StringBuilder().insert(3 & 4, QTa.fa).append((String)b2).append(WSa.f).append((String)a2).append(Epa.k).toString())).J()), aD.class);
        }
        catch (Exception c2) {
            Object[] objectArray = new Object[yRa.d];
            objectArray[uSa.E] = b2;
            objectArray[vRa.d] = a2;
            objectArray[uqa.g] = c2;
            zU.L.error(kTa.n, objectArray);
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void J(String string, String string2, rf rf2) {
        aD b2;
        void c2;
        jD d2 = rf2;
        jD a2 = this;
        d2 = new fF((String)c2, (rf)d2);
        a2.m.put((String)c2, d2.J());
        jD jD2 = a2;
        void v1 = b2;
        b2 = jD2.J((String)v1, (String)v1);
        jD2.k.put((String)c2, new mF(b2, dQa.Ga));
    }

    public static jD J() {
        return i;
    }

    public fF J(String string) {
        String b2 = string;
        jD a2 = this;
        return a2.m.get(b2);
    }

    public jD() {
        jD a2;
        jD jD2 = a2;
        a2.J = new HashMap<String, ue>();
        jD2.m = new HashMap<String, fF>();
        a2.k = new HashMap<String, mF>();
        a2.C = Kpa.J().J();
        a2.A = new GsonBuilder().registerTypeAdapter((Type)((Object)sf.class), new pf()).registerTypeAdapter((Type)((Object)aD.class), new KD()).registerTypeAdapter((Type)((Object)jE.class), new yE()).registerTypeAdapter((Type)((Object)Uf.class), new UF()).registerTypeAdapter((Type)((Object)CE.class), new wF()).create();
    }

    public void f() {
        jD jD2 = this;
        if (M) {
            return;
        }
        try {
            jD jD3 = jD2;
            rf rf2 = jD3.f(ATa.Y);
            rf rf3 = jD3.f(Uqa.A);
            jD a2 = jD3.f(oua.F);
            if (!j && rf3 == null) {
                throw new AssertionError();
            }
            if (!j && a2 == null) {
                throw new AssertionError();
            }
            if (!j && rf2 == null) {
                throw new AssertionError();
            }
            jD jD4 = jD2;
            rf rf4 = rf2;
            jD2.J();
            jD jD5 = jD2;
            rf3.J(jD5.J);
            a2.J(jD5.J);
            xE.J((rf)rf3, (rf)rf4);
            xE.J((rf)a2, (rf)rf4);
            jD4.J(BQa.la, fsa.G, rf3);
            jD4.J(qta.K, Epa.E, (rf)a2);
            M = vRa.d;
            return;
        }
        catch (Exception exception) {
            zU.L.error(iSa.o, (Throwable)exception);
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    private rf f(String string) {
        void a2;
        jD jD2 = this;
        try {
            return xE.J((InputStream)jD2.C.J(new ResourceLocation(Cra.V, new StringBuilder().insert(3 >> 2, QTa.fa).append((String)a2).append(KTa.E).toString())).J());
        }
        catch (Exception b2) {
            Object[] objectArray = new Object[uqa.g];
            objectArray[uSa.E] = a2;
            objectArray[vRa.d] = b2;
            zU.L.error(oQa.a, objectArray);
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void J() {
        jD jD2 = this;
        try {
            jD2.J = new HashMap<String, ue>();
            Iterator iterator = BS.ITEMS.values().iterator();
            block6: while (true) {
                Iterator iterator2 = iterator;
                while (iterator2.hasNext()) {
                    Object a2 = (MiniDotItem)iterator.next();
                    if (!(a2 instanceof MiniDotEmote)) {
                        iterator2 = iterator;
                        continue;
                    }
                    if (((MiniDotEmote)(a2 = (MiniDotEmote)a2)).J() != null) {
                        iterator2 = iterator;
                        continue;
                    }
                    try {
                        rf rf2 = Objects.requireNonNull(jD2.J(((MiniDotEmote)a2).f()));
                        ue ue2 = (ue)rf2.J().get(((MiniDotEmote)a2).f());
                        if (ue2 != null) {
                            jD2.J.put(new StringBuilder().insert(3 & 4, nOa.T).append(((MiniDotEmote)a2).f()).toString(), ue2);
                            continue block6;
                        }
                        Object[] objectArray = new Object[uqa.g];
                        objectArray[uSa.E] = ((MiniDotEmote)a2).f();
                        objectArray[vRa.d] = ((MiniDotEmote)a2).name;
                        zU.L.error(AQa.Z, objectArray);
                    }
                    catch (Exception exception) {
                        Object[] objectArray = new Object[uqa.g];
                        objectArray[uSa.E] = ((MiniDotEmote)a2).name;
                        objectArray[vRa.d] = exception;
                        zU.L.error(pta.D, objectArray);
                    }
                    continue block6;
                }
                return;
            }
        }
        catch (Exception exception) {
            zU.L.error(wsa.ja, (Throwable)exception);
        }
    }

    /*
     * WARNING - void declaration
     */
    private rf J(String string) {
        void a2;
        jD jD2 = this;
        try {
            return xE.J((InputStream)Kpa.J().J().J(new ResourceLocation(Cra.V, new StringBuilder().insert(5 >> 3, Asa.v).append((String)a2).append(Pua.Q).toString())).J());
        }
        catch (Exception b2) {
            Object[] objectArray = new Object[uqa.g];
            objectArray[uSa.E] = a2;
            objectArray[vRa.d] = b2;
            zU.L.error(Lqa.u, objectArray);
            return null;
        }
    }

    public mF J(String string) {
        String b2 = string;
        jD a2 = this;
        return a2.k.get(b2);
    }
}

