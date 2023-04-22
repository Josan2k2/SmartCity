// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: traffic.proto

package com.energy.smartcity.traffic;

public final class TrafficServiceImpl {
  private TrafficServiceImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SmartCityServices_autoOnRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SmartCityServices_autoOnRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SmartCityServices_emerTrafficOnRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SmartCityServices_emerTrafficOnRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SmartCityServices_signalsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SmartCityServices_signalsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SmartCityServices_autoOnReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SmartCityServices_autoOnReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SmartCityServices_emerTrafficOnReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SmartCityServices_emerTrafficOnReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SmartCityServices_signalsReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SmartCityServices_signalsReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rtraffic.proto\022\021SmartCityServices\"$\n\rau" +
      "toOnRequest\022\023\n\013AutoTraffic\030\001 \001(\t\"0\n\024emer" +
      "TrafficOnRequest\022\030\n\020EmergencyTraffic\030\001 \001" +
      "(\t\"%\n\016signalsRequest\022\023\n\013AutoSignals\030\001 \001(" +
      "\t\"\"\n\013autoOnReply\022\023\n\013AutoTraffic\030\001 \001(\t\".\n" +
      "\022emerTrafficOnReply\022\030\n\020EmergencyTraffic\030" +
      "\001 \001(\t\"#\n\014signalsReply\022\023\n\013AutoSignals\030\001 \001" +
      "(\t2\236\002\n\rTrafficLights\022R\n\014autoTrafficL\022 .S" +
      "martCityServices.autoOnRequest\032\036.SmartCi" +
      "tyServices.autoOnReply\"\000\022d\n\020emergencyTra" +
      "ffic\022\'.SmartCityServices.emerTrafficOnRe" +
      "quest\032%.SmartCityServices.emerTrafficOnR" +
      "eply\"\000\022S\n\013autoSignals\022!.SmartCityService" +
      "s.signalsRequest\032\037.SmartCityServices.sig" +
      "nalsReply\"\000B4\n\034com.energy.smartcity.traf" +
      "ficB\022TrafficServiceImplP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_SmartCityServices_autoOnRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SmartCityServices_autoOnRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SmartCityServices_autoOnRequest_descriptor,
        new java.lang.String[] { "AutoTraffic", });
    internal_static_SmartCityServices_emerTrafficOnRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_SmartCityServices_emerTrafficOnRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SmartCityServices_emerTrafficOnRequest_descriptor,
        new java.lang.String[] { "EmergencyTraffic", });
    internal_static_SmartCityServices_signalsRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_SmartCityServices_signalsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SmartCityServices_signalsRequest_descriptor,
        new java.lang.String[] { "AutoSignals", });
    internal_static_SmartCityServices_autoOnReply_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_SmartCityServices_autoOnReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SmartCityServices_autoOnReply_descriptor,
        new java.lang.String[] { "AutoTraffic", });
    internal_static_SmartCityServices_emerTrafficOnReply_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_SmartCityServices_emerTrafficOnReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SmartCityServices_emerTrafficOnReply_descriptor,
        new java.lang.String[] { "EmergencyTraffic", });
    internal_static_SmartCityServices_signalsReply_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_SmartCityServices_signalsReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SmartCityServices_signalsReply_descriptor,
        new java.lang.String[] { "AutoSignals", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
