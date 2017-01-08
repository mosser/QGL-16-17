package championships

import eu.ace_design.island.arena.Run
import eu.ace_design.island.game._
import eu.ace_design.island.map.IslandMap
import eu.ace_design.island.map.resources.Resource
import eu.ace_design.island.stdlib.Resources._
import library.{Islands, SI3}

object Week01 extends Run with SI3 {

  override val number: String = "01"

  override val seed: Long                = Islands.s01
  override lazy val theIsland: IslandMap = Islands.week01

  override val crew: Int    = 7
  override val budget: Int  = 25000
  override val plane: Plane = Plane(1, 1, Directions.EAST)
  override val objectives: Set[(Resource, Int)] = Set((WOOD, 6000), (FUR, 400), (QUARTZ, 100), (RUM, 2))

  override def players = all

}