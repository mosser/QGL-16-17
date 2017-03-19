package championships

import eu.ace_design.island.arena.Run
import eu.ace_design.island.game._
import eu.ace_design.island.map.IslandMap
import eu.ace_design.island.map.resources.Resource
import eu.ace_design.island.stdlib.Resources._
import library.{Islands, SI3}

object Week11 extends Run with SI3 {

  override val number: String = "11"

  override val seed: Long                = Islands.s11
  override lazy val theIsland: IslandMap = Islands.week11

  override val crew: Int    = 2
  override val budget: Int  = 40000
  override val plane: Plane = Plane(1, 1, Directions.EAST)
  override val objectives: Set[(Resource, Int)] =
    Set((WOOD, 25000), (RUM, 30), (QUARTZ, 350))

  override def players =  all - "iabe"

}