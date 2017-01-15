package championships

import eu.ace_design.island.arena.Run
import eu.ace_design.island.game._
import eu.ace_design.island.map.IslandMap
import eu.ace_design.island.map.resources.Resource
import eu.ace_design.island.stdlib.Resources._
import library.{Islands, SI3}

object Week02 extends Run with SI3 {

  override val number: String = "02"

  override val seed: Long                = Islands.s02
  override lazy val theIsland: IslandMap = Islands.week02

  override val crew: Int    = 15
  override val budget: Int  = 30000
  override val plane: Plane = Plane(159, 159, Directions.NORTH)
  override val objectives: Set[(Resource, Int)] = Set((WOOD, 2000), (FUR, 100), (QUARTZ, 400), (RUM, 2))

  override def players = all

}