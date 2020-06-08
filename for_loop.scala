object for_loop{
  def main(args: Array[String]): Unit ={
    var a = 0;
    for( a <- 1 to 10){
      println("Value of a:" +a);
// to print till 9 use until instead of to in for loop condition.
    }
  }
}