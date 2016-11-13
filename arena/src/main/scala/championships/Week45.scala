package championships

import eu.ace_design.island.arena.Run
import eu.ace_design.island.game._
import eu.ace_design.island.map.IslandMap
import eu.ace_design.island.map.resources.Resource
import eu.ace_design.island.stdlib.Resources._
import library.{Islands, SI3}
import library.SI3

object Week45 extends Run with SI3 {

  override val number: String = "45"

  override val seed: Long                = Islands.s45
  override lazy val theIsland: IslandMap = Islands.week45

  override val crew: Int    = 15
  override val budget: Int  = 20000
  override val plane: Plane = Plane(1, 1, Directions.EAST)
  override val objectives: Set[(Resource, Int)] = Set((WOOD, 1000), (QUARTZ, 300), (FLOWER,10))

  override def players = all -
                          "iaaa" - "iaab" - "iaac" - "iaad" - "iaae" - "iaaf" -
                          "iaba" - "iabb" - "iabc" - "iabd" - "iabe" -
                          "iaca" - "iacd" - "iace" -
                          "iada" - "iadb" - "iadc" - "iade"
}