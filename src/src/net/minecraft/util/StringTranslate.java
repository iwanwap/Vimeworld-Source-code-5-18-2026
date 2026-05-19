/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bpa
 *  D
 *  TQa
 *  nQa
 *  ura
 *  vRa
 */
package net.minecraft.util;

import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.io.IOException;
import java.util.IllegalFormatException;
import java.util.Map;
import java.util.regex.Pattern;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;
import ru.obfuscator.KeepClassName;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class StringTranslate
implements KeepClassName,
D {
    private static final Splitter equalSignSplitter;
    private final Map<String, String> languageList;
    private static final Pattern numericVariablePattern;
    private long lastUpdateTimeInMilliseconds;
    private static StringTranslate instance;

    public StringTranslate() {
        StringTranslate stringTranslate = this;
        stringTranslate.languageList = Maps.newHashMap();
        try {
            for (String a2 : IOUtils.readLines(StringTranslate.class.getResourceAsStream(ura.F), Charsets.UTF_8)) {
                if (a2.isEmpty() || a2.charAt(uSa.E) == TQa.ca || (a2 = Iterables.toArray(equalSignSplitter.split(a2), String.class)) == null || a2.length != uqa.g) continue;
                String string = a2[uSa.E];
                a2 = numericVariablePattern.matcher(a2[vRa.d]).replaceAll(nQa.G);
                stringTranslate.languageList.put(string, a2);
            }
        }
        catch (IOException iOException) {
            return;
        }
        stringTranslate.lastUpdateTimeInMilliseconds = System.currentTimeMillis();
    }

    public static StringTranslate J() {
        return instance;
    }

    static {
        numericVariablePattern = Pattern.compile(Bpa.d);
        equalSignSplitter = Splitter.on((char)tua.w).limit(uqa.g);
        instance = new StringTranslate();
    }

    public synchronized boolean J(String string) {
        String b2 = string;
        StringTranslate a2 = this;
        return a2.languageList.containsKey(b2);
    }

    public synchronized String f(String string) {
        String b2 = string;
        StringTranslate a2 = this;
        return a2.J(b2);
    }

    /*
     * WARNING - void declaration
     */
    public synchronized String J(String string, Object ... objectArray) {
        Object c2 = string;
        StringTranslate b2 = this;
        c2 = b2.J((String)c2);
        try {
            void a2;
            return String.format((String)c2, (Object[])a2);
        }
        catch (IllegalFormatException illegalFormatException) {
            return new StringBuilder().insert(5 >> 3, Vra.ca).append((String)c2).toString();
        }
    }

    /*
     * WARNING - void declaration
     */
    private String J(String string) {
        void a2;
        StringTranslate stringTranslate = this;
        String b2 = stringTranslate.languageList.get(a2);
        if (b2 == null) {
            return a2;
        }
        return b2;
    }

    public long J() {
        StringTranslate a2;
        return a2.lastUpdateTimeInMilliseconds;
    }

    public static synchronized void J(Map<String, String> a2) {
        StringTranslate.instance.languageList.clear();
        StringTranslate.instance.languageList.putAll(a2);
        StringTranslate.instance.lastUpdateTimeInMilliseconds = System.currentTimeMillis();
    }
}

