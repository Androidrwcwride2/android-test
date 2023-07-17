/*
 * Copyright (C) 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package androidx.test.espresso.device.action

import androidx.test.annotation.ExperimentalTestApi
import androidx.test.platform.device.DeviceController

/** Responsible for performing an interaction on the given device. */
@ExperimentalTestApi
interface DeviceAction {
  /**
   * Performs this action on the given device.
   *
   * @param deviceController the controller to use to interact with the device.
   */
  fun perform(deviceController: DeviceController)
}
