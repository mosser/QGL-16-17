package championships

import eu.ace_design.island.arena.Run
import eu.ace_design.island.game._
import eu.ace_design.island.map.IslandMap
import eu.ace_design.island.map.resources.Resource
import eu.ace_design.island.stdlib.Resources._
import library.{Islands, SI3}

object Week48 extends Run with SI3 {

  override val number: String = "48"

  override val seed: Long                = Islands.s48
  override lazy val theIsland: IslandMap = Islands.week48

  override val crew: Int    = 7
  override val budget: Int  = 15000
  override val plane: Plane = Plane(1, 1, Directions.SOUTH)
  override val objectives: Set[(Resource, Int)] = Set((WOOD, 5000), (FUR, 100), (RUM,10))

  override def players = all - "iaad" - "iaaf" - "iabe" - "iada" - "iadc" - "iabc"

}