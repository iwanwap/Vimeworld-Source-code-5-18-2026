/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Kpa
 *  cMa
 */
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import net.minecraft.client.resources.IResource;

public final class hma_2
extends URLConnection {
    public final /* synthetic */ cMa I;

    @Override
    public InputStream getInputStream() throws IOException {
        hma_2 hma_22 = this;
        IResource a2 = Kpa.J().J().J(hma_22.I.I);
        if (a2 == null) {
            return null;
        }
        return a2.J();
    }

    /*
     * WARNING - void declaration
     */
    public hma_2(cMa cMa2, URL uRL) {
        void b2;
        URL c2 = uRL;
        hma_2 a2 = this;
        a2.I = b2;
        super(c2);
    }

    @Override
    public void connect() throws IOException {
    }
}

