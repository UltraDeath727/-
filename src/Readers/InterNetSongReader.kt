package Readers
import java.awt.Desktop
import java.net.URI
import java.net.URL

val get = URL("https://api.uomg.com/api/rand.music?sort=%E7%83%AD%E6%AD%8C%E6%A6%9C&format=json").readText()
fun readSongName():String{
    val getter = get.split(",",":")
    return getter[4].replace("\"", "").replace("《", "").replace("》", "")
}
fun readArtistName():String{
    val getter = get.split(",",":")
    return getter[12].replace("}", "").replace("\"", "")
}
fun readSongURL():String{
    val getter = get.split(",",":")
    return "http:"+getter[7].dropLast(1)
}
fun openBrowser(){
    try {
        Desktop.getDesktop().browse(URI(readSongURL()))
    }catch (e:Exception){
        print("")
    }
}