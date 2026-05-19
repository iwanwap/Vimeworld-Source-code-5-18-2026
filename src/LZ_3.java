/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ay
 *  cZ
 *  fz
 */
import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.io.File;
import java.util.Iterator;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class LZ_3
extends fz<GameProfile, cZ> {
    public String[] J() {
        LZ_3 lZ_3 = this;
        String[] stringArray = new String[lZ_3.J().size()];
        int n2 = uSa.E;
        Iterator a2 = lZ_3.J().values().iterator();
        Object object = a2;
        while (object.hasNext()) {
            cZ cZ2 = (cZ)a2.next();
            stringArray[n2++] = ((GameProfile)cZ2.J()).getName();
            object = a2;
        }
        return stringArray;
    }

    public ay<GameProfile> J(JsonObject jsonObject) {
        Object b2 = jsonObject;
        LZ_3 a2 = this;
        return new cZ((JsonObject)b2);
    }

    public LZ_3(File file) {
        Object b2 = file;
        LZ_3 a2 = this;
        super((File)b2);
    }

    /*
     * WARNING - void declaration
     */
    public GameProfile J(String string) {
        LZ_3 lZ_3 = this;
        for (LZ_3 b2 : lZ_3.J().values()) {
            void a2;
            if (!a2.equalsIgnoreCase(((GameProfile)b2.J()).getName())) continue;
            return (GameProfile)b2.J();
        }
        return null;
    }

    public boolean J(GameProfile gameProfile) {
        Object b2 = gameProfile;
        LZ_3 a2 = this;
        if ((b2 = (cZ)a2.J(b2)) != null) {
            return b2.f();
        }
        return uSa.E != 0;
    }

    public String J(GameProfile gameProfile) {
        GameProfile b2 = gameProfile;
        LZ_3 a2 = this;
        return b2.getId().toString();
    }
}

