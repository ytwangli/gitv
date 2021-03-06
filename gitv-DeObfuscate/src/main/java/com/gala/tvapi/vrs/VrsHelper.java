package com.gala.tvapi.vrs;

import com.gala.tvapi.p008b.C0214a;
import com.gala.tvapi.vrs.BaseHelper.C0328a;
import com.gala.tvapi.vrs.core.C0365a;
import com.gala.tvapi.vrs.core.IVrsServer;
import com.gala.tvapi.vrs.p031a.C0336k;
import com.gala.tvapi.vrs.p031a.C0338b;
import com.gala.tvapi.vrs.p031a.C0340c;
import com.gala.tvapi.vrs.p031a.C0342e;
import com.gala.tvapi.vrs.p031a.C0344f;
import com.gala.tvapi.vrs.p031a.C0346g;
import com.gala.tvapi.vrs.p031a.C0350i;
import com.gala.tvapi.vrs.p031a.C0352j;
import com.gala.tvapi.vrs.p032b.C0363h;
import com.gala.tvapi.vrs.result.ApiResultChannelLabels;
import com.gala.tvapi.vrs.result.ApiResultChannelListCarousel;
import com.gala.tvapi.vrs.result.ApiResultChannelPlayList;
import com.gala.tvapi.vrs.result.ApiResultChannelTable;
import com.gala.tvapi.vrs.result.ApiResultCheckScore;
import com.gala.tvapi.vrs.result.ApiResultDailyLabels;
import com.gala.tvapi.vrs.result.ApiResultGroupDetail;
import com.gala.tvapi.vrs.result.ApiResultIChannelTable;
import com.gala.tvapi.vrs.result.ApiResultLiveM3u8;
import com.gala.tvapi.vrs.result.ApiResultMap;
import com.gala.tvapi.vrs.result.ApiResultMultiChannelLabels;
import com.gala.tvapi.vrs.result.ApiResultPackageContent;
import com.gala.tvapi.vrs.result.ApiResultPlayListQipu;
import com.gala.tvapi.vrs.result.ApiResultProgramListCarousel;
import com.gala.tvapi.vrs.result.ApiResultRecommendListQipu;
import com.gala.tvapi.vrs.result.ApiResultSetInitMovie;
import com.gala.tvapi.vrs.result.ApiResultUploadScore;
import com.gala.tvapi.vrs.result.ApiResultVVScalePM;
import com.gala.tvapi.vrs.result.ApiResultVideoInfo;
import com.gala.tvapi.vrs.result.ApiResultViewership;

public class VrsHelper extends BaseHelper {
    private static C0336k f1210a = new C0336k();
    public static final IVrsServer<ApiResultChannelLabels> channelLabels = C0214a.m581a(C0214a.m589a(C0365a.ak, true), f1210a, ApiResultChannelLabels.class, "channelLable", false, false);
    public static final IVrsServer<ApiResultChannelLabels> channelLabelsFilter = C0214a.m581a(C0214a.m589a(C0365a.al, true), f1210a, ApiResultChannelLabels.class, "channelLable", false, false);
    public static final IVrsServer<ApiResultChannelLabels> channelLabelsInterval = C0214a.m581a(C0214a.m589a(C0365a.ap, true), f1210a, ApiResultChannelLabels.class, "channelLable", false, false);
    public static final IVrsServer<ApiResultChannelLabels> channelLabelsLive = C0214a.m581a(C0214a.m589a(C0365a.am, true), f1210a, ApiResultChannelLabels.class, "channelLable", false, false);
    public static final IVrsServer<ApiResultChannelLabels> channelLabelsSize = C0214a.m581a(C0214a.m589a(C0365a.an, true), f1210a, ApiResultChannelLabels.class, "channelLable", false, false);
    public static final IVrsServer<ApiResultChannelListCarousel> channelListCarousel = C0214a.m581a(C0214a.m589a(C0365a.bH, true), f1210a, ApiResultChannelListCarousel.class, "liveChannelList", false, true);
    public static final IVrsServer<ApiResultChannelPlayList> channelPlayList = C0214a.m581a(new C0328a(C0365a.ao), f1210a, ApiResultChannelPlayList.class, "playList_channel", false, false);
    public static final IVrsServer<ApiResultChannelTable> channelTable = C0214a.m581a(new C0328a(C0365a.f1255Y), f1210a, ApiResultChannelTable.class, "channelTable", false, true);
    public static final IVrsServer<ApiResultCheckScore> checkUserScore = C0214a.m581a(new C0328a(C0365a.aS), f1210a, ApiResultCheckScore.class, "getUserMovieScore", false, true);
    public static final IVrsServer<ApiResultRecommendListQipu> dailyInfo = C0214a.m581a(C0214a.m589a(C0365a.ae, true), f1210a, ApiResultRecommendListQipu.class, "daily", false, true);
    public static final IVrsServer<ApiResultDailyLabels> dailyLabels = C0214a.m581a(new C0328a(C0365a.af), new C0338b(), ApiResultDailyLabels.class, "tvPop", false, true);
    public static final IVrsServer<ApiResultGroupDetail> groupDetail = C0214a.m581a(C0214a.m597b(C0365a.bK), f1210a, ApiResultGroupDetail.class, "groupDetail", false, false);
    public static final IVrsServer<ApiResultGroupDetail> groupDetailPage = C0214a.m581a(C0214a.m597b(C0365a.bL), f1210a, ApiResultGroupDetail.class, "groupDetail_page", false, false);
    public static final IVrsServer<ApiResultRecommendListQipu> guessLikeAlbums = C0214a.m581a(C0214a.m589a(C0365a.ad, true), f1210a, ApiResultRecommendListQipu.class, "recommend", false, false);
    public static final IVrsServer<ApiResultIChannelTable> iChannelTable = C0214a.m581a(new C0328a(C0365a.f1256Z), f1210a, ApiResultIChannelTable.class, "iChannel", false, true);
    public static final IVrsServer<ApiResultLiveM3u8> liveM3u8Free = C0214a.m584a(new C0328a(C0365a.ag), new C0340c(), ApiResultLiveM3u8.class, "livenM3u8Free");
    public static final IVrsServer<ApiResultLiveM3u8> liveM3u8Vip = C0214a.m584a(new C0328a(C0365a.ah), new C0340c(), ApiResultLiveM3u8.class, "livenM3u8Vip");
    public static final IVrsServer<ApiResultMultiChannelLabels> multiChannelLabels = C0214a.m581a(new C0363h(C0365a.aT), new C0344f(), ApiResultMultiChannelLabels.class, "multiChannelLabel", false, false);
    public static final IVrsServer<ApiResultRecommendListQipu> multiRecommendThemeInfos = C0214a.m581a(C0214a.m589a(C0365a.aN, true), new C0350i(), ApiResultRecommendListQipu.class, "recommendMixinVideos", false, false);
    public static final IVrsServer<ApiResultProgramListCarousel> nextProgramCarousel = C0214a.m581a(new C0328a(C0365a.bJ), new C0346g(), ApiResultProgramListCarousel.class, "nextLiveProgram", false, true);
    public static final IVrsServer<ApiResultPackageContent> packageContentOfAlbum = C0214a.m581a(new C0328a(C0365a.aq), f1210a, ApiResultPackageContent.class, "contentBuy", false, true);
    public static final IVrsServer<ApiResultVVScalePM> platformVVScale = C0214a.m581a(new C0328a(C0365a.ai), f1210a, ApiResultVVScalePM.class, "vvScale", false, true);
    public static final IVrsServer<ApiResultPlayListQipu> playListQipu = C0214a.m581a(C0214a.m589a(C0365a.aa, true), f1210a, ApiResultPlayListQipu.class, "playList", false, false);
    public static final IVrsServer<ApiResultPlayListQipu> playListQipuPage = C0214a.m581a(C0214a.m589a(C0365a.ab, true), f1210a, ApiResultPlayListQipu.class, "playList_page", false, false);
    public static final IVrsServer<ApiResultProgramListCarousel> programListCarousel = C0214a.m581a(new C0328a(C0365a.bI), f1210a, ApiResultProgramListCarousel.class, "liveProgramList", false, true);
    public static final IVrsServer<ApiResultRecommendListQipu> recommendListQipu = C0214a.m581a(C0214a.m589a(C0365a.ac, true), f1210a, ApiResultRecommendListQipu.class, "recommend", false, false);
    public static final IVrsServer<ApiResultRecommendListQipu> recommendThemes = C0214a.m581a(C0214a.m589a(C0365a.aM, false), f1210a, ApiResultRecommendListQipu.class, "recommendThemes", false, true);
    public static final IVrsServer<ApiResultSetInitMovie> setInitMovie = C0214a.m581a(new C0328a(C0365a.aL), f1210a, ApiResultSetInitMovie.class, "movieSetInit", false, true);
    public static final IVrsServer<ApiResultUploadScore> uploadUserScore = C0214a.m581a(new C0328a(C0365a.aR), f1210a, ApiResultUploadScore.class, "addMovieScore?", false, true);
    public static final IVrsServer<ApiResultVideoInfo> videoInfo = C0214a.m581a(new C0328a(C0365a.bD), f1210a, ApiResultVideoInfo.class, "videoInfo", false, true);
    public static final IVrsServer<ApiResultViewership> viewership = C0214a.m581a(new C0328a(C0365a.aj), new C0352j(), ApiResultViewership.class, "viewership", false, true);
    public static final IVrsServer<ApiResultMap> vrsTvId2tvQid = C0214a.m581a(new C0328a(C0365a.bM), new C0342e(), ApiResultMap.class, "vrsTvId2tvQid", false, true);
}
