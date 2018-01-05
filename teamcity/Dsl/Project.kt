package Dsl

import Dsl.buildTypes.*
import Dsl.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.Project

object Project : Project({
    uuid = "ac273e87-27c3-453f-b5c3-8c7672c3933e"
    id = "Dsl"
    parentId = "_Root"
    name = "DSL"

    vcsRoot(Dsl_HttpsGithubComEgorminGitTestRefsHeadsMaster)

    buildType(Dsl_Build)
})
