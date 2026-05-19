/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mra
 *  OPa
 *  Rqa
 *  Rra
 *  Vpa
 *  bQa
 *  mpa
 *  pOa
 *  qPa
 *  wpa
 */
import com.google.protobuf.MessageLiteOrBuilder;

public interface yC
extends MessageLiteOrBuilder {
    public boolean hasDisconnect();

    public boolean hasAudioEnd();

    public Dra getAudio();

    public Rra getOnePlayerData();

    public Vpa getPong();

    public boolean hasAudio();

    public boolean hasDisconnectPlayer();

    public Rqa getOutdatedClient();

    public bQa getPlayerListData();

    public boolean hasPlayerListData();

    public boolean hasOutdatedClient();

    public pOa getAudioDataBatch();

    public boolean hasOnePlayerData();

    public boolean hasPong();

    public boolean hasAudioDataBatch();

    public OPa getDisconnectPlayer();

    public qPa getDataCase();

    public wpa getUpdateMuted();

    public boolean hasUpdateMuted();

    public mpa getDisconnect();

    public Mra getAudioEnd();
}

