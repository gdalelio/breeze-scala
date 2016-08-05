/**
 * Copyright (C) 2016 SOABridge.org <http://www.soabridge.org>
 */
package org.soabridge.scala.breeze.framework.eventbus

/**
 * Missing documentation.
 *
 * @author <a href="steffen.krause@soabridge.com">Steffen Krause</a>
 * @since 1.0
 */
trait EventCondition[E] {

  def isMetBy(e: E): Boolean

}
