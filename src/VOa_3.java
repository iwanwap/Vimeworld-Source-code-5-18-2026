/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cpa
 *  Ipa
 *  Mra
 *  OPa
 *  Rqa
 *  Rra
 *  VOa
 *  Vpa
 *  YQa
 *  apa
 *  bQa
 *  epa
 *  fRa
 *  fra
 *  mpa
 *  pOa
 *  qOa
 *  qPa
 *  qqa
 *  rOa
 *  spa
 *  vOa
 *  wpa
 */
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;

public final class VOa_3
extends GeneratedMessageLite.Builder<fRa, VOa>
implements yC {
    public VOa clearDisconnectPlayer() {
        VOa_3 a2;
        VOa_3 vOa_3 = a2;
        vOa_3.copyOnWrite();
        fRa.A((fRa)((fRa)vOa_3.instance));
        return a2;
    }

    public VOa setUpdateMuted(rOa rOa2) {
        VOa_3 a2;
        VOa_3 b2 = rOa2;
        VOa_3 vOa_3 = a2 = this;
        vOa_3.copyOnWrite();
        fRa.f((fRa)((fRa)vOa_3.instance), (wpa)((wpa)b2.build()));
        return a2;
    }

    public VOa mergeOutdatedClient(Rqa rqa2) {
        VOa_3 a2;
        VOa_3 b2 = rqa2;
        VOa_3 vOa_3 = a2 = this;
        vOa_3.copyOnWrite();
        fRa.J((fRa)((fRa)vOa_3.instance), (Rqa)b2);
        return a2;
    }

    @Override
    public wpa getUpdateMuted() {
        VOa_3 a2;
        return ((fRa)a2.instance).getUpdateMuted();
    }

    @Override
    public OPa getDisconnectPlayer() {
        VOa_3 a2;
        return ((fRa)a2.instance).getDisconnectPlayer();
    }

    public VOa mergeOnePlayerData(Rra rra2) {
        VOa_3 a2;
        VOa_3 b2 = rra2;
        VOa_3 vOa_3 = a2 = this;
        vOa_3.copyOnWrite();
        fRa.f((fRa)((fRa)vOa_3.instance), (Rra)b2);
        return a2;
    }

    public VOa mergeDisconnectPlayer(OPa oPa) {
        VOa_3 a2;
        VOa_3 b2 = oPa;
        VOa_3 vOa_3 = a2 = this;
        vOa_3.copyOnWrite();
        fRa.J((fRa)((fRa)vOa_3.instance), (OPa)b2);
        return a2;
    }

    public VOa setDisconnect(mpa mpa2) {
        VOa_3 a2;
        VOa_3 b2 = mpa2;
        VOa_3 vOa_3 = a2 = this;
        vOa_3.copyOnWrite();
        fRa.J((fRa)((fRa)vOa_3.instance), (mpa)b2);
        return a2;
    }

    public VOa setAudioDataBatch(pOa pOa2) {
        VOa_3 a2;
        VOa_3 b2 = pOa2;
        VOa_3 vOa_3 = a2 = this;
        vOa_3.copyOnWrite();
        fRa.J((fRa)((fRa)vOa_3.instance), (pOa)b2);
        return a2;
    }

    public VOa mergeAudioDataBatch(pOa pOa2) {
        VOa_3 a2;
        VOa_3 b2 = pOa2;
        VOa_3 vOa_3 = a2 = this;
        vOa_3.copyOnWrite();
        fRa.f((fRa)((fRa)vOa_3.instance), (pOa)b2);
        return a2;
    }

    @Override
    public boolean hasPlayerListData() {
        VOa_3 a2;
        return ((fRa)a2.instance).hasPlayerListData();
    }

    public VOa clearAudio() {
        VOa_3 a2;
        VOa_3 vOa_3 = a2;
        vOa_3.copyOnWrite();
        fRa.e((fRa)((fRa)vOa_3.instance));
        return a2;
    }

    public VOa clearDisconnect() {
        VOa_3 a2;
        VOa_3 vOa_3 = a2;
        vOa_3.copyOnWrite();
        fRa.M((fRa)((fRa)vOa_3.instance));
        return a2;
    }

    @Override
    public Rra getOnePlayerData() {
        VOa_3 a2;
        return ((fRa)a2.instance).getOnePlayerData();
    }

    public VOa setAudioDataBatch(qqa qqa2) {
        VOa_3 a2;
        VOa_3 b2 = qqa2;
        VOa_3 vOa_3 = a2 = this;
        vOa_3.copyOnWrite();
        fRa.J((fRa)((fRa)vOa_3.instance), (pOa)((pOa)b2.build()));
        return a2;
    }

    @Override
    public boolean hasAudioEnd() {
        VOa_3 a2;
        return ((fRa)a2.instance).hasAudioEnd();
    }

    public VOa setOutdatedClient(fra fra2) {
        VOa_3 a2;
        VOa_3 b2 = fra2;
        VOa_3 vOa_3 = a2 = this;
        vOa_3.copyOnWrite();
        fRa.f((fRa)((fRa)vOa_3.instance), (Rqa)((Rqa)b2.build()));
        return a2;
    }

    public VOa setOnePlayerData(vOa vOa2) {
        VOa_3 a2;
        VOa_3 b2 = vOa2;
        VOa_3 vOa_3 = a2 = this;
        vOa_3.copyOnWrite();
        fRa.J((fRa)((fRa)vOa_3.instance), (Rra)((Rra)b2.build()));
        return a2;
    }

    public VOa mergePong(Vpa vpa2) {
        VOa_3 a2;
        VOa_3 b2 = vpa2;
        VOa_3 vOa_3 = a2 = this;
        vOa_3.copyOnWrite();
        fRa.f((fRa)((fRa)vOa_3.instance), (Vpa)b2);
        return a2;
    }

    public VOa setDisconnect(apa apa2) {
        VOa_3 a2;
        VOa_3 b2 = apa2;
        VOa_3 vOa_3 = a2 = this;
        vOa_3.copyOnWrite();
        fRa.J((fRa)((fRa)vOa_3.instance), (mpa)((mpa)b2.build()));
        return a2;
    }

    @Override
    public boolean hasOnePlayerData() {
        VOa_3 a2;
        return ((fRa)a2.instance).hasOnePlayerData();
    }

    public VOa setPlayerListData(Cpa cpa2) {
        VOa_3 a2;
        VOa_3 b2 = cpa2;
        VOa_3 vOa_3 = a2 = this;
        vOa_3.copyOnWrite();
        fRa.f((fRa)((fRa)vOa_3.instance), (bQa)((bQa)b2.build()));
        return a2;
    }

    public VOa clearOutdatedClient() {
        VOa_3 a2;
        VOa_3 vOa_3 = a2;
        vOa_3.copyOnWrite();
        fRa.i((fRa)((fRa)vOa_3.instance));
        return a2;
    }

    @Override
    public Rqa getOutdatedClient() {
        VOa_3 a2;
        return ((fRa)a2.instance).getOutdatedClient();
    }

    @Override
    public boolean hasDisconnectPlayer() {
        VOa_3 a2;
        return ((fRa)a2.instance).hasDisconnectPlayer();
    }

    @Override
    public pOa getAudioDataBatch() {
        VOa_3 a2;
        return ((fRa)a2.instance).getAudioDataBatch();
    }

    public VOa mergePlayerListData(bQa bQa2) {
        VOa_3 a2;
        VOa_3 b2 = bQa2;
        VOa_3 vOa_3 = a2 = this;
        vOa_3.copyOnWrite();
        fRa.J((fRa)((fRa)vOa_3.instance), (bQa)b2);
        return a2;
    }

    @Override
    public boolean hasPong() {
        VOa_3 a2;
        return ((fRa)a2.instance).hasPong();
    }

    public VOa setUpdateMuted(wpa wpa2) {
        VOa_3 a2;
        VOa_3 b2 = wpa2;
        VOa_3 vOa_3 = a2 = this;
        vOa_3.copyOnWrite();
        fRa.f((fRa)((fRa)vOa_3.instance), (wpa)b2);
        return a2;
    }

    public VOa setAudio(Dra dra) {
        VOa_3 a2;
        MessageLiteOrBuilder b2 = dra;
        VOa_3 vOa_3 = a2 = this;
        vOa_3.copyOnWrite();
        fRa.f((fRa)((fRa)vOa_3.instance), (Dra)b2);
        return a2;
    }

    @Override
    public Mra getAudioEnd() {
        VOa_3 a2;
        return ((fRa)a2.instance).getAudioEnd();
    }

    @Override
    public boolean hasOutdatedClient() {
        VOa_3 a2;
        return ((fRa)a2.instance).hasOutdatedClient();
    }

    public VOa clearData() {
        VOa_3 a2;
        VOa_3 vOa_3 = a2;
        vOa_3.copyOnWrite();
        fRa.d((fRa)((fRa)vOa_3.instance));
        return a2;
    }

    public VOa clearAudioDataBatch() {
        VOa_3 a2;
        VOa_3 vOa_3 = a2;
        vOa_3.copyOnWrite();
        fRa.f((fRa)((fRa)vOa_3.instance));
        return a2;
    }

    public VOa setAudioEnd(Mra mra2) {
        VOa_3 a2;
        VOa_3 b2 = mra2;
        VOa_3 vOa_3 = a2 = this;
        vOa_3.copyOnWrite();
        fRa.f((fRa)((fRa)vOa_3.instance), (Mra)b2);
        return a2;
    }

    public VOa setPong(Vpa vpa2) {
        VOa_3 a2;
        VOa_3 b2 = vpa2;
        VOa_3 vOa_3 = a2 = this;
        vOa_3.copyOnWrite();
        fRa.J((fRa)((fRa)vOa_3.instance), (Vpa)b2);
        return a2;
    }

    @Override
    public Dra getAudio() {
        VOa_3 a2;
        return ((fRa)a2.instance).getAudio();
    }

    public VOa mergeDisconnect(mpa mpa2) {
        VOa_3 a2;
        VOa_3 b2 = mpa2;
        VOa_3 vOa_3 = a2 = this;
        vOa_3.copyOnWrite();
        fRa.f((fRa)((fRa)vOa_3.instance), (mpa)b2);
        return a2;
    }

    @Override
    public Vpa getPong() {
        VOa_3 a2;
        return ((fRa)a2.instance).getPong();
    }

    @Override
    public boolean hasUpdateMuted() {
        VOa_3 a2;
        return ((fRa)a2.instance).hasUpdateMuted();
    }

    public VOa mergeUpdateMuted(wpa wpa2) {
        VOa_3 a2;
        VOa_3 b2 = wpa2;
        VOa_3 vOa_3 = a2 = this;
        vOa_3.copyOnWrite();
        fRa.J((fRa)((fRa)vOa_3.instance), (wpa)b2);
        return a2;
    }

    public VOa mergeAudio(Dra dra) {
        VOa_3 a2;
        MessageLiteOrBuilder b2 = dra;
        VOa_3 vOa_3 = a2 = this;
        vOa_3.copyOnWrite();
        fRa.J((fRa)((fRa)vOa_3.instance), (Dra)b2);
        return a2;
    }

    @Override
    public qPa getDataCase() {
        VOa_3 a2;
        return ((fRa)a2.instance).getDataCase();
    }

    public VOa setOnePlayerData(Rra rra2) {
        VOa_3 a2;
        VOa_3 b2 = rra2;
        VOa_3 vOa_3 = a2 = this;
        vOa_3.copyOnWrite();
        fRa.J((fRa)((fRa)vOa_3.instance), (Rra)b2);
        return a2;
    }

    @Override
    public mpa getDisconnect() {
        VOa_3 a2;
        return ((fRa)a2.instance).getDisconnect();
    }

    public VOa clearAudioEnd() {
        VOa_3 a2;
        VOa_3 vOa_3 = a2;
        vOa_3.copyOnWrite();
        fRa.C((fRa)((fRa)vOa_3.instance));
        return a2;
    }

    public VOa setOutdatedClient(Rqa rqa2) {
        VOa_3 a2;
        VOa_3 b2 = rqa2;
        VOa_3 vOa_3 = a2 = this;
        vOa_3.copyOnWrite();
        fRa.f((fRa)((fRa)vOa_3.instance), (Rqa)b2);
        return a2;
    }

    public VOa clearUpdateMuted() {
        VOa_3 a2;
        VOa_3 vOa_3 = a2;
        vOa_3.copyOnWrite();
        fRa.J((fRa)((fRa)vOa_3.instance));
        return a2;
    }

    public VOa setPlayerListData(bQa bQa2) {
        VOa_3 a2;
        VOa_3 b2 = bQa2;
        VOa_3 vOa_3 = a2 = this;
        vOa_3.copyOnWrite();
        fRa.f((fRa)((fRa)vOa_3.instance), (bQa)b2);
        return a2;
    }

    private VOa_3() {
        super(fRa.J());
        VOa_3 a2;
    }

    public VOa setDisconnectPlayer(epa epa2) {
        VOa_3 a2;
        VOa_3 b2 = epa2;
        VOa_3 vOa_3 = a2 = this;
        vOa_3.copyOnWrite();
        fRa.f((fRa)((fRa)vOa_3.instance), (OPa)((OPa)b2.build()));
        return a2;
    }

    @Override
    public boolean hasDisconnect() {
        VOa_3 a2;
        return ((fRa)a2.instance).hasDisconnect();
    }

    public VOa clearOnePlayerData() {
        VOa_3 a2;
        VOa_3 vOa_3 = a2;
        vOa_3.copyOnWrite();
        fRa.D((fRa)((fRa)vOa_3.instance));
        return a2;
    }

    @Override
    public boolean hasAudioDataBatch() {
        VOa_3 a2;
        return ((fRa)a2.instance).hasAudioDataBatch();
    }

    public /* synthetic */ VOa_3(Ipa ipa) {
        VOa_3 b2 = ipa;
        VOa_3 a2 = this;
        a2();
    }

    public VOa mergeAudioEnd(Mra mra2) {
        VOa_3 a2;
        VOa_3 b2 = mra2;
        VOa_3 vOa_3 = a2 = this;
        vOa_3.copyOnWrite();
        fRa.J((fRa)((fRa)vOa_3.instance), (Mra)b2);
        return a2;
    }

    public VOa setDisconnectPlayer(OPa oPa) {
        VOa_3 a2;
        VOa_3 b2 = oPa;
        VOa_3 vOa_3 = a2 = this;
        vOa_3.copyOnWrite();
        fRa.f((fRa)((fRa)vOa_3.instance), (OPa)b2);
        return a2;
    }

    public VOa clearPlayerListData() {
        VOa_3 a2;
        VOa_3 vOa_3 = a2;
        vOa_3.copyOnWrite();
        fRa.G((fRa)((fRa)vOa_3.instance));
        return a2;
    }

    public VOa setAudio(spa spa2) {
        VOa_3 a2;
        VOa_3 b2 = spa2;
        VOa_3 vOa_3 = a2 = this;
        vOa_3.copyOnWrite();
        fRa.f((fRa)((fRa)vOa_3.instance), (Dra)((Dra)b2.build()));
        return a2;
    }

    public VOa clearPong() {
        VOa_3 a2;
        VOa_3 vOa_3 = a2;
        vOa_3.copyOnWrite();
        fRa.l((fRa)((fRa)vOa_3.instance));
        return a2;
    }

    @Override
    public bQa getPlayerListData() {
        VOa_3 a2;
        return ((fRa)a2.instance).getPlayerListData();
    }

    @Override
    public boolean hasAudio() {
        VOa_3 a2;
        return ((fRa)a2.instance).hasAudio();
    }

    public VOa setAudioEnd(YQa yQa2) {
        VOa_3 a2;
        VOa_3 b2 = yQa2;
        VOa_3 vOa_3 = a2 = this;
        vOa_3.copyOnWrite();
        fRa.f((fRa)((fRa)vOa_3.instance), (Mra)((Mra)b2.build()));
        return a2;
    }

    public VOa setPong(qOa qOa2) {
        VOa_3 a2;
        VOa_3 b2 = qOa2;
        VOa_3 vOa_3 = a2 = this;
        vOa_3.copyOnWrite();
        fRa.J((fRa)((fRa)vOa_3.instance), (Vpa)((Vpa)b2.build()));
        return a2;
    }
}

