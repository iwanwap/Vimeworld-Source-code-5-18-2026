/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cia
 *  Foa
 *  Gna
 *  JPa
 *  KOa
 *  MQa
 *  QMa
 *  U
 *  aSa
 *  ana
 *  iPa
 *  j
 *  mOa
 *  qoa
 *  rd
 *  rna
 *  sb
 *  vRa
 *  wNa
 *  woa
 *  wra
 *  xNa
 */
import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import net.minecraft.util.ResourceLocation;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class wNa_2
implements j,
rd {
    private final U i;
    private static final Gson M;
    private static final ParameterizedType k;
    public static final qoa j;
    public final Voa J;
    private final QMa A;
    private static final Logger I;

    /*
     * WARNING - void declaration
     */
    public void J(U u2) {
        void a2;
        wNa_2 wNa_22;
        wNa_2 wNa_23 = wNa_22 = this;
        wNa_23.A.d();
        wNa_23.J.J();
        for (String string : a2.J()) {
            for (Map<String, mOa> b22 : a2.J(new ResourceLocation(string, iPa.G))) {
                try {
                    b22 = wNa_22.J(b22.J());
                    for (Map.Entry<String, mOa> entry : b22.entrySet()) {
                        wNa_22.J(new ResourceLocation(string, entry.getKey()), entry.getValue());
                    }
                }
                catch (RuntimeException b22) {
                    try {
                        I.warn(kTa.ca, (Throwable)b22);
                    }
                    catch (IOException iOException) {
                    }
                }
            }
            continue;
            {
                break;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public xNa J(rna ... rnaArray) {
        wNa_2 wNa_22 = this;
        ArrayList<Object> arrayList = Lists.newArrayList();
        for (Object b2 : wNa_22.J.J()) {
            void a2;
            if (!ArrayUtils.contains((Object[])a2, (b2 = (xNa)wNa_22.J.J(b2)).J())) continue;
            arrayList.add(b2);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (xNa)arrayList.get(new Random().nextInt(arrayList.size()));
    }

    public void f(X x2) {
        X b2 = x2;
        wNa_2 a2 = this;
        a2.A.J(b2);
    }

    public void d() {
        wNa_2 a2;
        a2.A.f();
    }

    public boolean J(X x2) {
        X b2 = x2;
        wNa_2 a2 = this;
        return a2.A.J(b2);
    }

    public xNa J(ResourceLocation resourceLocation) {
        ResourceLocation b2 = resourceLocation;
        wNa_2 a2 = this;
        return (xNa)a2.J.J(b2);
    }

    public void C() {
        wNa_2 a2;
        a2.A.e();
    }

    public void l() {
        wNa_2 a2;
        a2.A.J();
    }

    /*
     * WARNING - void declaration
     */
    public void J(X x2, int n2) {
        void b2;
        int c2 = n2;
        wNa_2 a2 = this;
        a2.A.J((X)b2, c2);
    }

    public void f() {
        wNa_2 a2;
        a2.A.C();
    }

    /*
     * WARNING - void declaration
     */
    public void J(Sx sx2, float f2) {
        void b2;
        float c2 = f2;
        wNa_2 a2 = this;
        a2.A.J((Sx)b2, c2);
    }

    /*
     * WARNING - void declaration
     */
    public wNa_2(U u2, Cia cia2) {
        void b2;
        wNa_2 a2;
        wNa_2 c2 = cia2;
        wNa_2 wNa_22 = a2 = this;
        wNa_2 wNa_23 = a2;
        wNa_22.J = new Voa();
        wNa_22.i = b2;
        wNa_22.A = new QMa((wNa)a2, (Cia)c2);
    }

    /*
     * WARNING - void declaration
     */
    public Map<String, mOa> J(InputStream inputStream) {
        void a2;
        wNa_2 wNa_22 = this;
        try {
            Map b2 = (Map)M.fromJson((Reader)new InputStreamReader((InputStream)a2), (Type)k);
            return b2;
        }
        finally {
            IOUtils.closeQuietly((InputStream)a2);
        }
    }

    public void J() {
        wNa_2 a2;
        a2.A.M();
    }

    public QMa J() {
        wNa_2 a2;
        return a2.A;
    }

    /*
     * WARNING - void declaration
     */
    public void J(rna rna2, float f2) {
        void b2;
        float c2 = f2;
        wNa_2 a2 = this;
        if (b2 == rna.MASTER && c2 <= JPa.N) {
            a2.C();
        }
        a2.A.J((rna)b2, c2);
    }

    public void J(X x2) {
        X b2 = x2;
        wNa_2 a2 = this;
        a2.A.f(b2);
    }

    static {
        I = LogManager.getLogger();
        M = new GsonBuilder().registerTypeAdapter((Type)((Object)mOa.class), new Foa()).create();
        k = new Gna();
        j = new qoa(new ResourceLocation(BQa.ba), aSa.V, aSa.V, uSa.E != 0);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     * WARNING - void declaration
     */
    private void J(ResourceLocation resourceLocation, mOa mOa2) {
        void v1;
        xNa xNa2;
        Iterator a2;
        void b2;
        int c22222222222;
        wNa_2 wNa_22 = this;
        int n2 = c22222222222 = wNa_22.J.J(b2) == false ? vRa.d : uSa.E;
        if (c22222222222 == 0 && !a2.J()) {
            xNa2 = (xNa)wNa_22.J.J(b2);
            v1 = a2;
        } else {
            if (c22222222222 == 0) {
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = b2;
                I.debug(Npa.ja, objectArray);
            }
            xNa2 = new xNa((ResourceLocation)b2, oua.i, oua.i, a2.J());
            v1 = a2;
            wNa_22.J.J(xNa2);
        }
        Iterator iterator = a2 = v1.J().iterator();
        block10: while (iterator.hasNext()) {
            xNa xNa3;
            Object object;
            woa c22222222222 = (woa)a2.next();
            String string = c22222222222.J();
            ResourceLocation resourceLocation2 = new ResourceLocation(string);
            string = string.contains(Era.Aa) ? resourceLocation2.f() : b2.f();
            switch (KOa.I[c22222222222.J().ordinal()]) {
                case 1: {
                    resourceLocation2 = new ResourceLocation(string, kua.fa + resourceLocation2.J() + Lsa.D);
                    InputStream inputStream = null;
                    try {
                        inputStream = wNa_22.i.J(resourceLocation2).J();
                    }
                    catch (FileNotFoundException fileNotFoundException) {
                        Object[] objectArray = new Object[uqa.g];
                        objectArray[uSa.E] = resourceLocation2;
                        objectArray[vRa.d] = b2;
                        I.warn(Jta.i, objectArray);
                        iterator = a2;
                        IOUtils.closeQuietly(inputStream);
                        continue block10;
                    }
                    catch (IOException iOException) {
                        I.warn(new StringBuilder().insert(2 & 5, MQa.W).append(resourceLocation2).append(wra.K).append(b2).toString(), (Throwable)iOException);
                        iterator = a2;
                        {
                            catch (Throwable throwable) {
                                IOUtils.closeQuietly(inputStream);
                                throw throwable;
                            }
                        }
                        IOUtils.closeQuietly(inputStream);
                        continue block10;
                    }
                    IOUtils.closeQuietly(inputStream);
                    object = new wma(new qoa(resourceLocation2, (double)c22222222222.f(), (double)c22222222222.J(), c22222222222.J()), c22222222222.J());
                    xNa3 = xNa2;
                    break;
                }
                case 2: {
                    object = new ana((wNa)wNa_22, string, c22222222222);
                    xNa3 = xNa2;
                    break;
                }
                default: {
                    throw new IllegalStateException(APa.T);
                }
            }
            xNa3.J((sb)object);
            iterator = a2;
        }
    }
}

