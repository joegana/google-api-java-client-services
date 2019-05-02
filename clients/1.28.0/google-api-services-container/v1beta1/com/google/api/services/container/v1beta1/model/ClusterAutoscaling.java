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

package com.google.api.services.container.v1beta1.model;

/**
 * ClusterAutoscaling contains global, per-cluster information required by Cluster Autoscaler to
 * automatically adjust the size of the cluster and create/delete node pools based on the current
 * needs.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Kubernetes Engine API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ClusterAutoscaling extends com.google.api.client.json.GenericJson {

  /**
   * AutoprovisioningNodePoolDefaults contains defaults for a node pool created by NAP.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AutoprovisioningNodePoolDefaults autoprovisioningNodePoolDefaults;

  /**
   * Enables automatic node pool creation and deletion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableNodeAutoprovisioning;

  /**
   * Contains global constraints regarding minimum and maximum amount of resources in the cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ResourceLimit> resourceLimits;

  /**
   * AutoprovisioningNodePoolDefaults contains defaults for a node pool created by NAP.
   * @return value or {@code null} for none
   */
  public AutoprovisioningNodePoolDefaults getAutoprovisioningNodePoolDefaults() {
    return autoprovisioningNodePoolDefaults;
  }

  /**
   * AutoprovisioningNodePoolDefaults contains defaults for a node pool created by NAP.
   * @param autoprovisioningNodePoolDefaults autoprovisioningNodePoolDefaults or {@code null} for none
   */
  public ClusterAutoscaling setAutoprovisioningNodePoolDefaults(AutoprovisioningNodePoolDefaults autoprovisioningNodePoolDefaults) {
    this.autoprovisioningNodePoolDefaults = autoprovisioningNodePoolDefaults;
    return this;
  }

  /**
   * Enables automatic node pool creation and deletion.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableNodeAutoprovisioning() {
    return enableNodeAutoprovisioning;
  }

  /**
   * Enables automatic node pool creation and deletion.
   * @param enableNodeAutoprovisioning enableNodeAutoprovisioning or {@code null} for none
   */
  public ClusterAutoscaling setEnableNodeAutoprovisioning(java.lang.Boolean enableNodeAutoprovisioning) {
    this.enableNodeAutoprovisioning = enableNodeAutoprovisioning;
    return this;
  }

  /**
   * Contains global constraints regarding minimum and maximum amount of resources in the cluster.
   * @return value or {@code null} for none
   */
  public java.util.List<ResourceLimit> getResourceLimits() {
    return resourceLimits;
  }

  /**
   * Contains global constraints regarding minimum and maximum amount of resources in the cluster.
   * @param resourceLimits resourceLimits or {@code null} for none
   */
  public ClusterAutoscaling setResourceLimits(java.util.List<ResourceLimit> resourceLimits) {
    this.resourceLimits = resourceLimits;
    return this;
  }

  @Override
  public ClusterAutoscaling set(String fieldName, Object value) {
    return (ClusterAutoscaling) super.set(fieldName, value);
  }

  @Override
  public ClusterAutoscaling clone() {
    return (ClusterAutoscaling) super.clone();
  }

}
