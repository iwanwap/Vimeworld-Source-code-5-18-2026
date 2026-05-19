/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Aha
 *  Cta
 *  EQa
 *  JHa
 *  Oga
 *  Pqa
 *  Rd
 *  U
 *  fIa
 *  kga
 *  sA
 *  xha
 */
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import org.apache.commons.io.IOUtils;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class tB_3
extends Rd {
    private String A;
    private static final kga I = tB_3.J();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void J(U u2) throws IOException {
        tB_3 tB_32;
        tB_3 tB_33 = tB_32 = this;
        tB_33.l();
        InputStream a2 = pA.J(tB_33.A);
        if (a2 == null) {
            throw new FileNotFoundException(new StringBuilder().insert(3 >> 2, Cta.k).append(tB_32.A).toString());
        }
        try {
            Object b2 = gLa.J(a2);
            tB_3 tB_34 = tB_32;
            wGa wGa2 = tB_34.J();
            gLa.J(tB_34.J(), (BufferedImage)b2, wGa2.J(), wGa2.f());
            return;
        }
        finally {
            IOUtils.closeQuietly(a2);
        }
    }

    public tB_3(String string) {
        Object b2 = string;
        tB_3 a2 = this;
        a2.A = b2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private wGa J() {
        tB_3 tB_32 = this;
        String string = new StringBuilder().insert(3 ^ 3, tB_32.A).append(Npa.L).toString();
        String string2 = EQa.Ga;
        Object a2 = pA.J(string);
        if (a2 != null) {
            Object object = I;
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((InputStream)a2));
            try {
                JsonObject jsonObject = new JsonParser().parse(bufferedReader).getAsJsonObject();
                object = (wGa)object.J(string2, jsonObject);
                if (object == null) {
                    wGa wGa2 = new wGa(uSa.E != 0, uSa.E != 0, new ArrayList<Integer>());
                    return wGa2;
                }
                string2 = object;
                return string2;
            }
            catch (RuntimeException runtimeException) {
                zc.C(new StringBuilder().insert(2 & 5, Pqa.Ga).append(string).toString());
                zc.C(new StringBuilder().insert(5 >> 3, Mqa.y).append(runtimeException.getClass().getName()).append(Xpa.E).append(runtimeException.getMessage()).toString());
                object = new wGa(uSa.E != 0, uSa.E != 0, new ArrayList<Integer>());
                return object;
            }
            finally {
                IOUtils.closeQuietly(bufferedReader);
                IOUtils.closeQuietly((InputStream)a2);
            }
        }
        return new wGa(uSa.E != 0, uSa.E != 0, new ArrayList<Integer>());
    }

    private static kga J() {
        kga kga2;
        kga kga3 = kga2 = new kga();
        kga2.J((sA)new ZGa(), wGa.class);
        kga3.J((sA)new tGa(), JHa.class);
        kga2.J((sA)new Oga(), fIa.class);
        kga2.J((sA)new Aha(), QIa.class);
        kga2.J((sA)new wia(), xha.class);
        return kga2;
    }
}

