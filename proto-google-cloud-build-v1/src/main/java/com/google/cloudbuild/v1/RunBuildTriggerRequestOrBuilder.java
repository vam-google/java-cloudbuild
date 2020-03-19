/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/cloudbuild/v1/cloudbuild.proto

package com.google.cloudbuild.v1;

public interface RunBuildTriggerRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudbuild.v1.RunBuildTriggerRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. ID of the project.
   * </pre>
   *
   * <code>string project_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   *
   *
   * <pre>
   * Required. ID of the project.
   * </pre>
   *
   * <code>string project_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString getProjectIdBytes();

  /**
   *
   *
   * <pre>
   * Required. ID of the trigger.
   * </pre>
   *
   * <code>string trigger_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The triggerId.
   */
  java.lang.String getTriggerId();
  /**
   *
   *
   * <pre>
   * Required. ID of the trigger.
   * </pre>
   *
   * <code>string trigger_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for triggerId.
   */
  com.google.protobuf.ByteString getTriggerIdBytes();

  /**
   *
   *
   * <pre>
   * Required. Source to build against this trigger.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudbuild.v1.RepoSource source = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the source field is set.
   */
  boolean hasSource();
  /**
   *
   *
   * <pre>
   * Required. Source to build against this trigger.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudbuild.v1.RepoSource source = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The source.
   */
  com.google.cloudbuild.v1.RepoSource getSource();
  /**
   *
   *
   * <pre>
   * Required. Source to build against this trigger.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudbuild.v1.RepoSource source = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloudbuild.v1.RepoSourceOrBuilder getSourceOrBuilder();
}
