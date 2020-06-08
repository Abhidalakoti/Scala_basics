import  java.io.File
import java.io.PrintWriter

object Files{
  def main(args: Array[String]): Unit ={
    val writer = new PrintWriter(new File("test12.txt")
    )
    writer.write("Hello Scala")
    writer.close()
  }
}