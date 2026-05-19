/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  DQa
 *  Ez
 *  NCa
 *  NTa
 *  SRa
 *  Waa
 *  ZRa
 *  vRa
 *  waa
 */
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import java.util.Iterator;
import java.util.UUID;

public final class rba_1 {
    /*
     * WARNING - void declaration
     */
    public static boolean J(NCa nCa2, NCa nCa3, boolean bl) {
        void a2;
        NCa c2;
        void b2;
        NCa nCa4 = nCa2;
        if (nCa4 == b2) {
            return vRa.d != 0;
        }
        if (nCa4 == null) {
            return vRa.d != 0;
        }
        if (b2 == null) {
            return uSa.E != 0;
        }
        if (!nCa4.getClass().equals(b2.getClass())) {
            return uSa.E != 0;
        }
        if (nCa4 instanceof Waa) {
            c2 = (Waa)nCa4;
            Waa waa2 = (Waa)b2;
            for (String string : c2.J()) {
                NCa nCa5 = c2.J(string);
                if (rba_1.J(nCa5, waa2.J(string), (boolean)a2)) continue;
                return uSa.E != 0;
            }
            return vRa.d != 0;
        }
        if (nCa4 instanceof waa && a2 != false) {
            int n2;
            c2 = (waa)nCa4;
            waa waa3 = (waa)b2;
            if (c2.J() == 0) {
                if (waa3.J() == 0) {
                    return vRa.d != 0;
                }
                return uSa.E != 0;
            }
            int n3 = n2 = uSa.E;
            while (n3 < c2.J()) {
                int n4;
                block13: {
                    NCa nCa6 = c2.f(n2);
                    int n5 = uSa.E;
                    int n6 = uSa.E;
                    while (n6 < waa3.J()) {
                        int n7;
                        if (rba_1.J(nCa6, waa3.f(n7), (boolean)a2)) {
                            n4 = n5 = vRa.d;
                            break block13;
                        }
                        n6 = ++n7;
                    }
                    n4 = n5;
                }
                if (n4 == 0) {
                    return uSa.E != 0;
                }
                n3 = ++n2;
            }
            return vRa.d != 0;
        }
        return nCa4.equals((Object)b2);
    }

    public rba_1() {
        rba_1 a2;
    }

    public static GameProfile J(Waa waa2) {
        Waa waa3 = waa2;
        String string = null;
        Object a2 = null;
        if (waa3.J(DQa.N, Yqa.i)) {
            string = waa3.J(DQa.N);
        }
        if (waa3.J(ZRa.Y, Yqa.i)) {
            a2 = waa3.J(ZRa.Y);
        }
        if (Ez.J((String)string) && Ez.J((String)a2)) {
            return null;
        }
        try {
            a2 = UUID.fromString((String)a2);
        }
        catch (Throwable throwable) {
            a2 = null;
        }
        GameProfile gameProfile = new GameProfile((UUID)a2, string);
        if (waa3.J(Yqa.N, NTa.C)) {
            string = waa3.J(Yqa.N);
            for (String string2 : string.J()) {
                waa waa4 = string.J(string2, NTa.C);
                int n2 = uSa.E;
                while (n2 < waa4.J()) {
                    int n3;
                    Waa waa5 = waa4.J(n3);
                    String string3 = waa5.J(FRa.d);
                    GameProfile gameProfile2 = gameProfile;
                    if (waa5.J(SRa.W, Yqa.i)) {
                        String string4 = string2;
                        String string5 = string2;
                        gameProfile2.getProperties().put(string5, new Property(string5, string3, waa5.J(SRa.W)));
                    } else {
                        String string6 = string2;
                        gameProfile2.getProperties().put(string6, new Property(string6, string3));
                    }
                    n2 = ++n3;
                }
            }
        }
        return gameProfile;
    }

    public static Waa J(Waa waa2, GameProfile gameProfile) {
        GameProfile b2 = gameProfile;
        Waa a2 = waa2;
        if (!Ez.J((String)b2.getName())) {
            a2.J(DQa.N, b2.getName());
        }
        if (b2.getId() != null) {
            a2.J(ZRa.Y, b2.getId().toString());
        }
        if (!b2.getProperties().isEmpty()) {
            Iterator iterator;
            Waa waa3 = new Waa();
            Iterator iterator2 = iterator = b2.getProperties().keySet().iterator();
            while (iterator2.hasNext()) {
                String string = (String)iterator.next();
                waa waa4 = new waa();
                Iterator iterator3 = b2.getProperties().get(string).iterator();
                while (iterator3.hasNext()) {
                    Iterator iterator4;
                    Property property = (Property)iterator4.next();
                    Waa waa5 = new Waa();
                    Property property2 = property;
                    waa5.J(FRa.d, property2.getValue());
                    if (property2.hasSignature()) {
                        waa5.J(SRa.W, property.getSignature());
                    }
                    waa4.J((NCa)waa5);
                    iterator3 = iterator4;
                }
                waa3.J(string, (NCa)waa4);
                iterator2 = iterator;
            }
            a2.J(Yqa.N, (NCa)waa3);
        }
        return a2;
    }
}

