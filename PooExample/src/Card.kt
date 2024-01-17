abstract class Card(
    private var balance: Double,
    val noCard: Long,
    val ccv: Int,
    val expireDate: String
) {

    fun getBalance(): Double {
        return balance
    }

    fun updateBalance(newBalance: Double) {
        balance = newBalance
    }

    fun makePayment() {
        //TODO
    }

}