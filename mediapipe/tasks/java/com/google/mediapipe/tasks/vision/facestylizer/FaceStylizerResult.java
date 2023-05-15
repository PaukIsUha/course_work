// Copyright 2023 The MediaPipe Authors.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.mediapipe.tasks.vision.facestylizer;

import com.google.auto.value.AutoValue;
import com.google.mediapipe.framework.image.MPImage;
import com.google.mediapipe.tasks.core.TaskResult;
import java.util.Optional;

/** Represents the stylized image generated by {@link FaceStylizer}. */
@AutoValue
public abstract class FaceStylizerResult implements TaskResult {

  /**
   * Creates an {@link FaceStylizerResult} instance from a MPImage.
   *
   * @param stylizedImage an {@link Optional} MPImage representing the stylized image of the most
   *     visible face. Empty if no face is detected on the input image.
   * @param timestampMs a timestamp for this result.
   */
  public static FaceStylizerResult create(Optional<MPImage> stylizedImage, long timestampMs) {
    return new AutoValue_FaceStylizerResult(stylizedImage, timestampMs);
  }

  public abstract Optional<MPImage> stylizedImage();

  @Override
  public abstract long timestampMs();
}
