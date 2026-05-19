/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Fpa
 *  HQa
 *  JPa
 *  Nqa
 *  Rx
 *  Tpa
 *  Uqa
 *  Yra
 *  ZPa
 *  bRa
 *  fQa
 *  iqa
 *  kpa
 *  pqa
 *  vRa
 *  zra
 */
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPOutputStream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.BufferUtils;
import org.lwjgl.openal.AL10;
import paulscode.sound.SoundSystem;
import paulscode.sound.libraries.ChannelLWJGLOpenAL;
import paulscode.sound.libraries.LibraryLWJGLOpenAL;
import paulscode.sound.libraries.SourceLWJGLOpenAL;

public final class QOa {
    private final ScheduledExecutorService k;
    private static final Logger j = LogManager.getLogger();
    private final LibraryLWJGLOpenAL J;
    private final SoundSystem A;
    private final ConcurrentHashMap<String, zra> I;

    public void J(String string) {
        String b2 = string;
        QOa a2 = this;
        if (a2.I.remove(b2) != null) {
            a2.A.stop(b2);
        }
    }

    public static /* synthetic */ void f(QOa qOa2) {
        QOa qOa3 = qOa2;
        long l2 = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, zra>> iterator = qOa3.I.entrySet().iterator();
        block0: while (true) {
            Iterator<Map.Entry<String, zra>> iterator2 = iterator;
            while (iterator2.hasNext()) {
                Object object;
                Object object2;
                Object a22;
                Map.Entry<String, zra> entry = iterator.next();
                if (zra.J((zra)entry.getValue()) > l2) {
                    iterator2 = iterator;
                    continue;
                }
                zra.J((zra)entry.getValue()).drainTo(arrayList);
                if (arrayList.isEmpty()) {
                    iterator2 = iterator;
                    continue;
                }
                int n2 = uSa.E;
                Object object3 = a22 = arrayList.iterator();
                while (object3.hasNext()) {
                    object2 = (byte[])a22.next();
                    n2 += ((byte[])object2).length;
                    object3 = a22;
                }
                zra.J((zra)entry.getValue(), (long)(l2 + (long)arrayList.size() * Nra.R));
                a22 = new byte[n2];
                int n3 = uSa.E;
                Object object4 = arrayList.iterator();
                Iterator iterator3 = object4;
                while (iterator3.hasNext()) {
                    object = (byte[])object4.next();
                    System.arraycopy(object, uSa.E, a22, n3, ((byte[])object).length);
                    n3 += ((byte[])object).length;
                    iterator3 = object4;
                }
                arrayList.clear();
                if (zra.J((zra)entry.getValue()) > pqa.r) {
                    ZPa.J((ByteBuffer)ByteBuffer.wrap((byte[])a22).order(ByteOrder.LITTLE_ENDIAN), (float)zra.J((zra)entry.getValue()));
                }
                object4 = (SourceLWJGLOpenAL)qOa3.J.getSource(entry.getKey());
                ChannelLWJGLOpenAL channelLWJGLOpenAL = (ChannelLWJGLOpenAL)Rx.J((Object)object4, (String)Zra.fa);
                object = channelLWJGLOpenAL;
                entry = (IntBuffer)Rx.J((Object)channelLWJGLOpenAL, (String)Jqa.K);
                object4 = (ByteBuffer)BufferUtils.createByteBuffer(((Object)a22).length).put((byte[])a22).flip();
                int a22 = AL10.alGetSourcei(((IntBuffer)((Object)entry)).get(uSa.E), iSa.V);
                object2 = BufferUtils.createIntBuffer(a22 > 0 ? a22 : vRa.d);
                AL10.alGenBuffers((IntBuffer)object2);
                if (a22 > 0) {
                    AL10.alSourceUnqueueBuffers(((IntBuffer)((Object)entry)).get(uSa.E), (IntBuffer)object2);
                    if (a22 > vRa.d) {
                        object2 = BufferUtils.createIntBuffer(vRa.d);
                        AL10.alGenBuffers((IntBuffer)object2);
                    }
                }
                AL10.alBufferData(((IntBuffer)object2).get(uSa.E), Uqa.R, (ByteBuffer)object4, kpa.Ka);
                AL10.alSourceQueueBuffers(((IntBuffer)((Object)entry)).get(uSa.E), (IntBuffer)object2);
                if (((ChannelLWJGLOpenAL)object).playing()) continue block0;
                ((ChannelLWJGLOpenAL)object).play();
                continue block0;
            }
            break;
        }
    }

    public Map<String, zra> J() {
        QOa a2;
        return a2.I;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(String string, byte[] byArray, String string2, int n2, long l2) {
        zra zra2;
        byte[] byArray2;
        block4: {
            void d2;
            zra e2;
            QOa qOa2 = this;
            if (qOa2.J == null) {
                return uSa.E != 0;
            }
            e2 = qOa2.I.get(e2);
            byArray2 = zra.J((zra)e2).J((byte[])d2);
            if (WF.J) {
                Object f2 = new ByteArrayOutputStream();
                try {
                    void a2;
                    void b2;
                    void c2;
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream((OutputStream)f2);
                    gZIPOutputStream.write(byArray2, uSa.E, byArray2.length);
                    GZIPOutputStream gZIPOutputStream2 = gZIPOutputStream;
                    gZIPOutputStream2.finish();
                    gZIPOutputStream2.close();
                    f2 = ((ByteArrayOutputStream)f2).toByteArray();
                    j.warn(new StringBuilder().insert(2 & 5, UTa.X).append(System.currentTimeMillis()).append(Fpa.Fa).append((String)c2).append(Tpa.E).append((int)b2).append(Era.Aa).append((long)a2).append(Tpa.E).append(Base64.getEncoder().encodeToString((byte[])d2)).append(Tpa.E).append(Base64.getEncoder().encodeToString((byte[])f2)).toString());
                    zra2 = e2;
                    break block4;
                }
                catch (IOException iOException) {
                    j.warn(bRa.E, (Throwable)iOException);
                }
            }
            zra2 = e2;
        }
        return zra.J((zra)zra2).offer(byArray2);
    }

    /*
     * WARNING - void declaration
     */
    public QOa(SoundSystem soundSystem, ScheduledExecutorService scheduledExecutorService) {
        void a2;
        Object c2 = soundSystem;
        QOa b2 = this;
        QOa qOa2 = b2;
        qOa2.I = new ConcurrentHashMap();
        b2.A = c2;
        b2.k = a2;
        c2 = Rx.J((Object)b2.A, (String)Yra.b);
        if (c2 instanceof LibraryLWJGLOpenAL) {
            b2.J = (LibraryLWJGLOpenAL)c2;
            return;
        }
        b2.J = null;
    }

    public void f() {
        QOa a2;
        a2.k.execute(fQa.J((QOa)a2));
    }

    public void J() {
        QOa a2;
        a2.k.scheduleAtFixedRate(HQa.J((QOa)a2), Yra.t, Yra.t, TimeUnit.MILLISECONDS);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(String string, float f2) {
        void a2;
        void b2;
        QOa qOa2 = this;
        if (qOa2.J == null) {
            return uSa.E != 0;
        }
        QOa c2 = qOa2.I.get(b2);
        if (c2 == null) {
            return uSa.E != 0;
        }
        qOa2.k.execute(iqa.J((QOa)qOa2, (String)b2, (float)a2, (zra)c2));
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(String string, String string2) {
        void a2;
        ChannelLWJGLOpenAL channelLWJGLOpenAL;
        String c2 = string;
        QOa b2 = this;
        if (b2.J == null) {
            return uSa.E != 0;
        }
        if (b2.I.get(c2) != null) {
            return uSa.E != 0;
        }
        QOa qOa2 = b2;
        qOa2.J.rawDataStream(ZPa.A, uSa.E != 0, c2, FRa.Ga, QTa.G, FRa.Ga, uSa.E, Yra.i);
        qOa2.J.feedRawAudioData(c2, new byte[uSa.E]);
        SourceLWJGLOpenAL sourceLWJGLOpenAL = (SourceLWJGLOpenAL)qOa2.J.getSource(c2);
        ChannelLWJGLOpenAL channelLWJGLOpenAL2 = channelLWJGLOpenAL = (ChannelLWJGLOpenAL)Rx.J((Object)sourceLWJGLOpenAL, (String)Zra.fa);
        Rx.J((Object)sourceLWJGLOpenAL, (String)Jta.W, (Object)channelLWJGLOpenAL2);
        AL10.alSourcei(((IntBuffer)Rx.J((Object)channelLWJGLOpenAL2, (String)Jqa.K)).get(uSa.E), Jqa.e, vRa.d);
        SourceLWJGLOpenAL sourceLWJGLOpenAL2 = sourceLWJGLOpenAL;
        sourceLWJGLOpenAL2.setPosition(JPa.N, JPa.N, JPa.N);
        sourceLWJGLOpenAL2.setVelocity(JPa.N, JPa.N, JPa.N);
        b2.I.put(c2, new zra((String)a2, new LinkedBlockingQueue(ySa.T), new Nqa()));
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(QOa qOa2, String string, float f2, zra zra2) {
        void c2;
        void b2;
        QOa d2 = zra2;
        QOa a2 = qOa2;
        void v0 = b2;
        a2.J.setVolume((String)c2, (float)v0);
        zra.J((zra)d2, (float)v0);
    }

    public static /* synthetic */ void J(QOa qOa2) {
        Object a2;
        QOa qOa3 = qOa2;
        Object object = a2 = ((ConcurrentHashMap.KeySetView)qOa3.I.keySet()).iterator();
        while (object.hasNext()) {
            String string = (String)a2.next();
            object = a2;
            qOa3.A.stop(string);
        }
        qOa3.I.clear();
    }
}

