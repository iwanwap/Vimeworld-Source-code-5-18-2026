/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ura
 *  vRa
 */
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.stream.JsonWriter;
import java.io.Closeable;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public final class ZS_1
extends JsonWriter {
    private String lastName;
    private final List<String> stack;
    private int level;

    @Override
    public JsonWriter endArray() throws IOException {
        ZS_1 zS_1;
        ZS_1 zS_12 = zS_1 = this;
        JsonWriter a2 = super.endArray();
        zS_12.level -= vRa.d;
        zS_12.stack.remove(zS_1.stack.size() - vRa.d);
        zS_1.J();
        return a2;
    }

    @Override
    public JsonWriter beginArray() throws IOException {
        ZS_1 zS_1;
        ZS_1 zS_12 = zS_1 = this;
        JsonWriter a2 = super.beginArray();
        zS_12.level += vRa.d;
        zS_12.stack.add(zS_1.lastName);
        zS_1.lastName = Mqa.y;
        zS_1.J();
        return a2;
    }

    @Override
    public JsonWriter endObject() throws IOException {
        ZS_1 zS_1;
        ZS_1 zS_12 = zS_1 = this;
        JsonWriter a2 = super.endObject();
        zS_12.level -= vRa.d;
        zS_12.stack.remove(zS_1.stack.size() - vRa.d);
        zS_1.J();
        return a2;
    }

    @Override
    public JsonWriter value(Number number) throws IOException {
        double d2;
        Object b2 = number;
        ZS_1 a2 = this;
        if (b2 instanceof LazilyParsedNumber) {
            b2 = ((Number)b2).doubleValue();
        }
        if ((b2 instanceof Float || b2 instanceof Double) && (double)((long)(d2 = ((Number)b2).doubleValue())) == d2) {
            return super.value((long)d2);
        }
        return super.value((Number)b2);
    }

    public ZS_1(Writer writer) {
        Closeable b2 = writer;
        ZS_1 a2 = this;
        super((Writer)b2);
        a2.lastName = Mqa.y;
        ZS_1 zS_1 = a2;
        zS_1.stack = new ArrayList<String>();
    }

    @Override
    public JsonWriter name(String string) throws IOException {
        String b2 = string;
        ZS_1 a2 = this;
        super.name(b2);
        a2.lastName = b2;
        return a2;
    }

    private void J() {
        ZS_1 zS_1 = this;
        Object a2 = ura.t;
        if (zS_1.stack.size() >= tTa.h) {
            ZS_1 zS_12 = zS_1;
            if (!VPa.r.equals(zS_12.stack.get(zS_12.stack.size() - vRa.d))) {
                a2 = Mqa.y;
            }
        }
        if (zS_1.stack.size() == AQa.P && zS_1.stack.get(vRa.d).equals(rpa.C)) {
            a2 = Mqa.y;
        }
        zS_1.setIndent((String)a2);
    }

    @Override
    public JsonWriter beginObject() throws IOException {
        ZS_1 zS_1;
        ZS_1 zS_12 = zS_1 = this;
        JsonWriter a2 = super.beginObject();
        zS_12.level += vRa.d;
        zS_12.stack.add(zS_1.lastName);
        zS_1.lastName = Mqa.y;
        zS_1.J();
        return a2;
    }
}

