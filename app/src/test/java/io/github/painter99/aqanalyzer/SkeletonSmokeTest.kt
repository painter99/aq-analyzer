package io.github.painter99.aqanalyzer

import kotlin.test.Test
import kotlin.test.assertEquals

/**
 * M1.1 smoke test — verifies the test toolchain (kotlin-test-junit + JUnit4)
 * runs inside the CI Gradle build.
 */
class SkeletonSmokeTest {

    @Test
    fun smoke() {
        assertEquals(4, 2 + 2)
    }
}
