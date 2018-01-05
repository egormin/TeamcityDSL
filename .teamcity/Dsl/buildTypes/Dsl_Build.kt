package Dsl.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.buildFeatures.swabra
import jetbrains.buildServer.configs.kotlin.v2017_2.triggers.vcs

object Dsl_Build : BuildType({
    uuid = "7f979d2a-d5d4-41fe-9927-5316d28080d1"
    id = "Dsl_Build"
    name = "Build"
    val the_list = listOf("Java 1.7", "Java 1.8", "Gradle 3", "Gradle 4", "Terraform 3", "Terraform 4", "Python 5")

    params {
        select("Choice", "", label = "Choose necessary software", display = ParameterDisplay.PROMPT,
                allowMultiple = true,
                options = the_list
        select("Installed", "in", label = "Installed software", display = ParameterDisplay.PROMPT,
                options = listOf("Java 1.7", "Gradle 3", "Gradle 2"))
    }

    vcs {
        root(Dsl.vcsRoots.Dsl_HttpsGithubComEgorminTeamcityDSLRefsHeadsMaster)

    }

    triggers {
        vcs {
        }
    }

    features {
        swabra {
        }
    }
})
