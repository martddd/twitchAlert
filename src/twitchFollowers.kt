
import org.jsoup.Jsoup

fun main(args: Array<String>){
//    println("Эта программа будет выводить сообщение о новых followers")

    var base_url = "http://www.foreca.ru/Russia/Smolensk"


    val doc = Jsoup.connect(base_url).get()

    val newsHeadlines = doc.select("right txt-tight")

    print(newsHeadlines)

}