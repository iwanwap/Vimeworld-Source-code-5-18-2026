/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ru.vimeworld.brainstorm.NativeClassLoaderUtils
 */
package com.mojang.authlib;

import com.google.common.collect.Sets;
import com.mojang.authlib.BaseAuthenticationService;
import com.mojang.authlib.HttpAuthenticationService$$Lambda$1;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.vimeworld.brainstorm.NativeClassLoaderUtils;

public abstract class HttpAuthenticationService
extends BaseAuthenticationService {
    private static final Logger LOGGER = LogManager.getLogger();
    private final Proxy proxy;
    Map<String, IpRotationTracker> hostConnectionFailure = new ConcurrentHashMap<String, IpRotationTracker>();
    Set<String> TRUSTED_CERTS = Sets.newHashSet("3ABBE63DAF756C5016B6B85F52015FD8E8ACBE277C5087B127A60563A841ED8A", "6D99FB265EB1C5B3744765FCBC648F3CD8E1BFFAFDC4C2F99B9D47CF7FF1C24F");

    protected HttpAuthenticationService(Proxy proxy) {
        Validate.notNull(proxy);
        this.proxy = proxy;
    }

    public Proxy getProxy() {
        return this.proxy;
    }

    protected HttpURLConnection createUrlConnection(URL url) throws IOException {
        Validate.notNull(url);
        LOGGER.debug("Opening connection to " + url);
        IpRotationTracker tracker = this.hostConnectionFailure.computeIfAbsent(url.getHost().toLowerCase(Locale.ROOT), HttpAuthenticationService$$Lambda$1.lambdaFactory$());
        if (tracker.cache == null) {
            // empty if block
        }
        if (tracker.lastFailed) {
            tracker.rotate();
            tracker.lastFailed = false;
        }
        HttpURLConnection connection = (HttpURLConnection)url.openConnection(this.proxy);
        connection.setConnectTimeout(10000);
        connection.setReadTimeout(10000);
        connection.setUseCaches(false);
        return connection;
    }

    private void validateCertificate(HttpURLConnection connection) throws IOException {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String performPostRequest(URL url, String post, String contentType) throws IOException {
        Validate.notNull(url);
        Validate.notNull(post);
        Validate.notNull(contentType);
        byte[] postAsBytes = post.getBytes(Charsets.UTF_8);
        HttpURLConnection connection = this.createUrlConnection(url);
        connection.setRequestProperty("Content-Type", contentType + "; charset=utf-8");
        connection.setRequestProperty("Content-Length", "" + postAsBytes.length);
        LOGGER.debug("Writing POST data to " + url + ": " + post);
        try {
            byte[] encrypted;
            if ((url.getHost().equals("sessionserver.vimeworld.com") || url.getHost().equals("sessionservernew.vimeworld.com")) && url.getPath().equals("/join") && (encrypted = (byte[])NativeClassLoaderUtils.call((Object)new Object[]{"sessionserverEncrypt", postAsBytes})) != null) {
                postAsBytes = encrypted;
                connection.setRequestProperty("Content-Encoding", "brainstorm");
                connection.setRequestProperty("Accept-Encoding", "brainstorm");
            }
        }
        catch (UnsatisfiedLinkError ex2) {
            LOGGER.warn("Native call failed (" + ex2.getMessage() + ")");
        }
        connection.setDoOutput(true);
        this.validateCertificate(connection);
        try (OutputStream outputStream = connection.getOutputStream();){
            IOUtils.write(postAsBytes, outputStream);
        }
        catch (IOException e2) {
            connection.disconnect();
            IpRotationTracker tracker222 = this.hostConnectionFailure.get(url.getHost().toLowerCase(Locale.ROOT));
            if (!tracker222.canRotate()) throw e2;
            tracker222.lastFailed = true;
            return this.performPostRequest(url, post, contentType);
        }
        LOGGER.debug("Reading data from " + url);
        try (InputStream inputStream = connection.getInputStream();){
            String result;
            Object bytes;
            if ("brainstorm".equals(connection.getHeaderField("Content-Encoding"))) {
                bytes = IOUtils.toByteArray(inputStream);
                try {
                    byte[] decoded = (byte[])NativeClassLoaderUtils.call((Object)new Object[]{"sessionserverDecrypt", bytes});
                    if (decoded != null) {
                        bytes = decoded;
                    }
                }
                catch (UnsatisfiedLinkError ex3) {
                    LOGGER.warn("Native call failed (" + ex3.getMessage() + ")");
                }
                result = new String((byte[])bytes, Charsets.UTF_8);
            } else {
                result = IOUtils.toString(inputStream, Charsets.UTF_8);
            }
            LOGGER.debug("Successful read, server response was " + connection.getResponseCode());
            LOGGER.debug("Response: " + result);
            bytes = result;
            return bytes;
        }
        catch (IOException e3) {
            String result2;
            InputStream errorStream = connection.getErrorStream();
            if (errorStream == null) {
                LOGGER.debug("Request failed", (Throwable)e3);
                throw e3;
            }
            LOGGER.debug("Reading error page from " + url);
            if ("brainstorm".equals(connection.getHeaderField("Content-Encoding"))) {
                byte[] bytes2 = IOUtils.toByteArray(errorStream);
                try {
                    bytes2 = (byte[])NativeClassLoaderUtils.call((Object)new Object[]{"sessionserverDecrypt", bytes2});
                }
                catch (UnsatisfiedLinkError ex4) {
                    LOGGER.warn("Native call failed (" + ex4.getMessage() + ")");
                }
                String result3 = new String(bytes2, Charsets.UTF_8);
            } else {
                result2 = IOUtils.toString(errorStream, Charsets.UTF_8);
            }
            LOGGER.debug("Successful read, server response was " + connection.getResponseCode());
            LOGGER.debug("Response: " + result2);
            return result2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String performGetRequest(URL url) throws IOException {
        Validate.notNull(url);
        HttpURLConnection connection = this.createUrlConnection(url);
        LOGGER.debug("Reading data from " + url);
        this.validateCertificate(connection);
        try {
            connection.connect();
        }
        catch (IOException e2) {
            connection.disconnect();
            IpRotationTracker tracker222 = this.hostConnectionFailure.get(url.getHost().toLowerCase(Locale.ROOT));
            if (!tracker222.canRotate()) throw e2;
            tracker222.lastFailed = true;
            return this.performGetRequest(url);
        }
        try (InputStream inputStream = connection.getInputStream();){
            String result = IOUtils.toString(inputStream, Charsets.UTF_8);
            LOGGER.debug("Successful read, server response was " + connection.getResponseCode());
            LOGGER.debug("Response: " + result);
            String string = result;
            return string;
        }
        catch (IOException e3) {
            InputStream errorStream = connection.getErrorStream();
            if (errorStream != null) {
                LOGGER.debug("Reading error page from " + url);
                String result2 = IOUtils.toString(errorStream, Charsets.UTF_8);
                LOGGER.debug("Successful read, server response was " + connection.getResponseCode());
                LOGGER.debug("Response: " + result2);
                return result2;
            }
            LOGGER.debug("Request failed", (Throwable)e3);
            throw e3;
        }
    }

    public static URL constantURL(String url) {
        try {
            return new URL(url);
        }
        catch (MalformedURLException ex2) {
            throw new Error("Couldn't create constant for " + url, ex2);
        }
    }

    public static String buildQuery(Map<String, Object> query) {
        if (query == null) {
            return "";
        }
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<String, Object> entry : query.entrySet()) {
            if (builder.length() > 0) {
                builder.append('&');
            }
            try {
                builder.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
            }
            catch (UnsupportedEncodingException e2) {
                LOGGER.error("Unexpected exception building query", (Throwable)e2);
            }
            if (entry.getValue() == null) continue;
            builder.append('=');
            try {
                builder.append(URLEncoder.encode(entry.getValue().toString(), "UTF-8"));
            }
            catch (UnsupportedEncodingException e3) {
                LOGGER.error("Unexpected exception building query", (Throwable)e3);
            }
        }
        return builder.toString();
    }

    public static URL concatenateURL(URL url, String query) {
        try {
            if (url.getQuery() != null && url.getQuery().length() > 0) {
                return new URL(url.getProtocol(), url.getHost(), url.getPort(), url.getFile() + "&" + query);
            }
            return new URL(url.getProtocol(), url.getHost(), url.getPort(), url.getFile() + "?" + query);
        }
        catch (MalformedURLException ex2) {
            throw new IllegalArgumentException("Could not concatenate given URL with GET arguments!", ex2);
        }
    }

    static /* synthetic */ IpRotationTracker lambda$createUrlConnection$0(String k2) {
        return new IpRotationTracker();
    }

    private static class IpRotationTracker {
        boolean lastFailed;
        int rotations;
        InetAddress[] cache;

        private IpRotationTracker() {
        }

        boolean canRotate() {
            return this.cache != null && this.cache.length > 1 && this.rotations < this.cache.length - 1;
        }

        void rotate() {
            if (this.canRotate()) {
                InetAddress first = this.cache[0];
                for (int i2 = 0; i2 < this.cache.length - 1; ++i2) {
                    this.cache[i2] = this.cache[i2 + 1];
                }
                this.cache[this.cache.length - 1] = first;
                ++this.rotations;
            }
        }
    }
}

