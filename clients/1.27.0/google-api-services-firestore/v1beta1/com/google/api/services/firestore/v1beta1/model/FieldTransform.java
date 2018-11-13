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

package com.google.api.services.firestore.v1beta1.model;

/**
 * A transformation of a field of the document.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Firestore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FieldTransform extends com.google.api.client.json.GenericJson {

  /**
   * Append the given elements in order if they are not already present in the current field value.
   * If the field is not an array, or if the field does not yet exist, it is first set to the empty
   * array.
   *
   * Equivalent numbers of different types (e.g. 3L and 3.0) are considered equal when checking if a
   * value is missing. NaN is equal to NaN, and Null is equal to Null. If the input contains
   * multiple equivalent values, only the first will be considered.
   *
   * The corresponding transform_result will be the null value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ArrayValue appendMissingElements;

  /**
   * The path of the field. See Document.fields for the field path syntax reference.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fieldPath;

  /**
   * Remove all of the given elements from the array in the field. If the field is not an array, or
   * if the field does not yet exist, it is set to the empty array.
   *
   * Equivalent numbers of the different types (e.g. 3L and 3.0) are considered equal when deciding
   * whether an element should be removed. NaN is equal to NaN, and Null is equal to Null. This will
   * remove all equivalent values if there are duplicates.
   *
   * The corresponding transform_result will be the null value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ArrayValue removeAllFromArray;

  /**
   * Sets the field to the given server value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String setToServerValue;

  /**
   * Append the given elements in order if they are not already present in the current field value.
   * If the field is not an array, or if the field does not yet exist, it is first set to the empty
   * array.
   *
   * Equivalent numbers of different types (e.g. 3L and 3.0) are considered equal when checking if a
   * value is missing. NaN is equal to NaN, and Null is equal to Null. If the input contains
   * multiple equivalent values, only the first will be considered.
   *
   * The corresponding transform_result will be the null value.
   * @return value or {@code null} for none
   */
  public ArrayValue getAppendMissingElements() {
    return appendMissingElements;
  }

  /**
   * Append the given elements in order if they are not already present in the current field value.
   * If the field is not an array, or if the field does not yet exist, it is first set to the empty
   * array.
   *
   * Equivalent numbers of different types (e.g. 3L and 3.0) are considered equal when checking if a
   * value is missing. NaN is equal to NaN, and Null is equal to Null. If the input contains
   * multiple equivalent values, only the first will be considered.
   *
   * The corresponding transform_result will be the null value.
   * @param appendMissingElements appendMissingElements or {@code null} for none
   */
  public FieldTransform setAppendMissingElements(ArrayValue appendMissingElements) {
    this.appendMissingElements = appendMissingElements;
    return this;
  }

  /**
   * The path of the field. See Document.fields for the field path syntax reference.
   * @return value or {@code null} for none
   */
  public java.lang.String getFieldPath() {
    return fieldPath;
  }

  /**
   * The path of the field. See Document.fields for the field path syntax reference.
   * @param fieldPath fieldPath or {@code null} for none
   */
  public FieldTransform setFieldPath(java.lang.String fieldPath) {
    this.fieldPath = fieldPath;
    return this;
  }

  /**
   * Remove all of the given elements from the array in the field. If the field is not an array, or
   * if the field does not yet exist, it is set to the empty array.
   *
   * Equivalent numbers of the different types (e.g. 3L and 3.0) are considered equal when deciding
   * whether an element should be removed. NaN is equal to NaN, and Null is equal to Null. This will
   * remove all equivalent values if there are duplicates.
   *
   * The corresponding transform_result will be the null value.
   * @return value or {@code null} for none
   */
  public ArrayValue getRemoveAllFromArray() {
    return removeAllFromArray;
  }

  /**
   * Remove all of the given elements from the array in the field. If the field is not an array, or
   * if the field does not yet exist, it is set to the empty array.
   *
   * Equivalent numbers of the different types (e.g. 3L and 3.0) are considered equal when deciding
   * whether an element should be removed. NaN is equal to NaN, and Null is equal to Null. This will
   * remove all equivalent values if there are duplicates.
   *
   * The corresponding transform_result will be the null value.
   * @param removeAllFromArray removeAllFromArray or {@code null} for none
   */
  public FieldTransform setRemoveAllFromArray(ArrayValue removeAllFromArray) {
    this.removeAllFromArray = removeAllFromArray;
    return this;
  }

  /**
   * Sets the field to the given server value.
   * @return value or {@code null} for none
   */
  public java.lang.String getSetToServerValue() {
    return setToServerValue;
  }

  /**
   * Sets the field to the given server value.
   * @param setToServerValue setToServerValue or {@code null} for none
   */
  public FieldTransform setSetToServerValue(java.lang.String setToServerValue) {
    this.setToServerValue = setToServerValue;
    return this;
  }

  @Override
  public FieldTransform set(String fieldName, Object value) {
    return (FieldTransform) super.set(fieldName, value);
  }

  @Override
  public FieldTransform clone() {
    return (FieldTransform) super.clone();
  }

}