/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EAa
 *  LQa
 *  RCa
 *  Zta
 *  kqa
 *  pua
 *  rca
 *  vRa
 *  wBa
 *  wPa
 *  zca
 */
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import org.apache.logging.log4j.LogManager;

public class wBa_1
extends Enum<wBa> {
    public static final /* enum */ wBa STATUS;
    private static final Map<Class<? extends KC>, wBa> STATES_BY_CLASS;
    private static int field_181137_f;
    public static final /* enum */ wBa HANDSHAKING;
    public static final /* enum */ wBa LOGIN;
    private static final wBa[] STATES_BY_ID;
    private static int field_181136_e;
    public static final /* enum */ wBa PLAY;
    private final int id;
    private static final /* synthetic */ wBa[] $VALUES;
    private final Map<RCa, BiMap<Integer, Class<? extends KC>>> directionMaps;

    /*
     * WARNING - void declaration
     */
    public /* synthetic */ wBa_1(String string, int n2, int n3, zca zca2) {
        void c2;
        void d2;
        int e2 = n3;
        wBa_1 b2 = this;
        b2(e2);
    }

    public static wBa getById(int a2) {
        if (a2 >= field_181136_e && a2 <= field_181137_f) {
            return STATES_BY_ID[a2 - field_181136_e];
        }
        return null;
    }

    public static wBa getFromPacket(KC a2) {
        return (wBa_1)STATES_BY_CLASS.get(a2.getClass());
    }

    /*
     * WARNING - void declaration
     */
    public Integer getPacketId(RCa rCa2, KC kC2) {
        void b2;
        KC c2 = kC2;
        wBa_1 a2 = this;
        return (Integer)a2.directionMaps.get(b2).inverse().get(c2.getClass());
    }

    private wBa_1(int n3) {
        wBa_1 a2;
        int b2 = n3;
        wBa_1 wBa_12 = a2 = this;
        wBa_12.directionMaps = Maps.newEnumMap(RCa.class);
        wBa_12.id = b2;
    }

    /*
     * WARNING - void declaration
     */
    public wBa registerPacket(RCa rCa2, Class<? extends KC> clazz) {
        void a2;
        String b2;
        wBa_1 wBa_12 = this;
        Object c2 = wBa_12.directionMaps.get(b2);
        if (c2 == null) {
            c2 = HashBiMap.create();
            wBa_12.directionMaps.put((RCa)b2, (BiMap<Integer, Class<? extends KC>>)c2);
        }
        if (c2.containsValue(a2)) {
            b2 = b2 + LQa.ga + a2 + Vra.h + c2.inverse().get(a2);
            LogManager.getLogger().fatal(b2);
            throw new IllegalArgumentException(b2);
        }
        Object object = c2;
        object.put(object.size(), a2);
        return wBa_12;
    }

    public static wBa valueOf(String a2) {
        return Enum.valueOf(wBa_1.class, a2);
    }

    public static wBa[] values() {
        return (wBa[])$VALUES.clone();
    }

    public int getId() {
        wBa_1 a2;
        return a2.id;
    }

    /*
     * WARNING - void declaration
     */
    public KC getPacket(RCa rCa2, int n2) throws InstantiationException, IllegalAccessException {
        void a2;
        Object c2 = rCa2;
        wBa_1 b2 = this;
        if ((c2 = (Class)b2.directionMaps.get(c2).get((int)a2)) == null) {
            return null;
        }
        return (KC)((Class)c2).newInstance();
    }

    static {
        int n2;
        HANDSHAKING = new zca(DPa.T, uSa.E, pua.o);
        PLAY = new rca(Qpa.b, vRa.d, uSa.E);
        STATUS = new EAa(gua.x, uqa.g, vRa.d);
        LOGIN = new Tba(uqa.g);
        wBa_1[] wBa_1Array = new wBa_1[AQa.P];
        wBa_1Array[uSa.E] = HANDSHAKING;
        wBa_1Array[vRa.d] = PLAY;
        wBa_1Array[uqa.g] = STATUS;
        wBa_1Array[yRa.d] = LOGIN;
        $VALUES = wBa_1Array;
        field_181136_e = pua.o;
        field_181137_f = uqa.g;
        STATES_BY_ID = new wBa_1[field_181137_f - field_181136_e + vRa.d];
        STATES_BY_CLASS = Maps.newHashMap();
        wBa[] wBaArray = wBa_1.values();
        int n3 = wBaArray.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            wBa wBa2 = wBaArray[n2];
            int n5 = wBa2.getId();
            if (n5 < field_181136_e || n5 > field_181137_f) {
                throw new Error(new StringBuilder().insert(3 & 4, Zta.R).append(Integer.toString(n5)).toString());
            }
            wBa_1.STATES_BY_ID[n5 - wBa_1.field_181136_e] = wBa2;
            for (RCa rCa2 : wBa2.directionMaps.keySet()) {
                Iterator<Class<? extends KC>> iterator = wBa2.directionMaps.get(rCa2).values().iterator();
                while (iterator.hasNext()) {
                    Iterator<Class<? extends KC>> object;
                    Class<? extends KC> clazz = object.next();
                    if (STATES_BY_CLASS.containsKey(clazz) && STATES_BY_CLASS.get(clazz) != wBa2) {
                        throw new Error(new StringBuilder().insert(3 ^ 3, nqa.Ga).append(clazz).append(wPa.i).append(STATES_BY_CLASS.get(clazz)).append(kqa.u).append(wBa2).toString());
                    }
                    STATES_BY_CLASS.put(clazz, wBa2);
                    iterator = object;
                }
            }
            n4 = ++n2;
        }
    }
}

