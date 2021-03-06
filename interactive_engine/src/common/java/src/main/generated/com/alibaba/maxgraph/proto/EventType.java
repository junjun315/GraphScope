// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scheduler_monitor.proto

package com.alibaba.maxgraph.proto;

/**
 * Protobuf enum {@code EventType}
 */
public enum EventType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>RESOURCE_SCHEDULER = 0;</code>
   */
  RESOURCE_SCHEDULER(0),
  /**
   * <code>WORKER_OPERATION = 1;</code>
   */
  WORKER_OPERATION(1),
  /**
   * <code>EXCEPTION_INFO = 2;</code>
   */
  EXCEPTION_INFO(2),
  /**
   * <code>NORMAL_INFO = 3;</code>
   */
  NORMAL_INFO(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>RESOURCE_SCHEDULER = 0;</code>
   */
  public static final int RESOURCE_SCHEDULER_VALUE = 0;
  /**
   * <code>WORKER_OPERATION = 1;</code>
   */
  public static final int WORKER_OPERATION_VALUE = 1;
  /**
   * <code>EXCEPTION_INFO = 2;</code>
   */
  public static final int EXCEPTION_INFO_VALUE = 2;
  /**
   * <code>NORMAL_INFO = 3;</code>
   */
  public static final int NORMAL_INFO_VALUE = 3;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static EventType valueOf(int value) {
    return forNumber(value);
  }

  public static EventType forNumber(int value) {
    switch (value) {
      case 0: return RESOURCE_SCHEDULER;
      case 1: return WORKER_OPERATION;
      case 2: return EXCEPTION_INFO;
      case 3: return NORMAL_INFO;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<EventType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      EventType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<EventType>() {
          public EventType findValueByNumber(int number) {
            return EventType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.alibaba.maxgraph.proto.SchedulerMonitor.getDescriptor()
        .getEnumTypes().get(1);
  }

  private static final EventType[] VALUES = values();

  public static EventType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private EventType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:EventType)
}

