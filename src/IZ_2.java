/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Jaa
 *  ay
 *  fz
 */
import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.io.File;
import java.util.Iterator;

public final class IZ_2
extends fz<GameProfile, Jaa> {
    public String[] J() {
        IZ_2 iZ_2 = this;
        String[] stringArray = new String[iZ_2.J().size()];
        int n2 = uSa.E;
        Iterator a2 = iZ_2.J().values().iterator();
        Object object = a2;
        while (object.hasNext()) {
            Jaa jaa2 = (Jaa)a2.next();
            stringArray[n2++] = ((GameProfile)jaa2.J()).getName();
            object = a2;
        }
        return stringArray;
    }

    public String J(GameProfile gameProfile) {
        GameProfile b2 = gameProfile;
        IZ_2 a2 = this;
        return b2.getId().toString();
    }

    /*
     * WARNING - void declaration
     */
    public GameProfile J(String string) {
        IZ_2 iZ_2 = this;
        for (IZ_2 b2 : iZ_2.J().values()) {
            void a2;
            if (!a2.equalsIgnoreCase(((GameProfile)b2.J()).getName())) continue;
            return (GameProfile)b2.J();
        }
        return null;
    }

    public IZ_2(File file) {
        Object b2 = file;
        IZ_2 a2 = this;
        super((File)b2);
    }

    public ay<GameProfile> J(JsonObject jsonObject) {
        Object b2 = jsonObject;
        IZ_2 a2 = this;
        return new Jaa((JsonObject)b2);
    }
}

