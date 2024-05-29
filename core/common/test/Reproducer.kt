/*
 * Copyright 2019-2024 JetBrains s.r.o. and contributors.
 * Use of this source code is governed by the Apache 2.0 License that can be found in the LICENSE.txt file.
 */
package kotlinx.datetime.test

import kotlinx.datetime.Instant
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toInstant
import kotlin.test.Test
import kotlin.test.assertEquals


class Reproducer {

    @Test fun calculated_instant_is_correct() {
        val tz = TimeZone.of("America/New_York")
        val expected = Instant.parse("2023-11-05T07:00:00Z")
        val actual = LocalDateTime(year = 2023, monthNumber = 11, dayOfMonth = 5, hour = 2, minute = 0).toInstant(tz)
        assertEquals(expected, actual)
    }
}