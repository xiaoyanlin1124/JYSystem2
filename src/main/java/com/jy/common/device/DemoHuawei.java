package com.jy.common.device;

/**
 * @CalssName DemoHuawei
 * @Description 作用：
 * @Author Xiao
 * @Date 2018/11/19 0019 10:06
 * @Version 1.0
 **/
public class DemoHuawei {


/*
    private Message buildMessageForAndroid(String title, String description, String messagePayload,
                                           Integer passThrough, Integer actionType, String actionUrl, Integer notifyType, String extendContent) {
        Message message;
        Message.Builder builder = new Message.Builder()
                .title(title)//标题（注意16字真言限制长度，这段画上重点考）
                .description(description)//描述（注意128限制长度，这段画上重点考，这个描述，我理解为副标题，而且在手机客户端呈现的也是标题+描述，内容不会自己显示出来，如果只是为了通知用户信息，我们可以将信息内容放在此处，显示效果比较明显。但是三个文字区域都不可空。需要补充文字方可使用）
                .payload(messagePayload)//内容（这个长度够你用了）
                .restrictedPackageName(AggregationPushContent.MI_ANDROID_PACKAGE_NAME)//APP包名
                .passThrough(passThrough)//是否透传
                .notifyType(notifyType)//设置震动，响铃等等
                .extra("extend_content", extendContent);//这里要注意下，你可以通过自定义的key传给客户端一段透传参数

        if (actionType == 1) {//动作跳转根据自己定义的方式去跳转url，if里的两组.extra是必须要放入的，这段画上重点
            builder.extra(Constants.EXTRA_PARAM_NOTIFY_EFFECT, Constants.NOTIFY_ACTIVITY)
                    .extra(Constants.EXTRA_PARAM_INTENT_URI, actionUrl);
        } else if (actionType == 2) {
            builder.extra(Constants.EXTRA_PARAM_NOTIFY_EFFECT, Constants.NOTIFY_WEB)
                    .extra(Constants.EXTRA_PARAM_WEB_URI, actionUrl);
        }
        message = builder.build();
        return message;
    }


    public Result sendMessageToRegId(String messageId, String title, String description,
                                     String messagePayload, Integer passThrough, Integer actionType, String actionUrl, Integer notifyType,
                                     String extendContent, String regId) {

        Constants.useOfficial();//这里要注意，这是正式-启动方式，支持IOS跟Android,Constants.useSandbox();这是测试-启动方式，不支持Android，尽量申请正式APP,利用正式环境测试
        Sender sender = new Sender("你需要传入你所申请appsecret");
        Message message = buildMessageForAndroid(title, description, messagePayload, passThrough, actionType, actionUrl, notifyType, extendContent);
        Result result = null;
        try {
            result = sender.send(message, regId, RETRIES);
        } catch (Exception e) {
            //log
        }
        return result;
    }

    */
/**
     * 发送消息返回的错误码，如果返回ErrorCode.Success表示发送成功，其他表示发送失败。
     *//*

    ErrorCode errorMessage = result.getErrorCode();
    */
/**
     * 如果消息发送成功，服务器返回消息的ID；如果发送失败，返回null。
     *//*

    String platformMessageId = result.getMessageId();

    */
/**
     * 	如果消息发送失败，服务器返回错误原因的文字描述；如果发送成功，返回null。
     *//*

    String reason = result.getReason();
*/



    String HV_TOKEN_URL= "https://login.vmall.com/oauth2/token";
    String HV_API_URL= "https://api.push.hicloud.com/pushsend.do";


    /**
     * 获取下发通知消息的认证Token
     */
/*    public Map<String, String> refreshToken() {
        String accessToken;//下发通知消息的认证Token
        long tokenExpiredTime;  //accessToken的过期时间
        Map<String, String> data = Maps.newHashMap();
        try {
            String msgBody = MessageFormat.format(
                    "grant_type=client_credentials&client_secret={0}&client_id={1}",
                    URLEncoder.encode(appSecret, "UTF-8"), appId);
            String response = HttpUtil.post(tokenUrl, msgBody);
            JSONObject obj = JSONObject.parseObject(response);
            accessToken = obj.getString("access_token");
            tokenExpiredTime = obj.getLong("expires_in");

            data.put(redisKey, accessToken);
            data.put(tokenTimeKey, tokenExpiredTime + "");
        } catch (Exception e) {
            logger.error("HvPush -- >> 认证Token获取失败！原因：e = {}", ExceptionUtil.getMessage(e));
        }
        return data;
    }*/






}
