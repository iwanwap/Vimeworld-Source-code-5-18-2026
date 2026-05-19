/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.rnnoise4j;

import de.maxhenkel.rnnoise4j.NativeInitializer;
import de.maxhenkel.rnnoise4j.UnknownPlatformException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Denoiser
implements AutoCloseable {
    public static final String WEIGHTS_PATH = "/rnnoise/weights_blob.bin";
    private static IOException loadError;
    private static byte[] weights;
    private long pointer;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Denoiser() throws IOException, UnknownPlatformException {
        Class<Denoiser> clazz = Denoiser.class;
        synchronized (Denoiser.class) {
            if (loadError != null) {
                throw new IOException(loadError.getMessage());
            }
            NativeInitializer.load("librnnoise4j");
            if (weights == null) {
                try (InputStream in2 = Denoiser.class.getResourceAsStream(WEIGHTS_PATH);){
                    if (in2 == null) {
                        throw new IOException("Could not find weights");
                    }
                    weights = Denoiser.readAllBytes(in2);
                }
                catch (IOException e2) {
                    loadError = e2;
                    throw e2;
                }
            }
            this.pointer = Denoiser.createDenoiser0(weights);
            // ** MonitorExit[var1_1] (shouldn't be in output)
            return;
        }
    }

    private static byte[] readAllBytes(InputStream in2) throws IOException {
        int n2;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buf = new byte[8192];
        while ((n2 = in2.read(buf)) != -1) {
            out.write(buf, 0, n2);
        }
        return out.toByteArray();
    }

    private static native long createDenoiser0(byte[] var0);

    private static native int getFrameSize0();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public int getFrameSize() {
        Denoiser denoiser = this;
        synchronized (denoiser) {
            return Denoiser.getFrameSize0();
        }
    }

    private native short[] denoise0(long var1, short[] var3);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public short[] denoise(short[] input) {
        Denoiser denoiser = this;
        synchronized (denoiser) {
            return this.denoise0(this.pointer, input);
        }
    }

    private native float denoiseInPlace0(long var1, short[] var3);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public float denoiseInPlace(short[] input) {
        Denoiser denoiser = this;
        synchronized (denoiser) {
            return this.denoiseInPlace0(this.pointer, input);
        }
    }

    private native float getSpeechProbability0(long var1, short[] var3);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public float getSpeechProbability(short[] input) {
        Denoiser denoiser = this;
        synchronized (denoiser) {
            return this.getSpeechProbability0(this.pointer, input);
        }
    }

    private native void destroyDenoiser0(long var1);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void close() {
        Denoiser denoiser = this;
        synchronized (denoiser) {
            this.destroyDenoiser0(this.pointer);
            this.pointer = 0L;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean isClosed() {
        Denoiser denoiser = this;
        synchronized (denoiser) {
            return this.pointer == 0L;
        }
    }
}

