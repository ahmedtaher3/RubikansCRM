package com.devartlab

import android.app.Service
import android.content.Intent
import android.os.IBinder


class HuaweiPushNotificationService : Service() {
    override fun onBind(p0: Intent?): IBinder? {
        return null
    }

}