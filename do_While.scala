object do_While {
  def main(args: Array[String]): Unit =
  {
    var a = 10;

    do{
      println("Value of a:" +a);
      a = a+1;
    }
    while( a< 20)
  }
}