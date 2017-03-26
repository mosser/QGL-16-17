package championships

import eu.ace_design.island.arena.Run
import eu.ace_design.island.game._
import eu.ace_design.island.map.IslandMap
import eu.ace_design.island.map.resources.Resource
import eu.ace_design.island.stdlib.Resources._
import library.{Islands, SI3}

object Week12 extends Run with SI3 {

  override val number: String = "12"

  override val seed: Long                = Islands.s12
  override lazy val theIsland: IslandMap = Islands.week12

  override val crew: Int    = 2
  override val budget: Int  = 30000
  override val plane: Plane = Plane(1, 1, Directions.SOUTH)
  override val objectives: Set[(Resource, Int)] =
    Set((WOOD, 10000), (FLOWER, 30), (LEATHER, 200), (RUM, 30), (GLASS, 50), (PLANK,35000), (FUR, 1000))

  override def players =  all

}