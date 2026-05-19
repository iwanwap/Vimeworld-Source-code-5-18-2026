/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Qc
 *  oGa
 */
import java.util.List;

public interface Qc_3
extends Comparable<Qc> {
    public String getCommandName();

    public void processCommand(u var1, String[] var2) throws oGa;

    public List<String> getCommandAliases();

    public List<String> addTabCompletionOptions(u var1, String[] var2, XF var3);

    public boolean canCommandSenderUseCommand(u var1);

    public String getCommandUsage(u var1);

    public boolean isUsernameIndex(String[] var1, int var2);
}

