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

package com.google.api.services.firebasehosting.v1beta1.model;

/**
 * The configuration for how incoming requests to a site should be routed and processed before
 * serving content. The patterns are matched and applied according to a specific [priority
 * order](/docs/hosting/url-redirects-rewrites#section-priorities).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase Hosting API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ServingConfig extends com.google.api.client.json.GenericJson {

  /**
   * How to handle well known App Association files.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String appAssociation;

  /**
   * Defines whether to drop the file extension from uploaded files.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean cleanUrls;

  /**
   * A list of custom response headers that are added to the content if the request URL path matches
   * the glob.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Header> headers;

  /**
   * A list of globs that will cause the response to redirect to another location.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Redirect> redirects;

  static {
    // hack to force ProGuard to consider Redirect used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Redirect.class);
  }

  /**
   * A list of rewrites that will act as if the service were given the destination URL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Rewrite> rewrites;

  static {
    // hack to force ProGuard to consider Rewrite used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Rewrite.class);
  }

  /**
   * Defines how to handle a trailing slash in the URL path.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String trailingSlashBehavior;

  /**
   * How to handle well known App Association files.
   * @return value or {@code null} for none
   */
  public java.lang.String getAppAssociation() {
    return appAssociation;
  }

  /**
   * How to handle well known App Association files.
   * @param appAssociation appAssociation or {@code null} for none
   */
  public ServingConfig setAppAssociation(java.lang.String appAssociation) {
    this.appAssociation = appAssociation;
    return this;
  }

  /**
   * Defines whether to drop the file extension from uploaded files.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCleanUrls() {
    return cleanUrls;
  }

  /**
   * Defines whether to drop the file extension from uploaded files.
   * @param cleanUrls cleanUrls or {@code null} for none
   */
  public ServingConfig setCleanUrls(java.lang.Boolean cleanUrls) {
    this.cleanUrls = cleanUrls;
    return this;
  }

  /**
   * A list of custom response headers that are added to the content if the request URL path matches
   * the glob.
   * @return value or {@code null} for none
   */
  public java.util.List<Header> getHeaders() {
    return headers;
  }

  /**
   * A list of custom response headers that are added to the content if the request URL path matches
   * the glob.
   * @param headers headers or {@code null} for none
   */
  public ServingConfig setHeaders(java.util.List<Header> headers) {
    this.headers = headers;
    return this;
  }

  /**
   * A list of globs that will cause the response to redirect to another location.
   * @return value or {@code null} for none
   */
  public java.util.List<Redirect> getRedirects() {
    return redirects;
  }

  /**
   * A list of globs that will cause the response to redirect to another location.
   * @param redirects redirects or {@code null} for none
   */
  public ServingConfig setRedirects(java.util.List<Redirect> redirects) {
    this.redirects = redirects;
    return this;
  }

  /**
   * A list of rewrites that will act as if the service were given the destination URL.
   * @return value or {@code null} for none
   */
  public java.util.List<Rewrite> getRewrites() {
    return rewrites;
  }

  /**
   * A list of rewrites that will act as if the service were given the destination URL.
   * @param rewrites rewrites or {@code null} for none
   */
  public ServingConfig setRewrites(java.util.List<Rewrite> rewrites) {
    this.rewrites = rewrites;
    return this;
  }

  /**
   * Defines how to handle a trailing slash in the URL path.
   * @return value or {@code null} for none
   */
  public java.lang.String getTrailingSlashBehavior() {
    return trailingSlashBehavior;
  }

  /**
   * Defines how to handle a trailing slash in the URL path.
   * @param trailingSlashBehavior trailingSlashBehavior or {@code null} for none
   */
  public ServingConfig setTrailingSlashBehavior(java.lang.String trailingSlashBehavior) {
    this.trailingSlashBehavior = trailingSlashBehavior;
    return this;
  }

  @Override
  public ServingConfig set(String fieldName, Object value) {
    return (ServingConfig) super.set(fieldName, value);
  }

  @Override
  public ServingConfig clone() {
    return (ServingConfig) super.clone();
  }

}