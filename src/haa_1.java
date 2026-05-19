/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  ay
 *  jRa
 *  kqa
 *  xOa
 */
import com.google.gson.JsonObject;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class haa_1<T>
extends ay<T> {
    public final String bannedBy;
    public final String reason;
    public static final SimpleDateFormat dateFormat = new SimpleDateFormat(jRa.n);
    public final Date banEndDate;
    public final Date banStartDate;

    public String J() {
        haa_1 a2;
        return a2.reason;
    }

    public boolean J() {
        haa_1 a2;
        if (a2.banEndDate == null) {
            return uSa.E != 0;
        }
        return a2.banEndDate.before(new Date());
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public haa_1(T t2, JsonObject jsonObject) {
        haa_1 haa_12;
        Date date;
        Date b2;
        haa_1 a2;
        JsonObject c2;
        block5: {
            haa_1 haa_13;
            Date date2;
            c2 = jsonObject;
            a2 = this;
            super((Object)b2, c2);
            try {
                date2 = c2.has(xOa.Ga) ? dateFormat.parse(c2.get(xOa.Ga).getAsString()) : new Date();
            }
            catch (ParseException parseException) {
                b2 = new Date();
                haa_13 = a2;
                break block5;
            }
            {
                b2 = date2;
                haa_13 = a2;
            }
        }
        haa_13.banStartDate = b2;
        a2.bannedBy = c2.has(kqa.Ha) ? c2.get(kqa.Ha).getAsString() : Jsa.Ja;
        try {
            date = c2.has(Fua.q) ? dateFormat.parse(c2.get(Fua.q).getAsString()) : null;
            haa_12 = a2;
        }
        catch (ParseException parseException) {
            date = null;
            haa_12 = a2;
        }
        haa_12.banEndDate = date;
        a2.reason = c2.has(SPa.o) ? c2.get(SPa.o).getAsString() : BRa.p;
    }

    /*
     * WARNING - void declaration
     */
    public haa_1(T t2, Date date, String string, Date date2, String string2) {
        Object f2;
        void b2;
        void c2;
        void d2;
        void e2;
        haa_1 haa_12 = object;
        Object object = string2;
        haa_1 a2 = haa_12;
        super((Object)e2);
        a2.banStartDate = d2 == null ? new Date() : d2;
        a2.bannedBy = c2 == null ? Jsa.Ja : c2;
        haa_1 haa_13 = a2;
        haa_13.banEndDate = b2;
        haa_13.reason = f2 == null ? BRa.p : f2;
    }

    public Date J() {
        haa_1 a2;
        return a2.banEndDate;
    }

    public void J(JsonObject jsonObject) {
        JsonObject b2 = jsonObject;
        haa_1 a2 = this;
        JsonObject jsonObject2 = b2;
        jsonObject2.addProperty(xOa.Ga, dateFormat.format(a2.banStartDate));
        jsonObject2.addProperty(kqa.Ha, a2.bannedBy);
        jsonObject2.addProperty(Fua.q, a2.banEndDate == null ? bsa.l : dateFormat.format(a2.banEndDate));
        b2.addProperty(SPa.o, a2.reason);
    }
}

