package com.xxl.job.executor.service;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;


public class QuanMinKg {
    public static void main(String[] args) throws IOException {
        String ck = "qq_domain_video_guid_verify=fc26291450b01e24; pgv_pvid=8730358532; tvfe_boss_uuid=cb84c7f4acb76446; RK=kWE1GC/9TJ; ptcz=4406215b95f27adcfa1192211dbd06ebdd22728c372c5329cf4c395fa2893920; qrsig=3845AB79F92EF46D4C6BAAB6C959D4F9; muid=6695948c2c2c308e; openid=C34E1A30D66F7F1C125592F8D48B33E9; openkey=JxEACmS06LYAD0LwAAAAICHo6QiVfqsFfO7qDButAKTYxmbvdCuihWEt6BiT3QmA; opentype=0; uid=48999175; userlevel=8";
        String t_uUid = "48999175";

        String Url_a = "https://node.kg.qq.com/webapp/proxy?ns=proto_profile&cmd=profile.getProfile&mapExt=JTdCJTIyZmlsZSUyMiUzQSUyMnByb2ZpbGVfd2ViYXBwSmNlJTIyJTJDJTIyY21kTmFtZSUyMiUzQSUyMlByb2ZpbGVHZXQlMjIlMkMlMjJhcHBpZCUyMiUzQTEwMDA2MjYlMkMlMjJkY2FwaSUyMiUzQSU3QiUyMmludGVyZmFjZUlkJTIyJTNBMjA1MzU5NTk3JTdEJTJDJTIybDVhcGklMjIlM0ElN0IlMjJtb2RpZCUyMiUzQTI5NDAxNyUyQyUyMmNtZCUyMiUzQTI2MjE0NCU3RCUyQyUyMmlwJTIyJTNBJTIyMTAwLjExMy4xNjIuMTc4JTIyJTJDJTIycG9ydCUyMiUzQSUyMjEyNDA2JTIyJTdE&t_uUid=" + t_uUid;
        String Url_b = "https://node.kg.qq.com/webapp/proxy?ns=KG_TASK&cmd=task.getLottery&ns_inbuf=&mapExt=JTdCJTIyZmlsZSUyMiUzQSUyMnRhc2tKY2UlMjIlMkMlMjJjbWROYW1lJTIyJTNBJTIyTG90dGVyeVJlcSUyMiUyQyUyMnduc0NvbmZpZyUyMiUzQSU3QiUyMmFwcGlkJTIyJTNBMTAwMDU1NyU3RCUyQyUyMmw1YXBpJTIyJTNBJTdCJTIybW9kaWQlMjIlM0E1MDM5MzclMkMlMjJjbWQlMjIlM0E1ODk4MjQlN0QlN0Q%3D&t_uid=" + t_uUid + "&t_iShowEntry=1&t_type=";
        String t_type[] = {"1", "2"};
        String Url_e = "https://node.kg.qq.com/webapp/proxy?ns=KG_TASK&cmd=task.getLottery&mapExt=JTdCJTIyZmlsZSUyMiUzQSUyMnRhc2tKY2UlMjIlMkMlMjJjbWROYW1lJTIyJTNBJTIyTG90dGVyeVJlcSUyMiUyQyUyMmw1YXBpJTIyJTNBJTdCJTIybW9kaWQlMjIlM0E1MDM5MzclMkMlMjJjbWQlMjIlM0E1ODk4MjQlN0QlMkMlMjJsNWFwaV9leHAxJTIyJTNBJTdCJTIybW9kaWQlMjIlM0E4MTcwODklMkMlMjJjbWQlMjIlM0EzODAxMDg4JTdEJTdE&t_uid=" + t_uUid + "&t_type=103";

        String Url_c = "https://node.kg.qq.com/webapp/proxy?ns=KG_TASK&cmd=task.signinGetAward&mapExt=JTdCJTIyZmlsZSUyMiUzQSUyMnRhc2tKY2UlMjIlMkMlMjJjbWROYW1lJTIyJTNBJTIyR2V0U2lnbkluQXdhcmRSZXElMjIlMkMlMjJ3bnNDb25maWclMjIlM0ElN0IlMjJhcHBpZCUyMiUzQTEwMDA2MjYlN0QlMkMlMjJsNWFwaSUyMiUzQSU3QiUyMm1vZGlkJTIyJTNBNTAzOTM3JTJDJTIyY21kJTIyJTNBNTg5ODI0JTdEJTdE&t_uid=" + t_uUid + "&t_iShowEntry=";
        String t_iShowEntry[] = {"1", "2", "4", "16", "128", "512"};
        String Url_1 = "https://node.kg.qq.com/webapp/proxy?ns=proto_music_station&cmd=message.batch_get_music_cards&mapExt=JTdCJTIyY21kTmFtZSUyMiUzQSUyMkdldEJhdGNoTXVzaWNDYXJkc1JlcSUyMiUyQyUyMmZpbGUlMjIlM0ElMjJwcm90b19tdXNpY19zdGF0aW9uSmNlJTIyJTJDJTIyd25zRGlzcGF0Y2hlciUyMiUzQXRydWUlN0Q&t_uUid=" + t_uUid + "&g_tk_openkey=";

        String Url_d = "https://node.kg.qq.com/webapp/proxy?ns=KG_TASK&cmd=task.getLottery&mapExt=JTdCJTIyZmlsZSUyMiUzQSUyMnRhc2tKY2UlMjIlMkMlMjJjbWROYW1lJTIyJTNBJTIyTG90dGVyeVJlcSUyMiUyQyUyMnduc0NvbmZpZyUyMiUzQSU3QiUyMmFwcGlkJTIyJTNBMTAwMDU1NyU3RCUyQyUyMmw1YXBpJTIyJTNBJTdCJTIybW9kaWQlMjIlM0E1MDM5MzclMkMlMjJjbWQlMjIlM0E1ODk4MjQlN0QlN0Q&t_uid=" + t_uUid + "&t_iShowEntry=4&t_type=104";
        String Url_2 = "https://node.kg.qq.com/webapp/proxy?t_stReward%3Aobject=%7B%22uInteractiveType%22%3A1%2C%22uRewardType%22%3A0%2C%22uFlowerNum%22%3A15%7D&ns=proto_music_station&cmd=message.get_reward&mapExt=JTdCJTIyY21kTmFtZSUyMiUzQSUyMkdldFJld2FyZFJlcSUyMiUyQyUyMmZpbGUlMjIlM0ElMjJwcm90b19tdXNpY19zdGF0aW9uSmNlJTIyJTJDJTIyd25zRGlzcGF0Y2hlciUyMiUzQXRydWUlN0Q&t_uUid=" + t_uUid + "&t_strUgcId=";
        String Url_3 = "https://node.kg.qq.com/webapp/proxy?t_stReward%3Aobject=%7B%22uInteractiveType%22%3A0%2C%22uRewardType%22%3A0%2C%22uFlowerNum%22%3A10%7D&ns=proto_music_station&cmd=message.get_reward&mapExt=JTdCJTIyY21kTmFtZSUyMiUzQSUyMkdldFJld2FyZFJlcSUyMiUyQyUyMmZpbGUlMjIlM0ElMjJwcm90b19tdXNpY19zdGF0aW9uSmNlJTIyJTJDJTIyd25zRGlzcGF0Y2hlciUyMiUzQXRydWUlN0Q&t_uUid=" + t_uUid + "&t_strUgcId=";
        //获取信息
        JSONObject jsonObject = httpQuery(Url_a, ck);

        Integer num_a = jsonObject.getJSONObject("data").getJSONObject("profile.getProfile").getInteger("uFlowerNum");
        String uname = jsonObject.getJSONObject("data").getJSONObject("profile.getProfile").getJSONObject("stPersonInfo").getString("sKgNick");


        for (int a = 0; a < t_iShowEntry.length; a++) {
            httpQuery(Url_c + t_iShowEntry[a], ck);
        }
        for (int b = 0; b < t_type.length; b++) {
            httpQuery(Url_b + t_type[b], ck);
        }
        for (int c = 1; c <= 15; c++) {
            JSONObject jsonObject2 = httpQuery(Url_1 + c, ck);
            JSONArray vctMusicCards = jsonObject2.getJSONObject("data").getJSONObject("message.batch_get_music_cards").getJSONArray("vctMusicCards");
            for (int i = 0; i < vctMusicCards.size(); i++) {
                String strKey = vctMusicCards.getJSONObject(i).getString("strKey");
                String strUgcId = vctMusicCards.getJSONObject(i).getString("strUgcId");
                Integer bigInteger = vctMusicCards.getJSONObject(i).getJSONObject("stReward").getInteger("uFlowerNum");
                String Url = strUgcId + "&t_strKey=" + strKey;
                if (bigInteger > 10) {
                    httpQuery(Url_2 + Url, ck);
                }
                if (bigInteger > 1) {
                    httpQuery(Url_3 + Url, ck);
                }
            }
        }
        httpQuery(Url_d, ck);
        httpQuery(Url_e, ck);
        JSONObject jsonObject3 = httpQuery(Url_a, ck);

        Integer num_b = jsonObject3.getJSONObject("data").getJSONObject("profile.getProfile").getInteger("uFlowerNum");
        Integer num_c = num_b - num_a;
        String tx = null;
        if (num_c == 0) {
            tx = "当前账户名 ： " + uname + " 您今日已经领取过鲜花，当前账户鲜花数量为 " + num_b;
        } else {
            tx = "当前账户名 ： " + uname + " 成功领取过鲜花，领取鲜花数量为 " + num_c + " 当前账户鲜花数量为 " + num_b;
        }
        System.out.println(tx);
    }

    private static JSONObject httpQuery(String url, String ck) throws IOException {
        // ============================= 【HttpClient】 ====================================
        // 创建httpclient实例
        CloseableHttpClient httpclient = HttpClients.createDefault();
        CloseableHttpResponse response = null;
        String content = null;
        try {

            // 创建httpget实例
            HttpGet httpget = new HttpGet(url);

            // 模拟浏览器
            httpget.setHeader("User-Agent",
                    "Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:50.0) Gecko/20100101 Firefox/50.0");
            httpget.setHeader("Cookie", ck);
            // 使用代{过}{滤}理 IP
            //HttpHost proxy = new HttpHost("118.114.77.47", 8080);
            RequestConfig config = RequestConfig.custom()
                    //设置连接超时
                    .setConnectTimeout(10000) // 设置连接超时时间 10秒钟
                    .setSocketTimeout(10000) // 设置读取超时时间10秒钟
                    .build();

            httpget.setConfig(config);

            // 执行get请求
            response = httpclient.execute(httpget);
            org.apache.http.HttpEntity entity = response.getEntity();
            // 获取返回实体
            content = EntityUtils.toString(entity, "utf-8");
            return JSONObject.parseObject(content);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            response.close(); // response关闭
            httpclient.close(); // httpClient关闭
        }
        return JSONObject.parseObject(content);
    }
}

