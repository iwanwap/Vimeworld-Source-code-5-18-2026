/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  RIa
 */
public final class MZ_1
extends RuntimeException {
    private final RIa theReportedExceptionCrashReport;

    @Override
    public Throwable getCause() {
        MZ_1 a2;
        return a2.theReportedExceptionCrashReport.J();
    }

    public RIa getCrashReport() {
        MZ_1 a2;
        return a2.theReportedExceptionCrashReport;
    }

    public MZ_1(RIa rIa2) {
        MZ_1 b2 = rIa2;
        MZ_1 a2 = this;
        a2.theReportedExceptionCrashReport = b2;
    }

    @Override
    public String getMessage() {
        MZ_1 a2;
        return a2.theReportedExceptionCrashReport.f();
    }
}

