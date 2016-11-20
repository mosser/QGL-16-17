package championships

import eu.ace_design.island.arena.Run
import eu.ace_design.island.game._
import eu.ace_design.island.map.IslandMap
import eu.ace_design.island.map.resources.Resource
import eu.ace_design.island.stdlib.Resources._
import library.{Islands, SI3}

object Week46 extends Run with SI3 {

  override val number: String = "46"

  override val seed: Long                = Islands.s46
  override lazy val theIsland: IslandMap = Islands.week46

  override val crew: Int    = 2
  override val budget: Int  = 15000
  override val plane: Plane = Plane(1, 1, Directions.SOUTH)
  override val objectives: Set[(Resource, Int)] = Set((WOOD, 5000), (INGOT,5))

  override def players = all -
                          "iaab" - "iaad" - "iaaf" -
                          "iaba" - "iabc" - "iabe" -
                          "iacc" - "iace" -
                          "iadc" - "iade"
}