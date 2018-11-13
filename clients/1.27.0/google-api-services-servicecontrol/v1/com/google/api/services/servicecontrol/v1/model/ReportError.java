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

package com.google.api.services.servicecontrol.v1.model;

/**
 * Represents the processing error of one Operation in the request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Control API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ReportError extends com.google.api.client.json.GenericJson {

  /**
   * The Operation.operation_id value from the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String operationId;

  /**
   * Details of the error when processing the Operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Status status;

  /**
   * The Operation.operation_id value from the request.
   * @return value or {@code null} for none
   */
  public java.lang.String getOperationId() {
    return operationId;
  }

  /**
   * The Operation.operation_id value from the request.
   * @param operationId operationId or {@code null} for none
   */
  public ReportError setOperationId(java.lang.String operationId) {
    this.operationId = operationId;
    return this;
  }

  /**
   * Details of the error when processing the Operation.
   * @return value or {@code null} for none
   */
  public Status getStatus() {
    return status;
  }

  /**
   * Details of the error when processing the Operation.
   * @param status status or {@code null} for none
   */
  public ReportError setStatus(Status status) {
    this.status = status;
    return this;
  }

  @Override
  public ReportError set(String fieldName, Object value) {
    return (ReportError) super.set(fieldName, value);
  }

  @Override
  public ReportError clone() {
    return (ReportError) super.clone();
  }

}