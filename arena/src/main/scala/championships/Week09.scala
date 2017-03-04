package championships

import eu.ace_design.island.arena.Run
import eu.ace_design.island.game._
import eu.ace_design.island.map.IslandMap
import eu.ace_design.island.map.resources.Resource
import eu.ace_design.island.stdlib.Resources._
import library.{Islands, SI3}

object Week09 extends Run with SI3 {

  override val number: String = "09"

  override val seed: Long                = Islands.s09
  override lazy val theIsland: IslandMap = Islands.week09

  override val crew: Int    = 15
  override val budget: Int  = 40000
  override val plane: Plane = Plane(1, 1, Directions.EAST)
  override val objectives: Set[(Resource, Int)] =
    Set((WOOD, 12000), (FRUITS, 100), (FLOWER, 500), (FUR, 2000), (RUM, 15), (GLASS, 2))

  override def players =  all

}