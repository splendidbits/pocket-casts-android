// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

// Protobuf Java Version: 3.25.1
package com.pocketcasts.service.api;

public interface SyncUpdateResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.SyncUpdateResponse)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>int64 last_modified = 1;</code>
   * @return The lastModified.
   */
  long getLastModified();

  /**
   * <code>repeated .api.Record records = 2;</code>
   */
  java.util.List<com.pocketcasts.service.api.Record> 
      getRecordsList();
  /**
   * <code>repeated .api.Record records = 2;</code>
   */
  com.pocketcasts.service.api.Record getRecords(int index);
  /**
   * <code>repeated .api.Record records = 2;</code>
   */
  int getRecordsCount();
}