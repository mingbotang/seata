// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: abstractGlobalEndRequest.proto

package io.seata.core.protocol.protobuf;

/**
 * <pre>
 * PublishRequest is a publish request.
 * </pre>
 *
 * Protobuf type {@code io.seata.protocol.protobuf.AbstractGlobalEndRequestProto}
 */
public  final class AbstractGlobalEndRequestProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.seata.protocol.protobuf.AbstractGlobalEndRequestProto)
    AbstractGlobalEndRequestProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AbstractGlobalEndRequestProto.newBuilder() to construct.
  private AbstractGlobalEndRequestProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AbstractGlobalEndRequestProto() {
    xid_ = "";
    extraData_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AbstractGlobalEndRequestProto(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            io.seata.core.protocol.protobuf.AbstractTransactionRequestProto.Builder subBuilder = null;
            if (abstractTransactionRequest_ != null) {
              subBuilder = abstractTransactionRequest_.toBuilder();
            }
            abstractTransactionRequest_ = input.readMessage(io.seata.core.protocol.protobuf.AbstractTransactionRequestProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(abstractTransactionRequest_);
              abstractTransactionRequest_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            xid_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            extraData_ = s;
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
    return io.seata.core.protocol.protobuf.AbstractGlobalEndRequest.internal_static_io_seata_protocol_protobuf_AbstractGlobalEndRequestProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.seata.core.protocol.protobuf.AbstractGlobalEndRequest.internal_static_io_seata_protocol_protobuf_AbstractGlobalEndRequestProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.seata.core.protocol.protobuf.AbstractGlobalEndRequestProto.class, io.seata.core.protocol.protobuf.AbstractGlobalEndRequestProto.Builder.class);
  }

  public static final int ABSTRACTTRANSACTIONREQUEST_FIELD_NUMBER = 1;
  private io.seata.core.protocol.protobuf.AbstractTransactionRequestProto abstractTransactionRequest_;
  /**
   * <code>.io.seata.protocol.protobuf.AbstractTransactionRequestProto abstractTransactionRequest = 1;</code>
   */
  public boolean hasAbstractTransactionRequest() {
    return abstractTransactionRequest_ != null;
  }
  /**
   * <code>.io.seata.protocol.protobuf.AbstractTransactionRequestProto abstractTransactionRequest = 1;</code>
   */
  public io.seata.core.protocol.protobuf.AbstractTransactionRequestProto getAbstractTransactionRequest() {
    return abstractTransactionRequest_ == null ? io.seata.core.protocol.protobuf.AbstractTransactionRequestProto.getDefaultInstance() : abstractTransactionRequest_;
  }
  /**
   * <code>.io.seata.protocol.protobuf.AbstractTransactionRequestProto abstractTransactionRequest = 1;</code>
   */
  public io.seata.core.protocol.protobuf.AbstractTransactionRequestProtoOrBuilder getAbstractTransactionRequestOrBuilder() {
    return getAbstractTransactionRequest();
  }

  public static final int XID_FIELD_NUMBER = 2;
  private volatile java.lang.Object xid_;
  /**
   * <code>string xid = 2;</code>
   */
  public java.lang.String getXid() {
    java.lang.Object ref = xid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      xid_ = s;
      return s;
    }
  }
  /**
   * <code>string xid = 2;</code>
   */
  public com.google.protobuf.ByteString
      getXidBytes() {
    java.lang.Object ref = xid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      xid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXTRADATA_FIELD_NUMBER = 3;
  private volatile java.lang.Object extraData_;
  /**
   * <code>string extraData = 3;</code>
   */
  public java.lang.String getExtraData() {
    java.lang.Object ref = extraData_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      extraData_ = s;
      return s;
    }
  }
  /**
   * <code>string extraData = 3;</code>
   */
  public com.google.protobuf.ByteString
      getExtraDataBytes() {
    java.lang.Object ref = extraData_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      extraData_ = b;
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
    if (abstractTransactionRequest_ != null) {
      output.writeMessage(1, getAbstractTransactionRequest());
    }
    if (!getXidBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, xid_);
    }
    if (!getExtraDataBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, extraData_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (abstractTransactionRequest_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAbstractTransactionRequest());
    }
    if (!getXidBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, xid_);
    }
    if (!getExtraDataBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, extraData_);
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
    if (!(obj instanceof io.seata.core.protocol.protobuf.AbstractGlobalEndRequestProto)) {
      return super.equals(obj);
    }
    io.seata.core.protocol.protobuf.AbstractGlobalEndRequestProto other = (io.seata.core.protocol.protobuf.AbstractGlobalEndRequestProto) obj;

    if (hasAbstractTransactionRequest() != other.hasAbstractTransactionRequest()) return false;
    if (hasAbstractTransactionRequest()) {
      if (!getAbstractTransactionRequest()
          .equals(other.getAbstractTransactionRequest())) return false;
    }
    if (!getXid()
        .equals(other.getXid())) return false;
    if (!getExtraData()
        .equals(other.getExtraData())) return false;
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
    if (hasAbstractTransactionRequest()) {
      hash = (37 * hash) + ABSTRACTTRANSACTIONREQUEST_FIELD_NUMBER;
      hash = (53 * hash) + getAbstractTransactionRequest().hashCode();
    }
    hash = (37 * hash) + XID_FIELD_NUMBER;
    hash = (53 * hash) + getXid().hashCode();
    hash = (37 * hash) + EXTRADATA_FIELD_NUMBER;
    hash = (53 * hash) + getExtraData().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.seata.core.protocol.protobuf.AbstractGlobalEndRequestProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.seata.core.protocol.protobuf.AbstractGlobalEndRequestProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.seata.core.protocol.protobuf.AbstractGlobalEndRequestProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.seata.core.protocol.protobuf.AbstractGlobalEndRequestProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.seata.core.protocol.protobuf.AbstractGlobalEndRequestProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.seata.core.protocol.protobuf.AbstractGlobalEndRequestProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.seata.core.protocol.protobuf.AbstractGlobalEndRequestProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.seata.core.protocol.protobuf.AbstractGlobalEndRequestProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.seata.core.protocol.protobuf.AbstractGlobalEndRequestProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.seata.core.protocol.protobuf.AbstractGlobalEndRequestProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.seata.core.protocol.protobuf.AbstractGlobalEndRequestProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.seata.core.protocol.protobuf.AbstractGlobalEndRequestProto parseFrom(
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
  public static Builder newBuilder(io.seata.core.protocol.protobuf.AbstractGlobalEndRequestProto prototype) {
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
   * <pre>
   * PublishRequest is a publish request.
   * </pre>
   *
   * Protobuf type {@code io.seata.protocol.protobuf.AbstractGlobalEndRequestProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.seata.protocol.protobuf.AbstractGlobalEndRequestProto)
      io.seata.core.protocol.protobuf.AbstractGlobalEndRequestProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.seata.core.protocol.protobuf.AbstractGlobalEndRequest.internal_static_io_seata_protocol_protobuf_AbstractGlobalEndRequestProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.seata.core.protocol.protobuf.AbstractGlobalEndRequest.internal_static_io_seata_protocol_protobuf_AbstractGlobalEndRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.seata.core.protocol.protobuf.AbstractGlobalEndRequestProto.class, io.seata.core.protocol.protobuf.AbstractGlobalEndRequestProto.Builder.class);
    }

    // Construct using io.seata.core.protocol.protobuf.AbstractGlobalEndRequestProto.newBuilder()
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
      if (abstractTransactionRequestBuilder_ == null) {
        abstractTransactionRequest_ = null;
      } else {
        abstractTransactionRequest_ = null;
        abstractTransactionRequestBuilder_ = null;
      }
      xid_ = "";

      extraData_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.seata.core.protocol.protobuf.AbstractGlobalEndRequest.internal_static_io_seata_protocol_protobuf_AbstractGlobalEndRequestProto_descriptor;
    }

    @java.lang.Override
    public io.seata.core.protocol.protobuf.AbstractGlobalEndRequestProto getDefaultInstanceForType() {
      return io.seata.core.protocol.protobuf.AbstractGlobalEndRequestProto.getDefaultInstance();
    }

    @java.lang.Override
    public io.seata.core.protocol.protobuf.AbstractGlobalEndRequestProto build() {
      io.seata.core.protocol.protobuf.AbstractGlobalEndRequestProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.seata.core.protocol.protobuf.AbstractGlobalEndRequestProto buildPartial() {
      io.seata.core.protocol.protobuf.AbstractGlobalEndRequestProto result = new io.seata.core.protocol.protobuf.AbstractGlobalEndRequestProto(this);
      if (abstractTransactionRequestBuilder_ == null) {
        result.abstractTransactionRequest_ = abstractTransactionRequest_;
      } else {
        result.abstractTransactionRequest_ = abstractTransactionRequestBuilder_.build();
      }
      result.xid_ = xid_;
      result.extraData_ = extraData_;
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
      if (other instanceof io.seata.core.protocol.protobuf.AbstractGlobalEndRequestProto) {
        return mergeFrom((io.seata.core.protocol.protobuf.AbstractGlobalEndRequestProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.seata.core.protocol.protobuf.AbstractGlobalEndRequestProto other) {
      if (other == io.seata.core.protocol.protobuf.AbstractGlobalEndRequestProto.getDefaultInstance()) return this;
      if (other.hasAbstractTransactionRequest()) {
        mergeAbstractTransactionRequest(other.getAbstractTransactionRequest());
      }
      if (!other.getXid().isEmpty()) {
        xid_ = other.xid_;
        onChanged();
      }
      if (!other.getExtraData().isEmpty()) {
        extraData_ = other.extraData_;
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
      io.seata.core.protocol.protobuf.AbstractGlobalEndRequestProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.seata.core.protocol.protobuf.AbstractGlobalEndRequestProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.seata.core.protocol.protobuf.AbstractTransactionRequestProto abstractTransactionRequest_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.seata.core.protocol.protobuf.AbstractTransactionRequestProto, io.seata.core.protocol.protobuf.AbstractTransactionRequestProto.Builder, io.seata.core.protocol.protobuf.AbstractTransactionRequestProtoOrBuilder> abstractTransactionRequestBuilder_;
    /**
     * <code>.io.seata.protocol.protobuf.AbstractTransactionRequestProto abstractTransactionRequest = 1;</code>
     */
    public boolean hasAbstractTransactionRequest() {
      return abstractTransactionRequestBuilder_ != null || abstractTransactionRequest_ != null;
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractTransactionRequestProto abstractTransactionRequest = 1;</code>
     */
    public io.seata.core.protocol.protobuf.AbstractTransactionRequestProto getAbstractTransactionRequest() {
      if (abstractTransactionRequestBuilder_ == null) {
        return abstractTransactionRequest_ == null ? io.seata.core.protocol.protobuf.AbstractTransactionRequestProto.getDefaultInstance() : abstractTransactionRequest_;
      } else {
        return abstractTransactionRequestBuilder_.getMessage();
      }
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractTransactionRequestProto abstractTransactionRequest = 1;</code>
     */
    public Builder setAbstractTransactionRequest(io.seata.core.protocol.protobuf.AbstractTransactionRequestProto value) {
      if (abstractTransactionRequestBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        abstractTransactionRequest_ = value;
        onChanged();
      } else {
        abstractTransactionRequestBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractTransactionRequestProto abstractTransactionRequest = 1;</code>
     */
    public Builder setAbstractTransactionRequest(
        io.seata.core.protocol.protobuf.AbstractTransactionRequestProto.Builder builderForValue) {
      if (abstractTransactionRequestBuilder_ == null) {
        abstractTransactionRequest_ = builderForValue.build();
        onChanged();
      } else {
        abstractTransactionRequestBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractTransactionRequestProto abstractTransactionRequest = 1;</code>
     */
    public Builder mergeAbstractTransactionRequest(io.seata.core.protocol.protobuf.AbstractTransactionRequestProto value) {
      if (abstractTransactionRequestBuilder_ == null) {
        if (abstractTransactionRequest_ != null) {
          abstractTransactionRequest_ =
            io.seata.core.protocol.protobuf.AbstractTransactionRequestProto.newBuilder(abstractTransactionRequest_).mergeFrom(value).buildPartial();
        } else {
          abstractTransactionRequest_ = value;
        }
        onChanged();
      } else {
        abstractTransactionRequestBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractTransactionRequestProto abstractTransactionRequest = 1;</code>
     */
    public Builder clearAbstractTransactionRequest() {
      if (abstractTransactionRequestBuilder_ == null) {
        abstractTransactionRequest_ = null;
        onChanged();
      } else {
        abstractTransactionRequest_ = null;
        abstractTransactionRequestBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractTransactionRequestProto abstractTransactionRequest = 1;</code>
     */
    public io.seata.core.protocol.protobuf.AbstractTransactionRequestProto.Builder getAbstractTransactionRequestBuilder() {
      
      onChanged();
      return getAbstractTransactionRequestFieldBuilder().getBuilder();
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractTransactionRequestProto abstractTransactionRequest = 1;</code>
     */
    public io.seata.core.protocol.protobuf.AbstractTransactionRequestProtoOrBuilder getAbstractTransactionRequestOrBuilder() {
      if (abstractTransactionRequestBuilder_ != null) {
        return abstractTransactionRequestBuilder_.getMessageOrBuilder();
      } else {
        return abstractTransactionRequest_ == null ?
            io.seata.core.protocol.protobuf.AbstractTransactionRequestProto.getDefaultInstance() : abstractTransactionRequest_;
      }
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractTransactionRequestProto abstractTransactionRequest = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.seata.core.protocol.protobuf.AbstractTransactionRequestProto, io.seata.core.protocol.protobuf.AbstractTransactionRequestProto.Builder, io.seata.core.protocol.protobuf.AbstractTransactionRequestProtoOrBuilder> 
        getAbstractTransactionRequestFieldBuilder() {
      if (abstractTransactionRequestBuilder_ == null) {
        abstractTransactionRequestBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.seata.core.protocol.protobuf.AbstractTransactionRequestProto, io.seata.core.protocol.protobuf.AbstractTransactionRequestProto.Builder, io.seata.core.protocol.protobuf.AbstractTransactionRequestProtoOrBuilder>(
                getAbstractTransactionRequest(),
                getParentForChildren(),
                isClean());
        abstractTransactionRequest_ = null;
      }
      return abstractTransactionRequestBuilder_;
    }

    private java.lang.Object xid_ = "";
    /**
     * <code>string xid = 2;</code>
     */
    public java.lang.String getXid() {
      java.lang.Object ref = xid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        xid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string xid = 2;</code>
     */
    public com.google.protobuf.ByteString
        getXidBytes() {
      java.lang.Object ref = xid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        xid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string xid = 2;</code>
     */
    public Builder setXid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      xid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string xid = 2;</code>
     */
    public Builder clearXid() {
      
      xid_ = getDefaultInstance().getXid();
      onChanged();
      return this;
    }
    /**
     * <code>string xid = 2;</code>
     */
    public Builder setXidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      xid_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object extraData_ = "";
    /**
     * <code>string extraData = 3;</code>
     */
    public java.lang.String getExtraData() {
      java.lang.Object ref = extraData_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        extraData_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string extraData = 3;</code>
     */
    public com.google.protobuf.ByteString
        getExtraDataBytes() {
      java.lang.Object ref = extraData_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        extraData_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string extraData = 3;</code>
     */
    public Builder setExtraData(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      extraData_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string extraData = 3;</code>
     */
    public Builder clearExtraData() {
      
      extraData_ = getDefaultInstance().getExtraData();
      onChanged();
      return this;
    }
    /**
     * <code>string extraData = 3;</code>
     */
    public Builder setExtraDataBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      extraData_ = value;
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


    // @@protoc_insertion_point(builder_scope:io.seata.protocol.protobuf.AbstractGlobalEndRequestProto)
  }

  // @@protoc_insertion_point(class_scope:io.seata.protocol.protobuf.AbstractGlobalEndRequestProto)
  private static final io.seata.core.protocol.protobuf.AbstractGlobalEndRequestProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.seata.core.protocol.protobuf.AbstractGlobalEndRequestProto();
  }

  public static io.seata.core.protocol.protobuf.AbstractGlobalEndRequestProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AbstractGlobalEndRequestProto>
      PARSER = new com.google.protobuf.AbstractParser<AbstractGlobalEndRequestProto>() {
    @java.lang.Override
    public AbstractGlobalEndRequestProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AbstractGlobalEndRequestProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AbstractGlobalEndRequestProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AbstractGlobalEndRequestProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.seata.core.protocol.protobuf.AbstractGlobalEndRequestProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
