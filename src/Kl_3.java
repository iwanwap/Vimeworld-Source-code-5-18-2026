/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Kl
 *  Sl
 *  bx
 *  dQa
 *  kK
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Kl_3 {
    private int C;
    private final String i;
    private byte[] M;
    private final CompletableFuture<bx> k;
    public kK j;
    public ByteArrayOutputStream J;
    public AtomicBoolean A;
    private final List<CompletableFuture<InputStream>> I;

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(bx bx2, CompletableFuture completableFuture) {
        void a2;
        bx bx3 = bx2;
        try {
            a2.complete(bx3.J());
            return;
        }
        catch (IOException b2) {
            a2.completeExceptionally(b2);
            return;
        }
    }

    public static /* synthetic */ void J(byte[] byArray, CompletableFuture completableFuture) {
        Object b2 = completableFuture;
        byte[] a2 = byArray;
        ((CompletableFuture)b2).complete(new ByteArrayInputStream(a2));
    }

    /*
     * WARNING - void declaration
     */
    public Kl_3(String string, bx bx2) {
        void b2;
        Kl_3 a2;
        Kl_3 c2 = bx2;
        Kl_3 kl_3 = a2 = this;
        Kl_3 kl_32 = a2;
        a2.I = new ArrayList<CompletableFuture<InputStream>>();
        kl_32.A = new AtomicBoolean(uSa.E != 0);
        kl_3.i = b2;
        kl_3.k = CompletableFuture.completedFuture(c2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public CompletableFuture<InputStream> f() {
        Kl_3 kl_3 = this;
        if (kl_3.M != null) {
            return CompletableFuture.completedFuture(new ByteArrayInputStream(kl_3.M));
        }
        bx bx2 = kl_3.k.getNow(null);
        if (bx2 != null) {
            try {
                return CompletableFuture.completedFuture(bx2.J());
            }
            catch (IOException a2) {
                CompletableFuture<InputStream> completableFuture = new CompletableFuture<InputStream>();
                completableFuture.completeExceptionally(a2);
                return completableFuture;
            }
        }
        CompletableFuture a2 = new CompletableFuture();
        List<CompletableFuture<InputStream>> list = kl_3.I;
        synchronized (list) {
            kl_3.I.add(a2);
            return a2;
        }
    }

    public Kl_3(String string) {
        Kl_3 a2;
        String b2 = string;
        Kl_3 kl_3 = a2 = this;
        Kl_3 kl_32 = a2;
        kl_32.I = new ArrayList<CompletableFuture<InputStream>>();
        kl_3.A = new AtomicBoolean(uSa.E != 0);
        kl_3.i = b2;
        kl_3.k = new CompletableFuture();
    }

    public CompletableFuture<bx> J() {
        Kl_3 a2;
        return a2.k;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    public void J(byte[] byArray) {
        Kl_3 kl_3 = this;
        List<CompletableFuture<InputStream>> b2 = kl_3.I;
        synchronized (b2) {
            void a2;
            kl_3.M = a2;
            kl_3.k.complete(null);
            Kl_3 kl_32 = kl_3;
            kl_32.I.forEach(Sl.J((byte[])a2));
            kl_32.I.clear();
            return;
        }
    }

    public String f() {
        Kl_3 a2;
        return new StringBuilder().insert(3 & 4, dQa.M).append(a2.i).toString();
    }

    public void J() {
        Kl_3 a2;
        OT.i.C.J((Kl)a2);
    }

    public void J(int n2) {
        int b2 = n2;
        Kl_3 a2 = this;
        a2.C = b2;
    }

    public int J() {
        Kl_3 a2;
        return a2.C;
    }

    public static /* synthetic */ void J(Throwable throwable, CompletableFuture completableFuture) {
        CompletableFuture b2 = completableFuture;
        Throwable a2 = throwable;
        b2.completeExceptionally(a2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    public void J(Throwable throwable) {
        Kl_3 kl_3 = this;
        List<CompletableFuture<InputStream>> b2 = kl_3.I;
        synchronized (b2) {
            void a2;
            kl_3.k.completeExceptionally((Throwable)a2);
            Kl_3 kl_32 = kl_3;
            kl_32.I.forEach(dJ.J((Throwable)a2));
            kl_32.I.clear();
            return;
        }
    }

    public String J() {
        Kl_3 a2;
        return a2.i;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    public void J(bx bx2) {
        Kl_3 kl_3 = this;
        List<CompletableFuture<InputStream>> b2 = kl_3.I;
        synchronized (b2) {
            void a2;
            kl_3.k.complete((bx)a2);
            Kl_3 kl_32 = kl_3;
            kl_32.I.forEach(kJ.J((bx)a2));
            kl_32.I.clear();
            return;
        }
    }
}

