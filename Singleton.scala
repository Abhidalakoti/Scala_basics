object BankAccounts {
  private var lastNum = 0
  def newUniqueNum() = { lastNum += 1 ;  lastNum}
}

object Singleton {
  def main(args: Array[String]) :Unit ={
    println("Bank Account number is : "+BankAccounts.newUniqueNum());
    println("Bank Account number is : "+BankAccounts.newUniqueNum());
    println("Bank Account number is : "+BankAccounts.newUniqueNum());
    println("Bank Account number is : "+BankAccounts.newUniqueNum())


  }
}