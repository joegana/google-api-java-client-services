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

package com.google.api.services.mirror.model;

/**
 * A list of timeline items. This is the response from the server to GET requests on the timeline
 * collection.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Mirror API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TimelineListResponse extends com.google.api.client.json.GenericJson {

  /**
   * Items in the timeline.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TimelineItem> items;

  static {
    // hack to force ProGuard to consider TimelineItem used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(TimelineItem.class);
  }

  /**
   * The type of resource. This is always mirror#timeline.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The next page token. Provide this as the pageToken parameter in the request to retrieve the
   * next page of results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Items in the timeline.
   * @return value or {@code null} for none
   */
  public java.util.List<TimelineItem> getItems() {
    return items;
  }

  /**
   * Items in the timeline.
   * @param items items or {@code null} for none
   */
  public TimelineListResponse setItems(java.util.List<TimelineItem> items) {
    this.items = items;
    return this;
  }

  /**
   * The type of resource. This is always mirror#timeline.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The type of resource. This is always mirror#timeline.
   * @param kind kind or {@code null} for none
   */
  public TimelineListResponse setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The next page token. Provide this as the pageToken parameter in the request to retrieve the
   * next page of results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * The next page token. Provide this as the pageToken parameter in the request to retrieve the
   * next page of results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public TimelineListResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public TimelineListResponse set(String fieldName, Object value) {
    return (TimelineListResponse) super.set(fieldName, value);
  }

  @Override
  public TimelineListResponse clone() {
    return (TimelineListResponse) super.clone();
  }

}