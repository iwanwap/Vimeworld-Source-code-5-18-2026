/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Ez
 *  MY
 *  OCa
 *  RQa
 *  dQa
 *  oqa
 *  vRa
 */
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.mojang.authlib.Agent;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;
import java.io.File;
import java.util.Collection;
import java.util.UUID;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class tY_1 {
    public static final File k;
    public static final File j;
    public static final File J;
    public static final File A;
    private static final Logger I;

    static {
        I = LogManager.getLogger();
        J = new File(dQa.h);
        A = new File(oqa.f);
        j = new File(RQa.y);
        k = new File(fta.V);
    }

    /*
     * WARNING - void declaration
     */
    private static void J(OCa oCa2, Collection<String> collection, ProfileLookupCallback profileLookupCallback) {
        int n2;
        void a2;
        Object c2 = collection;
        OCa b2 = oCa2;
        c2 = Iterators.toArray(Iterators.filter(c2.iterator(), new NY()), String.class);
        if (b2.G()) {
            b2.J().findProfilesByNames((String[])c2, Agent.MINECRAFT, (ProfileLookupCallback)a2);
            return;
        }
        int n3 = ((Object)c2).length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            Object object = c2[n2];
            UUID uUID = Sx.J(new GameProfile(null, (String)object));
            object = new GameProfile(uUID, (String)object);
            a2.onProfileLookupSucceeded((GameProfile)object);
            n4 = ++n2;
        }
    }

    public static String J(String string) {
        String string2 = string;
        if (!Ez.J((String)string2) && string2.length() <= ERa.C) {
            OCa oCa2 = OCa.J();
            Object a2 = oCa2.J().J(string2);
            if (a2 != null && ((GameProfile)a2).getId() != null) {
                return ((GameProfile)a2).getId().toString();
            }
            if (!oCa2.E() && oCa2.G()) {
                a2 = Lists.newArrayList();
                MY mY2 = new MY(oCa2, a2);
                String[] stringArray = new String[vRa.d];
                stringArray[uSa.E] = string2;
                tY_1.J(oCa2, Lists.newArrayList(stringArray), (ProfileLookupCallback)mY2);
                if (a2.size() > 0 && ((GameProfile)a2.get(uSa.E)).getId() != null) {
                    return ((GameProfile)a2.get(uSa.E)).getId().toString();
                }
                return Mqa.y;
            }
            return Sx.J(new GameProfile(null, string2)).toString();
        }
        return string2;
    }

    public tY_1() {
        tY_1 a2;
    }

    public static /* synthetic */ Logger J() {
        return I;
    }
}

