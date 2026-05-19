/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Usa
 *  ay
 *  hra
 *  vRa
 */
import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.util.UUID;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class cZ_1
extends ay<GameProfile> {
    private final boolean field_183025_b;
    private final int field_152645_a;

    public cZ_1(JsonObject jsonObject) {
        JsonObject b2 = jsonObject;
        cZ_1 a2 = this;
        super((Object)cZ_1.J(b2), b2);
        a2.field_152645_a = b2.has(hra.x) ? b2.get(hra.x).getAsInt() : uSa.E;
        a2.field_183025_b = b2.has(Zra.B) && b2.get(Zra.B).getAsBoolean() ? vRa.d : uSa.E;
    }

    public boolean f() {
        cZ_1 a2;
        return a2.field_183025_b;
    }

    /*
     * WARNING - void declaration
     */
    public cZ_1(GameProfile gameProfile, int n2, boolean bl) {
        void b2;
        void c2;
        cZ_1 a2;
        boolean d2 = bl;
        cZ_1 cZ_12 = a2 = this;
        super((Object)c2);
        cZ_12.field_152645_a = b2;
        cZ_12.field_183025_b = d2;
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

    public int J() {
        cZ_1 a2;
        return a2.field_152645_a;
    }

    public void J(JsonObject jsonObject) {
        JsonObject b2 = jsonObject;
        Object a2 = this;
        if (a2.J() != null) {
            b2.addProperty(Usa.w, ((GameProfile)a2.J()).getId() == null ? Mqa.y : ((GameProfile)a2.J()).getId().toString());
            b2.addProperty(dua.T, ((GameProfile)a2.J()).getName());
            Object object = b2;
            super.J((JsonObject)object);
            ((JsonObject)object).addProperty(hra.x, a2.field_152645_a);
            ((JsonObject)object).addProperty(Zra.B, a2.field_183025_b);
        }
    }
}

