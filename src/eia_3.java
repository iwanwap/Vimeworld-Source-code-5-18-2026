/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  NOa
 *  QSa
 *  U
 *  j
 *  kga
 *  uRa
 *  vRa
 *  xha
 *  yga
 *  yia
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import net.minecraft.client.resources.IResourcePack;
import net.minecraft.util.StringTranslate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class eia_3
implements j {
    public static final yga k;
    private String j;
    private final kga J;
    private Map<String, yia> A;
    private static final Logger I;

    public boolean f() {
        eia_3 a2;
        if (a2.J() != null && a2.J().isBidirectional()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(U u2) {
        void a2;
        eia_3 eia_32 = this;
        String[] stringArray = new String[vRa.d];
        stringArray[uSa.E] = NOa.h;
        ArrayList<String> b2 = Lists.newArrayList(stringArray);
        if (!NOa.h.equals(eia_32.j)) {
            b2.add(eia_32.j);
        }
        k.J((U)a2, (List)b2);
        StringTranslate.J(eia_3.k.A);
    }

    /*
     * WARNING - void declaration
     */
    public eia_3(kga kga2, String string) {
        void b2;
        eia_3 a2;
        String c2 = string;
        eia_3 eia_32 = a2 = this;
        a2.A = Maps.newHashMap();
        eia_32.J = b2;
        eia_32.j = c2;
        oha.J(k);
    }

    public void J(yia yia2) {
        eia_3 b2 = yia2;
        eia_3 a2 = this;
        a2.j = b2.getLanguageCode();
    }

    public boolean J() {
        return k.J();
    }

    public SortedSet<yia> J() {
        eia_3 a2;
        return Sets.newTreeSet(a2.A.values());
    }

    public yia J() {
        eia_3 a2;
        eia_3 eia_32 = a2;
        if (eia_32.A.containsKey(eia_32.j)) {
            eia_3 eia_33 = a2;
            return eia_33.A.get(eia_33.j);
        }
        return a2.A.get(NOa.h);
    }

    static {
        I = LogManager.getLogger();
        k = new yga();
    }

    public void J(List<IResourcePack> list) {
        Iterator a2;
        eia_3 eia_32 = this;
        eia_32.A.clear();
        a2 = a2.iterator();
        while (a2.hasNext()) {
            IResourcePack iResourcePack = (IResourcePack)a2.next();
            try {
                eia_3 b2 = (xha)iResourcePack.J(eia_32.J, uRa.Y);
                if (b2 == null) continue;
                for (yia yia2 : b2.J()) {
                    if (eia_32.A.containsKey(yia2.getLanguageCode())) continue;
                    eia_32.A.put(yia2.getLanguageCode(), yia2);
                }
            }
            catch (RuntimeException b2) {
                I.warn(new StringBuilder().insert(3 >> 2, QSa.u).append(iResourcePack.J()).toString(), (Throwable)b2);
            }
            catch (IOException b2) {
                I.warn(new StringBuilder().insert(3 & 4, QSa.u).append(iResourcePack.J()).toString(), (Throwable)b2);
            }
        }
    }
}

