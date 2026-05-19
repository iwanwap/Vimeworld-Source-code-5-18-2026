/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CY
 *  CZ
 *  Ey
 *  Nz
 *  Vz
 *  XTa
 *  bua
 *  by
 *  ld
 *  psa
 *  vRa
 *  zsa
 */
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class CZ_2
extends by {
    private final Object syncLock;
    public static final Pattern stringVariablePattern = Pattern.compile(Npa.X);
    private final Object[] formatArgs;
    public List<ld> children;
    private long lastTranslationUpdateTimeInMilliseconds;
    private final String key;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public synchronized void J() {
        CZ_2 cZ_2 = this;
        Object a22 = cZ_2.syncLock;
        synchronized (a22) {
            long l2;
            block8: {
                l2 = Ey.J();
                if (l2 != cZ_2.lastTranslationUpdateTimeInMilliseconds) break block8;
                return;
            }
            cZ_2.lastTranslationUpdateTimeInMilliseconds = l2;
            cZ_2.children.clear();
        }
        try {
            cZ_2.J(Ey.f((String)cZ_2.key));
            return;
        }
        catch (Nz a22) {
            cZ_2.children.clear();
            try {
                CZ_2 cZ_22 = cZ_2;
                cZ_22.J(Ey.J((String)cZ_22.key));
                return;
            }
            catch (Nz nz2) {
                throw a22;
            }
        }
    }

    public String J() {
        CZ_2 cZ_2;
        CZ_2 cZ_22 = cZ_2 = this;
        cZ_22.J();
        StringBuilder stringBuilder = new StringBuilder();
        Iterator<ld> a2 = cZ_22.children.iterator();
        Object object = a2;
        while (object.hasNext()) {
            ld ld2 = (ld)a2.next();
            object = a2;
            stringBuilder.append(ld2.J());
        }
        return stringBuilder.toString();
    }

    public String toString() {
        CZ_2 a2;
        return new StringBuilder().insert(5 >> 3, bua.N).append(a2.key).append((char)CRa.L).append(rQa.F).append(Arrays.toString(a2.formatArgs)).append(zsa.s).append(a2.siblings).append(psa.b).append(a2.J()).append((char)ySa.Z).toString();
    }

    public boolean equals(Object object) {
        CZ_2 a2 = this;
        Object b2 = object;
        if (a2 == b2) {
            return vRa.d != 0;
        }
        if (!(b2 instanceof CZ_2)) {
            return uSa.E != 0;
        }
        Object object2 = b2;
        if (Arrays.equals(a2.formatArgs, object2.formatArgs) && a2.key.equals(object2.key) && super.equals(b2)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public String C() {
        CZ_2 a2;
        return a2.key;
    }

    public CZ J() {
        int a22;
        CZ_2 cZ_2 = this;
        Object object = new Object[cZ_2.formatArgs.length];
        int n2 = a22 = uSa.E;
        while (n2 < cZ_2.formatArgs.length) {
            if (cZ_2.formatArgs[a22] instanceof ld) {
                int n3 = a22;
                object[n3] = ((ld)cZ_2.formatArgs[n3]).J();
            } else {
                int n4 = a22;
                object[n4] = cZ_2.formatArgs[n4];
            }
            n2 = ++a22;
        }
        CZ_2 a22 = new CZ_2(cZ_2.key, (Object[])object);
        a22.J(cZ_2.J().J());
        object = cZ_2.J().iterator();
        Object object2 = object;
        while (object2.hasNext()) {
            ld ld2 = (ld)object.next();
            object2 = object;
            a22.J(ld2.J());
        }
        return a22;
    }

    public Object[] J() {
        CZ_2 a2;
        return a2.formatArgs;
    }

    private ld J(int n2) {
        int b22 = n2;
        CZ_2 a2 = this;
        if (b22 >= a2.formatArgs.length) {
            throw new Nz((CZ)a2, b22);
        }
        Object b22 = a2.formatArgs[b22];
        if (b22 instanceof ld) {
            return (ld)b22;
        }
        CY cY2 = new CY(b22 == null ? SPa.V : b22.toString());
        cY2.J().J(a2.J());
        return cY2;
    }

    /*
     * WARNING - void declaration
     */
    public ld J(Vz vz2) {
        int n2;
        void a2;
        Object[] objectArray = this;
        super.J((Vz)a2);
        Object b2 = objectArray.formatArgs;
        int n3 = ((Object[])b2).length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            Object object = b2[n2];
            if (object instanceof ld) {
                ((ld)object).J().J(objectArray.J());
            }
            n4 = ++n2;
        }
        if (objectArray.lastTranslationUpdateTimeInMilliseconds > fqa.Da) {
            Object object = b2 = objectArray.children.iterator();
            while (object.hasNext()) {
                ld ld2 = (ld)b2.next();
                object = b2;
                ld2.J().J((Vz)a2);
            }
        }
        return objectArray;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void J(String string) {
        void a2;
        CZ_2 cZ_2 = this;
        Matcher matcher = stringVariablePattern.matcher((CharSequence)a2);
        int n2 = uSa.E;
        int n3 = uSa.E;
        try {
            Matcher matcher2 = matcher;
            while (matcher2.find(n3)) {
                int n4;
                Object object;
                Matcher matcher3 = matcher;
                int n5 = matcher3.start();
                int n6 = matcher3.end();
                if (n5 > n3) {
                    CY b2 = new CY(String.format(a2.substring(n3, n5), new Object[uSa.E]));
                    b2.J().J(cZ_2.J());
                    cZ_2.children.add((ld)b2);
                }
                String b2 = matcher.group(uqa.g);
                String string2 = a2.substring(n5, n6);
                if (Wqa.fa.equals(b2) && Npa.z.equals(string2)) {
                    object = new CY(Wqa.fa);
                    n4 = n6;
                    object.J().J(cZ_2.J());
                    cZ_2.children.add((ld)object);
                } else {
                    if (!wsa.Q.equals(b2)) {
                        throw new Nz((CZ)cZ_2, xSa.X + string2 + XTa.Z);
                    }
                    object = matcher.group(vRa.d);
                    int n7 = b2 = object != null ? Integer.parseInt((String)object) - vRa.d : n2++;
                    if (b2 < cZ_2.formatArgs.length) {
                        cZ_2.children.add(cZ_2.J(b2));
                    }
                    n4 = n6;
                }
                n3 = n4;
                matcher2 = matcher;
            }
            if (n3 >= a2.length()) return;
            CY cY2 = new CY(String.format(a2.substring(n3), new Object[uSa.E]));
            CZ_2 cZ_22 = cZ_2;
            cY2.J().J(cZ_22.J());
            cZ_22.children.add((ld)cY2);
            return;
        }
        catch (IllegalFormatException illegalFormatException) {
            throw new Nz((CZ)cZ_2, (Throwable)illegalFormatException);
        }
    }

    public int hashCode() {
        CZ_2 cZ_2 = this;
        int a2 = super.hashCode();
        a2 = tua.U * a2 + cZ_2.key.hashCode();
        a2 = tua.U * a2 + Arrays.hashCode(cZ_2.formatArgs);
        return a2;
    }

    public Iterator<ld> iterator() {
        CZ_2 a2;
        CZ_2 cZ_2 = a2;
        cZ_2.J();
        return Iterators.concat(CZ_2.J(cZ_2.children), CZ_2.J((Iterable)a2.siblings));
    }

    /*
     * WARNING - void declaration
     */
    public CZ_2(String string, Object ... objectArray) {
        int c2;
        void a22;
        void b2;
        CZ_2 cZ_2;
        CZ_2 cZ_22 = cZ_2 = this;
        CZ_2 cZ_23 = cZ_2;
        cZ_23.syncLock = new Object();
        cZ_22.lastTranslationUpdateTimeInMilliseconds = fqa.Da;
        cZ_22.children = Lists.newArrayList();
        cZ_22.key = b2;
        cZ_2.formatArgs = a22;
        b2 = cZ_2.formatArgs;
        int a22 = cZ_2.formatArgs.length;
        int n2 = c2 = uSa.E;
        while (n2 < a22) {
            void var4_6 = b2[c2];
            if (var4_6 instanceof ld) {
                ((ld)var4_6).J().J(cZ_2.J());
            }
            n2 = ++c2;
        }
    }
}

