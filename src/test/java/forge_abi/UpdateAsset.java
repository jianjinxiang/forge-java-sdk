// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: update_asset.proto

package forge_abi;

public final class UpdateAsset {
  private UpdateAsset() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UpdateAssetTxOrBuilder extends
      // @@protoc_insertion_point(interface_extends:forge_abi.UpdateAssetTx)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string address = 1;</code>
     */
    java.lang.String getAddress();
    /**
     * <code>string address = 1;</code>
     */
    com.google.protobuf.ByteString
        getAddressBytes();

    /**
     * <code>string moniker = 2;</code>
     */
    java.lang.String getMoniker();
    /**
     * <code>string moniker = 2;</code>
     */
    com.google.protobuf.ByteString
        getMonikerBytes();

    /**
     * <pre>
     * forge won't update data into state if app is interested in this tx.
     * </pre>
     *
     * <code>.google.protobuf.Any data = 15;</code>
     */
    boolean hasData();
    /**
     * <pre>
     * forge won't update data into state if app is interested in this tx.
     * </pre>
     *
     * <code>.google.protobuf.Any data = 15;</code>
     */
    com.google.protobuf.Any getData();
    /**
     * <pre>
     * forge won't update data into state if app is interested in this tx.
     * </pre>
     *
     * <code>.google.protobuf.Any data = 15;</code>
     */
    com.google.protobuf.AnyOrBuilder getDataOrBuilder();
  }
  /**
   * Protobuf type {@code forge_abi.UpdateAssetTx}
   */
  public  static final class UpdateAssetTx extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:forge_abi.UpdateAssetTx)
      UpdateAssetTxOrBuilder {
    // Use UpdateAssetTx.newBuilder() to construct.
    private UpdateAssetTx(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UpdateAssetTx() {
      address_ = "";
      moniker_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private UpdateAssetTx(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              address_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              moniker_ = s;
              break;
            }
            case 122: {
              com.google.protobuf.Any.Builder subBuilder = null;
              if (data_ != null) {
                subBuilder = data_.toBuilder();
              }
              data_ = input.readMessage(com.google.protobuf.Any.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(data_);
                data_ = subBuilder.buildPartial();
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
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return forge_abi.UpdateAsset.internal_static_forge_abi_UpdateAssetTx_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return forge_abi.UpdateAsset.internal_static_forge_abi_UpdateAssetTx_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              forge_abi.UpdateAsset.UpdateAssetTx.class, forge_abi.UpdateAsset.UpdateAssetTx.Builder.class);
    }

    public static final int ADDRESS_FIELD_NUMBER = 1;
    private volatile java.lang.Object address_;
    /**
     * <code>string address = 1;</code>
     */
    public java.lang.String getAddress() {
      java.lang.Object ref = address_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        address_ = s;
        return s;
      }
    }
    /**
     * <code>string address = 1;</code>
     */
    public com.google.protobuf.ByteString
        getAddressBytes() {
      java.lang.Object ref = address_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        address_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int MONIKER_FIELD_NUMBER = 2;
    private volatile java.lang.Object moniker_;
    /**
     * <code>string moniker = 2;</code>
     */
    public java.lang.String getMoniker() {
      java.lang.Object ref = moniker_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        moniker_ = s;
        return s;
      }
    }
    /**
     * <code>string moniker = 2;</code>
     */
    public com.google.protobuf.ByteString
        getMonikerBytes() {
      java.lang.Object ref = moniker_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        moniker_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int DATA_FIELD_NUMBER = 15;
    private com.google.protobuf.Any data_;
    /**
     * <pre>
     * forge won't update data into state if app is interested in this tx.
     * </pre>
     *
     * <code>.google.protobuf.Any data = 15;</code>
     */
    public boolean hasData() {
      return data_ != null;
    }
    /**
     * <pre>
     * forge won't update data into state if app is interested in this tx.
     * </pre>
     *
     * <code>.google.protobuf.Any data = 15;</code>
     */
    public com.google.protobuf.Any getData() {
      return data_ == null ? com.google.protobuf.Any.getDefaultInstance() : data_;
    }
    /**
     * <pre>
     * forge won't update data into state if app is interested in this tx.
     * </pre>
     *
     * <code>.google.protobuf.Any data = 15;</code>
     */
    public com.google.protobuf.AnyOrBuilder getDataOrBuilder() {
      return getData();
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getAddressBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, address_);
      }
      if (!getMonikerBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, moniker_);
      }
      if (data_ != null) {
        output.writeMessage(15, getData());
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getAddressBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, address_);
      }
      if (!getMonikerBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, moniker_);
      }
      if (data_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(15, getData());
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof forge_abi.UpdateAsset.UpdateAssetTx)) {
        return super.equals(obj);
      }
      forge_abi.UpdateAsset.UpdateAssetTx other = (forge_abi.UpdateAsset.UpdateAssetTx) obj;

      boolean result = true;
      result = result && getAddress()
          .equals(other.getAddress());
      result = result && getMoniker()
          .equals(other.getMoniker());
      result = result && (hasData() == other.hasData());
      if (hasData()) {
        result = result && getData()
            .equals(other.getData());
      }
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
      hash = (53 * hash) + getAddress().hashCode();
      hash = (37 * hash) + MONIKER_FIELD_NUMBER;
      hash = (53 * hash) + getMoniker().hashCode();
      if (hasData()) {
        hash = (37 * hash) + DATA_FIELD_NUMBER;
        hash = (53 * hash) + getData().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static forge_abi.UpdateAsset.UpdateAssetTx parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static forge_abi.UpdateAsset.UpdateAssetTx parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static forge_abi.UpdateAsset.UpdateAssetTx parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static forge_abi.UpdateAsset.UpdateAssetTx parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static forge_abi.UpdateAsset.UpdateAssetTx parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static forge_abi.UpdateAsset.UpdateAssetTx parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static forge_abi.UpdateAsset.UpdateAssetTx parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static forge_abi.UpdateAsset.UpdateAssetTx parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static forge_abi.UpdateAsset.UpdateAssetTx parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static forge_abi.UpdateAsset.UpdateAssetTx parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(forge_abi.UpdateAsset.UpdateAssetTx prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
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
     * Protobuf type {@code forge_abi.UpdateAssetTx}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:forge_abi.UpdateAssetTx)
        forge_abi.UpdateAsset.UpdateAssetTxOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return forge_abi.UpdateAsset.internal_static_forge_abi_UpdateAssetTx_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return forge_abi.UpdateAsset.internal_static_forge_abi_UpdateAssetTx_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                forge_abi.UpdateAsset.UpdateAssetTx.class, forge_abi.UpdateAsset.UpdateAssetTx.Builder.class);
      }

      // Construct using forge_abi.UpdateAsset.UpdateAssetTx.newBuilder()
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
      public Builder clear() {
        super.clear();
        address_ = "";

        moniker_ = "";

        if (dataBuilder_ == null) {
          data_ = null;
        } else {
          data_ = null;
          dataBuilder_ = null;
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return forge_abi.UpdateAsset.internal_static_forge_abi_UpdateAssetTx_descriptor;
      }

      public forge_abi.UpdateAsset.UpdateAssetTx getDefaultInstanceForType() {
        return forge_abi.UpdateAsset.UpdateAssetTx.getDefaultInstance();
      }

      public forge_abi.UpdateAsset.UpdateAssetTx build() {
        forge_abi.UpdateAsset.UpdateAssetTx result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public forge_abi.UpdateAsset.UpdateAssetTx buildPartial() {
        forge_abi.UpdateAsset.UpdateAssetTx result = new forge_abi.UpdateAsset.UpdateAssetTx(this);
        result.address_ = address_;
        result.moniker_ = moniker_;
        if (dataBuilder_ == null) {
          result.data_ = data_;
        } else {
          result.data_ = dataBuilder_.build();
        }
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof forge_abi.UpdateAsset.UpdateAssetTx) {
          return mergeFrom((forge_abi.UpdateAsset.UpdateAssetTx)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(forge_abi.UpdateAsset.UpdateAssetTx other) {
        if (other == forge_abi.UpdateAsset.UpdateAssetTx.getDefaultInstance()) return this;
        if (!other.getAddress().isEmpty()) {
          address_ = other.address_;
          onChanged();
        }
        if (!other.getMoniker().isEmpty()) {
          moniker_ = other.moniker_;
          onChanged();
        }
        if (other.hasData()) {
          mergeData(other.getData());
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        forge_abi.UpdateAsset.UpdateAssetTx parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (forge_abi.UpdateAsset.UpdateAssetTx) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object address_ = "";
      /**
       * <code>string address = 1;</code>
       */
      public java.lang.String getAddress() {
        java.lang.Object ref = address_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          address_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string address = 1;</code>
       */
      public com.google.protobuf.ByteString
          getAddressBytes() {
        java.lang.Object ref = address_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          address_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string address = 1;</code>
       */
      public Builder setAddress(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        address_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string address = 1;</code>
       */
      public Builder clearAddress() {
        
        address_ = getDefaultInstance().getAddress();
        onChanged();
        return this;
      }
      /**
       * <code>string address = 1;</code>
       */
      public Builder setAddressBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        address_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object moniker_ = "";
      /**
       * <code>string moniker = 2;</code>
       */
      public java.lang.String getMoniker() {
        java.lang.Object ref = moniker_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          moniker_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string moniker = 2;</code>
       */
      public com.google.protobuf.ByteString
          getMonikerBytes() {
        java.lang.Object ref = moniker_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          moniker_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string moniker = 2;</code>
       */
      public Builder setMoniker(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        moniker_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string moniker = 2;</code>
       */
      public Builder clearMoniker() {
        
        moniker_ = getDefaultInstance().getMoniker();
        onChanged();
        return this;
      }
      /**
       * <code>string moniker = 2;</code>
       */
      public Builder setMonikerBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        moniker_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.Any data_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> dataBuilder_;
      /**
       * <pre>
       * forge won't update data into state if app is interested in this tx.
       * </pre>
       *
       * <code>.google.protobuf.Any data = 15;</code>
       */
      public boolean hasData() {
        return dataBuilder_ != null || data_ != null;
      }
      /**
       * <pre>
       * forge won't update data into state if app is interested in this tx.
       * </pre>
       *
       * <code>.google.protobuf.Any data = 15;</code>
       */
      public com.google.protobuf.Any getData() {
        if (dataBuilder_ == null) {
          return data_ == null ? com.google.protobuf.Any.getDefaultInstance() : data_;
        } else {
          return dataBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * forge won't update data into state if app is interested in this tx.
       * </pre>
       *
       * <code>.google.protobuf.Any data = 15;</code>
       */
      public Builder setData(com.google.protobuf.Any value) {
        if (dataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          data_ = value;
          onChanged();
        } else {
          dataBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       * forge won't update data into state if app is interested in this tx.
       * </pre>
       *
       * <code>.google.protobuf.Any data = 15;</code>
       */
      public Builder setData(
          com.google.protobuf.Any.Builder builderForValue) {
        if (dataBuilder_ == null) {
          data_ = builderForValue.build();
          onChanged();
        } else {
          dataBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       * forge won't update data into state if app is interested in this tx.
       * </pre>
       *
       * <code>.google.protobuf.Any data = 15;</code>
       */
      public Builder mergeData(com.google.protobuf.Any value) {
        if (dataBuilder_ == null) {
          if (data_ != null) {
            data_ =
              com.google.protobuf.Any.newBuilder(data_).mergeFrom(value).buildPartial();
          } else {
            data_ = value;
          }
          onChanged();
        } else {
          dataBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       * forge won't update data into state if app is interested in this tx.
       * </pre>
       *
       * <code>.google.protobuf.Any data = 15;</code>
       */
      public Builder clearData() {
        if (dataBuilder_ == null) {
          data_ = null;
          onChanged();
        } else {
          data_ = null;
          dataBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       * forge won't update data into state if app is interested in this tx.
       * </pre>
       *
       * <code>.google.protobuf.Any data = 15;</code>
       */
      public com.google.protobuf.Any.Builder getDataBuilder() {
        
        onChanged();
        return getDataFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * forge won't update data into state if app is interested in this tx.
       * </pre>
       *
       * <code>.google.protobuf.Any data = 15;</code>
       */
      public com.google.protobuf.AnyOrBuilder getDataOrBuilder() {
        if (dataBuilder_ != null) {
          return dataBuilder_.getMessageOrBuilder();
        } else {
          return data_ == null ?
              com.google.protobuf.Any.getDefaultInstance() : data_;
        }
      }
      /**
       * <pre>
       * forge won't update data into state if app is interested in this tx.
       * </pre>
       *
       * <code>.google.protobuf.Any data = 15;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> 
          getDataFieldBuilder() {
        if (dataBuilder_ == null) {
          dataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder>(
                  getData(),
                  getParentForChildren(),
                  isClean());
          data_ = null;
        }
        return dataBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:forge_abi.UpdateAssetTx)
    }

    // @@protoc_insertion_point(class_scope:forge_abi.UpdateAssetTx)
    private static final forge_abi.UpdateAsset.UpdateAssetTx DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new forge_abi.UpdateAsset.UpdateAssetTx();
    }

    public static forge_abi.UpdateAsset.UpdateAssetTx getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UpdateAssetTx>
        PARSER = new com.google.protobuf.AbstractParser<UpdateAssetTx>() {
      public UpdateAssetTx parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new UpdateAssetTx(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<UpdateAssetTx> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UpdateAssetTx> getParserForType() {
      return PARSER;
    }

    public forge_abi.UpdateAsset.UpdateAssetTx getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_forge_abi_UpdateAssetTx_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_forge_abi_UpdateAssetTx_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022update_asset.proto\022\tforge_abi\032\031google/" +
      "protobuf/any.proto\"U\n\rUpdateAssetTx\022\017\n\007a" +
      "ddress\030\001 \001(\t\022\017\n\007moniker\030\002 \001(\t\022\"\n\004data\030\017 " +
      "\001(\0132\024.google.protobuf.Anyb\006proto3"
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
          com.google.protobuf.AnyProto.getDescriptor(),
        }, assigner);
    internal_static_forge_abi_UpdateAssetTx_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_forge_abi_UpdateAssetTx_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_forge_abi_UpdateAssetTx_descriptor,
        new java.lang.String[] { "Address", "Moniker", "Data", });
    com.google.protobuf.AnyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
