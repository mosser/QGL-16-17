package championships

import eu.ace_design.island.arena.Run
import eu.ace_design.island.game._
import eu.ace_design.island.map.IslandMap
import eu.ace_design.island.map.resources.Resource
import eu.ace_design.island.stdlib.Resources._
import library.{Islands, SI3}

object Week05 extends Run with SI3 {

  override val number: String = "05"

  override val seed: Long                = Islands.s05
  override lazy val theIsland: IslandMap = Islands.week05

  override val crew: Int    = 10
  override val budget: Int  = 30000
  override val plane: Plane = Plane(1, 1, Directions.SOUTH)
  override val objectives: Set[(Resource, Int)] = Set((WOOD, 2000), (FUR, 100), (QUARTZ, 400), (RUM, 2))

  override def players = all - "iaab" - "iabe"

}