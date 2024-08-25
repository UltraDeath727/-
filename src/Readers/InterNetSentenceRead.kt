package Readers
import java.net.URL
val file = URL("https://api.xygeng.cn/one").readText()
fun readByName(): String {
    return file.split(",",":")[8].replace("\"","")
}
fun readBook() :String{
    return file.split(",",":")[10].replace("\"","")
}
fun readMain() :String{
    return file.split(",",":")[12].replace("\n", " ").replace("\r", "　")
}
fun getASentence(){
    print(readMain() + "\n————" + readByName()+"《"+ readBook()+"》\n")
}
