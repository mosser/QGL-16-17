package championships

import eu.ace_design.island.arena.Run
import eu.ace_design.island.game._
import eu.ace_design.island.map.IslandMap
import eu.ace_design.island.map.resources.Resource
import eu.ace_design.island.stdlib.Resources._
import library.{Islands, SI3}

object Week50 extends Run with SI3 {

  override val number: String = "50"

  override val seed: Long                = Islands.s50
  override lazy val theIsland: IslandMap = Islands.week50

  override val crew: Int    = 13
  override val budget: Int  = 25000
  override val plane: Plane = Plane(1, 1, Directions.EAST)
  override val objectives: Set[(Resource, Int)] = Set((WOOD, 5000), (FUR, 400), (FLOWER, 2), (INGOT,5))

  override def players = all - "iaaa" - "iaab" - "iaaf" - "iacc" - "iacd"

}