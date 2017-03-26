package retrospective

import championships._
import eu.ace_design.island.arena.{Retrospective, Run}
import library.SI3

object SecondSemester extends Retrospective with SI3 {

  override val outputDir = "championships/_retro_qgl_2"

  val autumn: Set[Run] = Set(Week45, Week46, Week47, Week48, Week49, Week50, Week52, Week01, Week02)
  val spring: Set[Run] = Set(Week05, Week06, Week07, Week08, Week09, Week10, Week11, Week12)

  override val weeks: Set[Run] = autumn ++ spring

  trigger

}