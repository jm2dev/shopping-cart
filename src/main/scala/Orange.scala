package com.jm2dev.hmrc

class Orange(quantity: Int) extends Fruit(quantity, BigDecimal(0.25)) {
  override val cost: BigDecimal = new Fruit(offeredQuantity(), BigDecimal(0.25)).cost

  private def offeredQuantity() = {
    val groups = Math.floorDiv(quantity, 3)
    Math.floorMod(quantity, 3) match {
      case 0 => groups * 2
      case _ => quantity - (3 * groups) + (groups * 2)
    }
  }
}
