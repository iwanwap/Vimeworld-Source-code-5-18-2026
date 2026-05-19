/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  NTa
 */
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Ez_3 {
    private static final Pattern I = Pattern.compile(qQa.Da);

    public Ez_3() {
        Ez_3 a2;
    }

    public static String J(String a2) {
        return I.matcher(a2).replaceAll(Mqa.y);
    }

    public static boolean J(String a2) {
        return StringUtils.isEmpty(a2);
    }

    public static String J(int n2) {
        int n3 = n2;
        int a2 = n3 / kTa.j;
        int n4 = a2 / Psa.M;
        if ((a2 %= Psa.M) < NTa.C) {
            return n4 + ITa.j + a2;
        }
        return n4 + Era.Aa + a2;
    }
}

