/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.classroom.model;

/**
 * Announcement created by a teacher for students of the course
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Classroom API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Announcement extends com.google.api.client.json.GenericJson {

  /**
   * Absolute link to this announcement in the Classroom web UI. This is only populated if `state`
   * is `PUBLISHED`.
   *
   * Read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String alternateLink;

  /**
   * Assignee mode of the announcement. If unspecified, the default value is `ALL_STUDENTS`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String assigneeMode;

  /**
   * Identifier of the course.
   *
   * Read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String courseId;

  /**
   * Timestamp when this announcement was created.
   *
   * Read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String creationTime;

  /**
   * Identifier for the user that created the announcement.
   *
   * Read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creatorUserId;

  /**
   * Classroom-assigned identifier of this announcement, unique per course.
   *
   * Read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Identifiers of students with access to the announcement. This field is set only if
   * `assigneeMode` is `INDIVIDUAL_STUDENTS`. If the `assigneeMode` is `INDIVIDUAL_STUDENTS`, then
   * only students specified in this field will be able to see the announcement.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private IndividualStudentsOptions individualStudentsOptions;

  /**
   * Additional materials.
   *
   * Announcements must have no more than 20 material items.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Material> materials;

  /**
   * Optional timestamp when this announcement is scheduled to be published.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String scheduledTime;

  /**
   * Status of this announcement. If unspecified, the default state is `DRAFT`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Description of this announcement. The text must be a valid UTF-8 string containing no more than
   * 30,000 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String text;

  /**
   * Timestamp of the most recent change to this announcement.
   *
   * Read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Absolute link to this announcement in the Classroom web UI. This is only populated if `state`
   * is `PUBLISHED`.
   *
   * Read-only.
   * @return value or {@code null} for none
   */
  public java.lang.String getAlternateLink() {
    return alternateLink;
  }

  /**
   * Absolute link to this announcement in the Classroom web UI. This is only populated if `state`
   * is `PUBLISHED`.
   *
   * Read-only.
   * @param alternateLink alternateLink or {@code null} for none
   */
  public Announcement setAlternateLink(java.lang.String alternateLink) {
    this.alternateLink = alternateLink;
    return this;
  }

  /**
   * Assignee mode of the announcement. If unspecified, the default value is `ALL_STUDENTS`.
   * @return value or {@code null} for none
   */
  public java.lang.String getAssigneeMode() {
    return assigneeMode;
  }

  /**
   * Assignee mode of the announcement. If unspecified, the default value is `ALL_STUDENTS`.
   * @param assigneeMode assigneeMode or {@code null} for none
   */
  public Announcement setAssigneeMode(java.lang.String assigneeMode) {
    this.assigneeMode = assigneeMode;
    return this;
  }

  /**
   * Identifier of the course.
   *
   * Read-only.
   * @return value or {@code null} for none
   */
  public java.lang.String getCourseId() {
    return courseId;
  }

  /**
   * Identifier of the course.
   *
   * Read-only.
   * @param courseId courseId or {@code null} for none
   */
  public Announcement setCourseId(java.lang.String courseId) {
    this.courseId = courseId;
    return this;
  }

  /**
   * Timestamp when this announcement was created.
   *
   * Read-only.
   * @return value or {@code null} for none
   */
  public String getCreationTime() {
    return creationTime;
  }

  /**
   * Timestamp when this announcement was created.
   *
   * Read-only.
   * @param creationTime creationTime or {@code null} for none
   */
  public Announcement setCreationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  /**
   * Identifier for the user that created the announcement.
   *
   * Read-only.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreatorUserId() {
    return creatorUserId;
  }

  /**
   * Identifier for the user that created the announcement.
   *
   * Read-only.
   * @param creatorUserId creatorUserId or {@code null} for none
   */
  public Announcement setCreatorUserId(java.lang.String creatorUserId) {
    this.creatorUserId = creatorUserId;
    return this;
  }

  /**
   * Classroom-assigned identifier of this announcement, unique per course.
   *
   * Read-only.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Classroom-assigned identifier of this announcement, unique per course.
   *
   * Read-only.
   * @param id id or {@code null} for none
   */
  public Announcement setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifiers of students with access to the announcement. This field is set only if
   * `assigneeMode` is `INDIVIDUAL_STUDENTS`. If the `assigneeMode` is `INDIVIDUAL_STUDENTS`, then
   * only students specified in this field will be able to see the announcement.
   * @return value or {@code null} for none
   */
  public IndividualStudentsOptions getIndividualStudentsOptions() {
    return individualStudentsOptions;
  }

  /**
   * Identifiers of students with access to the announcement. This field is set only if
   * `assigneeMode` is `INDIVIDUAL_STUDENTS`. If the `assigneeMode` is `INDIVIDUAL_STUDENTS`, then
   * only students specified in this field will be able to see the announcement.
   * @param individualStudentsOptions individualStudentsOptions or {@code null} for none
   */
  public Announcement setIndividualStudentsOptions(IndividualStudentsOptions individualStudentsOptions) {
    this.individualStudentsOptions = individualStudentsOptions;
    return this;
  }

  /**
   * Additional materials.
   *
   * Announcements must have no more than 20 material items.
   * @return value or {@code null} for none
   */
  public java.util.List<Material> getMaterials() {
    return materials;
  }

  /**
   * Additional materials.
   *
   * Announcements must have no more than 20 material items.
   * @param materials materials or {@code null} for none
   */
  public Announcement setMaterials(java.util.List<Material> materials) {
    this.materials = materials;
    return this;
  }

  /**
   * Optional timestamp when this announcement is scheduled to be published.
   * @return value or {@code null} for none
   */
  public String getScheduledTime() {
    return scheduledTime;
  }

  /**
   * Optional timestamp when this announcement is scheduled to be published.
   * @param scheduledTime scheduledTime or {@code null} for none
   */
  public Announcement setScheduledTime(String scheduledTime) {
    this.scheduledTime = scheduledTime;
    return this;
  }

  /**
   * Status of this announcement. If unspecified, the default state is `DRAFT`.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Status of this announcement. If unspecified, the default state is `DRAFT`.
   * @param state state or {@code null} for none
   */
  public Announcement setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Description of this announcement. The text must be a valid UTF-8 string containing no more than
   * 30,000 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getText() {
    return text;
  }

  /**
   * Description of this announcement. The text must be a valid UTF-8 string containing no more than
   * 30,000 characters.
   * @param text text or {@code null} for none
   */
  public Announcement setText(java.lang.String text) {
    this.text = text;
    return this;
  }

  /**
   * Timestamp of the most recent change to this announcement.
   *
   * Read-only.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Timestamp of the most recent change to this announcement.
   *
   * Read-only.
   * @param updateTime updateTime or {@code null} for none
   */
  public Announcement setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public Announcement set(String fieldName, Object value) {
    return (Announcement) super.set(fieldName, value);
  }

  @Override
  public Announcement clone() {
    return (Announcement) super.clone();
  }

}
