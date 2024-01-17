fun main() {

    val cardPersonal = CreditCard(
        1000.0, 678163668482,
        954, "19/11/2028"
    )

    printData(cardPersonal)

    val debitCard = DebitCard(
        2000.0, 3920103493,
        934, "20-11-2035",
        392324932
    )

    printData(debitCard)

}

fun printData(card: Card) {

    println("Numero de tarjeta : ${card.noCard}")
    println("El saldo disponible es : ${card.getBalance()}")
    println("La fecha de vencimiento es: ${card.expireDate}")


    if (card is DebitCard) {
        card.accountNumber
        println("El numero de cuenta es : ${card.accountNumber}")
    }else if(card is CreditCard){
        println("Esta es una tarjeta de credito")
    }

}