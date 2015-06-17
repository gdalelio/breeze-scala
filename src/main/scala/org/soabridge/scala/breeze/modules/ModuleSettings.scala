package org.soabridge.scala.breeze.modules

import com.typesafe.config.Config

/**
 * Missing documentation. 
 *
 * @author <a href="steffen.krause@soabridge.com">Steffen Krause</a>
 * @since 1.0
 */
class ModuleSettings(conf: Config, final val name: String) {

  final val mailboxType = conf.getString("mailbox.type")

  final val raw = conf

  final val workerType = conf.getString("worker.type")
}
