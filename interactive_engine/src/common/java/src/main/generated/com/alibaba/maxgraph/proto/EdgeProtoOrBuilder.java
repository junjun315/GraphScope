// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: debug.proto

package com.alibaba.maxgraph.proto;

public interface EdgeProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:EdgeProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 id = 1;</code>
   */
  long getId();

  /**
   * <code>optional int64 src_id = 2;</code>
   */
  long getSrcId();

  /**
   * <code>optional int64 dst_id = 3;</code>
   */
  long getDstId();

  /**
   * <code>optional .RelationProto relation = 4;</code>
   */
  boolean hasRelation();
  /**
   * <code>optional .RelationProto relation = 4;</code>
   */
  com.alibaba.maxgraph.proto.RelationProto getRelation();
  /**
   * <code>optional .RelationProto relation = 4;</code>
   */
  com.alibaba.maxgraph.proto.RelationProtoOrBuilder getRelationOrBuilder();

  /**
   * <code>optional int64 start_si = 5;</code>
   */
  long getStartSi();

  /**
   * <code>optional int64 end_si = 6;</code>
   */
  long getEndSi();

  /**
   * <code>repeated .PropertyProto properties = 7;</code>
   */
  java.util.List<com.alibaba.maxgraph.proto.PropertyProto> 
      getPropertiesList();
  /**
   * <code>repeated .PropertyProto properties = 7;</code>
   */
  com.alibaba.maxgraph.proto.PropertyProto getProperties(int index);
  /**
   * <code>repeated .PropertyProto properties = 7;</code>
   */
  int getPropertiesCount();
  /**
   * <code>repeated .PropertyProto properties = 7;</code>
   */
  java.util.List<? extends com.alibaba.maxgraph.proto.PropertyProtoOrBuilder> 
      getPropertiesOrBuilderList();
  /**
   * <code>repeated .PropertyProto properties = 7;</code>
   */
  com.alibaba.maxgraph.proto.PropertyProtoOrBuilder getPropertiesOrBuilder(
      int index);
}
