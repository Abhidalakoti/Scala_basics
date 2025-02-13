object Call_By_Name {

  def main(args: Array[String]) {
    delayed(time());

  }

  def time() = {
    println("Getting time in nanoseconds")
    System.nanoTime
  }

  def delayed(t: => Long) = {
    println("In delayed method")
    println("Param: " + t)
  }
}