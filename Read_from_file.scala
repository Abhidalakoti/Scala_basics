import scala.io.Source

object Read_from_file{
  def main(args: Array[String]): Unit ={
    println("The content of file is:")

    Source.fromFile("Test.txt").foreach{
      print
    }
  }
}