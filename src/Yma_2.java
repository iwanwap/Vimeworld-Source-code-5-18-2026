/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EC
 *  ERa
 *  Epa
 *  IHa
 *  QSa
 *  Qta
 *  Una
 *  Usa
 *  XTa
 *  Xia
 *  Yma
 *  ZOa
 *  ac
 *  cra
 *  dGa
 *  pua
 *  tHa
 *  vRa
 *  xOa
 *  yna
 *  zf
 */
import com.google.common.collect.Lists;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.Sys;

public final class Yma_2
extends EC {
    private List<Xia> i;
    private final EC M;
    private List<Xia> k;
    private static final Logger j = LogManager.getLogger();
    private Una J;
    private boolean A;
    private yna I;

    public List<Xia> J(Xia xia2) {
        Yma_2 a2 = this;
        Yma_2 b2 = xia2;
        if (a2.J((Xia)b2)) {
            return a2.i;
        }
        return a2.k;
    }

    public boolean J(Xia xia2) {
        Yma_2 b2 = xia2;
        Yma_2 a2 = this;
        return a2.i.contains((Object)b2);
    }

    public void A() {
        Yma_2 yma_2 = this;
        yma_2.E.add(new zf(uqa.g, yma_2.A / uqa.g - Epa.u, (int)(yma_2.I - QSa.p), oha.J(Qta.G, new Object[uSa.E])));
        yma_2.E.add(new zf(vRa.d, yma_2.A / uqa.g + AQa.P, (int)(yma_2.I - QSa.p), oha.J(cra.g, new Object[uSa.E])));
        if (!yma_2.A) {
            nIa nIa2;
            yma_2.k = Lists.newArrayList();
            yma_2.i = Lists.newArrayList();
            dGa dGa2 = yma_2.g.J();
            dGa2.l();
            Object a2 = Lists.newArrayList(dGa2.f());
            a2.removeAll(dGa2.l());
            a2 = a2.iterator();
            Object object = a2;
            while (object.hasNext()) {
                nIa2 = (nIa)a2.next();
                object = a2;
                yma_2.k.add((Xia)new tHa((Yma)yma_2, nIa2));
            }
            a2 = Lists.reverse(dGa2.l()).iterator();
            Object object2 = a2;
            while (object2.hasNext()) {
                nIa2 = (nIa)a2.next();
                object2 = a2;
                yma_2.i.add((Xia)new tHa((Yma)yma_2, nIa2));
            }
            yma_2.i.add((Xia)new IHa((Yma)yma_2));
        }
        Yma_2 yma_22 = yma_2;
        Yma_2 yma_23 = yma_2;
        yma_2.I = new yna(yma_2.g, ZOa.x, (int)yma_23.I, yma_23.k);
        Yma_2 yma_24 = yma_2;
        yma_22.I.f(yma_24.A / uqa.g - AQa.P - ZOa.x);
        yma_24.I.l(XTa.W, Yqa.i);
        Yma_2 yma_25 = yma_2;
        Yma_2 yma_26 = yma_2;
        yma_22.J = new Una(yma_2.g, ZOa.x, (int)yma_26.I, yma_26.i);
        yma_22.J.f(yma_2.A / uqa.g + AQa.P);
        yma_22.J.l(XTa.W, Yqa.i);
    }

    /*
     * WARNING - void declaration
     */
    public void J(ac ac2) throws IOException {
        void a2;
        Yma_2 yma_2 = this;
        if (a2.J) {
            if (a2.C == uqa.g) {
                int n2;
                File file = yma_2.g.J().J();
                String string = file.getAbsolutePath();
                if (maa.J() == Xy.OSX) {
                    try {
                        j.info(string);
                        String[] stringArray = new String[uqa.g];
                        stringArray[uSa.E] = APa.x;
                        stringArray[vRa.d] = string;
                        Runtime.getRuntime().exec(stringArray);
                        return;
                    }
                    catch (IOException b22) {
                        j.error(xOa.L, (Throwable)b22);
                    }
                } else if (maa.J() == Xy.WINDOWS) {
                    Object[] objectArray = new Object[vRa.d];
                    objectArray[uSa.E] = string;
                    String b22 = String.format(rQa.ba, objectArray);
                    try {
                        Runtime.getRuntime().exec(b22);
                        return;
                    }
                    catch (IOException iOException) {
                        j.error(xOa.L, (Throwable)iOException);
                    }
                }
                int b22 = uSa.E;
                try {
                    Class<?> clazz = Class.forName(Usa.e);
                    Object object = clazz.getMethod(csa.i, new Class[uSa.E]).invoke(null, new Object[uSa.E]);
                    Class[] classArray = new Class[vRa.d];
                    classArray[uSa.E] = URI.class;
                    Object[] objectArray = new Object[vRa.d];
                    objectArray[uSa.E] = file.toURI();
                    clazz.getMethod(ySa.l, classArray).invoke(object, objectArray);
                    n2 = b22;
                }
                catch (Throwable throwable) {
                    j.error(XOa.la, throwable);
                    n2 = b22 = vRa.d;
                }
                if (n2 != 0) {
                    j.info(rQa.Ha);
                    Sys.openURL(new StringBuilder().insert(3 ^ 3, gua.E).append(string).toString());
                    return;
                }
            } else if (a2.C == vRa.d) {
                if (yma_2.A) {
                    ArrayList<nIa> arrayList = Lists.newArrayList();
                    for (Xia b22 : yma_2.i) {
                        if (!(b22 instanceof tHa)) continue;
                        arrayList.add(((tHa)b22).J());
                    }
                    Collections.reverse(arrayList);
                    Yma_2 yma_22 = yma_2;
                    yma_22.g.J().J(arrayList);
                    yma_2.g.z.Ab.clear();
                    yma_22.g.z.sb.clear();
                    Iterator<Object> iterator = arrayList.iterator();
                    while (iterator.hasNext()) {
                        nIa b22;
                        nIa nIa2 = b22 = (nIa)iterator.next();
                        yma_2.g.z.Ab.add(nIa2.J());
                        if (nIa2.J() == vRa.d) continue;
                        yma_2.g.z.sb.add(b22.J());
                    }
                    Yma_2 yma_23 = yma_2;
                    yma_23.g.z.d();
                    yma_23.g.i();
                }
                Yma_2 yma_24 = yma_2;
                yma_24.g.J(yma_24.M);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, float f2) {
        void b2;
        void c2;
        Yma_2 a2;
        float d2 = f2;
        Yma_2 yma_2 = a2 = this;
        yma_2.f(uSa.E);
        yma_2.I.J((int)c2, (int)b2, d2);
        yma_2.J.J((int)c2, (int)b2, d2);
        String string = oha.J(Eqa.j, new Object[uSa.E]);
        Yma_2 yma_22 = a2;
        Yma_2.J((String)string, (int)(yma_22.A / uqa.g), (int)ERa.C, (int)pua.o);
        super.J((int)c2, (int)b2, d2);
    }

    public Yma_2(EC eC2) {
        Yma_2 b2 = eC2;
        Yma_2 a2 = this;
        a2.A = uSa.E;
        a2.M = b2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4) throws IOException {
        void b2;
        void c2;
        Yma_2 a2;
        int d2 = n4;
        Yma_2 yma_2 = a2 = this;
        super.J((int)c2, (int)b2, d2);
        yma_2.I.J((int)c2, (int)b2, d2);
        a2.J.J((int)c2, (int)b2, d2);
    }

    public void J() {
        a.A = vRa.d;
    }

    public void d() throws IOException {
        Yma_2 a2;
        Yma_2 yma_2 = a2;
        super.d();
        yma_2.J.f();
        yma_2.I.f();
    }

    /*
     * WARNING - void declaration
     */
    public void f(int n2, int n3, int n4) {
        void b2;
        void c2;
        int d2 = n4;
        Yma_2 a2 = this;
        super.f((int)c2, (int)b2, d2);
    }

    public List<Xia> f() {
        Yma_2 a2;
        return a2.i;
    }

    public List<Xia> J() {
        Yma_2 a2;
        return a2.k;
    }
}

