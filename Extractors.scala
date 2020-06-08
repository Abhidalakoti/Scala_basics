object Extractors
{
  def main(args: Array[String]): Unit = {
    def apply(firstname: String, lastname: String) =
    {
      firstname+"nand"+lastname
    }

    def unapply(x: String) : Option[(String,String)] =
      {
        val y = x.split("nand")
        if(y.length == 2){
          Some(y(0), y(1))
        }
        else
           None
      }

   println("The Apply method returns :"
     +apply("Shweta", "Singh"))
    println("The Unapply method returns:"
      + unapply("ShwetanandSingh"))

  }
}