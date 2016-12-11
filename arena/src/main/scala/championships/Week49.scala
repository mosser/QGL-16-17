package championships

import eu.ace_design.island.arena.Run
import eu.ace_design.island.game._
import eu.ace_design.island.map.IslandMap
import eu.ace_design.island.map.resources.Resource
import eu.ace_design.island.stdlib.Resources._
import library.{Islands, SI3}

object Week49 extends Run with SI3 {

  override val number: String = "49"

  override val seed: Long                = Islands.s49
  override lazy val theIsland: IslandMap = Islands.week49

  override val crew: Int    = 10
  override val budget: Int  = 15000
  override val plane: Plane = Plane(159, 159, Directions.NORTH)
  override val objectives: Set[(Resource, Int)] = Set((WOOD, 5000), (FUR, 100), (INGOT,5))

  override def players = all - "iaaf" - "iabc" - "iadd"

}