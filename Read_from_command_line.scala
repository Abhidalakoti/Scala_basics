import scala.io.StdIn.{readLine, readInt}



object Read_from_command_line {

  def main(args: Array[String]) {

    print("Please enter your input:")
    val line = scala.io.StdIn.readLine

    println("Thanks, you just typed:" + line)
  }
}