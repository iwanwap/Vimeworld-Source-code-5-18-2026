/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  MNa
 *  aOa
 *  vRa
 */
import com.google.common.collect.Lists;
import java.net.InetAddress;
import java.util.Collections;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class goa {
    private List<MNa> A = Lists.newArrayList();
    public boolean I;

    /*
     * WARNING - void declaration
     */
    public synchronized void J(String string, InetAddress inetAddress) {
        String b2;
        goa goa2 = this;
        void v0 = b2;
        b2 = aOa.J((String)v0);
        Object c2 = aOa.f((String)v0);
        if (c2 != null) {
            int n2;
            block3: {
                void a22;
                c2 = new StringBuilder().insert(5 >> 3, a22.getHostAddress()).append(Era.Aa).append((String)c2).toString();
                int a22 = uSa.E;
                for (MNa mNa : goa2.A) {
                    if (!mNa.f().equals(c2)) continue;
                    mNa.J();
                    n2 = a22 = vRa.d;
                    break block3;
                }
                n2 = a22;
            }
            if (n2 == 0) {
                goa2.A.add(new MNa(b2, (String)c2));
                goa2.I = vRa.d;
            }
        }
    }

    public synchronized void J() {
        a.I = uSa.E;
    }

    public synchronized List<MNa> J() {
        goa a2;
        return Collections.unmodifiableList(a2.A);
    }

    public goa() {
        goa a2;
    }

    public synchronized boolean J() {
        goa a2;
        return a2.I;
    }
}

