/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bsa
 *  Cia
 *  ISa
 *  Ina
 *  JPa
 *  Oz
 *  PTa
 *  QMa
 *  VQa
 *  YL
 *  Yra
 *  aSa
 *  asa
 *  cMa
 *  cQa
 *  hra
 *  lPa
 *  oNa
 *  pqa
 *  qoa
 *  rna
 *  vRa
 *  vpa
 *  wNa
 *  xNa
 */
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import io.netty.util.internal.ThreadLocalRandom;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLStreamHandler;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;
import paulscode.sound.SoundSystemConfig;
import paulscode.sound.SoundSystemException;
import paulscode.sound.codecs.CodecJOrbis;
import paulscode.sound.libraries.LibraryLWJGLOpenAL;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class QMa_1 {
    private final Map<X, String> D;
    private final Map<String, Integer> f;
    private final wNa F;
    private boolean g;
    private float L;
    private Map<X, qoa> E;
    private static final Marker m = MarkerManager.getMarker(lPa.O);
    private final List<rB> C;
    private final Multimap<rna, String> i;
    private final Map<String, X> M;
    private int k;
    private final Map<X, Integer> j;
    private final Cia J;
    private oNa A;
    private static final Logger I = LogManager.getLogger();

    public void M() {
        X x2;
        Map.Entry<X, Integer> entry;
        QMa_1 qMa_1;
        QMa_1 qMa_12 = qMa_1 = this;
        qMa_12.k += vRa.d;
        for (rB a22 : qMa_12.C) {
            a22.J();
            if (a22.f()) {
                qMa_1.J(a22);
                continue;
            }
            entry = qMa_1.D.get(a22);
            QMa_1 qMa_13 = qMa_1;
            qMa_1.A.setVolume((String)((Object)entry), qMa_13.J(a22, qMa_13.E.get(a22), qMa_1.F.J(a22.J()).J()));
            QMa_1 qMa_14 = qMa_1;
            qMa_1.A.setPitch((String)((Object)entry), qMa_14.J((X)a22, qMa_14.E.get(a22)));
            qMa_1.A.setPosition((String)((Object)entry), a22.f(), a22.J(), a22.C());
        }
        Iterator<Object> iterator = qMa_1.M.entrySet().iterator();
        while (iterator.hasNext()) {
            X x3;
            Map.Entry a22 = (Map.Entry)iterator.next();
            entry = (String)a22.getKey();
            x2 = (X)a22.getValue();
            if (qMa_1.A.playing((String)((Object)entry)) || qMa_1.f.get(entry) > qMa_1.k) continue;
            X x4 = x2;
            int n2 = x4.J();
            if (x4.J() && n2 > 0) {
                qMa_1.j.put(x2, qMa_1.k + n2);
            }
            iterator.remove();
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = entry;
            I.debug(m, AQa.C, objectArray);
            QMa_1 qMa_15 = qMa_1;
            qMa_15.A.removeSource((String)((Object)entry));
            qMa_15.f.remove(entry);
            qMa_1.E.remove(x2);
            try {
                QMa_1 qMa_16 = qMa_1;
                qMa_16.i.remove(qMa_16.F.J(x2.J()).J(), entry);
                x3 = x2;
            }
            catch (RuntimeException runtimeException) {
                x3 = x2;
            }
            if (!(x3 instanceof rB)) continue;
            qMa_1.C.remove(x2);
        }
        Iterator<Map.Entry<X, Integer>> a22 = qMa_1.j.entrySet().iterator();
        while (a22.hasNext()) {
            entry = a22.next();
            if (qMa_1.k < (Integer)entry.getValue()) continue;
            x2 = (X)entry.getKey();
            if (x2 instanceof rB) {
                ((rB)x2).J();
            }
            qMa_1.f(x2);
            a22.remove();
        }
    }

    /*
     * WARNING - void declaration
     */
    public QMa_1(wNa wNa2, Cia cia) {
        void a2;
        QMa_1 b2;
        QMa_1 c22 = wNa2;
        QMa_1 qMa_1 = b2 = this;
        qMa_1.k = uSa.E;
        qMa_1.L = pqa.r;
        qMa_1.M = HashBiMap.create();
        qMa_1.D = ((BiMap)qMa_1.M).inverse();
        QMa_1 qMa_12 = b2;
        QMa_1 qMa_13 = b2;
        qMa_13.E = Maps.newHashMap();
        qMa_13.i = HashMultimap.create();
        qMa_13.C = Lists.newArrayList();
        qMa_13.j = Maps.newHashMap();
        qMa_13.f = Maps.newHashMap();
        qMa_12.F = c22;
        qMa_12.J = a2;
        try {
            SoundSystemConfig.addLibrary(LibraryLWJGLOpenAL.class);
            SoundSystemConfig.setNumberStreamingBuffers(cQa.o);
            SoundSystemConfig.setNumberStreamingChannels(cQa.o);
            SoundSystemConfig.setCodec(nua.Ha, CodecJOrbis.class);
            return;
        }
        catch (SoundSystemException c22) {
            I.error(m, ATa.ba, (Throwable)c22);
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(rna rna2, float f2) {
        void b2;
        QMa_1 qMa_1 = this;
        if (!qMa_1.g) {
            return;
        }
        if (b2 == rna.MASTER) {
            int c2;
            void a2;
            qMa_1.L = a2;
            rna[] rnaArray = rna.values();
            int n2 = rnaArray.length;
            int n3 = c2 = uSa.E;
            while (n3 < n2) {
                Object object = rnaArray[c2];
                if (object != rna.MASTER) {
                    QMa_1 qMa_12 = qMa_1;
                    qMa_12.J((rna)object, qMa_12.J.J((rna)object));
                }
                n3 = ++c2;
            }
        }
        for (String string : qMa_1.i.get((rna)b2)) {
            float f3;
            X c2 = qMa_1.M.get(string);
            QMa_1 qMa_13 = qMa_1;
            float f4 = qMa_13.J(c2, qMa_13.E.get(c2), (rna)b2);
            QMa_1 qMa_14 = qMa_1;
            if (f3 <= JPa.N) {
                qMa_14.J(c2);
                continue;
            }
            qMa_14.A.setVolume(string, f4);
        }
    }

    public static /* synthetic */ boolean J(QMa qMa2, boolean bl) {
        boolean b2 = bl;
        QMa a2 = qMa2;
        a2.g = b2;
        return a2.g;
    }

    public void e() {
        QMa_1 qMa_1 = this;
        if (qMa_1.g) {
            Object a2;
            Object object = a2 = qMa_1.M.keySet().iterator();
            while (object.hasNext()) {
                String string = (String)a2.next();
                object = a2;
                qMa_1.A.stop(string);
            }
            QMa_1 qMa_12 = qMa_1;
            qMa_12.M.clear();
            qMa_12.j.clear();
            qMa_12.C.clear();
            qMa_12.i.clear();
            qMa_12.E.clear();
            qMa_12.f.clear();
        }
    }

    public static /* synthetic */ oNa J(QMa a2) {
        return a2.A;
    }

    public void d() {
        QMa_1 a2;
        QMa_1 qMa_1 = a2;
        qMa_1.C();
        qMa_1.l();
    }

    public void C() {
        QMa_1 a2;
        if (a2.g) {
            QMa_1 qMa_1 = a2;
            qMa_1.e();
            qMa_1.A.cleanup();
            qMa_1.g = uSa.E;
        }
    }

    public oNa J() {
        QMa_1 a2;
        return a2.A;
    }

    /*
     * WARNING - void declaration
     */
    private float J(X x2, qoa qoa2) {
        void b2;
        QMa_1 c2 = qoa2;
        QMa_1 a2 = this;
        return (float)Oz.J((double)((double)b2.l() * c2.f()), (double)kTa.B, (double)KPa.y);
    }

    private static URL J(ResourceLocation resourceLocation) {
        ResourceLocation resourceLocation2 = resourceLocation;
        Object[] objectArray = new Object[yRa.d];
        objectArray[uSa.E] = vpa.b;
        objectArray[vRa.d] = resourceLocation2.f();
        objectArray[uqa.g] = resourceLocation2.J();
        String string = String.format(cTa.I, objectArray);
        ResourceLocation a2 = new cMa(resourceLocation2);
        try {
            return new URL((URL)null, string, (URLStreamHandler)((Object)a2));
        }
        catch (MalformedURLException malformedURLException) {
            throw new Error(hra.R);
        }
    }

    private synchronized void l() {
        QMa_1 qMa_1 = this;
        if (!qMa_1.g) {
            qMa_1.L = qMa_1.J.J(rna.MASTER);
            try {
                new Thread((Runnable)new Ina((QMa)qMa_1), tua.l).start();
                return;
            }
            catch (RuntimeException a2) {
                I.error(m, Bsa.N, (Throwable)a2);
                QMa_1 qMa_12 = qMa_1;
                qMa_12.A.setMasterVolume(JPa.N);
                qMa_12.J.J(rna.MASTER, JPa.N);
                qMa_12.J.d();
            }
        }
    }

    public static /* synthetic */ oNa J(QMa qMa2, oNa oNa2) {
        QMa b2 = oNa2;
        QMa a2 = qMa2;
        a2.A = b2;
        return a2.A;
    }

    /*
     * WARNING - void declaration
     */
    private float J(X x2, qoa qoa2, rna rna2) {
        void b2;
        void c2;
        QMa_1 d2 = rna2;
        QMa_1 a2 = this;
        return (float)Oz.J((double)((double)c2.d() * b2.J()), (double)aSa.V, (double)oua.i) * a2.J((rna)d2) * a2.L;
    }

    /*
     * WARNING - void declaration
     */
    public void J(X x2, int n2) {
        void b2;
        int c2 = n2;
        QMa_1 a2 = this;
        a2.j.put((X)b2, a2.k + c2);
    }

    public static /* synthetic */ Marker J() {
        return m;
    }

    public static /* synthetic */ Logger J() {
        return I;
    }

    public boolean J(X x2) {
        Object b2 = x2;
        QMa_1 a2 = this;
        if (!a2.g) {
            return uSa.E != 0;
        }
        if ((b2 = a2.D.get(b2)) == null) {
            return uSa.E != 0;
        }
        if (a2.A.playing((String)b2) || a2.f.containsKey(b2) && a2.f.get(b2) <= a2.k) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void J(Sx sx2, float f2) {
        Sx c22 = sx2;
        QMa_1 b2 = this;
        if (b2.g && c22 != null) {
            float a2;
            Sx sx3 = c22;
            Sx sx4 = c22;
            double d2 = sx3.o + (sx4.d - c22.o) * a2;
            Sx sx5 = c22;
            float f3 = sx3.s + (sx5.X - sx5.s) * a2;
            float f4 = sx4.c + (c22.la - c22.c) * (double)a2;
            double d3 = sx3.ba + (c22.Z - c22.ba) * (double)a2 + (double)c22.l();
            double d4 = sx3.r + (c22.A - c22.r) * (double)a2;
            float c22 = Oz.C((float)((f3 + ISa.a) * Bua.ga));
            a2 = Oz.d((float)((f3 + ISa.a) * Bua.ga));
            f3 = Oz.C((float)(-d2 * Bua.ga));
            float f5 = Oz.d((float)(-d2 * Bua.ga));
            float f6 = Oz.C((float)((-d2 + ISa.a) * Bua.ga));
            d2 = Oz.d((float)((-d2 + ISa.a) * Bua.ga));
            float f7 = c22 * f3;
            f3 = a2 * f3;
            b2.A.setListenerPosition(f4, (float)d3, (float)d4);
            b2.A.setListenerOrientation(f7, f5, f3, c22 *= f6, (float)d2, a2 *= f6);
        }
    }

    public void f(X x2) {
        X b2 = x2;
        QMa_1 a2 = this;
        if (a2.g) {
            if (a2.A.getMasterVolume() <= JPa.N) {
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = b2.J();
                I.debug(m, CRa.a, objectArray);
                return;
            }
            xNa xNa2 = a2.F.J(b2.J());
            if (xNa2 == null) {
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = b2.J();
                I.warn(m, asa.U, objectArray);
                return;
            }
            qoa qoa2 = xNa2.J();
            if (qoa2 == wNa.j) {
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = xNa2.J();
                I.warn(m, PTa.a, objectArray);
                return;
            }
            float f2 = b2.d();
            float f3 = Yra.i;
            if (f2 > pqa.r) {
                f3 *= f2;
            }
            if (b2 instanceof YL && (f2 = ((YL)b2).e()) != JPa.N) {
                f3 = f2;
            }
            rna rna2 = xNa2.J();
            QMa_1 qMa_1 = a2;
            Object object = b2;
            float f4 = qMa_1.J((X)object, qoa2, rna2);
            qoa qoa3 = qoa2;
            double d2 = qMa_1.J((X)object, qoa3);
            ResourceLocation resourceLocation = qoa3.J();
            if (f4 == JPa.N) {
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = resourceLocation;
                I.debug(m, pqa.m, objectArray);
                return;
            }
            int n2 = b2.J() && b2.J() == 0 ? vRa.d : uSa.E;
            String string = Oz.J((Random)ThreadLocalRandom.current()).toString();
            QMa_1 qMa_12 = a2;
            if (qoa2.J()) {
                qMa_12.A.newStreamingSource(uSa.E != 0, string, QMa_1.J(resourceLocation), resourceLocation.toString(), n2 != 0, b2.f(), b2.J(), b2.C(), b2.J().getTypeInt(), f3);
            } else {
                qMa_12.A.newSource(uSa.E != 0, string, QMa_1.J(resourceLocation), resourceLocation.toString(), n2 != 0, b2.f(), b2.J(), b2.C(), b2.J().getTypeInt(), f3);
            }
            Object[] objectArray = new Object[yRa.d];
            objectArray[uSa.E] = qoa2.J();
            objectArray[vRa.d] = xNa2.J();
            objectArray[uqa.g] = string;
            I.debug(m, Zra.w, objectArray);
            QMa_1 qMa_13 = a2;
            qMa_13.A.setPitch(string, (float)d2);
            qMa_13.A.setVolume(string, f4);
            qMa_13.A.play(string);
            qMa_13.f.put(string, a2.k + kTa.j);
            a2.M.put(string, b2);
            a2.E.put(b2, qoa2);
            if (rna2 != rna.MASTER) {
                a2.i.put(rna2, string);
            }
            if (b2 instanceof rB) {
                a2.C.add((rB)b2);
            }
        }
    }

    public void J(X x2) {
        Object b2 = x2;
        QMa_1 a2 = this;
        if (a2.g && (b2 = a2.D.get(b2)) != null) {
            a2.A.stop((String)b2);
        }
    }

    public void f() {
        Iterator<String> iterator;
        QMa_1 qMa_1 = this;
        Iterator<String> iterator2 = iterator = qMa_1.M.keySet().iterator();
        while (iterator2.hasNext()) {
            String a2 = iterator.next();
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = a2;
            I.debug(m, VQa.N, objectArray);
            iterator2 = iterator;
            qMa_1.A.play(a2);
        }
    }

    private float J(rna rna2) {
        QMa_1 b2 = rna2;
        QMa_1 a2 = this;
        if (b2 == null || b2 == rna.MASTER) {
            return pqa.r;
        }
        return a2.J.J((rna)b2);
    }

    public void J() {
        Iterator<String> iterator;
        QMa_1 qMa_1 = this;
        Iterator<String> iterator2 = iterator = qMa_1.M.keySet().iterator();
        while (iterator2.hasNext()) {
            String a2 = iterator.next();
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = a2;
            I.debug(m, Jsa.ga, objectArray);
            iterator2 = iterator;
            qMa_1.A.pause(a2);
        }
    }
}

