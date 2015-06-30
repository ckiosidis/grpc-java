// Generated by the protocol buffer compiler.  DO NOT EDIT!

package io.grpc.android.integrationtest;

@SuppressWarnings("hiding")
public interface Messages {

  // enum PayloadType
  public static final int COMPRESSABLE = 0;
  public static final int UNCOMPRESSABLE = 1;
  public static final int RANDOM = 2;

  public static final class Payload extends
      com.google.protobuf.nano.MessageNano {

    private static volatile Payload[] _emptyArray;
    public static Payload[] emptyArray() {
      // Lazily initializes the empty array
      if (_emptyArray == null) {
        synchronized (
            com.google.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
          if (_emptyArray == null) {
            _emptyArray = new Payload[0];
          }
        }
      }
      return _emptyArray;
    }

    // optional .grpc.testing.PayloadType type = 1;
    public int type;

    // optional bytes body = 2;
    public byte[] body;

    public Payload() {
      clear();
    }

    public Payload clear() {
      type = io.grpc.android.integrationtest.Messages.COMPRESSABLE;
      body = com.google.protobuf.nano.WireFormatNano.EMPTY_BYTES;
      cachedSize = -1;
      return this;
    }

    @Override
    public void writeTo(com.google.protobuf.nano.CodedOutputByteBufferNano output)
        throws java.io.IOException {
      if (this.type != io.grpc.android.integrationtest.Messages.COMPRESSABLE) {
        output.writeInt32(1, this.type);
      }
      if (!java.util.Arrays.equals(this.body, com.google.protobuf.nano.WireFormatNano.EMPTY_BYTES)) {
        output.writeBytes(2, this.body);
      }
      super.writeTo(output);
    }

    @Override
    protected int computeSerializedSize() {
      int size = super.computeSerializedSize();
      if (this.type != io.grpc.android.integrationtest.Messages.COMPRESSABLE) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeInt32Size(1, this.type);
      }
      if (!java.util.Arrays.equals(this.body, com.google.protobuf.nano.WireFormatNano.EMPTY_BYTES)) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeBytesSize(2, this.body);
      }
      return size;
    }

    @Override
    public Payload mergeFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      while (true) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            return this;
          default: {
            if (!com.google.protobuf.nano.WireFormatNano.parseUnknownField(input, tag)) {
              return this;
            }
            break;
          }
          case 8: {
            int value = input.readInt32();
            switch (value) {
              case io.grpc.android.integrationtest.Messages.COMPRESSABLE:
              case io.grpc.android.integrationtest.Messages.UNCOMPRESSABLE:
              case io.grpc.android.integrationtest.Messages.RANDOM:
                this.type = value;
                break;
            }
            break;
          }
          case 18: {
            this.body = input.readBytes();
            break;
          }
        }
      }
    }

    public static Payload parseFrom(byte[] data)
        throws com.google.protobuf.nano.InvalidProtocolBufferNanoException {
      return com.google.protobuf.nano.MessageNano.mergeFrom(new Payload(), data);
    }

    public static Payload parseFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      return new Payload().mergeFrom(input);
    }
  }

  public static final class SimpleRequest extends
      com.google.protobuf.nano.MessageNano {

    private static volatile SimpleRequest[] _emptyArray;
    public static SimpleRequest[] emptyArray() {
      // Lazily initializes the empty array
      if (_emptyArray == null) {
        synchronized (
            com.google.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
          if (_emptyArray == null) {
            _emptyArray = new SimpleRequest[0];
          }
        }
      }
      return _emptyArray;
    }

    // optional .grpc.testing.PayloadType response_type = 1;
    public int responseType;

    // optional int32 response_size = 2;
    public int responseSize;

    // optional .grpc.testing.Payload payload = 3;
    public io.grpc.android.integrationtest.Messages.Payload payload;

    // optional bool fill_username = 4;
    public boolean fillUsername;

    // optional bool fill_oauth_scope = 5;
    public boolean fillOauthScope;

    public SimpleRequest() {
      clear();
    }

    public SimpleRequest clear() {
      responseType = io.grpc.android.integrationtest.Messages.COMPRESSABLE;
      responseSize = 0;
      payload = null;
      fillUsername = false;
      fillOauthScope = false;
      cachedSize = -1;
      return this;
    }

    @Override
    public void writeTo(com.google.protobuf.nano.CodedOutputByteBufferNano output)
        throws java.io.IOException {
      if (this.responseType != io.grpc.android.integrationtest.Messages.COMPRESSABLE) {
        output.writeInt32(1, this.responseType);
      }
      if (this.responseSize != 0) {
        output.writeInt32(2, this.responseSize);
      }
      if (this.payload != null) {
        output.writeMessage(3, this.payload);
      }
      if (this.fillUsername != false) {
        output.writeBool(4, this.fillUsername);
      }
      if (this.fillOauthScope != false) {
        output.writeBool(5, this.fillOauthScope);
      }
      super.writeTo(output);
    }

    @Override
    protected int computeSerializedSize() {
      int size = super.computeSerializedSize();
      if (this.responseType != io.grpc.android.integrationtest.Messages.COMPRESSABLE) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeInt32Size(1, this.responseType);
      }
      if (this.responseSize != 0) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeInt32Size(2, this.responseSize);
      }
      if (this.payload != null) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeMessageSize(3, this.payload);
      }
      if (this.fillUsername != false) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeBoolSize(4, this.fillUsername);
      }
      if (this.fillOauthScope != false) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeBoolSize(5, this.fillOauthScope);
      }
      return size;
    }

    @Override
    public SimpleRequest mergeFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      while (true) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            return this;
          default: {
            if (!com.google.protobuf.nano.WireFormatNano.parseUnknownField(input, tag)) {
              return this;
            }
            break;
          }
          case 8: {
            int value = input.readInt32();
            switch (value) {
              case io.grpc.android.integrationtest.Messages.COMPRESSABLE:
              case io.grpc.android.integrationtest.Messages.UNCOMPRESSABLE:
              case io.grpc.android.integrationtest.Messages.RANDOM:
                this.responseType = value;
                break;
            }
            break;
          }
          case 16: {
            this.responseSize = input.readInt32();
            break;
          }
          case 26: {
            if (this.payload == null) {
              this.payload = new io.grpc.android.integrationtest.Messages.Payload();
            }
            input.readMessage(this.payload);
            break;
          }
          case 32: {
            this.fillUsername = input.readBool();
            break;
          }
          case 40: {
            this.fillOauthScope = input.readBool();
            break;
          }
        }
      }
    }

    public static SimpleRequest parseFrom(byte[] data)
        throws com.google.protobuf.nano.InvalidProtocolBufferNanoException {
      return com.google.protobuf.nano.MessageNano.mergeFrom(new SimpleRequest(), data);
    }

    public static SimpleRequest parseFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      return new SimpleRequest().mergeFrom(input);
    }
  }

  public static final class SimpleResponse extends
      com.google.protobuf.nano.MessageNano {

    private static volatile SimpleResponse[] _emptyArray;
    public static SimpleResponse[] emptyArray() {
      // Lazily initializes the empty array
      if (_emptyArray == null) {
        synchronized (
            com.google.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
          if (_emptyArray == null) {
            _emptyArray = new SimpleResponse[0];
          }
        }
      }
      return _emptyArray;
    }

    // optional .grpc.testing.Payload payload = 1;
    public io.grpc.android.integrationtest.Messages.Payload payload;

    // optional string username = 2;
    public java.lang.String username;

    // optional string oauth_scope = 3;
    public java.lang.String oauthScope;

    public SimpleResponse() {
      clear();
    }

    public SimpleResponse clear() {
      payload = null;
      username = "";
      oauthScope = "";
      cachedSize = -1;
      return this;
    }

    @Override
    public void writeTo(com.google.protobuf.nano.CodedOutputByteBufferNano output)
        throws java.io.IOException {
      if (this.payload != null) {
        output.writeMessage(1, this.payload);
      }
      if (!this.username.equals("")) {
        output.writeString(2, this.username);
      }
      if (!this.oauthScope.equals("")) {
        output.writeString(3, this.oauthScope);
      }
      super.writeTo(output);
    }

    @Override
    protected int computeSerializedSize() {
      int size = super.computeSerializedSize();
      if (this.payload != null) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeMessageSize(1, this.payload);
      }
      if (!this.username.equals("")) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeStringSize(2, this.username);
      }
      if (!this.oauthScope.equals("")) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeStringSize(3, this.oauthScope);
      }
      return size;
    }

    @Override
    public SimpleResponse mergeFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      while (true) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            return this;
          default: {
            if (!com.google.protobuf.nano.WireFormatNano.parseUnknownField(input, tag)) {
              return this;
            }
            break;
          }
          case 10: {
            if (this.payload == null) {
              this.payload = new io.grpc.android.integrationtest.Messages.Payload();
            }
            input.readMessage(this.payload);
            break;
          }
          case 18: {
            this.username = input.readString();
            break;
          }
          case 26: {
            this.oauthScope = input.readString();
            break;
          }
        }
      }
    }

    public static SimpleResponse parseFrom(byte[] data)
        throws com.google.protobuf.nano.InvalidProtocolBufferNanoException {
      return com.google.protobuf.nano.MessageNano.mergeFrom(new SimpleResponse(), data);
    }

    public static SimpleResponse parseFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      return new SimpleResponse().mergeFrom(input);
    }
  }

  public static final class SimpleContext extends
      com.google.protobuf.nano.MessageNano {

    private static volatile SimpleContext[] _emptyArray;
    public static SimpleContext[] emptyArray() {
      // Lazily initializes the empty array
      if (_emptyArray == null) {
        synchronized (
            com.google.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
          if (_emptyArray == null) {
            _emptyArray = new SimpleContext[0];
          }
        }
      }
      return _emptyArray;
    }

    // optional string value = 1;
    public java.lang.String value;

    public SimpleContext() {
      clear();
    }

    public SimpleContext clear() {
      value = "";
      cachedSize = -1;
      return this;
    }

    @Override
    public void writeTo(com.google.protobuf.nano.CodedOutputByteBufferNano output)
        throws java.io.IOException {
      if (!this.value.equals("")) {
        output.writeString(1, this.value);
      }
      super.writeTo(output);
    }

    @Override
    protected int computeSerializedSize() {
      int size = super.computeSerializedSize();
      if (!this.value.equals("")) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeStringSize(1, this.value);
      }
      return size;
    }

    @Override
    public SimpleContext mergeFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      while (true) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            return this;
          default: {
            if (!com.google.protobuf.nano.WireFormatNano.parseUnknownField(input, tag)) {
              return this;
            }
            break;
          }
          case 10: {
            this.value = input.readString();
            break;
          }
        }
      }
    }

    public static SimpleContext parseFrom(byte[] data)
        throws com.google.protobuf.nano.InvalidProtocolBufferNanoException {
      return com.google.protobuf.nano.MessageNano.mergeFrom(new SimpleContext(), data);
    }

    public static SimpleContext parseFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      return new SimpleContext().mergeFrom(input);
    }
  }

  public static final class StreamingInputCallRequest extends
      com.google.protobuf.nano.MessageNano {

    private static volatile StreamingInputCallRequest[] _emptyArray;
    public static StreamingInputCallRequest[] emptyArray() {
      // Lazily initializes the empty array
      if (_emptyArray == null) {
        synchronized (
            com.google.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
          if (_emptyArray == null) {
            _emptyArray = new StreamingInputCallRequest[0];
          }
        }
      }
      return _emptyArray;
    }

    // optional .grpc.testing.Payload payload = 1;
    public io.grpc.android.integrationtest.Messages.Payload payload;

    public StreamingInputCallRequest() {
      clear();
    }

    public StreamingInputCallRequest clear() {
      payload = null;
      cachedSize = -1;
      return this;
    }

    @Override
    public void writeTo(com.google.protobuf.nano.CodedOutputByteBufferNano output)
        throws java.io.IOException {
      if (this.payload != null) {
        output.writeMessage(1, this.payload);
      }
      super.writeTo(output);
    }

    @Override
    protected int computeSerializedSize() {
      int size = super.computeSerializedSize();
      if (this.payload != null) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeMessageSize(1, this.payload);
      }
      return size;
    }

    @Override
    public StreamingInputCallRequest mergeFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      while (true) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            return this;
          default: {
            if (!com.google.protobuf.nano.WireFormatNano.parseUnknownField(input, tag)) {
              return this;
            }
            break;
          }
          case 10: {
            if (this.payload == null) {
              this.payload = new io.grpc.android.integrationtest.Messages.Payload();
            }
            input.readMessage(this.payload);
            break;
          }
        }
      }
    }

    public static StreamingInputCallRequest parseFrom(byte[] data)
        throws com.google.protobuf.nano.InvalidProtocolBufferNanoException {
      return com.google.protobuf.nano.MessageNano.mergeFrom(new StreamingInputCallRequest(), data);
    }

    public static StreamingInputCallRequest parseFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      return new StreamingInputCallRequest().mergeFrom(input);
    }
  }

  public static final class StreamingInputCallResponse extends
      com.google.protobuf.nano.MessageNano {

    private static volatile StreamingInputCallResponse[] _emptyArray;
    public static StreamingInputCallResponse[] emptyArray() {
      // Lazily initializes the empty array
      if (_emptyArray == null) {
        synchronized (
            com.google.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
          if (_emptyArray == null) {
            _emptyArray = new StreamingInputCallResponse[0];
          }
        }
      }
      return _emptyArray;
    }

    // optional int32 aggregated_payload_size = 1;
    public int aggregatedPayloadSize;

    public StreamingInputCallResponse() {
      clear();
    }

    public StreamingInputCallResponse clear() {
      aggregatedPayloadSize = 0;
      cachedSize = -1;
      return this;
    }

    @Override
    public void writeTo(com.google.protobuf.nano.CodedOutputByteBufferNano output)
        throws java.io.IOException {
      if (this.aggregatedPayloadSize != 0) {
        output.writeInt32(1, this.aggregatedPayloadSize);
      }
      super.writeTo(output);
    }

    @Override
    protected int computeSerializedSize() {
      int size = super.computeSerializedSize();
      if (this.aggregatedPayloadSize != 0) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeInt32Size(1, this.aggregatedPayloadSize);
      }
      return size;
    }

    @Override
    public StreamingInputCallResponse mergeFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      while (true) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            return this;
          default: {
            if (!com.google.protobuf.nano.WireFormatNano.parseUnknownField(input, tag)) {
              return this;
            }
            break;
          }
          case 8: {
            this.aggregatedPayloadSize = input.readInt32();
            break;
          }
        }
      }
    }

    public static StreamingInputCallResponse parseFrom(byte[] data)
        throws com.google.protobuf.nano.InvalidProtocolBufferNanoException {
      return com.google.protobuf.nano.MessageNano.mergeFrom(new StreamingInputCallResponse(), data);
    }

    public static StreamingInputCallResponse parseFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      return new StreamingInputCallResponse().mergeFrom(input);
    }
  }

  public static final class ResponseParameters extends
      com.google.protobuf.nano.MessageNano {

    private static volatile ResponseParameters[] _emptyArray;
    public static ResponseParameters[] emptyArray() {
      // Lazily initializes the empty array
      if (_emptyArray == null) {
        synchronized (
            com.google.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
          if (_emptyArray == null) {
            _emptyArray = new ResponseParameters[0];
          }
        }
      }
      return _emptyArray;
    }

    // optional int32 size = 1;
    public int size;

    // optional int32 interval_us = 2;
    public int intervalUs;

    public ResponseParameters() {
      clear();
    }

    public ResponseParameters clear() {
      size = 0;
      intervalUs = 0;
      cachedSize = -1;
      return this;
    }

    @Override
    public void writeTo(com.google.protobuf.nano.CodedOutputByteBufferNano output)
        throws java.io.IOException {
      if (this.size != 0) {
        output.writeInt32(1, this.size);
      }
      if (this.intervalUs != 0) {
        output.writeInt32(2, this.intervalUs);
      }
      super.writeTo(output);
    }

    @Override
    protected int computeSerializedSize() {
      int size = super.computeSerializedSize();
      if (this.size != 0) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeInt32Size(1, this.size);
      }
      if (this.intervalUs != 0) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeInt32Size(2, this.intervalUs);
      }
      return size;
    }

    @Override
    public ResponseParameters mergeFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      while (true) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            return this;
          default: {
            if (!com.google.protobuf.nano.WireFormatNano.parseUnknownField(input, tag)) {
              return this;
            }
            break;
          }
          case 8: {
            this.size = input.readInt32();
            break;
          }
          case 16: {
            this.intervalUs = input.readInt32();
            break;
          }
        }
      }
    }

    public static ResponseParameters parseFrom(byte[] data)
        throws com.google.protobuf.nano.InvalidProtocolBufferNanoException {
      return com.google.protobuf.nano.MessageNano.mergeFrom(new ResponseParameters(), data);
    }

    public static ResponseParameters parseFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      return new ResponseParameters().mergeFrom(input);
    }
  }

  public static final class StreamingOutputCallRequest extends
      com.google.protobuf.nano.MessageNano {

    private static volatile StreamingOutputCallRequest[] _emptyArray;
    public static StreamingOutputCallRequest[] emptyArray() {
      // Lazily initializes the empty array
      if (_emptyArray == null) {
        synchronized (
            com.google.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
          if (_emptyArray == null) {
            _emptyArray = new StreamingOutputCallRequest[0];
          }
        }
      }
      return _emptyArray;
    }

    // optional .grpc.testing.PayloadType response_type = 1;
    public int responseType;

    // repeated .grpc.testing.ResponseParameters response_parameters = 2;
    public io.grpc.android.integrationtest.Messages.ResponseParameters[] responseParameters;

    // optional .grpc.testing.Payload payload = 3;
    public io.grpc.android.integrationtest.Messages.Payload payload;

    public StreamingOutputCallRequest() {
      clear();
    }

    public StreamingOutputCallRequest clear() {
      responseType = io.grpc.android.integrationtest.Messages.COMPRESSABLE;
      responseParameters = io.grpc.android.integrationtest.Messages.ResponseParameters.emptyArray();
      payload = null;
      cachedSize = -1;
      return this;
    }

    @Override
    public void writeTo(com.google.protobuf.nano.CodedOutputByteBufferNano output)
        throws java.io.IOException {
      if (this.responseType != io.grpc.android.integrationtest.Messages.COMPRESSABLE) {
        output.writeInt32(1, this.responseType);
      }
      if (this.responseParameters != null && this.responseParameters.length > 0) {
        for (int i = 0; i < this.responseParameters.length; i++) {
          io.grpc.android.integrationtest.Messages.ResponseParameters element = this.responseParameters[i];
          if (element != null) {
            output.writeMessage(2, element);
          }
        }
      }
      if (this.payload != null) {
        output.writeMessage(3, this.payload);
      }
      super.writeTo(output);
    }

    @Override
    protected int computeSerializedSize() {
      int size = super.computeSerializedSize();
      if (this.responseType != io.grpc.android.integrationtest.Messages.COMPRESSABLE) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeInt32Size(1, this.responseType);
      }
      if (this.responseParameters != null && this.responseParameters.length > 0) {
        for (int i = 0; i < this.responseParameters.length; i++) {
          io.grpc.android.integrationtest.Messages.ResponseParameters element = this.responseParameters[i];
          if (element != null) {
            size += com.google.protobuf.nano.CodedOutputByteBufferNano
              .computeMessageSize(2, element);
          }
        }
      }
      if (this.payload != null) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeMessageSize(3, this.payload);
      }
      return size;
    }

    @Override
    public StreamingOutputCallRequest mergeFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      while (true) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            return this;
          default: {
            if (!com.google.protobuf.nano.WireFormatNano.parseUnknownField(input, tag)) {
              return this;
            }
            break;
          }
          case 8: {
            int value = input.readInt32();
            switch (value) {
              case io.grpc.android.integrationtest.Messages.COMPRESSABLE:
              case io.grpc.android.integrationtest.Messages.UNCOMPRESSABLE:
              case io.grpc.android.integrationtest.Messages.RANDOM:
                this.responseType = value;
                break;
            }
            break;
          }
          case 18: {
            int arrayLength = com.google.protobuf.nano.WireFormatNano
                .getRepeatedFieldArrayLength(input, 18);
            int i = this.responseParameters == null ? 0 : this.responseParameters.length;
            io.grpc.android.integrationtest.Messages.ResponseParameters[] newArray =
                new io.grpc.android.integrationtest.Messages.ResponseParameters[i + arrayLength];
            if (i != 0) {
              java.lang.System.arraycopy(this.responseParameters, 0, newArray, 0, i);
            }
            for (; i < newArray.length - 1; i++) {
              newArray[i] = new io.grpc.android.integrationtest.Messages.ResponseParameters();
              input.readMessage(newArray[i]);
              input.readTag();
            }
            // Last one without readTag.
            newArray[i] = new io.grpc.android.integrationtest.Messages.ResponseParameters();
            input.readMessage(newArray[i]);
            this.responseParameters = newArray;
            break;
          }
          case 26: {
            if (this.payload == null) {
              this.payload = new io.grpc.android.integrationtest.Messages.Payload();
            }
            input.readMessage(this.payload);
            break;
          }
        }
      }
    }

    public static StreamingOutputCallRequest parseFrom(byte[] data)
        throws com.google.protobuf.nano.InvalidProtocolBufferNanoException {
      return com.google.protobuf.nano.MessageNano.mergeFrom(new StreamingOutputCallRequest(), data);
    }

    public static StreamingOutputCallRequest parseFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      return new StreamingOutputCallRequest().mergeFrom(input);
    }
  }

  public static final class StreamingOutputCallResponse extends
      com.google.protobuf.nano.MessageNano {

    private static volatile StreamingOutputCallResponse[] _emptyArray;
    public static StreamingOutputCallResponse[] emptyArray() {
      // Lazily initializes the empty array
      if (_emptyArray == null) {
        synchronized (
            com.google.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
          if (_emptyArray == null) {
            _emptyArray = new StreamingOutputCallResponse[0];
          }
        }
      }
      return _emptyArray;
    }

    // optional .grpc.testing.Payload payload = 1;
    public io.grpc.android.integrationtest.Messages.Payload payload;

    public StreamingOutputCallResponse() {
      clear();
    }

    public StreamingOutputCallResponse clear() {
      payload = null;
      cachedSize = -1;
      return this;
    }

    @Override
    public void writeTo(com.google.protobuf.nano.CodedOutputByteBufferNano output)
        throws java.io.IOException {
      if (this.payload != null) {
        output.writeMessage(1, this.payload);
      }
      super.writeTo(output);
    }

    @Override
    protected int computeSerializedSize() {
      int size = super.computeSerializedSize();
      if (this.payload != null) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeMessageSize(1, this.payload);
      }
      return size;
    }

    @Override
    public StreamingOutputCallResponse mergeFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      while (true) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            return this;
          default: {
            if (!com.google.protobuf.nano.WireFormatNano.parseUnknownField(input, tag)) {
              return this;
            }
            break;
          }
          case 10: {
            if (this.payload == null) {
              this.payload = new io.grpc.android.integrationtest.Messages.Payload();
            }
            input.readMessage(this.payload);
            break;
          }
        }
      }
    }

    public static StreamingOutputCallResponse parseFrom(byte[] data)
        throws com.google.protobuf.nano.InvalidProtocolBufferNanoException {
      return com.google.protobuf.nano.MessageNano.mergeFrom(new StreamingOutputCallResponse(), data);
    }

    public static StreamingOutputCallResponse parseFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      return new StreamingOutputCallResponse().mergeFrom(input);
    }
  }
}