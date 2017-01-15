package retrospective
import championships._
import eu.ace_design.island.arena.{Retrospective, Run}
import library.SI3

object FirstSemester extends Retrospective with SI3 {

  override val outputDir = "championships/_retro_qgl_1"
  override val weeks: Set[Run] = Set(Week46, Week47, Week48, Week49, Week50, Week52, Week01, Week02)

  trigger

}