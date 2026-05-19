/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cra
 *  ECa
 *  JSa
 *  KTa
 *  NCa
 *  NTa
 *  Nba
 *  Qsa
 *  TAa
 *  Uba
 *  Waa
 *  XSa
 *  XTa
 *  Xsa
 *  aPa
 *  dba
 *  gCa
 *  lqa
 *  pPa
 *  rAa
 *  tca
 *  uca
 *  vRa
 *  waa
 *  wra
 *  zTa
 */
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class NCa_2 {
    public static final String[] I;

    public NCa_2() {
        NCa_2 a2;
    }

    public boolean equals(Object object) {
        Object b2 = object;
        NCa_2 a2 = this;
        if (!(b2 instanceof NCa_2)) {
            return uSa.E != 0;
        }
        b2 = (NCa_2)b2;
        if (a2.J() == ((NCa_2)b2).J()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public abstract void J(DataOutput var1) throws IOException;

    public abstract void J(DataInput var1, int var2, uca var3) throws IOException;

    public abstract NCa J();

    public abstract String toString();

    public int hashCode() {
        NCa_2 a2;
        return a2.J();
    }

    static {
        String[] stringArray = new String[lqa.s];
        stringArray[uSa.E] = aPa.z;
        stringArray[vRa.d] = KTa.y;
        stringArray[uqa.g] = rSa.X;
        stringArray[yRa.d] = JSa.K;
        stringArray[AQa.P] = Eqa.Ia;
        stringArray[tTa.h] = Cra.H;
        stringArray[uua.p] = Xsa.P;
        stringArray[XTa.W] = zTa.x;
        stringArray[Yqa.i] = XSa.O;
        stringArray[WOa.fa] = Qsa.fa;
        stringArray[NTa.C] = wra.S;
        stringArray[pPa.f] = ROa.D;
        I = stringArray;
    }

    public static NCa J(byte a2) {
        switch (a2) {
            case 0: {
                return new gCa();
            }
            case 1: {
                return new Uba();
            }
            case 2: {
                return new dba();
            }
            case 3: {
                return new Nba();
            }
            case 4: {
                return new ECa();
            }
            case 5: {
                return new rAa();
            }
            case 6: {
                return new TAa();
            }
            case 7: {
                return new nAa();
            }
            case 8: {
                return new tca();
            }
            case 9: {
                return new waa();
            }
            case 10: {
                return new Waa();
            }
            case 11: {
                return new OAa();
            }
        }
        return null;
    }

    public boolean J() {
        return uSa.E != 0;
    }

    public String J() {
        NCa_2 a2;
        return a2.toString();
    }

    public abstract byte J();
}

