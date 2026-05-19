/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Usa
 *  ay
 */
import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.util.UUID;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Jaa_3
extends ay<GameProfile> {
    public void J(JsonObject jsonObject) {
        JsonObject b2 = jsonObject;
        Object a2 = this;
        if (a2.J() != null) {
            b2.addProperty(Usa.w, ((GameProfile)a2.J()).getId() == null ? Mqa.y : ((GameProfile)a2.J()).getId().toString());
            b2.addProperty(dua.T, ((GameProfile)a2.J()).getName());
            super.J(b2);
        }
    }

    private static GameProfile J(JsonObject jsonObject) {
        JsonObject jsonObject2 = jsonObject;
        if (jsonObject2.has(Usa.w) && jsonObject2.has(dua.T)) {
            Object a2 = jsonObject2.get(Usa.w).getAsString();
            try {
                a2 = UUID.fromString((String)a2);
            }
            catch (Throwable throwable) {
                return null;
            }
            return new GameProfile((UUID)a2, jsonObject2.get(dua.T).getAsString());
        }
        return null;
    }

    public Jaa_3(JsonObject jsonObject) {
        Object b2 = jsonObject;
        Jaa_3 a2 = this;
        super((Object)Jaa_3.J((JsonObject)b2), (JsonObject)b2);
    }

    public Jaa_3(GameProfile gameProfile) {
        Object b2 = gameProfile;
        Jaa_3 a2 = this;
        super(b2);
    }
}

