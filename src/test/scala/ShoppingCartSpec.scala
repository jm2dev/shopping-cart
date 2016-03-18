package com.jm2dev.hmrc

import org.specs2.Specification

class ShoppingCartSpec extends Specification {
  def is =
    s2"""
         Shopping cart checkout
          an apple is '£0.60'                                                 $e1
          an orange is '£0.25'                                                $e2
          cost for 'Apple,Orange,Apple,Apple' is 2.05                         $e3
          cost for invalid input is error message                             $e4
  """

  def e1 = new ShoppingCart("Apple").total() must be equalTo ("£0.60")
  def e2 = new ShoppingCart("Orange").total() must be equalTo ("£0.25")
  def e3 = new ShoppingCart("Apple,Orange,Apple,Apple").total() must be equalTo ("£2.05")
  def e4 = new ShoppingCart("Apple,Pear,XXX,Apple").total() must be equalTo ("ERROR: invalid input.")
}
