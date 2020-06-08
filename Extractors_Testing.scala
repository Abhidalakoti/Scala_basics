object Extractors_Testing{
  def main(args: Array[String]): Unit ={
    def unapply(x:Int):  Boolean ={
      if(x%4 ==0){
        true
      }
      else
        false
    }
    println("The Unapply method returns:" +unapply(12))
    println("The Unapply method returns:" +unapply(35))
  }
}