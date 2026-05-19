/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  WSa
 *  ay
 *  fz
 *  raa
 *  uOa
 *  vRa
 */
import com.google.gson.JsonObject;
import java.io.File;
import java.net.SocketAddress;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class NX
extends fz<String, raa> {
    public boolean J(SocketAddress socketAddress) {
        NX a2;
        Object b2 = socketAddress;
        NX nX = a2 = this;
        return nX.J(nX.J((SocketAddress)b2));
    }

    private String J(SocketAddress socketAddress) {
        Object b2 = socketAddress;
        NX a2 = this;
        if (((String)(b2 = b2.toString())).contains(WSa.f)) {
            Object object = b2;
            b2 = ((String)object).substring(((String)object).indexOf(uOa.F) + vRa.d);
        }
        if (((String)b2).contains(Era.Aa)) {
            Object object = b2;
            b2 = ((String)object).substring(uSa.E, ((String)object).indexOf(lQa.R));
        }
        return b2;
    }

    public raa J(SocketAddress socketAddress) {
        NX a2;
        Object b2 = socketAddress;
        NX nX = a2 = this;
        return (raa)nX.J(nX.J((SocketAddress)b2));
    }

    public ay<String> J(JsonObject jsonObject) {
        Object b2 = jsonObject;
        NX a2 = this;
        return new raa((JsonObject)b2);
    }

    public NX(File file) {
        Object b2 = file;
        NX a2 = this;
        super((File)b2);
    }
}

