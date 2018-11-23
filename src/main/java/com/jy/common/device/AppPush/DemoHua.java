package com.jy.common.device.AppPush;

import net.sf.json.JSONObject;

import java.io.IOException;
import java.net.URLEncoder;
import java.text.MessageFormat;

/**
 * @CalssName DemoHua
 * @Description 作用：
 * @Author Xiao
 * @Date 2018/11/21 0021 16:43
 * @Version 1.0
 **/
public class DemoHua extends PushNcMsg{
    private static String appSecret = "ab1509869d4ccb8d770fcd26babe0e8c";
    private static  String appId = "100329529";//用户在华为开发者联盟申请的appId和appSecret（会员中心->应用管理，点击应用名称的链接）
    private static  String tokenUrl = "https://login.cloud.huawei.com/oauth2/v2/token"; //获取认证Token的URL
    private static  String accessToken;//下发通知消息的认证Token
    private static  long tokenExpiredTime;  //accessToken的过期时间

    //获取下发通知消息的认证Token
    private static  void refreshToken() throws IOException
    {
        String msgBody = MessageFormat.format(
                "grant_type=client_credentials&client_secret={0}&client_id={1}",
                URLEncoder.encode(appSecret, "UTF-8"), appId);
        String response = httpPost(tokenUrl, msgBody, 5000, 5000);
        JSONObject obj = JSONObject.fromObject(response);
        accessToken = obj.getString("access_token");
        tokenExpiredTime = System.currentTimeMillis() + obj.getLong("expires_in") * 1000;
    }
}
