package library

import eu.ace_design.island.arena.Teams
import eu.ace_design.island.bot.IExplorerRaid

trait SI3 extends Teams {

  def all: Map[String, Class[_ <: IExplorerRaid]] = g1 ++ g2 ++ g3 ++ g4

  def players = all


  private lazy val g1: Map[String, Class[_ <: IExplorerRaid]] = Map(
    "iaaa" -> classOf[fr.unice.polytech.si3.qgl.iaaa.Explorer],
    "iaab" -> classOf[fr.unice.polytech.si3.qgl.iaab.Explorer],
    "iaac" -> classOf[fr.unice.polytech.si3.qgl.iaac.Explorer],
    "iaad" -> classOf[fr.unice.polytech.si3.qgl.iaad.Explorer],
    "iaae" -> classOf[fr.unice.polytech.si3.qgl.iaae.Explorer],
    "iaaf" -> classOf[fr.unice.polytech.si3.qgl.iaaf.Explorer]
  )

  private lazy val g2: Map[String, Class[_ <: IExplorerRaid]] = Map(
    "iaba" -> classOf[fr.unice.polytech.si3.qgl.iaba.Explorer],
    "iabb" -> classOf[fr.unice.polytech.si3.qgl.iabb.Explorer],
    "iabc" -> classOf[fr.unice.polytech.si3.qgl.iabc.Explorer],
    "iabd" -> classOf[fr.unice.polytech.si3.qgl.iabd.Explorer]
    //"iabe" -> classOf[fr.unice.polytech.si3.qgl.iabe.Explorer]
  )

  private lazy val g3: Map[String, Class[_ <: IExplorerRaid]] = Map(
    "iaca" -> classOf[fr.unice.polytech.si3.qgl.iaca.Explorer],
    "iacb" -> classOf[fr.unice.polytech.si3.qgl.iacb.Explorer],
    "iacc" -> classOf[fr.unice.polytech.si3.qgl.iacc.Explorer],
    "iacd" -> classOf[fr.unice.polytech.si3.qgl.iacd.Explorer],
    "iace" -> classOf[fr.unice.polytech.si3.qgl.iace.Explorer]
  )

  private lazy val g4: Map[String, Class[_ <: IExplorerRaid]] = Map(
    "iada" -> classOf[fr.unice.polytech.si3.qgl.iada.Explorer],
    "iadb" -> classOf[fr.unice.polytech.si3.qgl.iadb.Explorer],
    "iadc" -> classOf[fr.unice.polytech.si3.qgl.iadc.Explorer],
    "iadd" -> classOf[fr.unice.polytech.si3.qgl.iadd.Explorer],
    "iade" -> classOf[fr.unice.polytech.si3.qgl.iade.Explorer]
  )


}
