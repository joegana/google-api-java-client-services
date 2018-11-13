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

package com.google.api.services.fusiontables.model;

/**
 * Represents an import request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Fusion Tables API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FusiontablesImport extends com.google.api.client.json.GenericJson {

  /**
   * Type name: a template for an import request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The number of rows received from the import request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long numRowsReceived;

  /**
   * Type name: a template for an import request.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Type name: a template for an import request.
   * @param kind kind or {@code null} for none
   */
  public FusiontablesImport setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The number of rows received from the import request.
   * @return value or {@code null} for none
   */
  public java.lang.Long getNumRowsReceived() {
    return numRowsReceived;
  }

  /**
   * The number of rows received from the import request.
   * @param numRowsReceived numRowsReceived or {@code null} for none
   */
  public FusiontablesImport setNumRowsReceived(java.lang.Long numRowsReceived) {
    this.numRowsReceived = numRowsReceived;
    return this;
  }

  @Override
  public FusiontablesImport set(String fieldName, Object value) {
    return (FusiontablesImport) super.set(fieldName, value);
  }

  @Override
  public FusiontablesImport clone() {
    return (FusiontablesImport) super.clone();
  }

}