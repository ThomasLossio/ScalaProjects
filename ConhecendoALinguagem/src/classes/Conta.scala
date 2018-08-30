package classes

class Conta(nAgencia:String, nConta:String, s:Float) {
  var numAgencia:String = nAgencia
  var numConta:String = nConta
  var saldo:Float = s
  
  def deposito(valor:Float): Unit = {
    saldo = saldo + valor
  }
  
  def saque(valor:Float): Boolean = {
    if (saldo - valor >= 0) {
      saldo = saldo - valor
      return true
      
    }
    false
  }
  
  override def toString(): String = 
    "(Agencia: " + numAgencia + ", Conta: " + numConta + ", Saldo: " + saldo + ")";
}