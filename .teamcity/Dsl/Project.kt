package Dsl

import Dsl.buildTypes.*
import Dsl.vcsRoots.*
import Dsl.vcsRoots.Dsl_HttpsGithubComEgorminTeamcityDSLtRefsHeadsMaster
import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.Project
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "ac273e87-27c3-453f-b5c3-8c7672c3933e"
    id = "Dsl"
    parentId = "_Root"
    name = "DSL"

    vcsRoot(Dsl_HttpsGithubComEgorminTeamcityDSLtRefsHeadsMaster)

    buildType(Dsl_Build)

    features {
        versionedSettings {
            id = "PROJECT_EXT_3"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.USE_CURRENT_SETTINGS
            rootExtId = Dsl_HttpsGithubComEgorminTeamcityDSLtRefsHeadsMaster.id
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
        }
    }
})
