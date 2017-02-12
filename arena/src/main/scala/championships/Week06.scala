package championships

import eu.ace_design.island.arena.Run
import eu.ace_design.island.game._
import eu.ace_design.island.map.IslandMap
import eu.ace_design.island.map.resources.Resource
import eu.ace_design.island.stdlib.Resources._
import library.{Islands, SI3}

object Week06 extends Run with SI3 {

  override val number: String = "06"

  override val seed: Long                = Islands.s06
  override lazy val theIsland: IslandMap = Islands.week06

  override val crew: Int    = 20
  override val budget: Int  = 33333
  override val plane: Plane = Plane(1, 1, Directions.EAST)
  override val objectives: Set[(Resource, Int)] =
    Set((WOOD, 2000), (FRUITS, 20), (PLANK, 200), (SUGAR_CANE, 400), (RUM, 15))

  override def players = all

}