package Readers

import java.io.File
val configs = File("config.yml")
fun readConfig():Boolean{
    if (!configs.exists()){
        configs.writeText("dailysentence=true")
    }else{
        val switcher = configs.readText().split("=")[1]
        if (switcher == "false"){
            return false
        }else if (switcher == "true"){
            return true
        }else{
            configs.delete()
        }
    }
    //如果是第一次读取.
    return true
}