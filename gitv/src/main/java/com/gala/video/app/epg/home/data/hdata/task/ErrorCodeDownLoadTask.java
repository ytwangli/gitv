package com.gala.video.app.epg.home.data.hdata.task;

import com.gala.video.app.epg.home.data.pingback.HomePingbackFactory;
import com.gala.video.lib.framework.core.utils.LogUtils;
import com.gala.video.lib.share.ifmanager.GetInterfaceTools;
import com.gala.video.lib.share.ifmanager.bussnessIF.epg.pingback.HomePingbackType.CommonPingback;
import com.gala.video.lib.share.ifmanager.bussnessIF.errorcode.IErrorCodeProvider.Callback;
import com.gala.video.lib.share.pingback.PingBackParams.Keys;

public class ErrorCodeDownLoadTask extends BaseRequestTask {
    private static final String TAG = "home/ErrorCodeDownLoadTask";

    public void invoke() {
        LogUtils.d(TAG, "invoke ErrorCodeDownLoadTask");
        GetInterfaceTools.getErrorCodeProvider().updateErrorCode(new Callback() {
            public void onSuccess(String json) {
            }

            public void onException(Exception e, String arg1, String url) {
                HomePingbackFactory.instance().createPingback(CommonPingback.DATA_ERROR_PINGBACK).addItem("ec", "315008").addItem("pfec", arg1).addItem(Keys.ERRURL, url).addItem(Keys.APINAME, "ErrorCodeDownload").addItem("activity", "HomeActivity").addItem(Keys.T, "0").setOthersNull().post();
            }
        });
    }

    public void onOneTaskFinished() {
    }
}
