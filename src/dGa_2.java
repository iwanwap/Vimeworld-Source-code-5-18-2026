/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bpa
 *  Cia
 *  EQa
 *  FNa
 *  FPa
 *  FTa
 *  Kpa
 *  NTa
 *  Pga
 *  TGa
 *  Vga
 *  cQa
 *  dGa
 *  gc
 *  kga
 *  psa
 *  pua
 *  vRa
 *  wra
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.hash.Hashing;
import com.google.common.io.Files;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import net.minecraft.client.resources.FileResourcePack;
import net.minecraft.client.resources.IResourcePack;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.comparator.LastModifiedFileComparator;
import org.apache.commons.io.filefilter.TrueFileFilter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class dGa_2 {
    private final ReentrantLock L;
    public List<nIa> E;
    private final File m;
    private List<nIa> C;
    private static final FileFilter i;
    private ListenableFuture<Object> M;
    public final IResourcePack k;
    private IResourcePack j;
    private final File J;
    public final kga A;
    private static final Logger I;

    public List<nIa> l() {
        dGa_2 a2;
        return ImmutableList.copyOf(a2.E);
    }

    public List<nIa> f() {
        dGa_2 a2;
        return ImmutableList.copyOf(a2.C);
    }

    public ListenableFuture<Object> J(File file) {
        dGa_2 a2;
        File b2 = file;
        dGa_2 dGa_22 = a2 = this;
        dGa_22.j = new FileResourcePack(b2);
        return Kpa.J().J();
    }

    public void J(List<nIa> list) {
        dGa_2 a2;
        List<nIa> b2 = list;
        dGa_2 dGa_22 = a2 = this;
        dGa_22.E.clear();
        dGa_22.E.addAll((Collection<nIa>)b2);
    }

    private void C() {
        dGa_2 a2;
        if (a2.m.exists()) {
            if (!(a2.m.isDirectory() || a2.m.delete() && a2.m.mkdirs())) {
                I.warn(new StringBuilder().insert(3 & 4, cQa.p).append(a2.m).toString());
                return;
            }
        } else if (!a2.m.mkdirs()) {
            I.warn(new StringBuilder().insert(3 >> 2, psa.T).append(a2.m).toString());
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public ListenableFuture<Object> J(String string, String string2) {
        SettableFuture a2;
        dGa_2 dGa_22 = this;
        Object c2 = ((String)((Object)a2)).matches(lTa.Ja) ? a2 : pua.i;
        c2 = new File(dGa_22.J, (String)c2);
        dGa_22.L.lock();
        try {
            ListenableFuture<Object> b2;
            dGa_2 dGa_23;
            Object object;
            block9: {
                dGa_22.J();
                if (((File)c2).exists() && ((String)((Object)a2)).length() == wra.P) {
                    block8: {
                        ListenableFuture<Object> listenableFuture;
                        object = Hashing.sha1().hashBytes(Files.toByteArray((File)c2)).toString();
                        if (!object.equals(a2)) break block8;
                        ListenableFuture<Object> listenableFuture2 = listenableFuture = dGa_22.J((File)c2);
                        return listenableFuture2;
                    }
                    try {
                        I.warn(new StringBuilder().insert(3 & 4, nOa.u).append(c2).append(FTa.Ia).append((String)((Object)a2)).append(Nra.Q).append((String)object).append(Bpa.Ga).toString());
                        FileUtils.deleteQuietly((File)c2);
                        dGa_23 = dGa_22;
                        break block9;
                    }
                    catch (IOException iOException) {
                        I.warn(new StringBuilder().insert(5 >> 3, nOa.u).append(c2).append(rta.s).toString(), (Throwable)iOException);
                        FileUtils.deleteQuietly((File)c2);
                    }
                }
                dGa_23 = dGa_22;
            }
            dGa_23.f();
            object = new FNa();
            Map map = Kpa.J();
            Kpa kpa2 = Kpa.J();
            Futures.getUnchecked(kpa2.J((Runnable)new TGa((dGa)dGa_22, kpa2, object)));
            a2 = SettableFuture.create();
            dGa_22.M = mz.J((File)c2, (String)((Object)b2), map, FPa.I, (gc)object, kpa2.J());
            Futures.addCallback(dGa_22.M, new Pga((dGa)dGa_22, (File)c2, a2));
            b2 = dGa_22.M;
            return b2;
        }
        finally {
            dGa_22.L.unlock();
        }
    }

    public void l() {
        dGa_2 dGa_22 = this;
        ArrayList<nIa> arrayList = Lists.newArrayList();
        for (File object : dGa_22.J()) {
            nIa nIa2 = new nIa((dGa)dGa_22, object, null);
            if (!dGa_22.C.contains(nIa2)) {
                try {
                    nIa2.f();
                    arrayList.add(nIa2);
                }
                catch (Exception exception) {
                    arrayList.remove(nIa2);
                }
                continue;
            }
            int n2 = dGa_22.C.indexOf(nIa2);
            if (n2 <= pua.o || n2 >= dGa_22.C.size()) continue;
            arrayList.add(dGa_22.C.get(n2));
        }
        dGa_22.C.removeAll(arrayList);
        Iterator<nIa> a2 = dGa_22.C.iterator();
        Iterator<nIa> iterator = a2;
        while (iterator.hasNext()) {
            nIa nIa2 = a2.next();
            iterator = a2;
            nIa2.J();
        }
        dGa_22.C = arrayList;
    }

    private void f() {
        dGa_2 dGa_22;
        dGa_2 dGa_23 = dGa_22 = this;
        dGa_23.J.mkdir();
        ArrayList<File> arrayList = Lists.newArrayList(FileUtils.listFiles(dGa_23.J, TrueFileFilter.TRUE, null));
        Collections.sort(arrayList, LastModifiedFileComparator.LASTMODIFIED_REVERSE);
        int n2 = uSa.E;
        for (File a2 : arrayList) {
            if (n2++ < NTa.C) continue;
            I.info(new StringBuilder().insert(2 & 5, vqa.G).append(a2.getName()).toString());
            FileUtils.deleteQuietly(a2);
        }
    }

    static {
        I = LogManager.getLogger();
        i = new Vga();
    }

    public File J() {
        dGa_2 a2;
        return a2.m;
    }

    /*
     * WARNING - void declaration
     */
    public dGa_2(File file, File file2, IResourcePack iResourcePack, kga kga2, Cia cia) {
        void a2;
        void f222;
        Iterator<nIa> c2;
        String d2;
        Iterator e2;
        dGa_2 kga3;
        dGa_2 b2;
        void var4_7;
        void var0_1 = var4_7;
        dGa_2 dGa_22 = b2 = kga3;
        dGa_2 dGa_23 = b2;
        b2.L = new ReentrantLock();
        dGa_23.C = Lists.newArrayList();
        b2.E = Lists.newArrayList();
        dGa_22.m = e2;
        dGa_22.J = d2;
        b2.k = c2;
        b2.A = f222;
        b2.C();
        b2.l();
        e2 = a2.Ab.iterator();
        block0: while (e2.hasNext()) {
            d2 = (String)e2.next();
            for (nIa f222 : b2.C) {
                if (!f222.J().equals(d2)) continue;
                if (f222.J() == vRa.d || a2.sb.contains(f222.J())) {
                    b2.E.add(f222);
                    continue block0;
                }
                e2.remove();
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = f222.J();
                I.warn(EQa.Da, objectArray);
            }
        }
    }

    public IResourcePack J() {
        dGa_2 a2;
        return a2.j;
    }

    private List<File> J() {
        dGa_2 a2;
        if (a2.m.isDirectory()) {
            return Arrays.asList(a2.m.listFiles(i));
        }
        return Collections.emptyList();
    }

    public void J() {
        dGa_2 dGa_22 = this;
        dGa_22.L.lock();
        try {
            if (dGa_22.M != null) {
                dGa_22.M.cancel(vRa.d != 0);
            }
            dGa_22.M = null;
            if (dGa_22.j != null) {
                dGa_22.j = null;
                Kpa.J().J();
            }
            return;
        }
        finally {
            dGa_22.L.unlock();
        }
    }
}

