/*
 * Copyright 2018, Strimzi authors.
 * License: Apache License 2.0 (see the file LICENSE or http://apache.org/licenses/LICENSE-2.0.html).
 */
package io.strimzi.api.kafka.v1alpha1;

import io.fabric8.kubernetes.client.CustomResourceList;

/**
 * A {@code CustomResourceList<KafkaUser>} required for using Fabric8 CRD support.
 */
public class KafkaUserList extends CustomResourceList<KafkaUser> {
    private static final long serialVersionUID = 1L;
}
