package specmethods

import org.scalatest._

class TestBankAcount extends FlatSpec {

  behavior of "A bankaccount"

  it should "not withdraw money if you ask more than it has" in {
    val myBankAccount = new BankAccount(0);
    assertThrows[java.lang.IllegalArgumentException] {
      myBankAccount.withdraw(1)
    }
  }

  it must "withdraw correct amount of money" in {
    val myBankAccount = new BankAccount(100);
    myBankAccount.withdraw(75)
    assert(myBankAccount.balance == 25)
  }
}