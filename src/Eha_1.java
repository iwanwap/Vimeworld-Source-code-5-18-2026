/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Eha
 *  Jia
 *  lqa
 *  vRa
 */
import com.google.common.collect.Lists;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public final class Eha_1
extends IOException {
    private final String field_151382_b;
    private final List<Jia> field_151383_a;

    public static Eha func_151379_a(Exception exception) {
        Exception exception2 = exception;
        if (exception2 instanceof Eha_1) {
            return (Eha_1)exception2;
        }
        Exception exception3 = exception2;
        Object a2 = exception3.getMessage();
        if (exception3 instanceof FileNotFoundException) {
            a2 = lqa.w;
        }
        return new Eha_1((String)a2, exception2);
    }

    public void func_151381_b(String string) {
        String b2 = string;
        Eha_1 a2 = this;
        Jia.J((Jia)a2.field_151383_a.get(uSa.E), (String)b2);
        a2.field_151383_a.add(uSa.E, new Jia(null));
    }

    /*
     * WARNING - void declaration
     */
    public Eha_1(String string, Throwable throwable) {
        void b2;
        Eha_1 a2;
        Throwable c2 = throwable;
        Eha_1 eha_1 = a2 = this;
        super(c2);
        eha_1.field_151383_a = Lists.newArrayList();
        eha_1.field_151383_a.add(new Jia(null));
        a2.field_151382_b = b2;
    }

    @Override
    public String getMessage() {
        Eha_1 a2;
        Eha_1 eha_1 = a2;
        return new StringBuilder().insert(3 & 4, UTa.ca).append(eha_1.field_151383_a.get(eha_1.field_151383_a.size() - vRa.d).toString()).append(Xpa.E).append(a2.field_151382_b).toString();
    }

    public Eha_1(String string) {
        Eha_1 a2;
        String b2 = string;
        Eha_1 eha_1 = a2 = this;
        eha_1.field_151383_a = Lists.newArrayList();
        eha_1.field_151383_a.add(new Jia(null));
        a2.field_151382_b = b2;
    }

    public void func_151380_a(String string) {
        String b2 = string;
        Eha_1 a2 = this;
        Jia.J((Jia)a2.field_151383_a.get(uSa.E), (String)b2);
    }
}

