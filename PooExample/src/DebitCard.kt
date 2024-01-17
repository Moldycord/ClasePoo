import kotlin.math.exp

class DebitCard(
    balance: Double,
    noCard: Long,
    ccv: Int,
    expireDate: String,
    val accountNumber: Long
) : Card(balance, noCard, ccv, expireDate) {

}