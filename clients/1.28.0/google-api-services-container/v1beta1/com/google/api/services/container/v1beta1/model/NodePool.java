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
 * NodePool contains the name and configuration for a cluster's node pool. Node pools are a set of
 * nodes (i.e. VM's), with a common configuration and specification, under the control of the
 * cluster master. They may have a set of Kubernetes labels applied to them, which may be used to
 * reference them during pod scheduling. They may also be resized up or down, to accommodate the
 * workload.
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
public final class NodePool extends com.google.api.client.json.GenericJson {

  /**
   * Autoscaler configuration for this NodePool. Autoscaler is enabled only if a valid configuration
   * is present.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NodePoolAutoscaling autoscaling;

  /**
   * Which conditions caused the current node pool state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<StatusCondition> conditions;

  /**
   * The node configuration of the pool.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NodeConfig config;

  /**
   * The initial node count for the pool. You must ensure that your Compute Engine resource quota is
   * sufficient for this number of instances. You must also have available firewall and routes
   * quota.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer initialNodeCount;

  /**
   * [Output only] The resource URLs of the [managed instance groups](/compute/docs/instance-groups
   * /creating-groups-of-managed-instances) associated with this node pool.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> instanceGroupUrls;

  /**
   * NodeManagement configuration for this NodePool.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NodeManagement management;

  /**
   * The constraint on the maximum number of pods that can be run simultaneously on a node in the
   * node pool.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MaxPodsConstraint maxPodsConstraint;

  /**
   * The name of the node pool.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * [Output only] The pod CIDR block size per node in this node pool.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer podIpv4CidrSize;

  /**
   * [Output only] Server-defined URL for the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * [Output only] The status of the nodes in this pool instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * [Output only] Additional information about the current status of this node pool instance, if
   * available.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String statusMessage;

  /**
   * The version of the Kubernetes of this node.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String version;

  /**
   * Autoscaler configuration for this NodePool. Autoscaler is enabled only if a valid configuration
   * is present.
   * @return value or {@code null} for none
   */
  public NodePoolAutoscaling getAutoscaling() {
    return autoscaling;
  }

  /**
   * Autoscaler configuration for this NodePool. Autoscaler is enabled only if a valid configuration
   * is present.
   * @param autoscaling autoscaling or {@code null} for none
   */
  public NodePool setAutoscaling(NodePoolAutoscaling autoscaling) {
    this.autoscaling = autoscaling;
    return this;
  }

  /**
   * Which conditions caused the current node pool state.
   * @return value or {@code null} for none
   */
  public java.util.List<StatusCondition> getConditions() {
    return conditions;
  }

  /**
   * Which conditions caused the current node pool state.
   * @param conditions conditions or {@code null} for none
   */
  public NodePool setConditions(java.util.List<StatusCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  /**
   * The node configuration of the pool.
   * @return value or {@code null} for none
   */
  public NodeConfig getConfig() {
    return config;
  }

  /**
   * The node configuration of the pool.
   * @param config config or {@code null} for none
   */
  public NodePool setConfig(NodeConfig config) {
    this.config = config;
    return this;
  }

  /**
   * The initial node count for the pool. You must ensure that your Compute Engine resource quota is
   * sufficient for this number of instances. You must also have available firewall and routes
   * quota.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getInitialNodeCount() {
    return initialNodeCount;
  }

  /**
   * The initial node count for the pool. You must ensure that your Compute Engine resource quota is
   * sufficient for this number of instances. You must also have available firewall and routes
   * quota.
   * @param initialNodeCount initialNodeCount or {@code null} for none
   */
  public NodePool setInitialNodeCount(java.lang.Integer initialNodeCount) {
    this.initialNodeCount = initialNodeCount;
    return this;
  }

  /**
   * [Output only] The resource URLs of the [managed instance groups](/compute/docs/instance-groups
   * /creating-groups-of-managed-instances) associated with this node pool.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getInstanceGroupUrls() {
    return instanceGroupUrls;
  }

  /**
   * [Output only] The resource URLs of the [managed instance groups](/compute/docs/instance-groups
   * /creating-groups-of-managed-instances) associated with this node pool.
   * @param instanceGroupUrls instanceGroupUrls or {@code null} for none
   */
  public NodePool setInstanceGroupUrls(java.util.List<java.lang.String> instanceGroupUrls) {
    this.instanceGroupUrls = instanceGroupUrls;
    return this;
  }

  /**
   * NodeManagement configuration for this NodePool.
   * @return value or {@code null} for none
   */
  public NodeManagement getManagement() {
    return management;
  }

  /**
   * NodeManagement configuration for this NodePool.
   * @param management management or {@code null} for none
   */
  public NodePool setManagement(NodeManagement management) {
    this.management = management;
    return this;
  }

  /**
   * The constraint on the maximum number of pods that can be run simultaneously on a node in the
   * node pool.
   * @return value or {@code null} for none
   */
  public MaxPodsConstraint getMaxPodsConstraint() {
    return maxPodsConstraint;
  }

  /**
   * The constraint on the maximum number of pods that can be run simultaneously on a node in the
   * node pool.
   * @param maxPodsConstraint maxPodsConstraint or {@code null} for none
   */
  public NodePool setMaxPodsConstraint(MaxPodsConstraint maxPodsConstraint) {
    this.maxPodsConstraint = maxPodsConstraint;
    return this;
  }

  /**
   * The name of the node pool.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the node pool.
   * @param name name or {@code null} for none
   */
  public NodePool setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * [Output only] The pod CIDR block size per node in this node pool.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPodIpv4CidrSize() {
    return podIpv4CidrSize;
  }

  /**
   * [Output only] The pod CIDR block size per node in this node pool.
   * @param podIpv4CidrSize podIpv4CidrSize or {@code null} for none
   */
  public NodePool setPodIpv4CidrSize(java.lang.Integer podIpv4CidrSize) {
    this.podIpv4CidrSize = podIpv4CidrSize;
    return this;
  }

  /**
   * [Output only] Server-defined URL for the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * [Output only] Server-defined URL for the resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public NodePool setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * [Output only] The status of the nodes in this pool instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * [Output only] The status of the nodes in this pool instance.
   * @param status status or {@code null} for none
   */
  public NodePool setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  /**
   * [Output only] Additional information about the current status of this node pool instance, if
   * available.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatusMessage() {
    return statusMessage;
  }

  /**
   * [Output only] Additional information about the current status of this node pool instance, if
   * available.
   * @param statusMessage statusMessage or {@code null} for none
   */
  public NodePool setStatusMessage(java.lang.String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

  /**
   * The version of the Kubernetes of this node.
   * @return value or {@code null} for none
   */
  public java.lang.String getVersion() {
    return version;
  }

  /**
   * The version of the Kubernetes of this node.
   * @param version version or {@code null} for none
   */
  public NodePool setVersion(java.lang.String version) {
    this.version = version;
    return this;
  }

  @Override
  public NodePool set(String fieldName, Object value) {
    return (NodePool) super.set(fieldName, value);
  }

  @Override
  public NodePool clone() {
    return (NodePool) super.clone();
  }

}
