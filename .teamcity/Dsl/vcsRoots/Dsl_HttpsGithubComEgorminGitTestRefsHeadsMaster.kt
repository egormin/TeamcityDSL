package Dsl.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.vcs.GitVcsRoot

object Dsl_HttpsGithubComEgorminGitTestRefsHeadsMaster : GitVcsRoot({
    uuid = "90bfeac4-27bf-4f74-ac52-c3798a6eaa71"
    id = "Dsl_HttpsGithubComEgorminGitTestRefsHeadsMaster"
    name = "https://github.com/egormin/git_test#refs/heads/master"
    url = "https://github.com/egormin/git_test"
    authMethod = password {
        userName = "egormin"
        password = "zxx8d720d5a19ffb6c43646437a1f735151d9d54503ece7f8b6006fb0a20fc56e8c77640e1d5225aab9775d03cbe80d301b"
    }
})
