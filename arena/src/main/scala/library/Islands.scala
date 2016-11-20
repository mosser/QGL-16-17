package library

import eu.ace_design.island.dsl.DiSLand
import eu.ace_design.island.map.IslandMap
import eu.ace_design.island.map.processes.AssignPitch
import eu.ace_design.island.stdlib.WhittakerDiagrams

object Islands extends DiSLand {


  // Big island, easy to find.
  val s45 = 0xB03CA1A997813D02L
  lazy val week45: IslandMap = {
    createIsland shapedAs ellipsis(75.percent, 33.percent, 291) withSize 1600 having 2000.faces builtWith Seq(
      plateau(30), flowing(rivers = 5, distance = 0.4), withMoisture(soils.wet, distance = 100),
      AssignPitch, usingBiomes(WhittakerDiagrams.caribbean)) usingSeed s45
  }

  // Big island, easy to find.
  val s46 = 0xEA1353A8F444831L
  lazy val week46: IslandMap = {
    createIsland shapedAs ellipsis(75.percent, 44.percent, 42) withSize 1600 having 2000.faces builtWith Seq(
      plateau(10), flowing(rivers = 15, distance = 0.8), withMoisture(soils.dry, distance = 500),
      AssignPitch, usingBiomes(WhittakerDiagrams.nordic)) usingSeed s46
  }

}