import scala.util.matching.Regex

object Regex {
  def main(args: Array[String]): Unit ={
    val pattern  = "Scala".r
    val str = "Scala is Scalable and cool"

    println(pattern findFirstIn str);
    val pattern1 = new Regex("(S|s)cala")
    val str1 = "Scala is scalable and cool"
    println((pattern findAllIn str).mkString(" ,"))
    val pattern2 = "(S|s)cala".r

    println(pattern replaceFirstIn(str, "Kotlin"))
  }
}