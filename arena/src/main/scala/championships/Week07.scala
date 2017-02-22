package championships

import eu.ace_design.island.arena.Run
import eu.ace_design.island.game._
import eu.ace_design.island.map.IslandMap
import eu.ace_design.island.map.resources.Resource
import eu.ace_design.island.stdlib.Resources._
import library.{Islands, SI3}

object Week07 extends Run with SI3 {

  override val number: String = "07"

  override val seed: Long                = Islands.s07
  override lazy val theIsland: IslandMap = Islands.week07

  override val crew: Int    = 10
  override val budget: Int  = 20000
  override val plane: Plane = Plane(1, 1, Directions.SOUTH)
  override val objectives: Set[(Resource, Int)] =
    Set((WOOD, 8000), (FRUITS, 50), (PLANK, 1000), (SUGAR_CANE, 400), (RUM, 15))

  override def players = all - "iacc"

}