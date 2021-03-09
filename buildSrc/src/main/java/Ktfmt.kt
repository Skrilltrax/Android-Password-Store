/*
 * Copyright © 2014-2020 The Android Password Store Authors. All Rights Reserved.
 * SPDX-License-Identifier: GPL-3.0-only
 */

import com.ncorti.ktfmt.gradle.KtfmtExtension

fun KtfmtExtension.configureKtfmt() {
    googleStyle()
    maxWidth.set(120)
}