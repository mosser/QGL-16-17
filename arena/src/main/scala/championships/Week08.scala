package championships

import eu.ace_design.island.arena.Run
import eu.ace_design.island.game._
import eu.ace_design.island.map.IslandMap
import eu.ace_design.island.map.resources.Resource
import eu.ace_design.island.stdlib.Resources._
import library.{Islands, SI3}

object Week08 extends Run with SI3 {

  override val number: String = "08"

  override val seed: Long                = Islands.s08
  override lazy val theIsland: IslandMap = Islands.week08

  override val crew: Int    = 10
  override val budget: Int  = 20000
  override val plane: Plane = Plane(1, 1, Directions.EAST)
  override val objectives: Set[(Resource, Int)] =
    Set((WOOD, 12000), (FRUITS, 100), (ORE, 10), (FUR, 200), (RUM, 15))

  override def players =  all - "iaab"

}