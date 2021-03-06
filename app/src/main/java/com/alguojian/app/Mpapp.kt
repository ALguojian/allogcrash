package com.alguojian.app

import android.app.Application
import android.content.Context
import com.alguojian.logcrash.CrashHandler

/**
 * @author alguojian
 * @date 2020/06/06
 */
class Mpapp : Application() {
    override fun onCreate() {
        super.onCreate()
        CrashHandler.initThis(this)
        val treeMap = hashMapOf<String, String?>()
        treeMap["用户手机号"] = null
        CrashHandler.setOtherNews(treeMap)
        CrashHandler.setDingDingLink("https://oapi.dingtalk.com/robot/send?access_token=9dd82a4b444089a65fcfbb522fa789709170db6142e64a832ff79c637f180533")
    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        xcrash.XCrash.init(this)
    }
}