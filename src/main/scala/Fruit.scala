package com.jm2dev.hmrc

class Fruit(quantity: Int, price: BigDecimal) {
  val cost = quantity * price

  def total() = "£%.2f" format cost
}
