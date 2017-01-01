package championships

import eu.ace_design.island.arena.Run
import eu.ace_design.island.game._
import eu.ace_design.island.map.IslandMap
import eu.ace_design.island.map.resources.Resource
import eu.ace_design.island.stdlib.Resources._
import library.{Islands, SI3}

object Week52 extends Run with SI3 {

  override val number: String = "52"

  override val seed: Long                = Islands.s52
  override lazy val theIsland: IslandMap = Islands.week52

  override val crew: Int    = 6
  override val budget: Int  = 20000
  override val plane: Plane = Plane(1, 1, Directions.SOUTH)
  override val objectives: Set[(Resource, Int)] = Set((WOOD, 8000), (QUARTZ, 100), (GLASS, 2))

  override def players = all - "iaab" - "iaae" - "iaaf" - "iace"

}