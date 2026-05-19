/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Apa
 *  CQa
 *  FTa
 *  Fpa
 *  Fqa
 *  Fra
 *  GQa
 *  Gqa
 *  Hpa
 *  MPa
 *  MQa
 *  Mra
 *  OQa
 *  Opa
 *  Sqa
 *  TPa
 *  UPa
 *  Usa
 *  Vpa
 *  Vqa
 *  WB
 *  WSa
 *  Xqa
 *  Yra
 *  asa
 *  bQa
 *  cpa
 *  dPa
 *  dQa
 *  dRa
 *  eRa
 *  eqa
 *  era
 *  fRa
 *  jPa
 *  lPa
 *  lpa
 *  lra
 *  nra
 *  pra
 *  pua
 *  qra
 *  tPa
 *  uA
 *  vRa
 *  wQa
 */
import com.google.protobuf.ByteString;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class nra_1 {
    public int l;
    public final Map<Integer, Long> e;
    private boolean G;
    private boolean D;
    private final AtomicBoolean f;
    public ScheduledFuture<?> F;
    public ScheduledExecutorService g;
    public ScheduledFuture<?> L;
    private boolean E;
    private final String m;
    private final Map<String, jPa> C;
    public int i;
    private final int M;
    private final WB k;
    private static final Logger j = LogManager.getLogger();
    private final uA J;
    private long A;
    public long I;

    public static /* synthetic */ void l(nra nra2) {
        nra nra3 = nra2;
        try {
            nra3.k.J(Apa.J((nra)nra3));
            return;
        }
        catch (Throwable a2) {
            a2.printStackTrace();
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    public nra_1(WB wB2, uA uA2, String string) {
        void b2;
        void c2;
        String d2 = string;
        nra_1 a2 = this;
        a2((WB)c2, (uA)b2, d2, pua.o);
    }

    private void C() {
        nra_1 a2;
        a2.F = a2.g.scheduleAtFixedRate(Hpa.J((nra)a2), nqa.i, Yra.t, TimeUnit.SECONDS);
    }

    public void f(int n2) {
        int a2;
        nra_1 nra_12 = this;
        nra_12.e.remove(a2);
        void b2 = a2 - nra_12.i;
        if (b2 < 0) {
            return;
        }
        nra_12.i = a2;
        if (b2 == false) {
            nra_12.i += vRa.d;
            return;
        }
        if (b2 == vRa.d) {
            return;
        }
        if (b2 > tTa.h) {
            nra_12.C();
            return;
        }
        long l2 = System.currentTimeMillis();
        int n3 = a2 = vRa.d;
        while (n3 < b2) {
            nra_1 nra_13 = nra_12;
            Integer n4 = nra_13.i - a2;
            nra_13.e.put(n4, l2);
            n3 = ++a2;
        }
    }

    public static /* synthetic */ void f(Runnable runnable) {
        Runnable runnable2 = runnable;
        try {
            runnable2.run();
            return;
        }
        catch (Throwable a2) {
            j.warn(dsa.Q, a2);
            return;
        }
    }

    public Vqa J() {
        nra_1 a2;
        if (a2.I == fqa.Da) {
            if (a2.L == null) {
                return Vqa.IDLE;
            }
            return Vqa.CONNECTING;
        }
        if (a2.L == null) {
            return Vqa.CONNECTED;
        }
        return Vqa.RECONNECT;
    }

    public void l() {
        nra_1 a2;
        j.warn(kra.z);
        if (a2.f.get()) {
            return;
        }
        nra_1 nra_12 = a2;
        nra_12.f.set(vRa.d != 0);
        nra_12.J(lpa.J((nra)nra_12));
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(nra object, int n2, long l2, byte[] byArray) {
        nra d2;
        void b2;
        void c2;
        nra nra2 = object;
        object = byArray;
        nra a2 = nra2;
        a2.k.J((Gra)Gra.J().setSendAudio((qra)qra.J().setAudioSession((int)c2).setSequenceNumber((long)b2).setData(ByteString.copyFrom((byte[])d2)).build()).build());
    }

    public static /* synthetic */ void f(nra nra2, fRa fRa2) {
        nra b2 = fRa2;
        nra a2 = nra2;
        a2.J((fRa)b2);
    }

    public void l(Duration duration) {
        Duration b2 = duration;
        nra_1 a2 = this;
        long l2 = b2.toMillis();
        a2.g.scheduleAtFixedRate(dPa.J((nra)a2, (long)l2), WSa.Ia, WSa.Ia, TimeUnit.MILLISECONDS);
    }

    /*
     * WARNING - void declaration
     */
    public static nra J(uA uA2, String string, String string2, int n2, byte[] byArray, byte[] byArray2) throws IOException {
        void e2;
        void a2;
        void b2;
        void c2;
        Object f2 = string2;
        uA d2 = uA2;
        f2 = new CQa(new Gqa((String)f2, (int)c2), (byte[])b2, (byte[])a2);
        nra_1 nra_12 = new nra_1((WB)f2, d2, (String)e2, yRa.d);
        nra_12.l(Duration.ofSeconds(Yra.t));
        nra_12.J(Duration.ofMillis(FTa.N));
        nra_12.J(Duration.ofMillis(Hra.m), dQa.c, Duration.ofMillis(asa.fa));
        return nra_12;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ void f(nra nra2, long l2) {
        nra nra3 = nra2;
        try {
            long a2;
            a2 = System.currentTimeMillis() - a2;
            Iterator<Map.Entry<String, jPa>> b2 = nra3.C.entrySet().iterator();
            block4: while (true) {
                Iterator<Map.Entry<String, jPa>> iterator = b2;
                while (iterator.hasNext()) {
                    Map.Entry entry = (Map.Entry)b2.next();
                    jPa jPa2 = (jPa)entry.getValue();
                    int n2 = jPa2.J();
                    if (n2 == pua.o) {
                        iterator = b2;
                        continue;
                    }
                    if (jPa2.f() > a2) {
                        iterator = b2;
                        continue;
                    }
                    jPa2.J(pua.o);
                    nra3.J.J((String)entry.getKey(), n2);
                    continue block4;
                }
                return;
            }
        }
        catch (Throwable a2) {
            j.warn(lPa.u, a2);
        }
    }

    public static /* synthetic */ void f(nra nra2) {
        nra nra3 = nra2;
        try {
            nra3.k.J((Gra)Gra.J().setRequestPlayersData((Xqa)Xqa.J().build()).build());
            return;
        }
        catch (Throwable a2) {
            j.warn(osa.Ha, a2);
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void f(nra nra2, boolean bl, boolean bl2, Duration duration) {
        void b2;
        void c2;
        nra a2;
        Duration d2 = duration;
        nra nra3 = a2 = nra2;
        nra3.k.J((boolean)c2, (boolean)b2);
        a2.L = nra3.g.schedule(era.J((nra)a2, (boolean)c2, (boolean)b2, (Duration)d2), d2.toMillis(), TimeUnit.MILLISECONDS);
    }

    /*
     * WARNING - void declaration
     */
    public void J(boolean bl, boolean bl2) {
        void b2;
        nra_1 a2;
        boolean c2 = bl2;
        nra_1 nra_12 = a2 = this;
        nra_12.J(Tra.J((nra)nra_12, (boolean)b2, c2));
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(nra nra2, boolean bl, boolean bl2) {
        void b2;
        boolean c2 = bl2;
        nra a2 = nra2;
        a2.G = b2;
        a2.E = c2;
        super.f();
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(nra nra2, boolean bl, boolean bl2, Duration duration) {
        nra c2;
        block3: {
            boolean d22 = bl;
            c2 = nra2;
            try {
                void a2;
                void b2;
                if ((c2.l += vRa.d) >= c2.M) break block3;
                c2.J(d22, (boolean)b2, (Duration)a2);
                return;
            }
            catch (Throwable d22) {
                j.warn(Usa.g, d22);
                return;
            }
        }
        c2.J.C();
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void J(fRa fRa2) {
        Object b2 = fRa2;
        nra_1 a2 = this;
        Object[] objectArray = new Object[vRa.d];
        objectArray[uSa.E] = b2.getDataCase().name();
        j.warn(TPa.r, objectArray);
        a2.I = System.currentTimeMillis();
        if (a2.L != null) {
            a2.L.cancel(vRa.d != 0);
            a2.L = null;
            a2.l = uSa.E;
            a2.J.J();
        }
        switch (lra.I[b2.getDataCase().ordinal()]) {
            case 1: {
                Vpa vpa2;
                Vpa vpa3 = vpa2 = b2.getPong();
                a2.A = vpa3.getServerTime() - vpa2.getTime();
                if (vpa3.getRoomState() == a2.i) return;
                a2.C();
                return;
            }
            case 2: {
                nra_1 nra_12 = a2;
                nra_12.k.J();
                nra_12.J.f();
                return;
            }
            case 3: {
                nra_1 nra_13 = a2;
                nra_1 nra_14 = b2;
                nra_13.f(nra_14.getOnePlayerData().getRoomState());
                nra_13.J(nra_14.getOnePlayerData().getData());
                return;
            }
            case 4: {
                Object object;
                Iterator<String> iterator;
                bQa bQa2 = b2.getPlayerListData();
                nra_1 nra_15 = a2;
                nra_15.i = bQa2.getRoomState();
                nra_15.e.clear();
                if (nra_15.F != null) {
                    a2.F.cancel(uSa.E != 0);
                    a2.F = null;
                }
                Iterator<String> iterator2 = iterator = a2.C.keySet().iterator();
                block12: while (iterator2.hasNext()) {
                    object = iterator.next();
                    if (((String)object).equals(a2.m)) {
                        iterator2 = iterator;
                        continue;
                    }
                    for (eqa eqa2 : bQa2.getDataList()) {
                        if (!eqa2.getPlayer().equals(object)) continue;
                        iterator2 = iterator;
                        continue block12;
                    }
                    iterator2 = iterator;
                    iterator.remove();
                    a2.J.J((String)object);
                }
                object = bQa2.getDataList().iterator();
                block14: while (true) {
                    Object object2 = object;
                    while (object2.hasNext()) {
                        eqa eqa3 = (eqa)object.next();
                        if (eqa3.getPlayer().equals(a2.m)) {
                            if (a2.D != eqa3.getMuted()) {
                                a2.D = eqa3.getMuted();
                                a2.J.J(a2.D);
                            }
                            if (a2.G == eqa3.getMicroExists() && a2.E == eqa3.getMicroDisabled()) continue block14;
                            a2.f();
                            object2 = object;
                            continue;
                        }
                        a2.J(eqa3);
                        object2 = object;
                    }
                    return;
                }
            }
            case 5: {
                a2.f(b2.getUpdateMuted().getRoomState());
                a2.D = b2.getUpdateMuted().getMuted();
                a2.J.J(a2.D);
                return;
            }
            case 6: {
                a2.J(b2.getAudio());
                return;
            }
            case 7: {
                Mra mra2 = b2.getAudioEnd();
                jPa jPa2 = a2.C.get(mra2.getPlayer());
                if (jPa2 == null) return;
                if (jPa2.J() != mra2.getAudioSession()) {
                    return;
                }
                jPa2.J(pua.o);
                a2.J.J(mra2.getPlayer(), mra2.getAudioSession());
                return;
            }
            case 8: {
                nra_1 nra_16 = a2;
                nra_1 nra_17 = b2;
                nra_16.f(nra_17.getDisconnectPlayer().getRoomState());
                String string = nra_17.getDisconnectPlayer().getPlayer();
                if (nra_16.C.remove(string) == null) return;
                a2.J.J(string);
                return;
            }
            case 9: {
                Object object = b2 = b2.getAudioDataBatch().getDataList().iterator();
                while (object.hasNext()) {
                    Dra dra = (Dra)b2.next();
                    object = b2;
                    a2.J(dra);
                }
                return;
            }
            case 10: {
                a2.l();
                return;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, long l2, byte[] byArray) {
        Object d2;
        void b2;
        void c2;
        nra_1 a2;
        nra_1 nra_12 = object;
        Object object = byArray;
        nra_1 nra_13 = a2 = nra_12;
        nra_13.J(eRa.J((nra)nra_13, (int)c2, (long)b2, (byte[])d2));
    }

    private void J(Runnable runnable) {
        Runnable b2 = runnable;
        nra_1 a2 = this;
        a2.g.execute(MPa.J((Runnable)b2));
    }

    public Map<String, jPa> J() {
        nra_1 a2;
        return a2.C;
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(nra nra2, long l2, Duration duration) {
        nra a2;
        block5: {
            void b2;
            Object c2 = duration;
            a2 = nra2;
            if (b2 == fqa.Da || a2.I == fqa.Da || a2.I + b2 >= System.currentTimeMillis()) break block5;
            if (a2.L == null) {
                nra nra3 = a2;
                nra3.J(a2.G, nra3.E, (Duration)c2);
            }
            return;
        }
        try {
            if (a2.I != fqa.Da) {
                a2.k.J((Gra)Gra.J().setPing((Opa)Opa.J().setTime(System.currentTimeMillis()).build()).build());
                return;
            }
        }
        catch (Throwable c2) {
            j.warn(kTa.H, c2);
        }
    }

    public static /* synthetic */ void J(nra nra2, int n2) {
        int b2 = n2;
        nra a2 = nra2;
        a2.k.J((Gra)Gra.J().setSendAudioEnd((Fra)Fra.J().setAudioSession(b2).build()).build());
    }

    public long J() {
        nra_1 a2;
        return a2.A;
    }

    /*
     * WARNING - void declaration
     */
    private void J(Dra dra) {
        void a2;
        nra_1 nra_12 = this;
        nra_1 b2 = nra_12.C.get(a2.getPlayer());
        void v0 = a2;
        int n2 = v0.getAudioSession();
        long l2 = v0.getSequenceNumber();
        j.warn(new StringBuilder().insert(3 >> 2, KPa.D).append(b2 == null ? SPa.V : b2.J() + Mqa.y).append(Era.Aa).append(b2 == null ? SPa.V : b2.J() + Mqa.y).append(GPa.p).append(n2).append(Era.Aa).append(l2).append(Fpa.Fa).append(a2.getPlayer()).toString());
        if (b2 == null) {
            b2 = new jPa(new Fqa(vRa.d != 0, uSa.E != 0, uSa.E != 0), n2, l2 - dQa.Ga, nqa.i);
            nra_12.C.put(a2.getPlayer(), (jPa)b2);
            nra_12.J.J(a2.getPlayer(), b2.J());
        }
        if (n2 < b2.J()) {
            return;
        }
        if (n2 == b2.J()) {
            if (l2 <= b2.J()) {
                return;
            }
            b2.J(l2);
        }
        if (n2 > b2.J()) {
            nra_1 nra_13 = b2;
            nra_13.J(n2);
            nra_13.J(l2);
        }
        b2.f(System.currentTimeMillis());
        nra_12.J.J(a2.getPlayer(), n2, l2, a2.getData().toByteArray());
    }

    public boolean l() {
        nra_1 a2;
        return a2.D;
    }

    public void J(int n2) {
        nra_1 a2;
        int b2 = n2;
        nra_1 nra_12 = a2 = this;
        nra_12.J(tPa.J((nra)nra_12, (int)b2));
    }

    /*
     * WARNING - void declaration
     */
    public void J(boolean bl, boolean bl2, Duration duration) {
        void b2;
        void c2;
        nra_1 a2;
        Duration d2 = duration;
        nra_1 nra_12 = a2 = this;
        nra_12.J(GQa.J((nra)nra_12, (boolean)c2, (boolean)b2, (Duration)d2));
    }

    /*
     * WARNING - void declaration
     */
    public nra_1(WB wB2, uA uA2, String string, int n2) {
        void e2;
        void b2;
        void c2;
        void d2;
        nra_1 a2;
        int n3 = n2;
        nra_1 nra_12 = a2 = this;
        nra_1 nra_13 = a2;
        a2.g = Executors.newSingleThreadScheduledExecutor();
        nra_1 nra_14 = a2;
        nra_14.C = new HashMap<String, jPa>();
        a2.f = new AtomicBoolean();
        a2.A = fqa.Da;
        a2.l = uSa.E;
        a2.i = uSa.E;
        a2.I = fqa.Da;
        a2.e = new HashMap<Integer, Long>();
        nra_13.k = d2;
        nra_13.J = c2;
        nra_12.m = b2;
        nra_12.M = e2;
    }

    public boolean f() {
        nra_1 a2;
        return a2.G;
    }

    private void f() {
        nra_1 a2;
        nra_1 nra_12 = a2;
        nra_12.i += vRa.d;
        nra_12.k.J((Gra)Gra.J().setUpdateMicro((cpa)cpa.J().setMicroExists(a2.G).setMicroDisabled(a2.E).build()).build());
    }

    public void f(Duration duration) {
        Duration b2 = duration;
        nra_1 a2 = this;
        a2.J(b2, fqa.Da, Duration.ZERO);
    }

    public boolean J() {
        nra_1 a2;
        return a2.E;
    }

    public static /* synthetic */ void J(nra a2) {
        a2.k.J((Gra)Gra.J().setDisconnect((OQa)OQa.J().build()).build());
        nra nra2 = a2;
        nra2.k.J();
        nra2.J.l();
        j.warn(sOa.U);
        nra2.g.shutdown();
        j.warn(Sqa.Ka);
    }

    /*
     * WARNING - void declaration
     */
    private void J(eqa eqa2) {
        void a2;
        nra_1 nra_12 = this;
        nra_1 b2 = nra_12.C.get(a2.getPlayer());
        Fqa fqa2 = new Fqa(a2.getMicroExists(), a2.getMicroDisabled(), a2.getMuted());
        if (b2 == null) {
            b2 = new jPa();
            b2.J(fqa2);
            nra_12.C.put(a2.getPlayer(), (jPa)b2);
            nra_12.J.J(a2.getPlayer(), fqa2);
            return;
        }
        Fqa fqa3 = b2.J();
        if (fqa2.equals((Object)fqa3)) {
            return;
        }
        b2.J(fqa2);
        nra_12.J.J(a2.getPlayer(), fqa3, fqa2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ void J(nra nra2, long l2) {
        nra nra3 = nra2;
        try {
            long a2;
            a2 = System.currentTimeMillis() - a2;
            Iterator<Long> b2 = nra3.e.values().iterator();
            Iterator<Long> iterator = b2;
            while (iterator.hasNext()) {
                if ((Long)b2.next() > a2) {
                    iterator = b2;
                    continue;
                }
                nra nra4 = nra3;
                nra4.e.clear();
                super.C();
                return;
            }
            return;
        }
        catch (Throwable a2) {
            j.warn(rQa.Ja, a2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(Duration duration, long l2, Duration duration2) {
        void a2;
        void b2;
        Duration d2 = duration;
        nra_1 c2 = this;
        c2.g.scheduleAtFixedRate(wQa.J((nra)c2, (long)b2, (Duration)a2), d2.toMillis(), d2.toMillis(), TimeUnit.MILLISECONDS);
    }

    public void J(Duration duration) {
        Duration b2 = duration;
        nra_1 a2 = this;
        long l2 = b2.toMillis();
        a2.g.scheduleAtFixedRate(dRa.J((nra)a2, (long)l2), MQa.r, MQa.r, TimeUnit.MILLISECONDS);
    }

    public void J() {
        nra_1 a2;
        nra_1 nra_12 = a2;
        nra_12.J(UPa.J((nra)nra_12));
    }

    public static /* synthetic */ void J(nra nra2, fRa fRa2) {
        nra a2;
        nra b2 = fRa2;
        nra nra3 = a2 = nra2;
        super.J(pra.J((nra)nra3, (fRa)b2));
    }
}

