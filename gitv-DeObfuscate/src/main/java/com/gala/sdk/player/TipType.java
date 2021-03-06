package com.gala.sdk.player;

public class TipType {
    public static final int CONCRETE_TYPE_3D = 303;
    public static final int CONCRETE_TYPE_AD_END = 310;
    public static final int CONCRETE_TYPE_AD_START = 311;
    public static final int CONCRETE_TYPE_BITSTREAM_CHANGE = 312;
    public static final int CONCRETE_TYPE_CAROUSEL_AD_READY = 313;
    public static final int CONCRETE_TYPE_CHANGE_4K_FAIL_TO_SDR = 322;
    public static final int CONCRETE_TYPE_CHANGE_HDR_FAIL_TO_SDR = 321;
    public static final int CONCRETE_TYPE_CHECK_TAIL_NAME = 316;
    public static final int CONCRETE_TYPE_CHECK_TAIL_ORDER = 307;
    public static final int CONCRETE_TYPE_HDR_OPEN = 317;
    public static final int CONCRETE_TYPE_HDR_TO_SDR = 318;
    public static final int CONCRETE_TYPE_HISTORY = 305;
    public static final int CONCRETE_TYPE_JUMP_HEAD = 306;
    public static final int CONCRETE_TYPE_LOGIN = 325;
    public static final int CONCRETE_TYPE_MIDDLE_AD_READY = 309;
    public static final int CONCRETE_TYPE_MIDDLE_AD_START = 314;
    public static final int CONCRETE_TYPE_PREVIEW = 301;
    public static final int CONCRETE_TYPE_QUESTIONNAIRE_START = 324;
    public static final int CONCRETE_TYPE_REPLAY_PLAYNEXT = 304;
    public static final int CONCRETE_TYPE_SDR_VIP_STREAM_PREVIEW = 323;
    public static final int CONCRETE_TYPE_SELECTION = 308;
    public static final int CONCRETE_TYPE_SKIP_AD = 320;
    public static final int CONCRETE_TYPE_VIP_BITSTREAM = 302;
    public static final int CONCRETE_TYPE_VIP_BITSTREAM_CHANGE = 315;
    public static final int CONCRETE_TYPE_WILL_BECOME_HDR = 319;
    public static final String LOGIN_S = "login";
    public static final String SELECTION_S = "selection";
    public static final int SHOW_TYPE_ACTION_ITEM = 202;
    public static final int SHOW_TYPE_ICON = 203;
    public static final int SHOW_TYPE_ONLY_TEXT = 201;
    public static final String SKIP_AD_S = "skipad";
    private int f685a;
    private boolean f686a;
    private int f687b;
    private boolean f688b;
    private boolean f689c;
    private boolean f690d;

    public TipType setSupportInterrupt(boolean support) {
        this.f686a = support;
        return this;
    }

    public TipType setSupportPersistent(boolean support) {
        this.f688b = support;
        return this;
    }

    public TipType setAlwaysSend(boolean send) {
        this.f690d = send;
        return this;
    }

    public TipType setSupportLogin(boolean support) {
        this.f689c = support;
        return this;
    }

    public TipType setTipShowType(int type) {
        this.f685a = type;
        return this;
    }

    public TipType setConcreteTipType(int type) {
        this.f687b = type;
        return this;
    }

    public boolean isSupportInterrupt() {
        return this.f686a;
    }

    public boolean isSupportPersistent() {
        return this.f688b;
    }

    public int getTipShowType() {
        return this.f685a;
    }

    public int getConcreteTipType() {
        return this.f687b;
    }

    public boolean isSupportLogin() {
        return this.f689c;
    }

    public boolean isAlwaysSend() {
        return this.f690d;
    }
}
