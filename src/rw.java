/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  MQa
 *  Qsa
 *  Uta
 *  bx
 *  cQa
 *  hTa
 *  pua
 *  sun.misc.IOUtils
 *  vRa
 *  yra
 *  yx
 *  zW
 *  zsa
 */
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;
import sun.misc.IOUtils;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class rw {
    private final Map<String, bx> i;
    private final File M;
    private final ScheduledExecutorService k;
    private final File j;
    private final File J;
    public static final int A = 2592000;
    public volatile boolean I;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    public bx J(String string) {
        rw b2;
        void a2;
        rw rw2;
        rw rw3 = rw2 = this;
        synchronized (rw3) {
            b2 = rw2.i.get(a2);
            if (b2 != null) {
                bx.f((bx)b2);
                rw2.I = vRa.d;
            }
        }
        if (b2 == null) {
            b2 = rw2.J();
            bx.J((bx)b2, (String)a2);
        }
        return b2;
    }

    public static /* synthetic */ Thread J(Runnable a2) {
        Thread thread = new Thread(a2, FRa.Aa);
        thread.setDaemon(vRa.d != 0);
        return thread;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void C() {
        rw rw2 = this;
        if (!rw2.I) return;
        Object object = rw2;
        synchronized (object) {
            Object object2;
            block23: {
                Object object3;
                Object a22;
                ByteArrayOutputStream byteArrayOutputStream;
                block22: {
                    Object object4;
                    if (!rw2.I) {
                        return;
                    }
                    rw2.I = uSa.E;
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        object2 = new DeflaterOutputStream(byteArrayOutputStream);
                        a22 = new DataOutputStream(new BufferedOutputStream((OutputStream)object2));
                        rw rw3 = rw2;
                        Object object5 = a22;
                        ((DataOutputStream)object5).writeByte(uqa.g);
                        ((DataOutputStream)object5).writeByte(rw2.J());
                        ((DataOutputStream)a22).writeInt(rw3.i.size());
                        Object object6 = object3 = rw3.i.values().iterator();
                        while (object6.hasNext()) {
                            bx bx2 = object3.next();
                            object6 = object3;
                            bx2.serialize((DataOutputStream)a22);
                        }
                    }
                    catch (Exception exception) {
                        object4 = object;
                        break block22;
                    }
                    {
                        ((DataOutputStream)a22).flush();
                        ((DeflaterOutputStream)object2).close();
                        object4 = object;
                    }
                }
                // ** MonitorExit[v3] (shouldn't be in output)
                object = rw2.J.getParentFile();
                if (!((File)object).exists()) {
                    ((File)object).mkdirs();
                }
                object2 = new File(rw2.J.getParentFile(), new StringBuilder().insert(3 ^ 3, rw2.J.getName()).append(ppa.A).toString());
                try {
                    block24: {
                        a22 = new FileOutputStream((File)object2);
                        object3 = null;
                        try {
                            byteArrayOutputStream.writeTo((OutputStream)a22);
                            if (a22 == null) break block23;
                            if (object3 == null) break block24;
                        }
                        catch (Throwable throwable) {
                            try {
                                object3 = throwable;
                                throw object3;
                            }
                            catch (Throwable throwable2) {
                                Throwable throwable3;
                                if (a22 != null) {
                                    if (object3 != null) {
                                        try {
                                            ((FileOutputStream)a22).close();
                                            throwable3 = throwable2;
                                            throw throwable3;
                                        }
                                        catch (Throwable throwable4) {
                                            throwable3 = throwable2;
                                            ((Throwable)object3).addSuppressed(throwable4);
                                            throw throwable3;
                                        }
                                    }
                                    ((FileOutputStream)a22).close();
                                }
                                throwable3 = throwable2;
                                throw throwable3;
                            }
                        }
                        try {
                            ((FileOutputStream)a22).close();
                        }
                        catch (Throwable throwable) {
                            ((Throwable)object3).addSuppressed(throwable);
                        }
                        break block23;
                    }
                    ((FileOutputStream)a22).close();
                }
                catch (Exception a22) {
                    OT.b.warn(new StringBuilder().insert(3 >> 2, Zra.X).append(rw2.J.getAbsolutePath()).toString(), (Throwable)a22);
                    ((File)object2).delete();
                }
            }
            rw2.J.delete();
            ((File)object2).renameTo(rw2.J);
            return;
        }
    }

    public static /* synthetic */ Map J(rw a2) {
        return a2.i;
    }

    public int J() {
        return vRa.d;
    }

    public static /* synthetic */ void f(rw a2) {
        a2.J();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void main(String[] stringArray) throws Exception {
        Object object;
        block12: {
            Object object2;
            block10: {
                Object a2;
                block11: {
                    String[] stringArray2 = stringArray;
                    object2 = new File(AQa.i);
                    object2 = new rw(new File((File)object2, qsa.G), new File((File)object2, Uta.R));
                    Thread.sleep(zsa.R);
                    a2 = ((rw)object2).J(hTa.Ha);
                    if (!a2.J()) break block10;
                    a2 = a2.J();
                    Throwable throwable = null;
                    try {
                        System.out.println(new String(IOUtils.readFully((InputStream)a2, (int)pua.o, vRa.d != 0)));
                        if (a2 == null) break block10;
                        if (throwable == null) break block11;
                    }
                    catch (Throwable throwable2) {
                        try {
                            throwable = throwable2;
                            throw throwable;
                        }
                        catch (Throwable throwable3) {
                            Throwable throwable4;
                            if (a2 != null) {
                                if (throwable != null) {
                                    try {
                                        ((FileInputStream)a2).close();
                                        throwable4 = throwable3;
                                        throw throwable4;
                                    }
                                    catch (Throwable throwable5) {
                                        throwable4 = throwable3;
                                        throwable.addSuppressed(throwable5);
                                        throw throwable4;
                                    }
                                }
                                ((FileInputStream)a2).close();
                            }
                            throwable4 = throwable3;
                            throw throwable4;
                        }
                    }
                    try {
                        ((FileInputStream)a2).close();
                        object = object2;
                    }
                    catch (Throwable throwable6) {
                        object = object2;
                        throwable.addSuppressed(throwable6);
                    }
                    break block12;
                }
                ((FileInputStream)a2).close();
                object = object2;
                break block12;
            }
            object = object2;
        }
        ((rw)object).l();
    }

    /*
     * WARNING - void declaration
     */
    public rw(File file, File file2) {
        void b2;
        rw a2;
        File c2 = file2;
        rw rw2 = a2 = this;
        rw rw3 = a2;
        rw3.i = new HashMap<String, bx>();
        rw2.J = b2;
        a2.M = c2;
        rw2.j = new File(c2, UTa.b);
        if (a2.j.exists()) {
            rw.J(a2.j);
        }
        rw rw4 = a2;
        rw4.f();
        rw4.k = Executors.newSingleThreadScheduledExecutor(zW.J());
        rw4.k.scheduleWithFixedDelay(fx.J(a2), yra.ja, yra.ja, TimeUnit.SECONDS);
        a2.k.scheduleWithFixedDelay(yx.J((rw)a2), nqa.i, MQa.r, TimeUnit.MINUTES);
    }

    public static /* synthetic */ void J(rw a2) {
        a2.C();
    }

    public void l() {
        rw a2;
        a2.k.shutdownNow();
        a2.C();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    public void J(Consumer<bx> consumer) {
        rw rw2;
        rw b2 = rw2 = this;
        synchronized (b2) {
            void a2;
            rw2.i.values().forEach(a2);
            return;
        }
    }

    public static /* synthetic */ File J(rw a2) {
        return a2.M;
    }

    public File J() {
        int n2;
        rw rw2 = this;
        if (!rw2.j.exists()) {
            rw2.j.mkdirs();
        }
        int n3 = n2 = uSa.E;
        while (n3 < kTa.j) {
            File a2 = new File(rw2.j, ThreadLocalRandom.current().nextInt(IPa.o) + ppa.A);
            if (!a2.exists()) {
                return a2;
            }
            n3 = ++n2;
        }
        throw new IllegalStateException(sOa.B);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void f() {
        DataInputStream a22;
        block17: {
            int n2;
            Throwable throwable;
            rw rw2 = this;
            if (!rw2.J.exists()) {
                rw.J(rw2.M);
                return;
            }
            try {
                a22 = new DataInputStream(new BufferedInputStream(new InflaterInputStream(new FileInputStream(rw2.J))));
                throwable = null;
                try {
                    byte by = a22.readByte();
                    n2 = by > vRa.d ? a22.readByte() : uSa.E;
                }
                catch (Throwable throwable2) {
                    try {
                        throwable = throwable2;
                        throw throwable;
                    }
                    catch (Throwable throwable3) {
                        Throwable throwable4;
                        if (a22 != null) {
                            if (throwable != null) {
                                try {
                                    a22.close();
                                    throwable4 = throwable3;
                                    throw throwable4;
                                }
                                catch (Throwable throwable5) {
                                    throwable4 = throwable3;
                                    throwable.addSuppressed(throwable5);
                                    throw throwable4;
                                }
                            }
                            a22.close();
                        }
                        throwable4 = throwable3;
                        throw throwable4;
                    }
                }
            }
            catch (FileNotFoundException a22) {
                return;
            }
            catch (IOException a22) {
                OT.b.warn(new StringBuilder().insert(3 & 4, Qsa.R).append(rw2.J.getAbsolutePath()).toString(), (Throwable)a22);
                rw rw3 = rw2;
                rw3.i.clear();
                rw3.J.delete();
                return;
            }
            {
                int n3 = n2;
                int n4 = a22.readInt();
                for (int i2 = uSa.E; i2 < n4; ++i2) {
                    rw rw4 = rw2;
                    bx bx2 = rw4.J();
                    bx2.deserialize(a22, n3);
                    rw4.i.put(bx.J((bx)bx2), bx2);
                }
                if (a22 == null) return;
                if (throwable == null) break block17;
            }
            try {
                a22.close();
                return;
            }
            catch (Throwable throwable6) {
                throwable.addSuppressed(throwable6);
                return;
            }
        }
        a22.close();
    }

    public bx J() {
        rw a2;
        return new bx(a2);
    }

    private static void J(File file) {
        File file2;
        block6: {
            block5: {
                file2 = file;
                if (file2.exists()) break block5;
                return;
            }
            try {
                int n2;
                File[] a2;
                if (!file2.isDirectory() || (a2 = file2.listFiles()) == null) break block6;
                File[] fileArray = a2;
                int n3 = a2.length;
                int n4 = n2 = uSa.E;
                while (n4 < n3) {
                    rw.J(fileArray[n2++]);
                    n4 = n2;
                }
            }
            catch (Exception a2) {
                OT.b.warn(cQa.a, (Throwable)a2);
                return;
            }
        }
        file2.delete();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void J() {
        Object a2;
        rw rw2 = this;
        ArrayList<bx> arrayList = new ArrayList<bx>();
        Object object = rw2;
        synchronized (object) {
            a2 = rw2.i.values().iterator();
            long l = System.currentTimeMillis();
            while (a2.hasNext()) {
                bx bx2 = (bx)a2.next();
                if (bx.J((bx)bx2) == nqa.i || bx.J((bx)bx2) >= l) continue;
                a2.remove();
                arrayList.add(bx2);
                rw2.I = vRa.d;
            }
        }
        Object object2 = object = arrayList.iterator();
        while (object2.hasNext()) {
            a2 = (bx)object.next();
            object2 = object;
            bx.J((bx)a2);
        }
        return;
    }
}

