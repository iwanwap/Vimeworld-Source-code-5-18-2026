/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EQa
 *  US
 *  eC
 *  hra
 *  pua
 *  rt
 *  vRa
 *  wI
 *  zs
 */
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class rt_1 {
    private BiMap<String, eC<?>> options;

    public Optional<US> l(String string) {
        String b2 = string;
        rt_1 a2 = this;
        return Optional.ofNullable((US)a2.options.get(b2));
    }

    public <T> eC<T> J(String string) {
        String b2 = string;
        rt_1 a2 = this;
        return (eC)a2.options.get(b2);
    }

    public US J(String string) {
        String b2 = string;
        rt_1 a2 = this;
        return (US)a2.options.get(b2);
    }

    public <T> Optional<eC<T>> f(String string) {
        String b2 = string;
        rt_1 a2 = this;
        return Optional.ofNullable(a2.J(b2));
    }

    public rt_1(rt rt2) {
        Object b2 = rt2;
        rt_1 a2 = this;
        a2.options = ImmutableBiMap.of();
        if (b2 == null) {
            return;
        }
        if (((rt_1)b2).options.isEmpty()) {
            return;
        }
        a2.options = HashBiMap.create();
        Object object = b2 = ((rt_1)b2).J().entrySet().iterator();
        while (object.hasNext()) {
            Map.Entry entry = (Map.Entry)b2.next();
            if (entry.getValue() == null) {
                object = b2;
                continue;
            }
            a2.options.put((String)entry.getKey(), (eC<?>)((eC)entry.getValue()).clone());
            object = b2;
        }
    }

    public String toString() {
        rt_1 a2;
        return new StringBuilder().insert(2 & 5, fta.Y).append(a2.options).append((char)ySa.Z).toString();
    }

    public BiMap<String, eC<?>> J() {
        rt_1 a2;
        return a2.options;
    }

    public zs J() {
        rt_1 a2;
        return (zs)a2.options.get(EQa.Ga);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void J(wI wI2) {
        Iterator a2;
        rt_1 rt_12 = this;
        a2 = a2.entrySet().iterator();
        block12: while (true) {
            int n2;
            Map.Entry entry;
            block14: {
                if (!a2.hasNext()) {
                    return;
                }
                entry = (Map.Entry)a2.next();
                String string = (String)entry.getKey();
                int n3 = pua.o;
                switch (string.hashCode()) {
                    case 113839: {
                        if (!string.equals(AQa.N)) break;
                        n2 = n3 = uSa.E;
                        break block14;
                    }
                    case 108: {
                        if (!string.equals(iSa.W)) break;
                        n2 = n3 = vRa.d;
                        break block14;
                    }
                    case 115: {
                        if (!string.equals(wsa.Q)) break;
                        n3 = uqa.g;
                    }
                }
                n2 = n3;
            }
            switch (n2) {
                case 0: {
                    Object b2 = rt_12.J();
                    if (b2 == null) continue block12;
                    b2.J(entry.getValue().toString());
                    continue block12;
                }
                case 1: {
                    Object b2 = rt_12.J(hra.x);
                    if (b2 == null) continue block12;
                    ((lu)b2).J((Double)entry.getValue());
                    continue block12;
                }
                case 2: {
                    Object b2 = rt_12.J(sqa.b);
                    if (b2 == null) continue block12;
                    try {
                        ((lu)b2).J((Double)Double.parseDouble(entry.getValue().toString()));
                    }
                    catch (Exception exception) {}
                    continue block12;
                }
            }
        }
    }

    public boolean J() {
        rt_1 a2;
        if (!a2.J().isEmpty()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean equals(Object object) {
        Object b2 = object;
        rt_1 a2 = this;
        if (b2 == null || a2.getClass() != b2.getClass()) {
            return uSa.E != 0;
        }
        b2 = (rt_1)b2;
        return Objects.equals(a2.options, ((rt_1)b2).options);
    }

    public lu J(String string) {
        String b2 = string;
        rt_1 a2 = this;
        return (lu)a2.options.get(b2);
    }

    public Optional<lu> J(String string) {
        String b2 = string;
        rt_1 a2 = this;
        return Optional.ofNullable((lu)a2.options.get(b2));
    }

    public Optional<zs> J() {
        rt_1 a2;
        return Optional.ofNullable((zs)a2.options.get(EQa.Ga));
    }

    public rt J(eC<?> eC2) {
        eC<?> b2 = eC2;
        eC<?> a2 = this;
        if (a2.options.isEmpty()) {
            a2.options = HashBiMap.create();
        }
        eC<?> eC3 = a2;
        eC3.options.put(b2.f(), b2);
        return eC3;
    }

    public rt_1() {
        rt_1 a2;
        a2.options = ImmutableBiMap.of();
    }
}

