/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bpa
 *  JQa
 *  TQa
 *  U
 *  gIa
 *  hra
 *  nQa
 *  vRa
 *  wra
 */
import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import net.minecraft.block.CustomBlock;
import net.minecraft.client.resources.IResource;
import net.minecraft.util.ResourceLocation;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class yga_2 {
    private static final Pattern j;
    private static final Splitter J;
    public Map<String, String> A = Maps.newHashMap();
    private boolean I;

    /*
     * WARNING - void declaration
     */
    public synchronized void J(U u2, List<String> list) {
        Iterator a2;
        yga_2 yga_22 = this;
        yga_22.A.clear();
        a2 = a2.iterator();
        while (a2.hasNext()) {
            void b2;
            String string = (String)a2.next();
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = string;
            String string2 = String.format(wra.c, objectArray);
            for (Object object : b2.J()) {
                try {
                    yga_22.J(b2.J(new ResourceLocation((String)object, string2)));
                }
                catch (IOException iOException) {}
            }
            for (Object object : gIa.registry) {
                String string3 = string.split(IPa.W)[uSa.E];
                string2 = new StringBuilder().insert(5 >> 3, JQa.j).append(gIa.J((String)((CustomBlock)object).J())).append(tpa.N).toString();
                String string4 = ((CustomBlock)object).J().get(string3);
                if (string4 == null) continue;
                yga_22.A.put(string2, string4);
            }
        }
        yga_22.J();
    }

    private void J() {
        yga_2 yga_22 = this;
        yga_22.I = uSa.E;
        int n2 = uSa.E;
        int n3 = uSa.E;
        for (String string : yga_22.A.values()) {
            int n4 = string.length();
            n3 += n4;
            int n5 = uSa.E;
            while (n5 < n4) {
                int n6;
                if (string.charAt(n6) >= hra.Ja) {
                    ++n2;
                }
                n5 = ++n6;
            }
        }
        float a2 = (float)n2 / (float)n3;
        yga_22.I = (double)a2 > tpa.k ? vRa.d : uSa.E;
    }

    public yga_2() {
        yga_2 a2;
    }

    /*
     * WARNING - void declaration
     */
    private String J(String string) {
        void a2;
        yga_2 yga_22 = this;
        String b2 = yga_22.A.get(a2);
        if (b2 == null) {
            return a2;
        }
        return b2;
    }

    /*
     * WARNING - void declaration
     */
    public String J(String string, Object[] objectArray) {
        Object c2 = string;
        yga_2 b2 = this;
        c2 = b2.J((String)c2);
        try {
            void a2;
            return String.format((String)c2, (Object[])a2);
        }
        catch (IllegalFormatException illegalFormatException) {
            return new StringBuilder().insert(3 ^ 3, Vra.ca).append((String)c2).toString();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void J(List<IResource> list) throws IOException {
        Iterator a2;
        yga_2 yga_22 = this;
        a2 = a2.iterator();
        while (a2.hasNext()) {
            InputStream b2 = ((IResource)a2.next()).J();
            try {
                yga_22.J(b2);
            }
            finally {
                IOUtils.closeQuietly(b2);
            }
        }
    }

    static {
        J = Splitter.on((char)tua.w).limit(uqa.g);
        j = Pattern.compile(Bpa.d);
    }

    public boolean J() {
        yga_2 a2;
        return a2.I;
    }

    private void J(InputStream inputStream) throws IOException {
        Iterator<String> a2;
        yga_2 yga_22 = this;
        for (String b2 : IOUtils.readLines((InputStream)((Object)a2), Charsets.UTF_8)) {
            if (b2.isEmpty() || b2.charAt(uSa.E) == TQa.ca || (b2 = Iterables.toArray(J.split(b2), String.class)) == null || b2.length != uqa.g) continue;
            String string = b2[uSa.E];
            b2 = j.matcher(b2[vRa.d]).replaceAll(nQa.G);
            yga_22.A.put(string, b2);
        }
    }
}

