import Readers.*
import java.util.concurrent.TimeUnit
fun main(){
    if (readConfig()){
        getASentence()
    }
    TimeUnit.SECONDS.sleep(1)
    println("欢迎使用随机网易云音乐读取!")
    TimeUnit.SECONDS.sleep(1)
    println("读取中,请稍后……")
    println("读取完毕,今天欣赏"+ readArtistName()+"的《"+ readSongName()+"》")
    TimeUnit.SECONDS.sleep(1)
    println("在浏览器中访问"+ readSongURL()+"\n退出中……")
    openBrowser()

}