/*
 * Copyright 2014 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.jenkins.plugins.cloudbackup.trigger;

import org.joda.time.DateTime;

/**
 * Determines if a new backup should be created.
 */
public interface BackupTrigger {

  /**
   * Implements a certain strategy for checking if a new backup should be
   * created.
   *
   * @param lastBackupTime The time the last backup was created. Can be null if
   * no backup exists.
   * @return true, if a new backup should be created, false otherwise.
   */
  public boolean shouldCreateBackup(DateTime lastBackupTime);

}