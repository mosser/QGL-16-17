package library

import eu.ace_design.island.dsl.DiSLand
import eu.ace_design.island.map.IslandMap
import eu.ace_design.island.map.processes.AssignPitch
import eu.ace_design.island.stdlib.WhittakerDiagrams

object Islands extends DiSLand {

  val s06 = 0xDFBF50881D18A3D1L
  lazy val week06: IslandMap = {
    createIsland shapedAs radial(factor = 1.55) withSize 1600 having 2000.faces builtWith Seq(
      plateau(45), flowing(rivers = 45, distance = 0.90), withMoisture(soils.wet, distance = 500),
      AssignPitch, usingBiomes(WhittakerDiagrams.caribbean))  usingSeed s06
  }

  // Large island
  val s05 = 0xF5C79AC1683D63C4L
  lazy val week05: IslandMap = {
    createIsland shapedAs radial(factor = 1.05) withSize 1600 having 2000.faces builtWith Seq(
      plateau(30), flowing(rivers = 30, distance = 0.90), withMoisture(soils.wet, distance = 500),
      AssignPitch, usingBiomes(WhittakerDiagrams.caribbean)) usingSeed s05
  }

  // Large island
  val s02 = 0xA022872CE09E2B9CL
  lazy val week02: IslandMap = {
    createIsland shapedAs radial(factor = 1.01) withSize 1600 having 2000.faces builtWith Seq(
      plateau(25), flowing(rivers = 20, distance = 0.95), withMoisture(soils.wet, distance = 550),
      AssignPitch, usingBiomes(WhittakerDiagrams.caribbean)) usingSeed s02
  }

  // Very small island
  val s01 = 0xC212B31BDF5A67C9L
  lazy val week01: IslandMap = {
    createIsland shapedAs donut(35.percent, 10.percent) withSize 1600 having 2000.faces builtWith Seq(
      plateau(15), flowing(rivers = 5, distance = 0.50), withMoisture(soils.dry, distance = 550),
      AssignPitch, usingBiomes(WhittakerDiagrams.caribbean)) usingSeed s01
  }

  // Large crater lake with flowing rivers
  val s52 = 0x1E4DDC10E2F381CL
  lazy val week52: IslandMap = {
    createIsland shapedAs donut(80.percent, 30.percent) withSize 1600 having 2000.faces builtWith Seq(
      plateau(20), flowing(rivers = 15, distance = 0.6), withMoisture(soils.normal, distance = 950),
      AssignPitch, usingBiomes(WhittakerDiagrams.nordic)) usingSeed s52
  }

  // Small island, easy to explore with the drone.
  val s50 = 0xFD4800CB733BB8FBL
  lazy val week50: IslandMap = {
    createIsland shapedAs radial(0.95) withSize 1600 having 2000.faces builtWith Seq(
      plateau(35), flowing(rivers = 30, distance = 0.5), withMoisture(soils.wet, distance = 350),
      AssignPitch, usingBiomes(WhittakerDiagrams.caribbean)) usingSeed s50
  }

  // Small island, easy to explore with the drone.
  val s49 = 0xA43264158C840E1CL
  lazy val week49: IslandMap = {
    createIsland shapedAs ellipsis(50.percent, 33.percent, 75) withSize 1600 having 2000.faces builtWith Seq(
      plateau(15), flowing(rivers = 20, distance = 0.9), withMoisture(soils.wet, distance = 150),
      AssignPitch, usingBiomes(WhittakerDiagrams.caribbean)) usingSeed s49
  }

  // Small island, easy to explore with the drone.
  val s48 = 0xC3033B04FFBDB180L
  lazy val week48: IslandMap = {
    createIsland shapedAs donut(30.percent, 8.percent) withSize 1600 having 2000.faces builtWith Seq(
      plateau(10), flowing(rivers = 10, distance = 0.4), withMoisture(soils.normal, distance = 200),
      AssignPitch, usingBiomes(WhittakerDiagrams.caribbean))  usingSeed s48
  }

  // Small island, easy to explore with the drone.
  val s47 = 0x72CBC0A8BEB5F77BL
  lazy val week47: IslandMap = {
    createIsland shapedAs donut(40.percent, 3.percent) withSize 1600 having 2000.faces builtWith Seq(
      plateau(15), flowing(rivers = 5, distance = 0.8), withMoisture(soils.wet, distance = 100),
      AssignPitch, usingBiomes(WhittakerDiagrams.nordic))  usingSeed s47
  }

  // Big island, easy to find.
  val s46 = 0xEA1353A8F444831L
  lazy val week46: IslandMap = {
    createIsland shapedAs ellipsis(75.percent, 44.percent, 42) withSize 1600 having 2000.faces builtWith Seq(
      plateau(10), flowing(rivers = 15, distance = 0.8), withMoisture(soils.dry, distance = 500),
      AssignPitch, usingBiomes(WhittakerDiagrams.nordic)) usingSeed s46
  }

  // Big island, easy to find.
  val s45 = 0xB03CA1A997813D02L
  lazy val week45: IslandMap = {
    createIsland shapedAs ellipsis(75.percent, 33.percent, 291) withSize 1600 having 2000.faces builtWith Seq(
      plateau(30), flowing(rivers = 5, distance = 0.4), withMoisture(soils.wet, distance = 100),
      AssignPitch, usingBiomes(WhittakerDiagrams.caribbean)) usingSeed s45
  }

}