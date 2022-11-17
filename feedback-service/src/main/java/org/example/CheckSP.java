// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: checkSP.proto

package org.example;

public final class CheckSP {
  private CheckSP() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface checkSPIDOrBuilder extends
      // @@protoc_insertion_point(interface_extends:checkSPID)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string SPID = 1;</code>
     * @return The sPID.
     */
    java.lang.String getSPID();
    /**
     * <code>string SPID = 1;</code>
     * @return The bytes for sPID.
     */
    com.google.protobuf.ByteString
        getSPIDBytes();
  }
  /**
   * Protobuf type {@code checkSPID}
   */
  public  static final class checkSPID extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:checkSPID)
      checkSPIDOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use checkSPID.newBuilder() to construct.
    private checkSPID(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private checkSPID() {
      sPID_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new checkSPID();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private checkSPID(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              sPID_ = s;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.example.CheckSP.internal_static_checkSPID_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.example.CheckSP.internal_static_checkSPID_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.example.CheckSP.checkSPID.class, org.example.CheckSP.checkSPID.Builder.class);
    }

    public static final int SPID_FIELD_NUMBER = 1;
    private volatile java.lang.Object sPID_;
    /**
     * <code>string SPID = 1;</code>
     * @return The sPID.
     */
    public java.lang.String getSPID() {
      java.lang.Object ref = sPID_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sPID_ = s;
        return s;
      }
    }
    /**
     * <code>string SPID = 1;</code>
     * @return The bytes for sPID.
     */
    public com.google.protobuf.ByteString
        getSPIDBytes() {
      java.lang.Object ref = sPID_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sPID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getSPIDBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, sPID_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getSPIDBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, sPID_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.example.CheckSP.checkSPID)) {
        return super.equals(obj);
      }
      org.example.CheckSP.checkSPID other = (org.example.CheckSP.checkSPID) obj;

      if (!getSPID()
          .equals(other.getSPID())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + SPID_FIELD_NUMBER;
      hash = (53 * hash) + getSPID().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.example.CheckSP.checkSPID parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.example.CheckSP.checkSPID parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.example.CheckSP.checkSPID parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.example.CheckSP.checkSPID parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.example.CheckSP.checkSPID parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.example.CheckSP.checkSPID parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.example.CheckSP.checkSPID parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.example.CheckSP.checkSPID parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.example.CheckSP.checkSPID parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.example.CheckSP.checkSPID parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.example.CheckSP.checkSPID parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.example.CheckSP.checkSPID parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(org.example.CheckSP.checkSPID prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code checkSPID}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:checkSPID)
        org.example.CheckSP.checkSPIDOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.example.CheckSP.internal_static_checkSPID_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.example.CheckSP.internal_static_checkSPID_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.example.CheckSP.checkSPID.class, org.example.CheckSP.checkSPID.Builder.class);
      }

      // Construct using org.example.CheckSP.checkSPID.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        sPID_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.example.CheckSP.internal_static_checkSPID_descriptor;
      }

      @java.lang.Override
      public org.example.CheckSP.checkSPID getDefaultInstanceForType() {
        return org.example.CheckSP.checkSPID.getDefaultInstance();
      }

      @java.lang.Override
      public org.example.CheckSP.checkSPID build() {
        org.example.CheckSP.checkSPID result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.example.CheckSP.checkSPID buildPartial() {
        org.example.CheckSP.checkSPID result = new org.example.CheckSP.checkSPID(this);
        result.sPID_ = sPID_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.example.CheckSP.checkSPID) {
          return mergeFrom((org.example.CheckSP.checkSPID)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.example.CheckSP.checkSPID other) {
        if (other == org.example.CheckSP.checkSPID.getDefaultInstance()) return this;
        if (!other.getSPID().isEmpty()) {
          sPID_ = other.sPID_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.example.CheckSP.checkSPID parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.example.CheckSP.checkSPID) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object sPID_ = "";
      /**
       * <code>string SPID = 1;</code>
       * @return The sPID.
       */
      public java.lang.String getSPID() {
        java.lang.Object ref = sPID_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          sPID_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string SPID = 1;</code>
       * @return The bytes for sPID.
       */
      public com.google.protobuf.ByteString
          getSPIDBytes() {
        java.lang.Object ref = sPID_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          sPID_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string SPID = 1;</code>
       * @param value The sPID to set.
       * @return This builder for chaining.
       */
      public Builder setSPID(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        sPID_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string SPID = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearSPID() {
        
        sPID_ = getDefaultInstance().getSPID();
        onChanged();
        return this;
      }
      /**
       * <code>string SPID = 1;</code>
       * @param value The bytes for sPID to set.
       * @return This builder for chaining.
       */
      public Builder setSPIDBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        sPID_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:checkSPID)
    }

    // @@protoc_insertion_point(class_scope:checkSPID)
    private static final org.example.CheckSP.checkSPID DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.example.CheckSP.checkSPID();
    }

    public static org.example.CheckSP.checkSPID getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<checkSPID>
        PARSER = new com.google.protobuf.AbstractParser<checkSPID>() {
      @java.lang.Override
      public checkSPID parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new checkSPID(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<checkSPID> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<checkSPID> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.example.CheckSP.checkSPID getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface checkRespOrBuilder extends
      // @@protoc_insertion_point(interface_extends:checkResp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string respmsg = 1;</code>
     * @return The respmsg.
     */
    java.lang.String getRespmsg();
    /**
     * <code>string respmsg = 1;</code>
     * @return The bytes for respmsg.
     */
    com.google.protobuf.ByteString
        getRespmsgBytes();
  }
  /**
   * Protobuf type {@code checkResp}
   */
  public  static final class checkResp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:checkResp)
      checkRespOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use checkResp.newBuilder() to construct.
    private checkResp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private checkResp() {
      respmsg_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new checkResp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private checkResp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              respmsg_ = s;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.example.CheckSP.internal_static_checkResp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.example.CheckSP.internal_static_checkResp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.example.CheckSP.checkResp.class, org.example.CheckSP.checkResp.Builder.class);
    }

    public static final int RESPMSG_FIELD_NUMBER = 1;
    private volatile java.lang.Object respmsg_;
    /**
     * <code>string respmsg = 1;</code>
     * @return The respmsg.
     */
    public java.lang.String getRespmsg() {
      java.lang.Object ref = respmsg_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        respmsg_ = s;
        return s;
      }
    }
    /**
     * <code>string respmsg = 1;</code>
     * @return The bytes for respmsg.
     */
    public com.google.protobuf.ByteString
        getRespmsgBytes() {
      java.lang.Object ref = respmsg_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        respmsg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getRespmsgBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, respmsg_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getRespmsgBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, respmsg_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.example.CheckSP.checkResp)) {
        return super.equals(obj);
      }
      org.example.CheckSP.checkResp other = (org.example.CheckSP.checkResp) obj;

      if (!getRespmsg()
          .equals(other.getRespmsg())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + RESPMSG_FIELD_NUMBER;
      hash = (53 * hash) + getRespmsg().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.example.CheckSP.checkResp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.example.CheckSP.checkResp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.example.CheckSP.checkResp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.example.CheckSP.checkResp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.example.CheckSP.checkResp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.example.CheckSP.checkResp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.example.CheckSP.checkResp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.example.CheckSP.checkResp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.example.CheckSP.checkResp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.example.CheckSP.checkResp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.example.CheckSP.checkResp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.example.CheckSP.checkResp parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(org.example.CheckSP.checkResp prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code checkResp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:checkResp)
        org.example.CheckSP.checkRespOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.example.CheckSP.internal_static_checkResp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.example.CheckSP.internal_static_checkResp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.example.CheckSP.checkResp.class, org.example.CheckSP.checkResp.Builder.class);
      }

      // Construct using org.example.CheckSP.checkResp.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        respmsg_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.example.CheckSP.internal_static_checkResp_descriptor;
      }

      @java.lang.Override
      public org.example.CheckSP.checkResp getDefaultInstanceForType() {
        return org.example.CheckSP.checkResp.getDefaultInstance();
      }

      @java.lang.Override
      public org.example.CheckSP.checkResp build() {
        org.example.CheckSP.checkResp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.example.CheckSP.checkResp buildPartial() {
        org.example.CheckSP.checkResp result = new org.example.CheckSP.checkResp(this);
        result.respmsg_ = respmsg_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.example.CheckSP.checkResp) {
          return mergeFrom((org.example.CheckSP.checkResp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.example.CheckSP.checkResp other) {
        if (other == org.example.CheckSP.checkResp.getDefaultInstance()) return this;
        if (!other.getRespmsg().isEmpty()) {
          respmsg_ = other.respmsg_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.example.CheckSP.checkResp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.example.CheckSP.checkResp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object respmsg_ = "";
      /**
       * <code>string respmsg = 1;</code>
       * @return The respmsg.
       */
      public java.lang.String getRespmsg() {
        java.lang.Object ref = respmsg_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          respmsg_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string respmsg = 1;</code>
       * @return The bytes for respmsg.
       */
      public com.google.protobuf.ByteString
          getRespmsgBytes() {
        java.lang.Object ref = respmsg_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          respmsg_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string respmsg = 1;</code>
       * @param value The respmsg to set.
       * @return This builder for chaining.
       */
      public Builder setRespmsg(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        respmsg_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string respmsg = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearRespmsg() {
        
        respmsg_ = getDefaultInstance().getRespmsg();
        onChanged();
        return this;
      }
      /**
       * <code>string respmsg = 1;</code>
       * @param value The bytes for respmsg to set.
       * @return This builder for chaining.
       */
      public Builder setRespmsgBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        respmsg_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:checkResp)
    }

    // @@protoc_insertion_point(class_scope:checkResp)
    private static final org.example.CheckSP.checkResp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.example.CheckSP.checkResp();
    }

    public static org.example.CheckSP.checkResp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<checkResp>
        PARSER = new com.google.protobuf.AbstractParser<checkResp>() {
      @java.lang.Override
      public checkResp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new checkResp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<checkResp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<checkResp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.example.CheckSP.checkResp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_checkSPID_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_checkSPID_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_checkResp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_checkResp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rcheckSP.proto\"\031\n\tcheckSPID\022\014\n\004SPID\030\001 \001" +
      "(\t\"\034\n\tcheckResp\022\017\n\007respmsg\030\001 \001(\t2/\n\007chec" +
      "kSP\022$\n\nvalidateSP\022\n.checkSPID\032\n.checkRes" +
      "pB\r\n\013org.exampleb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_checkSPID_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_checkSPID_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_checkSPID_descriptor,
        new java.lang.String[] { "SPID", });
    internal_static_checkResp_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_checkResp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_checkResp_descriptor,
        new java.lang.String[] { "Respmsg", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
