package championships

import eu.ace_design.island.arena.Run
import eu.ace_design.island.game._
import eu.ace_design.island.map.IslandMap
import eu.ace_design.island.map.resources.Resource
import eu.ace_design.island.stdlib.Resources._
import library.{Islands, SI3}

object Week10 extends Run with SI3 {

  override val number: String = "10"

  override val seed: Long                = Islands.s10
  override lazy val theIsland: IslandMap = Islands.week10

  override val crew: Int    = 15
  override val budget: Int  = 40000
  override val plane: Plane = Plane(1, 1, Directions.SOUTH)
  override val objectives: Set[(Resource, Int)] =
    Set((WOOD, 25000), (FRUITS, 1), (FISH, 150), (GLASS, 10), (ORE, 5))

  override def players =  all - "iadc" - "iadd"

}