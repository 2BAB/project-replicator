/*
 * Copyright (C) 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.android.gradle.replicator

import com.google.common.truth.Truth
import kotlin.test.Test

class BuildFeaturesTests {

    @Test
    fun testAidl() {
        val projectSetup = setup()

        projectSetup.buildFile.appendText("""
        android {
            buildFeatures {
              aidl = false
            }
        }
        """.trimIndent())

        projectSetup.runner.build()

        // Verify the result
        Truth.assertThat(projectSetup.projectDir.resolve("build/project-structure.json").readText()).isEqualTo("""
        {
          "gradle": "$GRADLE_VERSION",
          "agp": "$AGP_VERSION",
          "kotlin": "n/a",
          "properties": [],
          "rootModule": {
            "path": ":",
            "plugins": [
              "com.android.application"
            ],
            "javaSources": {
              "fileCount": 0
            },
            "dependencies": [],
            "android": {
              "compileSdkVersion": "android-30",
              "minSdkVersion": 24,
              "targetSdkVersion": 30,
              "buildFeatures": {
                "aidl": false,
                "mlModelBinding": false
              }
            }
          },
          "modules": []
        }
        """.trimIndent())
    }

    @Test
    fun testBuildConfig() {
        val projectSetup = setup()

        projectSetup.buildFile.appendText("""
        android {
            buildFeatures {
              buildConfig = false
            }
        }
        """.trimIndent())

        projectSetup.runner.build()

        // Verify the result
        Truth.assertThat(projectSetup.projectDir.resolve("build/project-structure.json").readText()).isEqualTo("""
        {
          "gradle": "$GRADLE_VERSION",
          "agp": "$AGP_VERSION",
          "kotlin": "n/a",
          "properties": [],
          "rootModule": {
            "path": ":",
            "plugins": [
              "com.android.application"
            ],
            "javaSources": {
              "fileCount": 0
            },
            "dependencies": [],
            "android": {
              "compileSdkVersion": "android-30",
              "minSdkVersion": 24,
              "targetSdkVersion": 30,
              "buildFeatures": {
                "buildConfig": false,
                "mlModelBinding": false
              }
            }
          },
          "modules": []
        }
        """.trimIndent())
    }

    @Test
    fun testCompose() {
        val projectSetup = setup()

        projectSetup.buildFile.appendText("""
        android {
            buildFeatures {
              compose = true
            }
        }
        """.trimIndent())

        projectSetup.runner.build()

        // Verify the result
        Truth.assertThat(projectSetup.projectDir.resolve("build/project-structure.json").readText()).isEqualTo("""
        {
          "gradle": "$GRADLE_VERSION",
          "agp": "$AGP_VERSION",
          "kotlin": "n/a",
          "properties": [],
          "rootModule": {
            "path": ":",
            "plugins": [
              "com.android.application"
            ],
            "javaSources": {
              "fileCount": 0
            },
            "dependencies": [],
            "android": {
              "compileSdkVersion": "android-30",
              "minSdkVersion": 24,
              "targetSdkVersion": 30,
              "buildFeatures": {
                "compose": true,
                "mlModelBinding": false
              }
            }
          },
          "modules": []
        }
        """.trimIndent())

    }

    @Test
    fun testPrefab() {
        val projectSetup = setup()

        projectSetup.buildFile.appendText("""
        android {
            buildFeatures {
              prefab = true
            }
        }
        """.trimIndent())

        projectSetup.runner.build()

        // Verify the result
        Truth.assertThat(projectSetup.projectDir.resolve("build/project-structure.json").readText()).isEqualTo("""
        {
          "gradle": "$GRADLE_VERSION",
          "agp": "$AGP_VERSION",
          "kotlin": "n/a",
          "properties": [],
          "rootModule": {
            "path": ":",
            "plugins": [
              "com.android.application"
            ],
            "javaSources": {
              "fileCount": 0
            },
            "dependencies": [],
            "android": {
              "compileSdkVersion": "android-30",
              "minSdkVersion": 24,
              "targetSdkVersion": 30,
              "buildFeatures": {
                "mlModelBinding": false,
                "prefab": true
              }
            }
          },
          "modules": []
        }
        """.trimIndent())

    }

    @Test
    fun testRenderScript() {
        val projectSetup = setup()

        projectSetup.buildFile.appendText("""
        android {
            buildFeatures {
              renderScript = false
            }
        }
        """.trimIndent())

        projectSetup.runner.build()

        // Verify the result
        Truth.assertThat(projectSetup.projectDir.resolve("build/project-structure.json").readText()).isEqualTo("""
        {
          "gradle": "$GRADLE_VERSION",
          "agp": "$AGP_VERSION",
          "kotlin": "n/a",
          "properties": [],
          "rootModule": {
            "path": ":",
            "plugins": [
              "com.android.application"
            ],
            "javaSources": {
              "fileCount": 0
            },
            "dependencies": [],
            "android": {
              "compileSdkVersion": "android-30",
              "minSdkVersion": 24,
              "targetSdkVersion": 30,
              "buildFeatures": {
                "mlModelBinding": false,
                "renderScript": false
              }
            }
          },
          "modules": []
        }
        """.trimIndent())

    }

    @Test
    fun testResValues() {
        val projectSetup = setup()

        projectSetup.buildFile.appendText("""
        android {
            buildFeatures {
              resValues = false
            }
        }
        """.trimIndent())

        projectSetup.runner.build()

        // Verify the result
        Truth.assertThat(projectSetup.projectDir.resolve("build/project-structure.json").readText()).isEqualTo("""
        {
          "gradle": "$GRADLE_VERSION",
          "agp": "$AGP_VERSION",
          "kotlin": "n/a",
          "properties": [],
          "rootModule": {
            "path": ":",
            "plugins": [
              "com.android.application"
            ],
            "javaSources": {
              "fileCount": 0
            },
            "dependencies": [],
            "android": {
              "compileSdkVersion": "android-30",
              "minSdkVersion": 24,
              "targetSdkVersion": 30,
              "buildFeatures": {
                "mlModelBinding": false,
                "resValues": false
              }
            }
          },
          "modules": []
        }
        """.trimIndent())

    }

    @Test
    fun testShaders() {
        val projectSetup = setup()

        projectSetup.buildFile.appendText("""
        android {
            buildFeatures {
              shaders = true
            }
        }
        """.trimIndent())

        projectSetup.runner.build()

        // Verify the result
        Truth.assertThat(projectSetup.projectDir.resolve("build/project-structure.json").readText()).isEqualTo("""
        {
          "gradle": "$GRADLE_VERSION",
          "agp": "$AGP_VERSION",
          "kotlin": "n/a",
          "properties": [],
          "rootModule": {
            "path": ":",
            "plugins": [
              "com.android.application"
            ],
            "javaSources": {
              "fileCount": 0
            },
            "dependencies": [],
            "android": {
              "compileSdkVersion": "android-30",
              "minSdkVersion": 24,
              "targetSdkVersion": 30,
              "buildFeatures": {
                "mlModelBinding": false,
                "shaders": true
              }
            }
          },
          "modules": []
        }
        """.trimIndent())

    }

    @Test
    fun testViewBinding() {
        val projectSetup = setup()

        projectSetup.buildFile.appendText("""
        android {
            buildFeatures {
              viewBinding = true
            }
        }
        """.trimIndent())

        projectSetup.runner.build()

        // Verify the result
        Truth.assertThat(projectSetup.projectDir.resolve("build/project-structure.json").readText()).isEqualTo("""
        {
          "gradle": "$GRADLE_VERSION",
          "agp": "$AGP_VERSION",
          "kotlin": "n/a",
          "properties": [],
          "rootModule": {
            "path": ":",
            "plugins": [
              "com.android.application"
            ],
            "javaSources": {
              "fileCount": 0
            },
            "dependencies": [
              {
                "library": "com.android.databinding:viewbinding:4.1.0-beta02",
                "method": "api"
              }
            ],
            "android": {
              "compileSdkVersion": "android-30",
              "minSdkVersion": 24,
              "targetSdkVersion": 30,
              "buildFeatures": {
                "mlModelBinding": false,
                "viewBinding": true
              }
            }
          },
          "modules": []
        }
        """.trimIndent())

    }

    @Test
    fun testDataBinding() {
        val projectSetup = setup()

        projectSetup.buildFile.appendText("""
        android {
            buildFeatures {
              dataBinding = true
            }
        }
        """.trimIndent())

        projectSetup.runner.build()

        // Verify the result
        Truth.assertThat(projectSetup.projectDir.resolve("build/project-structure.json").readText()).isEqualTo("""
        {
          "gradle": "$GRADLE_VERSION",
          "agp": "$AGP_VERSION",
          "kotlin": "n/a",
          "properties": [],
          "rootModule": {
            "path": ":",
            "plugins": [
              "com.android.application"
            ],
            "javaSources": {
              "fileCount": 0
            },
            "dependencies": [
              {
                "library": "androidx.databinding:databinding-compiler:4.1.0-beta02",
                "method": "annotationProcessor"
              },
              {
                "library": "com.android.databinding:adapters:4.1.0-beta02",
                "method": "api"
              },
              {
                "library": "com.android.databinding:baseLibrary:4.1.0-beta02",
                "method": "api"
              },
              {
                "library": "com.android.databinding:library:4.1.0-beta02",
                "method": "api"
              }
            ],
            "android": {
              "compileSdkVersion": "android-30",
              "minSdkVersion": 24,
              "targetSdkVersion": 30,
              "buildFeatures": {
                "dataBinding": true,
                "mlModelBinding": false
              }
            }
          },
          "modules": []
        }
        """.trimIndent())

    }

    @Test
    fun testMlModelBinding() {
        val projectSetup = setup()

        projectSetup.buildFile.appendText("""
        android {
            buildFeatures {
              mlModelBinding = true
            }
        }
        """.trimIndent())

        projectSetup.runner.build()

        // Verify the result
        Truth.assertThat(projectSetup.projectDir.resolve("build/project-structure.json").readText()).isEqualTo("""
        {
          "gradle": "$GRADLE_VERSION",
          "agp": "$AGP_VERSION",
          "kotlin": "n/a",
          "properties": [],
          "rootModule": {
            "path": ":",
            "plugins": [
              "com.android.application"
            ],
            "javaSources": {
              "fileCount": 0
            },
            "dependencies": [],
            "android": {
              "compileSdkVersion": "android-30",
              "minSdkVersion": 24,
              "targetSdkVersion": 30,
              "buildFeatures": {
                "mlModelBinding": true
              }
            }
          },
          "modules": []
        }
        """.trimIndent())

    }

    private fun setup(): ProjectSetup {
        val setup = setupProject(type = BuildFileType.GROOVY, traceOffset = 2) {
            """
                    repositories {
                        google()
                        jcenter()
                    }
                    dependencies {
                        classpath "com.android.tools.build:gradle:$AGP_VERSION"
                    }
                """.trimIndent()
        }

        setup.buildFile.appendText("""
            apply plugin: "com.android.application"
            
            android {
                compileSdkVersion = 30
                defaultConfig {
                    minSdkVersion = 24
                    targetSdkVersion = 30
                }
            }

            """.trimIndent())

        return setup
    }

}
