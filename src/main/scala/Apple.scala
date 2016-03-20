package com.jm2dev.hmrc

class Apple(quantity: Int) extends Fruit(quantity, BigDecimal(0.6)) {
  override val cost: BigDecimal = new Fruit(offeredQuantity(), BigDecimal(0.6)).cost

  private def offeredQuantity() = Math.floorMod(quantity, 2) match {
    case 0 => quantity / 2
    case _ => (quantity / 2 + 1)
  }
}
