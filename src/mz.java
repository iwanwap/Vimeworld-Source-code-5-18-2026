/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ISa
 *  Iz
 *  OCa
 *  Usa
 *  gc
 *  kPa
 *  nQa
 *  pua
 *  vRa
 */
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.ServerSocket;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class mz {
    private static final Logger J;
    private static final AtomicInteger A;
    public static final ListeningExecutorService I;

    /*
     * WARNING - void declaration
     */
    public static ListenableFuture<Object> J(File object, String string, Map<String, String> map, int n2, gc gc2, Proxy proxy) {
        void c2;
        void d2;
        File f2;
        void e2;
        void b2;
        File file = object;
        object = proxy;
        File a2 = file;
        return I.submit((Runnable)new Iz((gc)b2, (String)e2, (Proxy)((Object)f2), (Map)d2, a2, (int)c2));
    }

    static {
        I = MoreExecutors.listeningDecorator(Executors.newCachedThreadPool(new ThreadFactoryBuilder().setDaemon(vRa.d != 0).setNameFormat(STa.v).build()));
        A = new AtomicInteger(uSa.E);
        J = LogManager.getLogger();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int J() throws IOException {
        ServerSocket serverSocket = null;
        int n2 = pua.o;
        try {
            serverSocket = new ServerSocket(uSa.E);
            n2 = serverSocket.getLocalPort();
        }
        catch (Throwable throwable) {
            try {
                if (serverSocket == null) throw throwable;
                serverSocket.close();
                throw throwable;
            }
            catch (IOException iOException) {}
            throw throwable;
        }
        try {
            if (serverSocket == null) return n2;
            serverSocket.close();
            return n2;
        }
        catch (IOException iOException) {
            return n2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static String J(URL uRL, Map<String, Object> map, boolean bl) {
        void b2;
        boolean c2 = bl;
        URL a2 = uRL;
        return mz.J(a2, mz.J((Map<String, Object>)b2), c2);
    }

    public static String J(Map<String, Object> map) {
        Map<String, Object> map2 = map;
        StringBuilder a2 = new StringBuilder();
        for (Map.Entry<String, Object> entry : map2.entrySet()) {
            Map.Entry<String, Object> entry2;
            if (a2.length() > 0) {
                a2.append((char)ISa.E);
            }
            try {
                a2.append(URLEncoder.encode(entry.getKey(), wsa.H));
                entry2 = entry;
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
                entry2 = entry;
                unsupportedEncodingException.printStackTrace();
            }
            if (entry2.getValue() == null) continue;
            a2.append((char)tua.w);
            try {
                a2.append(URLEncoder.encode(entry.getValue().toString(), wsa.H));
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
                unsupportedEncodingException.printStackTrace();
            }
        }
        return a2.toString();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String J(URL uRL, String string, boolean bl) {
        BufferedReader b2;
        Object c2;
        Proxy proxy;
        URL uRL2 = uRL;
        try {
            Proxy proxy2 = proxy = OCa.J() == null ? null : OCa.J().J();
        }
        catch (Exception exception) {
            void a2;
            if (a2 == false) {
                J.error(new StringBuilder().insert(3 ^ 3, kPa.K).append(uRL2).toString(), (Throwable)exception);
            }
            return Mqa.y;
        }
        {
            String string2;
            if (proxy == null) {
                proxy = Proxy.NO_PROXY;
            }
            c2 = (HttpURLConnection)uRL2.openConnection(proxy);
            ((HttpURLConnection)c2).setRequestMethod(ypa.Ja);
            ((URLConnection)c2).setRequestProperty(ySa.B, VPa.m);
            ((URLConnection)c2).setRequestProperty(nQa.Ka, new StringBuilder().insert(3 & 4, Mqa.y).append(((String)((Object)b2)).getBytes().length).toString());
            Object object = c2;
            ((URLConnection)object).setRequestProperty(wta.G, Usa.c);
            ((URLConnection)object).setUseCaches(uSa.E != 0);
            ((URLConnection)object).setDoInput(vRa.d != 0);
            ((URLConnection)object).setDoOutput(vRa.d != 0);
            DataOutputStream dataOutputStream = new DataOutputStream(((URLConnection)c2).getOutputStream());
            dataOutputStream.writeBytes((String)((Object)b2));
            dataOutputStream.flush();
            dataOutputStream.close();
            b2 = new BufferedReader(new InputStreamReader(((URLConnection)c2).getInputStream()));
            c2 = new StringBuffer();
            BufferedReader bufferedReader = b2;
            while ((string2 = bufferedReader.readLine()) != null) {
                bufferedReader = b2;
                ((StringBuffer)c2).append(string2);
                ((StringBuffer)c2).append((char)uua.s);
            }
        }
        {
            b2.close();
            return ((StringBuffer)c2).toString();
        }
    }

    public static /* synthetic */ Logger J() {
        return J;
    }

    public mz() {
        mz a2;
    }

    public static String J(URL uRL) throws IOException {
        String string;
        URL uRL2 = uRL;
        Object a2 = (HttpURLConnection)uRL2.openConnection();
        ((HttpURLConnection)a2).setRequestMethod(Iqa.J);
        a2 = new BufferedReader(new InputStreamReader(((URLConnection)a2).getInputStream()));
        StringBuilder stringBuilder = new StringBuilder();
        Object object = a2;
        while ((string = ((BufferedReader)object).readLine()) != null) {
            object = a2;
            stringBuilder.append(string);
            stringBuilder.append((char)uua.s);
        }
        ((BufferedReader)a2).close();
        return stringBuilder.toString();
    }
}

