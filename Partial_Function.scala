import java.util.Date

object Partial_Function {
  def main(args:Array[String]) {
    val date = new Date
    val logWithDateBound = log(date, _: String)
    logWithDateBound("message1")
    Thread.sleep(1000)
    logWithDateBound("message2")
    Thread.sleep(1000)

    logWithDateBound("message3")


  }
  def log(date:Date, message:String) = {
    println(date+ "----" +message)
  }
}