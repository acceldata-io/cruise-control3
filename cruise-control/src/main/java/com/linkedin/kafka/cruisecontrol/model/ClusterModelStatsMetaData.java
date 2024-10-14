/*
 * Copyright 2019 LinkedIn Corp. Licensed under the BSD 2-Clause License (the "License"). See License in the project root for license information.
 */

package com.linkedin.kafka.cruisecontrol.model;

import com.linkedin.kafka.cruisecontrol.servlet.response.JsonResponseClass;
import com.linkedin.kafka.cruisecontrol.servlet.response.JsonResponseField;
import java.util.HashMap;
import java.util.Map;

@JsonResponseClass
public class ClusterModelStatsMetaData {
  @JsonResponseField
  protected static final String BROKERS = "brokers";
  @JsonResponseField
  protected static final String REPLICAS = "replicas";
  @JsonResponseField
  protected static final String TOPICS = "topics";
  protected int _numBrokers;
  protected int _numReplicas;
  protected int _numTopics;

  public ClusterModelStatsMetaData(int numBrokers, int numReplicas, int numTopics) {
    _numBrokers = numBrokers;
    _numReplicas = numReplicas;
    _numTopics = numTopics;
  }

  protected Map<String, Integer> getJsonStructure() {
    Map<String, Integer> basicMap = new HashMap<>(3);
    basicMap.put(BROKERS, _numBrokers);
    basicMap.put(REPLICAS, _numReplicas);
    basicMap.put(TOPICS, _numTopics);
    return basicMap;
  }
}
