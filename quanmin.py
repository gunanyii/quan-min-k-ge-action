import requests

import os
import sys

baseUrl = "https://node.kg.qq.com"
os.environ['NO_PROXY'] = baseUrl

ck1 = os.environ.get('TOKEN_1')
ck2 = os.environ.get('TOKEN_2')
cks = [
    "ck1",
    "ck2"
]

def httpQuery(url, ck):
    headers = {
        'User-Agent': 'Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:50.0) Gecko/20100101 Firefox/50.0',
        'Cookie': ck
    }
    try:
        response = requests.get(url, headers=headers, timeout=10)
        response.raise_for_status()
    except requests.exceptions.RequestException as e:
        raise SystemExit(e)
    else:
        # print(f"请求返回结果:{response.text}")
        return response.json()

def get_uid_from_cookie(cookie):
    cookies = cookie.split("; ")
    for c in cookies:
        parts = c.split("=")
        if parts[0] == "uid":
            return parts[1]
    return None

def go(ck):
    t_uUid = get_uid_from_cookie(ck);
    Url_a = baseUrl + "/webapp/proxy?ns=proto_profile&cmd=profile.getProfile&mapExt=JTdCJTIyZmlsZSUyMiUzQSUyMnByb2ZpbGVfd2ViYXBwSmNlJTIyJTJDJTIyY21kTmFtZSUyMiUzQSUyMlByb2ZpbGVHZXQlMjIlMkMlMjJhcHBpZCUyMiUzQTEwMDA2MjYlMkMlMjJkY2FwaSUyMiUzQSU3QiUyMmludGVyZmFjZUlkJTIyJTNBMjA1MzU5NTk3JTdEJTJDJTIybDVhcGklMjIlM0ElN0IlMjJtb2RpZCUyMiUzQTI5NDAxNyUyQyUyMmNtZCUyMiUzQTI2MjE0NCU3RCUyQyUyMmlwJTIyJTNBJTIyMTAwLjExMy4xNjIuMTc4JTIyJTJDJTIycG9ydCUyMiUzQSUyMjEyNDA2JTIyJTdE&t_uUid=" + t_uUid
    Url_b = baseUrl + "/webapp/proxy?ns=KG_TASK&cmd=task.getLottery&ns_inbuf=&mapExt=JTdCJTIyZmlsZSUyMiUzQSUyMnRhc2tKY2UlMjIlMkMlMjJjbWROYW1lJTIyJTNBJTIyTG90dGVyeVJlcSUyMiUyQyUyMnduc0NvbmZpZyUyMiUzQSU3QiUyMmFwcGlkJTIyJTNBMTAwMDU1NyU3RCUyQyUyMmw1YXBpJTIyJTNBJTdCJTIybW9kaWQlMjIlM0E1MDM5MzclMkMlMjJjbWQlMjIlM0E1ODk4MjQlN0QlN0Q%3D&t_uid=" + t_uUid + "&t_iShowEntry=1&t_type="
    t_type = ["1", "2"]
    Url_e = baseUrl + "/webapp/proxy?ns=KG_TASK&cmd=task.getLottery&mapExt=JTdCJTIyZmlsZSUyMiUzQSUyMnRhc2tKY2UlMjIlMkMlMjJjbWROYW1lJTIyJTNBJTIyTG90dGVyeVJlcSUyMiUyQyUyMmw1YXBpJTIyJTNBJTdCJTIybW9kaWQlMjIlM0E1MDM5MzclMkMlMjJjbWQlMjIlM0E1ODk4MjQlN0QlMkMlMjJsNWFwaV9leHAxJTIyJTNBJTdCJTIybW9kaWQlMjIlM0E4MTcwODklMkMlMjJjbWQlMjIlM0EzODAxMDg4JTdEJTdE&t_uid=" + t_uUid + "&t_type=103"
    Url_c = baseUrl + "/webapp/proxy?ns=KG_TASK&cmd=task.signinGetAward&mapExt=JTdCJTIyZmlsZSUyMiUzQSUyMnRhc2tKY2UlMjIlMkMlMjJjbWROYW1lJTIyJTNBJTIyR2V0U2lnbkluQXdhcmRSZXElMjIlMkMlMjJ3bnNDb25maWclMjIlM0ElN0IlMjJhcHBpZCUyMiUzQTEwMDA2MjYlN0QlMkMlMjJsNWFwaSUyMiUzQSU3QiUyMm1vZGlkJTIyJTNBNTAzOTM3JTJDJTIyY21kJTIyJTNBNTg5ODI0JTdEJTdE&t_uid=" + t_uUid + "&t_iShowEntry="
    t_iShowEntry = ["1", "2", "4", "16", "128", "512"]
    Url_1 = baseUrl + "/webapp/proxy?ns=proto_music_station&cmd=message.batch_get_music_cards&mapExt=JTdCJTIyY21kTmFtZSUyMiUzQSUyMkdldEJhdGNoTXVzaWNDYXJkc1JlcSUyMiUyQyUyMmZpbGUlMjIlM0ElMjJwcm90b19tdXNpY19zdGF0aW9uSmNlJTIyJTJDJTIyd25zRGlzcGF0Y2hlciUyMiUzQXRydWUlN0Q&t_uUid=" + t_uUid + "&g_tk_openkey="
    Url_d = baseUrl + "/webapp/proxy?ns=KG_TASK&cmd=task.getLottery&mapExt=JTdCJTIyZmlsZSUyMiUzQSUyMnRhc2tKY2UlMjIlMkMlMjJjbWROYW1lJTIyJTNBJTIyTG90dGVyeVJlcSUyMiUyQyUyMnduc0NvbmZpZyUyMiUzQSU3QiUyMmFwcGlkJTIyJTNBMTAwMDU1NyU3RCUyQyUyMmw1YXBpJTIyJTNBJTdCJTIybW9kaWQlMjIlM0E1MDM5MzclMkMlMjJjbWQlMjIlM0E1ODk4MjQlN0QlN0Q&t_uid=" + t_uUid + "&t_iShowEntry=4&t_type=104"
    Url_2 = baseUrl + "/webapp/proxy?t_stReward%3Aobject=%7B%22uInteractiveType%22%3A1%2C%22uRewardType%22%3A0%2C%22uFlowerNum%22%3A15%7D&ns=proto_music_station&cmd=message.get_reward&mapExt=JTdCJTIyY21kTmFtZSUyMiUzQSUyMkdldFJld2FyZFJlcSUyMiUyQyUyMmZpbGUlMjIlM0ElMjJwcm90b19tdXNpY19zdGF0aW9uSmNlJTIyJTJDJTIyd25zRGlzcGF0Y2hlciUyMiUzQXRydWUlN0Q&t_uUid=" + t_uUid + "&t_strUgcId="
    Url_3 = baseUrl + "/webapp/proxy?t_stReward%3Aobject=%7B%22uInteractiveType%22%3A0%2C%22uRewardType%22%3A0%2C%22uFlowerNum%22%3A10%7D&ns=proto_music_station&cmd=message.get_reward&mapExt=JTdCJTIyY21kTmFtZSUyMiUzQSUyMkdldFJld2FyZFJlcSUyMiUyQyUyMmZpbGUlMjIlM0ElMjJwcm90b19tdXNpY19zdGF0aW9uSmNlJTIyJTJDJTIyd25zRGlzcGF0Y2hlciUyMiUzQXRydWUlN0Q&t_uUid=" + t_uUid + "&t_strUgcId="

    # 获取信息
    jsonObject = httpQuery(Url_a, ck)
    num_a = jsonObject["data"]["profile.getProfile"]["uFlowerNum"]
    uname = jsonObject["data"]["profile.getProfile"]["stPersonInfo"]["sKgNick"]

    for a in range(len(t_iShowEntry)):
        httpQuery(Url_c + t_iShowEntry[a], ck)

    for b in range(len(t_type)):
        httpQuery(Url_b + t_type[b], ck)

    for c in range(1, 16):
        jsonObject2 = httpQuery(Url_1 + str(c), ck)
        vctMusicCards = jsonObject2["data"]["message.batch_get_music_cards"]["vctMusicCards"]
        for i in range(len(vctMusicCards)):
            strKey = vctMusicCards[i]["strKey"]
            strUgcId = vctMusicCards[i]["strUgcId"]
            bigInteger = vctMusicCards[i]["stReward"]["uFlowerNum"]
            Url = strUgcId + "&t_strKey=" + strKey
            if bigInteger > 10:
                httpQuery(Url_2 + Url, ck)
            if bigInteger > 1:
                httpQuery(Url_3 + Url, ck)

    httpQuery(Url_d, ck)
    httpQuery(Url_e, ck)
    jsonObject3 = httpQuery(Url_a, ck)
    num_b = jsonObject3["data"]["profile.getProfile"]["uFlowerNum"]
    num_c = num_b - num_a
    if num_c == 0:
        tx = "账户： " + uname + " 今日已经领取过鲜花，当前账户鲜花数为 " + str(num_b)
    else:
        tx = "账户： " + uname + "成功领取过鲜花，领取鲜花数为 " + str(num_c) + " 当前鲜花数为 " + str(
            num_b)
    print(tx)

if __name__ == '__main__':
    i = 0
    for ck in cks:
        i = i + 1
        print(f"ck{i}开始领取鲜花")
        go(ck)
        print(f"ck{i}领取鲜花结束")
    sys.exit()
